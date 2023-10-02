package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   int number, basNumber=0;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen Sayı Giriniz:");
        number=input.nextInt();
        int TempNumber=number;   //Temp Programcılıkta Geçici anlamına gelmektedir...
        int basValue;
        int basPow;
        int result=0;
        while (TempNumber != 0){  //Buradaki işlemle birlikte Sayıların Kaç basamaklı olduğunu öğrendikk.
            TempNumber/=10;
            basNumber++;

        }
        TempNumber=number;
        while (TempNumber != 0){
            basValue=TempNumber%10;  //Buradaki İşlemle ise sayıların 10dan kalan bölmü ile birinci basamaklarını tek tek alabildik...
            basPow=1;
            for (int i=1; i<=basNumber; i++){  //burada ise her sayının basamağının üslü versiyonunu aldık...
                basPow*=basValue;
            }
            result+=basPow;
            TempNumber/=10;
        }
        if(result==number) System.out.println(number +"\t"+"Sayısı bir armstrong sayısıdır... ");
        else System.out.println(number+"\t"+"Sayısı armstrong sayısı değildir...");
    }
}
