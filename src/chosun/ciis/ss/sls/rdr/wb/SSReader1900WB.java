/***************************************************************************************************
 * 파일명   : SSReader1900WB.java
 * 기  능   : 독자현황-우송독자관리 WB
 * 작성일자 : 2015-06-16
 * 작성자   : 장선희
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
 * 독자관리-우송독자관리를 위한  WB
 */
public class SSReader1900WB {
    
    // 우송독자관리  초기화면
    public void initList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_POSTDLVRDR_INITDataSet ds = null;
        // Request Parameter Processing
    	
        // DM Setting
    	SS_L_POSTDLVRDR_INITDM dm = new SS_L_POSTDLVRDR_INITDM();

    	
    	SSReader1900DAO dao = new SSReader1900DAO();
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
    
    // 우송독자관리 조회
    public void selectList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_POSTDLVRDRDataSet ds = null;
    	
        // Request Parameter Processing
    	String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
    	String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
    	String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
    	String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));
    	String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
    	String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
    	String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
    	String modiyn = Util.Uni2Ksc(Util.checkString(req.getParameter("modiyn")));

    	System.out.println("deptcd=="+deptcd);
    	System.out.println("partcd=="+partcd);
    	System.out.println("areacd=="+areacd);
    	System.out.println("dlvzip=="+dlvzip);
    	System.out.println("bocd=="+bocd);
    	System.out.println("rdr_no=="+rdr_no);
    	System.out.println("rdrnm=="+rdrnm);
    	System.out.println("modiyn=="+modiyn);
    	
        // DM Setting    	
    	SS_L_POSTDLVRDRDM dm = new SS_L_POSTDLVRDRDM();
    	dm.setDeptcd(deptcd);
    	dm.setPartcd(partcd);
    	dm.setAreacd(areacd);
    	dm.setDlvzip(dlvzip);
    	dm.setBocd(bocd);
    	dm.setRdr_no(rdr_no);
    	dm.setRdrnm(rdrnm);
    	dm.setModiyn(modiyn);

    	SSReader1900DAO dao = new SSReader1900DAO();
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
    
    
    // 우송독자관리  상세조회
    public void detailList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_S_POSTDLVRDRDataSet ds = null;
    	
        // Request Parameter Processing
    	String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
    	    	    
        // DM Setting    	
    	SS_S_POSTDLVRDRDM dm = new SS_S_POSTDLVRDRDM();
    	dm.setRdr_no(rdr_no);
    	
        SSReader1900DAO dao = new SSReader1900DAO();
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
    
    // 우송독자관리 저장
    public void insertList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_A_POSTDLVRDRDataSet ds = null;
    	
        // Request Parameter Processing
    	String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
    	String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));
    	String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));
    	String newdlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("newdlvzip")));
    	String newdlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("newdlvaddr")));
    	String newdlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("newdlvdtlsaddr")));
    	String bldmngnn = Util.Uni2Ksc(Util.checkString(req.getParameter("bldmngnn"))); 
    	
    	System.out.println("rdr_no=="+"["+rdr_no+"]");
    	System.out.println("dlvaddr=="+"["+dlvaddr+"]");
    	System.out.println("dlvdtlsaddr=="+"["+dlvdtlsaddr+"]");
    	System.out.println("newdlvzip=="+"["+newdlvzip+"]");
    	System.out.println("newdlvdtlsaddr=="+"["+newdlvdtlsaddr+"]");
    	System.out.println("bldmngnn=="+"["+bldmngnn+"]");
    	
    	
        // DM Setting    	
    	SS_A_POSTDLVRDRDM dm = new SS_A_POSTDLVRDRDM();
    	dm.setRdr_no(rdr_no);
    	dm.setDlvaddr(dlvaddr);
    	dm.setDlvdtlsaddr(dlvdtlsaddr);
    	dm.setNewdlvzip(newdlvzip);
    	dm.setNewdlvaddr(newdlvaddr);
    	dm.setNewdlvdtlsaddr(newdlvdtlsaddr);
    	dm.setBldmngnn(bldmngnn);
    	
    	SSReader1900DAO dao = new SSReader1900DAO();
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

}
