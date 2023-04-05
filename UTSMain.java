package uts;
import java.util.Scanner;

public class UTSMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max_penumpang =20;
        int jumlah_penumpang =5;
      
        System.out.println("-----------------------------------------");
        System.out.println("OUTPUT : ");
        System.out.println("-----------------------------------------");
        System.out.println("Bus Berangkat dari Pull");
        System.out.println("Jumlah Penumpang :" +jumlah_penumpang);
        System.out.println("3 Penumpang Turun di Halte Porong");
        System.out.println("2 Penumpang Turun di Halte Gresik");
        
        do {
            //Untuk Rute Porong
            System.out.println("-----------------------------------------");
            Rute Porong = new Rute(jumlah_penumpang, max_penumpang);
            System.out.println(Porong.get_Wait() + " Penumpang Menunggu");
            System.out.println("Bus Sampai di Halte Porong");
            System.out.print("Masukkan Penumpang yang Ingin Turun : ");

            int temp = input.nextInt();
            temp = Porong.get_passangers() - temp;

            System.out.println(temp + " Penumpang Turun");
            System.out.println(Porong.get_Wait() + " Penumpang Naik");

            temp = temp + Porong.get_Wait();

            System.out.println("Jumlah Penumpang" + temp);

            int penumpang = Porong.get_Wait() - Porong.get_Wait();
            System.out.println("Halte Porong " + penumpang + " Penumpang Menunggu");
            System.out.println(temp + " Perjalanan ke Halte Surabaya dan Halte Gresik");
            System.out.println("-----------------------------------------");
            
            
            //Untuk Rute Surabaya
            Rute Surabaya = new Rute(temp, max_penumpang);
            System.out.println(Surabaya.get_Wait() + " Penumpang Menunggu");
            System.out.println("Bus Sampai di Halte Surabaya");
            System.out.print("Masukkan Penumpang yang Ingin Turun : ");

            int jml_passangers = input.nextInt();
            System.out.println(jml_passangers + " Penumpang Turun");
            jml_passangers = Surabaya.get_passangers() - jml_passangers;

            System.out.println(Surabaya.get_Wait() + " Penumpang Naik");

            jml_passangers = jml_passangers + Surabaya.get_Wait();

            System.out.println("Jumlah Penumpang " + jml_passangers);

            int passangers_2 = Surabaya.get_Wait() - Surabaya.get_Wait();

            System.out.println("Halte Surabaya " + passangers_2 + " Penumpang Menunggu");
            System.out.println(jml_passangers + " Bus Menuju ke Halte Gresik");
            System.out.println("-----------------------------------------");
            
            
            //Untuk Rute Gresik
            Rute Gresik = new Rute(jml_passangers, max_penumpang);
            System.out.println(Gresik.get_Wait() + " Penumpang Menunggu");
            System.out.println("Bus Sudah Sampai di Halte Gresik");
            System.out.print("Masukkan Penumpang yang Ingin Turun : ");
            
            int grs = input.nextInt();
            System.out.println(grs + " Penumpang Turun");
            grs = Gresik.get_passangers() - grs;

            System.out.println(Gresik.get_Wait() + " Penumpang Naik");

            grs = grs + Gresik.get_Wait();

            System.out.println("Jumlah Penumpang " + grs);

            int passangers_3 = Gresik.get_Wait() - Gresik.get_Wait();
            System.out.println("Halte Gresik " + passangers_3 + " Penumpang Menunggu");
            System.out.println(grs + " Bus Perjalanan ke Halte Porong");

            jumlah_penumpang = grs;
        } while (jumlah_penumpang <= 20);
        input.close();
    }
}
