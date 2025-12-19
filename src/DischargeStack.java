public class DischargeStack {
    DischargeRecord head;

    DischargeStack(){head = null;}  // Constructor to initialize an empty stack

    public void push(DischargeRecord record){   // Adds a new discharge record to the top of the stack
        if (head == null){
            head = record;
        } else {
            record.next = head;
            head = record;
        }
        // Prints patient ID and formatted discharge time (HH:mm:ss)
        System.out.println("patient with "+record.patientId+" ID discharge, discharge time is;"+(((((record.dischargeTime)/1000)%(24*60*60))/3600)+3)%24+ ":"+(((((record.dischargeTime)/1000)%(24*60*60))%3600)/60)+':'+ ((((record.dischargeTime)/1000)%(24*60*60))%60));
    }


    public void pop(){    // Removes the top record from the stack
        if (head == null){
            System.out.println("Stack is empty");
        } else {
            head = head.next;
            System.out.println("The patient was successfully removed new top patient ID is: " + head.patientId);
        }
        System.out.println();
    }


    public void peek(){      // Displays the top record without removing it
        if (head == null){
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top patient ID is: "+head.patientId);
        }
        System.out.println();
    }


    public void printStack(){   // Traverses and prints all records in the stack
        DischargeRecord temp = new DischargeRecord();
        temp = head;   // Start from the head
        while (temp != null){
            System.out.print("Discharge patient ID is:"+  temp.patientId+" discharge time is;"+(((((temp.dischargeTime)/1000)%(24*60*60))/3600)+3)%24+ ":"+(((((temp.dischargeTime)/1000)%(24*60*60))%3600)/60)+':'+ ((((temp.dischargeTime)/1000)%(24*60*60))%60)+" --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
