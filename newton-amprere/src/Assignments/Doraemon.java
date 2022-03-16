package Assignments;

public class Doraemon {
    static boolean EqualOrNot(int h1, int h2, int v1,int v2){
        if (v2>v1&&(h1-h2)%(v2-v1)==0){
            return true;
        }
        return false;
    }
}
