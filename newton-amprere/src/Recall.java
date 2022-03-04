public class Recall {
    public static void main(String[] args) {
        int rollNo = 25; // 4bytes
        char gender = 'M';
        String name = "Newton";
        boolean isTopper = true; // false

        double percentage = 95.7;
        float percentage2 = 97.55f;
        long longNum = 10;



        System.out.println("RollNo "+rollNo);
        System.out.println("Gender "+gender);
        System.out.println("Name "+name);
        System.out.println("is Topper? "+isTopper);
        System.out.println("Percentage  "+percentage);
        System.out.println("Long Number  "+longNum);
//        System.out.println("INT MAX  "+Integer.MAX_VALUE);
//        System.out.println("INT MIN "+Integer.MIN_VALUE);

        int num1 = Integer.MAX_VALUE;
        System.out.println(num1);
        num1 = num1+1;
        System.out.println(num1);

        System.out.println(10+20);
        System.out.println(10-20);
        System.out.println(10/20);
        System.out.println(10*20);
        System.out.println(10%20); // mod ->remainder
        System.out.println(10*10*10);
        System.out.println(Math.pow(10,3)); // double


        double num11 = 10.5;
        int num22 = (int)num11;
        System.out.println(num11);
        System.out.println(num22);
        int x = 10;
        double xy = (double) x;
        System.out.println(xy);


    }
}
