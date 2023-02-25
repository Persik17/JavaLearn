package org.example;

public abstract class Animal extends Object {
    private int age;
    private String name;

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void setName(String n) {
        name = n;
    }

    void setAge(int a) {
        age = a;
    }

    Animal() {
    }

    Animal(String n) {
        name = n;
    }

    Animal(String n, int a) {
        name = n;
        age = a;
    }

    abstract void roar();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        return name != null ? name.equals(animal.name) : animal.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    void showAnimal() {
        System.out.println(String.format("Animal: %s and he is %d", getName(), getAge()));
    }

}
