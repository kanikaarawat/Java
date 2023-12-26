/* WAP in java to insert name and rollno of 2 students.
Write functions to insert info and displaying the info.
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
*/


class Student{
    int rollno;
    String name;

void insertRecord(int r, String n){
    rollno=r;
    name=n;
}

void displayInfo(){
    System.out.println(rollno + " " + name);
}

// driver class

public static void main (String args []){
    //create object of student
    Student S1 = new Student();
    Student S2 = new Student();


//records inserted

S1.insertRecord(111,"Tom Cruise");
S2.insertRecord(222,"Brad Pitt");

//display object record

S1.displayInfo();
S2.displayInfo();
}
}