public class TreatmentRequest {
    int patientId;
    long arrivalTime;
    TreatmentRequest next;
    boolean priority;
    Patient patient;


    TreatmentRequest(){     //Default constructor initializing a new request
        patientId =0;
        arrivalTime = System.currentTimeMillis();
        next = null;
        priority = false;
        patient = null;
    }

}
