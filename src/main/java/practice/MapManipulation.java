package practice;

import java.util.HashMap;
import java.util.Map;

public class MapManipulation {
  public static void main(String[] args) {
    MapClass mapClass = new MapClass();

    Map<String, Integer> map1 = new HashMap<>();
    map1.put("1", 1);
    map1.put("2", 1);
    mapClass.setMap(map1);

    Map<String, Integer> map2 = new HashMap<>();
    map2.put("3", 3);
    map2.put("4", 4);

    Map<String, Integer> map = mapClass.getMap();
    map.putAll(map2);

    System.out.println(mapClass);

    mapClass.setMap(map);
  }

  public static class MapClass {
    Map<String, Integer> map = new HashMap<>();

    public Map<String, Integer> getMap() {
      return map;
    }

    public void setMap(Map<String, Integer> map) {
      this.map = map;
    }
  }
}
