package figures;

public class Triangle {

    private final int a;
    private final int b;

    public Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getArea(){
        return a * b;
    }
}
