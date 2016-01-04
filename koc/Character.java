package koc;


import java.util.Random;

public abstract class Character {
    protected String name;
    protected int health;
    protected int armor;
    protected int attackDamage;
    protected int attackSpeed;
    protected double hitpos;
    protected int level;
    protected int experience;
    protected int goldCoin;
    protected int maxHealth;
    
    protected Character(){
        name = new String("Unknown");
        health = 10;
        armor = 0;
        hitpos = 0.6;
        attackDamage = 1;
        attackSpeed = 1;
        level = 0;
        experience = 0;
        goldCoin = 0;
        maxHealth = 15;
    }
    
    protected Character(String name, int health, int armor, int attackDamage,
            int attackSpeed, int level, int experience, int goldCoin)
    {
        this.name = new String(name);
        this.maxHealth = 15;
        this.health = health;
        this.armor = armor;
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
        this.level = level;
        this.experience = experience;
        this.goldCoin = goldCoin;
        this.hitpos=0.6;
    }

    public String getName(){
        return this.name;
    }



    public void attack_to(Character enemy){
        Random r = new Random();
        double randomValue = r.nextDouble();
        if (randomValue>hitpos)
        {
            System.out.println("Attack missed");
        }
        else {
            enemy.getDamage(this.attackDamage);
        }

    }
    
    public void getDamage(int damage){
        this.health -= damage;
        System.out.println(this.name+" got "+damage+" damage.");
        
        if (this.health <= 0)
        {
            this.die();
        }
        System.out.println(this.name+" got "+this.health+" HP left.");
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
        while (Math.sqrt(this.experience) >= this.level)
        {
            this.levelUp();
        }
    }
    
}
