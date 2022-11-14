import java.util.Scanner;

class Cake {
    int x, y, z;

    Cake() {

    }

    Cake(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Cake calc(Cake a, Cake c) {
        Cake b = new Cake();
        b.x = c.x - a.z;
        b.y = c.y / a.y;
        b.z = c.z - a.x;
        return b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, z;
        Cake a = new Cake(x = scanner.nextInt(), y = scanner.nextInt(), z = scanner.nextInt());
        Cake c = new Cake(x = scanner.nextInt(), y = scanner.nextInt(), z = scanner.nextInt());
        Cake b = a.calc(a, c);
        System.out.println(b.x + " " + b.y + " " + b.z);
    }
}