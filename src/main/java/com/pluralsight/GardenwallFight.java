package com.pluralsight;

public class GardenwallFight {
    public static void main(String[] args) {
        int enemyHealth = 30;
        int damagePerHit = 8;
        int round = 0;
        while (enemyHealth > 0) {
            round++;
            enemyHealth -= damagePerHit;
            System.out.println("Round " + round + " — enemy health: " + Math.max(0, enemyHealth));
        }
        System.out.println("Enemy defeated in " + round + " hits!");
    }
}
