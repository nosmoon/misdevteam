/***************************************************************************************************
 * 파일명 : PL_COM_1300WB.java
 * 기능 : 공통관리-사내판매입금처리
 * 작성일자 : 2009.04.22
 * 작성자 : 김상옥
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.com.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.base.wb.BaseWB;
import chosun.ciis.pl.com.dao.PL_COM_1300DAO;
import chosun.ciis.pl.com.dm.PL_COM_1300_MDM;
import chosun.ciis.pl.com.dm.PL_COM_1310_LDM;
import chosun.ciis.pl.com.dm.PL_COM_1320_ADM;
import chosun.ciis.pl.com.ds.PL_COM_1300_MDataSet;
import chosun.ciis.pl.com.ds.PL_COM_1310_LDataSet;
import chosun.ciis.pl.com.ds.PL_COM_1320_ADataSet;

/**
 * 
 */
public class PL_COM_1300WB extends BaseWB {

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
    public void pl_com_1300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_COM_1300_MDataSet ds = null;

        // DM Setting
        PL_COM_1300_MDM dm = new PL_COM_1300_MDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
		String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));								//거래처코드
		String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));							//거래처순번
		String ordr_dt = Util.checkString(req.getParameter("ordr_dt"));								//주문일자
		String ordr_grp_seq = Util.checkString(req.getParameter("ordr_grp_seq"));					//주문그룹순번

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);
		dm.setOrdr_dt(ordr_dt);
		dm.setOrdr_grp_seq(ordr_grp_seq);

        try {
        	PL_COM_1300DAO dao = new PL_COM_1300DAO();
            ds = dao.pl_com_1300_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_COM_1300EJBHome home = (PL_COM_1300EJBHome) JNDIManager.getInstance().getHome("PL_COM_1300EJB");
//        try {
//        	PL_COM_1300EJB ejb = home.create();
//            ds = ejb.pl_com_1300_m(dm);
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
    public void pl_com_1310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_COM_1310_LDataSet ds = null;

        // DM Setting
        PL_COM_1310_LDM dm = new PL_COM_1310_LDM();

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
        	PL_COM_1300DAO dao = new PL_COM_1300DAO();
            ds = dao.pl_com_1310_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_COM_1300EJBHome home = (PL_COM_1300EJBHome) JNDIManager.getInstance().getHome("PL_COM_1300EJB");
//        try {
//        	PL_COM_1300EJB ejb = home.create();
//            ds = ejb.pl_com_1310_l(dm);
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
    public void pl_com_1320_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_COM_1320_ADataSet ds = null;

        // DM Setting
        PL_COM_1320_ADM dm = new PL_COM_1320_ADM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자
		String incmg_pers_ip = req.getRemoteAddr();   												//입력자IP                           

        //정상적으로 Request로 받을 파라메터
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));				//처리구분
		String h_rcpm_dt = Util.checkString(req.getParameter("h_rcpm_dt"));							//입금일자
		String h_dlco_cd = Util.checkString(req.getParameter("h_dlco_cd"));                         //거래처코드
		String h_dlco_seq = Util.checkString(req.getParameter("h_dlco_seq"));                       //거래처순번
		String h_rcpm_shet_no = Util.checkString(req.getParameter("h_rcpm_shet_no"));				//입금표번호
		String h_occr_dt = Util.checkString(req.getParameter("h_occr_dt"));							//발생일자
		String h_slip_clsf = Util.checkString(req.getParameter("h_slip_clsf"));						//전표구분
		String h_seq = Util.checkString(req.getParameter("h_seq"));									//순번
		String h_gurt_amt = Util.checkString(req.getParameter("h_gurt_amt"));						//보증금액
		String h_deal_dt = Util.checkString(req.getParameter("h_deal_dt"));							//거래일자
		String h_deal_grp_seq = Util.checkString(req.getParameter("h_deal_grp_seq"));				//거래그룹순번
		String h_ordr_dt = Util.checkString(req.getParameter("h_ordr_dt"));							//주문일자
		String h_ordr_grp_seq = Util.checkString(req.getParameter("h_ordr_grp_seq"));				//주문그룹순번
		String h_dr_rcpm_amt_sum = Util.checkString(req.getParameter("h_dr_rcpm_amt_sum"));			//차변금액합
		String h_crdt_rcpm_amt_sum = Util.checkString(req.getParameter("h_crdt_rcpm_amt_sum"));		//대변금액합

		//차변내역
    	String updateData1 = Util.Uni2Ksc(Util.checkString(req.getParameter("updateData1")));		//차변내역
    	Hashtable hash1 = getHashMultiUpdateData(updateData1);										//멀티데이터분리

    	String d_rcpm_type_arr = (String)hash1.get("d_rcpm_type");									//입금형태 배열     
    	String d_amt_arr = (String)hash1.get("d_amt");												//금액 배열   
    	String d_rmtt_dt_arr = (String)hash1.get("d_rmtt_dt");										//송금일자(수납일자) 배열   
    	String d_rmtt_plac_arr = (String)hash1.get("d_rmtt_plac");									//송금처 배열   
    	String d_acct_mang_no_arr = (String)hash1.get("d_acct_mang_no");							//계좌관리번호 배열 
    	String d_note_no_arr = (String)hash1.get("d_note_no");										//어음번호 배열         
    	String d_note_clsf_cd_arr = (String)hash1.get("d_note_clsf_cd");							//어음구분코드 배열 
    	String d_bank_cd_arr = (String)hash1.get("d_bank_cd");										//은행코드 배열     
    	String d_issu_pers_nm_arr = (String)hash1.get("d_issu_pers_nm");							//발행자명 배열   
    	String d_issu_cmpy_clsf_cd_arr = (String)hash1.get("d_issu_cmpy_clsf_cd");					//발행사구분코드 배열     
    	String d_comp_dt_arr = (String)hash1.get("d_comp_dt");										//기산일자 배열     
    	String d_mtry_dt_arr = (String)hash1.get("d_mtry_dt");										//만기일자 배열         
    	String d_remk_arr = (String)hash1.get("d_remk");											//비고 배열     
    	String d_slip_clsf_arr = (String)hash1.get("d_slip_clsf");									//전표구분 배열         
    	String d_seq_arr = (String)hash1.get("d_seq");												//순번 배열     
    	String d_subseq_arr = (String)hash1.get("d_subseq");										//서브순번 배열         
    	String d_dd_clos_yn_arr = (String)hash1.get("d_dd_clos_yn");								//마감여부 배열     

		//대변내역
    	String updateData2 = Util.Uni2Ksc(Util.checkString(req.getParameter("updateData2")));		//대변내역
    	Hashtable hash2 = getHashMultiUpdateData(updateData2);										//멀티데이터분리

    	String c_budg_clsf_arr = (String)hash2.get("c_budg_clsf");									//예산구분 배열     
    	String c_basi_yymm_arr = (String)hash2.get("c_basi_yymm");									//기준년월 배열   
    	String c_amt_arr = (String)hash2.get("c_amt");												//금액 배열   
    	String c_remk_arr = (String)hash2.get("c_remk");											//비고 배열   
    	String c_slip_clsf_arr = (String)hash2.get("c_slip_clsf");									//전표구분 배열 
    	String c_seq_arr = (String)hash2.get("c_seq");												//순번 배열         
    	String c_subseq_arr = (String)hash2.get("c_subseq");										//서브순번 배열 
    	String c_dd_clos_yn_arr = (String)hash2.get("c_dd_clos_yn");								//마감여부 배열     

        //DM 값을 Setting한다.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setH_rcpm_dt(h_rcpm_dt);
		dm.setH_dlco_cd(h_dlco_cd);
		dm.setH_dlco_seq(h_dlco_seq);
		dm.setH_rcpm_shet_no(h_rcpm_shet_no);
		dm.setH_occr_dt(h_occr_dt);
		dm.setH_slip_clsf(h_slip_clsf);
		dm.setH_seq(h_seq);
		dm.setH_gurt_amt(h_gurt_amt);
		dm.setH_deal_dt(h_deal_dt);
		dm.setH_deal_grp_seq(h_deal_grp_seq);
		dm.setH_ordr_dt(h_ordr_dt);
		dm.setH_ordr_grp_seq(h_ordr_grp_seq);
		dm.setH_dr_rcpm_amt_sum(h_dr_rcpm_amt_sum);
		dm.setH_crdt_rcpm_amt_sum(h_crdt_rcpm_amt_sum);
		dm.setD_rcpm_type_arr(d_rcpm_type_arr);
		dm.setD_amt_arr(d_amt_arr);
		dm.setD_rmtt_dt_arr(d_rmtt_dt_arr);
		dm.setD_rmtt_plac_arr(d_rmtt_plac_arr);
		dm.setD_acct_mang_no_arr(d_acct_mang_no_arr);
		dm.setD_note_no_arr(d_note_no_arr);
		dm.setD_note_clsf_cd_arr(d_note_clsf_cd_arr);
		dm.setD_bank_cd_arr(d_bank_cd_arr);
		dm.setD_issu_pers_nm_arr(d_issu_pers_nm_arr);
		dm.setD_issu_cmpy_clsf_cd_arr(d_issu_cmpy_clsf_cd_arr);
		dm.setD_comp_dt_arr(d_comp_dt_arr);
		dm.setD_mtry_dt_arr(d_mtry_dt_arr);
		dm.setD_remk_arr(d_remk_arr);
		dm.setD_slip_clsf_arr(d_slip_clsf_arr);
		dm.setD_seq_arr(d_seq_arr);
		dm.setD_subseq_arr(d_subseq_arr);
		dm.setD_dd_clos_yn_arr(d_dd_clos_yn_arr);
		dm.setC_budg_clsf_arr(c_budg_clsf_arr);
		dm.setC_basi_yymm_arr(c_basi_yymm_arr);
		dm.setC_amt_arr(c_amt_arr);
		dm.setC_remk_arr(c_remk_arr);
		dm.setC_slip_clsf_arr(c_slip_clsf_arr);
		dm.setC_seq_arr(c_seq_arr);
		dm.setC_subseq_arr(c_subseq_arr);
		dm.setC_dd_clos_yn_arr(c_dd_clos_yn_arr);

        try {
        	PL_COM_1300DAO dao = new PL_COM_1300DAO();
            ds = dao.pl_com_1320_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_COM_1300EJBHome home = (PL_COM_1300EJBHome) JNDIManager.getInstance().getHome("PL_COM_1300EJB");
//        try {
//        	PL_COM_1300EJB ejb = home.create();
//            ds = ejb.pl_com_1320_a(dm);
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
