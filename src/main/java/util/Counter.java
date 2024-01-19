package util;

import java.util.StringTokenizer;

public class Counter {
    public int _ctr;
    public int _multiplier;

    // method increments _ctr
    public void increment() {
        _ctr++;
    }

    // method decrements _ctr
    public void decrement() {
        _ctr--;
    }

    // method resets _ctr
    public void reset() {
        _ctr = 0;
    }

    // method multiplies _ctr by n
    public void multiplyBy(int multiplier) {
        _multiplier = multiplier;
        _ctr = _ctr * _multiplier;
    }

    // method for increment to closest even number
    public void incrementToEven() {
        _ctr += (_ctr % 2 == 0) ? 2 : 1;
    }

    // method for decrement to closest even number
    public void decrementToEven() {
        _ctr -= (_ctr % 2 == 0) ? 2 : 1;
    }

    // method for increment to closest prime number
    public void incrementToPrime() {
        _ctr = getNextPrime(_ctr);
    }

    // method for decrement to closest prime number
    public void decrementToPrime() {
        _ctr = getPreviousPrime(_ctr);
    }

    // count the frequency of word in sentence
    public void countFrequency(String word, String sentence) {
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        int frequency = 0;

        while (tokenizer.hasMoreTokens()) {
            if (tokenizer.nextToken().equals(word)) {
                frequency++;
            }
        }

        _ctr = frequency;
    }

    // Helper method to check if a number is prime
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Helper method to get the next prime number
    private int getNextPrime(int num) {
        int next = num + 1;
        while (!isPrime(next)) {
            next++;
        }
        return next;
    }

    // Helper method to get the previous prime number
    private int getPreviousPrime(int num) {
        int previous = num - 1;
        while (!isPrime(previous)) {
            previous--;
        }
        return previous;
    }
}
