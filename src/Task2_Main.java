void main() {
    TreatmentQueue queue = new TreatmentQueue();

    TreatmentRequest request1 = new TreatmentRequest();
    TreatmentRequest request2 = new TreatmentRequest();
    TreatmentRequest request3 = new TreatmentRequest();
    TreatmentRequest request4 = new TreatmentRequest();
    TreatmentRequest request5 = new TreatmentRequest();
    TreatmentRequest request6 = new TreatmentRequest();
    TreatmentRequest request7 = new TreatmentRequest();
    TreatmentRequest request8 = new TreatmentRequest();

    request1.patientId = 100181;
    request2.patientId = 256982;
    request3.patientId = 325647;
    request4.patientId = 435128;
    request5.patientId = 558201;
    request6.patientId = 679315;
    request7.patientId = 741369;
    request8.patientId = 852467;

    queue.enqueue(request1);
    queue.enqueue(request2);
    queue.enqueue(request3);
    queue.enqueue(request4);
    queue.enqueue(request5);
    queue.enqueue(request6);
    queue.enqueue(request7);
    queue.enqueue(request8);
    System.out.println();


    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    System.out.println();

    queue.printQueue();

    queue.size();
}