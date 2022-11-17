import java.util.Scanner;

class Member {
    String name;
    int age;
    int weight;

    Member() {
    }

    Member(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void print_member() {
        if (weight >= 80 || age > 17) {
            System.out.println(name + " Senior");
        } else {
            System.out.println(name + " Junior");
        }

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Member[] members = new Member[100];
        int count = 0;
        while (true) {
            String name = scanner.next();
            int age = scanner.nextInt();
            int weight = scanner.nextInt();
            if (name.equals("#") && age == 0 && weight == 0) {
                System.exit(0);
            }
            members[count] = new Member(name, age, weight);
            members[count].print_member();

        }

    }
}