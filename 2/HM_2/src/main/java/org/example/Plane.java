package org.example;

public class Plane extends Vehicle {

    private int pilots;
    int i;
    int z;

    int getPilots() { return pilots; }

    void setPilots(int sps) { pilots = sps; }

    Plane() { super();}
    Plane(Plane pl) {
        super(pl);
        pl.z = z;
    }

    Plane(int p, int f, int m, int pil, int a) {
        super(p, f, m);
        super.i = a;
        i = pil;
        pilots = pil;
    }

    public void getRange() {
        super.getRange();
        System.out.println(getfuelcap() * getMpg() + 10);
    }

    void getAllPeopleFromPlane() {
        System.out.println("all people in plane: " + getPilots() + getPassangers());
    }
}
