package Assignments;

import java.util.Scanner;
// don't change the name of this class
// you can add inner classes if needed
class RamGrade {
    public static void main (String[] args) {
        int x, y, z,l, percentile;
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        y = sc.nextInt();

        z = sc.nextInt();
        l = sc.nextInt();
        percentile = percentile(x, y, z,l);
        System.out.println( percentile);
        sc.close();
    }
    public static int percentile(int x, int y, int z,int l)
    {
        int percentile = ((x + y + z + l)/400)*100;
        return percentile;

    }

}
