public class Fst_Lst_dig {
    public static void main(String[] args) {
        int n=527168;
        int Fst,Lst,temp;
        Lst=n%10;
        System.out.println("last digit:"+Lst);
        Fst=n;
        while(Fst>=10){
            Fst/=10;
        }
        System.out.println("fast digit:"+Fst);
        int sum=Fst+Lst;
        System.out.println("sum of 1st and last digit is:"+sum);
        // swap fst and last
        temp=Lst;
        Lst=Fst;
        Fst=temp;
        System.out.println("after swap fast:"+Fst+"and last:"+Lst);
    }
}
