import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class CryptoDemo {

    // ---------- AES ENCRYPT ----------
    public static String encryptAES(String plainText, String key) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        byte[] encrypted = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    // ---------- AES DECRYPT ----------
    public static String decryptAES(String cipherText, String key) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        byte[] decrypted =
                cipher.doFinal(Base64.getDecoder().decode(cipherText));
        return new String(decrypted);
    }

    // ---------- DES ENCRYPT ----------
    public static String encryptDES(String plainText, String key) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "DES");
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        byte[] encrypted = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    // ---------- DES DECRYPT ----------
    public static String decryptDES(String cipherText, String key) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "DES");
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        byte[] decrypted =
                cipher.doFinal(Base64.getDecoder().decode(cipherText));
        return new String(decrypted);
    }

    // ---------- MAIN METHOD ----------
    public static void main(String[] args) throws Exception {

        String message = "Hello Encryption";

        // AES
        String aesKey = "1234567890123456"; // 16 characters
        String aesEncrypted = encryptAES(message, aesKey);
        String aesDecrypted = decryptAES(aesEncrypted, aesKey);

        System.out.println("=== AES ===");
        System.out.println("Original  : " + message);
        System.out.println("Encrypted : " + aesEncrypted);
        System.out.println("Decrypted : " + aesDecrypted);

        System.out.println();

        // DES
        String desKey = "12345678"; // 8 characters
        String desEncrypted = encryptDES(message, desKey);
        String desDecrypted = decryptDES(desEncrypted, desKey);

        System.out.println("=== DES ===");
        System.out.println("Original  : " + message);
        System.out.println("Encrypted : " + desEncrypted);
        System.out.println("Decrypted : " + desDecrypted);
    }
}
