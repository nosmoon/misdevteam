/***************************************************************************************************
 * 파일명 : PL_SAL_1400WB.java
 * 기능 : 배본관리-사내판매
 * 작성일자 : 2009.04.02
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
import chosun.ciis.pl.sal.dao.PL_SAL_1400DAO;
import chosun.ciis.pl.sal.dm.PL_SAL_1400_MDM;
import chosun.ciis.pl.sal.dm.PL_SAL_1410_LDM;
import chosun.ciis.pl.sal.dm.PL_SAL_1420_LDM;
import chosun.ciis.pl.sal.dm.PL_SAL_1430_ADM;
import chosun.ciis.pl.sal.ds.PL_SAL_1400_MDataSet;
import chosun.ciis.pl.sal.ds.PL_SAL_1410_LDataSet;
import chosun.ciis.pl.sal.ds.PL_SAL_1420_LDataSet;
import chosun.ciis.pl.sal.ds.PL_SAL_1430_ADataSet;

/**
 * 
 */
public class PL_SAL_1400WB extends BaseWB {

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
    public void pl_sal_1400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_SAL_1400_MDataSet ds = null;

        // DM Setting
        PL_SAL_1400_MDM dm = new PL_SAL_1400_MDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_SAL_1400DAO dao = new PL_SAL_1400DAO();
            ds = dao.pl_sal_1400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_SAL_1400EJBHome home = (PL_SAL_1400EJBHome) JNDIManager.getInstance().getHome("PL_SAL_1400EJB");
//        try {
//        	PL_SAL_1400EJB ejb = home.create();
//            ds = ejb.pl_sal_1400_m(dm);
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
    public void pl_sal_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_SAL_1410_LDataSet ds = null;

        // DM Setting
        PL_SAL_1410_LDM dm = new PL_SAL_1410_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));							//매체구분
		String basi_dt_fr = Util.checkString(req.getParameter("basi_dt_fr"));						//기준년월시작
		String basi_dt_to = Util.checkString(req.getParameter("basi_dt_to"));						//기준년월종료
		String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));								//거래처코드
		String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));							//거래처순번
		String send_plac_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_nm")));		//발송처명(고객명)
		String phone_no_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("phone_no_1")));			//전화번호1
		String phone_no_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("phone_no_2")));			//전화번호2
		String phone_no_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("phone_no_3")));			//전화번호3
		String owh_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_yn")));					//출고여부

        //DM 값을 Setting한다.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setMedi_clsf(medi_clsf);
		dm.setBasi_dt_fr(basi_dt_fr);
		dm.setBasi_dt_to(basi_dt_to);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);
		dm.setSend_plac_nm(send_plac_nm);
		dm.setPhone_no_1(phone_no_1);
		dm.setPhone_no_2(phone_no_2);
		dm.setPhone_no_3(phone_no_3);
		dm.setOwh_yn(owh_yn);

        try {
        	PL_SAL_1400DAO dao = new PL_SAL_1400DAO();
            ds = dao.pl_sal_1410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_SAL_1400EJBHome home = (PL_SAL_1400EJBHome) JNDIManager.getInstance().getHome("PL_SAL_1400EJB");
//        try {
//        	PL_SAL_1400EJB ejb = home.create();
//            ds = ejb.pl_sal_1410_l(dm);
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
    public void pl_sal_1420_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_SAL_1420_LDataSet ds = null;

        // DM Setting
        PL_SAL_1420_LDM dm = new PL_SAL_1420_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
		String ordr_dt = Util.checkString(req.getParameter("ordr_dt"));								//주문일자
		String ordr_grp_seq = Util.checkString(req.getParameter("ordr_grp_seq"));					//주문그룹순번

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
		dm.setOrdr_dt(ordr_dt);
		dm.setOrdr_grp_seq(ordr_grp_seq);

        try {
        	PL_SAL_1400DAO dao = new PL_SAL_1400DAO();
            ds = dao.pl_sal_1420_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_SAL_1400EJBHome home = (PL_SAL_1400EJBHome) JNDIManager.getInstance().getHome("PL_SAL_1400EJB");
//        try {
//        	PL_SAL_1400EJB ejb = home.create();
//            ds = ejb.pl_sal_1420_l(dm);
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
    public void pl_sal_1430_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_SAL_1430_ADataSet ds = null;

        // DM Setting
        PL_SAL_1430_ADM dm = new PL_SAL_1430_ADM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);							//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);							//사용자
		String incmg_pers_ip = req.getRemoteAddr();   													//입력자IP                           

        //정상적으로 Request로 받을 파라메터
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));					//처리구분
		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));								//매체구분
		String deal_dt = Util.checkString(req.getParameter("deal_dt"));									//거래일자
		String deal_grp_seq = Util.checkString(req.getParameter("deal_grp_seq"));						//거래그룹순번
		String basi_dt = Util.checkString(req.getParameter("basi_dt"));									//기준일자
		String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));									//거래처코드
		String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));								//거래처순번
		String send_plac_seq = Util.checkString(req.getParameter("send_plac_seq"));						//발송처순번
		String ordr_dt = Util.checkString(req.getParameter("ordr_dt"));									//주문일자
		String ordr_grp_seq = Util.checkString(req.getParameter("ordr_grp_seq"));                       //주문그룹순번
		String send_plac_nm = Util.checkString(req.getParameter("send_plac_nm"));                       //발송처명(고객명)
		String send_plac_tel_no_1 = Util.checkString(req.getParameter("send_plac_tel_no_1"));           //전화번호1
		String send_plac_tel_no_2 = Util.checkString(req.getParameter("send_plac_tel_no_2"));           //전화번호2
		String send_plac_tel_no_3 = Util.checkString(req.getParameter("send_plac_tel_no_3"));           //전화번호3
		String send_plac_ptph_no_1 = Util.checkString(req.getParameter("send_plac_ptph_no_1"));         //휴대폰번호1
		String send_plac_ptph_no_2 = Util.checkString(req.getParameter("send_plac_ptph_no_2"));         //휴대폰번호2
		String send_plac_ptph_no_3 = Util.checkString(req.getParameter("send_plac_ptph_no_3"));         //휴대폰번호3
		String send_plac_fax_no_1 = Util.checkString(req.getParameter("send_plac_fax_no_1"));           //팩스번호1
		String send_plac_fax_no_2 = Util.checkString(req.getParameter("send_plac_fax_no_2"));           //팩스번호2
		String send_plac_fax_no_3 = Util.checkString(req.getParameter("send_plac_fax_no_3"));           //팩스번호3
		String send_plac_zip_1 = Util.checkString(req.getParameter("send_plac_zip_1"));                 //우편번호1
		String send_plac_zip_2 = Util.checkString(req.getParameter("send_plac_zip_2"));                 //우편번호2
		String send_plac_addr = Util.checkString(req.getParameter("send_plac_addr"));                   //주소
		String send_plac_dtls_addr = Util.checkString(req.getParameter("send_plac_dtls_addr"));         //상세주소
		String remk = Util.checkString(req.getParameter("remk"));										//비고

    	String updateData = Util.checkString(req.getParameter("updateData"));							//배본내역

    	Hashtable hash = getHashMultiUpdateData(updateData);											//멀티데이터분리

    	String mode_arr = (String)hash.get("m");														//구분모드 배열     
    	String ordr_seq_arr = (String)hash.get("ordr_seq");												//주문순번 배열     
    	String deal_seq_arr = (String)hash.get("deal_seq");												//거래순번 배열     
    	String medi_cd_arr = (String)hash.get("medi_cd");												//매체코드 배열   
    	String medi_ser_no_arr = (String)hash.get("medi_ser_no");										//매체호수 배열   
    	String deal_qty_arr = (String)hash.get("deal_qty");												//거래부수 배열   
    	String deal_uprc_arr = (String)hash.get("deal_uprc");											//거래단가 배열 
    	String dcrate_arr = (String)hash.get("dcrate");													//할제 배열         
    	String deal_amt_arr = (String)hash.get("deal_amt");												//거래금액 배열 
    	String sale_clsf_arr = (String)hash.get("sale_clsf");											//매출구분 배열     
    	String sendclsf_arr = (String)hash.get("sendclsf");												//발송구분 배열   
    	String wh_cd_arr = (String)hash.get("wh_cd");													//창고코드 배열     
    	String sell_type_arr = (String)hash.get("sell_type");											//판매유형 배열     

        //DM 값을 Setting한다.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setOrdr_dt(ordr_dt);
		dm.setOrdr_grp_seq(ordr_grp_seq);
		dm.setDeal_dt(deal_dt);
		dm.setDeal_grp_seq(deal_grp_seq);
		dm.setMedi_clsf(medi_clsf);
		dm.setBasi_dt(basi_dt);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);
		dm.setSend_plac_seq(send_plac_seq);
		dm.setSend_plac_nm(send_plac_nm);
		dm.setSend_plac_tel_no_1(send_plac_tel_no_1);
		dm.setSend_plac_tel_no_2(send_plac_tel_no_2);
		dm.setSend_plac_tel_no_3(send_plac_tel_no_3);
		dm.setSend_plac_ptph_no_1(send_plac_ptph_no_1);
		dm.setSend_plac_ptph_no_2(send_plac_ptph_no_2);
		dm.setSend_plac_ptph_no_3(send_plac_ptph_no_3);
		dm.setSend_plac_fax_no_1(send_plac_fax_no_1);
		dm.setSend_plac_fax_no_2(send_plac_fax_no_2);
		dm.setSend_plac_fax_no_3(send_plac_fax_no_3);
		dm.setSend_plac_zip_1(send_plac_zip_1);
		dm.setSend_plac_zip_2(send_plac_zip_2);
		dm.setSend_plac_addr(send_plac_addr);
		dm.setSend_plac_dtls_addr(send_plac_dtls_addr);
		dm.setRemk(remk);
		dm.setMode_arr(mode_arr);
		dm.setOrdr_seq_arr(ordr_seq_arr);
		dm.setDeal_seq_arr(deal_seq_arr);
		dm.setMedi_cd_arr(medi_cd_arr);
		dm.setMedi_ser_no_arr(medi_ser_no_arr);
		dm.setDeal_qty_arr(deal_qty_arr);
		dm.setDeal_uprc_arr(deal_uprc_arr);
		dm.setDcrate_arr(dcrate_arr);
		dm.setDeal_amt_arr(deal_amt_arr);
		dm.setSale_clsf_arr(sale_clsf_arr);
		dm.setSendclsf_arr(sendclsf_arr);
		dm.setWh_cd_arr(wh_cd_arr);
		dm.setSell_type_arr(sell_type_arr);

        try {
        	PL_SAL_1400DAO dao = new PL_SAL_1400DAO();
            ds = dao.pl_sal_1430_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_SAL_1400EJBHome home = (PL_SAL_1400EJBHome) JNDIManager.getInstance().getHome("PL_SAL_1400EJB");
//        try {
//        	PL_SAL_1400EJB ejb = home.create();
//            ds = ejb.pl_sal_1430_a(dm);
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
