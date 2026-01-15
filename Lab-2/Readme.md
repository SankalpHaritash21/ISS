# Develop and implement a Java interface for encryption and decryption algorithms (AES, DES)

## What is cryptography?

- Cryptography is a technique used to ensure confidentiality, integrity, authentication, and security of information during storage or transmission by using mathematical algorithms.

## Why encryption is needed?

    - Data security
    - Password protection
    - Secure communication

## Encryption

Encryption is the process of converting plaintext into ciphertext to protect information from unauthorized access.

```
Plaintext → Ciphertext
```

Purpose:

1. Secures data before storage or transmission
2. Makes information unreadable to unauthorized users

## Decryption

Decryption is the process of converting ciphertext back into plaintext so that the original information can be read.

```
Ciphertext → Plaintext
```

Purpose:

1. Allows authorized users to access the original data
2. Restores data to a readable format

### Symmetric Key Encryption

Symmetric key encryption uses the same secret key for both encryption and decryption.

```
Plaintext → Encryption (Key K) → Ciphertext
Ciphertext → Decryption (Key K) → Plaintext
```

Popular Symmetric Key Algorithms

1. DES (Data Encryption Standard)

1. Uses a 56-bit key
1. Considered weak and insecure
1. Deprecated due to vulnerability to brute-force attacks

1. AES (Advanced Encryption Standard)

1. Supports 128-bit, 192-bit, and 256-bit keys
1. Provides strong security
1. Widely used in modern applications and systems

```
DES is taught mainly for academic understanding, while AES is used in real-world secure systems.
```
