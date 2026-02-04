package OOPS;

 class Janwar {
    String name;
    String color;
    int legs;
    boolean dangerous;
    float existence;

    public void details(String name) {
        System.out.println(name + " has color " + color + ", " + legs + " legs, is " +
            (dangerous ? "dangerous" : "not dangerous") + ", and has a density of " + existence);
    }
}

public class classes {
    public static void main(String[] args) {
        Janwar A1 = new Janwar();
        A1.color = "Black";
        A1.legs = 4;
        A1.dangerous = true;
        A1.existence = 23.09f;
        A1.details("Bear");
    }
}