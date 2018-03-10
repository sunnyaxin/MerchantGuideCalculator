package model;

public class Unit {
    private String name;
    private Roman romanNumber;

    public Unit(String name, Roman romanNumber) {
        this.name = name;
        this.romanNumber = romanNumber;
    }

    public String getName() {
        return name;
    }

    public Roman getRomanNumber() {
        return romanNumber;
    }
}
