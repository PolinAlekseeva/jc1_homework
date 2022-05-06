package my.task47;

import java.io.*;


public class TextFile {

    public static void main(String[] args) {

        BufferedReader br = null;

        try {
        File file = new File("textFile.txt");
        if(!file.exists())
            file.createNewFile();


        PrintWriter pw = new PrintWriter(file);
        pw.println("We see people in our country and in other lands and learn about their customs, occupations, traditions, problems.");
       pw.println("People used to have hobbies, to meet with friends, to go to the cinema or theatre, to read books, to listen to music.");

       pw.close();

       br = new BufferedReader(new FileReader("textFile.txt"));
       String line;
       while((line = br.readLine()) != null) {
           System.out.println(line);


        }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
