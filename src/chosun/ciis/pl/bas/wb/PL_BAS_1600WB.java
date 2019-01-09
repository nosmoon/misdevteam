/***************************************************************************************************
 * 파일명 : PL_BAS_1600WB.java
 * 기능 : 기초관리-매체코드관리
 * 작성일자 : 2009.05.18
 * 작성자 : 김상옥
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.bas.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.bas.dao.PL_BAS_1600DAO;
import chosun.ciis.pl.bas.dm.PL_BAS_1600_MDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1610_LDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1620_ADM;
import chosun.ciis.pl.bas.ds.PL_BAS_1600_MDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1610_LDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1620_ADataSet;
import chosun.ciis.pl.base.wb.BaseWB;

/**
 * 
 */
public class PL_BAS_1600WB extends BaseWB {

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
    public void pl_bas_1600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1600_MDataSet ds = null;

        // DM Setting
        PL_BAS_1600_MDM dm = new PL_BAS_1600_MDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_BAS_1600DAO dao = new PL_BAS_1600DAO();
            ds = dao.pl_bas_1600_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1600EJBHome home = (PL_BAS_1600EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1600EJB");
//        try {
//        	PL_BAS_1600EJB ejb = home.create();
//            ds = ejb.pl_bas_1600_m(dm);
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
    public void pl_bas_1610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1610_LDataSet ds = null;

        // DM Setting
        PL_BAS_1610_LDM dm = new PL_BAS_1610_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
		String issu_cmpy = Util.checkString(req.getParameter("issu_cmpy"));							//발행사
		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));							//매체구분

        //DM 값을 Setting한다.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIssu_cmpy(issu_cmpy);
		dm.setMedi_clsf(medi_clsf);

        try {
        	PL_BAS_1600DAO dao = new PL_BAS_1600DAO();
            ds = dao.pl_bas_1610_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1600EJBHome home = (PL_BAS_1600EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1600EJB");
//        try {
//        	PL_BAS_1600EJB ejb = home.create();
//            ds = ejb.pl_bas_1610_l(dm);
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
    public void pl_bas_1620_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1620_ADataSet ds = null;

        // DM Setting
        PL_BAS_1620_ADM dm = new PL_BAS_1620_ADM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자
		String incmg_pers_ip = req.getRemoteAddr();   												//입력자IP                           

        //정상적으로 Request로 받을 파라메터
		String acc_flag = Util.checkString(req.getParameter("acc_flag"));							//처리구분코드(저장:S, 삭제:D)
		String cd = Util.checkString(req.getParameter("cd"));										//코드(매체코드)
		String cdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cdnm")));						//코드명(매체코드명)
		String cd_abrv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("cd_abrv_nm")));			//약어명(매체코드약어명)
		String mang_cd_1 = Util.checkString(req.getParameter("mang_cd_1"));							//관리코드1(발행사)
		String mang_cd_2 = Util.checkString(req.getParameter("mang_cd_2"));							//관리코드2(매체구분)
		String mang_cd_3 = Util.checkString(req.getParameter("mang_cd_3"));							//관리코드3(호수기준)
		String mang_cd_4 = Util.checkString(req.getParameter("mang_cd_4"));							//관리코드4(발행구분)
		String mang_cd_5 = Util.checkString(req.getParameter("mang_cd_5"));							//관리코드5(기본창고)
		String mang_cd_6 = Util.checkString(req.getParameter("mang_cd_6"));							//관리코드6(출판지사단가적용율)
		String mang_cd_7 = Util.checkString(req.getParameter("mang_cd_7"));							//관리코드7(매출예산코드)
		String mang_cd_8 = Util.checkString(req.getParameter("mang_cd_8"));							//관리코드8(조선일보계열여부)
		String use_yn = Util.checkString(req.getParameter("use_yn"));								//사용여부

        //DM 값을 Setting한다.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setCd(cd);
		dm.setCdnm(cdnm);
		dm.setCd_abrv_nm(cd_abrv_nm);
		dm.setMang_cd_1(mang_cd_1);
		dm.setMang_cd_2(mang_cd_2);
		dm.setMang_cd_3(mang_cd_3);
		dm.setMang_cd_4(mang_cd_4);
		dm.setMang_cd_5(mang_cd_5);
		dm.setMang_cd_6(mang_cd_6);
		dm.setMang_cd_7(mang_cd_7);
		dm.setMang_cd_8(mang_cd_8);
		dm.setUse_yn(use_yn);

        try {
        	PL_BAS_1600DAO dao = new PL_BAS_1600DAO();
            ds = dao.pl_bas_1620_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1600EJBHome home = (PL_BAS_1600EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1600EJB");
//        try {
//        	PL_BAS_1600EJB ejb = home.create();
//            ds = ejb.pl_bas_1620_a(dm);
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
