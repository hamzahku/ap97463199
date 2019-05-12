package assignment8;

import java.io.*;
import java.util.ArrayList;

public class FileHandller {
    private static File file =  new File("students.txt");;
    public static void addStudent(Student student) throws IOException{
        FileWriter fileWriter = new FileWriter(file,true);
        if(student instanceof GraduteStudent){
            fileWriter.write(student.toString());
        }else if(student instanceof StudyStudent){
            fileWriter.write(student.toString());
        }
        fileWriter.close();
    }
    public static ArrayList<Student> ReadStudents() throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = bufferedReader.readLine();
        ArrayList<Student> students = new ArrayList<>();
        while(line!=null){
            String[] info = line.split("\t");
            if(info[0].equals("Study")){
                StudyStudent student = new StudyStudent(info[1],info[2],Integer.valueOf(info[3]),Integer.valueOf(info[4]));
                students.add(student);
            }else{
                GraduteStudent student = new GraduteStudent(info[1],info[2],Integer.valueOf(info[3]),Integer.valueOf(info[4]));
                students.add(student);
            }
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        return students;
    }
}
