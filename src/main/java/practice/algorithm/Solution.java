package practice.algorithm;


import java.util.*;

public class Solution {
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<List<Integer>> ClosestXdestinations(int numDestinations,
                                             List<List<Integer>> allLocations,
                                             int numDeliveries) {
        List<Coordinate> coordinates = new ArrayList<>();

        for (int i = 0; i < numDestinations; i++) {
            List<Integer> coordiante = allLocations.get(i);
            int x = coordiante.get(0);
            int xSqr = x * x;
            int y = coordiante.get(1);
            int ySqr = y * y;
            Double distance = Math.sqrt(xSqr + ySqr);
            Coordinate coordinate = new Coordinate(coordiante, distance);
            coordinates.add(coordinate);
        }


        Collections.sort(coordinates, new CoordinateComparator());
        List<List<Integer>> coveredCoordiantes = new ArrayList<>();
        for (int i = 0; i < numDeliveries; i++) {
            coveredCoordiantes.add(coordinates.get(i).allocation);
        }
        return coveredCoordiantes;

    }

    // METHOD SIGNATURE ENDS
    private class Coordinate {
        List<Integer> allocation;
        Double distnace;

        Coordinate(List<Integer> allocation, double distnace) {
            this.allocation = allocation;
            this.distnace = distnace;
        }
    }

    private class CoordinateComparator implements Comparator<Coordinate> {
        @Override
        public int compare(Coordinate o1, Coordinate o2) {
            return o1.distnace.compareTo(o2.distnace);
        }
    }


    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<List<Integer>> optimalUtilization(
            int deviceCapacity,
            List<List<Integer>> foregroundAppList,
            List<List<Integer>> backgroundAppList) {

        Map<Integer,Integer> mapBackGround= new HashMap<>();
        for(List<Integer> apps:backgroundAppList){
            mapBackGround.put(apps.get(0),apps.get(1));
        }

        Map<Integer,Integer> mapForeGround= new HashMap<>();

        for(List<Integer> apps:foregroundAppList){
            mapForeGround.put(apps.get(0),apps.get(1));
        }

        List<Pair> combination=new ArrayList<>();
        for(Integer foreGroudId:mapForeGround.keySet()){
            for(Integer backGroundId:mapBackGround.keySet()){
                List<Integer> ids = new ArrayList<>();
                ids.add(foreGroudId);
                ids.add(backGroundId);

                Integer capcity = mapBackGround.get(backGroundId)+mapForeGround.get(foreGroudId);
                if(capcity<=deviceCapacity){
                    combination.add(new Pair(ids,capcity));
                }

            }
        }

        Collections.sort(combination,new DeviceCapacityComparator());
        List<List<Integer>> pairOfDevice= new ArrayList<>();

        Integer capacity = combination.get(0).capacity;
        for(Pair pair:combination){
            if(capacity==pair.capacity){
                pairOfDevice.add(pair.devicePair);
            }
        }

        return pairOfDevice;
    }

    private class Pair{
        List<Integer> devicePair;
        Integer capacity;

        public Pair(List<Integer> devicePair, int capacity) {
            this.devicePair = devicePair;
            this.capacity = capacity;
        }
    }


    private class DeviceCapacityComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            return o2.capacity.compareTo(o1.capacity);
        }
    }

}