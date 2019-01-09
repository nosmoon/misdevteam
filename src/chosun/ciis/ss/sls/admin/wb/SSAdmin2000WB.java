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
import oracle.sql.*;

/**
 * 관리자-지국월마감을 위한 WB
 */

public class SSAdmin2000WB {
   
    public void selectNewjusoChg(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_NEWJUSO_BOCHGDataSet ds = null; 
        // Request Parameter Processing
    	
    	String sido = Util.checkString(req.getParameter("sido"));
    	String gugun = Util.checkString(req.getParameter("gugun"));
    	String rdnm = Util.checkString(req.getParameter("rdnm"));
    	String b_bldgnn = Util.checkString(req.getParameter("b_bldgnn"));
    	String e_bldgnn = Util.checkString(req.getParameter("e_bldgnn"));
    	String bocd = Util.checkString(req.getParameter("bocd"));
    	String bldgnm = Util.checkString(req.getParameter("bldgnm"));
    	String dong = Util.checkString(req.getParameter("dong"));
    	String b_localnn = Util.checkString(req.getParameter("b_localnn"));
    	String e_localnn = Util.checkString(req.getParameter("e_localnn"));
    	String empty_bocd = Util.checkString(req.getParameter("empty_bocd"));
    	String orderby = Util.checkString(req.getParameter("orderby"));
    	
        // DM Setting
    	SS_L_NEWJUSO_BOCHGDM dm = new SS_L_NEWJUSO_BOCHGDM();
        
    	dm.setSido(sido);
    	dm.setGugun(gugun);
    	dm.setRdnm(rdnm);
    	dm.setB_bldgnn(b_bldgnn);
    	dm.setE_bldgnn(e_bldgnn);
    	dm.setBocd(bocd);
    	dm.setBldgnm(bldgnm);
    	dm.setDong(dong);
    	dm.setB_localnn(b_localnn);
    	dm.setE_localnn(e_localnn);
    	dm.setEmpty_bocd(empty_bocd);
    	dm.setOrderby(orderby);
                
        dm.print();
        
        SSAdmin2000DAO dao = new SSAdmin2000DAO();

        ds = dao.selectNewjusoChg(dm);
        req.setAttribute("ds", ds);
    }
    
    public void updateNewjusoChg(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_U_NEWJUSO_BOCHGDataSet ds = null;
    	
        // Request Parameter Processing
    	String uid = Util.getSessionParameterValue(req, "uid", true);
    	String prebocd = Util.checkString(req.getParameter("prebocd"));
    	String movebocd = Util.checkString(req.getParameter("bocd"));    	
    	String temp_bldmngnn =Util.checkString(req.getParameter("bldmngnn"));
    	String allmove = Util.checkString(req.getParameter("allmove"));
    	String bldmngnn = "";
    	
    	//System.out.println("############################ : "+allmove);
    	
    	SS_U_NEWJUSO_BOCHGDM dm = new SS_U_NEWJUSO_BOCHGDM();
    	SSAdmin2000DAO dao = new SSAdmin2000DAO();
    	
    	//System.out.println("length : " + temp_bldmngnn.getBytes().length);
    	
    	//전체 이동일 때
    	if(allmove.equals("Y")){
    		dm.setUid(uid);
    		dm.setPrebocd(prebocd);
        	dm.setBocd(movebocd);
        	dm.setAllmove(allmove);
        	
        	dm.print();
        	
        	// DAO 객체의 selectBoclosList 호출
        	ds = dao.updateNewjusoChg(dm);
        	
        //선택 값 이동일 때	
    	}else{    	
    		//건물관리번호 길이가 0이 될 때까지 반복
	    	while(temp_bldmngnn.getBytes().length > 0){
	    		//System.out.println("step1 : "+temp_bldmngnn);    		
	    		
	    		//varchar2가 4000byte까지 지원하므로 4000byte가 넘으면 잘라서 반복 처리해야 함
	    		if(temp_bldmngnn.getBytes().length > 3978){    			
	        		//System.out.println("step2 : "+temp_bldmngnn);
	    			bldmngnn = temp_bldmngnn.substring(0,3978);
	    		}else{    			
	        		//System.out.println("step2 : "+temp_bldmngnn);
	    			bldmngnn = temp_bldmngnn.substring(0,temp_bldmngnn.getBytes().length);    			
	    		}
	        	dm.setUid(uid);
	        	dm.setBocd(movebocd);    	
	        	dm.setBldmngnn(bldmngnn);
	        	dm.setAllmove(allmove);
	        	
	        	dm.print();
	        	
	            // DAO 객체의 selectBoclosList 호출
	            ds = dao.updateNewjusoChg(dm);
	            
	            //처리된 건물관리번호는 temp_bldmngnn에서 지워줌. 이렇게 지우다 보면 0이 되겠지..
	            temp_bldmngnn = temp_bldmngnn.replace(bldmngnn,"");
	            //System.out.println("step3 : "+temp_bldmngnn);
	    	}
    	}
    	req.setAttribute("ds", ds);    	
    }
}



