/***************************************************************************************************
 * 파일명 : PL_SAL_1300WB.java
 * 기능 : 배본관리-매체별배본
 * 작성일자 : 2009.03.27
 * 작성자 : 김상옥
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.sal.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.base.wb.BaseWB;
import chosun.ciis.pl.sal.dao.PL_SAL_1300DAO;
import chosun.ciis.pl.sal.dm.PL_SAL_1300_MDM;
import chosun.ciis.pl.sal.dm.PL_SAL_1310_LDM;
import chosun.ciis.pl.sal.dm.PL_SAL_1320_LDM;
import chosun.ciis.pl.sal.dm.PL_SAL_1330_ADM;
import chosun.ciis.pl.sal.ds.PL_SAL_1300_MDataSet;
import chosun.ciis.pl.sal.ds.PL_SAL_1310_LDataSet;
import chosun.ciis.pl.sal.ds.PL_SAL_1320_LDataSet;
import chosun.ciis.pl.sal.ds.PL_SAL_1330_ADataSet;

/**
 * 
 */
public class PL_SAL_1300WB extends BaseWB {

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
    public void pl_sal_1300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_SAL_1300_MDataSet ds = null;

        // DM Setting
        PL_SAL_1300_MDM dm = new PL_SAL_1300_MDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_SAL_1300DAO dao = new PL_SAL_1300DAO();
            ds = dao.pl_sal_1300_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_SAL_1300EJBHome home = (PL_SAL_1300EJBHome) JNDIManager.getInstance().getHome("PL_SAL_1300EJB");
//        try {
//        	PL_SAL_1300EJB ejb = home.create();
//            ds = ejb.pl_sal_1300_m(dm);
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
    public void pl_sal_1310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_SAL_1310_LDataSet ds = null;

        // DM Setting
        PL_SAL_1310_LDM dm = new PL_SAL_1310_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));							//매체구분
		String basi_dt_fr = Util.checkString(req.getParameter("basi_dt_fr"));						//기준년월시작
		String basi_dt_to = Util.checkString(req.getParameter("basi_dt_to"));						//기준년월종료
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));								//매체코드
		String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));						//매체호수

        //DM 값을 Setting한다.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setMedi_clsf(medi_clsf);
		dm.setBasi_dt_fr(basi_dt_fr);
		dm.setBasi_dt_to(basi_dt_to);
		dm.setMedi_cd(medi_cd);
		dm.setMedi_ser_no(medi_ser_no);

        try {
        	PL_SAL_1300DAO dao = new PL_SAL_1300DAO();
            ds = dao.pl_sal_1310_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_SAL_1300EJBHome home = (PL_SAL_1300EJBHome) JNDIManager.getInstance().getHome("PL_SAL_1300EJB");
//        try {
//        	PL_SAL_1300EJB ejb = home.create();
//            ds = ejb.pl_sal_1310_l(dm);
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
    public void pl_sal_1320_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_SAL_1320_LDataSet ds = null;

        // DM Setting
        PL_SAL_1320_LDM dm = new PL_SAL_1320_LDM();

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
        	PL_SAL_1300DAO dao = new PL_SAL_1300DAO();
            ds = dao.pl_sal_1320_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_SAL_1300EJBHome home = (PL_SAL_1300EJBHome) JNDIManager.getInstance().getHome("PL_SAL_1300EJB");
//        try {
//        	PL_SAL_1300EJB ejb = home.create();
//            ds = ejb.pl_sal_1320_l(dm);
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
    public void pl_sal_1330_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_SAL_1330_ADataSet ds = null;

        // DM Setting
        PL_SAL_1330_ADM dm = new PL_SAL_1330_ADM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);							//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);							//사용자
		String incmg_pers_ip = req.getRemoteAddr();   													//입력자IP                           

        //정상적으로 Request로 받을 파라메터
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));					//처리구분
		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));								//매체구분
		String deal_dt = Util.checkString(req.getParameter("deal_dt"));									//거래일자
		String deal_grp_seq = Util.checkString(req.getParameter("deal_grp_seq"));						//거래그룹순번
		String basi_yymm = Util.checkString(req.getParameter("basi_yymm"));								//기준년월
		String basi_dt = Util.checkString(req.getParameter("basi_dt"));									//기준일자
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));									//매체코드
		String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));							//매체호수

    	String updateData = Util.checkString(req.getParameter("updateData"));							//배본내역

    	Hashtable hash = getHashMultiUpdateData(updateData);											//멀티데이터분리

    	String mode_arr = (String)hash.get("m");														//구분모드 배열     
    	String deal_seq_arr = (String)hash.get("deal_seq");												//거래순번 배열     
    	String dlco_cd_arr = (String)hash.get("dlco_cd");												//거래처코드 배열   
    	String dlco_seq_arr = (String)hash.get("dlco_seq");												//거래처순번 배열   
    	String send_plac_seq_arr = (String)hash.get("send_plac_seq");									//발송처순번 배열   
    	String deal_qty_arr = (String)hash.get("deal_qty");												//거래부수 배열   
    	String deal_uprc_arr = (String)hash.get("deal_uprc");											//거래단가 배열 
    	String dcrate_arr = (String)hash.get("dcrate");													//할제 배열         
    	String deal_amt_arr = (String)hash.get("deal_amt");												//거래금액 배열 
    	String sale_clsf_arr = (String)hash.get("sale_clsf");											//매출구분 배열     
    	String sendclsf_arr = (String)hash.get("sendclsf");												//발송구분 배열   
    	String wh_cd_arr = (String)hash.get("wh_cd");													//창고코드 배열     
    	String sell_type_arr = (String)hash.get("sell_type");											//판매유형 배열     
    	String remk_arr = (String)hash.get("remk");														//비고 배열         

        //DM 값을 Setting한다.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setMedi_clsf(medi_clsf);
		dm.setDeal_dt(deal_dt);
		dm.setDeal_grp_seq(deal_grp_seq);
		dm.setMedi_cd(medi_cd);
		dm.setMedi_ser_no(medi_ser_no);
		dm.setBasi_yymm(basi_yymm);
		dm.setBasi_dt(basi_dt);
		dm.setMode_arr(mode_arr);
		dm.setDeal_seq_arr(deal_seq_arr);
		dm.setDlco_cd_arr(dlco_cd_arr);
		dm.setDlco_seq_arr(dlco_seq_arr);
		dm.setSend_plac_seq_arr(send_plac_seq_arr);
		dm.setDeal_qty_arr(deal_qty_arr);
		dm.setDeal_uprc_arr(deal_uprc_arr);
		dm.setDcrate_arr(dcrate_arr);
		dm.setDeal_amt_arr(deal_amt_arr);
		dm.setSale_clsf_arr(sale_clsf_arr);
		dm.setSendclsf_arr(sendclsf_arr);
		dm.setWh_cd_arr(wh_cd_arr);
		dm.setSell_type_arr(sell_type_arr);
		dm.setRemk_arr(remk_arr);

        try {
        	PL_SAL_1300DAO dao = new PL_SAL_1300DAO();
            ds = dao.pl_sal_1330_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_SAL_1300EJBHome home = (PL_SAL_1300EJBHome) JNDIManager.getInstance().getHome("PL_SAL_1300EJB");
//        try {
//        	PL_SAL_1300EJB ejb = home.create();
//            ds = ejb.pl_sal_1330_a(dm);
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
