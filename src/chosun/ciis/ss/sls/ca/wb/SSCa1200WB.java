/***************************************************************************************************
 * ���ϸ�   : SSCa1200WB.java
 * ���     : ���̹�����-���̹���������
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


public class SSCa1200WB {

    /**
     * ���̹�����-���̹���������-��ȸ
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectStafpayList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_CYBALON_STAFPAYDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);          //�����

        // Request Parameter Processing
        String closyymm = Util.checkString(req.getParameter("closyymm"));            //���긶����
        String selcd = Util.checkString(req.getParameter("selcd"));                  //�˻��ڵ�
        String selnm = Util.Uni2Ksc(Util.checkString(req.getParameter("selnm")));    //�˻���
        String pageno = Util.checkString(req.getParameter("pageno"));                //��������ȣ
        String pagesize = Util.checkString(req.getParameter("pagesize"));            //������������

        // DM Setting
        SS_L_CYBALON_STAFPAYDM dm = new SS_L_CYBALON_STAFPAYDM();

        dm.setClosyymm(closyymm);                                                    //���긶����
        dm.setSelcd(selcd);                                                          //�˻��ڵ�
        dm.setSelnm(selnm);                                                          //�˻���
        dm.setIncmgpers(incmgpers);                                                  //�����
        dm.setPageno(Long.parseLong(pageno));                                        //��������ȣ      
        dm.setPagesize(Long.parseLong(pagesize));                                    //������������    

        SSCa1200DAO dao = new SSCa1200DAO();
        // DAO ��ü�� selectStafpayList ȣ��
        ds = dao.selectStafpayList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSCa1200EJBHome home = (SSCa1200EJBHome)JNDIManager.getInstance().getHome("SSCa1200EJB");
        try{
            SSCa1200EJB ejb = home.create();
            ds = ejb.selectStafpayList(dm);
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
     * ���̹�����-���̹���������-DOWNLOAD
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectDownloadList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_P_CYBALON_STAFPAYDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);          //�����

        // Request Parameter Processing
        String closyymm = Util.checkString(req.getParameter("closyymm"));            //���긶����
        String selcd = Util.checkString(req.getParameter("selcd"));                  //�˻��ڵ�
        String selnm = Util.Uni2Ksc(Util.checkString(req.getParameter("selnm")));    //�˻���

        // DM Setting
        SS_P_CYBALON_STAFPAYDM dm = new SS_P_CYBALON_STAFPAYDM();

        dm.setClosyymm(closyymm);                                                    //���긶����
        dm.setSelcd(selcd);                                                          //�˻��ڵ�
        dm.setSelnm(selnm);                                                          //�˻���
        dm.setIncmgpers(incmgpers);                                                  //�����

        SSCa1200DAO dao = new SSCa1200DAO();
        // DAO ��ü�� selectStafpayList ȣ��
        ds = dao.selectDownloadList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSCa1200EJBHome home = (SSCa1200EJBHome)JNDIManager.getInstance().getHome("SSCa1200EJB");
        try{
            SSCa1200EJB ejb = home.create();
            ds = ejb.selectDownloadList(dm);
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