package Assignments;

public class SumLarge {
    public static void main(String[] args) {
        String a = "000001";
        String b = "99990";

        int asize = a.length();
        int bsize = b.length();

        StringBuffer sb = new StringBuffer();

        int i = asize-1;
        int j = bsize-1;
        int carry = 0;
        while(i>=0 || j>=0 || carry>0){
            int num1 = 0, num2 = 0;
            if(i>=0) num1+= a.charAt(i) - '0';
            if(j>=0) num2+= b.charAt(j) - '0';
            int sum = num1+num2+carry;

            sb.append(sum%10);
            carry = sum/10;
            i--;
            j--;
        }
        System.out.println(sb.reverse());

    }
}
