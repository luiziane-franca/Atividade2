/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luiza121021_02_03;

public class Luiza121021_02_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aviao latamAirplane = new Aviao(10, 900);
        int alt = latamAirplane.getAltitude();
        int vel = latamAirplane.getVelocidade();
        System.out.printf("Latam airplane está há uma altitude de %d Km\n"
                + "acima do nivel do mar e está há %d Km/h.\n", alt, vel);
        
        latamAirplane.changeAltitude(-1);
        latamAirplane.changeVelocidade(-100);
        alt = latamAirplane.getAltitude();
        vel = latamAirplane.getVelocidade();
        System.out.printf("Latam airplane está há uma altitude de %d Km\n"
                + "acima do nivel do mar e está há %d Km/h.", alt, vel);
    }
    
}
