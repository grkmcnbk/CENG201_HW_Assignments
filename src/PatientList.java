public class PatientList {
    Patient head;  //It holds the first patient (head node) of the linked list
    int size;
    PatientList(){
        head= null;
        size = 0;
    }


    // Retrieves patient information from the user and adds it to the list
    public void addPatient(Patient p){
        if (head == null)                                     //Checking if the list empty
            head = p;
        else {
            p.next = head;  // The new patient is linked to the top of the existing list.
            head = p;
        }
        size++;
    }


    //Gets the id of the person to be removed and removes them from the list
    public void removePatient(int id) {

        if (head == null){
            System.out.println("List is empty");
            return;
        }

        if (head.id == id) {      //Checks whether the element to be deleted is the first element
            head = head.next;
            System.out.println("Patient successfully removed from list");

        } else {
            Patient temp = head;      // Proceeds to find the patient to be deleted
            Patient temp2 = head;     // It holds the previous patient

            while (temp.id != id) {
                temp2 = temp;
                temp = temp.next;
            }

            if (temp.next == null) {
                temp2.next = null;
            } else {
                temp2.next = temp.next;

            }
            System.out.println("Patient successfully removed from list");
            System.out.println();
        }
        size--;
    }


    //It takes the ID of the patient to be found and displays it to the user.
    public void findPatient(int id){
        if (head.id == id) {   //Checks whether the element to be find is the first element
            System.out.println("Patient id;"+head.id+"  Patient name;"+head.name+"  Patient age;"+head.age+"  Pateint severity;"+head.severity);;

        } else {

            Patient temp = head;


            while (temp.id != id) {  // Proceed until ID matches

                temp = temp.next;
                if (temp.id ==id ){
                    System.out.println("The patient you are looking for:  Patient id;"+temp.id+"  Patient name;"+temp.name+"  Patient age;"+temp.age+"  Pateint severity;"+temp.severity);

                }
            }
        }
        System.out.println();
    }


    //Takes a patient list and displays the list to the user
    public void printList(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }

        Patient temp =head;

        while (temp != null){   // Proceed until ID matches
            System.out.println("Patient id;"+temp.id+"  Patient name;"+temp.name+"  Patient age;"+temp.age+"  Pateint severity;"+temp.severity);
            temp = temp.next;

        }
        System.out.println();
    }

    public int size(){
        return size;
    }
}




