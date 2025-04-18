
public class ServiceTransaksi {

    Transaksi[] daftarTransaksi;
    int jumlahData;

    public ServiceTransaksi(int kapasitas) {
        daftarTransaksi = new Transaksi[kapasitas];
        jumlahData = 0;
    }

    public void tambah(Transaksi transaksiBaru) {
        if (jumlahData < daftarTransaksi.length) {
            daftarTransaksi[jumlahData] = transaksiBaru;
            jumlahData++;
        } else {
            System.out.println("Data transaksi penuh!");
        }
    }

    public void tampilkanDataBankSaja() {
        System.out.println("== Data Norek ==");
        System.out.printf("%-15s %-10s %-15s %-20s %-25s\n",
                "No Rekening", "Nama", "Nama Ibu", "No HP", "Email");
    
        for (int i = 0; i < jumlahData; i++) {
            Bank bank = daftarTransaksi[i].bankAcc;
            System.out.printf("%-15s %-10s %-15s %-20s %-25s\n",
                    bank.noRekening, bank.nama, bank.namaIbu, bank.noHp, bank.email);
        }
    }

    public void tampilkanDataTransaksi() {
        System.out.printf("%-10s %-15s %-10s %-15s %-15s %-18s %-10s\n",
                "Kode", "No Rekening", "Saldo", "Debit/Kredit", "Final Saldo", "Tanggal Transaksi", "Type");
        for (int i = 0; i < jumlahData; i++) {
            Transaksi transaksi = daftarTransaksi[i];
            System.out.printf("%-10s", transaksi.kodeTransaksi);
            System.out.printf("%-15s", transaksi.bankAcc.noRekening);
            System.out.printf("%-10.1f", transaksi.saldo);
            System.out.printf("%-15.1f", transaksi.inOutSaldo);
            System.out.printf("%-15.1f", transaksi.finalSaldo);
            System.out.printf("%-18s", transaksi.tanggalTransaksi);
            System.out.printf("%-10s\n", transaksi.type);
        }
    }

    public void cariBerdasarkanNoHp(String noHpDicari) {
        boolean ditemukan = false;
        for (int i = 0; i < jumlahData; i++) {
            if (daftarTransaksi[i].bankAcc.noHp.equals(noHpDicari)) {
                System.out.println("Data ditemukan:");
                Transaksi transaksi = daftarTransaksi[i];
                System.out.println("Kode Transaksi      : " + transaksi.kodeTransaksi);
                System.out.println("NO Rekening         : " + transaksi.bankAcc.noRekening);
                System.out.println("Nama                : " + transaksi.bankAcc.nama);
                System.out.println("Saldo               : " + transaksi.saldo);
                System.out.println("Debit atau Kredit   : " + transaksi.inOutSaldo);
                System.out.println("Saldo Akhir         : " + transaksi.finalSaldo);
                System.out.println("Tanggal Transaksi   : " + transaksi.tanggalTransaksi);
                System.out.println("Type                : " + transaksi.type);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data tidak ditemukan untuk No HP: " + noHpDicari);
        }
    }

    public void tampilkanFinalSaldoTerbesar() {
        if (jumlahData == 0) {
            System.out.println("Belum ada transaksi.");
            return;
        }

        double nilaiTertinggi = daftarTransaksi[0].finalSaldo;
        int indeksTertinggi = 0;
        for (int i = 1; i < jumlahData; i++) {
            if (daftarTransaksi[i].finalSaldo > nilaiTertinggi) {
                nilaiTertinggi = daftarTransaksi[i].finalSaldo;
                indeksTertinggi = i;
            }
        }

        Transaksi transaksiTerbesar = daftarTransaksi[indeksTertinggi];
        System.out.println("Transaksi dengan final saldo terbesar:");
        System.out.println("Kode Transaksi     : " + transaksiTerbesar.kodeTransaksi);
        System.out.println("No Rekening        : " + transaksiTerbesar.bankAcc.noRekening);
        System.out.println("Nama               : " + transaksiTerbesar.bankAcc.nama);
        System.out.println("Saldo              : " + transaksiTerbesar.saldo);
        System.out.println("Debit/Kredit       : " + transaksiTerbesar.inOutSaldo);
        System.out.println("Saldo Akhir        : " + transaksiTerbesar.finalSaldo);
        System.out.println("Tanggal Transaksi  : " + transaksiTerbesar.tanggalTransaksi);
        System.out.println("Type               : " + transaksiTerbesar.type);
    }

    public void sortByFinalSaldoAsc() {
        for (int i = 0; i < jumlahData - 1; i++) {
            for (int j = 0; j < jumlahData - i - 1; j++) {
                if (daftarTransaksi[j].finalSaldo > daftarTransaksi[j + 1].finalSaldo) {
                    Transaksi temp = daftarTransaksi[j];
                    daftarTransaksi[j] = daftarTransaksi[j + 1];
                    daftarTransaksi[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil disorting berdasarkan final saldo (ASC).");
    }
}
