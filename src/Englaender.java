import GLOOP.*;
public class Englaender extends Schneemann{
   private GLObjekt[] kopfbedeckung;

    public Englaender(double pX, double pZ){
        super(pX,pZ);
        kopfbedeckung = new GLObjekt[2];
        
        //Krempe
        kopfbedeckung[0] = new GLZylinder(0,200,20,  45,5);
        kopfbedeckung[0].drehe(-110,0,0,  0,200,0);
        kopfbedeckung[0].setzeMaterial(GLMaterial.GUMMI);
        kopfbedeckung[0].verschiebe(pX,0,pZ);

        //Melone
        kopfbedeckung[1] = new GLKugel(0,200,30,  30);
        kopfbedeckung[1].drehe(-110,0,0,  0,200,0);        
        kopfbedeckung[1].setzeMaterial(GLMaterial.GUMMI); 
        kopfbedeckung[1].verschiebe(pX,0,pZ);
    }
    
}
