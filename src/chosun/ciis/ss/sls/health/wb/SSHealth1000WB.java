/***************************************************************************************************
 * 파일명 : SSHealth1000WB.java
 * 기능 : 워크북 관리
 * 작성일자 : 2014-12-24
 * 작성자 : 심정보
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.health.wb;

import javax.ejb.*;
import java.rmi.*;
import java.util.Hashtable;

import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.ss.sls.health.ds.*;
import chosun.ciis.ss.sls.health.dm.*;
import chosun.ciis.ss.sls.health.dao.*;

public class SSHealth1000WB extends BaseWB{

    public void init(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	
    	SS_L_WORKBOOK_APLC_INITDataSet ds = null;
    	SS_L_WORKBOOK_APLC_INITDM dm = new SS_L_WORKBOOK_APLC_INITDM();
        SSHealth1000DAO dao = new SSHealth1000DAO();
        
        // DAO 객체의 init 호출
        ds = dao.init(dm);
        req.setAttribute("ds", ds);
        
    }
    
    public void selectWorkbook(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_WORKBOOK_APLCDataSet ds = null;
    	SS_L_WORKBOOK_APLCDM dm = new SS_L_WORKBOOK_APLCDM();
    	
    	String deptcd = Util.checkString(req.getParameter("deptcd"));
    	String partcd = Util.checkString(req.getParameter("partcd"));
    	String areacd = Util.checkString(req.getParameter("areacd"));
    	String bocd = Util.checkString(req.getParameter("bocd"));
    	String search_flag = Util.checkString(req.getParameter("search_flag"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String recvname = Util.checkString(req.getParameter("recvname"));
    	String aplcpath = Util.checkString(req.getParameter("aplcpath"));
    	
    	dm.setDeptcd(deptcd);
    	dm.setPartcd(partcd);
    	dm.setAreacd(areacd);
    	dm.setBocd(bocd);
    	dm.setSearch_flag(search_flag);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setRecvname(recvname);
    	dm.setAplcpath(aplcpath);
    	
    	dm.print();

        SSHealth1000DAO dao = new SSHealth1000DAO();
        // DAO 객체의 init 호출
        ds = dao.selectWorkbook(dm);
        req.setAttribute("ds", ds);
    }
    
    public void detailWorkbook(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_S_WORKBOOK_APLCDataSet ds = null;
    	SS_S_WORKBOOK_APLCDM dm = new SS_S_WORKBOOK_APLCDM();
    	
    	String aplcdt = Util.checkString(req.getParameter("aplcdt"));
    	String aplcno = Util.checkString(req.getParameter("aplcno"));
    	
    	dm.setAplcdt(aplcdt);
    	dm.setAplcno(aplcno);
    	    	
    	dm.print();

        SSHealth1000DAO dao = new SSHealth1000DAO();
        // DAO 객체의 init 호출
        ds = dao.detailWorkbook(dm);
        req.setAttribute("ds", ds);
    }
    
    public void saveWorkbook(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_A_WORKBOOK_APLCDataSet ds = null;
    	SS_A_WORKBOOK_APLCDM dm = new SS_A_WORKBOOK_APLCDM();
    	
    	String incmgpers = Util.getSessionParameterValue(req, "uid", true);
    	String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate1"));
    	
    	System.out.println("multiUpdate=" + multiUpdateData);
    	/*String aplcdt = Util.checkString(req.getParameter("aplcdt"));
    	String aplcno = Util.checkString(req.getParameter("aplcno"));
    	String status = Util.checkString(req.getParameter("status"));*/
    	
    	Hashtable hash = new Hashtable();
    	
    	dm.setIncmgpers(incmgpers);
    	if ( !"".equals(multiUpdateData) ){
        	
	    	hash 					= getHashMultiUpdateData(multiUpdateData);
	    	String aplcdt			= Util.checkString((String) hash.get("aplcdt"     	));             
	    	String aplcno			= Util.checkString((String) hash.get("aplcno"       ));           
	    	String status			= Util.checkString((String) hash.get("status"       ));       
	    		    	
	    	dm.setAplcdt        	(aplcdt			);      
	    	dm.setAplcno			(aplcno			);
	    	dm.setStatus			(status			);
	 	}
    	
    	dm.print();

        SSHealth1000DAO dao = new SSHealth1000DAO();
        // DAO 객체의 init 호출
        ds = dao.saveWorkbook(dm);
        req.setAttribute("ds", ds);
    }
}
