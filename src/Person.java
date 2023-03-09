public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int contLetters() {
        return name.length();
    }

    public String reverse() {
        String backwards = "";
        for (int i = name.length() - 1; i >= 0; i -= 1) {
            backwards += name.charAt(i);
        }
        return backwards;
    }
}
