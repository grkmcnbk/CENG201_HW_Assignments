public class DischargeRecord {
    int patientId;
    long dischargeTime;
    DischargeRecord next;

    DischargeRecord(){
        patientId =0;
        dischargeTime = System.currentTimeMillis();
        next = null;
    }


}
