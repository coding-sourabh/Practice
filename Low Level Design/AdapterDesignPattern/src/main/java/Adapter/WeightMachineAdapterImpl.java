package Adapter;

import Adaptee.WeighingMachine;

public class WeightMachineAdapterImpl implements  WeightMachineAdapter {
    private WeighingMachine weighingMachine;

    public WeightMachineAdapterImpl(WeighingMachine weighingMachine) {
        this.weighingMachine = weighingMachine;
    }

    @Override
    public double getWeightInKg() {
        double weightInPound = weighingMachine.getWeightInPounds();
        double weightInKg = weightInPound * 0.45;
        return weightInKg;
    }
}
