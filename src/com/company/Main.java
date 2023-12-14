package com.company;
import java.util.ArrayList;
import java.util.Collections;
public class Main {

    public static void main(String[] args) {
	ArrayList<Jacket> jackets= new ArrayList<>();

        jackets.add(new Jacket("Brand1", "Winter", 150.0));
        jackets.add(new Jacket("Brand2", "Spring", 120.0));
        jackets.add(new Jacket("Brand3", "Summer", 100.0));
        jackets.add(new Jacket("Brand4", "Autumn", 130.0));

        Collections.sort(jackets);
        for(Jacket jacket:jackets) {
            System.out.println(jacket);
        }
    }
}
