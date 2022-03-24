package oops.polymorphism;


public class Runtime {
    public static void main(String[] args) {
        ApplePhone ap = new ApplePhone();
        ap.call(123);
    }
}

class ApplePhone extends Phone{
    int camera;
    boolean isIos;

    void call(int number){
        super.call(number); // super means got to parent
        System.out.println("Calling from apple phone to "+number);
    }

    void takePhoto(){
        System.out.println("Taking photo of you");
    }

}