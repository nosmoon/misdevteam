/***************************************************************************************************
 * 파일명 : PL_RTN_1100WB.java
 * 기능 : 반품관리-정간물매체별반품
 * 작성일자 : 2009.03.31
 * 작성자 : 김상옥
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.rtn.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.base.wb.BaseWB;
import chosun.ciis.pl.rtn.dao.PL_RTN_1100DAO;
import chosun.ciis.pl.rtn.dm.PL_RTN_1100_MDM;
import chosun.ciis.pl.rtn.dm.PL_RTN_1110_LDM;
import chosun.ciis.pl.rtn.dm.PL_RTN_1120_LDM;
import chosun.ciis.pl.rtn.dm.PL_RTN_1130_ADM;
import chosun.ciis.pl.rtn.ds.PL_RTN_1100_MDataSet;
import chosun.ciis.pl.rtn.ds.PL_RTN_1110_LDataSet;
import chosun.ciis.pl.rtn.ds.PL_RTN_1120_LDataSet;
import chosun.ciis.pl.rtn.ds.PL_RTN_1130_ADataSet;

/**
 * 
 */
public class PL_RTN_1100WB extends BaseWB {

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
    public void pl_rtn_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RTN_1100_MDataSet ds = null;

        // DM Setting
        PL_RTN_1100_MDM dm = new PL_RTN_1100_MDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_RTN_1100DAO dao = new PL_RTN_1100DAO();
            ds = dao.pl_rtn_1100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RTN_1100EJBHome home = (PL_RTN_1100EJBHome) JNDIManager.getInstance().getHome("PL_RTN_1100EJB");
//        try {
//        	PL_RTN_1100EJB ejb = home.create();
//            ds = ejb.pl_rtn_1100_m(dm);
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
    public void pl_rtn_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RTN_1110_LDataSet ds = null;

        // DM Setting
        PL_RTN_1110_LDM dm = new PL_RTN_1110_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
//		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));							//매체구분
		String basi_dt_fr = Util.checkString(req.getParameter("basi_dt_fr"));						//기준년월시작
		String basi_dt_to = Util.checkString(req.getParameter("basi_dt_to"));						//기준년월종료
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));								//매체코드
		String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));						//매체호수

        //DM 값을 Setting한다.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setBasi_dt_fr(basi_dt_fr);
		dm.setBasi_dt_to(basi_dt_to);
		dm.setMedi_cd(medi_cd);
		dm.setMedi_ser_no(medi_ser_no);

        try {
        	PL_RTN_1100DAO dao = new PL_RTN_1100DAO();
            ds = dao.pl_rtn_1110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RTN_1100EJBHome home = (PL_RTN_1100EJBHome) JNDIManager.getInstance().getHome("PL_RTN_1100EJB");
//        try {
//        	PL_RTN_1100EJB ejb = home.create();
//            ds = ejb.pl_rtn_1110_l(dm);
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
    public void pl_rtn_1120_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RTN_1120_LDataSet ds = null;

        // DM Setting
        PL_RTN_1120_LDM dm = new PL_RTN_1120_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
		String deal_dt = Util.checkString(req.getParameter("deal_dt"));								//거래일자
		String deal_grp_seq = Util.checkString(req.getParameter("deal_grp_seq"));					//거래그룹순번

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
		dm.setDeal_dt(deal_dt);
		dm.setDeal_grp_seq(deal_grp_seq);

        try {
        	PL_RTN_1100DAO dao = new PL_RTN_1100DAO();
            ds = dao.pl_rtn_1120_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RTN_1100EJBHome home = (PL_RTN_1100EJBHome) JNDIManager.getInstance().getHome("PL_RTN_1100EJB");
//        try {
//        	PL_RTN_1100EJB ejb = home.create();
//            ds = ejb.pl_rtn_1120_l(dm);
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
    public void pl_rtn_1130_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RTN_1130_ADataSet ds = null;

        // DM Setting
        PL_RTN_1130_ADM dm = new PL_RTN_1130_ADM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);							//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);							//사용자
		String incmg_pers_ip = req.getRemoteAddr();   													//입력자IP                           

        //정상적으로 Request로 받을 파라메터
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));					//처리구분
		String deal_dt = Util.checkString(req.getParameter("deal_dt"));									//거래일자
		String deal_grp_seq = Util.checkString(req.getParameter("deal_grp_seq"));						//거래그룹순번
		String basi_yymm = Util.checkString(req.getParameter("basi_yymm"));								//기준년월
		String basi_dt = Util.checkString(req.getParameter("basi_dt"));									//기준일자
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));									//매체코드
		String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));							//매체호수
		String qty_chk = Util.checkString(req.getParameter("qty_chk"));									//부수체크

    	String updateData = Util.checkString(req.getParameter("updateData"));							//배본내역

    	Hashtable hash = getHashMultiUpdateData(updateData);											//멀티데이터분리

    	String mode_arr = (String)hash.get("m");														//구분모드 배열     
    	String deal_seq_arr = (String)hash.get("deal_seq");												//거래순번 배열     
    	String dlco_cd_arr = (String)hash.get("dlco_cd");												//거래처코드 배열   
    	String dlco_seq_arr = (String)hash.get("dlco_seq");												//거래처순번 배열   
    	String deal_qty_arr = (String)hash.get("deal_qty");												//거래부수 배열   
    	String deal_uprc_arr = (String)hash.get("deal_uprc");											//거래단가 배열 
    	String dcrate_arr = (String)hash.get("dcrate");													//할제 배열         
    	String deal_amt_arr = (String)hash.get("deal_amt");												//거래금액 배열 
    	String wh_cd_arr = (String)hash.get("wh_cd");													//창고코드 배열     
    	String remk_arr = (String)hash.get("remk");														//비고 배열         

        //DM 값을 Setting한다.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setDeal_dt(deal_dt);
		dm.setDeal_grp_seq(deal_grp_seq);
		dm.setBasi_yymm(basi_yymm);
		dm.setBasi_dt(basi_dt);
		dm.setMedi_cd(medi_cd);
		dm.setMedi_ser_no(medi_ser_no);
		dm.setQty_chk(qty_chk);
		dm.setMode_arr(mode_arr);
		dm.setDeal_seq_arr(deal_seq_arr);
		dm.setDlco_cd_arr(dlco_cd_arr);
		dm.setDlco_seq_arr(dlco_seq_arr);
		dm.setDeal_qty_arr(deal_qty_arr);
		dm.setDeal_uprc_arr(deal_uprc_arr);
		dm.setDcrate_arr(dcrate_arr);
		dm.setDeal_amt_arr(deal_amt_arr);
		dm.setWh_cd_arr(wh_cd_arr);
		dm.setRemk_arr(remk_arr);

        try {
        	PL_RTN_1100DAO dao = new PL_RTN_1100DAO();
            ds = dao.pl_rtn_1130_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RTN_1100EJBHome home = (PL_RTN_1100EJBHome) JNDIManager.getInstance().getHome("PL_RTN_1100EJB");
//        try {
//        	PL_RTN_1100EJB ejb = home.create();
//            ds = ejb.pl_rtn_1130_a(dm);
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
