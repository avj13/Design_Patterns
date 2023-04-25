package FactoryPattern;

public class ShapeFactory {

    //dynamic object return factory case dependent
    Shape getShape(String input){
        switch (input){
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            case "Square":
                return new Square();
            default:
                return null;
        }
    }
}
