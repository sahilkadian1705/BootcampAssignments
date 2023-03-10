package Question12;
sealed interface Subjects permits Physics,Chemistry,Maths{
    int totalMarks();
}
record Physics() implements Subjects{
    @Override
    public int totalMarks() {
        return 80;
    }
}
record Maths() implements Subjects{
    @Override
    public int totalMarks() {
        return 100;
    }
}
record Chemistry() implements Subjects{
    @Override
    public int totalMarks() {
        return 80;
    }
}
public class Main {
    public static void main(String[] args) {
        Physics physics = new Physics();
        System.out.println(physics.totalMarks());
        Maths maths = new Maths();
        System.out.println(maths.totalMarks());
        Chemistry chemistry = new Chemistry();
        System.out.println(chemistry.totalMarks());
    }
}
