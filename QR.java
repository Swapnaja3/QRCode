package com.test;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.*;

public class QR {
    public static void main(String args[]) {

        try
        {
            File file=new File("E:\\abc.png");
            String content="https://www.infobytestechnosys.in/";
            ByteArrayOutputStream out= QRCode.from(content).to(ImageType.PNG).stream();
            FileOutputStream fos=new FileOutputStream(file);
            fos.write(out.toByteArray());
            fos.close();
            System.out.println("Success");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
