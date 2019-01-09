/***************************************************************************************************
* ���ϸ�   : PSReader1101WB.java
* ���     : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ� EJB ȣ���Ͽ� ���� ������� request������ ��ȯ�Ѵ�.
* �ۼ����� : 2004-02-25
* �ۼ���   : ����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������   :
* �������� :
* ���     :
***************************************************************************************************/

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


/**
 * ����-Ȯ�嵶�ڰ���
 */
public class PSReader1101WB{

    /**
     * Ȯ�嵶�ڰ��� �ʱ�,����ȸ,RESET�� ���� �⺻����Ÿ Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectRdr_ExtnINFO(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_S_RDR_EXTNDataSet ds = null;

        //Session���� ���� ����Ÿ
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //�����ID

        //���������� Request�� ���� �Ķ����
        String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));                                 //Ȯ������
        String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));                                 //Ȯ���ȣ

        //DM ���� Setting�Ѵ�.
        PS_S_RDR_EXTNDM dm = new PS_S_RDR_EXTNDM();
        dm.setCmpycd(cmpycd);                                                                                 //ȸ���ڵ�
        dm.setIncmgpers(incmgpers);                                                                           //�����ID
        dm.setRdr_extndt(rdr_extndt);                                                                         //Ȯ������
        dm.setRdr_extnno(rdr_extnno);                                                                         //Ȯ���ȣ

        PSReader1101EJBHome home = (PSReader1101EJBHome)JNDIManager.getInstance().getHome("PSReader1101EJB");

        try{
            PSReader1101EJB ejb = home.create();
            ds = ejb.selectRdr_ExtnINFO(dm);           //������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);                //request�� ������� ��´�.
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

    /**
     * Ȯ�嵶�ڰ��� �Է��� ���� �⺻����Ÿ Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void insertRdr_ExtnINFO(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_I_RDR_EXTNDataSet ds = null;

        //Session���� ���� ����Ÿ
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //�����ID

        //���������� Request�� ���� �Ķ����
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));                           //��ü�ڵ�
        String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));                           //��û����
        String qtystr = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));                              //�μ�
        if (qtystr.equals(""))   qtystr = "1";
        long   qty = Long.parseLong(qtystr);
        String rshpclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("rshpclsfcd")));                   //���豸���ڵ�
        String aplcpersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersnm")));                   //��û�ڸ�
        String aplcperstel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no1")));         //��û����ȭ��ȣ1
        String aplcperstel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no2")));         //��û����ȭ��ȣ2
        String aplcperstel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no3")));         //��û����ȭ��ȣ3
        String aplcpersptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersptph_no1")));       //��û���޴�����ȣ1
        String aplcpersptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersptph_no2")));       //��û���޴�����ȣ2
        String aplcpersptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersptph_no3")));       //��û���޴�����ȣ3
        String aplcpersoffinm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersoffinm")));           //��û�������
        String aplcpersposi = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersposi")));               //��û����å
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));                             //���ڸ�
        String rdrtel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no1")));                   //������ȭ��ȣ1
        String rdrtel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no2")));                   //������ȭ��ȣ2
        String rdrtel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no3")));                   //������ȭ��ȣ3
        String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));                 //�����޴�����ȣ1
        String rdrptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no2")));                 //�����޴�����ȣ2
        String rdrptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no3")));                 //�����޴�����ȣ3
        String rdrprn = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrprn")));                           //�����ֹι�ȣ
        String rdremail = Util.Uni2Ksc(Util.checkString(req.getParameter("rdremail")));                       //�����̸���
        String rdrmembseq = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrmembseq")));                   //����ȸ���Ϸù�ȣ
        String rdrposi = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrposi")));                         //������å
        String rdroffinm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdroffinm")));                     //���������
        String rdroffitel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdroffitel_no1")));           //����������ȭ��ȣ1
        String rdroffitel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdroffitel_no2")));           //����������ȭ��ȣ2
        String rdroffitel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdroffitel_no3")));           //����������ȭ��ȣ3
        String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));                           //����������ȣ
        String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));                         //������ּ�
        String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));                 //��������ּ�
        String acqclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("acqclsf")));                         //���뱸��
        String pymtflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtflnm")));                       //�����ڼ���
        String pymtoffinm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtoffinm")));                   //�����������
        String pymtposi = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtposi")));                       //��������å
        String pymttel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel_no1")));                 //��������ȭ��ȣ1
        String pymttel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel_no2")));                 //��������ȭ��ȣ2
        String pymttel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel_no3")));                 //��������ȭ��ȣ3
        String pymtptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtptph_no1")));               //�������޴�����ȣ1
        String pymtptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtptph_no2")));               //�������޴�����ȣ2
        String pymtptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtptph_no3")));               //�������޴�����ȣ3
        String pymtzip = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtzip")));                         //�����ڿ����ȣ
        String pymtaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtaddr")));                       //�������ּ�
        String pymtdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtdtlsaddr")));               //�����ڻ��ּ�
        String rcpmmthd = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpmmthd")));                       //�Աݹ��
        String asinbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("asinbocd")));                       //�������������ڵ�
        String asinresn = Util.Uni2Ksc(Util.checkString(req.getParameter("asinresn")));                       //��������
        String resiclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("resiclsfcd")));                   //�ְű����ڵ�
        String resitypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("resitypecd")));                   //�ְ������ڵ�
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));                               //���
        String rdr_extnclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnclsfcd")));                               //���

        //DM ���� Setting�Ѵ�.
        PS_I_RDR_EXTNDM dm = new PS_I_RDR_EXTNDM();
        dm.setCmpycd(cmpycd);                                                                                 //ȸ���ڵ�
        dm.setIncmgpers(incmgpers);                                                                           //�����ID
        dm.setMedicd(medicd);                                                                                 //��ü�ڵ�
        dm.setAplcdt(aplcdt);                                                                                 //��û����
        dm.setQty(qty);                                                                                       //�μ�
        dm.setRshpclsfcd(rshpclsfcd);                                                                         //���豸���ڵ�
        dm.setAplcpersnm(aplcpersnm);                                                                         //��û�ڸ�
        dm.setAplcperstel_no1(aplcperstel_no1);                                                               //��û����ȭ��ȣ1
        dm.setAplcperstel_no2(aplcperstel_no2);                                                               //��û����ȭ��ȣ2
        dm.setAplcperstel_no3(aplcperstel_no3);                                                               //��û����ȭ��ȣ3
        dm.setAplcpersptph_no1(aplcpersptph_no1);                                                             //��û���޴�����ȣ1
        dm.setAplcpersptph_no2(aplcpersptph_no2);                                                             //��û���޴�����ȣ2
        dm.setAplcpersptph_no3(aplcpersptph_no3);                                                             //��û���޴�����ȣ3
        dm.setAplcpersoffinm(aplcpersoffinm);                                                                 //��û�������
        dm.setAplcpersposi(aplcpersposi);                                                                     //��û����å
        dm.setRdrnm(rdrnm);                                                                                   //���ڸ�
        dm.setRdrtel_no1(rdrtel_no1);                                                                         //������ȭ��ȣ1
        dm.setRdrtel_no2(rdrtel_no2);                                                                         //������ȭ��ȣ2
        dm.setRdrtel_no3(rdrtel_no3);                                                                         //������ȭ��ȣ3
        dm.setRdrptph_no1(rdrptph_no1);                                                                       //�����޴�����ȣ1
        dm.setRdrptph_no2(rdrptph_no2);                                                                       //�����޴�����ȣ2
        dm.setRdrptph_no3(rdrptph_no3);                                                                       //�����޴�����ȣ3
        dm.setRdrprn(rdrprn);                                                                                 //�����ֹι�ȣ
        dm.setRdremail(rdremail);                                                                             //�����̸���
        dm.setRdrmembseq(rdrmembseq);                                                                         //����ȸ���Ϸù�ȣ
        dm.setRdrposi(rdrposi);                                                                               //������å
        dm.setRdroffinm(rdroffinm);                                                                           //���������
        dm.setRdroffitel_no1(rdroffitel_no1);                                                                 //����������ȭ��ȣ1
        dm.setRdroffitel_no2(rdroffitel_no2);                                                                 //����������ȭ��ȣ2
        dm.setRdroffitel_no3(rdroffitel_no3);                                                                 //����������ȭ��ȣ3
        dm.setDlvzip(dlvzip);                                                                                 //����������ȣ
        dm.setDlvaddr(dlvaddr);                                                                               //������ּ�
        dm.setDlvdtlsaddr(dlvdtlsaddr);                                                                       //��������ּ�
        dm.setAcqclsf(acqclsf);                                                                               //���뱸��
        dm.setPymtflnm(pymtflnm);                                                                             //�����ڼ���
        dm.setPymtoffinm(pymtoffinm);                                                                         //�����������
        dm.setPymtposi(pymtposi);                                                                             //��������å
        dm.setPymttel_no1(pymttel_no1);                                                                       //��������ȭ��ȣ1
        dm.setPymttel_no2(pymttel_no2);                                                                       //��������ȭ��ȣ2
        dm.setPymttel_no3(pymttel_no3);                                                                       //��������ȭ��ȣ3
        dm.setPymtptph_no1(pymtptph_no1);                                                                     //�������޴�����ȣ1
        dm.setPymtptph_no2(pymtptph_no2);                                                                     //�������޴�����ȣ2
        dm.setPymtptph_no3(pymtptph_no3);                                                                     //�������޴�����ȣ3
        dm.setPymtzip(pymtzip);                                                                               //�����ڿ����ȣ
        dm.setPymtaddr(pymtaddr);                                                                             //�������ּ�
        dm.setPymtdtlsaddr(pymtdtlsaddr);                                                                     //�����ڻ��ּ�
        dm.setRcpmmthd(rcpmmthd);                                                                             //�Աݹ��
        dm.setAsinbocd(asinbocd);                                                                             //�������������ڵ�
        dm.setAsinresn(asinresn);                                                                             //��������
        dm.setResiclsfcd(resiclsfcd);                                                                         //�ְű����ڵ�
        dm.setResitypecd(resitypecd);                                                                         //�ְ������ڵ�
        dm.setRemk(remk);                                                                                     //���
        dm.setRdr_extnclsfcd(rdr_extnclsfcd);

        PSReader1101EJBHome home = (PSReader1101EJBHome)JNDIManager.getInstance().getHome("PSReader1101EJB");

        try{
            PSReader1101EJB ejb = home.create();
            ds = ejb.insertRdr_ExtnINFO(dm);           //������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);                //request�� ������� ��´�.
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

    /**
     * Ȯ�嵶�ڰ��� ������ ���� �⺻����Ÿ Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void updateRdr_ExtnINFO(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_U_RDR_EXTNDataSet ds = null;

        //Session���� ���� ����Ÿ
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //�����ID

        //���������� Request�� ���� �Ķ����
        String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));                   //Ȯ������
        String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));                   //Ȯ���ȣ
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));                           //��ü�ڵ�
        String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));                           //��û����
        String qtystr = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));                              //�μ�
        if (qtystr.equals(""))   qtystr = "1";
        long   qty = Long.parseLong(qtystr);
        String rshpclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("rshpclsfcd")));                   //���豸���ڵ�
        String aplcpersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersnm")));                   //��û�ڸ�
        String aplcperstel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no1")));         //��û����ȭ��ȣ1
        String aplcperstel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no2")));         //��û����ȭ��ȣ2
        String aplcperstel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no3")));         //��û����ȭ��ȣ3
        String aplcpersptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersptph_no1")));       //��û���޴�����ȣ1
        String aplcpersptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersptph_no2")));       //��û���޴�����ȣ2
        String aplcpersptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersptph_no3")));       //��û���޴�����ȣ3
        String aplcpersoffinm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersoffinm")));           //��û�������
        String aplcpersposi = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersposi")));               //��û����å
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));                             //���ڸ�
        String rdrtel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no1")));                   //������ȭ��ȣ1
        String rdrtel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no2")));                   //������ȭ��ȣ2
        String rdrtel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no3")));                   //������ȭ��ȣ3
        String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));                 //�����޴�����ȣ1
        String rdrptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no2")));                 //�����޴�����ȣ2
        String rdrptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no3")));                 //�����޴�����ȣ3
        String rdrprn = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrprn")));                           //�����ֹι�ȣ
        String rdremail = Util.Uni2Ksc(Util.checkString(req.getParameter("rdremail")));                       //�����̸���
        String rdrmembseq = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrmembseq")));                   //����ȸ���Ϸù�ȣ
        String rdrposi = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrposi")));                         //������å
        String rdroffinm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdroffinm")));                     //���������
        String rdroffitel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdroffitel_no1")));           //����������ȭ��ȣ1
        String rdroffitel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdroffitel_no2")));           //����������ȭ��ȣ2
        String rdroffitel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdroffitel_no3")));           //����������ȭ��ȣ3
        String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));                           //����������ȣ
        String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));                         //������ּ�
        String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));                 //��������ּ�
        String acqclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("acqclsf")));                         //���뱸��
        String pymtflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtflnm")));                       //�����ڼ���
        String pymtoffinm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtoffinm")));                   //�����������
        String pymtposi = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtposi")));                       //��������å
        String pymttel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel_no1")));                 //��������ȭ��ȣ1
        String pymttel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel_no2")));                 //��������ȭ��ȣ2
        String pymttel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel_no3")));                 //��������ȭ��ȣ3
        String pymtptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtptph_no1")));               //�������޴�����ȣ1
        String pymtptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtptph_no2")));               //�������޴�����ȣ2
        String pymtptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtptph_no3")));               //�������޴�����ȣ3
        String pymtzip = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtzip")));                         //�����ڿ����ȣ
        String pymtaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtaddr")));                       //�������ּ�
        String pymtdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtdtlsaddr")));               //�����ڻ��ּ�
        String rcpmmthd = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpmmthd")));                       //�Աݹ��
        String asinbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("asinbocd")));                       //�������������ڵ�
        String asinresn = Util.Uni2Ksc(Util.checkString(req.getParameter("asinresn")));                       //��������
        String resiclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("resiclsfcd")));                   //�ְű����ڵ�
        String resitypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("resitypecd")));                   //�ְ������ڵ�
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));                               //���
        String rdr_extnclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnclsfcd")));                               //���

        //DM ���� Setting�Ѵ�.
        PS_U_RDR_EXTNDM dm = new PS_U_RDR_EXTNDM();
        dm.setCmpycd(cmpycd);                                                                                 //ȸ���ڵ�
        dm.setIncmgpers(incmgpers);                                                                           //�����ID
        dm.setRdr_extndt(rdr_extndt);                                                                         //Ȯ������
        dm.setRdr_extnno(rdr_extnno);                                                                         //Ȯ���ȣ
        dm.setMedicd(medicd);                                                                                 //��ü�ڵ�
        dm.setAplcdt(aplcdt);                                                                                 //��û����
        dm.setQty(qty);                                                                                       //�μ�
        dm.setRshpclsfcd(rshpclsfcd);                                                                         //���豸���ڵ�
        dm.setAplcpersnm(aplcpersnm);                                                                         //��û�ڸ�
        dm.setAplcperstel_no1(aplcperstel_no1);                                                               //��û����ȭ��ȣ1
        dm.setAplcperstel_no2(aplcperstel_no2);                                                               //��û����ȭ��ȣ2
        dm.setAplcperstel_no3(aplcperstel_no3);                                                               //��û����ȭ��ȣ3
        dm.setAplcpersptph_no1(aplcpersptph_no1);                                                             //��û���޴�����ȣ1
        dm.setAplcpersptph_no2(aplcpersptph_no2);                                                             //��û���޴�����ȣ2
        dm.setAplcpersptph_no3(aplcpersptph_no3);                                                             //��û���޴�����ȣ3
        dm.setAplcpersoffinm(aplcpersoffinm);                                                                 //��û�������
        dm.setAplcpersposi(aplcpersposi);                                                                     //��û����å
        dm.setRdrnm(rdrnm);                                                                                   //���ڸ�
        dm.setRdrtel_no1(rdrtel_no1);                                                                         //������ȭ��ȣ1
        dm.setRdrtel_no2(rdrtel_no2);                                                                         //������ȭ��ȣ2
        dm.setRdrtel_no3(rdrtel_no3);                                                                         //������ȭ��ȣ3
        dm.setRdrptph_no1(rdrptph_no1);                                                                       //�����޴�����ȣ1
        dm.setRdrptph_no2(rdrptph_no2);                                                                       //�����޴�����ȣ2
        dm.setRdrptph_no3(rdrptph_no3);                                                                       //�����޴�����ȣ3
        dm.setRdrprn(rdrprn);                                                                                 //�����ֹι�ȣ
        dm.setRdremail(rdremail);                                                                             //�����̸���
        dm.setRdrmembseq(rdrmembseq);                                                                         //����ȸ���Ϸù�ȣ
        dm.setRdrposi(rdrposi);                                                                               //������å
        dm.setRdroffinm(rdroffinm);                                                                           //���������
        dm.setRdroffitel_no1(rdroffitel_no1);                                                                 //����������ȭ��ȣ1
        dm.setRdroffitel_no2(rdroffitel_no2);                                                                 //����������ȭ��ȣ2
        dm.setRdroffitel_no3(rdroffitel_no3);                                                                 //����������ȭ��ȣ3
        dm.setDlvzip(dlvzip);                                                                                 //����������ȣ
        dm.setDlvaddr(dlvaddr);                                                                               //������ּ�
        dm.setDlvdtlsaddr(dlvdtlsaddr);                                                                       //��������ּ�
        dm.setAcqclsf(acqclsf);                                                                               //���뱸��
        dm.setPymtflnm(pymtflnm);                                                                             //�����ڼ���
        dm.setPymtoffinm(pymtoffinm);                                                                         //�����������
        dm.setPymtposi(pymtposi);                                                                             //��������å
        dm.setPymttel_no1(pymttel_no1);                                                                       //��������ȭ��ȣ1
        dm.setPymttel_no2(pymttel_no2);                                                                       //��������ȭ��ȣ2
        dm.setPymttel_no3(pymttel_no3);                                                                       //��������ȭ��ȣ3
        dm.setPymtptph_no1(pymtptph_no1);                                                                     //�������޴�����ȣ1
        dm.setPymtptph_no2(pymtptph_no2);                                                                     //�������޴�����ȣ2
        dm.setPymtptph_no3(pymtptph_no3);                                                                     //�������޴�����ȣ3
        dm.setPymtzip(pymtzip);                                                                               //�����ڿ����ȣ
        dm.setPymtaddr(pymtaddr);                                                                             //�������ּ�
        dm.setPymtdtlsaddr(pymtdtlsaddr);                                                                     //�����ڻ��ּ�
        dm.setRcpmmthd(rcpmmthd);                                                                             //�Աݹ��
        dm.setAsinbocd(asinbocd);                                                                             //�������������ڵ�
        dm.setAsinresn(asinresn);                                                                             //��������
        dm.setResiclsfcd(resiclsfcd);                                                                         //�ְű����ڵ�
        dm.setResitypecd(resitypecd);                                                                         //�ְ������ڵ�
        dm.setRemk(remk);                                                                                     //���
        dm.setRdr_extnclsfcd(rdr_extnclsfcd);                                                                 //Ȯ�屸��

        PSReader1101EJBHome home = (PSReader1101EJBHome)JNDIManager.getInstance().getHome("PSReader1101EJB");

        try{
            PSReader1101EJB ejb = home.create();
            ds = ejb.updateRdr_ExtnINFO(dm);           //������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);                //request�� ������� ��´�.
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

    /**
     * Ȯ�嵶�ڰ��� ������ ���� �⺻����Ÿ Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void deleteRdr_ExtnINFO(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_D_RDR_EXTNDataSet ds = null;

        //Session���� ���� ����Ÿ
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //�����ID

        //���������� Request�� ���� �Ķ����
        String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));                   //Ȯ������
        String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));                   //Ȯ���ȣ

        //DM ���� Setting�Ѵ�.
        PS_D_RDR_EXTNDM dm = new PS_D_RDR_EXTNDM();
        dm.setCmpycd(cmpycd);                                                                                 //ȸ���ڵ�
        dm.setIncmgpers(incmgpers);                                                                           //�����ID
        dm.setRdr_extndt(rdr_extndt);                                                                         //Ȯ������
        dm.setRdr_extnno(rdr_extnno);                                                                         //Ȯ���ȣ

        PSReader1101EJBHome home = (PSReader1101EJBHome)JNDIManager.getInstance().getHome("PSReader1101EJB");

        try{
            PSReader1101EJB ejb = home.create();
            ds = ejb.deleteRdr_ExtnINFO(dm);           //������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);                //request�� ������� ��´�.
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
