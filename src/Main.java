import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        /*
        ćw. 3.2
        Utwórz obiekt obj1 reprezentujący prostokąt
        o wierzchołku w punkcie o współrzędnych (0,0),
        długości 4 i wysokości 3

        oraz obiekt obj2 reprezentujący prostokąt
        o wierzchołku w punkcie (1,1),
        długości 4 i wysokości 3.

        Posługując się dokumentacją klasy java.awt.Rectangle znajdź odpowiednie metody
        i napisz program który utworzy obiekt reprezentujący prostokąt będący przecięciem (częścią wspólną)
        obj1 i obj2. Skompiluj i przetestuj przykład.
        */

        Rectangle rectangle1 = new Rectangle(0, 0, 4, 3);
        Rectangle rectangle2 = new Rectangle(1, 1, 4, 3);
        Rectangle2D intersection;

        intersection = rectangle1.createIntersection(rectangle2);

        System.out.println(intersection);

/*
        ćw. 3.3
        Utwórz obiekt obj1 reprezentujący prostokąt o wierzchołku w punkcie
        o współrzędnych (1,1), długości 4 i wysokości 5

        oraz obiekt obj2 reprezentujący prostokąt o wierzchołku w punkcie
        (2,0), długości 2 i wysokości 3.

        Napisz program który sprawdzi czy prostokąt obj1 zawiera się w prostokącie obj2.

 */

        Rectangle rectangle3 = new Rectangle(1,1,4,5);
        Rectangle rectangle4 = new Rectangle(2,0,2,3);

        System.out.println(rectangle3.contains(rectangle4));


/*        ćw. 3.4
        Utwórz obiekt obj reprezentujący prostokąt o wierzchołku w punkcie
        o współrzędnych (-3,0), długości 6 i wysokości 3.

        Napisz program który sprawdzi
        czy punkt o współrzędnych (2,-1) leży wewnątrz prostokąta obj.

*/

        Rectangle rectangle5 = new Rectangle(-3, 0, 6, 3);
        Point p1 = new Point(2, -1);

        System.out.println(rectangle5.contains(p1));

/*
        ćw. 3.5
        Utwórz obiekt obj1 reprezentujący prostokąt
        o wierzchołku w punkcie o współrzędnych (1,1), długości 4 i wysokości 5

        oraz obiekt obj2 reprezentujący prostokąt
        o wierzchołku w punkcie (4,-3), długości 4 i wysokości 3.

        Napisz program który sprawdzi czy prostokąt obj1 przecina prostokąt obj2.
        Skompiluj i przetestuj przykład.

 */

        Rectangle rectangle6 = new Rectangle(1,1,4,5);
        Rectangle rectangle7 = new Rectangle(4,-3,4,3);

        System.out.println(rectangle6.intersects(rectangle7));


        KeyboardReader kr = new KeyboardReader();
        kr.reader();


//        Prostokat prostokat = new Prostokat(0, 0, 6, 2);
//        prostokat.save("dd.txt");


    }
}
