public class CryptoDemo {

    public static void main(String[] args) throws Exception {

        String message = "Hello Encryption";

        EncryptionAlgorithm aes = new AESAlgorithm();
        String aesKey = "1234567890123456";

        String aesEnc = aes.encrypt(message, aesKey);
        String aesDec = aes.decrypt(aesEnc, aesKey);

        System.out.println("=== AES ===");
        System.out.println("Encrypted: " + aesEnc);
        System.out.println("Decrypted: " + aesDec);

        System.out.println();

        EncryptionAlgorithm des = new DESAlgorithm();
        String desKey = "12345678";

        String desEnc = des.encrypt(message, desKey);
        String desDec = des.decrypt(desEnc, desKey);

        System.out.println("=== DES ===");
        System.out.println("Encrypted: " + desEnc);
        System.out.println("Decrypted: " + desDec);
    }
}
