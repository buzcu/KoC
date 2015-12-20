package koc;


import java.util.Random;

public abstract class Character {
    private String name;
    private int health;
    private int armor;
    private int attackDamage;
    private int attackSpeed;
    private int level;
    private int experience;
    private int goldCoin;
    
    protected Character(){
        name = new String("Unknown");
        health = 1;
        armor = 0;
        attackDamage = 1;
        attackSpeed = 1;
        level = 0;
        experience = 0;
        goldCoin = 0;
    }
    
    protected Character(String name, int health, int armor, int attackDamage,
            int attackSpeed, int level, int experience, int goldCoin)
    {
        this.name = new String(name);
        this.health = health;
        this.armor = armor;
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
        this.level = level;
        this.experience = experience;
        this.goldCoin = goldCoin;
    }
    
    public void attack_to(Character enemy){
        enemy.getDamage(this.attackDamage);
    }
    
    public void getDamage(int damage){
        this.health -= damage;
        if (this.health <= 0)
        {
            this.die();
        }
    }
    
    public void levelUp(){
        this.level += 1;
    }
    
    public abstract void die();
    
    public void collectChest(){
        Random generator = new Random();
        int goldInChest = generator.nextInt(this.goldCoin/10) + 1;
        this.goldCoin += goldInChest;
    }
    
    public void leaveChest()
    {
        System.out.println("Sen devletten zengin misin?");
    }
    
    public void getExperience(int experience){
        this.experience += experience;
        if (Math.sqrt(this.experience) >= this.level)
        {
            this.levelUp();
        }
    }
    
}