import org.apache.log4j.Logger;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class Main {

    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("შემოიტანე საძიებო სიტყვა: ");
        String str= sc.nextLine();
        System.out.print("საძიებო სიტყვა არის: "+str);

        File dir = new File("/Users/jababagdoshvili/Desktop");
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept (File dir, String name) {
                return name.contains(str);
            }
        };
        String[] children = dir.list(filter);
        if (children == null) {
            System.out.println("მსგავსი ფაილი არ არსებობს");
        } else {
            for (int i = 0; i< children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }
}