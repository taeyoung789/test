package com.io1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class IOEx14 {
    public static void main(String[] args) {
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("./object.ser"));

            String[] names = (String[])ois.readObject();
            int[] ages = (int[])ois.readObject();
            double[] weights = (double[])ois.readObject();

            System.out.println(Arrays.toString(names));
            System.out.println(Arrays.toString(ages));
            System.out.println(Arrays.toString(weights));
        } catch (IOException e) {
            System.out.println("[에러]" + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("[에러]" + e.getMessage());
        } finally{
            if(ois!=null){ try {ois.close();} catch (IOException e) {}}
        }

    }
}
