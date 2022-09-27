import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Console {
  public static void logError(String message) {
    System.out.println("\n" + message);
    System.exit(0);
  }

  public static void logSuccess(String message) {
    System.out.println("\n" + message);
  }
}

class File {
  static public String read(String path) {
    String content = "";
    int currChar;

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      while ((currChar = br.read()) != -1) {
        content += (char) currChar;
      }
    } catch (Exception e) {
      Console.logError("Error on reading the file:\n" + e.getMessage());
    }

    return content;
  }

  public static void write(String path, String content) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
      bw.write(content);
    } catch (Exception e) {
      Console.logError("Error on writing the file:\n" + e.getMessage());
    }
  }
}

class Regex {
  public static List<String> filterContent(String content, String pattern) {
    Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(content);
    List<String> result = new ArrayList<>();

    while (m.find()) {
      result.add(m.group());
    }

    return result;
  }
}

class FileCount {
  public static String generateReport(List<String> fileNames, Integer itemsQtt) {
    Map<String, Integer> files = FileCount.group(fileNames);
    HashMap<String, Integer> sortedFiles = FileCount.sort(files);

    return FileCount.stringify(sortedFiles, itemsQtt);
  }

  private static Map<String, Integer> group(List<String> fileNames) {
    Map<String, Integer> groupedFiles = new HashMap<>();

    for (String fileName : fileNames) {
      groupedFiles.put(fileName, groupedFiles.containsKey(fileName) ? groupedFiles.get(fileName) + 1 : 1);
    }

    return groupedFiles;
  }

  private static HashMap<String, Integer> sort(Map<String, Integer> files) {
    List<Map.Entry<String, Integer>> filesList = new LinkedList<Map.Entry<String, Integer>>(files.entrySet());

    Collections.sort(filesList, new Comparator<Map.Entry<String, Integer>>() {
      public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return (o2.getValue()).compareTo(o1.getValue());
      }
    });

    HashMap<String, Integer> filesMap = new LinkedHashMap<String, Integer>();
    for (Map.Entry<String, Integer> aa : filesList) {
      filesMap.put(aa.getKey(), aa.getValue());
    }

    return filesMap;
  }

  public static String stringify(Map<String, Integer> files, Integer itemsQtt) {
    String content = "";
    Object[] k = files.keySet().toArray();
    Object[] v = files.values().toArray();

    for (int i = 0; i < itemsQtt; i++) {
      content += k[i] + " - " + v[i] + "\n";
    }

    return content;
  }
}

public class Main {
  public static List<String> getInfoFromUser() {
    List<String> info = new ArrayList<>();

    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("\n1. Insira o caminho do arquivo a ser analisado:");
      info.add(sc.next());

      System.out.println("\n2. Insira o caminho do arquivo a ser gerado:");
      info.add(sc.next());

      do {
        System.out.println("\n3. Insira as quantidades desejadas de itens: (Entre 1 e 3):");
        info.add(2, sc.next());
      } while (Integer.parseInt(info.get(2)) < 1 || Integer.parseInt(info.get(2)) > 3);
    } catch (Exception e) {
      Console.logError("Error on getting info:\n" + e);
    }

    return info;
  }

  public static void main(String[] args) {
    List<String> info = Main.getInfoFromUser();
    String fromPath = info.get(0);
    String toPath = info.get(1);
    Integer itemsQtt = Integer.parseInt(info.get(2));

    String fromContent = File.read(fromPath);
    List<String> fileNames = Regex.filterContent(fromContent, "(?<= /).*(?=.(html|gif))");
    String toContent = FileCount.generateReport(fileNames, itemsQtt);

    File.write(toPath, toContent);
    Console.logSuccess("Report generated, you can access it now.");
  }
}