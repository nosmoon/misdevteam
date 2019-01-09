/***************************************************************************************************
 * 파일명 : SE_TEST_1000WB.java
 * 기능 : 지역별 목표등록
 * 작성일자 : 2009-03-20
 * 작성자 : 배창희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.test.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.test.dao.SE_TEST_1000DAO;
import chosun.ciis.se.test.dm.SE_TEST_1000_ADM;
import chosun.ciis.se.test.dm.SE_TEST_1010_LDM;
import chosun.ciis.se.test.dm.SE_TEST_1020_LDM;
import chosun.ciis.se.test.dm.SE_TEST_1040_DDM;
import chosun.ciis.se.test.dm.SE_TEST_1050_LDM;
import chosun.ciis.se.test.ds.SE_TEST_1000_ADataSet;
import chosun.ciis.se.test.ds.SE_TEST_1010_LDataSet;
import chosun.ciis.se.test.ds.SE_TEST_1020_LDataSet;
import chosun.ciis.se.test.ds.SE_TEST_1040_DDataSet;
import chosun.ciis.se.test.ds.SE_TEST_1050_LDataSet;
/**
 * 
 */

public class SE_TEST_1000WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	
	public void se_test_1010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TEST_1010_LDataSet ds = null;
		SE_TEST_1010_LDM dm = new SE_TEST_1010_LDM();
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		//dm.emp_no = "b11213";
		dm.year = Util.checkString(req.getParameter("year"));
		dm.month = Util.checkString(req.getParameter("month"));
		dm.week = Util.checkString(req.getParameter("week"));
		dm.cmpycd = Util.checkString(req.getParameter("cmpycd"));
		dm.workcd = Util.checkString(req.getParameter("workcd"));
		dm.print();		
        try {
        	SE_TEST_1000DAO dao = new SE_TEST_1000DAO();
            ds = dao.se_test_1010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}
	
	public void se_test_1020_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TEST_1020_LDataSet ds = null;
		SE_TEST_1020_LDM dm = new SE_TEST_1020_LDM();
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		//dm.emp_no = "b11213";
		dm.year = Util.checkString(req.getParameter("year"));
		dm.month = Util.checkString(req.getParameter("month"));

		dm.print();		
        try {
        	SE_TEST_1000DAO dao = new SE_TEST_1000DAO();
            ds = dao.se_test_1020_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}
	
	public void se_test_1000_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TEST_1000_ADataSet ds = null;
		SE_TEST_1000_ADM dm = new SE_TEST_1000_ADM();
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		//dm.emp_no = "b11213";	
		dm.year = Util.checkString(req.getParameter("year"));
		dm.month = Util.checkString(req.getParameter("month"));
		dm.week = Util.checkString(req.getParameter("week"));
		dm.cmpycd = Util.checkString(req.getParameter("cmpycd"));
		dm.workcd = Util.checkString(req.getParameter("workcd"));
		dm.vip_lastweek = Util.checkString(req.getParameter("vip_lastweek"));
		dm.lastweek = Util.checkString(req.getParameter("lastweek"));
		dm.thisweek = Util.checkString(req.getParameter("thisweek"));

		dm.print();		
        try {
        	SE_TEST_1000DAO dao = new SE_TEST_1000DAO();
            ds = dao.se_test_1000_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}
	
	public void se_test_1040_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TEST_1040_DDataSet ds = null;
		SE_TEST_1040_DDM dm = new SE_TEST_1040_DDM();
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		//dm.emp_no = "b11213";	
		dm.mode = Util.checkString(req.getParameter("mode"));
		String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash				= new Hashtable();
		hash 						= getHashMultiUpdateData(multiUpdateData);

		dm.year = Util.checkString((String)hash.get("yy"));
		dm.month = Util.checkString((String)hash.get("mm"));
		dm.week = Util.checkString((String)hash.get("week"));
		dm.cmpycd = Util.checkString((String)hash.get("cmpycd"));
		dm.workcd = Util.checkString((String)hash.get("workcd"));
		//dm.vip_lastweek = Util.checkString((String)hash.get("vip_lastweek"));
		//dm.lastweek = Util.checkString((String)hash.get("lastweek"));
		//dm.thisweek = Util.checkString((String)hash.get("thisweek"));
		dm.print();		
        try {
        	SE_TEST_1000DAO dao = new SE_TEST_1000DAO();
            ds = dao.se_test_1040_d(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}
  
	public void se_test_1050_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TEST_1050_LDataSet ds = null;
		SE_TEST_1050_LDM dm = new SE_TEST_1050_LDM();
		//dm.emp_no = "b11213";	
		dm.year = Util.checkString(req.getParameter("yy"));
		dm.month = Util.checkString(req.getParameter("mm"));
		dm.week = Util.checkString(req.getParameter("week"));
		dm.print();		
        try {
        	SE_TEST_1000DAO dao = new SE_TEST_1000DAO();
            ds = dao.se_test_1050_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}
}
