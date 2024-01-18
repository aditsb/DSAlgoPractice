package com.dsalgo.practice.array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ComplexCalculation {

    public BigInteger calculateResult(BigInteger base1, BigInteger power1, BigInteger base2, BigInteger power2) throws InterruptedException {
        BigInteger result=BigInteger.ZERO;
        /*
            Calculate result = ( base1 ^ power1 ) + (base2 ^ power2).
            Where each calculation in (..) is calculated on a different thread
        */
        List<PowerCalculatingThread> powerCalculatingThreads=new ArrayList<>();
        powerCalculatingThreads.add(new PowerCalculatingThread(base1,power1));
        powerCalculatingThreads.add(new PowerCalculatingThread(base2,power2));

       for(PowerCalculatingThread powerCalculatingThread:powerCalculatingThreads ) {
           powerCalculatingThread.run();
           powerCalculatingThread.join();
           result = result.add(powerCalculatingThread.getResult());
       }
        return result;
    }

    private static class PowerCalculatingThread extends Thread {
        private BigInteger result = BigInteger.ONE;
        private BigInteger base;
        private BigInteger power;

        public PowerCalculatingThread(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {
            BigInteger i=BigInteger.ONE;
            for(;i.compareTo(power)!=0;i.add(i))
           result=result.multiply(base);
        }

        public BigInteger getResult() { return result; }
    }
}