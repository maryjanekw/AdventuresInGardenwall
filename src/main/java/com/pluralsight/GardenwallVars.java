package com.pluralsight;

public class GardenwallVars {
    public static void main(String[] args) {
        String playerName = "Oberon";
        int health = 84;
        int maxHealth = 100;
        int gold = 6;
        boolean hasMap = true;
        double luck = 0.12;
        String[] inventory = {"Torch", "Loaf of bread"};
        boolean hasKey = false;
        int potions = 2;


        System.out.println("Hello I'm " + playerName + ". I can take many hit with my " + maxHealth + " health.");
        System.out.println("I have " + gold + " gold and " + potions + " potions.");
        System.out.println("I am ready for an Adventure! Lets go!!!");
        //System.out.println(playerName + " - health: " + health + "/" + maxHealth + ", gold: " + gold);
    }
}
