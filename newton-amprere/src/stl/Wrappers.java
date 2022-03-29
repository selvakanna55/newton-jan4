package stl;

public class Wrappers {
    static  void datatypes(){
        String name = "Newton";
        int rollNo = 10;
        char gender = 'M';
        double percentage = 90.75;
        boolean isPlaced = true;
        System.out.println(name+" "+rollNo + " "+gender + " "+ percentage +" "+ isPlaced);
    }

    static  int change(int num){

//        int num = 55;
//        System.out.println(num);
//        num = change(num);
//        System.out.println(num);


        num = 99;
        System.out.println(num);
        return num;
    }


   static void demoWrap(){
        int num  = 45;
        Integer i = new Integer(45);
        Integer j = 45;
        Integer k = Integer.valueOf(45);

        int l = k;

        char gender = 'M';
        Character g1 = new Character('M');
        Character g2 = 'M';
        Character g3 = Character.valueOf('M');



        System.out.println(i + " "+ j + " "+ k + " "+ l);
    }
    public static void main(String[] args) {
        demoWrap();
    }
}
