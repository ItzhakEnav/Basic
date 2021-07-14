package classes.class03.ObjectOrientedPrograming05.HomeWork;

public class Triangle {
    double height, width;
    public Triangle(double h, double w){
        width = w;
        height = h;
    }

    public void Area() {
        System.out.println((width * height) / 2);

    }
}
