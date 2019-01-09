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
import chosun.ciis.pl.cls.ds.*;
/**
 * 
 */
public class PL_CLS_1700WB extends BaseWB {

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
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_cls_1710_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_CLS_1710_LDataSet ds = null;

        // DM Setting
        PL_CLS_1710_LDM dm = new PL_CLS_1710_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
       
        //정상적으로 Request로 받을 파라메터
		String issu_dt = Util.checkString(req.getParameter("issu_dt"));						//기준일자FROM
		
        //DM 값을 Setting한다.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIssu_dt(issu_dt);

		dm.print();
		
		
        try {
        	PL_CLS_1700DAO dao = new PL_CLS_1700DAO();
            ds = dao.pl_cls_1710_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_CLS_1000EJBHome home = (PL_CLS_1000EJBHome) JNDIManager.getInstance().getHome("PL_CLS_1000EJB");
//        try {
//        	PL_CLS_1000EJB ejb = home.create();
//            ds = ejb.pl_cls_1010_l(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
    
    /**
     * 마감/마감취소 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_cls_1720_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_CLS_1720_ADataSet ds = null;

        // DM Setting
        PL_CLS_1720_ADM dm = new PL_CLS_1720_ADM();
        
        String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		//System.out.println(multiUpdateData);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.bo_cd = Util.checkString((String)hash.get("bo_cd"));
		dm.gnr_qty = Util.checkString((String)hash.get("gnr_qty"));
		dm.net_sale_amt = Util.checkString((String)hash.get("net_sale_amt"));
		
        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자
		String incmg_pers_ip = req.getRemoteAddr();   												//입력자IP                           

        //정상적으로 Request로 받을 파라메터
		String acc_flag = Util.checkString(req.getParameter("acc_flag"));							//처리구분
		String issu_dt = Util.checkString(req.getParameter("issu_dt"));								//기준일자(마감일자)
		
        //DM 값을 Setting한다.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setIssu_dt(issu_dt);
		dm.print();
		
		
        try {
        	PL_CLS_1700DAO dao = new PL_CLS_1700DAO();
            ds = dao.pl_cls_1720_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

    }
    
    public void pl_cls_1730_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_CLS_1730_ADataSet ds = null;

        // DM Setting
        PL_CLS_1730_ADM dm = new PL_CLS_1730_ADM();

        //Session에서 얻을 데이타
        String uid    	  = Util.getSessionParameterValue(req, "uid", true);						//사용자ID
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자
		String incmg_pers_ip = req.getRemoteAddr();   												//입력자IP                           

        //정상적으로 Request로 받을 파라메터
		String acc_flag = Util.checkString(req.getParameter("acc_flag"));							//처리구분
		String basi_dt = Util.checkString(req.getParameter("issu_dt"));								//기준일자(마감일자)
		String basi_yymm = basi_dt.substring(0, 6);							//기준년월
		
        //DM 값을 Setting한다.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setUid(uid);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setBasi_yymm(basi_yymm);
		dm.setBasi_dt(basi_dt);
		dm.print();
		
		
        try {
        	PL_CLS_1700DAO dao = new PL_CLS_1700DAO();
            ds = dao.pl_cls_1730_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

    }
    
 public void pl_cls_1740_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_CLS_1740_LDataSet ds = null;

        // DM Setting
        PL_CLS_1740_LDM dm = new PL_CLS_1740_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
       
        //정상적으로 Request로 받을 파라메터
		String issu_dt = Util.checkString(req.getParameter("issu_dt"));						//기준일자FROM
		
        //DM 값을 Setting한다.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIssu_dt(issu_dt);
		dm.print();
		
		
        try {
        	PL_CLS_1700DAO dao = new PL_CLS_1700DAO();
            ds = dao.pl_cls_1740_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

    }
}
