package classes.class03.ObjectOrientedPrograming05;

public class MainProgram {
    public static void main(String[] args) {
        MobileDevice MD = new MobileDevice();
        MD.hasFlash = true;
        MD.model = "אייפון";
        MD.os = 'i';
        MD.OSVersion = 8.12;
        MD.price = 4330;
        MD.printParameters();
        MD.screenHeight = 22;
        MD.screenWidth = 47;
        System.out.println("Area: " + MD.calculateArea());
        MD.pictureQuality();
    }

}
