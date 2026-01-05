import java.util.HashMap;
import java.util.Map;

/**
 * UC8: Use Map for Character Patterns and Render via Function
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        Map<Character, String[]> patternMap = buildCharacterPatternMap();
        printBanner("OOPS", patternMap);
    }

    /**
     * Builds character-to-pattern map
     *
     * @return map of character patterns
     */
    static Map<Character, String[]> buildCharacterPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return map;
    }

    /**
     * Prints banner for the given word
     *
     * @param word input word
     * @param map  character pattern map
     */
    static void printBanner(String word, Map<Character, String[]> map) {

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                line.append(map.get(ch)[row]).append("   ");
            }
            System.out.println(line);
        }
    }
}
