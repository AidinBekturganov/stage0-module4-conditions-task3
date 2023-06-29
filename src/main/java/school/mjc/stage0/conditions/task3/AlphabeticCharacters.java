package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        char lower = Character.toLowerCase(character);

        if (lower == 'a' || lower == 'b' || lower == 'c' || lower == 'd' || lower == 'e' || lower == 'f' || lower == 'g' || lower == 'r' || lower == 'o') {
            if (lower == 'a' || lower == 'e' || lower == 'y' || lower == 'i' || lower == 'o' || lower == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
