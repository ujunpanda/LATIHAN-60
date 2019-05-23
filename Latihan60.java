/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan60;

/**
 *
 * @author DADAR GULUNG JUMBO
 */
public class Latihan60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pain ws = new pain ();
        ws.setnamatokoh("pain");
        ws.setkekuatan("telekenesis");
        ws.setkatakatamutiara("ada satu hal yang telah dibuktikan oleh sejarah bahwa manusia adalah mahluk yang tidak bisa saling memahami");
        System.out.println("nama tokoh : "+ws.getnamatokoh());
        System.out.println("kekuatan :"+ws.getkekuatan());
        System.out.println("kata kata mutiara :"+ws.getkatakatamutiara());
        System.out.println("------------------------------------------------------------");
        deidara wr = new deidara ();
        wr.setnamatokoh("deidara");
        wr.setkekuatan1("tanah liat peledak");
        wr.setkatakatamutiara1("seni adalah ledakan");
        System.out.println("nama tokoh : "+wr.getnamatokoh());
        System.out.println("kekuatan :"+wr.getkekuatan1());
        System.out.println("kata kata mutiara :"+wr.getkatakatamutiara1());
        System.out.println("------------------------------------------------------------");
        itachi wu = new itachi ();
        wu.setnamatokoh("itachi");
        wu.setkekuatan2("saringgan");
        wu.setkatakatamutiara2("saat kau mengenal cinta, kau pun akan mengenal kebencian");
        System.out.println("nama tokoh : "+wu.getnamatokoh());
        System.out.println("kekuatan :"+wu.getkekuatan2());
        System.out.println("kata kata mutiara :"+wu.getkatakatamutiara2());
        System.out.println("------------------------------------------------------------");
        sasori wa = new sasori ();
        wa.setnamatokoh("sasori");
        wa.setkekuatan3("seni boneka");
        wa.setkatakatamutiara3("menunggu dan membuat orang lain menunggu adalah hal yang ku benci");
        System.out.println("nama tokoh : "+wa.getnamatokoh());
        System.out.println("kekuatan :"+wa.getkekuatan3());
        System.out.println("kata kata mutiara :"+wa.getkatakatamutiara3());
        System.out.println("------------------------------------------------------------");
    }
    
}
