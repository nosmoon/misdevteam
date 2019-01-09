/***************************************************************************************************
* 파일명 : SE_SAL_2600WB.java
* 기능 : 판매 - 매출관리 - 단건계산서등록
* 작성일자 : 2009-07-20
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.sal.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.sal.dao.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;

/**
 * 
 */

public class SE_SAL_2800WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_sal_2800_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SAL_2800_LDataSet ds = null;
		SE_SAL_2800_LDM dm = new SE_SAL_2800_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.widr_yymm = Util.checkString(req.getParameter("widr_yymm"));
//		dm.print();
		
        try {
        	SE_SAL_2800DAO dao = new SE_SAL_2800DAO();
            ds = dao.se_sal_2800_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}

	public void se_sal_2810_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SAL_2810_LDataSet ds = null;
		SE_SAL_2810_LDM dm = new SE_SAL_2810_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.bo_cd = Util.checkString(req.getParameter("bo_cd"));
		dm.bo_seq = Util.checkString(req.getParameter("bo_seq"));
		//dm.print();
		
        try {
        	SE_SAL_2800DAO dao = new SE_SAL_2800DAO();
            ds = dao.se_sal_2810_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}	
	
	public void se_sal_2815_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SAL_2815_LDataSet ds = null;
		SE_SAL_2815_LDM dm = new SE_SAL_2815_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.bo_cd = Util.checkString(req.getParameter("bo_cd"));
		dm.bo_seq = Util.checkString(req.getParameter("bo_seq"));
		//dm.print();
		
        try {
        	SE_SAL_2800DAO dao = new SE_SAL_2800DAO();
            ds = dao.se_sal_2815_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}	

	public void se_sal_2820_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SAL_2820_ADataSet ds = null;
		SE_SAL_2820_ADM dm = new SE_SAL_2820_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.bo_cd = Util.checkString(req.getParameter("bo_cd"));
		dm.bo_seq = Util.checkString(req.getParameter("bo_seq"));
		dm.widr_bgn_mm = Util.checkString(req.getParameter("widr_bgn_mm"));
		
        String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash				= new Hashtable();
		hash 						= getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = Util.checkString((String) hash.get("m"));				
		dm.widr_yymm = Util.checkString((String) hash.get("widr_yymm"));
		dm.widr_mm_amt = Util.checkString((String) hash.get("widr_mm_amt"));
		
		//dm.print();
		
        try {
        	SE_SAL_2800DAO dao = new SE_SAL_2800DAO();
            ds = dao.se_sal_2820_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}
}
