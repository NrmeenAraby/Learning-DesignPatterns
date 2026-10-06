package Prototype;

import java.util.Objects;

public abstract class Shape {
    private int x;
    private int y;
    private String color;
    public Shape(){

    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape(Shape toBeCopied){
        this.x=toBeCopied.x;
        this.y=toBeCopied.y;
        this.color=toBeCopied.color;
    }
    public abstract Shape clone();
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return x == shape.x && y == shape.y && Objects.equals(color, shape.color);
    }

}
