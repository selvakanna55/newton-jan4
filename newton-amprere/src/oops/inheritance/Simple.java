package oops.inheritance;

public class Simple {
    public static void main(String[] args) {
        PetrolEngine tvsPetrolEngine = new PetrolEngine();
        tvsPetrolEngine.rpm = 1000;
        tvsPetrolEngine.shafts =  6;
        tvsPetrolEngine.petrolCapacity = 100;
        System.out.println(tvsPetrolEngine.rpm);
        System.out.println(tvsPetrolEngine.shafts);
        System.out.println(tvsPetrolEngine.petrolCapacity);
    }
}


class Engine{ // parent
    int rpm;
    int shafts;
}

class PetrolEngine extends Engine{ //child
    int petrolCapacity;
}