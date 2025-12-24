void main() {
    PatientList patientAdmission = new PatientList();
    Patient patient1 = new Patient();
    Patient patient2 = new Patient();
    Patient patient3 = new Patient();
    Patient patient4 = new Patient();
    Patient patient5 = new Patient();


    patient1.id =111111;
    patient1.name = "Mahmut";
    patient1.age = 20;
    patient1.severity =5;

    patient2.id =222222;
    patient2.name = "Eylul";
    patient2.age = 21;
    patient2.severity =7;

    patient3.id =333333;
    patient3.name = "Ibrahim";
    patient3.age = 29;
    patient3.severity =1;

    patient4.id =444444;
    patient4.name = "Yuksel";
    patient4.age = 18;
    patient4.severity =7;

    patient5.id =555555;
    patient5.name = "Yahya";
    patient5.age = 19;
    patient5.severity =3;


    patientAdmission.addPatient(patient1);
    patientAdmission.addPatient(patient2);
    patientAdmission.addPatient(patient3);
    patientAdmission.addPatient(patient4);
    patientAdmission.addPatient(patient5);

    patientAdmission.removePatient(333333);

    patientAdmission.findPatient(444444);

    patientAdmission.printList();
}