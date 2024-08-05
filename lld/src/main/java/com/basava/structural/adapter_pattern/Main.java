package com.basava.structural.adapter_pattern;

import com.basava.structural.adapter_pattern.adaptee.WeightMachineForBabies;
import com.basava.structural.adapter_pattern.adapter.WeightMachineAdapter;
import com.basava.structural.adapter_pattern.adapter.WeightMachineAdapterImpl;


public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
