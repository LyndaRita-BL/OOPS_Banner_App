// /**
//  * UC1: Print OOPS to Console
//  *
//  * <p>This program demonstrates a basic Java application
//  * that prints the literal text "OOPS" to the console.</p>
//  *
//  * @author Lynda
//  * @version 1.0
//  */
// class OOPSBannerApp  {

//     /**
//      * Main method – entry point of the Java application.
//      *
//      * @param args command-line arguments
//      */
//     public static void main(String[] args) {

//         // Print statement to display output on the console
//         System.out.println("OOPS");
//     }
// }
/* uc2-Render OOPS as Banner using Print Statements */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
                " *****   *****   *****   ***** ",
                "*     * *     * *     * *      ",
                "*     * *     * *     * *      ",
                "*     * *     * *****   ***** ",
                "*     * *     * *            * ",
                "*     * *     * *            * ",
                " *****   *****  *        ***** "
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}