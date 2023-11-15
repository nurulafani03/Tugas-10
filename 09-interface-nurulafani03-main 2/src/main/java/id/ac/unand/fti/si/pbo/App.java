package id.ac.unand.fti.si.pbo;

public class App {
    
    public static void main(String[] args) {
        MemberPlatinum mplatinum = new MemberPlatinum();
        MemberGold mgold = new MemberGold();
        MemberSilver msilver = new MemberSilver();

        System.out.println("Total Pembayaran Platinum Rp" + mplatinum.hitungTotalBayar(35000000));
        System.out.println("Total Pembayaran Gold Rp" + mgold.hitungTotalBayar(35000000));
        System.out.println("Total Pembayaran Silver Rp" + msilver.hitungTotalBayar(35000000));

    }
    
}
