import GLOOP.*;
public class Schneemann{
    private GLKugel beine,bauch,kopf;
    private GLKugel auge1,auge2;
    private GLKegelstumpf nase;
    private GLZylinder krempe,zylinder;

    public Schneemann(double pX, double pZ){       
        beine  = new GLKugel (pX, 25,pZ,  75,"src/img/Schnee.jpg");
        bauch  = new GLKugel (pX,130,pZ,  55,"src/img/Schnee.jpg");
        kopf   = new GLKugel (pX,200,pZ,  35,"src/img/Schnee.jpg");

        auge1 = new GLKugel(0,200,35,  5);
        auge1.setzeFarbe(1,0,0); 
        auge1.drehe(-15,0,0,  0,200,0);
        auge1.drehe(0,-15,0,  0,200,0);
        auge1.verschiebe(pX,0,pZ);

        auge2 = new GLKugel(0,200,35,  5);
        auge2.setzeFarbe(1,0,0); 
        auge2.drehe(-15,0,0,  0,200,0);
        auge2.drehe( 0,15,0,  0,200,0);
        auge2.verschiebe(pX,0,pZ);

        nase = new GLKegelstumpf(0,200,50,  0,5,30);
        nase.setzeFarbe(1,0.5,0);
        nase.verschiebe(pX,0,pZ);
    }
   
}
