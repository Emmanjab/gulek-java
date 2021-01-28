package com.gulek;

public class Main {



    public static void main(String[] args) {

        Animal cow = new Animal(4, "moo", "calf");
        Animal fawo = new Animal(2, "clurk", "chic");

	// write your code here
        System.out.println(fawo.getSound());
        System.out.println(cow.getPikin());
        System.out.println(cow.getLegs());
        cow.setLegs(10);
        System.out.println(cow.getLegs());
    }
}
