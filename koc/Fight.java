package koc;

import java.util.Scanner;

public class Fight {
    private static Scanner reader;

    public Fight(Character player, Character enemy) {
        System.out.println("A fight between "+player.name+" and "+enemy.name+" has started");
        main(player, enemy);
    }

    public Boolean main(Character player, Character enemy){
        while (player.health>0 && enemy.health>0){
            System.out.println("It is your turn to attack!");
            System.out.println("Do you want to hit or run?");
            System.out.println("Press h to hit or r to run.");
            String choice = reader.next();
            if (choice.equals("r")){
                System.out.println("You choose the coward way and you fleed.");
                enemy.health=0;
            }

            if (choice.equals("h")){
                player.attack_to(enemy);
            }
            if (enemy.health>0) {
                System.out.println("It is your enemy's turn to attack!");
                enemy.attack_to(player);
            }
        }
        if (player.health>0){
            return Boolean.TRUE;
        }

        else {
            return Boolean.FALSE;
        }
    }

}
