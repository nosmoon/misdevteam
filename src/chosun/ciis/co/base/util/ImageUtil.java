package chosun.ciis.co.base.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.log.LogManager;
import somo.framework.prop.PropertyManager;

public class ImageUtil {


    /**
     * 지국장사진 저장
     *
     * @param imgnm String
     * @param contimg byte[]
     * @throws AppException
     */
    public synchronized static void savePhoto(String dir, String photo, byte[] bo_headphot) throws AppException{

        if(photo == null || bo_headphot == null) return;

        try{
            File  file = new File(dir, photo);
            
            if(file.exists()){
            	
            	file.delete();
            	file = new File(dir, photo);
            }
            
            if(!file.exists()){
                FileOutputStream fos = new FileOutputStream(file);
                BufferedInputStream fin = new BufferedInputStream(new ByteArrayInputStream(bo_headphot));
                BufferedOutputStream outs = new BufferedOutputStream(fos);

                byte[] buf = new byte[1024];

                for (int count = fin.read(buf); count != -1; count = fin.read(buf)){
                    outs.write(buf, 0, count);
                }
                outs.close();
                fos.close();
                fin.close();
            }
        }catch (Exception e) {
        	SysException se = new SysException(e);
        	LogManager.getInstance().log(se);
        	throw new AppException(e.getLocalizedMessage());
        }
    }
    public synchronized static void savePhoto(String prn, byte[] bo_headphot) throws AppException{

        if(prn == null || bo_headphot == null) return;

        try{
            PropertyManager prop = PropertyManager.getInstance();
            String dir = (String)prop.getProperty("PHOTO");
            File  file = new File(dir, prn);
            
	          if(file.exists()){
	            	
	            	file.delete();
	            	file = new File(dir, prn);
	         }
	          
            if(!file.exists()){
                FileOutputStream fos = new FileOutputStream(file);
                BufferedInputStream fin = new BufferedInputStream(new ByteArrayInputStream(bo_headphot));
                BufferedOutputStream outs = new BufferedOutputStream(fos);

                byte[] buf = new byte[1024];

                for (int count = fin.read(buf); count != -1; count = fin.read(buf)){
                    outs.write(buf, 0, count);
                }
                outs.close();
                fos.close();
                fin.close();
            }
        }catch (Exception e) {
             SysException se = new SysException(e);
             LogManager.getInstance().log(se);
             throw new AppException(e.getLocalizedMessage());
        }
    }
    public synchronized static void deletePhoto(String dir, String photo) throws AppException{

        try{
            File  file = new File(dir, photo);
            if(file.exists()){
            	file.delete();           
            	System.out.println("삭제 파일== "+photo);
            }
        }catch (Exception e) {
        	SysException se = new SysException(e);
        	LogManager.getInstance().log(se);
        	throw new AppException(e.getLocalizedMessage());
        }
    }
}
