package org.example;

public class TV {
    private int maxResolusi;
    private Colokan colokan;

    public TV(int maxResolusi){
        this.maxResolusi = maxResolusi;

    }

    public int getResolution(){
        double bandwidthReal = colokan.getRealBandwidth();
        int result = 0;
        if (bandwidthReal >= 10 && bandwidthReal<=35){
            result = 480;
        }
        else if (bandwidthReal > 35 && bandwidthReal <= 100){
            result= 720;
        }
        else if (bandwidthReal>100){
            result = 1080;
        }

        if (maxResolusi < result){
            result = maxResolusi;
        }

        return result;

    }

    public void connect(Colokan colokan){
        this.colokan = colokan;
        System.out.println("Berhasil Connect ke - " + colokan.getMerk());
    }

}
