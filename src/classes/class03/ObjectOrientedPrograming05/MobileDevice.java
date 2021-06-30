package classes.class03.ObjectOrientedPrograming05;

public class MobileDevice {
    String model;
    char os;
    double OSVersion;
    boolean hasFlash;
    int price;
    int screenWidth;
    int screenHeight;

    void printParameters() {
        System.out.println("model: " + model + "\n" + "os: " + os + "\n" + "OS Version: " + OSVersion + "\n" + "hasFlash: " + hasFlash + "\n" + "price: " + price);
    }

    int calculateArea() {
        return screenHeight * screenWidth;
    }

    void pictureQuality() {
        if(hasFlash){
            System.out.println("Good Quality");
        }
        else {
            System.out.println("Bad Quality");
        }
    }
}
