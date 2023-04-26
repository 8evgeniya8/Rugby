package Tsukanova;

import java.util.Arrays;

public class DzRugby {
    public static void main(String[] args) {
        int[] people = new int[25];
        System.out.println("Команда 1: ");
        for (int i = 0; i < people.length; i++) {
            int min = 18;
            int max = 23;
            people[i] = (int) ((Math.random() * max) + min);
            System.out.print(people[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Команда 2: ");
        for (int j = 0; j < people.length; j++) {
            int min = 18;
            int max = 23;
            people[j] = (int) ((Math.random() * max) + min);
            System.out.print(people[j] + " ");
        }
    }

}
