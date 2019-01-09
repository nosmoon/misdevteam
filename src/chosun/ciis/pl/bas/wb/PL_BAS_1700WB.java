/***************************************************************************************************
 * 파일명 : PL_BAS_1700WB.java
 * 기능 : 기초관리-매출매입기준관리
 * 작성일자 : 2009.06.15
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
import chosun.ciis.pl.bas.dao.PL_BAS_1700DAO;
import chosun.ciis.pl.bas.dm.PL_BAS_1700_MDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1710_LDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1720_ADM;
import chosun.ciis.pl.bas.ds.PL_BAS_1700_MDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1710_LDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1720_ADataSet;
import chosun.ciis.pl.base.wb.BaseWB;

/**
 * 
 */
public class PL_BAS_1700WB extends BaseWB {

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
    public void pl_bas_1700_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1700_MDataSet ds = null;

        // DM Setting
        PL_BAS_1700_MDM dm = new PL_BAS_1700_MDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_BAS_1700DAO dao = new PL_BAS_1700DAO();
            ds = dao.pl_bas_1700_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1700EJBHome home = (PL_BAS_1700EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1700EJB");
//        try {
//        	PL_BAS_1700EJB ejb = home.create();
//            ds = ejb.pl_bas_1700_m(dm);
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
    public void pl_bas_1710_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1710_LDataSet ds = null;

        // DM Setting
        PL_BAS_1710_LDM dm = new PL_BAS_1710_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));								//매체코드
		String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));							//거래처구분

        //DM 값을 Setting한다.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setMedi_cd(medi_cd);
		dm.setDlco_clsf(dlco_clsf);

        try {
        	PL_BAS_1700DAO dao = new PL_BAS_1700DAO();
            ds = dao.pl_bas_1710_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1700EJBHome home = (PL_BAS_1700EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1700EJB");
//        try {
//        	PL_BAS_1700EJB ejb = home.create();
//            ds = ejb.pl_bas_1710_l(dm);
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
    public void pl_bas_1720_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1720_ADataSet ds = null;

        // DM Setting
        PL_BAS_1720_ADM dm = new PL_BAS_1720_ADM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자
		String incmg_pers_ip = req.getRemoteAddr();   												//입력자IP                           

        //정상적으로 Request로 받을 파라메터
		String acc_flag = Util.checkString(req.getParameter("acc_flag"));							//처리구분코드(저장:S, 삭제:D)
		String medi_cd_old = Util.checkString(req.getParameter("medi_cd_old"));						//매체코드(구)
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));								//매체코드
		String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));							//거래처구분
		String aply_bgn_yymm = Util.checkString(req.getParameter("aply_bgn_yymm"));					//적용시작년월
		String aply_end_yymm = Util.checkString(req.getParameter("aply_end_yymm"));					//적용종료년월
		String sale_aply_clsf = Util.checkString(req.getParameter("sale_aply_clsf"));				//매출적용구분
		String sale_rate = Util.checkString(req.getParameter("sale_rate"));							//매출요율
		String purc_aply_clsf = Util.checkString(req.getParameter("purc_aply_clsf"));				//매입적용구분
		String purc_rate = Util.checkString(req.getParameter("purc_rate"));							//매입요율
		String cntr_amt = Util.checkString(req.getParameter("cntr_amt"));							//계약금액
		String dcrate_basi = Util.checkString(req.getParameter("dcrate_basi"));						//할제기준
		String dcrate_basi_rate = Util.checkString(req.getParameter("dcrate_basi_rate"));			//할제기준요율

        //DM 값을 Setting한다.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setMedi_cd_old(medi_cd_old);
		dm.setMedi_cd(medi_cd);
		dm.setDlco_clsf(dlco_clsf);
		dm.setAply_bgn_yymm(aply_bgn_yymm);
		dm.setAply_end_yymm(aply_end_yymm);
		dm.setSale_aply_clsf(sale_aply_clsf);
		dm.setSale_rate(sale_rate);
		dm.setPurc_aply_clsf(purc_aply_clsf);
		dm.setPurc_rate(purc_rate);
		dm.setCntr_amt(cntr_amt);
		dm.setDcrate_basi(dcrate_basi);
		dm.setDcrate_basi_rate(dcrate_basi_rate);

        try {
        	PL_BAS_1700DAO dao = new PL_BAS_1700DAO();
            ds = dao.pl_bas_1720_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1700EJBHome home = (PL_BAS_1700EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1700EJB");
//        try {
//        	PL_BAS_1700EJB ejb = home.create();
//            ds = ejb.pl_bas_1720_a(dm);
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
