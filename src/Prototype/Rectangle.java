package Prototype;

import java.util.Objects;

public class Rectangle extends Shape {
    private int width;
    private int height;
    public Rectangle (){

    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle(Rectangle toBeCopied){
        super(toBeCopied);
        this.width=toBeCopied.width;
        this.height=toBeCopied.height;
    }
    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }

}
