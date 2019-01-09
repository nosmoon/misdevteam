/***************************************************************************************************
 * ���ϸ�   : PSAllow1101WB.java
 * ��  ��   : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
 *            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 *            ���Ǿ������� ������ workbeen
 * �ۼ����� : 2004-03-08
 * �ۼ���   : ����
 **************************************************************************************************/
/**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ��  ��   :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.allow.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.allow.ejb.*;
import chosun.ciis.ps.pbs.allow.ds.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.dao.*;

public class PSAllow1101WB {

    /**
     * ������������ �ʱ⸦ ���� �⺻����Ÿ Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectBoemp_AlonKind(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_BOEMP_ALON_KINDDataSet ds = null;

        //Session���� ���� ����Ÿ
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //�����ID

        //���������� Request�� ���� �Ķ����
        String bocd = Util.checkString(req.getParameter("bocd"));                                             //���������ڵ�
        String boemp_no1 = Util.checkString(req.getParameter("boemp_no1"));                                   //�����ȣ1
        String boemp_no2 = Util.checkString(req.getParameter("boemp_no2"));                                   //�����ȣ2
        String deptcd = Util.checkString(req.getParameter("deptcd"));                                         //�μ��ڵ�

        //DM ���� Setting�Ѵ�.
        PS_L_BOEMP_ALON_KINDDM dm = new PS_L_BOEMP_ALON_KINDDM();
        dm.setCmpycd(cmpycd);                                                                                 //ȸ���ڵ�
        dm.setIncmgpers(incmgpers);                                                                           //�����ID
        dm.setBocd(bocd);                                                                                     //���������ڵ�
        dm.setBoemp_no1(boemp_no1);                                                                           //�����ȣ1
        dm.setBoemp_no2(boemp_no2);                                                                           //�����ȣ2
        dm.setDeptcd(deptcd);                                                                                 //�μ��ڵ�

        PSAllow1101EJBHome home = (PSAllow1101EJBHome) JNDIManager.getInstance().getHome("PSAllow1101EJB");
        try {
            PSAllow1101EJB ejb = home.create();
            ds = ejb.selectBoemp_AlonKind(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);        // request�� ������� ��´�.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

    /**
     * ����� �������� ������ ���� �⺻����Ÿ Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void accessBoemp_AlonKind(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_A_BOEMP_ALONKINDDataSet ds = null;

        //����� ��������
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //�����ID

        //���������� Request�� ���� �Ķ����
        String bocd = Util.checkString(req.getParameter("bocd"));                                             //���������ڵ�
        String listcntstr = Util.checkString(req.getParameter("listcnt"));                                    //�� ���ڵ� ī��Ʈ
        if (listcntstr.equals(""))   listcntstr = "0";
        long   listcnt = Long.parseLong(listcntstr);

        StringBuffer empalonkindarr = new StringBuffer("");                                                   //���,�������� Array
        StringBuffer temparr = new StringBuffer("");                                                          //Ư������� ���������� ���� �ӽú���

        //����� �������� String Array�� ����
        for (int i=0 ; i < listcnt ; i++) {
            temparr.append("##");
            temparr.append(Util.checkString(req.getParameter("empno"+i)));                                    //�����ȣ+
            temparr.append("01".equals(Util.checkString(req.getParameter("busn_check"+i)))    ? "&&01" : ""); //��������+
            temparr.append("02".equals(Util.checkString(req.getParameter("rslt_check"+i)))    ? "&&02" : ""); //��������+
            temparr.append("03".equals(Util.checkString(req.getParameter("dcl_amt_check"+i))) ? "&&03" : ""); //��������+
            temparr.append("04".equals(Util.checkString(req.getParameter("spc_check"+i)))     ? "&&04" : ""); //Ư������+
            temparr.append("05".equals(Util.checkString(req.getParameter("posi_check"+i)))    ? "&&05" : ""); //���޼���+
            temparr.append("06".equals(Util.checkString(req.getParameter("prsnt_check"+i)))   ? "&&06" : ""); //��ټ���+
            temparr.append("07".equals(Util.checkString(req.getParameter("camp_check"+i)))    ? "&&07" : ""); //ķ���μ���+
            temparr.append("08".equals(Util.checkString(req.getParameter("cash_check"+i)))    ? "&&08" : ""); //���ݼ���+
            temparr.append("09".equals(Util.checkString(req.getParameter("advn_check"+i)))    ? "&&09" : ""); //�����ޱ�+

            empalonkindarr.append(temparr);  //��ü ���� Array�� Append
            temparr = new StringBuffer("");  //�ʱ�ȭ
        }

        empalonkindarr.delete(0,2);          //ó�� ## ����

        // DM ���� Setting�Ѵ�.
        PS_A_BOEMP_ALONKINDDM dm = new PS_A_BOEMP_ALONKINDDM();
        dm.setCmpycd(cmpycd);                                                                                 //ȸ���ڵ�
        dm.setIncmgpers(incmgpers);                                                                           //�Է»����ȣ
        dm.setBocd(bocd);                                                                                     //���������ڵ�
        dm.setEmpalonkindarr(empalonkindarr.toString());                                                      //���,�������� Array

        PSAllow1101EJBHome home = (PSAllow1101EJBHome)JNDIManager.getInstance().getHome("PSAllow1101EJB");
        try{
            PSAllow1101EJB ejb = home.create();
            ds = ejb.accessBoemp_AlonKind(dm);             // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);                    // request�� ������� ��´�.
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

}