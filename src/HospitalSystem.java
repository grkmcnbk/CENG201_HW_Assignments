import java.util.HashMap;

public class HospitalSystem1 {
    public PatientList patientList;
    public DischargeStack dischargeStack;
    public TreatmentQueue treatmentQueue;
    public HashMap<Integer, Patient> patientHashMap;
    public TreatmentQueue priorityTreatmentQueue;


    HospitalSystem1(){
        patientList = new PatientList();
        dischargeStack = new DischargeStack();
        treatmentQueue = new TreatmentQueue();
        priorityTreatmentQueue = new TreatmentQueue();
        patientHashMap = new HashMap<>();
    }
    public void addPatient(Patient p) {
        patientList.addPatient(p);
        patientHashMap.put(10,p);
    }
    public void findPatient(Patient patient){
        patientHashMap.get(patient);
    }

    public void push(Patient p){
        DischargeRecord dischargeRecord = new DischargeRecord();
        dischargeRecord.patientId = p.id;
        dischargeStack.push(dischargeRecord);
        treatmentQueue.dequeue();
    }


    public boolean isPriority(TreatmentRequest request ,Patient p){
        if (p.severity > 5){
            request.priority = true;
        } else {
            request.priority = false;
        }
        return request.priority;
    }


    public void enqueue(TreatmentRequest request){
        if (isPriority(request, request.patient)){
            priorityTreatmentQueue.enqueue(request);
        }else {
            treatmentQueue.enqueue(request);
        }
    }


    public void printQueue(){
        priorityTreatmentQueue.printQueue();
        treatmentQueue.printQueue();
    }


    public void printCurrentState(){
        System.out.println();
        System.out.println("Current system state is");
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println();

        System.out.println("Patient List is");
        patientList.printList();


        System.out.println("Treatment Queue is");
        priorityTreatmentQueue.printQueue();
        treatmentQueue.printQueue();
        System.out.println();
        System.out.println();

        System.out.println("Discharge Stack is");
        dischargeStack.printStack();
        System.out.println();
    }

    public void treatmentProcess(){
        DischargeRecord dischargeRecord = new DischargeRecord();
        if (priorityTreatmentQueue.front != null){
            dischargeRecord.patientId = priorityTreatmentQueue.front.patientId;
            priorityTreatmentQueue.dequeue();
            dischargeStack.push(dischargeRecord);
        } else {
            dischargeRecord.patientId = treatmentQueue.front.patientId;
            treatmentQueue.dequeue();
            dischargeStack.push(dischargeRecord);

        }
    }




}


