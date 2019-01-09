/***************************************************************************************************
 * 파일명   : SSReader1700WB.java
 * 기  능   : 독자현황-독자정보조회 WB
 * 작성일자 : 2005-04-13
 * 작성자   : 이혁
 ****************************************************************************************************/

package chosun.ciis.ss.sls.rdr.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.dao.*;

/*
 * 독자현황-독자등급부여를 위한 WB
 */
public class SSReader1700WB {

    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_READER_BOINFO_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_READER_BOINFO_INITDM dm = new SS_L_READER_BOINFO_INITDM();

        SSReader1700DAO dao = new SSReader1700DAO();
        // DAO 객체의 selectInitList 호출
        ds = dao.selectInitList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSReader1700EJBHome home = (SSReader1700EJBHome)JNDIManager.getInstance().getHome("SSReader1700EJB");
        try{
            SSReader1700EJB ejb = home.create();
            ds = ejb.selectInitList(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }
    
    // 비독자관리 초기화면
    public void initList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_RDR_MNGMEMB_INITDataSet ds = null;
        // Request Parameter Processing
    	
        // DM Setting
    	SS_L_RDR_MNGMEMB_INITDM dm = new SS_L_RDR_MNGMEMB_INITDM();

    	
    	SSReader1700DAO dao = new SSReader1700DAO();
        // DAO 객체의 selectInitList 호출
        ds = dao.initList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSReader1700EJBHome home = (SSReader1700EJBHome)JNDIManager.getInstance().getHome("SSReader1700EJB");
        try{
            SSReader1700EJB ejb = home.create();
            ds = ejb.initList(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }
    
    // 비독자 관리 조회
    public void selectList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_RDR_MNGMEMBDataSet ds = null;
    	
        // Request Parameter Processing
    	String type = Util.Uni2Ksc(Util.checkString(req.getParameter("type")));
    	String type2 = Util.Uni2Ksc(Util.checkString(req.getParameter("type2")));
    	String area = Util.Uni2Ksc(Util.checkString(req.getParameter("area")));
    	String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
    	String from = Util.Uni2Ksc(Util.checkString(req.getParameter("from")));
    	String to = Util.Uni2Ksc(Util.checkString(req.getParameter("to")));
    	String custnm = Util.Uni2Ksc(Util.checkString(req.getParameter("custnm")));
    	String sex = Util.Uni2Ksc(Util.checkString(req.getParameter("sex")));
    	String age = Util.Uni2Ksc(Util.checkString(req.getParameter("age")));
    	String yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyy")));
    	String child = Util.Uni2Ksc(Util.checkString(req.getParameter("chkchild")));
    	String startcount = Util.Uni2Ksc(Util.checkString(req.getParameter("startCount")));
    	String endcount = Util.Uni2Ksc(Util.checkString(req.getParameter("endCount")));
    	    	    
        // DM Setting    	
    	SS_L_RDR_MNGMEMBDM dm = new SS_L_RDR_MNGMEMBDM();
    	dm.setType(type);
    	dm.setType2(type2);
    	dm.setArea(area);
    	dm.setClsf(clsf);
    	dm.setFrom(from);
    	dm.setTo(to);
    	dm.setCustnm(custnm);
    	dm.setSex(sex);
    	dm.setAge(age);
    	dm.setYyyy(yyyy);
    	dm.setChild(child);
    	dm.setStartcount(startcount);
    	dm.setEndcount(endcount);

    	SSReader1700DAO dao = new SSReader1700DAO();
        // DAO 객체의 selectInitList 호출
        ds = dao.selectList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSReader1700EJBHome home = (SSReader1700EJBHome)JNDIManager.getInstance().getHome("SSReader1700EJB");
        try{
            SSReader1700EJB ejb = home.create();
            ds = ejb.selectList(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }
    
 // 비독자 관리 조회(모플)
    public void selectList_mo(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_RDR_MNGMEMB_MODataSet ds = null;
    	
        // Request Parameter Processing
    	String type = Util.Uni2Ksc(Util.checkString(req.getParameter("type")));
    	String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
    	String from = Util.Uni2Ksc(Util.checkString(req.getParameter("from")));
    	String to = Util.Uni2Ksc(Util.checkString(req.getParameter("to")));
    	String custnm = Util.Uni2Ksc(Util.checkString(req.getParameter("custnm")));
    	String sex = Util.Uni2Ksc(Util.checkString(req.getParameter("sex")));
    	String age = Util.Uni2Ksc(Util.checkString(req.getParameter("age")));
    	String yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyy")));
    	    	    
        // DM Setting    	
    	SS_L_RDR_MNGMEMB_MODM dm = new SS_L_RDR_MNGMEMB_MODM();
    	dm.setType(type);
    	dm.setClsf(clsf);
    	dm.setFrom(from);
    	dm.setTo(to);
    	dm.setCustnm(custnm);
    	dm.setSex(sex);
    	dm.setAge(age);
    	dm.setYyyy(yyyy);

    	SSReader1700DAO dao = new SSReader1700DAO();
        // DAO 객체의 selectInitList 호출
        ds = dao.selectList_mo(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSReader1700EJBHome home = (SSReader1700EJBHome)JNDIManager.getInstance().getHome("SSReader1700EJB");
        try{
            SSReader1700EJB ejb = home.create();
            ds = ejb.selectList_mo(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }
    
    // 비독자 관리 상세조회
    public void detailList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_S_RDR_MNGMEMBDataSet ds = null;
    	
        // Request Parameter Processing
    	String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
    	String custclas = Util.Uni2Ksc(Util.checkString(req.getParameter("custclas")));
    	String custseq = Util.Uni2Ksc(Util.checkString(req.getParameter("custseq")));
    	    	    
        // DM Setting    	
    	SS_S_RDR_MNGMEMBDM dm = new SS_S_RDR_MNGMEMBDM();
    	dm.setCmpycd(cmpycd);
    	dm.setCustclas(custclas);
    	dm.setCustseq(custseq);
    	
        SSReader1700DAO dao = new SSReader1700DAO();
        // DAO 객체의 selectInitList 호출
        ds = dao.detailList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSReader1700EJBHome home = (SSReader1700EJBHome)JNDIManager.getInstance().getHome("SSReader1700EJB");
        try{
            SSReader1700EJB ejb = home.create();
            ds = ejb.detailList(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }
    
    // 비독자 관리 일괄등록
    public void insertList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_I_RDR_MNGMEMBDataSet ds = null;
    	
        // Request Parameter Processing
    	String uid = Util.getSessionParameterValue(req, "uid", true);
    	 
    	String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
    	String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
    	String custclas = Util.Uni2Ksc(Util.checkString(req.getParameter("custclas")));
    	String custclas2 = Util.Uni2Ksc(Util.checkString(req.getParameter("custclas2")));
    	String area = Util.Uni2Ksc(Util.checkString(req.getParameter("area")));
    	String custnm = Util.Uni2Ksc(Util.checkString(req.getParameter("custnm")));
    	String sex = Util.Uni2Ksc(Util.checkString(req.getParameter("sex")));
    	String age = Util.Uni2Ksc(Util.checkString(req.getParameter("age")));
    	String home_zip = Util.Uni2Ksc(Util.checkString(req.getParameter("home_zip")));
    	String home_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("home_addr")));
    	String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));
    	String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
    	String medinm = Util.Uni2Ksc(Util.checkString(req.getParameter("medinm")));
    	String subs_prd = Util.Uni2Ksc(Util.checkString(req.getParameter("subs_prd")));
    	String chrn_pre = Util.Uni2Ksc(Util.checkString(req.getParameter("chrn_pre")));
    	String chrn_emy = Util.Uni2Ksc(Util.checkString(req.getParameter("chrn_emy")));
    	String chrn_mid = Util.Uni2Ksc(Util.checkString(req.getParameter("chrn_mid")));
    	String chrn_hig = Util.Uni2Ksc(Util.checkString(req.getParameter("chrn_hig")));
    	String evntdate_from = Util.Uni2Ksc(Util.checkString(req.getParameter("evntdate_from")));
    	String evntdate_to = Util.Uni2Ksc(Util.checkString(req.getParameter("evntdate_to")));
    	
        // DM Setting    	
    	SS_I_RDR_MNGMEMBDM dm = new SS_I_RDR_MNGMEMBDM();
    	dm.setUid(uid);
    	dm.setClsf(clsf);
    	dm.setRegdt(regdt);
    	dm.setCustclas(custclas);
    	dm.setCustclas2(custclas2);
    	dm.setArea(area);
    	dm.setCustnm(custnm);
    	dm.setSex(sex);
    	dm.setAge(age);
    	dm.setHome_zip(home_zip);
    	dm.setHome_addr(home_addr);
    	dm.setRdrptph_no1(rdrptph_no1);
    	dm.setEmail(email);
    	dm.setMedinm(medinm);
    	dm.setSubs_prd(subs_prd);
    	dm.setChrn_pre(chrn_pre);
    	dm.setChrn_emy(chrn_emy);
    	dm.setChrn_mid(chrn_mid);
    	dm.setChrn_hig(chrn_hig);
    	dm.setEvntdate_from(evntdate_from);
    	dm.setEvntdate_to(evntdate_to);
    	
    	SSReader1700DAO dao = new SSReader1700DAO();
        // DAO 객체의 selectInitList 호출
        ds = dao.insertList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSReader1700EJBHome home = (SSReader1700EJBHome)JNDIManager.getInstance().getHome("SSReader1700EJB");
        try{
            SSReader1700EJB ejb = home.create();
            ds = ejb.insertList(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }
    
    // 비독자 관리 수정
    public void updateList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_U_RDR_MNGMEMBDataSet ds = null;
    	
        // Request Parameter Processing
    	String uid = Util.getSessionParameterValue(req, "uid", true);
    	
    	String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
    	String custclas = Util.Uni2Ksc(Util.checkString(req.getParameter("custclas")));
    	String custclas2 = Util.Uni2Ksc(Util.checkString(req.getParameter("custclas2")));
    	String area = Util.Uni2Ksc(Util.checkString(req.getParameter("area")));
    	String custseq = Util.Uni2Ksc(Util.checkString(req.getParameter("custseq")));
    	String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
    	String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
    	String custnm = Util.Uni2Ksc(Util.checkString(req.getParameter("custnm")));
    	String sex = Util.Uni2Ksc(Util.checkString(req.getParameter("sex")));
    	String age = Util.Uni2Ksc(Util.checkString(req.getParameter("age")));
    	String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
    	String home_zip = Util.Uni2Ksc(Util.checkString(req.getParameter("home_zip")));
    	String home_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("home_addr")));
    	String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));
    	String medinm = Util.Uni2Ksc(Util.checkString(req.getParameter("medinm")));
    	String subs_prd = Util.Uni2Ksc(Util.checkString(req.getParameter("subs_prd")));
    	String evntdate_from = Util.Uni2Ksc(Util.checkString(req.getParameter("evntdate_from")));
    	String evntdate_to = Util.Uni2Ksc(Util.checkString(req.getParameter("evntdate_to")));
    	String chrn_pre = Util.Uni2Ksc(Util.checkString(req.getParameter("chrn_pre")));
    	String chrn_emy = Util.Uni2Ksc(Util.checkString(req.getParameter("chrn_emy")));
    	String chrn_mid = Util.Uni2Ksc(Util.checkString(req.getParameter("chrn_mid")));
    	String chrn_hig = Util.Uni2Ksc(Util.checkString(req.getParameter("chrn_hig")));
    	     	   	
        // DM Setting    	
    	SS_U_RDR_MNGMEMBDM dm = new SS_U_RDR_MNGMEMBDM();

    	dm.setUid(uid);
    	dm.setCmpycd(cmpycd);
    	dm.setCustclas(custclas);
    	dm.setCustclas2(custclas2);
    	dm.setArea(area);
    	dm.setCustseq(custseq);
    	dm.setClsf(clsf);
    	dm.setRegdt(regdt);
    	dm.setCustnm(custnm);
    	dm.setSex(sex);
    	dm.setAge(age);
    	dm.setEmail(email);
    	dm.setHome_zip(home_zip);
    	dm.setHome_addr(home_addr);
    	dm.setRdrptph_no1(rdrptph_no1);
    	dm.setMedinm(medinm);
    	dm.setSubs_prd(subs_prd);
    	dm.setEvntdate_from(evntdate_from);
    	dm.setEvntdate_to(evntdate_to);
    	dm.setChrn_pre(chrn_pre);
    	dm.setChrn_emy(chrn_emy);
    	dm.setChrn_mid(chrn_mid);
    	dm.setChrn_hig(chrn_hig);
    	
    	SSReader1700DAO dao = new SSReader1700DAO();
        // DAO 객체의 selectInitList 호출
        ds = dao.updateList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSReader1700EJBHome home = (SSReader1700EJBHome)JNDIManager.getInstance().getHome("SSReader1700EJB");
        try{
            SSReader1700EJB ejb = home.create();
            ds = ejb.updateList(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }
    
    // 비독자 관리 상세조회
    public void deleteList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_D_RDR_MNGMEMBDataSet ds = null;
    	
        // Request Parameter Processing
    	String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
    	String custclas = Util.Uni2Ksc(Util.checkString(req.getParameter("custclas")));
    	String custseq = Util.Uni2Ksc(Util.checkString(req.getParameter("custseq")));
    	    	    
        // DM Setting    	
    	SS_D_RDR_MNGMEMBDM dm = new SS_D_RDR_MNGMEMBDM();
    	dm.setCmpycd(cmpycd);
    	dm.setCustclas(custclas);
    	dm.setCustseq(custseq);
    	
    	SSReader1700DAO dao = new SSReader1700DAO();
        // DAO 객체의 selectInitList 호출
        ds = dao.deleteList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSReader1700EJBHome home = (SSReader1700EJBHome)JNDIManager.getInstance().getHome("SSReader1700EJB");
        try{
            SSReader1700EJB ejb = home.create();
            ds = ejb.deleteList(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

}
