package org.example;

import org.interfaces.IVehicle;

public class Vehicle implements IVehicle {
    private int passangers;
    private int fuelcap;
    private int mpg;

    int i;
    int x;
    int y;

    int getPassangers() { return passangers; }
    int getfuelcap() { return passangers; }
    int getMpg() { return passangers; }

    void setPassangers(int sp) { passangers = sp; }
    void setfuelcap(int sf) { fuelcap = sf; }
    void setMpg(int sm) { mpg = sm; }

    Vehicle() { }

    Vehicle(Vehicle vh) {
        x = vh.x;
        y = vh.y;
    }

    Vehicle(int p, int f, int m) {
        mpg = p;
        fuelcap = f;
        passangers = m;
    }

    Vehicle(int p, int f, int m, int decriment) {
        mpg = p - decriment;
        fuelcap = f - decriment;
        passangers = m - decriment;
    }

    public void print(){
        System.out.println("Vehicle:");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (passangers != vehicle.passangers) return false;
        if (fuelcap != vehicle.fuelcap) return false;
        return mpg == vehicle.mpg;
    }

    @Override
    public int hashCode() {
        int result = passangers;
        result = 31 * result + fuelcap;
        result = 31 * result + mpg;
        return result;
    }

    public void getRange() {
        System.out.println(getfuelcap() * getMpg());
    }

    public int getRange(int fc, int m) {
        return fc * m;
    }

    public void trip(Vehicle vh) {
        vh.mpg = vh.mpg - 10;
        vh.fuelcap = vh.fuelcap - 15;
    }

    public void getMiltiplieMpg(int fuelcap) {
        System.out.println(getRange(1,2) + fuelcap);
    }
}
