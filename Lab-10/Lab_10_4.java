import java.io.*;
class Student{
    String name;
    int age;

    Student(String name , int age){
        this.name= name;
        this.age=age;
    }

    public String toString(){
        return "Name : "+name+" , Age : "+age;
    }
}

public class Lab_10_4{
    public static void main(String[] args){
        String filename = "students.txt";

        try{
            FileOutputStream fos = new FileOutputStream(filename);
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeUTF("Krisha");
            dos.writeInt(18);
            dos.writeUTF("ABC");
            dos.writeInt(11);
            dos.writeUTF("XYZ");
            dos.writeInt(14);

            System.out.println("Data Written Successfully");
            dos.close();

            fos.close();
        }

        catch(Exception e){
            e.printStackTrace();
        }

        try{
            FileInputStream fis = new FileInputStream(filename);
            DataInputStream dis = new DataInputStream(fis);

            while (dis.available() > 0){
                String name = dis.readUTF();
                int age = dis.readInt();
                Student student = new Student(name, age);
                System.out.println(student);
            }

            dis.close();
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
