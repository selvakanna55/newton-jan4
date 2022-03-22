package oops;

public class SimpleClass {
    public static void main(String[] args) {
        //create an object
        Bill chairBill = new Bill();

//        chairBill.priceOfChair = 100;
        chairBill.setPriceOfChair(100);
//        System.out.println("Price of chair: "+chairBill.priceOfChair);
        System.out.println("Price of chair: "+chairBill.getPriceOfChair());

    }
}

class Bill{
    // price of the products
    double priceOfTable;
    double priceOfChair;

    void setPriceOfChair(double priceOfChair){
        this.priceOfChair = priceOfChair;
    }

    double getPriceOfChair(){
        return this.priceOfChair;
    }

}