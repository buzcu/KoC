package koc;

public class Quest extends GameEnvironment{
    private String questName;

    public Quest() {
        super();
        this.questName="default quest";
    }

    public Quest(Character player){
        this.questName="default quest"
        System.out.println("The quest has been started "+player.getName());
        System.out.println(this.questName);
    }

}
