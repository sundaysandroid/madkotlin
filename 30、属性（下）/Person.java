public class Person {
    private final String name;
    private Boolean isMarried;

    public Person(String name, Boolean isMarried) {
        this.name = name;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }

    public Boolean isMarried() {
        return isMarried;
    }

    public void setMarried(Boolean isMarried) {
        this.isMarried = isMarried;
    }
}
