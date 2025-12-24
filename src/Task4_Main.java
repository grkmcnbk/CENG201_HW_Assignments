void main() {
    HospitalSystem hospitalSystem = new HospitalSystem();

    //menu();

    Patient patient1 = new Patient();
    patient1.id = 123456;
    patient1.severity = 7;
    patient1.age = 21;
    patient1.name = "Ally";

    Patient patient2 = new Patient();
    patient2.id = 234567;
    patient2.severity = 3;
    patient2.age = 35;
    patient2.name = "Micheal";

    Patient patient3 = new Patient();
    patient3.id = 345678;
    patient3.severity = 9;
    patient3.age = 28;
    patient3.name = "Steve";

    Patient patient4 = new Patient();
    patient4.id = 456789;
    patient4.severity = 4;
    patient4.age = 65;
    patient4.name = "Stan";

    Patient patient5 = new Patient();
    patient5.id = 567890;
    patient5.severity =8;
    patient5.age = 28;
    patient5.name = "Roger";

    Patient patient6 = new Patient();
    patient6.id = 678901;
    patient6.severity = 5;
    patient6.age = 14;
    patient6.name = "Mike";

    Patient patient7 = new Patient();
    patient7.id = 789012;
    patient7.severity = 1;
    patient7.age = 85;
    patient7.name = "Hermione";

    Patient patient8 = new Patient();
    patient8.id = 890123;
    patient8.severity = 2;
    patient8.age = 28;
    patient8.name = "Roger";

    Patient patient9 = new Patient();
    patient9.id = 901234;
    patient9.severity = 6;
    patient9.age = 17;
    patient9.name = "Harry";

    Patient patient10 = new Patient();
    patient10.id = 123459;
    patient10.severity = 8;
    patient10.age = 28;
    patient10.name = "Ron";

    hospitalSystem.patientList.addPatient(patient1);
    hospitalSystem.patientList.addPatient(patient2);
    hospitalSystem.patientList.addPatient(patient3);
    hospitalSystem.patientList.addPatient(patient4);
    hospitalSystem.patientList.addPatient(patient5);
    hospitalSystem.patientList.addPatient(patient6);
    hospitalSystem.patientList.addPatient(patient7);
    hospitalSystem.patientList.addPatient(patient8);
    hospitalSystem.patientList.addPatient(patient9);
    hospitalSystem.patientList.addPatient(patient10);

    System.out.println("Patient List is:");
    hospitalSystem.patientList.printList();


    TreatmentRequest treatmentRequest1 = new TreatmentRequest();
    TreatmentRequest treatmentRequest2 = new TreatmentRequest();
    TreatmentRequest treatmentRequest3 = new TreatmentRequest();
    TreatmentRequest treatmentRequest4 = new TreatmentRequest();
    TreatmentRequest treatmentRequest5 = new TreatmentRequest();
    TreatmentRequest treatmentRequest6 = new TreatmentRequest();
    TreatmentRequest treatmentRequest7 = new TreatmentRequest();
    TreatmentRequest treatmentRequest8 = new TreatmentRequest();

    treatmentRequest1.patient = patient1;
    treatmentRequest2.patient = patient2;
    treatmentRequest3.patient = patient3;
    treatmentRequest4.patient = patient4;
    treatmentRequest5.patient = patient5;
    treatmentRequest6.patient = patient6;
    treatmentRequest7.patient = patient7;
    treatmentRequest8.patient = patient8;

    treatmentRequest1.patientId = patient1.id;
    treatmentRequest2.patientId = patient2.id;
    treatmentRequest3.patientId = patient3.id;
    treatmentRequest4.patientId = patient4.id;
    treatmentRequest5.patientId = patient5.id;
    treatmentRequest6.patientId = patient6.id;
    treatmentRequest7.patientId = patient7.id;
    treatmentRequest8.patientId = patient8.id;

    hospitalSystem.enqueue(treatmentRequest1);
    hospitalSystem.enqueue(treatmentRequest2);
    hospitalSystem.enqueue(treatmentRequest3);
    hospitalSystem.enqueue(treatmentRequest4);
    hospitalSystem.enqueue(treatmentRequest5);
    hospitalSystem.enqueue(treatmentRequest6);
    hospitalSystem.enqueue(treatmentRequest7);
    hospitalSystem.enqueue(treatmentRequest8);
    System.out.println();

    System.out.println("Treatment Queue is:");
    hospitalSystem.printQueue();
    System.out.println();


    DischargeRecord dischargeRecord1 = new DischargeRecord();
    DischargeRecord dischargeRecord2 = new DischargeRecord();

    dischargeRecord1.patientId = 654321;
    dischargeRecord2.patientId = 321654;

    hospitalSystem.dischargeStack.push(dischargeRecord1);
    hospitalSystem.dischargeStack.push(dischargeRecord2);

    hospitalSystem.treatmentProcess();
    hospitalSystem.treatmentProcess();
    hospitalSystem.treatmentProcess();
    hospitalSystem.treatmentProcess();

    hospitalSystem.printCurrentState();
}

public void menu(){

    HospitalSystem hospitalSystem = new HospitalSystem();
    Scanner question = new Scanner(System.in);

    while (true) {
        System.out.println();
        System.out.println("Please select one of the following options.");
        System.out.println("1 for patient procedures");
        System.out.println("2 for treatment procedures");
        System.out.println("To initiate discharge procedures, please press 3.");
        System.out.println("Please press 0 to exit system.");
        System.out.println();
        int answer = question.nextInt();

        switch (answer) {
            case 1:
                System.out.println();
                System.out.println("Please select the action you wish to perform.");
                System.out.println("To add a patient 1.");
                System.out.println("To remove the patient 2");
                System.out.println("To find patients 3");
                System.out.println("To print the patient list please press 4");
                int patientControl = question.nextInt();
                switch (patientControl) {
                    case 1:

                        System.out.println("Please enter the ID of the patient you wish to add.   Ex:123456");
                        int answerID = question.nextInt();
                        System.out.println("Please enter the name of the patient you wish to add.   Ex:Mahmut");
                        String answerName = question.next();
                        System.out.println("Please enter the age of the patient you wish to add.   Ex:21");
                        int answerAge = question.nextInt();
                        System.out.println("Please enter the severity of the illness of the patient you wish to add using a number between 1 and 10.   ");
                        int answerSeverity = question.nextInt();

                        Patient patient = new Patient();
                        patient.id = answerID;
                        patient.age = answerAge;
                        patient.name = answerName;
                        patient.severity = answerSeverity;

                        hospitalSystem.addPatient(patient);
                        break;

                    case 2:
                        System.out.println("Please enter the ID of the patient you wish to remove.");
                        int removeID = question.nextInt();
                        hospitalSystem.patientList.removePatient(removeID);
                        System.out.println("The patient has been successfully removed.");
                        break;

                    case 3:
                        System.out.println("Please enter the ID of the patient you wish to find.");
                        int findID = question.nextInt();
                        hospitalSystem.patientList.findPatient(findID);
                        break;

                    case 4:
                        hospitalSystem.patientList.printList();
                        break;

                    default:
                        System.out.println("You entered an incorrect or incomplete keystroke. Please try again.");
                        break;
                }
                break;


            case 2:
                System.out.println();
                System.out.println("Please select the action you wish to perform.");
                System.out.println("To add a patient to the treatment queue 1");
                System.out.println("To remove a patient from the treatment queue 2");
                System.out.println("To print the treatment queue please press 3.");
                int treatmentAnswer = question.nextInt();
                switch (treatmentAnswer) {

                    case 1:
                        System.out.println("Please enter the ID of the patient you wish to add.   Ex:123456");
                        int treatmentID = question.nextInt();

                        Patient temp = hospitalSystem.patientList.head;
                        while (temp.id != treatmentID) {
                            temp = temp.next;
                        }
                        TreatmentRequest request = new TreatmentRequest();
                        request.patient = temp;
                        request.patientId = temp.id;

                       hospitalSystem.enqueue(request);
                       break;

                    case 2:
                        hospitalSystem.treatmentQueue.dequeue();
                        break;

                    case 3:
                        hospitalSystem.printQueue();
                        break;

                    default:
                        System.out.println("You entered an incorrect or incomplete keystroke. Please try again.");
                        break;
                }
                break;


            case 3:
                System.out.println();
                System.out.println("Please select the action you wish to perform.");
                System.out.println("To add a patient to the discharge list 1");
                System.out.println("To remove a patient from the discharge list 2");
                System.out.println("To print the top of the discharge list use 3");
                System.out.println("To print the discharge list please press 4 ");
                int dischargeAnswer = question.nextInt();
                switch (dischargeAnswer) {

                    case 1:
                        System.out.println("The first patient examined has been added to the discharge list.");
                        hospitalSystem.treatmentProcess();
                        break;

                    case 2:
                        hospitalSystem.dischargeStack.pop();
                        break;

                    case 3:
                        hospitalSystem.dischargeStack.peek();
                        break;

                    case 4:
                        hospitalSystem.dischargeStack.printStack();
                        break;

                    default:
                        System.out.println("You entered an incorrect or incomplete keystroke. Please try again.");
                        break;
                }
                break;


            case 0:
                System.out.println("Logging out of the system");
                return;


            default:
                System.out.println("You entered an incorrect or incomplete keystroke. Please try again.");
                break;
        }
    }
}
