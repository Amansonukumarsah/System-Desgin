package Factory_Pattern;

public class main {

    public static void main(String args[]) {
        factory factory = new factory();
        shape shapeobj = factory.getShape("circle");
        shapeobj.draw();
    }
}
