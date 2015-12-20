package koc;


public class Fight {
    public Fight(Character player, Character enemy) {
        System.out.println("A fight between "+player.name+" and "+enemy.name+" has started");
        main(player, enemy);
    }

    public Boolean main(Character player, Character enemy){
        while (player.health>0 || enemy.health>0){
            System.out.println("It is your turn to attack!");
            player.attack_to(enemy);
            System.out.println("It is your enemy's turn to attack!");
            enemy.attack_to(player);
        }
        if (player.health>0){
            return Boolean.TRUE;
        }

        else {
            return Boolean.FALSE;
        }
    }

}
