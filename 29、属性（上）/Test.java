public class Test {
    public static void main(String[] args) {
        Person person = new Person("Bob", true);
        System.out.println(person.getName());
        person.setMarried(false);
        System.out.println(person.isMarried());
    }
}
