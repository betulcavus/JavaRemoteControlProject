package remotecontrol;

public class RemoteControlRunner {

    public static void main(String[] args) {

        Test tv = new Test(102.10,80.00,40.45);
        tv.gucDugmesi();//kumandayla tv'yi ac
        System.out.println(tv.kanalDegistirme(2));//45.23
        System.out.println(tv.sesAzaltma());//11
        System.out.println(tv.sesArtirma());//12
    }

}
