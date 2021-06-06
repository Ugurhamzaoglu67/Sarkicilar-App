import com.muzikprojects.Model.DataSource;
import com.muzikprojects.Sarkici;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        DataSource dataSource = new DataSource();
        dataSource.veriTabaniBaglantiAc();



        ArrayList<Sarkici>  allSinger = dataSource.tumSarkicilariGoster(DataSource.ARTAN_SIRADA);


        if(allSinger == null){
            System.out.println("Veri Tabanında hiç bir bilgi yok!");
        }

        for(Sarkici s : allSinger){
            System.out.println(s.getSarkiciId() + " : "+s.getSarkiciAdi());
        }

        dataSource.veriTabaniBaglantisiniKapat();


        /*# Mantık ŞU ŞEKİLDE :
            1- ÖNCELİKLE BÜTÜN VERİYİ VERİ TABANINDAN ALIYORUZ.

            2- BELLEKTE YAPILARIMA YANİ ArrayList<> 'ler gibi YAPILARIMA ATIYORUM.

            3- SONRA ONLARI KULLANIYORUM.

         */


    }
}
