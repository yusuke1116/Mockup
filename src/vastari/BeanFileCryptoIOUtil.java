package vastari;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException; 
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

//PINCODE ENCRYPTION FILE

public class BeanFileCryptoIOUtil {
	private final static String CRYPTO_ALGORYTHM = "Blowfish";
	private final static String KEY = "nurukunai";
 
	public static Object readCryptoBean(String fileName) {
		Object bean = null;
		try {
			SecretKeySpec sksSpec = new SecretKeySpec(KEY.getBytes(), CRYPTO_ALGORYTHM);

			Cipher cipher = Cipher.getInstance(CRYPTO_ALGORYTHM);

			cipher.init(Cipher.DECRYPT_MODE, sksSpec);
 
			XMLDecoder decoder = new XMLDecoder(
					new CipherInputStream(
							new FileInputStream(fileName), cipher));
			bean = decoder.readObject();
			decoder.close();
		} catch (FileNotFoundException | NoSuchAlgorithmException
				| NoSuchPaddingException | InvalidKeyException e) {
			e.printStackTrace();
		}
 
		return bean;
	}
 
	public static void writeCryptoBean(String fileName, Object bean) {
		try {
			File file = new File(fileName);
 
			File parentDir = file.getParentFile();
			if (parentDir != null && !parentDir.exists())
				parentDir.mkdirs();
 
			SecretKeySpec sksSpec = new SecretKeySpec(KEY.getBytes(), CRYPTO_ALGORYTHM);
 
			Cipher cipher = Cipher.getInstance(CRYPTO_ALGORYTHM);

			cipher.init(Cipher.ENCRYPT_MODE, sksSpec);
 
			XMLEncoder encoder = new XMLEncoder(
					new CipherOutputStream(
							new FileOutputStream(fileName), cipher));
			encoder.writeObject(bean);
			encoder.close();
		} catch (FileNotFoundException | NoSuchAlgorithmException
				| NoSuchPaddingException | InvalidKeyException e) {
			e.printStackTrace();
		}
	}
}
