package Generics.boundedWildcards.entities;

public class Rectangle implements Shape{

    // atributos
    private double width;   // largura
    private double height;  // altura

    // construtor
    public Rectangle(){
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // get e set
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // sobreposição do método area da interface Shape
    @Override
    public double area(){
        return width * height;
    }
}
