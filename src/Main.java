import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

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

        Posługując się dokumentacją klasy java.awt.Rectangle znajdź odpowiednie metody
        i napisz program który sprawdzi czy prostokąt obj1 zawiera się w prostokącie obj2.
        Skompiluj i przetestuj przykład.
 */

        Rectangle rectangle3 = new Rectangle(1,1,4,5);
        Rectangle rectangle4 = new Rectangle(2,0,2,3);

        System.out.println(rectangle3.contains(rectangle4));

        
/*        ćw. 3.4
        Utwórz obiekt obj reprezentujący prostokąt o wierzchołku w punkcie o współrzędnych (-3,0), długości 6 i wysokości 3. Posługując się dokumentacją klasy java.awt.Rectangle znajdź odpowiednie metody i napisz program który sprawdzi czy punkt o współrzędnych (2,-1) leży wewnątrz prostokąta obj. Skompiluj i przetestuj przykład.


 */
    }
}





