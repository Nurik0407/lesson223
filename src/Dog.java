public class Dog extends Animals {
    public Dog(int age) {
        super(age);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String toString() {
        return "Dog{ " + super.toString()+'\n';
    }
}
