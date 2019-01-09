/***************************************************************************************************
 * ���ϸ�   : SSCa1300WB.java
 * ���     : ���̹�����-���̹����縶��
 * �ۼ����� : 2005-06-22
 * �ۼ���   : ����
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.ca.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.ca.ds.*;
import chosun.ciis.ss.sls.ca.dm.*;
import chosun.ciis.ss.sls.ca.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;


public class SSCa1300WB {

    /**
     * ���̹�����-���̹����縶��-��������
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAlonClos(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_CYBALON_CLOSPTCRDataSet ds = null;

        // Request Parameter Processing
        String etc1 = Util.checkString(req.getParameter("etc1"));                    //��Ÿ1
        String etc2 = Util.checkString(req.getParameter("etc2"));                    //��Ÿ2
        String etc3 = Util.checkString(req.getParameter("etc3"));                    //��Ÿ3
        String pageno = Util.checkString(req.getParameter("pageno"));                //��������ȣ
        String pagesize = Util.checkString(req.getParameter("pagesize"));            //������������

        //��������ȣüũ
        if(pageno.equals("")) {
        	pageno  =  "1";
        }
        //������������üũ
        if(pagesize.equals("")) {
        	pagesize  =  "15";
        }

        // DM Setting
        SS_L_CYBALON_CLOSPTCRDM dm = new SS_L_CYBALON_CLOSPTCRDM();

        dm.setEtc1(etc1);                                                            //��Ÿ1
        dm.setEtc2(etc2);                                                            //��Ÿ2
        dm.setEtc3(etc3);                                                            //��Ÿ3
        dm.setPageno(Long.parseLong(pageno));                                        //��������ȣ      
        dm.setPagesize(Long.parseLong(pagesize));                                    //������������    

        SSCa1300DAO dao = new SSCa1300DAO();
        // DAO ��ü�� selectStafpayList ȣ��
        ds = dao.selectAlonClos(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSCa1300EJBHome home = (SSCa1300EJBHome)JNDIManager.getInstance().getHome("SSCa1300EJB");
        try{
            SSCa1300EJB ejb = home.create();
            ds = ejb.selectAlonClos(dm);
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

    /**
     * ���̹�����-���̹����縶��-���긶�������
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void accessAlonClos(HttpServletRequest req, HttpServletResponse res) throws AppException{
        CO_A_CYBALONCLOSDataSet ds = null;

        // Session Processing

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));              //ó�������ڵ�(M:���� , C:���)
        String closyymm = Util.checkString(req.getParameter("closyymm"));            //���긶����

        // DM Setting
        CO_A_CYBALONCLOSDM dm = new CO_A_CYBALONCLOSDM();

        dm.setAccflag(accflag);                                                      //ó�������ڵ�(M:���� , C:���)
        dm.setClosyymm(closyymm);                                                    //���긶����
        
        SSCa1300DAO dao = new SSCa1300DAO();
        // DAO ��ü�� selectStafpayList ȣ��
        ds = dao.accessAlonClos(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSCa1300EJBHome home = (SSCa1300EJBHome)JNDIManager.getInstance().getHome("SSCa1300EJB");
        try{
            SSCa1300EJB ejb = home.create();
            ds = ejb.accessAlonClos(dm);
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