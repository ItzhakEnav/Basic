package classes.class03.ObjectOrientedPrograming05.HomeWork;

public class Circle {
    static final double  Pi = 3.141;
    double Radius;
    public Circle(double Radius){
        this.Radius = Radius;
    }
    public void Area(){
        System.out.println(Pi*Radius*Radius);
    }
}
