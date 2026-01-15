public interface EncryptionAlgorithm {
    String encrypt(String plainText, String key) throws Exception;
    String decrypt(String cipherText, String key) throws Exception;
}
