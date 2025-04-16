public class Transaksi {
    String kodeTransaksi;
    double saldo;
    double inOutSaldo;
    double finalSaldo;
    String tanggalTransaksi;
    String type;
    Bank bankAcc;
    
    Transaksi(String kodeTransaksi, double saldo, double inOutSaldo, double finalSaldo, String tanggalTransaksi, String type, Bank bankAcc){
        this.kodeTransaksi = kodeTransaksi;
        this.saldo = saldo;
        this.inOutSaldo = inOutSaldo;
        this.finalSaldo = finalSaldo;
        this.tanggalTransaksi = tanggalTransaksi;
        this.type = type;
        this.bankAcc = bankAcc;
    }
    
    void tampilDataTransaksi(){
        System.out.println("Kode Transaksi        :" + kodeTransaksi);
        System.out.println("Saldo                 :" + saldo);
        System.out.println("inOutSaldo            :" + inOutSaldo);
        System.out.println("Final Saldo           :" + finalSaldo);
        System.out.println("Tanggal Transaksi     :" + tanggalTransaksi);
        System.out.println("Type                  :" + type);
            System.out.println("Bank Account      : " + bankAcc);
        }
    }
