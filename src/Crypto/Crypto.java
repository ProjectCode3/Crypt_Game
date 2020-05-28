package Crypto;

import java.util.ArrayList;
import java.util.Random;

public class Crypto {
    private int hashInt;
    private int generatedHash;
    private int min,max;
    private ArrayList<Integer> hashcodes = new ArrayList<>();

    public Crypto(int hashint, int generatedHash, int min, int max, ArrayList<Integer> hashcodes){
        this.hashInt = hashint;
        this.generatedHash = generatedHash;
        this.min = min;
        this.max = max;
        this.hashcodes = hashcodes;
    }

    public void setHash(){
        Random rand = new Random();
        for (int i=0; i <= 50; i++){
            this.hashInt = rand.nextInt((max - min) + 1);
            this.generatedHash = this.hashInt * 15;
            hashcodes.add(this.generatedHash);
            System.out.println(i + " " + this.generatedHash);
        }
    }

    public ArrayList<Integer> get_Hash(){
        return this.hashcodes;
    }


}
