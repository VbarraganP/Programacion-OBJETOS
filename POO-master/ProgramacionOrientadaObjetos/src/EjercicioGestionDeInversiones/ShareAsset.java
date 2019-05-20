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
public class ShareAsset implements Asset {
    protected String symbol;
    protected  int totalCost;
    protected int currentPrice;

    @Override
    public double getProfit() {
       return 0;
    }

    @Override
    public double getMarketValue() {
       return 0;
    }
    
}
