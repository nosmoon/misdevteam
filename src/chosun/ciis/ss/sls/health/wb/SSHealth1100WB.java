/***************************************************************************************************
 * 파일명 : SSHealth1100WB.java
 * 기능 : 워크북 마감
 * 작성일자 : 2015-1-5
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
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.health.ds.*;
import chosun.ciis.ss.sls.health.dm.*;
import chosun.ciis.ss.sls.health.dao.*;

/**
 * 확장현황-신청현황 을 위한 WB
 */

public class SSHealth1100WB {
    
    public void selectWorkbookSend(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_WORKBOOK_SENDCLSDataSet ds = null;
    	SS_L_WORKBOOK_SENDCLSDM dm = new SS_L_WORKBOOK_SENDCLSDM();
    	
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	
    	dm.print();

        SSHealth1100DAO dao = new SSHealth1100DAO();
        // DAO 객체의 init 호출
        ds = dao.selectWorkbookSend(dm);
        req.setAttribute("ds", ds);
    }
    
    public void detailWorkbookSend(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_S_WORKBOOK_SENDCLSDataSet ds = null;
    	SS_S_WORKBOOK_SENDCLSDM dm = new SS_S_WORKBOOK_SENDCLSDM();
    	
    	String clsdt = Util.checkString(req.getParameter("clsdt"));
    	    	
    	dm.setClsdt(clsdt);
    	
    	dm.print();

        SSHealth1100DAO dao = new SSHealth1100DAO();
        // DAO 객체의 init 호출
        ds = dao.detailWorkbookSend(dm);
        req.setAttribute("ds", ds);
    }
    
    public void saveWorkbookSend(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_A_WORKBOOK_SENDCLSDataSet ds = null;
    	SS_A_WORKBOOK_SENDCLSDM dm = new SS_A_WORKBOOK_SENDCLSDM();
    	
    	String incmgpers = Util.getSessionParameterValue(req, "uid", true);
    	
    	dm.setIncmgpers(incmgpers);
    	    	
    	dm.print();

        SSHealth1100DAO dao = new SSHealth1100DAO();
        // DAO 객체의 init 호출
        ds = dao.saveWorkbookSend(dm);
        req.setAttribute("ds", ds);
    }
}
