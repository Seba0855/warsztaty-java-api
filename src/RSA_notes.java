import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RSA_notes {

    String filename;

    RSA_notes(String filename)
    {
        this.filename = filename;
    }

    private String decrypt_notes(long decrypt_key) {
        return "pass" + decrypt_key;
//        BufferedReader reader = new BufferedReader(2); // ?
//        this.
    }


    void save() {
        String encrypted_notes = encrypt_notes();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(this.filename, true));

//            for (int x = 0; x < .length; x++) {
//                writer.append([x].toString());
//            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private String encrypt_notes() {
        return "pass";
    }
}
