/***************************************************************************************************
 * ���ϸ� : SSHealth1100WB.java
 * ��� : ��ũ�� ����
 * �ۼ����� : 2015-1-5
 * �ۼ��� : ������
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
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
 * Ȯ����Ȳ-��û��Ȳ �� ���� WB
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
        // DAO ��ü�� init ȣ��
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
        // DAO ��ü�� init ȣ��
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
        // DAO ��ü�� init ȣ��
        ds = dao.saveWorkbookSend(dm);
        req.setAttribute("ds", ds);
    }
}
