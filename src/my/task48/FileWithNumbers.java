package my.task48;

import java.io.*;

public class FileWithNumbers {

    public static void main(String[] args) {

        BufferedReader br = null;

        try {
            File f = new File("file.txt");
            if( !f.exists()) {
                f.createNewFile();
            }

            FileWriter fw = new FileWriter(f);
            fw.write("We read lesson 6, exercise 5.");
            fw.write("Jack has to learn 9 words, 47 verbs, 5 adjectives.");
            fw.close();

            br = new BufferedReader(new FileReader("file.txt"));
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
                String[] words = line.split("[0-9]+");
                System.out.println("There are " + (words.length-1) + " digits in this text");

//                int count = 0;
//                for(int i =0; i< line.length(); i ++) {
//                    if(Character.isDigit(line.charAt(i))) count++;
//                }
//                System.out.println("There are " + count + " digits in the text");

            }



        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
