package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch(nilai){
            case 'A':
                System.out.println("Mhs    : \"Terima kasih pak\"");
                System.out.println("Dosen  : \"Selamat ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs    : \"Kenapa ulun kada dapat A ,pak ?\"");
                System.out.println("Dosen  : \"!@@#$%$%\"");
                break;
            case 'C':
                System.out.println("Mhs    : \"Ulun turun pul pak ae, tugas pul jua\"");
                System.out.println("Dosen  : \"Tapi bisalah menjawab ujian ?\"");
                System.out.println("Mhs    : \"Hhe bisa ae sadidikit\"");
                break;
            default:
                System.out.println("Mhs    : \"Ulun turun tarus mana tugas menggawi tarus\"");
                System.out.println("Dosen  : \"Bujur jua kah kam ne?\"");
                System.out.println("Dosen  : \"*mencek berkas nilai\"");
                System.out.println("Dosen  : \"*Tabincalak mata\"");
                System.out.println("Mhs    : \"Tajujuramba bukah\"");
                break;
        }
    }
}
