package main;

import Crypto.Crypto;

import java.util.ArrayList;

public class Miner {

    public int hash, generated_hash;
    public int min=1, max=50;
    public ArrayList<Integer> codes = new ArrayList<>();
    public boolean running = true;
    Crypto crypto = new Crypto(hash, generated_hash, min, max, codes);

    public void run(){
        while (running){
            crypto.setHash();
        }
    }
}
