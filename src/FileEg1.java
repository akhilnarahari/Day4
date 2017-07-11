/**
 * Created by narahara on 7/8/2017.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;

/**
 *
 * @author ADMIN
 */
public class FileEg1 {

    public static void main(String[] argv)
            throws NullPointerException,Exception
    {
        FileInputStream fin=new FileInputStream("abcd.txt");
        int c;
        while((c=fin.read())!=-1){
             char k=(char)c;
            if(k==' '){
                c=fin.read();
                System.out.println((char)c);
                c++;
            }
            else{
                c++;
            }
    }
    }
}

