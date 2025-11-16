
public class primeNum {

    public static void main(String []args){
        System.out.println("prime number from 1 to 100 are: ");
        for (int i=2; i<=100;){
            int prime = 1;
            for(int loop = 2; loop <= i; loop++){
                if ((i % loop) ==0 && loop != i){
                    prime = 0;
                }
            }
            if (prime != 0){
                System.out.println(i);
                System.out.println(" ");
                i++;
            }
            else
                i++;
            
        }
    }
}