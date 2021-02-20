package homework2;

import java.util.Scanner;

public class homework2_2 {
    public static void main(String[] args) {
        System.out.println("Day of the week: ");
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();

        switch (day){
            case "monday":
                System.out.println("Your schedule for monday is dance class at 8 pm.");
                break;
            case "tuesday":
                System.out.println("Your schedule for tuesday is swimming in the evening.");
                break;
            case "wednesday":
                System.out.println("Your schedule for wednesday is to go skiing.");
                break;
            case "thursday":
                System.out.println("Your schedule for thursday is jogging in the morning and dance class at 9 pm.");
                break;
            case "friday":
                System.out.println("Your schedule for friday is Netflix and chill.");
                break;
            case "saturday":
                System.out.println("Your schedule for saturday is to go shopping.");
                break;
            case "sunday":
                System.out.println("Your schedule for sunday is to hang out with your friends.");
                break;
            default:
                System.out.println("You didn't write the day of the week.");
        }
    }
}
