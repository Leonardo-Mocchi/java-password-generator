package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        System.out.println("Let's create a totally secure password for you, trust me :D");

        Scanner input = new Scanner(System.in);

        System.out.println("Insert your name");
        String name = input.nextLine();
        String formattedName = name.substring(0, 1).toUpperCase() + name.substring(1);

        System.out.println("Insert your last name");
        String lastName = input.nextLine();
        String formattedLastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

        System.out.println("Insert your favorite color :3");
        String favoriteColor = input.nextLine();
        String formattedFavoriteColor = favoriteColor.toLowerCase();

        System.out.println("Insert the year you were born in (4 numbers)");
        int year = input.nextInt();

        System.out.println("Insert the month you were born in (in number(s))");
        int month = input.nextInt();

        System.out.println("Insert the day of the month you were born in");
        int day = input.nextInt();

        int secretNumber = day + month + year;

        System.out.println("Your totally secure password is: " +
                formattedName + "-" + formattedLastName + "-" +
                formattedFavoriteColor + "-" + secretNumber);

        input.close();
    }
}
