/***************************************************************************************************
 * 파일명 : PL_ASS_1000WB.java
 * 기능 : 배정관리-정간물배정
 * 작성일자 : 2009.03.12
 * 작성자 : 김상옥
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.ass.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.ass.dao.PL_ASS_1000DAO;
import chosun.ciis.pl.ass.dm.PL_ASS_1000_MDM;
import chosun.ciis.pl.ass.dm.PL_ASS_1010_LDM;
import chosun.ciis.pl.ass.dm.PL_ASS_1020_LDM;
import chosun.ciis.pl.ass.dm.PL_ASS_1030_ADM;
import chosun.ciis.pl.ass.dm.PL_ASS_1040_SDM;
import chosun.ciis.pl.ass.ds.PL_ASS_1000_MDataSet;
import chosun.ciis.pl.ass.ds.PL_ASS_1010_LDataSet;
import chosun.ciis.pl.ass.ds.PL_ASS_1020_LDataSet;
import chosun.ciis.pl.ass.ds.PL_ASS_1030_ADataSet;
import chosun.ciis.pl.ass.ds.PL_ASS_1040_SDataSet;
import chosun.ciis.pl.base.wb.BaseWB;

/**
 * 
 */
public class PL_ASS_1000WB extends BaseWB {

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
    public void pl_ass_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_ASS_1000_MDataSet ds = null;

        // DM Setting
        PL_ASS_1000_MDM dm = new PL_ASS_1000_MDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_ASS_1000DAO dao = new PL_ASS_1000DAO();
            ds = dao.pl_ass_1000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_ASS_1000EJBHome home = (PL_ASS_1000EJBHome) JNDIManager.getInstance().getHome("PL_ASS_1000EJB");
//        try {
//        	PL_ASS_1000EJB ejb = home.create();
//            ds = ejb.pl_ass_1000_m(dm);
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
     * 배정계획 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_ass_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_ASS_1010_LDataSet ds = null;

        // DM Setting
        PL_ASS_1010_LDM dm = new PL_ASS_1010_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));								//매체코드
		String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));						//매체호수
		String ref_ser_no_1 = Util.checkString(req.getParameter("ref_ser_no_1"));					//참조호수1
		String ref_ser_no_2 = Util.checkString(req.getParameter("ref_ser_no_2"));					//참조호수2
		String basi_bgn_ser_no = Util.checkString(req.getParameter("basi_bgn_ser_no"));				//기준시작호수
		String basi_end_ser_no = Util.checkString(req.getParameter("basi_end_ser_no"));				//기준종료호수
		String prd = Util.checkString(req.getParameter("prd"));										//기간

        //DM 값을 Setting한다.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setMedi_cd(medi_cd);
		dm.setMedi_ser_no(medi_ser_no);
		dm.setRef_ser_no_1(ref_ser_no_1);
		dm.setRef_ser_no_2(ref_ser_no_2);
		dm.setBasi_bgn_ser_no(basi_bgn_ser_no);
		dm.setBasi_end_ser_no(basi_end_ser_no);
		dm.setPrd(prd);

        try {
        	PL_ASS_1000DAO dao = new PL_ASS_1000DAO();
            ds = dao.pl_ass_1010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_ASS_1000EJBHome home = (PL_ASS_1000EJBHome) JNDIManager.getInstance().getHome("PL_ASS_1000EJB");
//        try {
//        	PL_ASS_1000EJB ejb = home.create();
//            ds = ejb.pl_ass_1010_l(dm);
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
     * 배정조회 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_ass_1020_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_ASS_1020_LDataSet ds = null;

        // DM Setting
        PL_ASS_1020_LDM dm = new PL_ASS_1020_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
        String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));				//매체코드
        String medi_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_ser_no")));		//매체호수

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setMedi_cd(medi_cd);
        dm.setMedi_ser_no(medi_ser_no);

        try {
        	PL_ASS_1000DAO dao = new PL_ASS_1000DAO();
            ds = dao.pl_ass_1020_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
           throw e;
        }

//        PL_ASS_1000EJBHome home = (PL_ASS_1000EJBHome) JNDIManager.getInstance().getHome("PL_ASS_1000EJB");
//        try {
//        	PL_ASS_1000EJB ejb = home.create();
//            ds = ejb.pl_ass_1020_l(dm);
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
     * 등록/수정/삭제 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_ass_1030_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_ASS_1030_ADataSet ds = null;

        // DM Setting
        PL_ASS_1030_ADM dm = new PL_ASS_1030_ADM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);							//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);							//사용자
		String incmg_pers_ip = req.getRemoteAddr();   													//입력자IP                           

        //정상적으로 Request로 받을 파라메터
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));					//처리구분
		String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));					//매체코드
		String medi_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_ser_no")));			//매체호수
		String ref_ser_no_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ref_ser_no_1")));			//참조호수1
		String ref_ser_no_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ref_ser_no_2")));			//참조호수2
		String basi_bgn_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_bgn_ser_no")));	//기준시작호수
		String basi_end_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_end_ser_no")));	//기준종료호수
		String prd = Util.Uni2Ksc(Util.checkString(req.getParameter("prd")));							//기간
		String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));							//비고

    	String updateData = Util.checkString(req.getParameter("updateData"));							//배정내역

    	Hashtable hash = getHashMultiUpdateData(updateData);											//멀티데이터분리

    	String mode_arr = (String)hash.get("m");														//구분모드 배열     
    	String dlco_cd_arr = (String)hash.get("dlco_cd");												//거래처코드 배열   
    	String dlco_seq_arr = (String)hash.get("dlco_seq");												//거래처순번 배열   
    	String send_plac_seq_arr = (String)hash.get("send_plac_seq");									//발송처순번 배열   
    	String sale_clsf_arr = (String)hash.get("sale_clsf");											//매출구분 배열     
    	String sendclsf_arr = (String)hash.get("sendclsf");												//발송구분 배열     
    	String sell_type_arr = (String)hash.get("sell_type");											//판매유형 배열     
    	String wh_cd_arr = (String)hash.get("wh_cd");													//창고코드 배열     
    	String asin_qty_arr = (String)hash.get("asin_qty");												//배정부수 배열     
    	String dcrate_arr = (String)hash.get("dcrate");													//할제 배열         
    	String calc_qty_arr = (String)hash.get("calc_qty");												//산출부수 배열     
    	String tot_deli_qty_arr = (String)hash.get("tot_deli_qty");										//총배본부수 배열   
    	String avg_deli_qty_arr = (String)hash.get("avg_deli_qty");										//평균배본부수 배열 
    	String tot_sell_qty_arr = (String)hash.get("tot_sell_qty");										//총판매부수 배열   
    	String tot_rtgqty_arr = (String)hash.get("tot_rtgqty");											//총반품부수 배열   
    	String avg_sell_qty_arr = (String)hash.get("avg_sell_qty");										//평균판매부수 배열 
    	String ocpy_rate_arr = (String)hash.get("ocpy_rate");											//점유율 배열       
    	String ref_deli_qty_1_arr = (String)hash.get("ref_deli_qty_1");									//참조배본부수1 배열
    	String ref_sell_qty_1_arr = (String)hash.get("ref_sell_qty_1");									//참조판매부수1 배열
    	String ref_deli_qty_2_arr = (String)hash.get("ref_deli_qty_2");									//참조배본부수2 배열
    	String ref_sell_qty_2_arr = (String)hash.get("ref_sell_qty_2");									//참조판매부수2 배열
    	String appndx_1_arr = (String)hash.get("appndx_1");												//부록1 배열        
    	String appndx_2_arr = (String)hash.get("appndx_2");												//부록2 배열        
    	String appndx_3_arr = (String)hash.get("appndx_3");												//부록3 배열        
    	String remk_arr = (String)hash.get("remk");														//비고 배열         

        //DM 값을 Setting한다.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setMedi_cd(medi_cd);
		dm.setMedi_ser_no(medi_ser_no);
		dm.setRef_ser_no_1(ref_ser_no_1);
		dm.setRef_ser_no_2(ref_ser_no_2);
		dm.setBasi_bgn_ser_no(basi_bgn_ser_no);
		dm.setBasi_end_ser_no(basi_end_ser_no);
		dm.setPrd(prd);
		dm.setRemk(remk);
        dm.setMode_arr(mode_arr.toUpperCase());
		dm.setDlco_cd_arr(dlco_cd_arr);
		dm.setDlco_seq_arr(dlco_seq_arr);
		dm.setSend_plac_seq_arr(send_plac_seq_arr);
		dm.setSale_clsf_arr(sale_clsf_arr);
		dm.setSendclsf_arr(sendclsf_arr);
		dm.setSell_type_arr(sell_type_arr);
		dm.setWh_cd_arr(wh_cd_arr);
		dm.setAsin_qty_arr(asin_qty_arr);
		dm.setDcrate_arr(dcrate_arr);
		dm.setCalc_qty_arr(calc_qty_arr);
		dm.setTot_deli_qty_arr(tot_deli_qty_arr);
		dm.setAvg_deli_qty_arr(avg_deli_qty_arr);
		dm.setTot_sell_qty_arr(tot_sell_qty_arr);
		dm.setTot_rtgqty_arr(tot_rtgqty_arr);
		dm.setAvg_sell_qty_arr(avg_sell_qty_arr);
		dm.setOcpy_rate_arr(ocpy_rate_arr);
		dm.setRef_deli_qty_1_arr(ref_deli_qty_1_arr);
		dm.setRef_sell_qty_1_arr(ref_sell_qty_1_arr);
		dm.setRef_deli_qty_2_arr(ref_deli_qty_2_arr);
		dm.setRef_sell_qty_2_arr(ref_sell_qty_2_arr);
		dm.setAppndx_1_arr(appndx_1_arr);
		dm.setAppndx_2_arr(appndx_2_arr);
		dm.setAppndx_3_arr(appndx_3_arr);
		dm.setRemk_arr(remk_arr);

        try {
        	PL_ASS_1000DAO dao = new PL_ASS_1000DAO();
            ds = dao.pl_ass_1030_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_ASS_1000EJBHome home = (PL_ASS_1000EJBHome) JNDIManager.getInstance().getHome("PL_ASS_1000EJB");
//        try {
//        	PL_ASS_1000EJB ejb = home.create();
//            ds = ejb.pl_ass_1030_a(dm);
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
     * 호수Get Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_ass_1040_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_ASS_1040_SDataSet ds = null;

        // DM Setting
        PL_ASS_1040_SDM dm = new PL_ASS_1040_SDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
        String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));				//매체코드
        String medi_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_ser_no")));		//매체호수

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setMedi_cd(medi_cd);
        dm.setMedi_ser_no(medi_ser_no);

        try {
        	PL_ASS_1000DAO dao = new PL_ASS_1000DAO();
            ds = dao.pl_ass_1040_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_ASS_1000EJBHome home = (PL_ASS_1000EJBHome) JNDIManager.getInstance().getHome("PL_ASS_1000EJB");
//        try {
//        	PL_ASS_1000EJB ejb = home.create();
//            ds = ejb.pl_ass_1040_s(dm);
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
