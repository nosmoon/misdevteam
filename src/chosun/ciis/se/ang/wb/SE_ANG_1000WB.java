/***************************************************************************************************
 * ���ϸ� : SE_ANG_1010WB.java
 * ��� : ������ ��ǥ���
 * �ۼ����� : 2009-03-20
 * �ۼ��� : ��â��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.ang.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.ang.ds.*;
import chosun.ciis.se.ang.dm.*;
import chosun.ciis.se.ang.dao.SE_ANG_1000DAO;
/**
 * 
 */

public class SE_ANG_1000WB extends BaseWB {

    /**
     * �ʱ� ȭ��
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_ang_1010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_ANG_1010_LDataSet ds = null;
		SE_ANG_1010_LDM dm = new SE_ANG_1010_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "uid", true);
	
		dm.print();
        

        try {
        	SE_ANG_1000DAO dao = new SE_ANG_1000DAO();
            ds = dao.se_ang_1010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}


    /**
     * �����ȸ
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_ang_1020_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_ANG_1020_LDataSet ds = null;
		SE_ANG_1020_LDM dm = new SE_ANG_1020_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.bo_cd = Util.checkString(req.getParameter("bo_cd"));

		dm.print();
		
        try {
        	SE_ANG_1000DAO dao = new SE_ANG_1000DAO();
            ds = dao.se_ang_1020_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}
	
	/**
     * ���/����/����
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_ang_1030_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_ANG_1030_UDataSet ds = null;
		SE_ANG_1030_UDM dm = new SE_ANG_1030_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_nm = Util.checkString(req.getParameter("dept_nm"));
		dm.part_nm = Util.checkString(req.getParameter("part_nm"));
		dm.area_nm = Util.checkString(req.getParameter("area_nm"));
		dm.bo_cd = Util.checkString(req.getParameter("bo_cd"));
		dm.bo_nm = Util.checkString(req.getParameter("bo_nm"));
		dm.bo_seq = Util.checkString(req.getParameter("bo_seq"));
		dm.qty = Util.checkString(req.getParameter("qty"));
		dm.uprc = Util.checkString(req.getParameter("uprc"));
		dm.amt = Util.checkString(req.getParameter("amt"));
		dm.clsf = Util.checkString(req.getParameter("clsf"));
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		System.out.println("==========================\n REQ bo_nm : " + req.getParameter("bo_nm") + "\n==========================");
		dm.print();

        try {
        	SE_ANG_1000DAO dao = new SE_ANG_1000DAO();
            ds = dao.se_ang_1030_u(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}

		
}
