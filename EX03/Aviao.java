/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luiza121021_02_03;

/**
 *
 * @author Nid
 */
public class Aviao {
    private int altitude = 0;
    private int velocidade = 0;
    // metodos
    // reduzir altitude e velocidade
    
    public Aviao(int altitude, int velocidade){
        this.altitude = altitude;
        this.velocidade = velocidade;
    }
    public int getAltitude() {
        return altitude;
    }

    public void changeAltitude(int var) {
        this.altitude += var;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void changeVelocidade(int var) {
        this.velocidade += var;
    }

}
