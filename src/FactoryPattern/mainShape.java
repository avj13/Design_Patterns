package FactoryPattern;

public class mainShape {
    public static void main(String args[]){

        ShapeFactory shapeFactoryObj = new ShapeFactory();

        Shape shapeObj = shapeFactoryObj.getShape("Square");
        shapeObj.draw();
    }
}
