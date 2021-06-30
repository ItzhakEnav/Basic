package classes.class03.ObjectOrientedPrograming05;

public class MainProgram {
    public static void main(String[] args) {
        MobileDevice MD = new MobileDevice( 10,6);
        MD.hasFlash = true;
        MD.model = "Iphone";
        MD.os = 'i';
        MD.OSVersion = 8.12;
        MD.price = 4330;
        MD.printParameters();

        System.out.println("Area: " + MD.calculateArea());
        MD.pictureQuality();
    }

}
