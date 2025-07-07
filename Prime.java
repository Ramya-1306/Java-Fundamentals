public class Prime{
    public static void main(String args[]){
        for(int i=10;i<=99;i++){
            boolean isprime=true;
        for(int j=2;j<=i/2;j++){
            if(i%j==0){
                isprime=false;
                break;
            }
        }
        if(isprime){
            System.out.print(i +" ");
        }
        }
    }
}