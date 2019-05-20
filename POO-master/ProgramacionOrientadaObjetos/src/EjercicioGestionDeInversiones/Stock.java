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
public class Stock extends ShareAsset {
    protected int totalShares;
    
    
    @Override
    public double getMarketValue(){
        return ((double)this.totalShares*(double)this.currentPrice);
    }
    public double getProfit(){
        return ((this.totalShares)*(this.currentPrice))-(this.totalCost);
    }
}
