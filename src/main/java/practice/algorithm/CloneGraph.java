package practice.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Vector;

public class CloneGraph {

  public static void main(String[] args) {
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    List<Node> v = new ArrayList<>();
    v.add(node2);
    v.add(node4);
    node1.neighbors = v;
    v = new Vector<Node>();
    v.add(node1);
    v.add(node3);
    node2.neighbors = v;
    v = new ArrayList<Node>();
    v.add(node2);
    v.add(node4);
    node3.neighbors = v;
    v = new ArrayList<Node>();
    v.add(node3);
    v.add(node1);
    node4.neighbors = v;

    CloneGraph cloneGraph = new CloneGraph();
    Node node = cloneGraph.cloneGraph(node1);
    System.out.println(node);
  }

  public Node cloneGraph(Node node) {
    if (node == null) {
      return null;
    }

    Queue<Node> queue = new LinkedList();
    Map<Node, Node> hashMap = new HashMap<>();

    queue.add(node);

    Node newNode = new Node(node.val);
    hashMap.put(node, newNode);

    while (!queue.isEmpty()) {
      Node nodeTemp = queue.poll();

      List<Node> neighbors = nodeTemp.neighbors;
      Node nodeToBeBuild = hashMap.get(nodeTemp);
      for (Node n : neighbors) {
        Node node1 = hashMap.get(n);
        if (node1 == null) {
          node1 = new Node(n.val);
          hashMap.put(n, node1);
          queue.add(n);
        }
        nodeToBeBuild.neighbors.add(node1);
      }
    }

    return newNode;
  }

  static class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
      val = 0;
      neighbors = new ArrayList<>();
    }

    public Node(int _val) {
      val = _val;
      neighbors = new ArrayList<>();
    }

    public Node(int _val, List<Node> _neighbors) {
      val = _val;
      neighbors = _neighbors;
    }

  }
}
