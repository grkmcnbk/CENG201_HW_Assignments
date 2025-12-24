import java.util.*;

public class HospitalSystem {
    public PatientList patientList;
    public DischargeStack dischargeStack;
    public TreatmentQueue treatmentQueue;
    public HashMap<Integer, Patient> patientHashMap;
    public TreatmentQueue priorityTreatmentQueue;


    HospitalSystem() {
        patientList = new PatientList();
        dischargeStack = new DischargeStack();
        treatmentQueue = new TreatmentQueue();
        priorityTreatmentQueue = new TreatmentQueue();
        patientHashMap = new HashMap<>();


    }

    // Add patient to list and map
    public void addPatient(Patient p) {
        patientList.addPatient(p);
        patientHashMap.put(p.id, p);
    }

    // Find patient by object
    public void findPatient(Patient patient) {
        patientHashMap.get(patient);
    }

    // Push patient discharge record and remove from treatment queue
    public void push(Patient p) {
        DischargeRecord dischargeRecord = new DischargeRecord();
        dischargeRecord.patientId = p.id;
        dischargeStack.push(dischargeRecord);
        treatmentQueue.dequeue();
    }

    // Check if patient requires priority treatment
    public boolean isPriority(TreatmentRequest request, Patient p) {
        if (p.severity > 5) {
            request.priority = true;
        } else {
            request.priority = false;
        }
        return request.priority;
    }

    // Add treatment request to correct queue
    public void enqueue(TreatmentRequest request) {
        if (isPriority(request, request.patient)) {
            priorityTreatmentQueue.enqueue(request);
        } else {
            treatmentQueue.enqueue(request);
        }
    }

    // Print both queues
    public void printQueue() {
        priorityTreatmentQueue.printQueue();
        treatmentQueue.printQueue();
    }

    // Print full system state
    public void printCurrentState() {
        System.out.println();
        System.out.println("Current system state is");
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println();

        System.out.println("Patient List is:");
        patientList.printList();


        System.out.println("Treatment Queue is:");
        priorityTreatmentQueue.printQueue();
        treatmentQueue.printQueue();
        System.out.println();
        System.out.println();

        System.out.println("Discharge Stack is:");
        dischargeStack.printStack();
        System.out.println();
    }

    // Process treatment: priority first, then normal
    public void treatmentProcess() {
        DischargeRecord dischargeRecord = new DischargeRecord();
        if (priorityTreatmentQueue.front != null) {
            dischargeRecord.patientId = priorityTreatmentQueue.front.patientId;
            priorityTreatmentQueue.dequeue();
            dischargeStack.push(dischargeRecord);
        } else {
            dischargeRecord.patientId = treatmentQueue.front.patientId;
            treatmentQueue.dequeue();
            dischargeStack.push(dischargeRecord);

        }
    }

    // Merge sort patients by severity
    public static Patient mergeSort(Patient head) {
        if(head == null || head.next == null) return head;

        Patient middle = getMiddle(head);
        Patient nextToMiddle = middle.next;
        middle.next = null;

        Patient left = mergeSort(head);
        Patient right = mergeSort(nextToMiddle);
        return sortedMerge(left, right);
    }

    // Merge two sorted patient lists
    private static Patient sortedMerge(Patient patient1, Patient patient2) {
        if (patient1 == null) return patient2;
        if (patient2 == null) return patient1;

        Patient result;
        if (patient1.severity > patient2.severity) { // big severity came first
            result = patient1;
            result.next = sortedMerge(patient1.next, patient2);
        } else {
            result = patient2;
            result.next = sortedMerge(patient1, patient2.next);
        }
        return result;
    }

    // Merge two sorted patient lists
    private static Patient getMiddle(Patient head) {
        if (head == null) return head;

        Patient slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}