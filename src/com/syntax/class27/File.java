package com.syntax.class27;

public abstract class File {
    abstract void open();
    public void edit(){
        System.out.println("edit the file");
    }
    public static void close(){
        System.out.println("close the file");
    }
   // class JavaFile extends File{

        //@Override
       // static void open() {
          //  System.out.println("Java file opened");
        }


    class WordFile extends File{

        @Override
        void open() {

        }

    }
    class PdfFile extends File{

        @Override
        void open() {

        }

    }


