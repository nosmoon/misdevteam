/***************************************************************************************************
* ���ϸ� : SSBrinfo1500WB.java
* ��� : ����Info-������������Ȳ ó���� ���� Worker Bean
* �ۼ����� : 2004-02-09
* �ۼ��� : �輺��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ����Info-������������Ȳ�� ���� WB
 */

public class SSBrinfo1500WB{

    /**
     * ����Info-������������Ȳ-�ʱ�ȭ��(�μ���ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectBuseoList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_NWBUSEOCDDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_NWBUSEOCDDM dm = new SS_L_NWBUSEOCDDM();

        SSBrinfo1500DAO dao = new SSBrinfo1500DAO();
        // DAO ��ü�� selectBuseoList ȣ��
        ds = dao.selectBuseoList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrinfo1500EJBHome home = (SSBrinfo1500EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1500EJB");
        try{
            SSBrinfo1500EJB ejb = home.create();
            ds = ejb.selectBuseoList(dm);
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
     * ����Info-������������Ȳ-�ʱ�ȭ��(�����ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectLeasamtList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_LEASAMT_LISTDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        String deptcd = Util.checkString(req.getParameter("deptcd"));  //�μ��ڵ�
        String areacd = Util.checkString(req.getParameter("areacd"));  //�����ڵ�
        String bocd = Util.checkString(req.getParameter("bocd"));      //�����ڵ�
        String presi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_nm")));
        String booffi_roomownr = Util.Uni2Ksc(Util.checkString(req.getParameter("booffi_roomownr")));
        String bondprsvobjvolownr = Util.Uni2Ksc(Util.checkString(req.getParameter("bondprsvobjvolownr")));

        String pageno = Util.checkString(req.getParameter("pageno"));       //���� ������
        String pagesize = Util.checkString(req.getParameter("pagesize")); //�������� �Ǽ�

        // DM Setting
        SS_L_LEASAMT_LISTDM dm = new SS_L_LEASAMT_LISTDM();

        dm.setDeptcd(deptcd);  //�μ��ڵ�
        dm.setAreacd(areacd);  //�����ڵ�
        dm.setBocd(bocd);      //�����ڵ�
        dm.setPresi_nm(presi_nm);
        dm.setBooffi_roomownr(booffi_roomownr);
        dm.setBondprsvobjvolownr(bondprsvobjvolownr);

        dm.setPageno(Long.parseLong(pageno));  //��������ȣ
        dm.setPagesize(Long.parseLong(pagesize));  //������������

        SSBrinfo1500DAO dao = new SSBrinfo1500DAO();
        // DAO ��ü�� selectLeasamtList ȣ��
        ds = dao.selectLeasamtList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrinfo1500EJBHome home = (SSBrinfo1500EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1500EJB");
        try{
            SSBrinfo1500EJB ejb = home.create();
            ds = ejb.selectLeasamtList(dm);
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
     * ����Info-������������Ȳ-�� ��ȸ
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectDetailView(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_LEASAMTDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        String deptcd = Util.checkString(req.getParameter("deptcd"));  //�μ��ڵ�
        String areacd = Util.checkString(req.getParameter("areacd"));  //�����ڵ�
        String bocd = Util.checkString(req.getParameter("bocd"));      //�����ڵ�
        String seq = Util.checkString(req.getParameter("seq"));

        // DM Setting
        SS_S_LEASAMTDM dm = new SS_S_LEASAMTDM();

        dm.setDeptcd(deptcd);  //�μ��ڵ�
        dm.setAreacd(areacd);  //�����ڵ�
        dm.setBocd(bocd);      //�����ڵ�
        dm.setSeq(seq);
        
        SSBrinfo1500DAO dao = new SSBrinfo1500DAO();
        // DAO ��ü�� selectDetailView ȣ��
        ds = dao.selectDetailView(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrinfo1500EJBHome home = (SSBrinfo1500EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1500EJB");
        try{
            SSBrinfo1500EJB ejb = home.create();
            ds = ejb.selectDetailView(dm);
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
     * ����Info-������������Ȳ-���� ����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void updateDetailView(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_U_LEASAMTDataSet ds = null;
        // Request Parameter Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                   // �۾���
        String deptcd = Util.checkString(req.getParameter("deptcd"));                            //�μ��ڵ�
        String areacd = Util.checkString(req.getParameter("areacd"));                            //�����ڵ�
        String bocd = Util.checkString(req.getParameter("bocd"));                                //�����ڵ�
        String seq = Util.checkString(req.getParameter("seq"));

        String bondregiconf = Util.checkString(req.getParameter("bondregiconf"));                //ä�ǵ������
        String bondregi = Util.checkString(req.getParameter("bondregi"));                        //ä�ǵ��ε
        String bondwarrp = Util.checkString(req.getParameter("bondwarrp"));                      //ä�Ǻ�����
        String leascntrp = Util.checkString(req.getParameter("leascntrp"));                      //������༭
        String leasregi = Util.checkString(req.getParameter("leasregi"));                        //�������ε
        String leasexch_note = Util.checkString(req.getParameter("leasexch_note"));              //��������
        String leasloandeed = Util.checkString(req.getParameter("leasloandeed"));                //������������
        String prvoffideciddocuyn = Util.checkString(req.getParameter("prvoffideciddocuyn"));    //���ӱ����缭��
        String curroffideciddocuyn = Util.checkString(req.getParameter("curroffideciddocuyn"));  //���ӱ����缭��
        String prvhdqtdeciddocuyn = Util.checkString(req.getParameter("prvhdqtdeciddocuyn"));    //���Ӻ����缭��
        String currhdqtdeciddocuyn = Util.checkString(req.getParameter("currhdqtdeciddocuyn"));  //���Ӻ����缭��
        String remk= Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));                                                   //���

        // DM Setting
        SS_U_LEASAMTDM dm = new SS_U_LEASAMTDM();

        dm.setIncmgpers(incmgpers);                           //�Է���
        dm.setDeptcd(deptcd);                                 //�μ��ڵ�
        dm.setAreacd(areacd);                                 //�����ڵ�
        dm.setBocd(bocd);                                     //�����ڵ�
        dm.setSeq(seq);
        dm.setBondregiconf(bondregiconf);                     //ä�ǵ������
        dm.setBondregi(bondregi);                             //ä�ǵ��ε
        dm.setBondwarrp(bondwarrp);                           //ä�Ǻ�����
        dm.setLeascntrp(leascntrp);                           //������༭
        dm.setLeasregi(leasregi);                             //�������ε
        dm.setLeasexch_note(leasexch_note);                   //��������
        dm.setLeasloandeed(leasloandeed);                     //������������
        dm.setPrvoffideciddocuyn(prvoffideciddocuyn);         //���ӱ����缭��
        dm.setCurroffideciddocuyn(curroffideciddocuyn);       //���ӱ����缭��
        dm.setPrvhdqtdeciddocuyn(prvhdqtdeciddocuyn);         //���Ӻ����缭��
        dm.setCurrhdqtdeciddocuyn(currhdqtdeciddocuyn);       //���Ӻ����缭��
        dm.setRemk(remk);                                     //���
        
        SSBrinfo1500DAO dao = new SSBrinfo1500DAO();
        // DAO ��ü�� selectDetailView ȣ��
        ds = dao.updateDetailView(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrinfo1500EJBHome home = (SSBrinfo1500EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1500EJB");
        try{
            SSBrinfo1500EJB ejb = home.create();
            ds = ejb.updateDetailView(dm);
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
