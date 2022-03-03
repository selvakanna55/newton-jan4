class Main{
  int sumOfNumberRec(int n){
      if(n==1) return 1;
      return n + sumOfNumberRec(n-1);
  }

    public static void main(String args[]){
        Main mainObj = new Main();
        System.out.println("Begin");
        int n = 5;
        int abi = mainObj.sumOfNumberRec(5);
        System.out.println(abi);
        System.out.println("End");
    }
    
}


class Main{
    
    void callMe(int i){
        if(i>=4){
            return;
        }
        i++;
        System.out.println(i);
        callMe(i);
    }
    

    public static void main(String args[]){
        Main mainObj = new Main();
        System.out.println("Begin");
        int i = 0;
        mainObj.callMe(i);
        System.out.println("End");
    }
    
}

