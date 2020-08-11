package practice.arcesium;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public void buildTeam(List<Player> players) {
        PriorityQueue<Player> defenders = new PriorityQueue<>(new Player.DefenderComparator());

        PriorityQueue<Player> strikers = new PriorityQueue<>(new Player.DefenderComparator());

        players.forEach(player -> {
            defenders.add(player);
            strikers.add(player);
        });

        Set<Player> selectedDefenders = new TreeSet<>();
        Set<Player> selectedStrikers = new TreeSet<>();

        for (Player player : players) {

            if (defenders.peek() != null) {

            }
        }


    }
}
