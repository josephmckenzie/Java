import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.Console;
public class EncryptIT 
{
    public void run() 
    {
        try 
        {
            Console console = System.console();
												System.out.println("Please Enter a string to be decrypted:");
												// Get user input from terminal
												String text = console.readLine();
            // String text = "This is Encrypted by Manbun Tech";
									   // Key Needs to be 16,24,32 chars long
            String key = "tEecEe~aNd_coDer~aRe_rEaLly~Cool"; // 128 bit key
            // Create key and the cipher
            Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            // encrypt the text/string
            cipher.init(Cipher.ENCRYPT_MODE, aesKey);
            byte[] encrypted = cipher.doFinal(text.getBytes());

            StringBuilder sb = new StringBuilder();
            for (byte b: encrypted) {
                sb.append((char)b);
            }

            // the encrypted String
            String enc = sb.toString();
									   System.out.println("The following string is encrypted: " + enc);
            // System.out.println(enc);

            // now convert the string to byte array for decryption
            byte[] bytearray = new byte[enc.length()];
            for (int i=0; i < enc.length(); i++) {
                bytearray[i] = (byte) enc.charAt(i);
            }

            // decrypt the text
            cipher.init(Cipher.DECRYPT_MODE, aesKey);
            String decrypted = new String(cipher.doFinal(bytearray));
            System.err.println("The decrypted string: " + decrypted);
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) 
    {
        EncryptIT app = new EncryptIT();
        app.run();
    }
}
