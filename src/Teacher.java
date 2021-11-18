public class Teacher extends Person{
    private String name;
    private String teaching;
    private int number;

    public Teacher(String name, String teaching, int number) {
        this.name = name;
        this.teaching = teaching;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeaching() {
        return teaching;
    }

    public void setTeaching(String teaching) {
        this.teaching = teaching;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void doSomething() {

    }
}
