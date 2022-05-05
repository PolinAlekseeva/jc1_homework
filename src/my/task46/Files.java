package my.task46;

import java.io.File;

public class Files {
    public static void main(String[] args) {


        File folder = new File("D:\\work");
        System.out.println("These are the names of catalogs: ");
        findDir(folder);
        System.out.println("Now we will know the names of files: ");
        findFiles(folder);

    }

public static void findDir(File folder){
    File[] files = folder.listFiles();
            for (File file : folder.listFiles()) {
                if (file.isDirectory()) {

                    System.out.println(file.getName() + " catalog");

                }
            }
    }

    private static void findFiles(File folder) {
        File[] files = folder.listFiles();
       for(File file: folder.listFiles()){
           if(file.isFile()){
               System.out.println(file.getName() + " file");
           }
       }
    }
}


