# Develop and implement a java interface for encryption and decryption algorithms RSA algorithms

- Asymmetric Key Cryptography
  - Asymmetric key cryptography is a cryptographic system that uses two different but mathematically related keys:
    1. Public key → shared with everyone
    2. Private key → kept secret by the owner

![RSA](image.png)

Data is encrypted with one key can only be decrypted with the other key.

- RSA(Rivest–Shamir–Adleman) is a public-key cryptography algorithm used to secure data on the internet.

```
    RSA lets you lock a message with one key and unlock it with another
```

## Where it is used:

    - HTTPS (secure websites)
    - Digital signatures
    - Secure email
    - Login authentication
    - Key exchange

# What makes it different:

Unlike old encryption where same key = lock + unlock

RSA uses two different keys.

1. Public Key → used to encrypt
2. Private Key → used to decrypt

** Anyone can have your public key
But ONLY you/user have your private key **

Steps:

1. Choose two very large prime numbers
2. Multiply them -> gives a huge number n
3. Create:
   - Public key (shared with the world)
   - Private key (kept secret)
4. Sender encrypts message using public key
5. Receiver decrypts using private key

```
    RSA is secure because doing the math forward is easy, but reversing it would take longer than the age of the universe.
```
