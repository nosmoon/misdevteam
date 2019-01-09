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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.tn.lnk.dao.TnLnk3000DAO;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class TnLnk3000WB extends BaseWB {


    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void tn_lnk_3000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_3000_MDataSet ds = null;
		TN_LNK_3000_MDM dm = new TN_LNK_3000_MDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));

		dm.print();
        
        try {
        	TnLnk3000DAO dao = new TnLnk3000DAO();
            ds = dao.tn_lnk_3000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 

    }
	
	public void tn_lnk_3010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_3010_LDataSet ds = null;
		TN_LNK_3010_LDM dm = new TN_LNK_3010_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.pymt_yymm = Util.checkString(req.getParameter("pymt_yymm"));
		dm.pymt_day = Util.checkString(req.getParameter("pymt_day"));
		dm.proc_clsf = Util.checkString(req.getParameter("proc_clsf"));
		dm.dt_clsf = Util.checkString(req.getParameter("dt_clsf"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));

		dm.print();
        
        try {
        	TnLnk3000DAO dao = new TnLnk3000DAO();
            ds = dao.tn_lnk_3010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 

    }

	public void tn_lnk_3020_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_3020_LDataSet ds = null;
		TN_LNK_3020_LDM dm = new TN_LNK_3020_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.pymtmm = Util.checkString(req.getParameter("pymtmm"));
		dm.pymtdd = Util.checkString(req.getParameter("pymtdd"));
		dm.cmsidx = Util.checkString(req.getParameter("cmsidx"));
		dm.deptidx = Util.checkString(req.getParameter("deptidx"));
		dm.supp_clsf = Util.checkString(req.getParameter("supp_clsf"));
		dm.result_stat = Util.checkString(req.getParameter("result_stat"));
		dm.search_clsf = Util.checkString(req.getParameter("search_clsf"));
		dm.search_nm = Util.checkString(req.getParameter("search_nm"));

		dm.print();

        try {
        	TnLnk3000DAO dao = new TnLnk3000DAO();
            ds = dao.tn_lnk_3020_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 

    }
	
	public void tn_lnk_3030_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_3030_LDataSet ds = null;
		TN_LNK_3030_LDM dm = new TN_LNK_3030_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.pymtmm = Util.checkString(req.getParameter("pymtmm"));
		dm.pymtdd = Util.checkString(req.getParameter("pymtdd"));
		dm.cmsidx = Util.checkString(req.getParameter("cmsidx"));
		dm.deptidx = Util.checkString(req.getParameter("deptidx"));
		dm.supp_clsf = Util.checkString(req.getParameter("supp_clsf"));
		dm.search_clsf = Util.checkString(req.getParameter("search_clsf"));
		dm.search_nm = Util.checkString(req.getParameter("search_nm"));

		dm.print();

        try {
        	TnLnk3000DAO dao = new TnLnk3000DAO();
            ds = dao.tn_lnk_3030_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 

    }
	

	public void tn_lnk_3035_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_3035_ADataSet ds = null;
		TN_LNK_3035_ADM dm = new TN_LNK_3035_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println( (String)hash.get("promiseidx") );
		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.file_clsf = Util.checkString(req.getParameter("file_clsf"));
		dm.pymtdd = Util.checkString(req.getParameter("pymtdd"));
		dm.promiseidx = (String)hash.get("promiseidx");
		dm.incmg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
        try {
        	TnLnk3000DAO dao = new TnLnk3000DAO();
            ds = dao.tn_lnk_3035_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 
	}

	public void tn_lnk_3040_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_3040_ADataSet ds = null;
		TN_LNK_3040_ADM dm = new TN_LNK_3040_ADM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cmsidx = Util.checkString(req.getParameter("cmsidx"));
		dm.chg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
 
		dm.print();
		
        try {
        	TnLnk3000DAO dao = new TnLnk3000DAO();
            ds = dao.tn_lnk_3040_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        } 
	}
	

	public void tn_lnk_3051_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_3051_LDataSet ds = null;
		TN_LNK_3051_LDM dm = new TN_LNK_3051_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.print();
		
        try {
        	TnLnk3000DAO dao = new TnLnk3000DAO();
            ds = dao.tn_lnk_3051_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
	}

	public void tn_lnk_3052_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_3052_ADataSet ds = null;
		TN_LNK_3052_ADM dm = new TN_LNK_3052_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cmsidx = (String)hash.get("cmsidx");
		dm.filenm = (String)hash.get("filename");
		dm.incmg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();		
		
        try {
        	TnLnk3000DAO dao = new TnLnk3000DAO();
            ds = dao.tn_lnk_3052_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
	}

	
	public void tn_lnk_3065_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_3065_ADataSet ds = null;
		TN_LNK_3065_ADM dm  = new TN_LNK_3065_ADM();
		TN_LNK_3066_ADM dm2 = new TN_LNK_3066_ADM();
		TnLnk3000DAO dao = new TnLnk3000DAO();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);	
		String	buff	= "";
		String  sdata	= "";
		String  seq_buff = "";
		String  rec_buff = "";
		String 	sep 	= "#";
		int readSize	= 150;
		int	limit		= 0;
		int start		= 0;
		int seq			= 0;
		int i 			= 0;
		
		dm.cmpy_cd     	= Util.checkString(req.getParameter("cmpy_cd"));
		dm2.filenm = dm.filenm 	   	= Util.checkString(req.getParameter("filenm"));
		dm.incmg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm2.incmg_pers = dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		
		buff = ((String)hash.get("filedata"));				
		limit = buff.getBytes().length / readSize;

		while(limit > 0) {
			sdata = getByteString(buff, start, readSize);
			start += readSize;
			
			seq_buff += seq++ + sep;
			rec_buff += sdata + sep;
			
			System.out.println("[" + limit + " / " + seq + "] " + sdata);

			if( i++ > 150) {
				dm2.seq      = seq_buff;
				dm2.filedata = rec_buff;
				dao.tn_lnk_3066_a(dm2);

				i = 0;
				seq_buff = "";
				rec_buff = "";
			}

			limit--;

		}

//		sdata = getByteString(buff, start, readSize);
//		System.out.println(sdata);
		//seq_buff = seq++ + sep;
		//rec_buff = sdata + sep;
		System.out.println("final (" + sdata.charAt(0) + "): " + sdata);
		if(sdata.charAt(0) != 'T') {
			System.out.println("need more...");
			//start += readSize;
			sdata = getByteString(buff, start, readSize);
			System.out.println(sdata);
			seq_buff += seq++ + sep;
			rec_buff += sdata + sep;
			
			dm2.seq      = seq_buff;
			dm2.filedata = rec_buff;
			dao.tn_lnk_3066_a(dm2);
		} else {
			//if( seq < 150) {
				dm2.seq      = seq_buff;
				dm2.filedata = rec_buff;
				dao.tn_lnk_3066_a(dm2);
			//}
			System.out.println("end...");
		}
		/*
		seq_buff += seq++ + sep;
		rec_buff += sdata + sep;
		dm2.seq      = seq_buff;
		dm2.filedata = rec_buff;
		dao.tn_lnk_3066_a(dm2);
		*/
		
		System.out.println("============= end parsing ============");


        try {
            ds = dao.tn_lnk_3065_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
	}
	
	public void tn_lnk_3070_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		TN_LNK_3070_ADataSet ds = null;
		TN_LNK_3070_ADM dm = new TN_LNK_3070_ADM();

		dm.cmsidx = Util.checkString(req.getParameter("cmsidx"));
		dm.incmg_pers_addr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);		

		dm.print();
		
        try {
        	TnLnk3000DAO dao = new TnLnk3000DAO();
            ds = dao.tn_lnk_3070_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
	}
	
	public static String getByteString(String s, int startIdx, int bytes) {
		int len = s.getBytes().length - startIdx;		
		if( bytes > len) bytes = len;
		return new String(s.getBytes(), startIdx, bytes);
	}

}
