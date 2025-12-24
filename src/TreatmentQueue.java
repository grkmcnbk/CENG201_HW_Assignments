public class TreatmentQueue {
    TreatmentRequest front;
    TreatmentRequest rear;
    int count;

    TreatmentQueue(){
        front = null;
        rear = null;
        count = 0;
    }

    // Adds a new treatment request to the end of the queue
    public void enqueue(TreatmentRequest request){
        if (count ==0){
            front = request;
            rear = request;

            // Formats and prints the arrival time in HH:mm:ss format.
            System.out.println("The patient with ID "+ request.patientId+ " was added to the queue. Request time is; "+(((((request.arrivalTime)/1000)%(24*60*60))/3600)+3)%24+ ":"+(((((request.arrivalTime)/1000)%(24*60*60))%3600)/60)+':'+ ((((request.arrivalTime)/1000)%(24*60*60))%60));
            count++;
        } else {
            rear.next = request;
            rear = rear.next;
            System.out.println("The patient with ID "+ request.patientId+ " was added to the queue. Request time is; "+(((((request.arrivalTime)/1000)%(24*60*60))/3600)+3)%24+ ":"+(((((request.arrivalTime)/1000)%(24*60*60))%3600)/60)+':'+ ((((request.arrivalTime)/1000)%(24*60*60))%60));
            count++;
        }
    }

    // Removes the patient at the front of the queue
    public void dequeue(){
        if (count == 0){   // If count equal 0 then list is empty
            System.out.println("the queue is empty");
        } else {
            front = front.next;
            count--;
            System.out.println("dequeue operation successful.");
        }
    }

    // Traverses and prints all patient IDs currently in the queue
    public void printQueue(){
        TreatmentRequest temp = front;
        while(temp !=null){
            System.out.print("Patient id is:"+temp.patientId+ " <-- ");
            temp = temp.next;
        }


    }

    // Displays the current number of patients in the queue
    public void size(){
        if(count == 0){
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue size is; "+count);
        }
    }
}
