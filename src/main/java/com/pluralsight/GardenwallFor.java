package com.pluralsight;

public class GardenwallFor {
    public static void main(String[] args) {
        int coins = 0;
        for (int room = 1; room <= 8; room++) {
            coins += room * 3; // each room gives 2 * room coins
            if (room % 2 != 0) {
                //coins += room * 6;

            }
            System.out.println("Searched room " + room + ", coins now: " + coins);
        }
        System.out.println("Total coins: " + coins);
    }
}
