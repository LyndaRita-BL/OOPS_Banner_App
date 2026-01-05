public class OOPSBannerApp {
    
    /**
     * Static Inner Class to encapsulate character and its pattern
     */
    static class CharacterPattern {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern
         *
         * @param character banner character
         * @param pattern   7-line ASCII pattern
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /** @return character */
        public char getCharacter() {
            return character;
        }

        /** @return pattern array */
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern o = new CharacterPattern('O', getOPattern());
        CharacterPattern p = new CharacterPattern('P', getPPattern());
        CharacterPattern s = new CharacterPattern('S', getSPattern());

        CharacterPattern[] word = {o, o, p, s};

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPattern cp : word) {
                line.append(cp.getPattern()[row]).append("   ");
            }
            System.out.println(line);
        }
    }

    /** Utility method for O */
    static String[] getOPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    /** Utility method for P */
    static String[] getPPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    /** Utility method for S */
    static String[] getSPattern() {
        return new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }
}
