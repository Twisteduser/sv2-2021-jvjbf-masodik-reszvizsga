package city;

public class Office extends Building{
    private String company;
    private int numberOfTablesPerLevel;

    public Office(int area, int levels, Address address, String company, int numberOfTablesPerFloor) {
        super(area, levels, address);
        if (numberOfTablesPerFloor*2>=area || numberOfTablesPerFloor*5<=area){
            throw new IllegalArgumentException("Invalid table number!");
        }
        this.company = company;
        this.numberOfTablesPerLevel = numberOfTablesPerFloor;
    }

    public String getCompany() {
        return company;
    }

    public int getNumberOfTablesPerLevel() {
        return numberOfTablesPerLevel;
    }

    @Override
    public int calculateNumberOfPeopleCanFit() {
        return (getLevels()-1)*getNumberOfTablesPerLevel();
    }
}
