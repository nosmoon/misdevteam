/***************************************************************************************************
 * ���ϸ� : PL_CLS_1000WB.java
 * ��� : ��������-�Ա��ϸ���
 * �ۼ����� : 2009.05.13
 * �ۼ��� : ����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
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
     * ��Ƽ���ڵ�ó�� row ������
     */
    public final String ROW_SEPARATOR = "|";

    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    public final String COL_SEPARATOR = "#";

    /**
     * ��ȸ Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
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
