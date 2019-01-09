/***************************************************************************************************
 * ���ϸ�   : SSCa1100WB.java
 * ���     : ���̹�����-���̹�����û��
 * �ۼ����� : 2005-06-20
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


public class SSCa1100WB {

    /**
     * ���̹�����-���̹�����û��-��ȸ
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectClamList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_CYBALON_BOCLAMDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);          //�����

        // Request Parameter Processing
        String closyymm = Util.checkString(req.getParameter("closyymm"));            //û����
        String deptcd = Util.checkString(req.getParameter("deptcd"));                //�μ��ڵ�
        String partcd = Util.checkString(req.getParameter("partcd"));                //�μ��ڵ�
        String areacd = Util.checkString(req.getParameter("areacd"));                //�����ڵ�
        String bocd = Util.checkString(req.getParameter("bocd"));                    //���������ڵ�
        String hdqtcnfmyn = Util.checkString(req.getParameter("hdqtcnfmyn"));        //������Ȯ�ο���
        String pageno = Util.checkString(req.getParameter("pageno"));                //��������ȣ
        String pagesize = Util.checkString(req.getParameter("pagesize"));            //������������

        // DM Setting
        SS_L_CYBALON_BOCLAMDM dm = new SS_L_CYBALON_BOCLAMDM();

        dm.setClosyymm(closyymm);                                                    //û����          
        dm.setDeptcd(deptcd);                                                        //�μ��ڵ�
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);                                                        //�����ڵ�        
        dm.setBocd(bocd);                                                            //���������ڵ�    
        dm.setIncmgpers(incmgpers);                                                  //�����
        dm.setHdqtcnfmyn(hdqtcnfmyn);                                                //������Ȯ�ο���
        dm.setPageno(Long.parseLong(pageno));                                        //��������ȣ      
        dm.setPagesize(Long.parseLong(pagesize));                                    //������������
        
        SSCa1100DAO dao = new SSCa1100DAO();
        // DAO ��ü�� selectClamList ȣ��
        ds = dao.selectClamList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSCa1100EJBHome home = (SSCa1100EJBHome)JNDIManager.getInstance().getHome("SSCa1100EJB");
        try{
            SSCa1100EJB ejb = home.create();
            ds = ejb.selectClamList(dm);
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
     * ���̹�����-���̹�����û��-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateCybalon(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_CYBALON_BOCLAMCNFMDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);          //�����
        
        // Request Parameter Processing
        String listcnt = Util.checkString(req.getParameter("listcnt"));              //��ȸ�Ǽ�     
        
        if (listcnt.equals(""))   listcnt = "0";
        long   ll_listcnt = Long.parseLong(listcnt);
        
        String closyymm = Util.checkString(req.getParameter("closyymm"));            //û����
        
        StringBuffer bocdarr       = new StringBuffer("");                           //���������ڵ� Array
        StringBuffer clamtarr      = new StringBuffer("");                           //���ݾ� Array
        StringBuffer hdqtcnfmynarr = new StringBuffer("");                           //����Ȯ�ο��� Array

        //���̹�����û������ String Array�� ����
        for (int i=0 ; i < ll_listcnt ; i++) {
            bocdarr.append("##");                                                    //������+            
            bocdarr.append(Util.checkString(req.getParameter("bocd"+i)));            //���������ڵ�+
            clamtarr.append("##");                                                   //������+
            clamtarr.append(Util.checkString(req.getParameter("clamt"+i)));          //���ݾ�+
            hdqtcnfmynarr.append("##");                                              //������+
            hdqtcnfmynarr.append(Util.checkString(req.getParameter("hdqtcnfmyn"+i)));//����Ȯ�ο���+
        }

        bocdarr.delete(0,2);                                                         //ó�� ## ����
        clamtarr.delete(0,2);                                                        //ó�� ## ����
        hdqtcnfmynarr.delete(0,2);                                                   //ó�� ## ����

        // DM Setting
        SS_A_CYBALON_BOCLAMCNFMDM dm = new SS_A_CYBALON_BOCLAMCNFMDM();

        dm.setIncmgpers(incmgpers);                                                  //�����
        dm.setListcnt(listcnt);                                                      //��ȸ�Ǽ�
        dm.setClosyymm(closyymm);                                                    //û����
        dm.setBocdarr(bocdarr.toString());                                           //���������ڵ� Array
        dm.setClamtarr(clamtarr.toString());                                         //���ݾ� Array
        dm.setHdqtcnfmynarr(hdqtcnfmynarr.toString());                               //����Ȯ�ο��� Array
       
        SSCa1100DAO dao = new SSCa1100DAO();
        // DAO ��ü�� updateCybalon ȣ��
        ds = dao.updateCybalon(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSCa1100EJBHome home = (SSCa1100EJBHome)JNDIManager.getInstance().getHome("SSCa1100EJB");
        try{
            SSCa1100EJB ejb = home.create();
            ds = ejb.updateCybalon(dm);
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