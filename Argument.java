public class Argument {
    public static void main(String[] args){
        int n1= Integer.valueOf(args[0]);
       int n2= Integer.valueOf(args[1]);
       int n3 = n1+n2;
       
        System.out.println("the sum of "+n1+" and "+n2 +" "+"is "+ n3);
    }
}