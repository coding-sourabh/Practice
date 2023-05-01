package DesignATM;

import DesignATM.ATMStates.ATMState;
import DesignATM.ATMStates.IdleState;

public class ATM {
    private static ATM atmObject = new ATM();  // Singleton: eager initialization
    private ATMState atmState;
    private Integer atmBalance;
    private Integer noOfTwoThousandNote;
    private Integer noOfFiveHundredNote;
    private Integer noOFHundredNote;

    private ATM() {
    }

    public static ATM getATMObject() {
        atmObject.setAtmState(new IdleState());
        return atmObject;
    }

    public ATMState getAtmState() {
        return atmState;
    }

    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
    }

    public static ATM getAtmObject() {
        return atmObject;
    }

    public static void setAtmObject(ATM atmObject) {
        atmObject = atmObject;
    }

    public Integer getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(Integer atmBalance, int twoKNote, int fiveHundredNote, int oneHundredNote) {
        this.atmBalance = atmBalance;
        this.noOfTwoThousandNote = twoKNote;
        this.noOfFiveHundredNote = fiveHundredNote;
        this.noOFHundredNote = oneHundredNote;
    }

    public Integer getNoOfTwoThousandNote() {
        return noOfTwoThousandNote;
    }

    public void setNoOfTwoThousandNote(Integer noOfTwoThousandNote) {
        this.noOfTwoThousandNote = noOfTwoThousandNote;
    }

    public Integer getNoOfFiveHundredNote() {
        return noOfFiveHundredNote;
    }

    public void setNoOfFiveHundredNote(Integer noOfFiveHundredNote) {
        this.noOfFiveHundredNote = noOfFiveHundredNote;
    }

    public Integer getNoOFHundredNote() {
        return noOFHundredNote;
    }

    public void setNoOFHundredNote(Integer noOFHundredNote) {
        this.noOFHundredNote = noOFHundredNote;
    }
}
