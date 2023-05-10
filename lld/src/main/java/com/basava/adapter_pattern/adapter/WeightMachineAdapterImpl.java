package com.basava.adapter_pattern.adapter;

import com.basava.adapter_pattern.adaptee.Weight;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
    Weight weightMachine;

    public WeightMachineAdapterImpl(Weight weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {

        double weightInPound = weightMachine.getWeightInPounds();

        //Convert it to KGs
        return weightInPound * .45;
    }
}

