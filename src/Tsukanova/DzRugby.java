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
        int age1 = sum/25;
        System.out.println("");
        System.out.println("Середній вік команди 1 = " + age1);

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
        int age2 = sum2/25;
        System.out.println("");
        System.out.println("Середній вік команди 2 = " + age2);
    }
}



