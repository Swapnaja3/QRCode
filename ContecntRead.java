package com.test;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import net.glxn.qrgen.QRCode;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
public class ContecntRead {
    public static  void main(String args[])
    {
       try {
          InputStream barcode=new FileInputStream("E:\\abc.png");
          BufferedImage barc= ImageIO.read(barcode);
           LuminanceSource source=new BufferedImageLuminanceSource(barc);
           BinaryBitmap bitmap=new BinaryBitmap(new HybridBinarizer(source));
           MultiFormatReader reader= new MultiFormatReader();
           Result result=reader.decode(bitmap);
           System.out.println(result);

       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
}
