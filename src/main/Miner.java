package main;

import Crypto.Crypto;

import java.util.ArrayList;

public class Miner {

    public static int hash, generated_hash, min, max;
    public static ArrayList<Integer> codes = new ArrayList<>();

    public static void main(String[] args){
        max = 50;
        min = 1;
        Crypto crypto = new Crypto(hash, generated_hash, min, max, codes);

        crypto.setHash();
        System.out.println("Return hash: " + crypto.get_Hash());
    }
}
