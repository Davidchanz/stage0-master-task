package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        if(monthNumber < 1 || monthNumber > 12) {
            System.out.println("Wrong month number");
        } else{
            switch (monthNumber){
                case 12,1,2 -> {
                    System.out.println("Winter");
                }
                case 3,4,5 -> {
                    System.out.println("Autumn");
                }
                case 6,7,8 -> {
                    System.out.println("Summer");
                }
                case 9,10,11 -> {
                    System.out.println("Fall");
                }
            }
        }

    }

}
