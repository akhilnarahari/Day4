/**
 * Created by narahara on 7/8/2017.
 */

package javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileIStream{
    public static void main(String args[]){
        try
        {

            FileInputStream fin=new FileInputStream("kkk.txt");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }
       // catch(FileNotFoundException fe){ fe.printStackTrace();}
       catch(IOException e){System.out.println(e.getMessage());}
    }
}
