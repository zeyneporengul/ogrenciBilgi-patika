package org.example;

public class Student {
    String name;
    int stuNo;
    int classes;
    Course fizik;
    Course kimya;
    Course mat;
    double average;
    boolean isPass;

    Student(String name, int stuNo, int classes, Course fizik, Course kimya, Course mat){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.fizik = fizik;
        this.kimya = kimya;
        this.mat = mat;
        this.mat.sozluNotu = mat.sozluNotu;
        this.fizik.sozluNotu = fizik.sozluNotu;
        this.kimya.sozluNotu = kimya.sozluNotu;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya){
        if(mat >= 0 && mat <= 100){
            this.mat.note = mat;
        }
        if(fizik >= 0 && fizik <= 100){
            this.fizik.note = fizik;
        }
        if(kimya >= 0 && kimya <= 100){
            this.kimya.note = kimya;
        }
    }

    public void addBulkSozluNotu(int matSozlu, int fizikSozlu, int kimyaSozlu){
        if(matSozlu >= 0 && matSozlu <= 100){
            this.mat.sozluNotu = matSozlu;
        }
        if(fizikSozlu >= 0 && fizikSozlu <= 100){
            this.fizik.sozluNotu = fizikSozlu;
        }
        if(kimyaSozlu >= 0 && kimyaSozlu <= 100){
            this.kimya.sozluNotu = kimyaSozlu;
        }
    }

    public void calcAverage(){
        this.average = ((fizik.note*4/5 + fizik.sozluNotu/5) + (mat.note*4/5 + mat.sozluNotu/5) + (kimya.note*4/5 + kimya.sozluNotu/5))/3;
    }

    public boolean isCheckPass(){
        calcAverage();
        return this.average > 55;
    }

    public void isPass(){
        if(this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0){
            System.out.println("Notlar tam olarak girilmemiş!");
        } else{
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama: " + this.average);
            if(this.isPass){
                System.out.println("Sınıfı geçti!");
            } else{
                System.out.println("Sınıfta kaldı!");
            }
        }
    }

    public void printNote(){
        System.out.println("Öğrenci: " + this.name);
        System.out.println("Matematik notu: " + this.mat.note);
        System.out.println("Fizik notu: " + this.fizik.note);
        System.out.println("Kimya notu: " + this.kimya.note);
        System.out.println("Matematik sözlü notu: " + this.mat.sozluNotu);
        System.out.println("Fizik sözlü notu: " + this.fizik.sozluNotu);
        System.out.println("Kimya sözlü notu: " + this.kimya.sozluNotu);
    }

}
