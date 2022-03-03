int a = 2;
int b = 16;
// ans should be mod 97
int mod = 97;
// 2^10

int ans = 1;

for(int i=0;i<b;i++){
   // 16 times
   ans = (ans*a);
}
// O(b)
System.out.println(ans);
System.out.println(Math.pow(a,b));



int f(int a, int b){
     if(b==0) {
         return 1;
     }
     int x = f(a,b/2);
     if(b%2==0){
         return x*x;
     }
     else{
         return a*x*x;
     }
 }

 int pow(int a, int b){
     int res = 1;

     while(b>0){
         if(b%2==1){
             res = res*a;
         }

         a = a*a;
         b = b/2;
     }
     return res;
 }