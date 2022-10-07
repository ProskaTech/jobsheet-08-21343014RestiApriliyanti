/*
 * Created by 21343014_Resti Apriliyanti
 */

public class Tugas3_BukuAlamat {
    public static void main(String[] args) {
        String alamat[][] = {{"Florence", "735-1234", "Manila"}, 
                             {"Joyce", "983-3333", "Quezon City"},
                             {"Becca", "456-3322", "Manila"}
                            };
       for(int i = 0; i < 3; i++){
       System.out.println("name    : " + alamat[i][0] );
       System.out.println("Tel. #  : " + alamat[i][1] );
       System.out.println("Address : " + alamat[i][2] );
       System.out.println(" ");
       }
    }
}
