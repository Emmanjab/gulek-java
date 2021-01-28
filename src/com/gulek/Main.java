package com.gulek;

public class Main {



    public static void main(String[] args) {

        Animal cow = new Animal(4, "moo", "calf");
        Animal fawo = new Animal(2, "clurk", "chic");
        Animal elephant = new Animal(6, "sound", "baby");

	// write your code here
        System.out.println(fawo.getSound());
        System.out.println(cow.getPikin());
        System.out.println(cow.getLegs());
        cow.setLegs(10);
        System.out.println(cow.getLegs());
        System.out.println(fawo.getLegs());
        System.out.println(elephant.getLegs());
        System.out.println("Cloning");
    }
}
