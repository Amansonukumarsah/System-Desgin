package Factory_Pattern;

public class factory {

    public shape getShape(String input) {
        switch (input) {
            case "circle":
                return new circle();
            case "square":
                return new square();
            default:
                return null;
        }
    }

}
