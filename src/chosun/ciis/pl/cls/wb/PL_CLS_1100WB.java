/***************************************************************************************************
 * 파일명 : PL_CLS_1100WB.java
 * 기능 : 마감관리-사내판매일마감
 * 작성일자 : 2009.05.11
 * 작성자 : 김상옥
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.cls.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.base.wb.BaseWB;
import chosun.ciis.pl.cls.dao.PL_CLS_1100DAO;
import chosun.ciis.pl.cls.dm.PL_CLS_1100_MDM;
import chosun.ciis.pl.cls.dm.PL_CLS_1110_LDM;
import chosun.ciis.pl.cls.dm.PL_CLS_1120_ADM;
import chosun.ciis.pl.cls.ds.PL_CLS_1100_MDataSet;
import chosun.ciis.pl.cls.ds.PL_CLS_1110_LDataSet;
import chosun.ciis.pl.cls.ds.PL_CLS_1120_ADataSet;

/**
 * 
 */
public class PL_CLS_1100WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";

    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**
     * 초기화면 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_cls_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_CLS_1100_MDataSet ds = null;

        // DM Setting
        PL_CLS_1100_MDM dm = new PL_CLS_1100_MDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_CLS_1100DAO dao = new PL_CLS_1100DAO();
            ds = dao.pl_cls_1100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_CLS_1100EJBHome home = (PL_CLS_1100EJBHome) JNDIManager.getInstance().getHome("PL_CLS_1100EJB");
//        try {
//        	PL_CLS_1100EJB ejb = home.create();
//            ds = ejb.pl_cls_1100_m(dm);
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
     * 조회 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_cls_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_CLS_1110_LDataSet ds = null;

        // DM Setting
        PL_CLS_1110_LDM dm = new PL_CLS_1110_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));							//매체구분
		String basi_dt_fr = Util.checkString(req.getParameter("basi_dt_fr"));						//기준일자FROM
		String basi_dt_to = Util.checkString(req.getParameter("basi_dt_to"));						//기준일자TO

        //DM 값을 Setting한다.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setMedi_clsf(medi_clsf);
		dm.setBasi_dt_fr(basi_dt_fr);
		dm.setBasi_dt_to(basi_dt_to);

        try {
        	PL_CLS_1100DAO dao = new PL_CLS_1100DAO();
            ds = dao.pl_cls_1110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_CLS_1100EJBHome home = (PL_CLS_1100EJBHome) JNDIManager.getInstance().getHome("PL_CLS_1100EJB");
//        try {
//        	PL_CLS_1100EJB ejb = home.create();
//            ds = ejb.pl_cls_1110_l(dm);
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
    public void pl_cls_1120_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_CLS_1120_ADataSet ds = null;

        // DM Setting
        PL_CLS_1120_ADM dm = new PL_CLS_1120_ADM();

        //Session에서 얻을 데이타
        String uid    	  = Util.getSessionParameterValue(req, "uid", true);						//사용자ID
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자
		String incmg_pers_ip = req.getRemoteAddr();   												//입력자IP                           

        //정상적으로 Request로 받을 파라메터
		String acc_flag = Util.checkString(req.getParameter("acc_flag"));							//처리구분
		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));							//매체구분
		String basi_dt = Util.checkString(req.getParameter("basi_dt"));								//기준일자(마감일자)

        //DM 값을 Setting한다.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setUid(uid);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setMedi_clsf(medi_clsf);
		dm.setBasi_dt(basi_dt);

        try {
        	PL_CLS_1100DAO dao = new PL_CLS_1100DAO();
            ds = dao.pl_cls_1120_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_CLS_1100EJBHome home = (PL_CLS_1100EJBHome) JNDIManager.getInstance().getHome("PL_CLS_1100EJB");
//        try {
//        	PL_CLS_1100EJB ejb = home.create();
//            ds = ejb.pl_cls_1120_a(dm);
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
    
}
