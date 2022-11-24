package createtextfile;
import showinfo.results;
import showinfo.showInfo;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class writetextfile extends results {
    public File file;

    private String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        return dateFormat.format(new Date());
    }

    public void createNewFile() throws IOException {
        file = new File("Movie" + "-" + getCurrentDate() + ".txt");
    }

    public void writeIntoFile(ArrayList<String> filteredListValueList) throws IOException {
    FileWriter fw=new FileWriter(file);
    PrintWriter pw=new PrintWriter(fw);
    for (int i=0;i<filteredListValueList.size();i++) {
        String filteredListValue = filteredListValueList.get(i);
        pw.println(filteredListValue);
    }
    pw.close();





    }
    public void closeFile() throws IOException {
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.close();
    }
    }



