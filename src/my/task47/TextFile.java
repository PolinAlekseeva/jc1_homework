package my.task47;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TextFile {

    public static void main(String[] args) {

        BufferedReader br = null;

        try {
            File file = new File("textFile.txt");
            if (!file.exists())
                file.createNewFile();


            PrintWriter pw = new PrintWriter(file);
            pw.println("We see people in our country and in other lands and learn about their customs, occupations, traditions, problems.");
            pw.println("People used to have hobbies, to meet with friends, to go to the cinema or theatre, to read books, to listen to music!");

            pw.close();

            br = new BufferedReader(new FileReader("textFile.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                String[] words = line.split(" ");
                System.out.println("There are " + words.length + " words in this text.");
                String[] words2 = line.split("\\p{Punct}" );
                System.out.println("There are " + words2.length + " punctuation symbols in this text");

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

//        int count = 0;  //Это еще вариант подсчета слов в тексте
//        Pattern p = Pattern.compile("\\b");
//        Matcher m = p.matcher("We see people in our country and in other lands and learn about their customs, occupations, traditions, problems." +
//                "People used to have hobbies, to meet with friends, to go to the cinema or theatre, to read books, to listen to music.");
//
//        while(m.find()) {
//
//            count++;
//        }
//        count/=2;
//        System.out.println("There are " + count + " words in this text.");}
    }

}
