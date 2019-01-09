/***************************************************************************************************
 * ���ϸ� : SSExtn1000WB.java
 * ��� : Ȯ���û ó���� ���� Worker Bean
 * �ۼ����� : 2003-11-15
 * �ۼ��� : ��뼷
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.extn.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.dao.*;

/**
 * Ȯ����Ȳ-��û��Ȳ �� ���� WB
 */

public class SSExtn2300WB {

    /**
     * Ȯ����Ȳ-���Ȯ�����-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void init(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_EXTN_RDR_STATS_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
    	SS_L_EXTN_RDR_STATS_INITDM dm = new SS_L_EXTN_RDR_STATS_INITDM();

        SSExtn2300DAO dao = new SSExtn2300DAO();
        // DAO ��ü�� init ȣ��
        ds = dao.init(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1000EJBHome home = (SSExtn1000EJBHome) JNDIManager.getInstance().getHome("SSExtn1000EJB");
        try {
            SSExtn1000EJB ejb = home.create();
            ds = ejb.init(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    
    /**
     * Ȯ����Ȳ-���Ȯ�� ��� ���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectRdrExtnStatList(HttpServletRequest req, HttpServletResponse res) throws AppException {    	
    	SS_L_EXTN_RDR_STATSDataSet ds = null;
        // Request Parameter Processing
        String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
        String officd = Util.Uni2Ksc(Util.checkString(req.getParameter("officd")));
        String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
        String empnm = Util.Uni2Ksc(Util.checkString(req.getParameter("empnm")));
        String fromtogb = Util.Uni2Ksc(Util.checkString(req.getParameter("fromtogb")));
        String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
        String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
        String fixdt = Util.Uni2Ksc(Util.checkString(req.getParameter("fixdt")));
        String extnqty = Util.Uni2Ksc(Util.checkString(req.getParameter("extnqty")));
        String bo_headcnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_headcnfmyn")));
        String searchflag = Util.Uni2Ksc(Util.checkString(req.getParameter("searchflag")));        
        
        // DM Setting
        SS_L_EXTN_RDR_STATSDM dm = new SS_L_EXTN_RDR_STATSDM();
        dm.setCmpycd(cmpycd);
        dm.setOfficd(officd);
        dm.setDeptcd(deptcd);
        dm.setEmpnm(empnm);
        dm.setFromtogb(fromtogb);        
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setFixdt(fixdt);
        dm.setExtnqty(extnqty);
        dm.setBo_headcnfmyn(bo_headcnfmyn);
        dm.setSearchflag(searchflag);        

        SSExtn2300DAO dao = new SSExtn2300DAO();
        // DAO ��ü�� selectList ȣ��
        ds = dao.selectRdrExtnStatList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1000EJBHome home = (SSExtn1000EJBHome) JNDIManager.getInstance().getHome("SSExtn1000EJB");
        try {
            SSExtn1000EJB ejb = home.create();
            ds = ejb.selectRdrExtnList(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }
}
