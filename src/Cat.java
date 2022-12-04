public class Cat extends Animals {
    public Cat(int age) {
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
        return "Cat{ " + super.toString()+'\n';
    }
}
