
package com.unpri.charactermanager.model;

import java.util.ArrayList;
import java.util.List;

public class CharacterManager {

    private final List<Character> characters = new ArrayList<>();

    // Bagian A: Menambahkan karakter, menolak nama duplikat
    public boolean addCharacter(Character character) {
        if (character == null) {
            return false;
        }

        if (findByName(character.getName()) != null) {
            return false;
        }

        characters.add(character);
        return true;
    }

    // Bagian A: Mencari karakter berdasarkan nama
    public Character findByName(String name) {
        if (name == null) {
            return null;
        }

        for (Character character : characters) {
            if (character.getName().equalsIgnoreCase(name.trim())) {
                return character;
            }
        }

        return null;
    }

    // Bagian A: Menghapus karakter berdasarkan nama
    public boolean removeCharacter(String name) {
        Character character = findByName(name);

        if (character == null) {
            return false;
        }

        characters.remove(character);
        return true;
    }

    // Bagian A: Menghitung total karakter
    public int getTotalCharacters() {
        return characters.size();
    }

    // Bagian A: Mengembalikan salinan daftar karakter
    public List<Character> getAllCharacters() {
        return new ArrayList<>(characters);
    }

    // Bagian B: Menghitung rata-rata level
    public double getAverageLevel() {
        if (characters.isEmpty()) {
            return 0;
        }

        int totalLevel = 0;

        for (Character character : characters) {
            totalLevel += character.getLevel();
        }

        return (double) totalLevel / characters.size();
    }

    // Bagian B: Mencari semua karakter berdasarkan tipe
    public ArrayList<Character> findByType(CharacterType type) {
        ArrayList<Character> result = new ArrayList<>();

        if (type == null) {
            return result;
        }

        for (Character character : characters) {
            if (character.getType() == type) {
                result.add(character);
            }
        }

        return result;
    }
    
    /**
     * Menghitung jumlah karakter berdasarkan tipe tertentu.
     *
     * @param type tipe karakter yang ingin dihitung
     * @return jumlah karakter dengan tipe tersebut
     */
    public int countByType(CharacterType type) {
        if (type == null) {
            return 0;
        }

        int count = 0;

        for (Character character : characters) {
            if (character.getType() == type) {
                count++;
            }
        }

        return count;
    }

}
