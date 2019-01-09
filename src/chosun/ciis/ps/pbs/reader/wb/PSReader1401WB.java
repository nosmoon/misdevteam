/***************************************************************************************************
 * ���ϸ�   : PSReader1401WB.java
 * ��  ��   : ����-������ȸ �ڵ�� �ʱ�ȭ��
 * �ۼ����� : 2004-02-29
 * �ۼ���   : ���ȣ
 ****************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ��  ��   :
 ****************************************************************************************************/

package chosun.ciis.ps.pbs.reader.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.reader.ejb.*;
import chosun.ciis.ps.pbs.reader.ds.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.dao.*;

public class PSReader1401WB {

    /**
     * ��ȸȭ�鿡 ���Ǵ� �ڵ尪�� �����´�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_PUBL_RDRDataSet ds = null;

        //����� ��������
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //�α��λ����

        PS_S_PUBL_RDRDM dm = new PS_S_PUBL_RDRDM(); // DM ���� Setting�Ѵ�.

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);

        PSReader1401EJBHome home = (PSReader1401EJBHome) JNDIManager.getInstance().getHome("PSReader1401EJB");
        try {

            PSReader1401EJB ejb = home.create();
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
     * ������ȸ ����Ÿ�� ��ȸ�Ѵ�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectRdrList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_RDR_PUBL_SEARCHDataSet ds = null;

        //����� ��������
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //�α��λ����

        String aplcdtfr = Util.checkString(req.getParameter("aplcdtfr"));
        String aplcdtto = Util.checkString(req.getParameter("aplcdtto"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
        String asinbocd = Util.checkString(req.getParameter("asinbocd"));
        String prn1 = Util.checkString(req.getParameter("prn1"));
        String prn2 = Util.checkString(req.getParameter("prn2"));
        String tel_kubun = Util.checkString(req.getParameter("tel_kubun"));
        String rdrtel_no1 = Util.checkString(req.getParameter("rdrtel_no1"));
        String rdrtel_no2 = Util.checkString(req.getParameter("rdrtel_no2"));
        String rdrtel_no3 = Util.checkString(req.getParameter("rdrtel_no3"));
        String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
        String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
        String curr_page_no = req.getParameter("curr_page_no"); // ����������
        String records_per_page = req.getParameter("records_per_page"); // �������� Row��
        String flnm_yn = req.getParameter("flnm_yn") ;      // ���ڸ�/�����θ� �� ����
        String empnm_yn = req.getParameter("empnm_yn") ;     // ����/�������/���Ȯ�� ����
        String empnm = Util.Uni2Ksc(Util.checkString(req.getParameter("empnm")));      // ����/�������/���Ȯ���

        int iPageSize = Integer.parseInt(records_per_page); // �������� Row�� int�� ��ȯ
        int iPageNo = 1; // ���� ������ 1�� ����
        if (curr_page_no != null && !curr_page_no.equals("")) { // ������ ���� ������ �缳��
            iPageNo = Integer.parseInt(curr_page_no);
        }

        PS_L_RDR_PUBL_SEARCHDM dm = new PS_L_RDR_PUBL_SEARCHDM(); // DM ���� Setting�Ѵ�.

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setAplcdtfr(aplcdtfr);
        dm.setAplcdtto(aplcdtto);
        dm.setMedicd(medicd);
        dm.setRdr_no(rdr_no);
        dm.setRdrnm(rdrnm);
        dm.setAsinbocd(asinbocd);
        dm.setPrn1(prn1);
        dm.setPrn2(prn2);
        dm.setTel_kubun(tel_kubun);
        dm.setRdrtel_no1(rdrtel_no1);
        dm.setRdrtel_no2(rdrtel_no2);
        dm.setRdrtel_no3(rdrtel_no3);
        dm.setAddr(addr);
        dm.setEmail(email);
        dm.setPageno(iPageNo);
        dm.setPagesize(iPageSize);
        dm.setFlnm_yn(flnm_yn);
        dm.setEmpnm_yn(empnm_yn);
        dm.setEmpnm(empnm);

        PSReader1401EJBHome home = (PSReader1401EJBHome) JNDIManager.getInstance().getHome("PSReader1401EJB");
        try {

            PSReader1401EJB ejb = home.create();
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
     * �����ڰ��� �� ��ȸ
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectDetailInfo(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_READERINFODataSet ds = null;

        //����� ��������
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);         // �����

        //���������� Request�� ���� �Ķ����
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_rdr_no"))); //���ڹ�ȣ
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_medicd"))); //��ü��ȣ
        String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_termsubsno"))); //���ⱸ���ڹ�ȣ

        //DM ���� Setting�Ѵ�.
        PS_S_READERINFODM dm = new PS_S_READERINFODM();
        dm.setIncmgpers(incmgpers); // �����
        dm.setRdr_no(rdr_no); //���ڹ�ȣ
        dm.setMedicd(medicd); //��ü��ȣ
        dm.setTermsubsno(termsubsno); //���ⱸ���ڹ�ȣ

        PSReader1401EJBHome home = (PSReader1401EJBHome) JNDIManager.getInstance().getHome("PSReader1401EJB");

        try {
            PSReader1401EJB ejb = home.create();
            ds = ejb.selectDetailInfo(dm); //������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds); //request�� ������� ��´�.
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
/***************************************************************************************************
 * ������     :
 * �������ڵ� :
**************************************************************************************************/
