/***************************************************************************************************
 * 파일명 : PL_RCP_1100WB.java
 * 기능 : 입금관리-입금반환처리
 * 작성일자 : 2009.04.23
 * 작성자 : 김상옥
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.rcp.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.base.wb.BaseWB;
import chosun.ciis.pl.rcp.dao.PL_RCP_1100DAO;
import chosun.ciis.pl.rcp.dm.PL_RCP_1100_MDM;
import chosun.ciis.pl.rcp.dm.PL_RCP_1110_LDM;
import chosun.ciis.pl.rcp.dm.PL_RCP_1120_LDM;
import chosun.ciis.pl.rcp.dm.PL_RCP_1130_LDM;
import chosun.ciis.pl.rcp.dm.PL_RCP_1140_ADM;
import chosun.ciis.pl.rcp.ds.PL_RCP_1100_MDataSet;
import chosun.ciis.pl.rcp.ds.PL_RCP_1110_LDataSet;
import chosun.ciis.pl.rcp.ds.PL_RCP_1120_LDataSet;
import chosun.ciis.pl.rcp.ds.PL_RCP_1130_LDataSet;
import chosun.ciis.pl.rcp.ds.PL_RCP_1140_ADataSet;

/**
 * 
 */
public class PL_RCP_1100WB extends BaseWB {

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
    public void pl_rcp_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RCP_1100_MDataSet ds = null;

        // DM Setting
        PL_RCP_1100_MDM dm = new PL_RCP_1100_MDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_RCP_1100DAO dao = new PL_RCP_1100DAO();
            ds = dao.pl_rcp_1100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RCP_1100EJBHome home = (PL_RCP_1100EJBHome) JNDIManager.getInstance().getHome("PL_RCP_1100EJB");
//        try {
//        	PL_RCP_1100EJB ejb = home.create();
//            ds = ejb.pl_rcp_1100_m(dm);
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
    public void pl_rcp_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RCP_1110_LDataSet ds = null;

        // DM Setting
        PL_RCP_1110_LDM dm = new PL_RCP_1110_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
		String basi_dt_fr = Util.checkString(req.getParameter("basi_dt_fr"));						//기준년월시작
		String basi_dt_to = Util.checkString(req.getParameter("basi_dt_to"));						//기준년월종료
		String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));								//거래처코드
		String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));							//거래처순번

        //DM 값을 Setting한다.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setBasi_dt_fr(basi_dt_fr);
		dm.setBasi_dt_to(basi_dt_to);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);

        try {
        	PL_RCP_1100DAO dao = new PL_RCP_1100DAO();
            ds = dao.pl_rcp_1110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RCP_1100EJBHome home = (PL_RCP_1100EJBHome) JNDIManager.getInstance().getHome("PL_RCP_1100EJB");
//        try {
//        	PL_RCP_1100EJB ejb = home.create();
//            ds = ejb.pl_rcp_1110_l(dm);
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
    public void pl_rcp_1120_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RCP_1120_LDataSet ds = null;

        // DM Setting
        PL_RCP_1120_LDM dm = new PL_RCP_1120_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
		String occr_dt = Util.checkString(req.getParameter("occr_dt"));								//발생일자
		String slip_clsf = Util.checkString(req.getParameter("slip_clsf"));                         //전표구분
		String seq = Util.checkString(req.getParameter("seq"));                                     //순번
		String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));                             //거래처코드
		String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));                           //거래처순번

        //DM 값을 Setting한다.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setOccr_dt(occr_dt);
		dm.setSlip_clsf(slip_clsf);
		dm.setSeq(seq);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);

        try {
        	PL_RCP_1100DAO dao = new PL_RCP_1100DAO();
            ds = dao.pl_rcp_1120_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RCP_1100EJBHome home = (PL_RCP_1100EJBHome) JNDIManager.getInstance().getHome("PL_RCP_1100EJB");
//        try {
//        	PL_RCP_1100EJB ejb = home.create();
//            ds = ejb.pl_rcp_1120_l(dm);
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
     * 보증금및마감정보조회 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_rcp_1130_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RCP_1130_LDataSet ds = null;

        // DM Setting
        PL_RCP_1130_LDM dm = new PL_RCP_1130_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
		String dlco_cd = Util.checkString(req.getParameter("h_dlco_cd"));                           //거래처코드
		String dlco_seq = Util.checkString(req.getParameter("h_dlco_seq"));                         //거래처순번

        //DM 값을 Setting한다.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);

        try {
        	PL_RCP_1100DAO dao = new PL_RCP_1100DAO();
            ds = dao.pl_rcp_1130_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RCP_1100EJBHome home = (PL_RCP_1100EJBHome) JNDIManager.getInstance().getHome("PL_RCP_1100EJB");
//        try {
//        	PL_RCP_1100EJB ejb = home.create();
//            ds = ejb.pl_rcp_1130_l(dm);
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
    public void pl_rcp_1140_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RCP_1140_ADataSet ds = null;

        // DM Setting
        PL_RCP_1140_ADM dm = new PL_RCP_1140_ADM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자
		String incmg_pers_ip = req.getRemoteAddr();   												//입력자IP                           

        //정상적으로 Request로 받을 파라메터
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));				//처리구분
		String h_rcpm_dt = Util.checkString(req.getParameter("h_rcpm_dt"));							//입금일자
		String h_dlco_cd = Util.checkString(req.getParameter("h_dlco_cd"));                         //거래처코드
		String h_dlco_seq = Util.checkString(req.getParameter("h_dlco_seq"));                       //거래처순번
		String h_occr_dt = Util.checkString(req.getParameter("h_occr_dt"));							//발생일자
		String h_slip_clsf = Util.checkString(req.getParameter("h_slip_clsf"));						//전표구분
		String h_seq = Util.checkString(req.getParameter("h_seq"));									//순번
		String h_dd_clos_yn = Util.checkString(req.getParameter("h_dd_clos_yn"));					//일마감여부
		String h_gurt_amt = Util.checkString(req.getParameter("h_gurt_amt"));						//보증금액

		//반환내역
    	String updateData = Util.Uni2Ksc(Util.checkString(req.getParameter("updateData")));			//반환내역
    	Hashtable hash = getHashMultiUpdateData(updateData);										//멀티데이터분리

    	String c_budg_clsf_arr = (String)hash.get("c_budg_clsf");									//예산구분 배열     
    	String c_basi_yymm_arr = (String)hash.get("c_basi_yymm");									//기준년월 배열   
    	String c_amt_arr = (String)hash.get("c_amt");												//금액 배열   
    	String c_remk_arr = (String)hash.get("c_remk");												//비고 배열   
    	String c_slip_clsf_arr = (String)hash.get("c_slip_clsf");									//전표구분 배열 
    	String c_seq_arr = (String)hash.get("c_seq");												//순번 배열         
    	String c_subseq_arr = (String)hash.get("c_subseq");											//서브순번 배열 
    	String c_dd_clos_yn_arr = (String)hash.get("c_dd_clos_yn");									//마감여부 배열     

        //DM 값을 Setting한다.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setH_rcpm_dt(h_rcpm_dt);
		dm.setH_dlco_cd(h_dlco_cd);
		dm.setH_dlco_seq(h_dlco_seq);
		dm.setH_occr_dt(h_occr_dt);
		dm.setH_slip_clsf(h_slip_clsf);
		dm.setH_seq(h_seq);
		dm.setH_dd_clos_yn(h_dd_clos_yn);
		dm.setH_gurt_amt(h_gurt_amt);
		dm.setC_budg_clsf_arr(c_budg_clsf_arr);
		dm.setC_basi_yymm_arr(c_basi_yymm_arr);
		dm.setC_amt_arr(c_amt_arr);
		dm.setC_remk_arr(c_remk_arr);
		dm.setC_slip_clsf_arr(c_slip_clsf_arr);
		dm.setC_seq_arr(c_seq_arr);
		dm.setC_subseq_arr(c_subseq_arr);
		dm.setC_dd_clos_yn_arr(c_dd_clos_yn_arr);

        try {
        	PL_RCP_1100DAO dao = new PL_RCP_1100DAO();
            ds = dao.pl_rcp_1140_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RCP_1100EJBHome home = (PL_RCP_1100EJBHome) JNDIManager.getInstance().getHome("PL_RCP_1100EJB");
//        try {
//        	PL_RCP_1100EJB ejb = home.create();
//            ds = ejb.pl_rcp_1140_a(dm);
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
