
import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank b1 = new Bank("16030927", "Wallace", "Mei Mei", "082-458-264-3263", "wallace@gmail.com");
        Bank b2 = new Bank("16100617", "Darius", "Susanti", "081-357-843-0547", "darius@pt.org");
        Bank b3 = new Bank("16240401", "Fuller", "Rosalia", "085-556-712-7062", "fuller@gmail.com");
        Bank b4 = new Bank("16270525", "Maria", "Krabela", "082-267-223-0234", "maria@gmail.com");
        Bank b5 = new Bank("16101617", "Gery", "Fatimah", "083-683-416-8323", "gery@gery.com");

        Transaksi[] dataTransaksiArray = {
            new Transaksi("TR005", 500000, 200000, 700000, "2025-04-01", "Credit", b1),
            new Transaksi("TR004", 700000, 100000, 600000, "2025-04-02", "Debit", b2),
            new Transaksi("TR003", 300000, 150000, 450000, "2025-04-03", "Credit", b3),
            new Transaksi("TR002", 1000000, 300000, 1300000, "2025-04-04", "Credit", b1),
            new Transaksi("TR001", 200000, 50000, 250000, "2025-04-05", "Credit", b2)
        };

        
        ServiceTransaksi service = new ServiceTransaksi(10);
        for (int i = 0; i < dataTransaksiArray.length; i++) {
            service.tambah(dataTransaksiArray[i]);
        }

        int pilihan;
        do {
            System.out.println("\n===========POLINEMA BANK============");
            System.out.println("BANK MENU:");
            System.out.println("1. Data Norek");
            System.out.println("2. Data Transaksi");
            System.out.println("3. Search Data Berdasarkan No Hp");
            System.out.println("4. Display Max Final Saldo");
            System.out.println("5. Sort Data Final Saldo (ASC)");
            System.out.println("6. Exit");
            System.out.print("Chose Menu(1-5): ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("== Data Norek ==");
                    service.tampilkanDataBankSaja();
                    break;
                case 2:
                    System.out.println("== Data Transaksi ==");
                    service.tampilkanDataTransaksi();
                    break;
                case 3:
                    System.out.print("Masukkan No HP yang dicari: ");
                    String noHp = sc.nextLine();
                    service.cariBerdasarkanNoHp();
                    break;
                case 4:
                    System.out.println("Data sebelum disortir:");
                    System.out.println("Data setelah disortir berdasarkan Debit/Kredit ASC:");
                    service.tampilkanFinalSaldoTerbesar();
                    break;
                case 5:
                    System.out.println("== Data Transaksi Sebelum Disorting ==");
                    service.tampilkanDataTransaksi();
            
                    System.out.println("\n== Sorting transaksi berdasarkan Final Saldo (ASC) karena bank mau tutup ==");
                    service.sortByFinalSaldoAsc();
                    service.tampilkanDataTransaksi();
                    break;
            }
        } while (pilihan != 6);
    }
}