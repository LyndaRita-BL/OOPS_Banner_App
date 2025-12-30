public class OOPSBannerUC3 {

    public static void main(String[] args) {
        printBanner(buildBanner());
    }

    static String[] buildBanner() {
        return new String[]{
                " *****   *****   *****   ***** ",
                "*     * *     * *     * *      ",
                "*     * *     * *     * *      ",
                "*     * *     * *****   ***** ",
                "*     * *     * *           * ",
                "*     * *     * *           * ",
                " *****   *****  *       ***** "
        };
    }

    static void printBanner(String[] banner) {
        for (String line : banner) {
            System.out.println(line);
        }
    }
}