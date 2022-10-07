/*
 * Created by 21343014_Resti Apriliyanti
 */

import javax.swing.JOptionPane;

public class Tugas2_NomorTerbesar {
    public static void main(String[]args) {
        int[] a = new int[11];
        String[] input = new String[11];
        int terbesar = 0;

        for(int i=1;i+1<=a.length;i++) {
            System.out.println(i); 
            input[i] = JOptionPane.showInputDialog("Masukkan angka ke-"+i+" :");
            a[i] = Integer.parseInt(input[i]);

            if(terbesar>a[i]) {
                if(terbesar>a[i]) {
                    terbesar=terbesar;
                System.out.println(terbesar); 
                }
            }

            else {
                if(a[i]>a[i-1]) {
                    terbesar=a[i];
                }
                else {
                    terbesar=a[i-1];
                }
                System.out.println(terbesar);
            }

        }
        String hasil="Nomor Terbesar Adalah "+terbesar;
        JOptionPane.showMessageDialog(null,hasil);           
    }
}
