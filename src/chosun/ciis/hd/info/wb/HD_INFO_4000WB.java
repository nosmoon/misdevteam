/***************************************************************************************************
* 파일명 : 
* 기능 : 
 * 작성일자 : 
 * 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.hd.info.wb;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.multipart.*;

import chosun.ciis.co.base.wb.BaseWB;
import somo.framework.db.BaseDataSet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;
/**
 * 
 */

public class HD_INFO_4000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

        	
	public void hd_info_4000_a(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException {

		//System.out.println("1=============================");
		Hashtable ht = new Hashtable();
		//System.out.println("2=============================");
		byte[] phot = new byte[10485760]; //10Mb
		//System.out.println("3=============================");
		String file_name = "";
		//System.out.println("4=============================");
		String file_size = "";
		//System.out.println("5=============================");
		
        int sizeLimit = 10 * 1024 * 1024 ;
		//System.out.println("6============================="+req);
		//System.out.println("6============================="+sizeLimit);

        MultipartParser mp = new MultipartParser(req, sizeLimit, true, true, "EUC-KR"); // 10MB

		//System.out.println("7============================="+mp);
		
		HD_INFO_4000_ADataSet ds = null;
		HD_INFO_4000_ADM dm = new HD_INFO_4000_ADM();
			
			Part part; 
			
			
			while ((part = mp.readNextPart()) != null) {
				
			    String name  = part.getName();
			  
				//System.out.println("name="+name);
				//System.out.println("  part.isFile()="+  part.isFile());
				//System.out.println("  part.isParam()="+  part.isParam());

				
				if (part.isParam()) {
					ht.put(part.getName(), ((ParamPart)part).getStringValue());
			    }else if (part.isFile()) {
			        FilePart filePart = (FilePart) part;
			        file_name = filePart.getFileName();
			
			        //System.out.println("file_name = "+file_name);
			        if ( file_name != null ) {
			        	ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
						((FilePart)part).writeTo(byteArrayOutputStream);
						phot = byteArrayOutputStream.toByteArray();
			    		dm.phot = phot;
			    		//System.out.println("phot = "+phot);
			    		file_size = String.valueOf(phot.length);
			    		dm.file_size = file_size;
			    		//System.out.println("file_size = "+file_size);
			        }
			    }
			}
			
			//System.out.println("emp_no====>"+ht.get("emp_no"));
			
			//System.out.println("cmpy="+req.getParameter("cmpy_cd"));
			dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
			dm.emp_no =  Util.getSessionParameterValue(req,"emp_no",true);
			//dm.phot = Util.checkString(req.getParameter("phot"));
			//dm.file_size = Util.checkString(req.getParameter("file_size"));
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipadd = req.getRemoteAddr();

			DBManager manager = new DBManager("MISHDL");
			ds = (HD_INFO_4000_ADataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}
			req.setAttribute("ds", ds);

	}
	
	public void hd_info_4020_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		HD_INFO_4020_MDataSet ds = null;
		HD_INFO_4020_MDM dm = new HD_INFO_4020_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		DBManager manager = new DBManager("MISHDL");
		ds = (HD_INFO_4020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		req.setAttribute("ds", ds);

	}
}
