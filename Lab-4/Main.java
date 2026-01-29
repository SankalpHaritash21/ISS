import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.util.Base64;


interface CryptoService {
    String encrypt(String plainText, java.security.Key key) throws Exception;
    String decrypt(String cipherText, java.security.Key key) throws Exception;
}

class RSACryptoService implements CryptoService {

    private static final String ALGORITHM = "RSA";

    public KeyPair generateKeyPair() throws Exception {
        KeyPairGenerator generator = KeyPairGenerator.getInstance(ALGORITHM);
        generator.initialize(2048);
        return generator.generateKeyPair();
    }

    @Override
    public String encrypt(String plainText, java.security.Key publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    @Override
    public String decrypt(String cipherText, java.security.Key privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(cipherText));
        return new String(decryptedBytes);
    }
}


public class Main {
    public static void main(String[] args) {
        try {
            RSACryptoService rsaService = new RSACryptoService();
            KeyPair myKeys = rsaService.generateKeyPair();

            String secretMessage = "Hello this is a secret message";
            
            String encrypted = rsaService.encrypt(secretMessage, myKeys.getPublic());
            System.out.println("Encrypted: " + encrypted);

           
            String decrypted = rsaService.decrypt(encrypted, myKeys.getPrivate());
            System.out.println("Decrypted: " + decrypted);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}