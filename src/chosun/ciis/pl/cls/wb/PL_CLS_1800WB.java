/***************************************************************************************************
 * 파일명 : PL_CLS_1000WB.java
 * 기능 : 마감관리-입금일마감
 * 작성일자 : 2009.05.13
 * 작성자 : 김상옥
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.cls.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.base.wb.BaseWB;
import chosun.ciis.pl.cls.dao.*;
import chosun.ciis.pl.cls.dm.*;
import chosun.ciis.pl.cls.dm.*;
import chosun.ciis.pl.cls.ds.*;
import chosun.ciis.pl.cls.ds.*;

/**
 * 
 */
public class PL_CLS_1800WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";

    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**
     * 조회 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @return void
     */

	public void pl_cls_1810_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		PL_CLS_1810_LDataSet ds = null;
		PL_CLS_1810_LDM dm = new PL_CLS_1810_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);	
		dm.yymm = Util.checkString(req.getParameter("yymm"));

		dm.print();

        try {
        	PL_CLS_1800DAO dao = new PL_CLS_1800DAO();
            ds = dao.pl_cls_1810_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

	}
	
	public void pl_cls_1815_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		PL_CLS_1815_LDataSet ds = null;
		PL_CLS_1815_LDM dm = new PL_CLS_1815_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);	
		dm.yymm = Util.checkString(req.getParameter("yymm"));

		dm.print();

        try {
        	PL_CLS_1800DAO dao = new PL_CLS_1800DAO();
            ds = dao.pl_cls_1815_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

	}
	public void pl_cls_1820_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		PL_CLS_1820_ADataSet ds = null;
		PL_CLS_1820_ADM dm = new PL_CLS_1820_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		
		String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
    	dm.mode_ar = mode_ar.toUpperCase();
		dm.bo_cdseq_ar = (String)hash.get("dlco_cd");
		dm.rcpm_amt_ar = (String)hash.get("rcpm_amt");
		dm.ern_ar = (String)hash.get("ern");
    	
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();

		dm.print();

		 try {
	        	PL_CLS_1800DAO dao = new PL_CLS_1800DAO();
	            ds = dao.pl_cls_1820_a(dm);
	            req.setAttribute("ds", ds);
	        }
	        catch (AppException e) {
	            LogManager.getInstance().log(e);
	            throw e;
		}

	}
	public void pl_cls_1830_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		PL_CLS_1830_ADataSet ds = null;
		PL_CLS_1830_ADM dm = new PL_CLS_1830_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();

		dm.print();

		 try {
	        	PL_CLS_1800DAO dao = new PL_CLS_1800DAO();
	            ds = dao.pl_cls_1830_a(dm);
	            req.setAttribute("ds", ds);
	        }
	        catch (AppException e) {
	            LogManager.getInstance().log(e);
	            throw e;
		}
	} 
	public void pl_cls_1840_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		PL_CLS_1840_ADataSet ds = null;
		PL_CLS_1840_ADM dm = new PL_CLS_1840_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clos_yn = Util.checkString(req.getParameter("clos_yn"));
		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();

		dm.print();

		 try {
	        	PL_CLS_1800DAO dao = new PL_CLS_1800DAO();
	            ds = dao.pl_cls_1840_a(dm);
	            req.setAttribute("ds", ds);
	        }
	        catch (AppException e) {
	            LogManager.getInstance().log(e);
	            throw e;
		}

	}
   
}
