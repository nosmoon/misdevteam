/***************************************************************************************************
 * 파일명 : PL_BAS_1200WB.java
 * 기능 : 기초관리-거래처관리
 * 작성일자 : 2009.03.04
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
import chosun.ciis.pl.bas.dao.PL_BAS_1200DAO;
import chosun.ciis.pl.bas.dm.PL_BAS_1200_MDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1210_LDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1220_LDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1230_ADM;
import chosun.ciis.pl.bas.dm.PL_BAS_1240_ADM;
import chosun.ciis.pl.bas.dm.PL_BAS_1250_ADM;
import chosun.ciis.pl.bas.dm.PL_BAS_1260_ADM;
import chosun.ciis.pl.bas.dm.PL_BAS_1270_ADM;
import chosun.ciis.pl.bas.ds.PL_BAS_1200_MDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1210_LDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1220_LDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1230_ADataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1240_ADataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1250_ADataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1260_ADataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1270_ADataSet;
import chosun.ciis.pl.base.wb.BaseWB;

/**
 * 
 */
public class PL_BAS_1200WB extends BaseWB {

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
    public void pl_bas_1200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1200_MDataSet ds = null;

        // DM Setting
        PL_BAS_1200_MDM dm = new PL_BAS_1200_MDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_BAS_1200DAO dao = new PL_BAS_1200DAO();
            ds = dao.pl_bas_1200_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1200EJBHome home = (PL_BAS_1200EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1200EJB");
//        try {
//        	PL_BAS_1200EJB ejb = home.create();
//            ds = ejb.pl_bas_1200_m(dm);
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
    public void pl_bas_1210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1210_LDataSet ds = null;

        // DM Setting
        PL_BAS_1210_LDM dm = new PL_BAS_1210_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
		String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));							//거래처구분
		String area = Util.checkString(req.getParameter("area"));									//지역
		String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));				//거래처명

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
		dm.setDlco_clsf(dlco_clsf);
		dm.setArea(area);
		dm.setDlco_nm(dlco_nm);

        try {
        	PL_BAS_1200DAO dao = new PL_BAS_1200DAO();
            ds = dao.pl_bas_1210_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1200EJBHome home = (PL_BAS_1200EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1200EJB");
//        try {
//        	PL_BAS_1200EJB ejb = home.create();
//            ds = ejb.pl_bas_1210_l(dm);
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
    public void pl_bas_1220_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1220_LDataSet ds = null;

        // DM Setting
        PL_BAS_1220_LDM dm = new PL_BAS_1220_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
		String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));								//거래처코드
		String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));							//거래처순번

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);

        try {
        	PL_BAS_1200DAO dao = new PL_BAS_1200DAO();
            ds = dao.pl_bas_1220_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1200EJBHome home = (PL_BAS_1200EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1200EJB");
//        try {
//        	PL_BAS_1200EJB ejb = home.create();
//            ds = ejb.pl_bas_1220_l(dm);
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
    public void pl_bas_1230_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1230_ADataSet ds = null;

        // DM Setting
        PL_BAS_1230_ADM dm = new PL_BAS_1230_ADM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자
		String incmg_pers_ip = req.getRemoteAddr();   												//입력자IP                           

        //정상적으로 Request로 받을 파라메터
		String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));				//구분코드(I:등록   U:수정   D:삭제) 
		String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));								//거래처코드        
		String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));                           //거래처순번        
		String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));               //거래처명          
		String dlco_abrv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_abrv_nm")));     //거래처약어명      
		String comn_mang_no = Util.checkString(req.getParameter("comn_mang_no"));                   //공통관리번호      
		String rptv_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rptv_flnm")));           //대표성명          
		String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));                         //거래처구분        
		String area = Util.checkString(req.getParameter("area"));                                   //지역              
		String bkst_cnt = Util.checkString(req.getParameter("bkst_cnt"));                           //서점수            
		String tel_no_1 = Util.checkString(req.getParameter("tel_no_1"));                           //전화번호1         
		String tel_no_2 = Util.checkString(req.getParameter("tel_no_2"));                           //전화번호2         
		String tel_no_3 = Util.checkString(req.getParameter("tel_no_3"));                           //전화번호3         
		String tel_no_etc = Util.checkString(req.getParameter("tel_no_etc"));                       //전화번호기타      
		String ptph_no_1 = Util.checkString(req.getParameter("ptph_no_1"));                         //휴대폰번호1       
		String ptph_no_2 = Util.checkString(req.getParameter("ptph_no_2"));                         //휴대폰번호2       
		String ptph_no_3 = Util.checkString(req.getParameter("ptph_no_3"));                         //휴대폰번호3       
		String fax_no_1 = Util.checkString(req.getParameter("fax_no_1"));                           //팩스번호1         
		String fax_no_2 = Util.checkString(req.getParameter("fax_no_2"));                           //팩스번호2         
		String fax_no_3 = Util.checkString(req.getParameter("fax_no_3"));                           //팩스번호3         
		String email = Util.checkString(req.getParameter("email"));                                 //이메일            
		String zip_1 = Util.checkString(req.getParameter("zip_1"));                                 //우편번호1         
		String zip_2 = Util.checkString(req.getParameter("zip_2"));                                 //우편번호2         
		String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));                     //주소              
		String dtls_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_addr")));           //상세주소          
		String magz_deal_yn = Util.checkString(req.getParameter("magz_deal_yn"));                   //정간물거래여부    
		String magz_deal_frdt = Util.checkString(req.getParameter("magz_deal_frdt"));               //정간물거래시작일자
		String magz_deal_todt = Util.checkString(req.getParameter("magz_deal_todt"));               //정간물거래종료일자
		String sep_book_deal_yn = Util.checkString(req.getParameter("sep_book_deal_yn"));           //단행본거래여부    
		String sep_book_deal_frdt = Util.checkString(req.getParameter("sep_book_deal_frdt"));       //단행본거래시작일자
		String sep_book_deal_todt = Util.checkString(req.getParameter("sep_book_deal_todt"));       //단행본거래종료일자
		String remk = Util.checkString(req.getParameter("remk"));                                   //비고
		String elec_tax_stmt_yn = Util.checkString(req.getParameter("elec_tax_stmt_yn"));    
		
        //DM 값을 Setting한다.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);
		dm.setDlco_nm(dlco_nm);
		dm.setDlco_abrv_nm(dlco_abrv_nm);
		dm.setComn_mang_no(comn_mang_no);
		dm.setRptv_flnm(rptv_flnm);
		dm.setDlco_clsf(dlco_clsf);
		dm.setArea(area);
		dm.setBkst_cnt(bkst_cnt);
		dm.setTel_no_1(tel_no_1);
		dm.setTel_no_2(tel_no_2);
		dm.setTel_no_3(tel_no_3);
		dm.setTel_no_etc(tel_no_etc);
		dm.setPtph_no_1(ptph_no_1);
		dm.setPtph_no_2(ptph_no_2);
		dm.setPtph_no_3(ptph_no_3);
		dm.setFax_no_1(fax_no_1);
		dm.setFax_no_2(fax_no_2);
		dm.setFax_no_3(fax_no_3);
		dm.setEmail(email);
		dm.setZip_1(zip_1);
		dm.setZip_2(zip_2);
		dm.setAddr(addr);
		dm.setDtls_addr(dtls_addr);
		dm.setMagz_deal_yn(magz_deal_yn);
		dm.setMagz_deal_frdt(magz_deal_frdt);
		dm.setMagz_deal_todt(magz_deal_todt);
		dm.setSep_book_deal_yn(sep_book_deal_yn);
		dm.setSep_book_deal_frdt(sep_book_deal_frdt);
		dm.setSep_book_deal_todt(sep_book_deal_todt);
		dm.setRemk(remk);
		dm.setElec_tax_stmt_yn(elec_tax_stmt_yn);
		
        try {
        	PL_BAS_1200DAO dao = new PL_BAS_1200DAO();
            ds = dao.pl_bas_1230_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1200EJBHome home = (PL_BAS_1200EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1200EJB");
//        try {
//        	PL_BAS_1200EJB ejb = home.create();
//            ds = ejb.pl_bas_1230_a(dm);
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
     * 취급매체 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1240_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1240_ADataSet ds = null;

        // DM Setting
        PL_BAS_1240_ADM dm = new PL_BAS_1240_ADM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자
		String incmg_pers_ip = req.getRemoteAddr();   												//입력자IP                           

        //정상적으로 Request로 받을 파라메터
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));				//처리구분
    	String updateData = Util.checkString(req.getParameter("updateData"));						//발행내역

    	Hashtable hash = getHashMultiUpdateData(updateData);										//멀티데이터분리

    	String mode_arr = (String)hash.get("m");													//처리구분
    	String dlco_cd_arr = (String)hash.get("dlco_cd");											//거래처코드
    	String dlco_seq_arr = (String)hash.get("dlco_seq");											//거래처순번
    	String medi_cd_arr = (String)hash.get("medi_cd");											//매체코드
    	String deal_yn_arr = (String)hash.get("deal_yn");											//거래여부
    	String no_val_exne_arr = (String)hash.get("no_val_exne");									//무가유무
    	String dcrate_arr = (String)hash.get("dcrate");												//할제
    	String wh_cd_arr = (String)hash.get("wh_cd");												//창고코드
    	String sendclsf_arr = (String)hash.get("sendclsf");											//발송구분
    	String remk_arr = (String)hash.get("remk");													//비고
    	
        //DM 값을 Setting한다.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setMode_arr(mode_arr.toUpperCase());
		dm.setDlco_cd_arr(dlco_cd_arr);
		dm.setDlco_seq_arr(dlco_seq_arr);
		dm.setMedi_cd_arr(medi_cd_arr);
		dm.setDeal_yn_arr(deal_yn_arr);
		dm.setNo_val_exne_arr(no_val_exne_arr);
		dm.setDcrate_arr(dcrate_arr);
		dm.setWh_cd_arr(wh_cd_arr);
		dm.setSendclsf_arr(sendclsf_arr);
		dm.setRemk_arr(remk_arr);

        try {
        	PL_BAS_1200DAO dao = new PL_BAS_1200DAO();
            ds = dao.pl_bas_1240_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1200EJBHome home = (PL_BAS_1200EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1200EJB");
//        try {
//        	PL_BAS_1200EJB ejb = home.create();
//            ds = ejb.pl_bas_1240_a(dm);
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
     * 발송처 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1250_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1250_ADataSet ds = null;

        // DM Setting
        PL_BAS_1250_ADM dm = new PL_BAS_1250_ADM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자
		String incmg_pers_ip = req.getRemoteAddr();   												//입력자IP                           

        //정상적으로 Request로 받을 파라메터
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));				//처리구분
    	String updateData = Util.checkString(req.getParameter("updateData"));						//발행내역

    	Hashtable hash = getHashMultiUpdateData(updateData);										//멀티데이터분리

    	String mode_arr = (String)hash.get("m");													//처리구분
    	String dlco_cd_arr = (String)hash.get("dlco_cd");											//거래처코드    
    	String dlco_seq_arr = (String)hash.get("dlco_seq");											//거래처순번    
    	String send_plac_seq_arr = (String)hash.get("send_plac_seq");								//발송처순번    
    	String send_plac_nm_arr = (String)hash.get("send_plac_nm");									//발송처명      
    	String magz_deal_yn_arr = (String)hash.get("magz_deal_yn");									//정간물거래여부      
    	String sep_book_deal_yn_arr = (String)hash.get("sep_book_deal_yn");							//단행본거래여부      
    	String vexc_dlco_cd_arr = (String)hash.get("vexc_dlco_cd");									//대행거래처코드
    	String tel_no_arr = (String)hash.get("tel_no");												//전화번호      
    	String fax_no_arr = (String)hash.get("fax_no");												//팩스번호      
    	String zip_1_arr = (String)hash.get("zip_1");												//우편번호1     
    	String zip_2_arr = (String)hash.get("zip_2");												//우편번호2     
    	String addr_arr = (String)hash.get("addr");													//주소          
    	String dtls_addr_arr = (String)hash.get("dtls_addr");										//상세주소      
    	String remk_arr = (String)hash.get("remk");													//비고

        //DM 값을 Setting한다.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setMode_arr(mode_arr.toUpperCase());
		dm.setDlco_cd_arr(dlco_cd_arr);
		dm.setDlco_seq_arr(dlco_seq_arr);
		dm.setSend_plac_seq_arr(send_plac_seq_arr);
		dm.setSend_plac_nm_arr(send_plac_nm_arr);
		dm.setMagz_deal_yn_arr(magz_deal_yn_arr);
		dm.setSep_book_deal_yn_arr(sep_book_deal_yn_arr);
		dm.setVexc_dlco_cd_arr(vexc_dlco_cd_arr);
		dm.setTel_no_arr(tel_no_arr);
		dm.setFax_no_arr(fax_no_arr);
		dm.setZip_1_arr(zip_1_arr);
		dm.setZip_2_arr(zip_2_arr);
		dm.setAddr_arr(addr_arr);
		dm.setDtls_addr_arr(dtls_addr_arr);
		dm.setRemk_arr(remk_arr);

        try {
        	PL_BAS_1200DAO dao = new PL_BAS_1200DAO();
            ds = dao.pl_bas_1250_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1200EJBHome home = (PL_BAS_1200EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1200EJB");
//        try {
//        	PL_BAS_1200EJB ejb = home.create();
//            ds = ejb.pl_bas_1250_a(dm);
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
     * 담보내역 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1260_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1260_ADataSet ds = null;

        // DM Setting
        PL_BAS_1260_ADM dm = new PL_BAS_1260_ADM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자
		String incmg_pers_ip = req.getRemoteAddr();   												//입력자IP                           

        //정상적으로 Request로 받을 파라메터
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));				//처리구분
    	String updateData = Util.checkString(req.getParameter("updateData"));						//발행내역

    	Hashtable hash = getHashMultiUpdateData(updateData);										//멀티데이터분리

    	String mode_arr = (String)hash.get("m");													//처리구분
    	String dlco_cd_arr = (String)hash.get("dlco_cd");											//거래처코드  
    	String dlco_seq_arr = (String)hash.get("dlco_seq");											//거래처순번  
    	String colt_seq_arr = (String)hash.get("colt_seq");											//담보순번    
    	String colt_clsf_arr = (String)hash.get("colt_clsf");										//담보구분    
    	String setup_stat_arr = (String)hash.get("setup_stat");										//설정상태    
    	String colt_obj_nm_arr = (String)hash.get("colt_obj_nm");									//담보물명    
    	String prty_rank_arr = (String)hash.get("prty_rank");										//우선순위    
    	String acqr_dt_arr = (String)hash.get("acqr_dt");											//취득일자    
    	String colt_setup_amt_arr = (String)hash.get("colt_setup_amt");								//담보설정액  
    	String pub_ann_amt_arr = (String)hash.get("pub_ann_amt");									//공시가액    
    	String plcw_arr = (String)hash.get("plcw");													//소재지      
    	String gurt_strt_dd_arr = (String)hash.get("gurt_strt_dd");									//보증개시일  
    	String gurt_end_dd_arr = (String)hash.get("gurt_end_dd");									//보증종료일  
    	String insr_stock_no_arr = (String)hash.get("insr_stock_no");								//보험증권번호
    	String remk_arr = (String)hash.get("remk");													//비고

        //DM 값을 Setting한다.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setMode_arr(mode_arr.toUpperCase());
		dm.setDlco_cd_arr(dlco_cd_arr);
		dm.setDlco_seq_arr(dlco_seq_arr);
		dm.setColt_seq_arr(colt_seq_arr);
		dm.setColt_clsf_arr(colt_clsf_arr);
		dm.setSetup_stat_arr(setup_stat_arr);
		dm.setColt_obj_nm_arr(colt_obj_nm_arr);
		dm.setPrty_rank_arr(prty_rank_arr);
		dm.setAcqr_dt_arr(acqr_dt_arr);
		dm.setColt_setup_amt_arr(colt_setup_amt_arr);
		dm.setPub_ann_amt_arr(pub_ann_amt_arr);
		dm.setPlcw_arr(plcw_arr);
		dm.setGurt_strt_dd_arr(gurt_strt_dd_arr);
		dm.setGurt_end_dd_arr(gurt_end_dd_arr);
		dm.setInsr_stock_no_arr(insr_stock_no_arr);
		dm.setRemk_arr(remk_arr);

        try {
        	PL_BAS_1200DAO dao = new PL_BAS_1200DAO();
            ds = dao.pl_bas_1260_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }

//        PL_BAS_1200EJBHome home = (PL_BAS_1200EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1200EJB");
//        try {
//        	PL_BAS_1200EJB ejb = home.create();
//            ds = ejb.pl_bas_1260_a(dm);
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
     * 보증인 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1270_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1270_ADataSet ds = null;

        // DM Setting
        PL_BAS_1270_ADM dm = new PL_BAS_1270_ADM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자
		String incmg_pers_ip = req.getRemoteAddr();   												//입력자IP                           

        //정상적으로 Request로 받을 파라메터
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));				//처리구분
    	String updateData = Util.checkString(req.getParameter("updateData"));						//발행내역

    	Hashtable hash = getHashMultiUpdateData(updateData);										//멀티데이터분리

    	String mode_arr = (String)hash.get("m");													//처리구분
    	String dlco_cd_arr = (String)hash.get("dlco_cd");											//거래처코드      
    	String dlco_seq_arr = (String)hash.get("dlco_seq");											//거래처순번      
    	String gurt_pers_seq_arr = (String)hash.get("gurt_pers_seq");								//보증인순번      
    	String setup_stat_arr = (String)hash.get("setup_stat");										//설정상태    
    	String gurt_pers_flnm_arr = (String)hash.get("gurt_pers_flnm");								//보증인성명      
    	String gurt_pers_prn_1_arr = (String)hash.get("gurt_pers_prn");								//보증인주민번호1 
    	String gurt_pers_prn_2_arr = (String)hash.get("gurt_pers_prn_2");							//보증인주민번호2 
    	String tel_no_1_arr = (String)hash.get("tel_no_1");											//전화번호1       
    	String tel_no_2_arr = (String)hash.get("tel_no_2");											//전화번호2       
    	String tel_no_3_arr = (String)hash.get("tel_no_3");											//전화번호3       
    	String ptph_no_1_arr = (String)hash.get("ptph_no_1");										//휴대폰번호1     
    	String ptph_no_2_arr = (String)hash.get("ptph_no_2");										//휴대폰번호2     
    	String ptph_no_3_arr = (String)hash.get("ptph_no_3");										//휴대폰번호3     
    	String zip_1_arr = (String)hash.get("zip_1");												//우편번호1       
    	String zip_2_arr = (String)hash.get("zip_2");												//우편번호2       
    	String addr_arr = (String)hash.get("addr");													//주소            
    	String dtls_addr_arr = (String)hash.get("dtls_addr");										//상세주소        
    	String rshp_arr = (String)hash.get("rshp");													//관계            
    	String remk_arr = (String)hash.get("remk");													//비고

        //DM 값을 Setting한다.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setMode_arr(mode_arr.toUpperCase());
		dm.setDlco_cd_arr(dlco_cd_arr);
		dm.setDlco_seq_arr(dlco_seq_arr);
		dm.setGurt_pers_seq_arr(gurt_pers_seq_arr);
		dm.setSetup_stat_arr(setup_stat_arr);
		dm.setGurt_pers_flnm_arr(gurt_pers_flnm_arr);
		dm.setGurt_pers_prn_1_arr(gurt_pers_prn_1_arr);
		dm.setGurt_pers_prn_2_arr(gurt_pers_prn_2_arr);
		dm.setTel_no_1_arr(tel_no_1_arr);
		dm.setTel_no_2_arr(tel_no_2_arr);
		dm.setTel_no_3_arr(tel_no_3_arr);
		dm.setPtph_no_1_arr(ptph_no_1_arr);
		dm.setPtph_no_2_arr(ptph_no_2_arr);
		dm.setPtph_no_3_arr(ptph_no_3_arr);
		dm.setZip_1_arr(zip_1_arr);
		dm.setZip_2_arr(zip_2_arr);
		dm.setAddr_arr(addr_arr);
		dm.setDtls_addr_arr(dtls_addr_arr);
		dm.setRshp_arr(rshp_arr);
		dm.setRemk_arr(remk_arr);

        try {
        	PL_BAS_1200DAO dao = new PL_BAS_1200DAO();
            ds = dao.pl_bas_1270_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }

//        PL_BAS_1200EJBHome home = (PL_BAS_1200EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1200EJB");
//        try {
//        	PL_BAS_1200EJB ejb = home.create();
//            ds = ejb.pl_bas_1270_a(dm);
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
