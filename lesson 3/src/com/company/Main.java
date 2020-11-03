package com.company;

public class Main {

    public static void main(String[] args) {
        SequentialRandom sr = new SequentialRandom();
        System.out.println(sr.getMyint());
        SequentialRandom sr1 = new SequentialRandom();
        System.out.println(sr1.getMyint());
        SequentialRandom sr2 = new SequentialRandom();
        System.out.println(sr2.getMyint());
        SequentialRandom.resetRandom();
        SequentialRandom sr3 = new SequentialRandom();
        System.out.println(sr3.getMyint());
        SequentialRandom sr4 = new SequentialRandom();
        System.out.println(sr4.getMyint());
        SequentialRandom sr5 = new SequentialRandom();
        System.out.println(sr5.getMyint());
    }
}
