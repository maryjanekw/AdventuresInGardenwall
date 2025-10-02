package com.pluralsight;

public class GardenwallMethods {
    public static int heal(int health, int amount, int maxHealth) {
        health += amount;
        if (health > maxHealth) {
            health = maxHealth;
        }
        return health;
    }

    public static void attack(String attacker, String target, int damage) {
        System.out.println(attacker + " hits " + target + " for " + damage + " damage!");
    }

    public static void main(String[] args) {
        int health = 60;
        int maxHealth = 100;
        System.out.println("Before heal: " + health);
        health = heal(health, 50, maxHealth);
        System.out.println("After heal: " + health);

        attack("Oberon", "Forest Goblin", 12);
    }
    public static int usePotion(int health, int potions, int healAmount, int maxHealth) {
        if (potions <= 0) {
            System.out.println("No potions left!");
            return health;
        }
        potions--; // NOTE: if you want to preserve potions outside, return new potion count or use an object
        health += healAmount;
        if (health > maxHealth) {
            health = maxHealth;
        }
        System.out.println("Used a potion. Potions left (local): " + potions);
        return health;
    }

}
