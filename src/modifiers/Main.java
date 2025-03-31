package modifiers;

import static modifiers.Country.maxArea;

public class Main {
    public static void main(String[] args) {
            Circle circle = new Circle(5.0);
            System.out.println("Area: " + Circle.area(circle.getRadius()));
            System.out.println("Circumference: " + Circle.circumference(circle.getRadius()));
        }
    }