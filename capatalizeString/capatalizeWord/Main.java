// make word or sentence in lower case all

package capatalizeString.capatalizeWord;

public class Main {
    public static void main(String[] args) {

        String word = "Apple , Banana";

        StringBuffer sb = new StringBuffer();

        int length = word.length();

        // --------to lowe case sentence---------
        // for (int i = 0; i < length; i++) {

        // if (word.charAt(i) >= 65 && word.charAt(i) <= 90) {
        // System.out.println((char) (word.charAt(i) + 32));
        // sb.append((char) (word.charAt(i) + 32));

        // } else {
        // sb.append(word.charAt(i));
        // }

        // }
        // System.out.println(sb);
        // System.out.println(sb instanceof StringBuffer);

        // ---------- to upper case sentence-----------

        // for (int i = 0; i < length; i++) {

        // if (word.charAt(i) >= 65+32 && word.charAt(i) <= 90+32) {
        // System.out.println((char) (word.charAt(i) - 32));
        // sb.append((char) (word.charAt(i) - 32));

        // } else {
        // sb.append(word.charAt(i));
        // }

        // }
        // System.out.println(sb);

        // --------- simplest-----------

        for (char c : word.toCharArray()) {

            if (c >= 65 + 32 && c <= 90 + 32) {
                System.out.println((char) (c - 32));
                // sb.append((char) (c - 32));
                c = ((char) (c - 32));
            }
            sb.append(c);

        }
        System.out.println(sb.toString() instanceof String);

    }

}
