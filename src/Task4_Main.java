void main() {
    HospitalSystem1 hospitalSystem1= new HospitalSystem1();

    menu();

    //7 9 8 6 8 3 4 5 1 2
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

    hospitalSystem1.patientList.addPatient(patient1);
    hospitalSystem1.patientList.addPatient(patient2);
    hospitalSystem1.patientList.addPatient(patient3);
    hospitalSystem1.patientList.addPatient(patient4);
    hospitalSystem1.patientList.addPatient(patient5);
    hospitalSystem1.patientList.addPatient(patient6);
    hospitalSystem1.patientList.addPatient(patient7);
    hospitalSystem1.patientList.addPatient(patient8);
    hospitalSystem1.patientList.addPatient(patient9);
    hospitalSystem1.patientList.addPatient(patient10);

    System.out.println("Patient List is:");
    hospitalSystem1.patientList.printList();

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




    hospitalSystem1.enqueue(treatmentRequest1);
    hospitalSystem1.enqueue(treatmentRequest2);
    hospitalSystem1.enqueue(treatmentRequest3);
    hospitalSystem1.enqueue(treatmentRequest4);
    hospitalSystem1.enqueue(treatmentRequest5);
    hospitalSystem1.enqueue(treatmentRequest6);
    hospitalSystem1.enqueue(treatmentRequest7);
    hospitalSystem1.enqueue(treatmentRequest8);
    System.out.println();

    System.out.println("Treatment Queue is:");
    hospitalSystem1.printQueue();
    System.out.println();

    DischargeRecord dischargeRecord1 = new DischargeRecord();
    DischargeRecord dischargeRecord2 = new DischargeRecord();

    dischargeRecord1.patientId = 654321;
    dischargeRecord2.patientId = 321654;

    hospitalSystem1.dischargeStack.push(dischargeRecord1);
    hospitalSystem1.dischargeStack.push(dischargeRecord2);

    hospitalSystem1.treatmentProcess();
    hospitalSystem1.treatmentProcess();
    hospitalSystem1.treatmentProcess();
    hospitalSystem1.treatmentProcess();

    hospitalSystem1.printCurrentState();
}

public void menu(){

    HospitalSystem1 hospitalSystem1 = new HospitalSystem1();


    Scanner question = new Scanner(System.in);


    while (true) {
        System.out.println();
        System.out.println("Lütfen aşağıdaki işlemlerden birini seçiniz");
        System.out.println("Hasta işlemleri için 1");
        System.out.println("Tedavi işlemleri için 2");
        System.out.println("Taburcu işlemleri için lütfen 3'ü tuşlayınız");
        System.out.println("Çıkış yapmak için lütfen 0'ı tuşlayınız");
        System.out.println();

        int answer = question.nextInt();

        switch (answer) {
            case 1:
                System.out.println();
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
                System.out.println("Hasta eklemek için 1'i ");
                System.out.println("Hasta çıkarmak için 2'yi ");
                System.out.println("Hasta bulmak için 3'ü ");
                System.out.println("Hasta listesini yazdırmak için lütfen 4'ü tuşlayınız ");
                int patientControl = question.nextInt();
                switch (patientControl) {
                    case 1:

                        System.out.println("Lütfen eklemek istediğiniz hastanın ID'sini giriniz   Ex:123456");
                        int answerID = question.nextInt();
                        System.out.println("Lütfen eklemek istediğiniz hastanın ismini giriniz   Ex:Mahmut");
                        String answerName = question.next();
                        System.out.println("Lütfen eklemek istediğiniz hastanın yaşını giriniz   Ex:21");
                        int answerAge = question.nextInt();
                        System.out.println("Lütfen eklemek istediğiniz hastanın hastalık derecesini 1 ila 10 arasında bir sayı ile giriniz   ");
                        int answerSeverity = question.nextInt();



                        Patient patient = new Patient();
                        patient.id = answerID;
                        patient.age = answerAge;
                        patient.name = answerName;
                        patient.severity = answerSeverity;

                        hospitalSystem1.addPatient(patient);
                        break;

                    case 2:
                        System.out.println("Lütfen çıkarmak istediğiniz hastanın ID'sini giriniz");
                        int removeID = question.nextInt();
                        hospitalSystem1.patientList.removePatient(removeID);
                        System.out.println("Hasta başarıyla silindi");
                        break;

                    case 3:
                        System.out.println("Lütfen bulmak istediğiniz hastanın ID'sini giriniz");
                        int findID = question.nextInt();
                        hospitalSystem1.patientList.findPatient(findID);
                        break;

                    case 4:
                        hospitalSystem1.patientList.printList();
                        break;


                    default:
                        System.out.println("Hatalı veya eksik bir tuşlama yaptınız lütfen tekrar deneyiniz");
                        break;
                }
                break;


            case 2:
                System.out.println();
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
                System.out.println("Tedavi sırasına hasta eklemek için 1'i");
                System.out.println("Tedavi sırasından hasta çıkarmak için 2'yi");
                System.out.println("Tedavi sırasını yazdırmak için 3'ü");
                int treatmentAnswer = question.nextInt();
                switch (treatmentAnswer) {
                    case 1:
                        System.out.println("Lütfen eklemek istediğiniz hastanın ID'sini giriniz   Ex:123456");
                        int treatmentID = question.nextInt();

                        Patient temp = hospitalSystem1.patientList.head;
                        while (temp.id != treatmentID) {
                            temp = temp.next;
                        }
                        TreatmentRequest request = new TreatmentRequest();
                        request.patient = temp;
                        request.patientId = temp.id;

                       hospitalSystem1.enqueue(request);
                       break;

                    case 2:
                        hospitalSystem1.treatmentQueue.dequeue();
                        break;

                    case 3:
                        hospitalSystem1.printQueue();
                        break;

                    default:
                        System.out.println("Hatalı veya eksik bi tuşlama yaptınız lütfen tekrar deneyiniz");
                        break;
                }
                break;

            case 3:
                System.out.println();
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
                System.out.println("Taburcu listesine hasta eklemek için biri 1'i");
                System.out.println("Taburcu listesinden hasta çıkarmak için 2'yi");
                System.out.println("Taburcu listesinin başını yazdırmak için 3'ü");
                System.out.println("Taburcu listesini yazdırmak için lütfen 4'ü tuşlayınız");
                int dischargeAnswer = question.nextInt();
                switch (dischargeAnswer) {
                    case 1:
                        System.out.println("Muayene sırasındaki ilk hasta taburcu listesine eklenmiştir");
                        hospitalSystem1.treatmentProcess();
                        break;
                    case 2:
                        hospitalSystem1.dischargeStack.pop();
                        break;

                    case 3:
                        hospitalSystem1.dischargeStack.peek();
                        break;

                    case 4:
                        hospitalSystem1.dischargeStack.printStack();
                        break;

                    default:
                        System.out.println("Hatalı veya eksik bi tuşlama yaptınız lütfen tekrar deneyiniz");
                        break;

                }
                break;

            case 0:
                System.out.println("Sistemden çıkış yapılıyor");
                return;

            default:
                System.out.println("Hatalı veya eksik bi tuşlama yaptınız lütfen tekrar deneyiniz");
                break;
        }
    }






}
