package org.example;

public final class Tiger extends Animal {
    private boolean vegan;

    boolean getVegan() {
        return vegan;
    }

    void setVegan(boolean veg) {
        vegan = veg;
    }

    Tiger() {
    }

    Tiger(String n, int a, boolean veg) {
        super(n, a);
        vegan = veg;
    }

    void showAnimal() {
        System.out.println("Animal: " + getName() + " and he is " + getAge() + ", vegan - " + getVegan());
    }

    @Override
    void roar() {
        System.out.println("tiger get roar");
    }

    final void tigerTold() {
        System.out.println("Im a tiger");
    }
}
