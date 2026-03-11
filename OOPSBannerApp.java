/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 *
 * This use case improves UC4 by declaring and initializing the String array
 * in a single statement using String.join() to construct each banner line.
 *
 * @author Developer
 * @version 5.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] lines = {
            String.join(" ", " *** ", " ***** ", " ***** ", " ***** "),
            String.join(" ", "*   *", "*   *", "*   *", "*    "),
            String.join(" ", "*   *", "*   *", "*   *", "*    "),
            String.join(" ", "*   *", "*   *", "**** ", " **** "),
            String.join(" ", "*   *", "*   *", "*    ", "    *"),
            String.join(" ", "*   *", "*   *", "*    ", "*   *"),
            String.join(" ", " *** ", " ***** ", "*    ", " *** ")
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
