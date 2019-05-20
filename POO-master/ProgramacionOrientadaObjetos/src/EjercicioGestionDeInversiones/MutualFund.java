/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioGestionDeInversiones;

/**
 *
 * @author vbarraganp
 */
public class MutualFund extends ShareAsset {
    private double totalShares;
    
    @Override
    public double getMarketValue(){
        return (this.totalShares*(double)this.currentPrice);
    }
}
