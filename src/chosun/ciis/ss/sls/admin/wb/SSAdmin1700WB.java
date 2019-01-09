/***************************************************************************************************
 * 파일명 : SSAdmin1600WB.java
 * 기능 : 우편번호 관리를 위한 Worker Bean
 * 작성일자 : 2009-04-27
 * 작성자 :  권정윤
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
import java.util.Enumeration;

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
import chosun.ciis.ss.sls.admin.rec.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 관리자-지국월마감을 위한 WB
 */

public class SSAdmin1700WB {
    
    /**
     * 관리자-담당별 우편번호 변경처리-조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectNewjusoAppr(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_NEWJUSO_APPRDataSet ds = null;
        // Request Parameter Processing
    	
    	String dealdeptcd_session = Util.getSessionParameterValue(req, "dealdeptcd", true);
//    	System.out.println("dealdeptcd : "+dealdeptcd_session);

    	String[] dealdeptcd_arr = dealdeptcd_session.split("\\^");
    	
    	String zipcode = Util.checkString(req.getParameter("zipcode"));
    	String areagubun = Util.checkString(req.getParameter("areaGubun"));
    	String areaname = Util.checkString(req.getParameter("areaName"));
    	String rdnm = Util.checkString(req.getParameter("rdnm"));
    	String bldgnm = Util.checkString(req.getParameter("bldgnm"));
    	String bocd = Util.checkString(req.getParameter("bocd"));
    	String appryn = Util.checkString(req.getParameter("appryn"));
    	
    	// dealdeptcd In-List format Setting
    	String dealdeptcd = "(";
    	
    	dealdeptcd = "(";
    	
    	for(int i=0; i<dealdeptcd_arr.length; i++) {
    		if(i == 0) {
    			dealdeptcd += "'"+dealdeptcd_arr[i]+"'";
    		}else if(!dealdeptcd_arr[i].equals("")){
    			dealdeptcd += ", '"+dealdeptcd_arr[i]+"'";
    		}
    		if(i == dealdeptcd_arr.length-1) {
    			dealdeptcd += ")";
    		}
    	}
    	
//    	System.out.println("dealdeptcd !!!!!!!!!!!!!!!  : "+dealdeptcd);
    	
        // DM Setting
    	SS_L_NEWJUSO_APPRDM dm = new SS_L_NEWJUSO_APPRDM();
        
        dm.setZipcode(zipcode);
        dm.setAreagubun(areagubun);
        dm.setAreaname(areaname);
        dm.setRdnm(rdnm);
        dm.setBldgnm(bldgnm);
        dm.setBocd(bocd);
        dm.setDealdeptcd(dealdeptcd);
        dm.setAppryn(appryn);
        
        dm.print();
        
        SSAdmin1700DAO dao = new SSAdmin1700DAO();

        ds = dao.selectNewjusoAppr(dm);
        req.setAttribute("ds", ds);
    }
    
    public void updateNewjusoApprReq(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_U_NEWJUSO_APPR_REQDataSet ds = null;
        // Request Parameter Processing
    	String uid = Util.getSessionParameterValue(req, "uid", true);

    	String chgbocd = Util.checkString(req.getParameter("bocd"));
    	String bldmngnn = Util.checkString(req.getParameter("bldmngnn"));
    	    	
        // DM Setting
    	SS_U_NEWJUSO_APPR_REQDM dm = new SS_U_NEWJUSO_APPR_REQDM();
    	dm.setUid(uid);
    	dm.setChgbocd(chgbocd);
    	dm.setBldmngnn(bldmngnn);
    	

    	SSAdmin1700DAO dao = new SSAdmin1700DAO();
        // DAO 객체의 selectBoclosList 호출
        ds = dao.updateNewjusoApprReq(dm);
        req.setAttribute("ds", ds);
    }
    
    public void updateNewjusoAppr(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_U_NEWJUSO_APPRDataSet ds = null;
        // Request Parameter Processing
    	String uid = Util.getSessionParameterValue(req, "uid", true);

    	String bldmngnn = Util.checkString(req.getParameter("bldmngnn"));
    	String flag = Util.checkString(req.getParameter("flag"));
    	    	
        // DM Setting
    	SS_U_NEWJUSO_APPRDM dm = new SS_U_NEWJUSO_APPRDM();
    	dm.setUid(uid);
    	dm.setBldmngnn(bldmngnn);
    	dm.setFlag(flag);
    	

    	SSAdmin1700DAO dao = new SSAdmin1700DAO();
        // DAO 객체의 selectBoclosList 호출
        ds = dao.updateNewjusoAppr(dm);
        req.setAttribute("ds", ds);
    }

	public void newjusoApprHistory(HttpServletRequest req, HttpServletResponse res) throws AppException {
		// TODO Auto-generated method stub
		String bldmngnn = Util.checkString(req.getParameter("bldmngnn"));
		
		SS_L_NEWJUSO_APPR_HISDM dm = new SS_L_NEWJUSO_APPR_HISDM();
		dm.setBldmngnn(bldmngnn);
		
		SSAdmin1700DAO dao = new SSAdmin1700DAO();
		SS_L_NEWJUSO_APPR_HISDataSet ds = new SS_L_NEWJUSO_APPR_HISDataSet();
		ds = dao.newjusoApprHistory(dm);
		
		req.setAttribute("ds", ds);
	}
}