package cn.edu.zjut.colleges.controller;


import java.io.*;

/**
 * Created by Tim on 2018/4/10
 */
public class PictureController{
    private String filename;
    private InputStream inputStream;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String downloadBadge() {
        return null;
//        File file = new File("/root/college_badges/" + filename);
//        if (filename == null || !file.exists()) return ERROR;
//        else {
//            try {
//                inputStream = new FileInputStream(file);
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//                return ERROR;
//            }
//            return SUCCESS;
//        }
    }
}
