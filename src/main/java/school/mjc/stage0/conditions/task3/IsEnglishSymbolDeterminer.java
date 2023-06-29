package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        char lower = Character.toLowerCase(symbol);

        if (lower == 'a' || lower == 'b' || lower == 'c' || lower == 'd'  || lower == 'e'  || lower == 'f'  || lower == 'g'  || lower == 'r') {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
