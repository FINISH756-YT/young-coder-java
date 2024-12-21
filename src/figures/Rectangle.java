package figures;

public class Rectangle {

    private final int a;
    private final int b;

    public Rectangle (int a, int b ) {
        this.a = a;
        this.b = b;
    }

    public int getArea(){
        return a * b;
    }
}
