package com.vladproduction.c08_java_IO_fundamentals.question_time;

import com.vladproduction.c08_java_IO_fundamentals.strems_files_read_write.USPresident;

import java.io.*;

public class Quest1 {
    public static void main(String[] args) {
        USPresident usPresident = new USPresident("Barack Obama1", "2009 to --", String.valueOf(56));
        try (ObjectOutputStream oos = new ObjectOutputStream(new
                FileOutputStream("USPresidentQuest1.data"))){
            oos.writeObject(usPresident);
            usPresident.setTerm(String.valueOf(57));
            oos.writeObject(usPresident);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //De-serialize the object
        try(ObjectInputStream ois = new ObjectInputStream(new
                FileInputStream("USPresidentQuest1.data"))){
            Object obj = ois.readObject();
            if(obj != null && obj instanceof USPresident){
                USPresident presidentOfUS = (USPresident)obj;
                System.out.println("De-serialize the object:");
                System.out.println(presidentOfUS);
            }
        }catch(FileNotFoundException fnfe) {
            System.err.println("cannot create a file with the given file name ");
        } catch(IOException ioe) {
            System.err.println("an I/O error occurred while processing the file");
        } catch(ClassNotFoundException cnfe) {
            System.err.println("cannot recognize the class of the object - is the file corrupted?");
        }
    }
}

/*If you deserialize the object and print the field term (term is declared as int and is not a transient), what it will print?
A. 56
B. 57
C. null
D. Compiler error
E. Runtime exception
Answer: A. 56
(Yes, it will print 56 even though you changed the term using its setter to 57 and
serialized again. This happens due to serialVersionUID, which is checked by the JVM at
the time of serialization. If a class is already serialized and you try to serialize it again, the
JVM will not serialize it.*/
