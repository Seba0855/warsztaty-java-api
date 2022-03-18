import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Prostokat {

    Point p1;
    int width;
    int height;

    Prostokat(int x, int y, int width, int height) {
        this.p1 = new Point(x, y);
        this.width = width;
        this.height = height;
    }


    Point[] calculate() {
        Point[] result = new Point[4];

        result[0] = p1;
        result[1] = new Point(p1.x + height, p1.y);
        result[2] = new Point(p1.x, p1.y + width);
        result[3] = new Point(p1.x + height, p1.y + width);
        return result;
    }

    void save(String nazwa_pliku) {
        Point[] data = calculate();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(nazwa_pliku, true));

            for (int x = 0; x < data.length; x++) {
                writer.append(data[x].toString());
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
