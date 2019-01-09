/***************************************************************************************************
 * ���ϸ�   : PSSupport1201WB.java
 * ��  ��   : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
 *            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 * �ۼ����� : 2003-10-29
 * �ۼ���   : ���ȣ
 **************************************************************************************************/
/**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ��  ��   :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.support.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.support.ejb.*;
import chosun.ciis.ps.pbs.support.ds.*;
import chosun.ciis.ps.pbs.support.dm.*;
import chosun.ciis.ps.pbs.support.dao.*;

/**
 * ��������-����ó��
 */
public class PSSupport1201WB {
    /**
     * ��ȸȭ�鿡 ���Ǵ� �ڵ尪�� �����´�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_DSCT_SPPTDataSet ds = null;
        // ���Ǳ��� �ƴҰ��� ALL�� ��� ��ü�ڵ带 ��ȸ�Ѵ�.

        PS_L_DSCT_SPPTDM dm = new PS_L_DSCT_SPPTDM(); // DM ���� Setting�Ѵ�.
        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // ȸ���ڵ�

        dm.setCmpycd(cmpycd);

        PSSupport1101EJBHome home = (PSSupport1101EJBHome) JNDIManager.getInstance().getHome("PSSupport1101EJB");
        try {

            PSSupport1101EJB ejb = home.create();

            ds = ejb.selectCodeList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

            req.setAttribute("ds", ds); // request�� ������� ��´�.
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
     * ���������� ������ ��ȸ�Ѵ�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectRdrList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_DSCT_CATLDataSet ds = null;

        //����� ��������
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //���������ڵ�

        String kubun = Util.checkString(req.getParameter("kubun"));
        String datefrom = Util.checkString(req.getParameter("datefrom"));
        String dateto = Util.checkString(req.getParameter("dateto"));
        String dscttypecd = Util.checkString(req.getParameter("dscttypecd"));
        String boprocyn = Util.checkString(req.getParameter("boprocyn"));
        String curr_page_no = req.getParameter("curr_page_no"); // ����������
        String records_per_page = req.getParameter("records_per_page"); // �������� Row��

        int iPageSize = Integer.parseInt(records_per_page); // �������� Row�� int�� ��ȯ
        int iPageNo = 1; // ���� ������ 1�� ����
        if (curr_page_no != null && !curr_page_no.equals("")) { // ������ ���� ������ �缳��
            iPageNo = Integer.parseInt(curr_page_no);
        }

        PS_L_DSCT_CATLDM dm = new PS_L_DSCT_CATLDM(); // DM ���� Setting�Ѵ�.

        dm.setCmpycd(cmpycd);
        dm.setKubun(kubun);
        dm.setDatefrom(datefrom);
        dm.setDateto(dateto);
        dm.setDscttypecd(dscttypecd);
        dm.setBoprocyn(boprocyn);
        dm.setPageno(iPageNo);
        dm.setPagesize(iPageSize);

        PSSupport1201EJBHome home = (PSSupport1201EJBHome) JNDIManager.getInstance().getHome("PSSupport1201EJB");
        try {

            PSSupport1201EJB ejb = home.create();

            ds = ejb.selectRdrList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

            req.setAttribute("ds", ds); // request�� ������� ��´�.
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
     * ���������� Ȯ�� �� ó���Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void updateDsct(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_A_DSCTDataSet ds = null;

        //����� ��������
        String bocd = Util.getSessionParameterValue(req, "cmpycd", true); //���������ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //�Է��ھ��̵�

        String accflag = Util.checkString(req.getParameter("accflag"));
        String regdt = Util.checkString(req.getParameter("regdt"));
        String regno = Util.checkString(req.getParameter("regno"));
        String proccont = Util.Uni2Ksc(Util.checkString(req.getParameter("boproccont")));
        String boprocyn = Util.checkString(req.getParameter("boprocyn"));
        String procpers = Util.Uni2Ksc(Util.checkString(req.getParameter("procpers")));

        PS_A_DSCTDM dm = new PS_A_DSCTDM(); // DM ���� Setting�Ѵ�.

        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setRegdt(regdt);
        dm.setRegno(regno);
        dm.setProccont(proccont);
        dm.setBoprocyn(boprocyn);
        dm.setProcpers(procpers);

        PSSupport1201EJBHome home = (PSSupport1201EJBHome) JNDIManager.getInstance().getHome("PSSupport1201EJB");
        try {

            PSSupport1201EJB ejb = home.create();

            ds = ejb.updateDsct(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

            req.setAttribute("ds", ds); // request�� ������� ��´�.
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
     * �Ҹ����� �󼼳��� ����
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectDsctDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_DSCT_CATLDataSet ds = null;

        //����� ��������
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //���������ڵ�

        String regdt = Util.checkString(req.getParameter("regdt"));
        String regno = Util.checkString(req.getParameter("regno"));

        PS_S_DSCT_CATLDM dm = new PS_S_DSCT_CATLDM(); // DM ���� Setting�Ѵ�.

        dm.setCmpycd(cmpycd);
        dm.setRegdt(regdt);
        dm.setRegno(regno);

        PSSupport1201EJBHome home = (PSSupport1201EJBHome) JNDIManager.getInstance().getHome("PSSupport1201EJB");
        try {

            PSSupport1201EJB ejb = home.create();

            ds = ejb.selectDsctDetail(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

            req.setAttribute("ds", ds); // request�� ������� ��´�.
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
    * ���������� Ȯ�� �� ó���Ѵ�.
    * ��ȸ�� request���� set�Ѵ�.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    */
   public void updateBranchDsct(HttpServletRequest req, HttpServletResponse res) throws AppException {
       PS_U_DSCTDataSet ds = null;

       //����� ��������
       String bocd = Util.getSessionParameterValue(req, "cmpycd", true);    //���������ڵ�
       String incmgpers = Util.getSessionParameterValue(req, "uid", true);  //�Է��ھ��̵�

       String regdt = Util.checkString(req.getParameter("regdt"));          //�������
       String regno = Util.checkString(req.getParameter("regno"));          //��Ϲ�ȣ
       String rdrbocd = Util.checkString(req.getParameter("rdrbocd"));      //�ش�����
       String rdr_no = Util.checkString(req.getParameter("rdr_no"));        //���ڹ�ȣ
       String medicd =  Util.checkString(req.getParameter("medicd"));       //��ü�ڵ�
       String termsubsno =  Util.checkString(req.getParameter("termsubsno"));   //���ڹ�ȣ

       String boproccont = Util.Uni2Ksc(Util.checkString(req.getParameter("boproccont")));  //ó������
       String boprocyn = Util.checkString(req.getParameter("boprocyn"));                    //ó������
       String procpers = Util.Uni2Ksc(Util.checkString(req.getParameter("procpers")));                    //�����

       PS_U_DSCTDM dm = new PS_U_DSCTDM(); // DM ���� Setting�Ѵ�.

       dm.setRegdt(regdt);
       dm.setRegno(regno);
       dm.setRdrbocd(rdrbocd);
       dm.setRdr_no(rdr_no);
       dm.setMedicd(medicd);
       dm.setTermsubsno(termsubsno);

       dm.setBoproccont(boproccont);
       dm.setBoprocyn(boprocyn);
       dm.setProcpers(procpers);
       dm.setIncmgpers(incmgpers);

       PSSupport1201EJBHome home = (PSSupport1201EJBHome) JNDIManager.getInstance().getHome("PSSupport1201EJB");
       try {

           PSSupport1201EJB ejb = home.create();

           ds = ejb.updateBranchDsct(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

           req.setAttribute("ds", ds); // request�� ������� ��´�.
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

}