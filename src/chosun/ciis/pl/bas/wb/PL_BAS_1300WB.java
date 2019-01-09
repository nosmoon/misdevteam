/***************************************************************************************************
 * 파일명 : PL_BAS_1300WB.java
 * 기능 : 기초관리-거래처취급매체관리
 * 작성일자 : 2009.02.27
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
import chosun.ciis.pl.bas.dao.PL_BAS_1300DAO;
import chosun.ciis.pl.bas.dm.PL_BAS_1300_MDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1310_LDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1320_LDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1330_ADM;
import chosun.ciis.pl.bas.dm.PL_BAS_1340_ADM;
import chosun.ciis.pl.bas.ds.PL_BAS_1300_MDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1310_LDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1320_LDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1330_ADataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1340_ADataSet;
import chosun.ciis.pl.base.wb.BaseWB;

/**
 * 
 */
public class PL_BAS_1300WB extends BaseWB {

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
    public void pl_bas_1300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1300_MDataSet ds = null;

        // DM Setting
        PL_BAS_1300_MDM dm = new PL_BAS_1300_MDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_BAS_1300DAO dao = new PL_BAS_1300DAO();
            ds = dao.pl_bas_1300_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1300EJBHome home = (PL_BAS_1300EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1300EJB");
//        try {
//        	PL_BAS_1300EJB ejb = home.create();
//            ds = ejb.pl_bas_1300_m(dm);
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
    public void pl_bas_1310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1310_LDataSet ds = null;

        // DM Setting
        PL_BAS_1310_LDM dm = new PL_BAS_1310_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
        String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));			//매체구분
        String issu_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_cmpy")));			//발행사

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setMedi_clsf(medi_clsf);
        dm.setIssu_cmpy(issu_cmpy);

        try {
        	PL_BAS_1300DAO dao = new PL_BAS_1300DAO();
            ds = dao.pl_bas_1310_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1300EJBHome home = (PL_BAS_1300EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1300EJB");
//        try {
//        	PL_BAS_1300EJB ejb = home.create();
//            ds = ejb.pl_bas_1310_l(dm);
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
     * 상세조회 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1320_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1320_LDataSet ds = null;

        // DM Setting
        PL_BAS_1320_LDM dm = new PL_BAS_1320_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
        String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));			//매체구분
        String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));				//매체코드
        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setMedi_clsf(medi_clsf);
        dm.setMedi_cd(medi_cd);

        try {
        	PL_BAS_1300DAO dao = new PL_BAS_1300DAO();
            ds = dao.pl_bas_1320_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1300EJBHome home = (PL_BAS_1300EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1300EJB");
//        try {
//        	PL_BAS_1300EJB ejb = home.create();
//            ds = ejb.pl_bas_1320_l(dm);
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
     * 저장 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1330_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1330_ADataSet ds = null;

        // DM Setting
        PL_BAS_1330_ADM dm = new PL_BAS_1330_ADM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자
		String incmg_pers_ip = req.getRemoteAddr();   												//입력자IP                           

        //정상적으로 Request로 받을 파라메터
    	String updateData = Util.checkString(req.getParameter("updateData"));						//거래처취급매체내역

    	Hashtable hash = getHashMultiUpdateData(updateData);										//멀티데이터분리

    	String medi_cd_arr = (String)hash.get("medi_cd");											//매체코드
    	String dlco_cd_arr = (String)hash.get("dlco_cd");											//거래처코드
    	String dlco_seq_arr = (String)hash.get("dlco_seq");											//거래처순번
    	String deal_yn_arr = (String)hash.get("deal_yn");											//거래여부
    	String no_val_exne_arr = (String)hash.get("no_val_exne");									//무가유무
    	String dcrate_arr = (String)hash.get("dcrate");												//할제
    	String wh_cd_arr = (String)hash.get("wh_cd");												//창고코드
    	String sendclsf_arr = (String)hash.get("sendclsf");											//발송구분
    	String remk_arr = (String)hash.get("remk");													//비고

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setMedi_cd_arr(medi_cd_arr);
        dm.setDlco_cd_arr(dlco_cd_arr);
        dm.setDlco_seq_arr(dlco_seq_arr);
        dm.setDeal_yn_arr(deal_yn_arr);
        dm.setNo_val_exne_arr(no_val_exne_arr);
        dm.setDcrate_arr(dcrate_arr);
        dm.setWh_cd_arr(wh_cd_arr);
        dm.setSendclsf_arr(sendclsf_arr);
        dm.setRemk_arr(remk_arr);

        try {
        	PL_BAS_1300DAO dao = new PL_BAS_1300DAO();
            ds = dao.pl_bas_1330_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1300EJBHome home = (PL_BAS_1300EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1300EJB");
//        try {
//        	PL_BAS_1300EJB ejb = home.create();
//            ds = ejb.pl_bas_1330_a(dm);
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
     * 생성 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1340_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1340_ADataSet ds = null;

        // DM Setting
        PL_BAS_1340_ADM dm = new PL_BAS_1340_ADM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자
		String incmg_pers_ip = req.getRemoteAddr();   												//입력자IP                           

        //정상적으로 Request로 받을 파라메터
    	String basi_medi = Util.checkString(req.getParameter("basi_medi"));							//기준매체
    	String targ_medi = Util.checkString(req.getParameter("targ_medi"));							//대상매체

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setBasi_medi(basi_medi);
        dm.setTarg_medi(targ_medi);

        try {
        	PL_BAS_1300DAO dao = new PL_BAS_1300DAO();
            ds = dao.pl_bas_1340_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
    }
    
}
