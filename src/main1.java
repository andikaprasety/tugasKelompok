


public class main1 {

        public static void main(String[] args) {

            String[] star = {"Sirius", "Rigel", "Capella"};

            String[] Tambah = new String[star.length + 1];
            System.arraycopy(star, 0, Tambah, 0, star.length);
            Tambah[Tambah.length - 1] = "Arcturus";
            star = Tambah;
            for (String s : star) {
                System.out.println(s);
            }

        }

}
