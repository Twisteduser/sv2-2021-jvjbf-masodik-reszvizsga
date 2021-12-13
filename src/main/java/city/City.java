package city;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private long fullArea;
    private List<Building> buildings = new ArrayList<>();

    public City(String name, long fullArea) {
        this.name = name;
        this.fullArea = fullArea;
    }

    public String getName() {
        return name;
    }

    public long getFullArea() {
        return fullArea;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void addBuilding(Building building){
        long count =0;
        for (Building b: buildings){
            count= count+b.getArea();
        }if (count + building.getArea()<=fullArea){
            buildings.add(building);
        }else {
            throw new IllegalArgumentException("City can't be larger than "+getFullArea());}
    }

    public Building findHighestBuildingInCity(){
        int max=0;
        Building building = buildings.get(0);
        for (int i =0; i<buildings.size();i++){
            if ()
        }
    }
}