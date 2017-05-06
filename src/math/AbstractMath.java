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
public class AbstractMath implements MathInterface{

    @Override
    public double add(double x, double y) {
        return x + y;
    }

    @Override
    public double sub(double x, double y) {
        return x - y;
    }

    @Override
    public double mul(double x, double y) {
        return x*y;
    }

    @Override
    public double div(double x, double y) {
        return x/y;
    }

    @Override
    public double mod(double x, double y) {
        return x % y;
    }

    @Override
    public double reciprocol(double x) {
        return 1/x;
    }

    @Override
    public double[] add(double[] x, double[] y) {
        double[] d = new double[x.length];
        for (int i=0; i<d.length; i++) {
            d[i] = x[i] + y[i];
        }        
        return d;
    }

    @Override
    public double[] sub(double[] x, double[] y) {
        double[] d = new double[x.length];
        for (int i=0; i<d.length; i++) {
            d[i] = x[i] - y[i];
        }        
        return d;
    }

    @Override
    public double[] mul(double[] x, double[] y) {
        double[] d = new double[x.length];
        for (int i=0; i<d.length; i++) {
            d[i] = x[i] * y[i];
        }        
        return d;
    }

    @Override
    public double[] div(double[] x, double[] y) {
        double[] d = new double[x.length];
        for (int i=0; i<d.length; i++) {
            d[i] = x[i] / y[i];
        }        
        return d;
    }

    @Override
    public double[] mod(double[] x, double[] y) {
        double[] d = new double[x.length];
        for (int i=0; i<d.length; i++) {
            d[i] = x[i] % y[i];
        }        
        return d;
    }

    @Override
    public double[] reciprocol(double[] x) {
       double[] d = new double[x.length];
        for (int i=0; i<d.length; i++) {
            d[i] = 1.0/x[i];
        }        
        return d;
    }
    
}
