/**
 * @author fazliberkordek 21 Mart 2023 - 15:47 UTC +3
 */
import java.util.Scanner;
/*

    TODO:
        -Dairenin Alanını ve Çevresini Hesaplayan Program
        -Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
        -Alan Formülü : π * r * r;  (pi double,r double)
        -Çevre Formülü : 2 * π * r;
        -Ödev
        -Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız. (alpha int)
        -𝜋 sayısını = 3.14 alınız.
        -Formül : (𝜋 * (r*r) * 𝛼) / 360

 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r,alpha,pi = 3.14,prmt,area;
        //Taking r and alpha
        System.out.print("r: ");
        r = input.nextDouble();

        System.out.print("alpha: ");
        alpha = input.nextDouble();

        System.out.println("Perimter:"+ (2*pi*r));
        System.out.println("Area without alpa:"+ (pi * r* r));
        System.out.println("Area with alpha acute:" + (alpha*(pi*(r*r)))/360);





    }
}