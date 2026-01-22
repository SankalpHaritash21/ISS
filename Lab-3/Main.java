public class Main {
    public static void main(String[] args) throws Exception {

        HashAlgorithm md5 = new MD5Hash();
        // Object is created using interface reference
        // hash() method is called
        // Output is printed
        System.out.println("MD5 Hash Value: " + md5.hash("Hello World"));
    }
}
