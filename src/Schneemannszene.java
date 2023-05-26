import GLOOP.*;
public class Schneemannszene {
    private GLKamera kamera;
    private GLLicht  licht;  
    private GLHimmel himmel;
    private GLBoden  boden;

    private Schneemann schneemann;;

    public Schneemannszene(){
        kamera = new GLSchwenkkamera(800,600);
        kamera.setzePosition(-600,400,800);
        licht  = new GLLicht();  
        boden  = new GLBoden("src/img/Schnee.jpg");
        himmel = new GLHimmel("src/img/Himmel.jpg");

        schneemann = new Schneemann(0,0);
        
    }
}
