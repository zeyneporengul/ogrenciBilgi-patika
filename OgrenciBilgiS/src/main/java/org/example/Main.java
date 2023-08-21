package org.example;

public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik","MAT101", "MAT" );
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Ali", "123", "MAT");
        Teacher t2 = new Teacher("Ayşe", "456", "FZK");
        Teacher t3 = new Teacher("Ahmet", "789", "KMY" );

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);


        Student s1 = new Student("Eda", 4, 140144015, mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.addBulkSozluNotu(50,50,50);
        s1.isPass();

        Student s2 = new Student("Elif", 4, 2211133, mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkSozluNotu(100,70,10);
        s2.isPass();

        Student s3 = new Student("İsmail", 4, 221121312, mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.addBulkSozluNotu(20,30,40);
        s3.isPass();

    }
}