
package hotel;
import java.util.Scanner;
public class main {
    
   
    public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);
        
       while (true){
        System.out.println("======================================================");
        System.out.println("Sewa kamar");
        System.out.println("======================================================");
           System.out.println("Pilih Tipe Kamar Yang Anda Inginkan! ");
           System.out.println("1.Reguler (Kapasitas : 1 Orang)"
                   + "Harga : (Rp.100.000)");
           System.out.println("2. Double Reguler (Kapasitas : 2 orang) "
                   + "Harga : Rp. 200.000");
           System.out.println("3. Premium (Kapasitas : 2 orang) "
                   + "Harga : Rp. 250.000");
           System.out.println("4. Deluxe (Kapasitas : 2 Orang)"
                   + "Harga = Rp. 350.000");
           System.out.println("Super Premium (Kapasitas : 2 Orang)"
                   + "Harga : Rp. 500.000");
        int pilihan;
        String nama;
        int umur;
        int berapahari;
        System.out.println("Masukkan Pilihan Anda: ");
        pilihan = scanner.nextInt();
           System.out.println("Masukkan Nama Anda: ");
           nama = scanner.nextLine();
           System.out.println("Masukkan Umur Anda: ");
           System.out.println("Sewa Kamar Berapa Lama (Hari): ");
        
        if pilihan == 1{
            double Reguler = 100.000;
            int pesanKamar;
            System.out.println("Berapa kamar yang akan dipesan: ");
            pesanKamar = scanner.nextInt();
            
            double jumlah = pesanKamar + Reguler;
            if jumlah > 700.000 {
                int dc = 5/100;
                int totaldc = (int) (jumlah / dc);
            }
            if jumlah > 500.000{
                int dc = 3/100;
                int totaldc = (int) (jumlah/dc);
            } 

            System.out.println("Sewa berapa hari: ");
            berapaHari = scanner .nextInt;
            if berapaHari > 7{
                
            }
        }
        
    }
    
}}
