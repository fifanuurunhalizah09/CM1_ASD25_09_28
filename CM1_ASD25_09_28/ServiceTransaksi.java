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
            System.out.printf("%-10s %-15s %-10.1f %-15.1f %-15.1f %-18s %-10s\n",
                transaksi.kodeTransaksi,
                transaksi.bankAcc.noRekening,
                transaksi.saldo,
                transaksi.inOutSaldo,
                transaksi.finalSaldo,
                transaksi.tanggalTransaksi,
                transaksi.type);
        }
    }
}
