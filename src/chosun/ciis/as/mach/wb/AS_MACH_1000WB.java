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

package chosun.ciis.as.mach.wb;

import java.util.*;
import java.rmi.RemoteException;
import java.sql.CallableStatement;
import java.sql.Types;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.*;


import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB;

import javax.ejb.CreateException;
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
import chosun.ciis.as.artmgr.ds.AS_ARTMGR_1003_ADataSet;
import chosun.ciis.as.mach.dm.*;
import chosun.ciis.as.mach.ds.*;
/**
 * 
 */

public class AS_MACH_1000WB extends BaseWB {

	public void as_mach_1000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_MACH_1000_MDataSet ds = null;
		AS_MACH_1000_MDM dm = new AS_MACH_1000_MDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_MACH_1000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void as_mach_1005_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_MACH_1005_LDataSet ds = null;
		AS_MACH_1005_LDM dm = new AS_MACH_1005_LDM();

		String sflag = "";
		
		sflag = Util.checkString(req.getParameter("sflag"));
		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		if(sflag.equals("1")) {
			dm.work_clsf = Util.checkString(req.getParameter("work_clsf"));
		} else {
			dm.work_clsf = Util.checkString(req.getParameter("work_clsf2"));
		}

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_MACH_1005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void as_mach_1010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_MACH_1010_LDataSet ds = null;
		AS_MACH_1010_LDM dm = new AS_MACH_1010_LDM();

		dm.cmpy_cd 	  = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.work_clsf  = Util.checkString(req.getParameter("work_clsf"));
		dm.mach_clsf  = Util.checkString(req.getParameter("mach_clsf"));
		dm.bldg_clsf  = Util.checkString(req.getParameter("bldg_clsf"));
		dm.mach_name  = Util.checkString(req.getParameter("mach_name"));
		dm.model_name = Util.checkString(req.getParameter("model_name"));
		dm.fr_inst_dt = Util.checkString(req.getParameter("fr_inst_dt"));
		dm.to_inst_dt = Util.checkString(req.getParameter("to_inst_dt"));
		dm.fr_exp_dt  = Util.checkString(req.getParameter("fr_exp_dt"));
		dm.to_exp_dt  = Util.checkString(req.getParameter("to_exp_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_MACH_1010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);

	}

	public void as_mach_1015_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_MACH_1015_SDataSet ds = null;
		AS_MACH_1015_SDM dm = new AS_MACH_1015_SDM();

		dm.cmpy_cd 	= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mach_seq = Util.checkString(req.getParameter("mach_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_MACH_1015_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);

	}

	public void as_mach_1020_a(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException {
		AS_MACH_1020_ADataSet ds = null;
		AS_MACH_1020_ADM dm = new AS_MACH_1020_ADM();
		
		Hashtable ht = new Hashtable();
		byte[] up_phot_img = new byte[10 * 1024 * 1024];
		
    	String file_name = "";
    	String file_size = "";
    	
        int sizeLimit = 10 * 1024 * 1024 ;
        MultipartParser mp = new MultipartParser(req, sizeLimit, true, true, "EUC-KR"); // 10MB 
        //MultipartParser mp = new MultipartParser(req, sizeLimit, true, true, "KSC5601"); // 10MB
                
        Part part; 
        
        while ((part = mp.readNextPart()) != null) {
            String name  = part.getName();
            
            if (part.isParam()) {
    			ht.put(part.getName(), ((ParamPart)part).getStringValue());
            }else if (part.isFile()) {
                FilePart filePart = (FilePart) part;
                file_name = filePart.getFileName();
                System.out.print("sizeLimit:"+sizeLimit);
                if ( file_name != null ) {
                	ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    				((FilePart)part).writeTo(byteArrayOutputStream);    				 
    				up_phot_img = byteArrayOutputStream.toByteArray();
    	    		file_size = String.valueOf(up_phot_img.length);
                }
                
            }
            
        }
        
		dm.mach_seq   	= Util.checkString((String)ht.get("mach_seq"));
		dm.work_clsf  	= Util.checkString((String)ht.get("work_clsf"));
		dm.mach_clsf  	= Util.checkString((String)ht.get("mach_clsf"));
		dm.bldg_clsf  	= Util.checkString((String)ht.get("bldg_clsf"));
		dm.mach_name  	= Util.checkString((String)ht.get("mach_name"));
		dm.model_name 	= Util.checkString((String)ht.get("model_name"));
		dm.stnd 		= Util.checkString((String)ht.get("stnd"));
		dm.usag 		= Util.checkString((String)ht.get("usag"));
		dm.loca 		= Util.checkString((String)ht.get("loca"));
		dm.inst_dt 		= Util.checkString((String)ht.get("inst_dt"));
		dm.exp_dt 		= Util.checkString((String)ht.get("exp_dt"));
		dm.make_comp 	= Util.checkString((String)ht.get("make_comp"));
		dm.inst_comp 	= Util.checkString((String)ht.get("inst_comp"));
		dm.inst_fee 	= Util.checkString((String)ht.get("inst_fee"));
		dm.as_comp 		= Util.checkString((String)ht.get("as_comp"));
		dm.as_fee 		= Util.checkString((String)ht.get("as_fee"));
		dm.as_tel 		= Util.checkString((String)ht.get("as_tel"));
		dm.remk 		= Util.checkString((String)ht.get("remk"));
		dm.job_clsf 	= Util.checkString((String)ht.get("job_clsf"));

		dm.cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);		
		dm.incmg_pers_ipadd	= Util.checkString(req.getRemoteAddr());
		dm.incmg_pers 	    = Util.getSessionParameterValue(req,"emp_no",true);

		dm.up_phot_img 	= "1010".getBytes();
		dm.file_size 	= file_size;
		
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");				
		ds = (AS_MACH_1020_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}else{
			// BLOB 구하기
			if(file_name != ""){
				try {
					manager.getConnection();
					manager.m_conn.setAutoCommit(false);

					String mach_seq = "";
					if(dm.job_clsf.equals("I")) {
						mach_seq = ds.getMach_seq();
					} else {
						mach_seq = dm.mach_seq;
					}

					Statement stmt = manager.m_conn.createStatement();
					String blobQuery = "SELECT PHOT_IMG FROM TAASM_PHOT WHERE CMPY_CD = '" + dm.cmpy_cd + "' AND JOB_CLSF='3' AND ASET_NO = '" + mach_seq + "' FOR UPDATE";			
					
					OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);
					
					if (rset.next()) {					
	           	   		oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);							
						OutputStream os = oracle_blob.getBinaryOutputStream();
						  
						// 파일로부터 읽어서 BLOB 에 WRITE 한다.
						for(int i=0; i<up_phot_img.length; i++){
							os.write(up_phot_img[i]);
						}
						os.close();
					}

					stmt.close();
					manager.m_conn.commit();
					manager.disConnection();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					try{
						manager.m_conn.rollback();
						manager.disConnection();
					}catch(SQLException se){
						manager.disConnection();
						throw new SysException(se);
					}
					manager.disConnection();
					throw new SysException(e);
				}
			}

		}
		
		req.setAttribute("ds", ds);

	}

	
	public void as_mach_1030_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_MACH_1030_LDataSet ds = null;
		AS_MACH_1030_LDM dm = new AS_MACH_1030_LDM();

		dm.cmpy_cd 	= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mach_seq = Util.checkString(req.getParameter("mach_seq"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_MACH_1030_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);

	}
	

	public void as_mach_1040_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_MACH_1040_ADataSet ds = null;
		AS_MACH_1040_ADM dm = new AS_MACH_1040_ADM();

		dm.mach_seq = Util.checkString(req.getParameter("mach_seq"));
		dm.as_seq = Util.checkString(req.getParameter("as_seq"));
		dm.mach_as_dt = Util.checkString(req.getParameter("mach_as_dt"));
		dm.as_comp = Util.checkString(req.getParameter("as_comp"));
		dm.as_fee = Util.checkString(req.getParameter("as_fee"));
		dm.as_cont = Util.checkString(req.getParameter("as_cont"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		
		dm.cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);		
		dm.incmg_pers_ipadd	= Util.checkString(req.getRemoteAddr());
		dm.incmg_pers 	    = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_MACH_1040_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);

	}

	public void as_mach_1100_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_MACH_1100_MDataSet ds = null;
		AS_MACH_1100_MDM dm = new AS_MACH_1100_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_MACH_1100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);

	}
	
	public void as_mach_1110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_MACH_1110_LDataSet ds = null;
		AS_MACH_1110_LDM dm = new AS_MACH_1110_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.work_clsf = Util.checkString(req.getParameter("work_clsf"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_MACH_1110_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void as_mach_1120_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_MACH_1120_ADataSet ds = null;
		AS_MACH_1120_ADM dm = new AS_MACH_1120_ADM();

		dm.work_clsf_cd = Util.checkString(req.getParameter("work_clsf_cd"));
		dm.mach_clsf_cd = Util.checkString(req.getParameter("mach_clsf_cd"));
		dm.mach_clsf_nm = Util.checkString(req.getParameter("mach_clsf_nm"));
		dm.cont_year = Util.checkString(req.getParameter("cont_year"));
		dm.bldg_clsf_cd = Util.checkString(req.getParameter("bldg_clsf_cd"));
		dm.bldg_clsf_nm = Util.checkString(req.getParameter("bldg_clsf_nm"));
		dm.incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		dm.tab_mode = Util.checkString(req.getParameter("tab_mode"));

		dm.cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);		
		dm.incmg_pers_ipadd	= Util.checkString(req.getRemoteAddr());
		dm.incmg_pers 	    = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_MACH_1120_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);

	}


}
