/***************************************************************************************************
 * 파일명 : PL_BAS_1000WB.java
 * 기능 : 기초관리-정간물매체관리
 * 작성일자 : 2009.02.16
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
import chosun.ciis.pl.bas.dao.PL_BAS_1000DAO;
import chosun.ciis.pl.bas.dm.PL_BAS_1000_MDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1010_LDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1020_LDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1030_ADM;
import chosun.ciis.pl.bas.dm.PL_BAS_1040_ADM;
import chosun.ciis.pl.bas.dm.PL_BAS_1050_ADM;
import chosun.ciis.pl.bas.dm.PL_BAS_1060_ADM;
import chosun.ciis.pl.bas.ds.PL_BAS_1000_MDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1010_LDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1020_LDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1030_ADataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1040_ADataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1050_ADataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1060_ADataSet;
import chosun.ciis.pl.base.wb.BaseWB;

/**
 * 
 */
public class PL_BAS_1000WB extends BaseWB {

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
    public void pl_bas_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1000_MDataSet ds = null;

        // DM Setting
        PL_BAS_1000_MDM dm = new PL_BAS_1000_MDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
        String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));			//매체구분

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setMedi_clsf(medi_clsf);

        try {
        	PL_BAS_1000DAO dao = new PL_BAS_1000DAO();
            ds = dao.pl_bas_1000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1000EJBHome home = (PL_BAS_1000EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1000EJB");
//        try {
//        	PL_BAS_1000EJB ejb = home.create();
//            ds = ejb.pl_bas_1000_m(dm);
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
    public void pl_bas_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1010_LDataSet ds = null;

        // DM Setting
        PL_BAS_1010_LDM dm = new PL_BAS_1010_LDM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자

        //정상적으로 Request로 받을 파라메터
        String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));			//매체구분
        String issu_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_cmpy")));			//발행사
        String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));				//매체코드
        String medi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_nm")));				//매체명

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setMedi_clsf(medi_clsf);
        dm.setIssu_cmpy(issu_cmpy);
        dm.setMedi_cd(medi_cd);
        dm.setMedi_nm(medi_nm);

        try {
        	PL_BAS_1000DAO dao = new PL_BAS_1000DAO();
            ds = dao.pl_bas_1010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1000EJBHome home = (PL_BAS_1000EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1000EJB");
//        try {
//        	PL_BAS_1000EJB ejb = home.create();
//            ds = ejb.pl_bas_1010_l(dm);
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
    public void pl_bas_1020_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1020_LDataSet ds = null;

        // DM Setting
        PL_BAS_1020_LDM dm = new PL_BAS_1020_LDM();

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
        	PL_BAS_1000DAO dao = new PL_BAS_1000DAO();
            ds = dao.pl_bas_1020_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1000EJBHome home = (PL_BAS_1000EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1000EJB");
//        try {
//        	PL_BAS_1000EJB ejb = home.create();
//            ds = ejb.pl_bas_1020_l(dm);
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
    public void pl_bas_1030_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1030_ADataSet ds = null;

        // DM Setting
        PL_BAS_1030_ADM dm = new PL_BAS_1030_ADM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자
		String incmg_pers_ip = req.getRemoteAddr();   												//입력자IP                           

        //정상적으로 Request로 받을 파라메터
		String work_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("work_flag")));			//구분코드(I:등록   U:수정   D:삭제) 
		String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));           	//매체코드                           
		String medi_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_ser_no")));       //매체호수                           
		String medi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_nm")));               //매체명                             
		String issu_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_cmpy")));           //발행사                             
		String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));           //매체구분                           
		String basi_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_yymm")));           //기준년월                           
		String reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt")));                 //등록일자                           
		String issu_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_clsf")));           //발행구분                           
		String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));                		//단가                               
		String dcrate = Util.Uni2Ksc(Util.checkString(req.getParameter("dcrate")));         		//할제                               
		String cont_clas = Util.Uni2Ksc(Util.checkString(req.getParameter("cont_clas")));           //내용분류                           
		String author = Util.Uni2Ksc(Util.checkString(req.getParameter("author")));                 //저자                               
		String type = Util.Uni2Ksc(Util.checkString(req.getParameter("type")));                     //판형                               
		String std = Util.Uni2Ksc(Util.checkString(req.getParameter("std")));                       //규격                               
		String page = Util.Uni2Ksc(Util.checkString(req.getParameter("page")));                     //쪽수                               
		String unit = Util.Uni2Ksc(Util.checkString(req.getParameter("unit")));                     //단위                               
		String unit_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("unit_wgt")));     		//단위중량                           
		String absence_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("absence_clsf")));     //절판구분                           
		String absence_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("absence_dt")));         //절판일자                           
		String cover_modl = Util.Uni2Ksc(Util.checkString(req.getParameter("cover_modl")));         //표지모델                           
		String seri_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("seri_cd")));               //시리즈코드                         
		String seri_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("seri_nm")));               //시리즈명                           
		String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont")));                     //내용                               
		String vexc_medi_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("vexc_medi_ser_no")));     //대행매체호수                       
		String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));                     //비고                               

        //DM 값을 Setting한다.
		dm.setWork_flag(work_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setMedi_cd(medi_cd);
		dm.setMedi_ser_no(medi_ser_no);
		dm.setMedi_nm(medi_nm);
		dm.setIssu_cmpy(issu_cmpy);
		dm.setMedi_clsf(medi_clsf);
		dm.setBasi_yymm(basi_yymm);
		dm.setReg_dt(reg_dt);
		dm.setIssu_clsf(issu_clsf);
		dm.setUprc(uprc);
		dm.setDcrate(dcrate);
		dm.setCont_clas(cont_clas);
		dm.setAuthor(author);
		dm.setType(type);
		dm.setStd(std);
		dm.setPage(page);
		dm.setUnit(unit);
		dm.setUnit_wgt(unit_wgt);
		dm.setAbsence_clsf(absence_clsf);
		dm.setAbsence_dt(absence_dt);
		dm.setCover_modl(cover_modl);
		dm.setSeri_cd(seri_cd);
		dm.setSeri_nm(seri_nm);
		dm.setCont(cont);
		dm.setVexc_medi_ser_no(vexc_medi_ser_no);
		dm.setRemk(remk);

        try {
        	PL_BAS_1000DAO dao = new PL_BAS_1000DAO();
            ds = dao.pl_bas_1030_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1000EJBHome home = (PL_BAS_1000EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1000EJB");
//        try {
//        	PL_BAS_1000EJB ejb = home.create();
//            ds = ejb.pl_bas_1030_a(dm);
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
     * 발행내역 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1040_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1040_ADataSet ds = null;

        // DM Setting
        PL_BAS_1040_ADM dm = new PL_BAS_1040_ADM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자
		String incmg_pers_ip = req.getRemoteAddr();   												//입력자IP                           

        //정상적으로 Request로 받을 파라메터
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));				//처리구분
    	String updateData = Util.checkString(req.getParameter("updateData"));						//발행내역

    	Hashtable hash = getHashMultiUpdateData(updateData);										//멀티데이터분리

    	String mode_arr = (String)hash.get("m");													//처리구분
    	String medi_cd_arr = (String)hash.get("medi_cd");											//매체코드
    	String medi_ser_no_arr = (String)hash.get("medi_ser_no");									//매체호수
    	String issu_seq_arr = (String)hash.get("issu_seq");											//발행순번
    	String ecnt_arr = (String)hash.get("ecnt");													//판수
    	String issu_dt_arr = (String)hash.get("issu_dt");											//발행일자
    	String issu_qty_arr = (String)hash.get("issu_qty");											//발행부수
    	String remk_arr = (String)hash.get("remk");													//비고
    	
        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setAcc_flag(acc_flag);
        dm.setMode_arr(mode_arr.toUpperCase());
        dm.setMedi_cd_arr(medi_cd_arr);
        dm.setMedi_ser_no_arr(medi_ser_no_arr);
        dm.setIssu_seq_arr(issu_seq_arr);
        dm.setEcnt_arr(ecnt_arr);
        dm.setIssu_dt_arr(issu_dt_arr);
        dm.setIssu_qty_arr(issu_qty_arr);
        dm.setRemk_arr(remk_arr);

        try {
        	PL_BAS_1000DAO dao = new PL_BAS_1000DAO();
            ds = dao.pl_bas_1040_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1000EJBHome home = (PL_BAS_1000EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1000EJB");
//        try {
//        	PL_BAS_1000EJB ejb = home.create();
//            ds = ejb.pl_bas_1040_a(dm);
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
     * 판수내역 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1050_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1050_ADataSet ds = null;

        // DM Setting
        PL_BAS_1050_ADM dm = new PL_BAS_1050_ADM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자
		String incmg_pers_ip = req.getRemoteAddr();   												//입력자IP                           

        //정상적으로 Request로 받을 파라메터
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));				//처리구분
    	String updateData = Util.checkString(req.getParameter("updateData"));						//발행내역

    	Hashtable hash = getHashMultiUpdateData(updateData);										//멀티데이터분리

    	String mode_arr = (String)hash.get("m");													//처리구분
    	String medi_cd_arr = (String)hash.get("medi_cd");											//매체코드
    	String medi_ser_no_arr = (String)hash.get("medi_ser_no");									//매체호수
    	String ecnt_seq_arr = (String)hash.get("ecnt_seq");											//판수순번
    	String ecnt_arr = (String)hash.get("ecnt");													//판수
    	String issu_dt_arr = (String)hash.get("issu_dt");											//발행일자
    	String ewh_dt_arr = (String)hash.get("ewh_dt");												//입고일자
    	String ewh_clsf_arr = (String)hash.get("ewh_clsf");											//입고구분
    	String ewh_qty_arr = (String)hash.get("ewh_qty");											//입고부수
    	String wh_cd_arr = (String)hash.get("wh_cd");												//창고코드
    	String remk_arr = (String)hash.get("remk");													//비고

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setAcc_flag(acc_flag);
        dm.setMode_arr(mode_arr.toUpperCase());
        dm.setMedi_cd_arr(medi_cd_arr);
        dm.setMedi_ser_no_arr(medi_ser_no_arr);
        dm.setEcnt_seq_arr(ecnt_seq_arr);
        dm.setEcnt_arr(ecnt_arr);
        dm.setIssu_dt_arr(issu_dt_arr);
        dm.setEwh_dt_arr(ewh_dt_arr);
        dm.setEwh_clsf_arr(ewh_clsf_arr);
        dm.setEwh_qty_arr(ewh_qty_arr);
        dm.setWh_cd_arr(wh_cd_arr);
        dm.setRemk_arr(remk_arr);

        try {
        	PL_BAS_1000DAO dao = new PL_BAS_1000DAO();
            ds = dao.pl_bas_1050_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1000EJBHome home = (PL_BAS_1000EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1000EJB");
//        try {
//        	PL_BAS_1000EJB ejb = home.create();
//            ds = ejb.pl_bas_1050_a(dm);
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
     * 부록내역 Request 파라메터값 Set
     * 조회할 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1060_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1060_ADataSet ds = null;

        // DM Setting
        PL_BAS_1060_ADM dm = new PL_BAS_1060_ADM();

        //Session에서 얻을 데이타
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//회사코드
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//사용자
		String incmg_pers_ip = req.getRemoteAddr();   												//입력자IP                           

        //정상적으로 Request로 받을 파라메터
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));				//처리구분
    	String updateData = Util.checkString(req.getParameter("updateData"));						//발행내역

    	Hashtable hash = getHashMultiUpdateData(updateData);										//멀티데이터분리

    	String mode_arr = (String)hash.get("m");													//처리구분
    	String medi_cd_arr = (String)hash.get("medi_cd");											//매체코드
    	String medi_ser_no_arr = (String)hash.get("medi_ser_no");									//매체호수
    	String appndx_seq_arr = (String)hash.get("appndx_seq");										//부록순번
    	String reg_dt_arr = (String)hash.get("reg_dt");												//등록일자
    	String appndx_nm_arr = (String)hash.get("appndx_nm");										//부록명
    	String appndx_qty_arr = (String)hash.get("appndx_qty");										//부록부수
    	String wgt_arr = (String)hash.get("wgt");													//중량
    	String remk_arr = (String)hash.get("remk");													//비고

        //DM 값을 Setting한다.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setAcc_flag(acc_flag);
        dm.setMode_arr(mode_arr.toUpperCase());
        dm.setMedi_cd_arr(medi_cd_arr);
        dm.setMedi_ser_no_arr(medi_ser_no_arr);
        dm.setAppndx_seq_arr(appndx_seq_arr);
        dm.setReg_dt_arr(reg_dt_arr);
        dm.setAppndx_nm_arr(appndx_nm_arr);
        dm.setAppndx_qty_arr(appndx_qty_arr);
        dm.setWgt_arr(wgt_arr);
        dm.setRemk_arr(remk_arr);

        try {
        	PL_BAS_1000DAO dao = new PL_BAS_1000DAO();
            ds = dao.pl_bas_1060_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1000EJBHome home = (PL_BAS_1000EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1000EJB");
//        try {
//        	PL_BAS_1000EJB ejb = home.create();
//            ds = ejb.pl_bas_1060_a(dm);
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
