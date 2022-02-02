import java.util.Scanner;
import java.math.BigInteger;
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Solution sol = new Solution();
        sol.solve();
    }
}

class Solution{
    int[] getCharCount(String s1){
        int arr[] = new int[26];        

        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            arr[c-'a']++;
        }

        for(int i=0;i<26;i++){
            if(arr[i]>0){
                char c = (char)(i+'a');
                System.out.println(c + " "+arr[i]+"   ");
            }
        }
        return arr;
    }
    public void solve(){
        Scanner sc = new Scanner(System.in);
        String s1 = "kjbgkjldfg";
        int arr1[] = getCharCount(s1);
        String s2 = "kjbgkjldfag";
        int arr2[] = getCharCount(s2);

        String ans = "YES";
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                ans = "NO";
                break;
            }
        }
        System.out.println(ans);

    

    }
}






import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Solution sol = new Solution();
        sol.solve();
    }
}
// length()
// chatAt(index)
// substring(index)
// substring(startIndex, endIndex)
// equals(String)
// isEmpty()


class Solution{
    
    public void solve(){
        // Scanner sc = new Scanner(System.in);    

        // Newton
        char name[] = {'N', 'e', 'w', 't', 'o', 'n'};
        // convert char arry to string (string object)
        String newName = new String(name);
        // System.out.println(newName);

        String name1 = "Newton";
        String name2 = "Newton";
        String name3 = new String("Lean java");
        String name4 = new String("");

        // System.out.println(name1.charAt(0));
        // System.out.println(name[0]);
        // System.out.println(name1.substring(3));
        // System.out.println(name1.substring(1,4));
        // System.out.println(name1.equals(name2));
        // System.out.println(name1.equals(name3));
        // System.out.println(name1.isEmpty());
        String name5 = name3.replace("java", "c++");
        System.out.println(name5);
        System.out.println(name3);

        n
        // System.out.println(name2);

    }
}


import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Solution sol = new Solution();
        sol.solve();
    }
}


class Solution{
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        //start from a go till z;

        for(char c = 'a';c<='z';c++){
            int charCount = 0;

            for(int i=0;i<word.length();i++){
                if(word.charAt(i)==c){// currChar == 'a'
                    charCount++;
                }
            }
            // counter will have total number of a in word
            if(charCount>0){
                System.out.print(c);
                System.out.print(charCount + " ");
            }

        }
    }
}




import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Solution sol = new Solution();
        sol.solve();
    }
}


class Solution{
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        //start from a go till z;

        int arr[] = new int[26]; // 0 to 25
        // 0 -> a 25 -> z

        for(int i=0;i<word.length();i++){
                char c = word.charAt(i);
                // change char to int
                int num = c - 'a'; // 'b' - 'a' // 98-97 = 1
                arr[num]++; // arr[1] = arr[1]+1;
        }

        for(int i=0;i<26;i++){
            if(arr[i]>0){
                char c = (char)(i +97); //convert int to char 
                System.out.print(c);
                System.out.print(arr[i] + " ");
            }            
        }


    }
}

























