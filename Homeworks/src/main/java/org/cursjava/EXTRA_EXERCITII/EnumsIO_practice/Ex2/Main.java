package org.cursjava.EXTRA_EXERCITII.EnumsIO_practice.Ex2;

import java.io.*;

public class Main {
    //duplicate an image
    public static void main(String[] args) throws FileNotFoundException {
//        try {
//            FileInputStream fileInputStream = new FileInputStream("src/main/resources/IO/aog.png");
//            FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/IO/aog3.png");
//            int a;
//
//            while((a = fileInputStream.read()) != -1){
//                fileOutputStream.write(a);
//            }
//            if(fileInputStream != null){
//                fileInputStream.close();
//            }
//            if(fileOutputStream != null){
//                fileOutputStream.close();
//            }
//
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        copyImage(new FileInputStream("src/main/resources/IO/test1.png"), new FileOutputStream("src/main/resources/IO/test2.png"));
    }

    public static void copyImage(InputStream reader, OutputStream writer){
        try{
            int b;
            while((b = reader.read()) != -1){
                writer.write(b);
            }

            if(reader != null){
                reader.close();
            }
            if(writer != null){
                writer.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
