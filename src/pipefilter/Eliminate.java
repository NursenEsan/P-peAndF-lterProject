/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipefilter;

/**
 *
 * @author deniz
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Eliminate {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java  Eliminate <file_name>");
            System.exit(1);
        }
        try {
            Scanner scanner = new Scanner(new File(args[0]));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Replace punctuation characters
                line = line.replaceAll("[^a-zA-Z\\s]", " ");
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found - " + args[0]);
            System.exit(1);
        }
    }
}


