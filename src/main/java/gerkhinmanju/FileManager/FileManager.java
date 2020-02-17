package gerkhinmanju.FileManager;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    public String sFilePath = null;
    public File fileFolder = null;
    public List<File> res = new ArrayList<File>();


    public FileManager(String Folder){
        this.sFilePath = Folder;
        this.fileFolder = new File(this.sFilePath);
    }

    public List<File> getFiles(String extension) throws Exception{
        File[] listFilesFolders = fileFolder.listFiles();
        for (File file : listFilesFolders) {
            if (file.isDirectory()) {
                fileFolder = file;
                getFiles(extension);
            }
            if (file.isFile() && file.getName().toLowerCase().endsWith(extension)) {
                res.add(file);
            }
        }
        return res;
    }

}
