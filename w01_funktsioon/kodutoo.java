import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class kodutoo{

    //https://www.geeksforgeeks.org/compressing-and-decompressing-files-in-java/
    //palju stackoverflowd
    public static String compressFile(String path){

        ArrayList<String> fileExt = new ArrayList<String>(Arrays.asList(path.split("[.]")));
        String newFileName = "Comp" + fileExt.get(0);
        try {
            FileInputStream fileInput = new FileInputStream(path);
            FileOutputStream fileOutput = new FileOutputStream(newFileName);
            DeflaterOutputStream deflatedFile = new DeflaterOutputStream(fileOutput);
            try {
                int fileData;
                while ((fileData = fileInput.read()) != -1) {
                    deflatedFile.write((byte)fileData);
                    deflatedFile.flush();
                }
                fileInput.close();
                deflatedFile.close();
            }
            catch (IOException ioerror){
                System.out.println(ioerror);
            }
        }
        catch (FileNotFoundException fileerror){
            System.out.println(fileerror);
        }

        return newFileName;
    }

    public static String decompressFile(String path){
        String newFileName = "De" + path;
        try{
            FileInputStream fileInput = new FileInputStream(path);
            InflaterInputStream inflater = new InflaterInputStream(fileInput);
            FileOutputStream fileOutput = new FileOutputStream(newFileName);

            try{
                int fileData;
                while ((fileData = inflater.read())!=-1){
                    fileOutput.write((byte)fileData);
                    fileOutput.flush();
                }
                fileInput.close();
                inflater.close();
                fileOutput.close();
            } catch (IOException ioerror){
                System.out.println(ioerror);
            }
        } catch (FileNotFoundException fileerror){
            System.out.println(fileerror);
        }
        return newFileName;
    }

    public static void main(String[] arg){
        String option = arg[0];
        String path = arg[1];
        if(option.equals("c")){
            System.out.println(compressFile(path));
        }
        if(option.equals("d")){
            System.out.println(decompressFile(path));
        }

    }
}
