import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] animal = new String[5] ;

        String a = "dog";
        String b = "cat";
        String c = "rat";
        String d = "fish";
        String e = "Squirrel";

        animal[0] = a;
        animal[1] = b;
        animal[2] = c;
        animal[3] = d;
        animal[4] = e;

        System.out.println(animal.length);
        System.out.println(animal[1]);
        System.out.println(Arrays.toString(animal));

    }
}