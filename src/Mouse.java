public class Mouse extends Animals{
    public Mouse(int age) {
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
        return "Mouse{ "+super.toString()+'\n';
    }
}
