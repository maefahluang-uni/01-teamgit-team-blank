package util;

import java.util.StringTokenizer;

//This is an example (faulty) class to be used for A4 Task1 and Task2
public class Counter {
	public int _ctr;
	public int _multiplier;

	// method increments _ctr
	public void increment() {
		_ctr++; // faulty increment
	}

	// method decrements _ctr
	public void decrement() {
		_ctr++; // faulty decrement
	}

	// method resets _ctr
	public void reset() {
		_ctr = 1; // faulty reset, _ctr should rather be 0
	}

	// method multiplies _ctr by n
	public void multiplyBy(int multiplier) {
		_multiplier = multiplier; // no fault here
		_ctr = _ctr * _multiplier; // no fault here
	}

	// TODO: dev1- method for increment to closest even number
	public void incrementToEven() {
		if (_ctr % 2 != 0) {
            _ctr++;
        }
	}

	// TODO: dev1- method for decrement to closest even number
	public void decrementToEven() {
		if (_ctr % 2 != 0) {
            _ctr--;
        }

	// TODO: dev2- method for increment to closest prime number
	public void incrementToPrime() {
		_ctr = getNextPrime(_ctr);
	}

	// TODO: dev2- method for decrement to closest prime number
	public void decrementToPrime() {
		_ctr = getPreviousPrime(_ctr);
	}

	// TODO: dev3- count the frequency of word in sentence,
	// refactor source code from dev1 and dev2
	 public void countFrequency(String word, String sentence) {
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        int frequency = 0;

        while (tokenizer.hasMoreTokens()) {
            if (tokenizer.nextToken().equalsIgnoreCase(word)) {
                frequency++;
            }
        }

        _ctr = frequency;
    }

    // Helper method to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) {
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
        int nextNum = num + 1;
        while (!isPrime(nextNum)) {
            nextNum++;
        }
        return nextNum;
    }

    // Helper method to get the previous prime number
    private int getPreviousPrime(int num) {
        int prevNum = num - 1;
        while (!isPrime(prevNum)) {
            prevNum--;
        }
        return prevNum;
    }

}