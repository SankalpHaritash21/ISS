import java.security.MessageDigest;

public class MD5Hash implements HashAlgorithm {

    public String hash(String text) throws Exception {

        MessageDigest md = MessageDigest.getInstance("MD5"); // Creates MD5 algorithm object
        byte[] hashBytes = md.digest(text.getBytes()); 
        /*
        1. Converts input text into byte array
        2. Applies MD5 hashing
        3. Produces hash bytes
        */

        String result = ""; // Empty string to store final hash
        for (byte b : hashBytes) {
            result += String.format("%02x", b);
        }
        /*
        1. Converts each byte into 2-digit hexadecimal
        2. Combines all values into one string
        */
        return result;
    }
}
