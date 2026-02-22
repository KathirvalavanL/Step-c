public class t {
    public static void main(String[] args) {

        // Store all banner lines using String array
        String[] banner = {
            " *****    *****    *****    ***** ",
            "*       *     *  *     *  *     *",
            "*       *     *  *     *  *     *",
            " *****   *     *  *     *  *     *",
            "      *  *     *  *     *  *     *",
            "      *  *     *  *     *  *     *",
            " *****    *****    *****    ***** "
        };

        // Print banner using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}