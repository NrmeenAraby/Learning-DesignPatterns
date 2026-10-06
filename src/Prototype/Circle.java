package Prototype;

import java.util.Objects;

public class Circle extends Shape{
    private float radius;
    public Circle(){

    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Circle(Circle toBeCopied){
        super(toBeCopied);
        this.radius=toBeCopied.radius;
    }
    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Float.compare(radius, circle.radius) == 0;
    }

}
