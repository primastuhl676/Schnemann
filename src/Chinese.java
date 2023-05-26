import GLOOP.*;
public class Chinese extends Schneemann{
    private GLObjekt[] kopfbedeckung;

    public Chinese(double pX, double pZ){
        super(pX,pZ);
        kopfbedeckung = new GLObjekt[2];
        
        //Krempe
        kopfbedeckung[0] = new GLZylinder(0,200,20,  70,5);
        kopfbedeckung[0].drehe(-110,0,0,  0,200,0);
        kopfbedeckung[0].setzeFarbe(1,1,0.6);
        kopfbedeckung[0].verschiebe(pX,0,pZ);

        //Hutmitte
        kopfbedeckung[1] = new GLKugel(0,200,30,  30);
        kopfbedeckung[1].drehe(-110,0,0,  0,200,0);        
        kopfbedeckung[1].setzeFarbe(1,1,0.6);
        kopfbedeckung[1].verschiebe(pX,0,pZ);

    }

}
