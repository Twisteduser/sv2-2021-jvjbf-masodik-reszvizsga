package city;

public abstract class Building {
    private int area;
    private int levels;
    private Address address;

    public Building(int area, int levels, Address address) {
        this.area = area;
        this.levels = levels;
        this.address = address;
    }

    public Building(int area, Address address) {
        this.area = area;
        this.levels=1;
        this.address = address;
    }

    public int getArea() {
        return area;
    }

    public int getLevels() {
        return levels;
    }

    public Address getAddress() {
        return address;
    }

    public int getFullArea(){
        return levels*area;
    }
    public abstract int calculateNumberOfPeopleCanFit();
}
