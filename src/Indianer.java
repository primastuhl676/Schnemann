import GLOOP.*;
public class Indianer extends Schneemann{
    private GLObjekt[] kopfbedeckung;

    public Indianer(double pX, double pZ){
        super(pX,pZ);
        kopfbedeckung = new GLObjekt[2];
        
        //Stirnband
        kopfbedeckung[0] = new GLTorus(0,220,0, 30,5);
        kopfbedeckung[0].drehe(90,0,0);
        kopfbedeckung[0].verschiebe(pX,0,pZ);
        
        //Feder
        kopfbedeckung[1] = new GLKugel(0,240,-30, 30);
        kopfbedeckung[1].skaliere(0.2,1,0.1);
        kopfbedeckung[1].setzeFarbe(1,0,0);
        kopfbedeckung[1].verschiebe(pX,0,pZ);       
    }
    
}
