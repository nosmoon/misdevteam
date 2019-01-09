/***************************************************************************************************
* 파일명 : TnLnk000WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 이혁
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.tn.lnk.wb;

import java.util.Hashtable;
import java.io.*;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.tn.lnk.dao.TnLnk2000DAO;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.tn.lnk.rec.TN_LNK_2033_ACURLISTRecord;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class TnLnk2000WB extends BaseWB {


    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void tn_lnk_2000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_2000_MDataSet ds = null;
		TN_LNK_2000_MDM dm = new TN_LNK_2000_MDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));

		dm.print();
		
        try {
        	TnLnk2000DAO dao = new TnLnk2000DAO();
            ds = dao.tn_lnk_2000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 

    }

	public void tn_lnk_2010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_2010_LDataSet ds = null;
		TN_LNK_2010_LDM dm = new TN_LNK_2010_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.aplc_path = Util.checkString(req.getParameter("aplc_path"));
		dm.proc_clsf = Util.checkString(req.getParameter("proc_clsf"));
		dm.dt_clsf = Util.checkString(req.getParameter("dt_clsf"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));

		dm.print();
        
        try {
        	TnLnk2000DAO dao = new TnLnk2000DAO();
            ds = dao.tn_lnk_2010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 

    }
	
	public void tn_lnk_2020_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_2020_LDataSet ds = null;
		TN_LNK_2020_LDM dm = new TN_LNK_2020_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cmsidx = Util.checkString(req.getParameter("cmsidx"));
		dm.aplc_path = Util.checkString(req.getParameter("aplc_path"));
		dm.request_dt = Util.checkString(req.getParameter("request_dt"));
		dm.result_dt = Util.checkString(req.getParameter("result_dt"));
		dm.aplc_clsf = Util.checkString(req.getParameter("aplc_clsf"));
		dm.cmsstatus = Util.checkString(req.getParameter("cmsstatus"));		
		dm.proof_stat = Util.checkString(req.getParameter("proof_stat"));
		dm.result_stat = Util.checkString(req.getParameter("result_stat"));
		dm.search_clsf = Util.checkString(req.getParameter("search_clsf"));
		dm.search_nm = Util.checkString(req.getParameter("search_nm"));
		dm.errorcode = Util.checkString(req.getParameter("errorcode"));

		dm.print();
        
        try {
        	TnLnk2000DAO dao = new TnLnk2000DAO();
            ds = dao.tn_lnk_2020_l(dm);
            System.out.println( "==========> " + ds.new_cnt + " : " + ds.new_ok_cnt);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 
	}
	
	public void tn_lnk_2030_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_2030_LDataSet ds = null;
		TN_LNK_2030_LDM dm = new TN_LNK_2030_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.aplc_clsf = Util.checkString(req.getParameter("aplc_clsf"));
		dm.cmsstatus = Util.checkString(req.getParameter("cmsstatus"));
		dm.proof_stat = Util.checkString(req.getParameter("proof_stat"));
		dm.result_stat = Util.checkString(req.getParameter("result_stat"));
		dm.search_clsf = Util.checkString(req.getParameter("search_clsf"));
		dm.search_nm = Util.checkString(req.getParameter("search_nm"));

		dm.print();
        
        try {
        	TnLnk2000DAO dao = new TnLnk2000DAO();
            ds = dao.tn_lnk_2030_l(dm);
            req.setAttribute("ds", ds);                       
        }
        catch (AppException e) {
            throw e;
        } 
	}
	
	public void tn_lnk_2033_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_2033_ADataSet ds = null;
		TN_LNK_2033_ADM dm = new TN_LNK_2033_ADM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cmsidx = Long.parseLong(req.getParameter("cmsidx"));
		dm.incmg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
        
        try {
        	TnLnk2000DAO dao = new TnLnk2000DAO();
            ds = dao.tn_lnk_2033_a(dm);
            
            /*==========================================* /
    		ByteArrayOutputStream bas  = new ByteArrayOutputStream();
        	byte[] bytearray = null;
        	int	   totalblock = 0;
        	String filenm = "";
        	String filepath = "";
        	String data = "";
        	String tail = "";
        	
    		filenm   = ds.getFilenm();
    		if( ds.filepath.charAt(ds.filepath.length()-1) == '\\' ) {
    			filepath = ds.filepath;
    		} else {
    			filepath = ds.filepath.concat("\\");
    		}

    		File file = new File(filepath+filenm);		

    		boolean fileExists = file.exists();
    		if(fileExists) {
    			file.delete();
    		}	
    		
    		res.setContentType("application/x-msdownload; charset=euc-kr");
    		res.setHeader("Content-Disposition", "attachment; filename=" + filepath+filenm + ";");
    		try {
    			FileOutputStream fos = new FileOutputStream(filepath+filenm);

	    		try {
		    		for(int i = 0; i < ds.curlist.size(); i++) {
		
		    			TN_LNK_2033_ACURLISTRecord rec = (TN_LNK_2033_ACURLISTRecord)ds.curlist.get(i);
		
		    			if( rec.file_data.substring( 6, 8 ).equals("33") ) {
		    				
		    				//tail record
		    				totalblock = totalblock / 1024;
		    				//tail = rec.file_data.substring( 0, 42 ) + String.format("%010d", totalblock ) + rec.file_data.substring( 52, 1024 );
		    				tail = rec.file_data.substring( 0, 42 ) + Util.getFormStr(String.valueOf(totalblock), "0", 10) + rec.file_data.substring( 52, 1024 );
		    				bas.write( tail.getBytes() );
		
		    				byte[] bytes = bas.toByteArray();
		    				res.setContentLength(bytes.length);
		    				fos.write(bytes);
		    				fos.flush();
		    				fos.close();

		    				System.out.println("------------------ end ---------------------");
		    				
		    			} else {
		    				//header, data record
		    				bas.write(rec.file_data.getBytes(), 0, (rec.file_data.getBytes().length)-1);
		    			}
		
		    			if( rec.getProofdata() != null ) {
		
		    				//증빙자료 bytes
		    				bas.write(rec.proofdata, 0, rec.proofdata.length);
		    				
		    				//1024bytes 나머지 bytes
		    				bytearray = new byte[ ( 1024 - ((((rec.file_data.substring(0, rec.file_data.length() - 1)).getBytes().length) + rec.proofdata.length ) % 1024)) ];
		    				Arrays.fill( bytearray, (byte)0x20 );
		    				bas.write(bytearray, 0, bytearray.length);
		
		    				//write 전체 bytes계산
		    				totalblock += (((rec.file_data.getBytes().length)-1) + (rec.proofdata.length + bytearray.length));			
		    			}
		    		}
	    		} catch(IOException ie) {
	    		}
    		} catch(FileNotFoundException fe) {    			
    		}
            / *========================================== */
            
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 
	}	
	
	public void tn_lnk_2035_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_2035_ADataSet ds = null;
		TN_LNK_2035_ADM dm = new TN_LNK_2035_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
				
		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.file_clsf = Util.checkString(req.getParameter("file_clsf"));
		dm.promiseidx = (String)hash.get("promiseidx");
		dm.incmg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		         
        try {
        	TnLnk2000DAO dao = new TnLnk2000DAO();
            ds = dao.tn_lnk_2035_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 
	}	
	
	public void tn_lnk_2040_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_2040_ADataSet ds = null;
		TN_LNK_2040_ADM dm = new TN_LNK_2040_ADM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cmsidx = Util.checkString(req.getParameter("cmsidx"));
		dm.chg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
        
        try {
        	TnLnk2000DAO dao = new TnLnk2000DAO();
            ds = dao.tn_lnk_2040_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 
	}
	
	public void tn_lnk_2051_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_2051_LDataSet ds = null;
		TN_LNK_2051_LDM dm = new TN_LNK_2051_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));

		dm.print();
        
        try {
        	TnLnk2000DAO dao = new TnLnk2000DAO();
            ds = dao.tn_lnk_2051_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 
	}	
	
	public void tn_lnk_2052_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_2052_ADataSet ds = null;
		TN_LNK_2052_ADM dm = new TN_LNK_2052_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cmsidx = (String)hash.get("cmsidx");
		dm.filenm = (String)hash.get("filename");
		dm.incmg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
        
        try {
        	TnLnk2000DAO dao = new TnLnk2000DAO();
            ds = dao.tn_lnk_2052_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 
	}

	public void tn_lnk_2065_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_2065_ADataSet ds = null;
		TN_LNK_2065_ADM dm = new TN_LNK_2065_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.filenm = Util.checkString(req.getParameter("filenm"));
		dm.record_clsf = (String)hash.get("record_clsf");
		dm.seq = (String)hash.get("seq");
		dm.organcode = (String)hash.get("organcode");
		dm.aplc_dt = (String)hash.get("aplc_dt");
		dm.aplc_clsf = (String)hash.get("aplc_clsf");
		dm.pymt_cd = (String)hash.get("pymt_cd");
		dm.bankcode = (String)hash.get("bankcode");
		dm.bankaccount = (String)hash.get("bankaccount");
		dm.bankaccountidentity = (String)hash.get("bankaccountidentity");
		dm.category = (String)hash.get("branchcode");
		dm.paytype = (String)hash.get("paytype");
		dm.ret_clsf = (String)hash.get("ret_clsf");
		dm.ret_cd = (String)hash.get("ret_cd");
		dm.validclsf = (String)hash.get("validclsf");
		dm.telno = (String)hash.get("telno");
		dm.chnl = (String)hash.get("chnl");
		dm.infodata = (String)hash.get("infodata");
		dm.incmg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		/*
		dm.cmpy_cd     = Util.checkString(req.getParameter("cmpy_cd"));
		dm.filenm 	   = Util.checkString(req.getParameter("filenm"));
		dm.f1iledata    = (String)hash.get("filedata");
		dm.record_clsf = (String)hash.get("record_clsf");
		dm.pymt_cd     = (String)hash.get("pymt_cd");
		dm.ret_clsf    = (String)hash.get("ret_clsf");
		dm.ret_cd 	   = (String)hash.get("ret_cd");
		dm.incmg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		System.out.println( "multi: " + req.getParameter("multiUpdateData") );
		*/
		
		dm.print();
        
        try {
        	TnLnk2000DAO dao = new TnLnk2000DAO();
            ds = dao.tn_lnk_2065_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 
	}

	public void tn_lnk_2067_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_2067_ADataSet ds = null;
		TN_LNK_2067_ADM dm = new TN_LNK_2067_ADM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.incmg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
        
        try {
        	TnLnk2000DAO dao = new TnLnk2000DAO();
            ds = dao.tn_lnk_2067_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 
	}
	
	
	public void tn_lnk_2070_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_2070_ADataSet ds = null;
		TN_LNK_2070_ADM dm = new TN_LNK_2070_ADM();

		dm.cmsidx = Util.checkString(req.getParameter("cmsidx"));
		dm.incmg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
        
        try {
        	TnLnk2000DAO dao = new TnLnk2000DAO();
            ds = dao.tn_lnk_2070_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 
	}
	
	public void tn_lnk_2071_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_2071_ADataSet ds = null;
		TN_LNK_2071_ADM dm = new TN_LNK_2071_ADM();

		dm.cmsidx = Util.checkString(req.getParameter("cmsidx"));
		dm.incmg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
        
        try {
        	TnLnk2000DAO dao = new TnLnk2000DAO();
            ds = dao.tn_lnk_2071_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 
	}
	
	public void tn_lnk_2100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_2100_LDataSet ds = null;
		TN_LNK_2100_LDM dm = new TN_LNK_2100_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));

		dm.print();

        try {
        	TnLnk2000DAO dao = new TnLnk2000DAO();
            ds = dao.tn_lnk_2100_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 
	}

	public void tn_lnk_2110_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_2110_SDataSet ds = null;
		TN_LNK_2110_SDM dm = new TN_LNK_2110_SDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.deptidx = Util.checkString(req.getParameter("deptidx"));
		dm.organcode = Util.checkString(req.getParameter("organcode"));
		dm.organpayaccount = Util.checkString(req.getParameter("organpayaccount"));
		dm.organrootaccount = Util.checkString(req.getParameter("organrootaccount"));
		dm.description = Util.checkString(req.getParameter("description"));
		dm.uselink = Util.checkString(req.getParameter("uselink"));
		dm.linktest = Util.checkString(req.getParameter("linktest"));
		dm.aplcfile_path = Util.checkString(req.getParameter("aplcfile_path"));
		dm.payfile_path = Util.checkString(req.getParameter("payfile_path"));
		dm.paydate = Util.checkString(req.getParameter("paydate"));
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);		
		
		dm.print();;

        try {
        	TnLnk2000DAO dao = new TnLnk2000DAO();
            ds = dao.tn_lnk_2110_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 
	}
	
}
