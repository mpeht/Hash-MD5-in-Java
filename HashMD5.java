/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmd5;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 *
 * @author mpeht
 */
public class HashMD5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        String phrase;
        System.out.println("Enter a word or a phrase to encoding:");
        phrase = sc.nextLine();

        try{
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(phrase.getBytes(), 0, phrase.length());
            System.out.println(new BigInteger(1, md.digest()).toString(16));
        } catch (NoSuchAlgorithmException e){
  
    }
    }
    
}
