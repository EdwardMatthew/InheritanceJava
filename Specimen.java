package com.company;

public class Specimen {
    private String name;
    private int cageNumber;
    private Species toa; // type of animal
    public Specimen(String a, int c, Species s) {
        setName(a);
        setCage(c);
        setTOA(s);
    }
    public void setName(String a) {name = a;}
    public void setCage(int c) {cageNumber = c;}
    public void setTOA(Species s) {toa = s;}

    public String getName() {return this.name;}
    public int getCageNumber() {return this.cageNumber;}
    public Species getTOA() {return this.toa;}

    public String toString() {
        return name + " is a" + toa + " in cage " + cageNumber;
    }
}
