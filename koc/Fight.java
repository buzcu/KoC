package koc;

import java.util.Scanner;

public class Fight {
    private static Scanner reader;
    public Boolean Result;
    public Fight(Character player, Character enemy) {
    	reader = new Scanner(System.in);
    	System.out.println("*****************************************************");
        System.out.println("A fight between "+player.name+" and "+enemy.name+" has started!");
        Result=main(player, enemy);

    }

    public Boolean main(Character player, Character enemy){
    	String choice;
        while (player.health>0 && enemy.health>0){
            System.out.println("\nIt is your turn. Do you want to (H)it or (R)un:");
            choice = reader.next();
            if (choice.equals("r")){
                System.out.println("You choose the coward way and you fleed.");
                player.getExperience(1);
                return Boolean.FALSE;
            }

            player.attack_to(enemy);
            if (enemy.health>0) {
                System.out.println("\nIt is your enemy's turn to attack!");
                enemy.attack_to(player);
            }
            else {
                player.collectChest();
                player.getExperience(3);
                System.out.println("Your current health is "+player.health+", Your maximum health is "+player.maxHealth);
            }
        }
        if (player.health>0){
            return Boolean.TRUE;
        }

        else {
            System.out.println("Oh No! You have been slayed by enemy! Your journey is over. Better luck next time. \n(Game Over)");
            return Boolean.FALSE;
        }
    }

}
