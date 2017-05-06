/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

/**
 *
 * @author Melchizo
 */
public interface MathInterface {
    double add(double x, double y);
    double sub(double x, double y);
    double mul(double x, double y);
    double div(double x, double y);
    double mod(double x, double y);
    double reciprocol(double x);
    
    double[] add(double[] x, double[] y);
    double[] sub(double[] x, double[] y);
    double[] mul(double[] x, double[] y);
    double[] div(double[] x, double[] y);
    double[] mod(double[] x, double[] y);
    
    double[] reciprocol(double[] x);
}
