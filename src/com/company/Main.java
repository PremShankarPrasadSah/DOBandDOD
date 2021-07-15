package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try{
            System.out.println("Enter your birth date:(formate: dd-mm-yyyy)");
            String birthdate = new Scanner(System.in).next();
            Date birthday = new SimpleDateFormat("dd-mm-yyyy").parse(birthdate);
            System.out.println("Enter your death date:(formate: dd-mm-yyyy)");
            String deathdate = new Scanner(System.in).next();
            Date deathday = new SimpleDateFormat("dd-mm-yyyy").parse(deathdate);
            long time1 = birthday.getTime();
            long time2 = deathday.getTime();
            long day = (time2-time1)/1000 /3600 / 24;
            System.out.println(" Your total days: "+day+" days");
        }catch (Exception e){
            System.out.println("Wrong format");
        }
    }
}
