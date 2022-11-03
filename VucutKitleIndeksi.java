import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double height,weight,index,index2;
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        height= input.nextDouble();
        System.out.print("Lütfen kilonuzu (kilogram cinsinde) giriniz : ");
        weight=input.nextDouble();
        index=(weight/(height*height));
        System.out.println("Vücut kitle indeksiniz : " + index );

    }
}
