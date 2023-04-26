package Tsukanova;
import java.util.Arrays;

public class DzRugby {
    public static void main(String[] args) {
        int[] people = new int[25];
        int[] people2 = new int[25];
        for (int i = 0; i < people.length; i++) {
            int min = 18;
            int max = 23;
            people[i] = (int) ((Math.random() * max) + min);
            System.out.print(people[i] + " ");
        }
        int sum = 0;
        for (int i = 0; i < people.length; i++) {
            sum += people[i];
        }
        System.out.println("");
        System.out.println("Загальний вік команди 1 = " + sum);

        for (int j = 0; j < people2.length; j++) {
            int min = 18;
            int max = 23;
            people2[j] = (int) ((Math.random() * max) + min);
            System.out.print(people2[j] + " ");
        }
        int sum2 = 0;
        for (int j = 0; j < people2.length; j++) {
            sum2 += people[j];
        }
        System.out.println("");
        System.out.println("Загальний вік команди 2 = " + sum2);
    }
}



