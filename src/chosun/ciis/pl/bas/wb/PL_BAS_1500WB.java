/***************************************************************************************************
 * 파일명 : PL_BAS_1500WB.java
 * 기능 : 기초관리-목표관리
 * 작성일자 : 2009.04.30
 * 작성자 : 김상옥
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.bas.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.bas.dao.PL_BAS_1500DAO;
import chosun.ciis.pl.bas.dm.PL_BAS_1500_MDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1510_LDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1520_LDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1530_ADM;
import chosun.ciis.pl.bas.ds.PL_BAS_1500_MDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1510_LDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1520_LDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1530_ADataSet;
import chosun.ciis.pl.base.wb.BaseWB;

/**
 * 
 */
public class PL_BAS_1500WB extends BaseWB {

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
    public void pl_bas_1500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1500_MDataSet ds = null;

        // DM Setting
        PL_BAS_1500_MDM dm = new PL_BAS_1500_MDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_BAS_1500DAO dao = new PL_BAS_1500DAO();
            ds = dao.pl_bas_1500_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1500EJBHome home = (PL_BAS_1500EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1500EJB");
//        try {
//        	PL_BAS_1500EJB ejb = home.create();
//            ds = ejb.pl_bas_1500_m(dm);
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
     * 대상조회 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1510_LDataSet ds = null;

        // DM Setting
        PL_BAS_1510_LDM dm = new PL_BAS_1510_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
		String yy = Util.checkString(req.getParameter("yy"));										//년도
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));								//매체코드

        //DM 값을 Setting한다.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setYy(yy);
		dm.setMedi_cd(medi_cd);

        try {
        	PL_BAS_1500DAO dao = new PL_BAS_1500DAO();
            ds = dao.pl_bas_1510_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1500EJBHome home = (PL_BAS_1500EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1500EJB");
//        try {
//        	PL_BAS_1500EJB ejb = home.create();
//            ds = ejb.pl_bas_1510_l(dm);
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
    public void pl_bas_1520_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1520_LDataSet ds = null;

        // DM Setting
        PL_BAS_1520_LDM dm = new PL_BAS_1520_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
		String yy = Util.checkString(req.getParameter("yy"));										//년도
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));								//매체코드

        //DM 값을 Setting한다.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setYy(yy);
		dm.setMedi_cd(medi_cd);

        try {
        	PL_BAS_1500DAO dao = new PL_BAS_1500DAO();
            ds = dao.pl_bas_1520_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1500EJBHome home = (PL_BAS_1500EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1500EJB");
//        try {
//        	PL_BAS_1500EJB ejb = home.create();
//            ds = ejb.pl_bas_1520_l(dm);
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
     * 저장/삭제 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1530_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1530_ADataSet ds = null;

        // DM Setting
        PL_BAS_1530_ADM dm = new PL_BAS_1530_ADM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자
		String incmg_pers_ip = req.getRemoteAddr();   												//입력자IP                           

        //정상적으로 Request로 받을 파라메터
		String acc_flag = Util.checkString(req.getParameter("acc_flag"));							//처리구분코드(저장:S, 삭제:D)
		String yy = Util.checkString(req.getParameter("yy"));										//년도
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));								//매체코드
    	String updateData = Util.checkString(req.getParameter("updateData"));						//조정내역

    	Hashtable hash = getHashMultiUpdateData(updateData);										//멀티데이터분리

    	String medi_cd_arr = (String)hash.get("medi_cd");											//매체코드
    	String dlco_clsf_arr = (String)hash.get("dlco_clsf");										//거래처구분
    	String basi_yymm_arr = (String)hash.get("basi_yymm");										//기준년월
    	String trgt_qty_arr = (String)hash.get("trgt_qty");											//목표부수
    	String trgt_amt_arr = (String)hash.get("trgt_amt");											//목표금액

        //DM 값을 Setting한다.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setYy(yy);
		dm.setMedi_cd(medi_cd);
		dm.setMedi_cd_arr(medi_cd_arr);
		dm.setDlco_clsf_arr(dlco_clsf_arr);
		dm.setBasi_yymm_arr(basi_yymm_arr);
		dm.setTrgt_qty_arr(trgt_qty_arr);
		dm.setTrgt_amt_arr(trgt_amt_arr);

        try {
        	PL_BAS_1500DAO dao = new PL_BAS_1500DAO();
            ds = dao.pl_bas_1530_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1500EJBHome home = (PL_BAS_1500EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1500EJB");
//        try {
//        	PL_BAS_1500EJB ejb = home.create();
//            ds = ejb.pl_bas_1530_a(dm);
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
