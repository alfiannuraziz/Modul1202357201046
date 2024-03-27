/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1202357201046;

public class nama_alamat_telepon {
    public static void main(String[] args) {
        String data [][]={
            {"NAMA","\t\tALAMAT","\t\tTELEPON"},
            {"ABDUL","\t\tKEDIRI","\t\t085646668991"},
            {"KUSNO","\t\tTRENGGALEK","\t\t085646668992"},
            {"PONIRAN","\t\tBOJONEGORO","\t\t085646668999"},
        };
         for (int a = 0; a < data.length; a++) {
            for(int b = 0; b < data[a].length; b++) {
                System.out.print(data[a][b] + " "); 
                }
                System.out.println();
            }
    }
}

