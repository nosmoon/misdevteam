/***************************************************************************************************
 * 파일명 : PL_BAS_1400WB.java
 * 기능 : 기초관리-기초잔액관리
 * 작성일자 : 2009.03.05
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
import chosun.ciis.pl.bas.dao.PL_BAS_1400DAO;
import chosun.ciis.pl.bas.dm.PL_BAS_1400_MDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1410_LDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1420_LDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1430_ADM;
import chosun.ciis.pl.bas.ds.PL_BAS_1400_MDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1410_LDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1420_LDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1430_ADataSet;
import chosun.ciis.pl.base.wb.BaseWB;

/**
 * 
 */
public class PL_BAS_1400WB extends BaseWB {

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
    public void pl_bas_1400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1400_MDataSet ds = null;

        // DM Setting
        PL_BAS_1400_MDM dm = new PL_BAS_1400_MDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_BAS_1400DAO dao = new PL_BAS_1400DAO();
            ds = dao.pl_bas_1400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1400EJBHome home = (PL_BAS_1400EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1400EJB");
//        try {
//        	PL_BAS_1400EJB ejb = home.create();
//            ds = ejb.pl_bas_1400_m(dm);
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
    public void pl_bas_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1410_LDataSet ds = null;

        // DM Setting
        PL_BAS_1410_LDM dm = new PL_BAS_1410_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
        String dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf")));			//거래처구분
        String area = Util.Uni2Ksc(Util.checkString(req.getParameter("area")));						//지역
        String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));				//거래처코드

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setDlco_clsf(dlco_clsf);
        dm.setArea(area);
        dm.setDlco_cd(dlco_cd);

        try {
        	PL_BAS_1400DAO dao = new PL_BAS_1400DAO();
            ds = dao.pl_bas_1410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1400EJBHome home = (PL_BAS_1400EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1400EJB");
//        try {
//        	PL_BAS_1400EJB ejb = home.create();
//            ds = ejb.pl_bas_1410_l(dm);
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
    public void pl_bas_1420_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1420_LDataSet ds = null;

        // DM Setting
        PL_BAS_1420_LDM dm = new PL_BAS_1420_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
        String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));				//거래처코드
        String dlco_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_seq")));				//거래처순번

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setDlco_cd(dlco_cd);
        dm.setDlco_seq(dlco_seq);

        try {
        	PL_BAS_1400DAO dao = new PL_BAS_1400DAO();
            ds = dao.pl_bas_1420_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1400EJBHome home = (PL_BAS_1400EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1400EJB");
//        try {
//        	PL_BAS_1400EJB ejb = home.create();
//            ds = ejb.pl_bas_1420_l(dm);
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
    public void pl_bas_1430_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1430_ADataSet ds = null;

        // DM Setting
        PL_BAS_1430_ADM dm = new PL_BAS_1430_ADM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자
		String incmg_pers_ip = req.getRemoteAddr();   												//입력자IP                           

        //정상적으로 Request로 받을 파라메터
		String acc_flag = Util.checkString(req.getParameter("acc_flag"));							//처리구분코드(저장:S, 삭제:D)
    	String updateData = Util.checkString(req.getParameter("updateData"));						//조정내역

    	Hashtable hash = getHashMultiUpdateData(updateData);										//멀티데이터분리

    	String mode_arr = (String)hash.get("m");													//row state
    	String reg_dt_arr = (String)hash.get("reg_dt");												//등록일자
    	String reg_seq_arr = (String)hash.get("reg_seq");											//등록순번
    	String dlco_cd_arr = (String)hash.get("dlco_cd");											//거래처코드
    	String dlco_seq_arr = (String)hash.get("dlco_seq");											//거래처순번
    	String medi_clsf_arr = (String)hash.get("medi_clsf");										//매체구분
    	String meda_clsf_arr = (String)hash.get("meda_clsf");										//조정구분
    	String setup_dt_arr = (String)hash.get("setup_dt");											//설정일자
    	String basi_yymm_arr = (String)hash.get("basi_yymm");										//기준년월
    	String setup_amt_arr = (String)hash.get("setup_amt");										//설정금액
    	String dd_clos_yn_arr = (String)hash.get("dd_clos_yn");										//일마감여부
    	String remk_arr = (String)hash.get("remk");													//비고

        //DM 값을 Setting한다.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setMode_arr(mode_arr);
		dm.setReg_dt_arr(reg_dt_arr);
		dm.setReg_seq_arr(reg_seq_arr);
		dm.setDlco_cd_arr(dlco_cd_arr);
		dm.setDlco_seq_arr(dlco_seq_arr);
		dm.setMedi_clsf_arr(medi_clsf_arr);
		dm.setMeda_clsf_arr(meda_clsf_arr);
		dm.setSetup_dt_arr(setup_dt_arr);
		dm.setBasi_yymm_arr(basi_yymm_arr);
		dm.setSetup_amt_arr(setup_amt_arr);
		dm.setDd_clos_yn_arr(dd_clos_yn_arr);
		dm.setRemk_arr(remk_arr);

        try {
        	PL_BAS_1400DAO dao = new PL_BAS_1400DAO();
            ds = dao.pl_bas_1430_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1400EJBHome home = (PL_BAS_1400EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1400EJB");
//        try {
//        	PL_BAS_1400EJB ejb = home.create();
//            ds = ejb.pl_bas_1430_a(dm);
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
