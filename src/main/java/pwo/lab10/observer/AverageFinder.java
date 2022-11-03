package pwo.lab10.observer;

import pwo.lab10.observer.Publisher.Subscriber;

public class AverageFinder implements Subscriber {

    double sum = 0;
    int valuesCounted = 0;

    @Override
    public void action(int x) {
        valuesCounted++;
        sum += x;
    }

    public double getAverage() {
        return sum / valuesCounted;
    }
}
