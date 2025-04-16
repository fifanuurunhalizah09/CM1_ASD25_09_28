public class Bank {

    String noRekening;
           String nama;
           String namaIbu;
           String noHp;
           String email;
   
       public Bank (){
       }
       Bank(String nm, String nmIb, String nHp, String mail){
           this.nama = nama;
           this.namaIbu = namaIbu;
           this.noHp = noHp;
           this.email = email;
       }
       void tampilDataNorek(){
           System.out.println("Nama: " + nama);
           System.out.println("Nama Ibu: " + namaIbu);
           System.out.println("Nomor HP: " + noHp);
           System.out.println("Email: " + email);
       }
   }
       
   