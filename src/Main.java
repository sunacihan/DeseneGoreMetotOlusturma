import java.util.Scanner;

public class Main {

    static int azalt(int x,int b){

        if (x>0){
            System.out.print(" "+x);
            x-=5;
            b++;
        }
        else {
            System.out.print(" "+x);
            arttir(x,b);
            return 0;
        }
        return azalt(x,b);
    }

    static int arttir(int x, int b){
        x+=5;
        System.out.print(" "+x);
        b--;
        if (b==0)
            return 0;
        return arttir(x,b);
    }

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int sayi=input.nextInt();
        int b=0;

        azalt(sayi,b);
    }
}