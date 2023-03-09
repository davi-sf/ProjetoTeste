import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println(("enter the name"));
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Person person1 = new Person(name);
        int letters = person1.contLetters();
        String backwards = person1.reverse();
        System.out.println(String.format("Hello %s, your name has %d letters", name, letters));
        System.out.println(String.format("your name backwards is: %s", backwards));

    }
}
