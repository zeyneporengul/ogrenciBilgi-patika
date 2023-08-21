package org.example;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozluNotu;

    public Course( String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println("İşlem başarılı!");
        } else{
            System.out.println(t.name + " bu dersi veremez!");
        }
    }

    public void printTeacher(){
        if(courseTeacher != null){
            System.out.println(this.name + " dersinin akademisyeni : " + courseTeacher.name);
        } else{
            System.out.println(this.name + " dersine akademisyen atanmamıştır.");
        }
    }
}
