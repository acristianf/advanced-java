import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Building building = new Building();
        Office office = new Office();
        build(building);
        build(office);

        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building());
        buildings.add(new Office());
        printBuildingList(buildings);

        List<Office> offices = new ArrayList<>();
        offices.add(new Office());
        printBuildingList(offices);

        addOfficeToList(buildings);
    }

    static void build(Building building) {
        System.out.println("Constructing a new " + building.toString());
    }

    static void printBuildingList(List<? extends Building> buildings) {
        buildings.forEach(building -> System.out.println(building.toString()));
    }

    static void addOfficeToList(List<? super Office> buildings) {
        buildings.add(new Office());
    }
}
