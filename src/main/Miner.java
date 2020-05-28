package main;

import Crypto.Crypto;

import java.util.ArrayList;
import java.util.Random;

public class Miner {

    public int hash, generated_hash;
    public int min=1, max=50;
    public ArrayList<Integer> codes = new ArrayList<>();
    public boolean running = true;
    Crypto crypto = new Crypto(hash, generated_hash, min, max, codes);

    public void run(){
        while (running){
            crypto.setHash();
            generate_Hash();
        }
    }

    public void generate_Hash(){
        Random rand = new Random();
        for (int i=0; i<=50; i++){
            int gen_code = rand.nextInt((max-min) + 1);
            if (codes.contains(gen_code)){
                running = false;
                System.out.println("Generated Code Has Been Found");
            } else {
                running = true;
            }
        }
    }
}
