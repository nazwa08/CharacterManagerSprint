package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {
    public static void main(String[] args) {

        // Membuat tiga karakter menggunakan constructor berbeda
        Character hero1 = new Character(
            "Arthas", CharacterType.WARRIOR
        );

        Character hero2 = new Character(
            "Merlin", CharacterType.MAGE, 5
        );

        Character hero3 = new Character(
            "Robin", CharacterType.ARCHER, 3
        );

        System.out.println("=== CHARACTER MANAGER ===");
        System.out.println(hero1);
        System.out.println(hero2);
        System.out.println(hero3);

        // Demo level up
        System.out.println("\n=== LEVEL UP ===");
        hero1.setLevel(hero1.getLevel() + 1);
        System.out.println(hero1);

        // Mini-Challenge: mana dan isAlive()
        Character hero4 = new Character(
            "Luna", CharacterType.HEALER
        );

        hero4.setMana(150);

        System.out.println("\n=== MINI CHALLENGE ===");
        System.out.println(hero4);
        System.out.println("Mana Luna: " + hero4.getMana());
        System.out.println("Apakah Luna hidup? " + hero4.isAlive());

        // Demo validasi mana
        try {
            hero4.setMana(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Validasi: " + e.getMessage());
        }
    }
}