package DesignATM;

import DesignATM.ATMStates.ATMState;

public class ATM {
    private static ATM atmObject = new ATM();
    private ATMState atmState;
    private Integer atmBalance;
    private Integer noOfTwoThousandNote;
    private Integer noOfFiveHundredNote;
    private Integer noOFHundredNote;

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
        ATM.atmObject = atmObject;
    }

    public Integer getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(Integer atmBalance) {
        this.atmBalance = atmBalance;
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

    public void currentATM
}
