package com.xworkz.rto.util;

import java.nio.charset.StandardCharsets;
import java.security.spec.KeySpec;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;

import org.springframework.stereotype.Component;

@Component
public class Encryption {
	private static final String UNICODE_FORMAT = "UTF8";
	public static final String DESEDE_ENCRYPTION_SCHEME = "DESede";

	private KeySpec keySpec;
	private SecretKeyFactory secretKeyFactory;
	private Cipher cipher;
	private byte[] encryptionKeyBytes;
	private SecretKey secretKey;

	private String myEncryptionKey = "ThisIsSpartaThisIsSparta";
	private String myEncryptionScheme = DESEDE_ENCRYPTION_SCHEME;

	public Encryption() throws Exception {
		encryptionKeyBytes = myEncryptionKey.getBytes(UNICODE_FORMAT);
		keySpec = new DESedeKeySpec(encryptionKeyBytes);
		secretKeyFactory = SecretKeyFactory.getInstance(myEncryptionScheme);
		cipher = Cipher.getInstance(myEncryptionScheme);
		secretKey = secretKeyFactory.generateSecret(keySpec);
	}

	public String encrypt(String unencryptedString) {
		String encryptedString = null;
		try {
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			byte[] plainText = unencryptedString.getBytes(StandardCharsets.UTF_8);
			byte[] encryptedText = cipher.doFinal(plainText);
			encryptedString = Base64.getEncoder().encodeToString(encryptedText);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return encryptedString;
	}

	public String decrypt(String encryptedString) {
		String decryptedText = null;
		try {
			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			byte[] encryptedText = Base64.getDecoder().decode(encryptedString);
			byte[] plainText = cipher.doFinal(encryptedText);
			decryptedText = new String(plainText, StandardCharsets.UTF_8);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return decryptedText;
	}

	public static void main(String args[]) {
		try {
			Encryption td = new Encryption();
			String target = "imperator";
			String encrypted = td.encrypt(target);
			String decrypted = td.decrypt(encrypted);

			System.out.println("String To Encrypt: " + target);
			System.out.println("Encrypted String:" + encrypted);
			System.out.println("Decrypted String:" + decrypted);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
