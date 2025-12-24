void main() {
    DischargeRecord discharged1 = new DischargeRecord();
    DischargeRecord discharged2 = new DischargeRecord();
    DischargeRecord discharged3 = new DischargeRecord();
    DischargeRecord discharged4 = new DischargeRecord();
    DischargeRecord discharged5 = new DischargeRecord();


    DischargeStack dischargeStack = new DischargeStack();

    discharged1.patientId = 125842;
    discharged2.patientId = 268741;
    discharged3.patientId = 398475;
    discharged4.patientId = 478921;
    discharged5.patientId = 568942;

    dischargeStack.push(discharged1);
    dischargeStack.push(discharged2);
    dischargeStack.push(discharged3);
    dischargeStack.push(discharged4);
    dischargeStack.push(discharged5);
    System.out.println();

    dischargeStack.pop();
    dischargeStack.pop();

    dischargeStack.peek();

    dischargeStack.printStack();

}