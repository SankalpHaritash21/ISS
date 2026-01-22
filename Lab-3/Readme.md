# Develop and implement a java interface for encryption and decryption algorithms for MD5.

Note: MD5 is a hashing algorithm that converts input data into a fixed-length hash value using a one-way function.

## Encryption

- Encryption means converting plain text into secret text
- Decryption means converting secret text back to plain text
- Encryption is reversible
- Example: AES

## Hashing

- Hashing converts data into a fixed-length code
- Hashing is one-way
- Original data cannot be recovered
- Example: MD5

Note: MD5 is NOT encryption. It is hashing algorithm.

# what we did:

- Interface is used to declare hashing method
- MD5 algorithm is implemented using MessageDigest class
- Same input always gives the same hash value

## Few points:

- MD5 stands for Message Digest Algorithm 5
- MD5 is a hashing algorithm
- Hashing converts input data into a fixed length code
- MD5 is a one-way process
- Original data cannot be recovered

## Why MD5 is Used?

- To check data integrity
- To store passwords (historically)
- To detect file changes

```
    Same input → same output
    Small change → totally different hash
```

## MD5 Program Structure

- `HashAlgorithm.java` → Interface
- `MD5Hash.java` → MD5 logic
- `Main.java` → Execution

```

public interface HashAlgorithm {
    String hash(String text) throws Exception;
}

/*
1. Interface defines what method is needed
2. hash() takes input text
3. Returns hash value as String
*/

```
