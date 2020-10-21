package practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class BuildBatches {
  public static void main(String[] args) {
    int batchSize = 5;
    int number = 4;
    List<Set<String>> batches = new ArrayList<>();
    Set<String> gtins = new LinkedHashSet<>();
    for (int i = 1; i <= number; i++) {
      gtins.add(i + "");
    }

    Set<String> objects = new LinkedHashSet<>();

    int count = 1;
    for (String gtin : gtins) {
      objects.add(gtin);
      if (count % batchSize == 0) {
        batches.add(objects);
        objects = new LinkedHashSet<>();
        count = 1;

      } else {
        count++;
      }
    }

    if (!objects.isEmpty()) {
      batches.add(objects);
    }

    System.out.println(batches);
  }
}
