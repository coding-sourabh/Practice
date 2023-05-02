import Adaptee.WeighingMachine;
import Adaptee.WeighingMachineForBabies;
import Adapter.WeightMachineAdapter;
import Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String [] args) {
        // We are the client
        WeighingMachine weighingMachine = new WeighingMachineForBabies();
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(weighingMachine);
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}

/*
* Adapter design paatern
* Adapter design patten converts the interface of a class into another interface the client expects, basically
* it act as a intermediary and adapts according to the client request and accordingly modifies the existing interface
* */
