public class OOPSBannerApp {
    /**
     * Inner Class to store character and its pattern
     */
    static class CharacterPattern {
        private final char character;
        private final String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern o = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern p = new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPattern s = new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        CharacterPattern[] word = {o, o, p, s};

        for (int i = 0; i < 7; i++) {
            for (CharacterPattern cp : word) {
                System.out.print(cp.getPattern()[i] + " ");
            }
            System.out.println();
        }
    }
}