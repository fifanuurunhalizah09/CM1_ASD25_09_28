public class MainBank {
    public static void main(String[] args) {
        Bank b1 = new Bank("16030927", "Wallace", "Mei Mei", "082-458-264-3263", "wallace@gmail.com");
        Bank b2 = new Bank("16100617", "Darius", "Susanti", "081-357-843-0547", "darius@pt.org");
        Bank b3 = new Bank("16240401", "Fuller", "Rosalia", "085-556-712-7062", "fuller@gmail.com");
        Bank b4 = new Bank("16270525", "Maria", "Krabela", "082-267-223-0234", "maria@gmail.com");
        Bank b5 = new Bank("16101617", "Gery", "Fatimah", "083-683-416-8323", "gery@gery.com");

        Transaksi[] dataTransaksi = {
            new Transaksi("TR005", 500000, 200000, 700000, "2025-04-01", "Credit", b1),
            new Transaksi("TR004", 700000, 100000, 600000, "2025-04-02", "Debit", b2),
            new Transaksi("TR003", 300000, 150000, 450000, "2025-04-03", "Credit", b3),
            new Transaksi("TR002", 1000000, 300000, 1300000, "2025-04-04", "Credit", b1),
            new Transaksi("TR001", 200000, 50000, 250000, "2025-04-05", "Credit", b2)
        };

    }
}