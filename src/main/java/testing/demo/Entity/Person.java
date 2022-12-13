package testing.demo.Entity;



public class Person {


    private Pen pen;

    public Person(Pen pen) {
        this.pen = pen;
    }

    public String write() {
        return "Student Write with: " + pen.getRedPen();
    }
}
