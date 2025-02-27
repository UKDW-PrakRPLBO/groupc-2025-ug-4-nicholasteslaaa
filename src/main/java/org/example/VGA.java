package org.example;

public class VGA extends Colokan{
    public VGA(int harga, double promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }

    public double getRealBandwidth(){
        int hargaKabel = super.getHarga();
        double hargaPasar = 30000;
        double bandwidth = super.getPromisedBandwidth();
        double rasio = hargaKabel / hargaPasar;
        double result = 0;
        if (rasio < 1){
            result = bandwidth*rasio;
        }
        else {
            result = bandwidth;
        }

        return  result;
    }
}
