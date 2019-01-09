/***************************************************************************************************
 * 파일명 : SSAdmin1900WB.java
 * 기능 : 주소코드 관리
 * 작성일자 : 2014-07-28
 * 작성자 :  심정보
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.admin.wb;

import javax.ejb.*;

import java.rmi.*;

import javax.servlet.http.*;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 관리자-지국월마감을 위한 WB
 */

public class SSAdmin1900WB {
    
    /**
     * 관리자-담당별 우편번호 변경처리-조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAddrcdTrsfbo(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_ADDRCD_TRSFBODataSet ds = null; 
        // Request Parameter Processing
    	
    	String bocd = Util.checkString(req.getParameter("bocd"));
    	
        // DM Setting
    	SS_L_ADDRCD_TRSFBODM dm = new SS_L_ADDRCD_TRSFBODM();
        
        dm.setBocd(bocd);
                
        dm.print();
        
        SSAdmin1900DAO dao = new SSAdmin1900DAO();

        ds = dao.selectAddrcdTrsfbo(dm);
        req.setAttribute("ds", ds);
    }
    
    public void selectAddrcdAcptbo(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_ADDRCD_ACPTBODataSet ds = null;
        // Request Parameter Processing
    	
    	String bocd = Util.checkString(req.getParameter("bocd"));
    	
        // DM Setting
    	SS_L_ADDRCD_ACPTBODM dm = new SS_L_ADDRCD_ACPTBODM();
        
        dm.setBocd(bocd);
                
        dm.print();
        
        SSAdmin1900DAO dao = new SSAdmin1900DAO();

        ds = dao.selectAddrcdAcptbo(dm);
        req.setAttribute("ds", ds);
    }
    
    public void saveAddrcd(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_A_ADDRCD_BOCHGDataSet ds = null;
        // Request Parameter Processing
    	
    	String trsfbocd = Util.checkString(req.getParameter("trsfbocd"));
    	String acptbocd = Util.checkString(req.getParameter("acptbocd"));
    	String addrcd = Util.checkString(req.getParameter("dlvcd"));
    	String new_addrcd = Util.checkString(req.getParameter("new_addrcd"));
    	String uid = Util.getSessionParameterValue(req, "uid", true);
    	
    	System.out.println("trsf:"+trsfbocd);
    	System.out.println("acpt:"+acptbocd);
    	System.out.println("dlvcd:"+addrcd);
    	System.out.println("new_dlvcd:"+new_addrcd);
    	
        // DM Setting
    	SS_A_ADDRCD_BOCHGDM dm = new SS_A_ADDRCD_BOCHGDM();
        
        dm.setTrsfbocd(trsfbocd);
        dm.setAcptbocd(acptbocd);
        dm.setAddrcd(addrcd);
        dm.setNew_addrcd(new_addrcd);
        dm.setUid(uid);
                
        dm.print();
        
        SSAdmin1900DAO dao = new SSAdmin1900DAO();

        ds = dao.saveAddrcd(dm);
        req.setAttribute("ds", ds);        
    }
}



