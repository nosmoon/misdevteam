/***************************************************************************************************
 * ���ϸ�   : PSSupport1301WB.java
 * ��  ��   : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
 *            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 * �ۼ����� : 2005-02-07
 * �ۼ���   : ����ǥ
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
 * ��������-�̻�ó��
 */
public class PSSupport1301WB {
    /**
     * ���������� ������ ��ȸ�Ѵ�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectMoveList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_MOVM_RDRDataSet ds = null;

        //����� ��������
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //���������ڵ�

        String regdt_fr = Util.checkString(req.getParameter("regdt_fr"));               //��ȸ����
        String regdt_to = Util.checkString(req.getParameter("regdt_to"));               //��ȸ����
        String boprocyn = Util.checkString(req.getParameter("boprocyn"));               //��������
        String acptbocnfmyn = Util.checkString(req.getParameter("acptbocnfmyn"));       //ó������
        String rdrnm = Util.Ksc2Uni(Util.checkString(req.getParameter("rdrnm")));       //���ڸ�
        String curr_page_no = req.getParameter("curr_page_no");                         // ����������
        String records_per_page = req.getParameter("records_per_page");                 // �������� Row��

        int iPageSize = Integer.parseInt(records_per_page); // �������� Row�� int�� ��ȯ
        int iPageNo = 1; // ���� ������ 1�� ����
        if (curr_page_no != null && !curr_page_no.equals("")) { // ������ ���� ������ �缳��
            iPageNo = Integer.parseInt(curr_page_no);
        }

        PS_L_MOVM_RDRDM dm = new PS_L_MOVM_RDRDM(); // DM ���� Setting�Ѵ�.

        dm.setCmpycd(cmpycd);
        dm.setRegdt_fr(regdt_fr);
        dm.setRegdt_to(regdt_to);
        dm.setRdrnm(rdrnm);
        dm.setBoprocyn(boprocyn);
        dm.setAcptbocnfmyn(acptbocnfmyn);
        dm.setPageno(iPageNo);
        dm.setPagesize(iPageSize);

        PSSupport1301EJBHome home = (PSSupport1301EJBHome) JNDIManager.getInstance().getHome("PSSupport1301EJB");
        try {

            PSSupport1301EJB ejb = home.create();

            ds = ejb.selectMoveList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

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
     * �̻�ó�� �󼼳��� ����
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */

    public void selectMoveDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_MOVM_RDRDataSet ds = null;

        //����� ��������
        String bocd = Util.getSessionParameterValue(req, "cmpycd", true); //���������ڵ�

        String regdt = Util.checkString(req.getParameter("regdt"));
        String regno = Util.checkString(req.getParameter("regno"));

        PS_S_MOVM_RDRDM dm = new PS_S_MOVM_RDRDM(); // DM ���� Setting�Ѵ�.
        dm.setRegdt(regdt);
        dm.setRegno(regno);

        PSSupport1301EJBHome home = (PSSupport1301EJBHome) JNDIManager.getInstance().getHome("PSSupport1301EJB");
        try {

            PSSupport1301EJB ejb = home.create();

            ds = ejb.selectMoveDetail(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
    * �̻��û�� ������� ó���Ѵ�.
    * ��ȸ�� request���� set�Ѵ�.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    */
   public void updateBranchMove(HttpServletRequest req, HttpServletResponse res) throws AppException {
       PS_U_MOVM_RDRDataSet ds = null;

       //����� ��������
       String bocd = Util.getSessionParameterValue(req, "cmpycd", true);    //���������ڵ�
       String incmgpers = Util.getSessionParameterValue(req, "uid", true);  //�Է��ھ��̵�

       String regdt = Util.checkString(req.getParameter("regdt"));          //�������
       String regno = Util.checkString(req.getParameter("regno"));          //��Ϲ�ȣ
       String rdrbocd = Util.checkString(req.getParameter("rdrbocd"));      //�ش�����
       String rdr_no = Util.checkString(req.getParameter("rdr_no"));        //���ڹ�ȣ
       String medicd =  Util.checkString(req.getParameter("medicd"));       //��ü�ڵ�
       String termsubsno =  Util.checkString(req.getParameter("termsubsno"));               //�����ȣ
       String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));                //�ּ�
       String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));              //�ּ�
       String dtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlsaddr")));      //�ּһ�
       String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));            //�����θ�
       String rdrtel_no1 = Util.checkString(req.getParameter("rdrtel_no1"));                //��ȭ1
       String rdrtel_no2 = Util.checkString(req.getParameter("rdrtel_no2"));                //��ȭ2
       String rdrtel_no3 = Util.checkString(req.getParameter("rdrtel_no3"));                //��ȭ3

       PS_U_MOVM_RDRDM dm = new PS_U_MOVM_RDRDM(); // DM ���� Setting�Ѵ�.

       dm.setRegdt(regdt);
       dm.setRegno(regno);
       dm.setRdrbocd(rdrbocd);
       dm.setRdr_no(rdr_no);
       dm.setMedicd(medicd);
       dm.setTermsubsno(termsubsno);
       dm.setZip(zip);
       dm.setAddr(addr);
       dm.setDtlsaddr(dtlsaddr);
       dm.setRdrnm(rdrnm);
       dm.setRdrtel_no1(rdrtel_no1);
       dm.setRdrtel_no2(rdrtel_no2);
       dm.setRdrtel_no3(rdrtel_no3);
       dm.setIncmgpers(incmgpers);

       PSSupport1301EJBHome home = (PSSupport1301EJBHome) JNDIManager.getInstance().getHome("PSSupport1301EJB");
       try {

           PSSupport1301EJB ejb = home.create();

           ds = ejb.updateBranchMove(dm); // ������ dm������ EJB�� ȣ���Ѵ�.

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