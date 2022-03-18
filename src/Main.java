import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(0, 0, 4, 3);
        Rectangle rectangle2 = new Rectangle(1, 1, 4, 3);
        Rectangle2D intersection;

        // 3.2
        intersection = rectangle1.createIntersection(rectangle2);

        System.out.println(intersection);

        
    }
}


// ćw. 3.2
//        Utwórz obiekt obj1 reprezentujący prostokąt
//        o wierzchołku w punkcie o współrzędnych (0,0),
//        długości 4 i wysokości 3

//        oraz obiekt obj2 reprezentujący prostokąt
//        o wierzchołku w punkcie (1,1),
//        długości 4 i wysokości 3.
//
//        Posługując się dokumentacją klasy java.awt.Rectangle znajdź odpowiednie metody
//        i napisz program który utworzy obiekt reprezentujący prostokąt będący przecięciem (częścią wspólną)
//        obj1 i obj2. Skompiluj i przetestuj przykład.
