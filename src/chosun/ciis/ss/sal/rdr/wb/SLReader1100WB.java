/**************************************************************************************************
* ���ϸ�    : SLReader1000WB.java
* ���      : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
*             EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
* �ۼ�����  : 2003-11-20
* �ۼ���    : �迵��
**************************************************************************************************/
/**************************************************************************************************
* ��������  :
* ������    :
* ��������  :
* ���      :
**************************************************************************************************/
package chosun.ciis.ss.sal.rdr.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.util.*;

import chosun.ciis.ss.sal.rdr.ds.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.dao.*;

import chosun.ciis.ss.sal.common.ds.*;
import chosun.ciis.ss.sal.common.dm.*;

/**
 * ����-������������
 */
public class SLReader1100WB{

    /**
     * ������������(�������� �ʱ�ȭ)
     * ������������ ȭ�鿡 ���Ǵ� �ڵ尪�� �����´�. (�������� �� �������� �ʱ�ȭ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_E_READERINIDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String sBocd = Util.getSessionParameterValue(req, "bocd", true);		//���������ڵ�
        SL_E_READERINIDM dm = new SL_E_READERINIDM();

        dm.setBocd(sBocd); // ���������ڵ�
        
        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectCodeList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_E_READERINIDataSet ds = null;
            ds = ejb.selectCodeList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������������(����(�����߰�))
     * �����߰�( Ȯ������, ���ڽŻ�����, �Ź������������, ���˹����� ���� )
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void insertReader(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_I_READERDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd 			= Util.getSessionParameterValue(req, "bocd", true);		                //���������ڵ�
        String incmgpers 		= Util.getSessionParameterValue(req, "uid", true);                      //�Է��ھ��̵�
        String paty_clsfcd 		= Util.checkString(req.getParameter("paty_clsfcd"));                    //��ü�����ڵ�(��������)
        String rdrnm 			= Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));            //���ڸ�(��������)
        String prn 				= Util.checkString(req.getParameter("prn"));                            //�ֹε�Ϲ�ȣ(��������)
        String ernno 			= Util.checkString(req.getParameter("ernno"));                          //����ڵ�Ϲ�ȣ(��������)
        String email 			= Util.Uni2Ksc(Util.checkString(req.getParameter("email")));            //�̸���(��������)
        String weddanvydt 		= Util.checkString(req.getParameter("weddanvydt"));                     //��ȥ�����(��������)
        String bidt 			= Util.checkString(req.getParameter("bidt"));                           //�������(��������)
        String lusoclsfcd 		= Util.checkString(req.getParameter("lusoclsfcd"));                     //���¾�±���(��������)
        String remk 			= Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));             //���(��������)
        String aplcpathcd 		= "20";                                                                 //��û����ڵ�(Ȯ������)
        String rdr_extntypecd 	= Util.checkString(req.getParameter("rdr_extntypecd"));                 //Ȯ�������ڵ�(Ȯ������)
        String extnblngcd 		= Util.checkString(req.getParameter("extnblngcd"));                     //Ȯ���ڼҼ��ڵ�(Ȯ������)
        String empclsfcd 		= Util.checkString(req.getParameter("empclsfcd"));                      //��������ڵ�(Ȯ������)
        String empdeptcd 		= Util.checkString(req.getParameter("empdeptcd"));                      //����μ��ڵ�(Ȯ������)
        String empdeptnm 		= Util.Uni2Ksc(Util.checkString(req.getParameter("empdeptnm")));        //����μ���(Ȯ������)
        String empseq 			= Util.checkString(req.getParameter("empseq"));                         //�����ȣ(Ȯ������)
        String bodutycd 		= Util.checkString(req.getParameter("bodutycd"));                       //������å�ڵ�(Ȯ������)
        String boposicd 		= Util.checkString(req.getParameter("boposicd"));                       //���������ڵ�(Ȯ������)
        String stafclsfcd 		= Util.checkString(req.getParameter("stafclsfcd"));                     //��������ڵ�(Ȯ������)
        String stafno 			= Util.checkString(req.getParameter("stafno"));                         //�����ȣ(Ȯ������)
        String boemp_no 		= Util.checkString(req.getParameter("boemp_no"));                       //������������ȣ(Ȯ������)
        String extnid 			= Util.checkString(req.getParameter("extnid"));                         //Ȯ���ھ��̵�(Ȯ������)(���ڿ��Ȩ������ ���̵�)
        String extnflnm 		= Util.Uni2Ksc(Util.checkString(req.getParameter("extnflnm")));         //Ȯ���� ����(Ȯ������)
        String extntel1 		= Util.checkString(req.getParameter("extntel1"));                       //Ȯ������ȭ��ȣ DDD(Ȯ������)
        String extntel2 		= Util.checkString(req.getParameter("extntel2"));                       //Ȯ������ȭ��ȣ ��(Ȯ������)
        String extntel3 		= Util.checkString(req.getParameter("extntel3"));                       //Ȯ������ȭ��ȣ ��ȣ(Ȯ������)
        String extnptph_no1 	= Util.checkString(req.getParameter("extnptph_no1"));                   //Ȯ�����޴�����ȣ ������ȣ(Ȯ������)
        String extnptph_no2 	= Util.checkString(req.getParameter("extnptph_no2"));                   //Ȯ�����޴�����ȣ ��(Ȯ������)
        String extnptph_no3 	= Util.checkString(req.getParameter("extnptph_no3"));                   //Ȯ�����޴�����ȣ ��ȣ(Ȯ������)
        String extnprn 			= Util.checkString(req.getParameter("extnprn"));                        //Ȯ���� �ֹε�Ϲ�ȣ(Ȯ������)
        String deptcd 			= Util.checkString(req.getParameter("deptcd"));                         //(!����)(�ش�������)�μ��ڵ�(Ȯ������) - ���� �������� ������, SP_CO_I_RDR_EXTN ���� �ش����������ڵ忡 ���� ��ȸ��
        String areacd 			= Util.checkString(req.getParameter("areacd"));                         //(!����)(�ش�������)�����ڵ�(Ȯ������) - ���� �������� ������, SP_CO_I_RDR_EXTN ���� �ش����������ڵ忡 ���� ��ȸ��
        String bns_itemcd 		= Util.checkString(req.getParameter("bns_itemcd"));                     //���˹��ڵ�(���˹���������)
        String subsuprc 		= Util.checkString(req.getParameter("subsuprc"));                       //�����ܰ�(�Ź���������)
        String medicd 			= Util.checkString(req.getParameter("medicd"));                         //��ü�ڵ�(�Ź���������+Ȯ������)
        String resitypecd 		= Util.checkString(req.getParameter("resitypecd"));                     //�ְ������ڵ�(�Ź���������+Ȯ������)
        String resiclsfcd 		= Util.checkString(req.getParameter("resiclsfcd"));                     //�ְű����ڵ�(�Ź���������+Ȯ������)
        String rdrtel_no1 		= Util.checkString(req.getParameter("rdrtel_no1"));                     //��ȭ��ȣ ����(�Ź���������+Ȯ������)
        String rdrtel_no2 		= Util.checkString(req.getParameter("rdrtel_no2"));                     //��ȭ��ȣ ��(�Ź���������+Ȯ������)
        String rdrtel_no3 		= Util.checkString(req.getParameter("rdrtel_no3"));                     //��ȭ��ȣ ��ȣ(�Ź���������+Ȯ������)
        String rdrptph_no1 		= Util.checkString(req.getParameter("rdrptph_no1"));                    //�޴��� ������ȣ(�Ź���������+Ȯ������)
        String rdrptph_no2 		= Util.checkString(req.getParameter("rdrptph_no2"));                    //�޴��� ��(�Ź���������+Ȯ������)
        String rdrptph_no3 		= Util.checkString(req.getParameter("rdrptph_no3"));                    //�޴��� ��ȣ(�Ź���������+Ȯ������)
        String dlvzip 			= Util.checkString(req.getParameter("dlvzip"));                         //����������ȣ(�Ź���������+Ȯ������)
        String dlvcd 			= Util.checkString(req.getParameter("dlvcd"));                          //������ڵ�(�ּ��ڵ�)(�Ź���������+Ȯ������)
        String dlvpyong 		= Util.checkString(req.getParameter("dlvpyong"));                       //��������(�Ź���������)
        String dlvaddr 			= Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));          //������ּ�(�Ź���������+Ȯ������)
        String dlvdtlsaddr 		= Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));      //��������ּ�(�Ź���������+Ȯ������)
        String dlvbnji 			= Util.Uni2Ksc(Util.checkString(req.getParameter("dlvbnji")));          //����� ��ȣ(�Ź���������)
        String dlvser_no 		= Util.Uni2Ksc(Util.checkString(req.getParameter("dlvser_no")));        //����� ȣ��(�Ź���������)
        String dlvdong 			= Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdong")));          //����� ��(�Ź���������)
        String dlvteamcd 		= Util.checkString(req.getParameter("dlvteamcd"));                      //����� ���ڵ�(�Ź���������)
        String dlvdstccd 		= Util.checkString(req.getParameter("dlvdstccd"));                      //����� �ּ��ڵ�(�Ź���������)
        String dlvno 			= Util.checkString(req.getParameter("dlvno"));                          //��޹�ȣ(�Ź���������)
        String dlvintvno 		= Util.checkString(req.getParameter("dlvintvno"));                      //��޻��̹�ȣ(�Ź���������)
        String dlvmthdcd 		= Util.checkString(req.getParameter("dlvmthdcd"));                      //��޹���ڵ�(�Ź���������)
        String thrw_plac 		= Util.Uni2Ksc(Util.checkString(req.getParameter("thrw_plac")));        //�������(�Ź���������)
        String dlvqty 			= Util.checkString(req.getParameter("dlvqty"));                         //��޺μ�(�Ź���������)
        String valqty 			= Util.checkString(req.getParameter("valqty"));                         //����μ�(�Ź���������+Ȯ������)
        String no_valqty 		= Util.checkString(req.getParameter("no_valqty"));                      //����μ�(�Ź���������+Ȯ������)
        String pre_valqty 		= Util.checkString(req.getParameter("pre_valqty"));                     //�������μ�(�Ź���������)
        String subsamt 			= Util.checkString(req.getParameter("subsamt"));                        //�����ݾ�(�Ź���������)
        String dscnamt 			= Util.checkString(req.getParameter("dscnamt"));                        //���ϱݾ�(�Ź���������)
        String post_dlvfee      = Util.checkString(req.getParameter("post_dlvfee"));                    //��۷�(�Ź���������)
        String rptvfreeclsf 	= Util.Uni2Ksc(Util.checkString(req.getParameter("rptvfreeclsf")));     //��ǥ���ᱸ���ڵ�(�Ź���������)
        String rptvsubsdt 		= Util.checkString(req.getParameter("rptvsubsdt"));                     //��ǥ��������(�Ź���������)
        String rptvrdr_extndt 	= Util.Uni2Ksc(Util.checkString(req.getParameter("rptvrdr_extndt")));   //��ǥȮ������(�Ź���������)
        String rptvrdr_extntype = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extntypecd")));   //(!����)��ǥȮ�������ڵ�(�Ź���������)(Ȯ�������ڵ�-hidden)
        String rptvextn 		= Util.Uni2Ksc(Util.checkString(req.getParameter("extnflnm")));         //(!����)��ǥȮ����(�Ź���������)(Ȯ���ڸ�-Ȯ���� �˻��� ���� ���õ� Ȯ���� ����)
        String totrdr_extncost 	= Util.checkString(req.getParameter("totrdr_extncost"));                //�� Ȯ����(�Ź���������)
        String clamtclsfcd 		= Util.checkString(req.getParameter("clamtclsfcd"));                    //���ݱ����ڵ�(�Ź���������)
        String rptvvalmm 		= Util.checkString(req.getParameter("rptvvalmm"));                      //��ǥ������(�Ź���������)
        String rptvrdr_movmdt 	= Util.checkString(req.getParameter("rptvrdr_movmdt"));                 //��ǥ��������(�Ź���������)
        String clamtmthdcd 		= Util.checkString(req.getParameter("clamtmthdcd"));                    //���ݹ���ڵ�(�Ź���������)
        String clamtcyclcd 		= Util.checkString(req.getParameter("clamtcyclcd"));                    //�����ֱ��ڵ�(�б��)(�Ź���������)
        String etc1 			= Util.Uni2Ksc(Util.checkString(req.getParameter("etc1")));             //��Ÿ1 ( Ȯ�强�� ���� ���� ����)
        String etc2 			= Util.Uni2Ksc(Util.checkString(req.getParameter("etc2")));             //��Ÿ2 ( Ȯ�强�� ���� ���� ����)
        String etc3 			= Util.Uni2Ksc(Util.checkString(req.getParameter("etc3")));             //��Ÿ3 ( Ȯ�强�� ���� ���� ����)
        String etc4 			= Util.Uni2Ksc(Util.checkString(req.getParameter("etc4")));             //��Ÿ4 ( Ȯ�强�� ���� ���� ����)
        String etc5 			= Util.Uni2Ksc(Util.checkString(req.getParameter("etc5")));             //��Ÿ5 ( Ȯ�强�� ���� ���� ����)
        String etc6 			= Util.Uni2Ksc(Util.checkString(req.getParameter("etc6")));             //��Ÿ6 ( Ȯ�强�� ���� ���� ����)


        // filtering
        // long type  "" --> "0"
        dlvpyong   = ("".equals(dlvpyong))? "0"   : dlvpyong;
        subsuprc   = ("".equals(subsuprc))? "0"   : subsuprc;
        dlvqty     = ("".equals(dlvqty))? "0"     : dlvqty;
        valqty     = ("".equals(valqty))? "0"     : valqty;
        no_valqty  = ("".equals(no_valqty))? "0"  : no_valqty;
        pre_valqty = ("".equals(pre_valqty))? "0" : pre_valqty;
        subsamt    = ("".equals(subsamt))? "0"    : subsamt;
        dscnamt    = ("".equals(dscnamt))? "0"    : dscnamt;
        post_dlvfee    = ("".equals(post_dlvfee))? "0"    : post_dlvfee;
        totrdr_extncost = ("".equals(totrdr_extncost))? "0" : totrdr_extncost;

        // ��޺μ��� ���Ѵ�. ��޺μ� = ����μ� + ����μ� + ������μ�
        dlvqty = "" + ( Long.parseLong(valqty) + Long.parseLong(no_valqty) + Long.parseLong(pre_valqty));

        SL_I_READERDM dm = new SL_I_READERDM();
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setPaty_clsfcd(paty_clsfcd);
        dm.setRdrnm(rdrnm);
        dm.setPrn(prn);
        dm.setErnno(ernno);
        dm.setEmail(email);
        dm.setWeddanvydt(weddanvydt);
        dm.setBidt(bidt);
        dm.setLusoclsfcd(lusoclsfcd);
        dm.setRemk(remk);
        dm.setAplcpathcd(aplcpathcd);
        dm.setRdr_extntypecd(rdr_extntypecd);
        dm.setExtnblngcd(extnblngcd);
        dm.setEmpclsfcd(empclsfcd);
        dm.setEmpdeptcd(empdeptcd);
        dm.setEmpdeptnm(empdeptnm);
        dm.setEmpseq(empseq);
        dm.setBodutycd(bodutycd);
        dm.setBoposicd(boposicd);
        dm.setStafclsfcd(stafclsfcd);
        dm.setStafno(stafno);
        dm.setBoemp_no(boemp_no);
        dm.setExtnid(extnid);
        dm.setExtnflnm(extnflnm);
        dm.setExtntel1(extntel1);
        dm.setExtntel2(extntel2);
        dm.setExtntel3(extntel3);
        dm.setExtnptph_no1(extnptph_no1);
        dm.setExtnptph_no2(extnptph_no2);
        dm.setExtnptph_no3(extnptph_no3);
        dm.setExtnprn(extnprn);
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBns_itemcd(bns_itemcd);
        dm.setSubsuprc(Long.parseLong(subsuprc));
        dm.setMedicd(medicd);
        dm.setResitypecd(resitypecd);
        dm.setResiclsfcd(resiclsfcd);
        dm.setRdrtel_no1(rdrtel_no1);
        dm.setRdrtel_no2(rdrtel_no2);
        dm.setRdrtel_no3(rdrtel_no3);
        dm.setRdrptph_no1(rdrptph_no1);
        dm.setRdrptph_no2(rdrptph_no2);
        dm.setRdrptph_no3(rdrptph_no3);
        dm.setDlvzip(dlvzip);
        dm.setDlvcd(dlvcd);
        dm.setDlvpyong(Long.parseLong(dlvpyong));
        dm.setDlvaddr(dlvaddr);
        dm.setDlvdtlsaddr(dlvdtlsaddr);
        dm.setDlvbnji(dlvbnji);
        dm.setDlvser_no(dlvser_no);
        dm.setDlvdong(dlvdong);
        dm.setDlvteamcd(dlvteamcd);
        dm.setDlvdstccd(dlvdstccd);
        dm.setDlvno(dlvno);
        dm.setDlvintvno(dlvintvno);
        dm.setDlvmthdcd(dlvmthdcd);
        dm.setThrw_plac(thrw_plac);
        dm.setDlvqty(Long.parseLong(dlvqty));
        dm.setValqty(Long.parseLong(valqty));
        dm.setNo_valqty(Long.parseLong(no_valqty));
        dm.setPre_valqty(Long.parseLong(pre_valqty));
        dm.setSubsamt(Long.parseLong(subsamt));
        dm.setDscnamt(Long.parseLong(dscnamt));
        dm.setPost_dlvfee(Long.parseLong(post_dlvfee));
        dm.setRptvfreeclsf(rptvfreeclsf);
        dm.setRptvsubsdt(rptvsubsdt);
        dm.setRptvrdr_extndt(rptvrdr_extndt);
        dm.setRptvrdr_extntype(rptvrdr_extntype);
        dm.setRptvextn(rptvextn);
        dm.setTotrdr_extncost(Long.parseLong(totrdr_extncost));
        dm.setClamtclsfcd(clamtclsfcd);
        dm.setRptvvalmm(rptvvalmm);
        dm.setRptvrdr_movmdt(rptvrdr_movmdt);
        dm.setClamtmthdcd(clamtmthdcd);
        dm.setClamtcyclcd(clamtcyclcd);
        dm.setEtc1(etc1);
        dm.setEtc2(etc2);
        dm.setEtc3(etc3);
        dm.setEtc4(etc4);
        dm.setEtc5(etc5);
        dm.setEtc6(etc6);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.insertReader(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        boolean bResult = false; // DML ���� ���� ����
        String sResult = "";
        try{
            SLReader1100EJB ejb = home.create();
            SL_I_READERDataSet ds = null;
            ds = ejb.insertReader(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������������(���ڸ�ϰ˻�)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectReaderList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_READERDataSet ds = null;
        //requesting parameters
        String bocd = Util.getSessionParameterValue(req, "bocd", true);							//���������ڵ�
        String search_order = Util.checkString(req.getParameter("search_order"));				//�˻���������
        String search_ad = Util.checkString(req.getParameter("search_ad"));						//�˻� asc, desc
        String search_cond = Util.checkString(req.getParameter("search_cond"));					//�˻� ���ǰ˻�����('ALL':���հ˻�, 'DSTC':�����ڵ�, 'DSNO':����+���, 'NO':���ڹ�ȣ, 'NM':���ڸ�, 'ADDR':���ּ�, 'ADDRS':�ּ���ü, 'TEL':��ȭ��ȣ, 'EMAIL':�̸���, 'PRVNO':��(��)���ڹ�ȣ '':��ü)
        String search_pttn = Util.checkString(req.getParameter("search_pttn"));					//����(��ü)�˻��� �˻����� ����('1':����, '2':����+���, '3':���ڹ�ȣ, '4':���ڸ�, '5':�ּ�, '6':��ȭ��ȣ)
        String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));	//�˻���
        String search_stop = Util.checkString(req.getParameter("search_stop"));					//�˻��� �������� ���� ����
        String pageno = Util.checkString(req.getParameter("pageno"));							//��������ȣ
        String pagesize = Util.checkString(req.getParameter("pagesize"));						//���������� ���ڵ��(������������)

        //setting dm
        SL_L_READERDM dm = new SL_L_READERDM();
        dm.setBocd(bocd);
        dm.setSearch_order(search_order);
        dm.setSearch_ad(search_ad);
        dm.setSearch_cond(search_cond);
        dm.setSearch_pttn(search_pttn);
        dm.setSearch_word(search_word);
        dm.setSearch_stop(search_stop);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectReaderList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_READERDataSet ds = null;
            ds = ejb.selectReaderList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������������(���ڻ󼼺���)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectReaderDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_S_RDR_INFODataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);				//���������ڵ�
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));			//���ڹ�ȣ
        String medicd = Util.checkString(req.getParameter("medicd"));			//��ü�ڵ�
        String basiyymm = Util.checkString(req.getParameter("basiyymm"));		//���ݳ����� �˻����س��

        SL_S_RDR_INFODM dm = new SL_S_RDR_INFODM();
        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setBasiyymm(basiyymm);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectReaderDetail(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_S_RDR_INFODataSet ds = null;
            ds = ejb.selectReaderDetail(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������������(������������)
     * @param req HttpServletRequest
     * @param res HttpServletRequest
     * @throws AppException
     *
     */
    public void updateReaderInfo(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_U_READERINFODataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);					        //���������ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);		                //�Է���(������)
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));				//���ڹ�ȣ
        String dlvdstccd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdstccd")));		//��ޱ����ڵ�(�����ڵ�)
        String dlvno = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvno")));				//��޹�ȣ
        String dlvintvno = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvintvno")));		//���̹�ȣ
        String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));				//����������ȣ
        String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));			//������ּ�
        String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));	//��������ּ�
        String dlvbnji = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvbnji")));			//���������
        String dlvcd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvcd")));				//������ڵ�(�ּ��ڵ�)
        String dlvdong = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdong")));			//�������
        String dlvser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvser_no")));		//�����ȣ
        String dlvpyong = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvpyong")));			//��
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));				//���ڹ�ȣ
        String paty_clsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("paty_clsfcd")));	//��ü�����ڵ�
        String rdrtel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no1")));		//���� ��ȭ��ȣ1(����)
        String rdrtel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no2")));		//���� ��ȭ��ȣ2(��)
        String rdrtel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no3")));		//���� ��ȭ��ȣ3(��ȣ)
        String resitypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("resitypecd")));		//�ְ������ڵ�(����, ����, ����Ʈ..)
        String resiclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("resiclsfcd")));		//�ְű����ڵ�(����,�ϼ� ..)
        String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));	//���� �޴�����ȣ1(����� ��ȣ)
        String rdrptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no2")));	//���� �޴�����ȣ2(��)
        String rdrptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no3")));   //���� �޴�����ȣ3(��ȣ)
        String dlvmthdcd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvmthdcd")));		//��޹���ڵ�
        String thrw_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("thrw_plac")));		//��������ڵ�
        String bidt = Util.Uni2Ksc(Util.checkString(req.getParameter("bidt")));					//�������
        String lusoclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("lusoclsfcd")));		//�ּұ����ڵ�
        String weddanvydt = Util.Uni2Ksc(Util.checkString(req.getParameter("weddanvydt")));		//��ȥ�����
        String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));				//�̸���
        String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));					//�ֹε�Ϲ�ȣ
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));					//���

        String medicd      = Util.checkString(req.getParameter("medicd"));                      //��ü�ڵ�
        String clamtmthdcd = Util.checkString(req.getParameter("clamtmthdcd"));                 //���ݹ��
        String clamtcyclcd = Util.checkString(req.getParameter("clamtcyclcd"));                 //�����ֱ�(�б��)

        dlvpyong = ("".equals(dlvpyong))? "0": dlvpyong;

        SL_U_READERINFODM dm = new SL_U_READERINFODM();
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setRdr_no(rdr_no);
        dm.setDlvdstccd(dlvdstccd);
        dm.setDlvno(dlvno);
        dm.setDlvintvno(dlvintvno);
        dm.setDlvzip(dlvzip);
        dm.setDlvaddr(dlvaddr);
        dm.setDlvdtlsaddr(dlvdtlsaddr);
        dm.setDlvbnji(dlvbnji);
        dm.setDlvcd(dlvcd);
        dm.setDlvdong(dlvdong);
        dm.setDlvser_no(dlvser_no);
        dm.setDlvpyong(Long.parseLong(dlvpyong));
        dm.setRdrnm(rdrnm);
        dm.setPaty_clsfcd(paty_clsfcd);
        dm.setRdrtel_no1(rdrtel_no1);
        dm.setRdrtel_no2(rdrtel_no2);
        dm.setRdrtel_no3(rdrtel_no3);
        dm.setResitypecd(resitypecd);
        dm.setResiclsfcd(resiclsfcd);
        dm.setRdrptph_no1(rdrptph_no1);
        dm.setRdrptph_no2(rdrptph_no2);
        dm.setRdrptph_no3(rdrptph_no3);
        dm.setDlvmthdcd(dlvmthdcd);
        dm.setThrw_plac(thrw_plac);
        dm.setBidt(bidt);
        dm.setLusoclsfcd(lusoclsfcd);
        dm.setWeddanvydt(weddanvydt);
        dm.setEmail(email);
        dm.setPrn(prn);
        dm.setRemk(remk);
        dm.setMedicd(medicd);
        dm.setClamtmthdcd(clamtmthdcd);
        dm.setClamtcyclcd(clamtcyclcd);
        
        boolean bResult = false; // DML ���� ���� ����
        String sResult = "";
        
        SLReader1100DAO dao = new SLReader1100DAO();
        bResult = dao.updateReaderInfo(dm);
        if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";
        }
        req.setAttribute("result", sResult); // request�� ������� ��´�.
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        boolean bResult = false; // DML ���� ���� ����
        String sResult = "";
        try{
            SLReader1100EJB ejb = home.create();
            SL_U_READERINFODataSet ds = null;
            bResult = ejb.updateReaderInfo(dm); // ������ dm������ EJB�� ȣ��
            if(bResult == true){ // ���������� �Էµ� ���
                sResult = "true";
            }
            req.setAttribute("result", sResult); // request�� ������� ��´�.
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
     * ������������(���������˾�-�������������ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectSubsHistoryList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_NWSPSUBSCNTRPTCRDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));			//���ڹ�ȣ
        String frdt = Util.checkString(req.getParameter("frdt"));				//�˻� ������
        String todt = Util.checkString(req.getParameter("todt"));				//�˻� ������
        String medicd = Util.checkString(req.getParameter("medicd"));			//��ü�ڵ�(��)  ('##' ���� ����� ���� ��ü�ڵ� �� �� ����)
        String pageno = Util.checkString(req.getParameter("pageno"));			//��������ȣ
        String pagesize = Util.checkString(req.getParameter("pagesize"));		//������������

        // filtering
        // long type  "" --> "0"
        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "9" : pagesize;

        SL_L_NWSPSUBSCNTRPTCRDM dm = new SL_L_NWSPSUBSCNTRPTCRDM();
        dm.setRdr_no(rdr_no);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setMedicd(medicd);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectSubsHistoryList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_NWSPSUBSCNTRPTCRDataSet ds = null;
            ds = ejb.selectSubsHistoryList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������������(���������˾�-�޵����������ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectStopsHistoryList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_VSPTCRDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));			//���ڹ�ȣ
        String frdt = Util.checkString(req.getParameter("frdt"));				//�˻� ������
        String todt = Util.checkString(req.getParameter("todt"));               //�˻� ������
        String medicd = Util.checkString(req.getParameter("medicd"));           //��ü�ڵ�(��)  ('##' ���� ����� ���� ��ü�ڵ� �� �� ����)
        String pageno = Util.checkString(req.getParameter("pageno"));           //��������ȣ
        String pagesize = Util.checkString(req.getParameter("pagesize"));       //������������

        // filtering
        // long type  "" --> "0"
        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "9" : pagesize;

        SL_L_VSPTCRDM dm = new SL_L_VSPTCRDM();
        dm.setRdr_no(rdr_no);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setMedicd(medicd);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectStopsHistoryList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_VSPTCRDataSet ds = null;
            ds = ejb.selectStopsHistoryList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������������(���������˾�-�̻系�������ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectMoveHistoryList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_MOVM_RDRPTCRDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));		//���ڹ�ȣ
        String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));         //�˻� ������
        String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));         //�˻� ������
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));     //��ü�ڵ�(��)  ('##' ���� ����� ���� ��ü�ڵ� �� �� ����)
        String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));     //��������ȣ
        String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize"))); //������������


        // filtering
        // long type  "" --> "0"
        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "9" : pagesize;

        SL_L_MOVM_RDRPTCRDM dm = new SL_L_MOVM_RDRPTCRDM();

        dm.setRdr_no(rdr_no);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setMedicd(medicd);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectMoveHistoryList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_MOVM_RDRPTCRDataSet ds = null;
            ds = ejb.selectMoveHistoryList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������������-�����߰������˾�(�ʱ�ȭ��)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void initSubsCntr(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_NWSPSUBSCNTR_INITDataSet ds = null;
        // ���������ڵ� session �� ����
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		//���������ڵ�

        SL_L_NWSPSUBSCNTR_INITDM dm = new SL_L_NWSPSUBSCNTR_INITDM();

        dm.setBocd(bocd);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.initSubsCntr(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_NWSPSUBSCNTR_INITDataSet ds = null;
            ds = ejb.initSubsCntr(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������������-�����߰������˾�(�����������ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectSubsCntrList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_NWSPSUBSCNTRDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		//���������ڵ�
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));		//���ڹ�ȣ
        String medicd = Util.checkString(req.getParameter("medicd"));		//��ü�ڵ�

        SL_L_NWSPSUBSCNTRDM dm = new SL_L_NWSPSUBSCNTRDM();

        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectSubsCntrList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_NWSPSUBSCNTRDataSet ds = null;
            ds = ejb.selectSubsCntrList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������������-�����߰������˾�(����������ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectSubsCntrDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_S_NWSPSUBSCNTRDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		//���������ڵ�
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));		//���ڹ�ȣ
        String medicd = Util.checkString(req.getParameter("medicd"));		//��ü�ڵ�
        String cntrno = Util.checkString(req.getParameter("cntrno"));		//�Ź���������ȣ
        String mangno = Util.checkString(req.getParameter("mangno"));		//������ȣ

        SL_S_NWSPSUBSCNTRDM dm = new SL_S_NWSPSUBSCNTRDM();

        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setCntrno(cntrno);
        dm.setMangno(mangno);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectSubsCntrDetail(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_S_NWSPSUBSCNTRDataSet ds = null;
            ds = ejb.selectSubsCntrDetail(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������������(������� ���,����)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void accessSubsCntr(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_A_NWSPSUBSCNTRDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		                            //���������ڵ�                                       							//���������ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);              				//�Է���(������)
        String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));					//ó�� FLAG(I:�Է�, S:����)
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));						//���ڹ�ȣ
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));                     //��ü�ڵ�
        String cntrno = Util.Uni2Ksc(Util.checkString(req.getParameter("cntrno")));                     //����ȣ
        String mangno = Util.Uni2Ksc(Util.checkString(req.getParameter("mangno")));                     //������ȣ
        String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));             //Ȯ������
        String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));             //Ȯ���ȣ
        String rdr_extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extntypecd")));     //Ȯ�������ڵ�
        String extnnm = Util.Uni2Ksc(Util.checkString(req.getParameter("extnnm")));                     //Ȯ���ڸ�
        String rdr_extncost = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extncost")));         //Ȯ����
        String subsfr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("subsfr_dt")));               //������������
        String freeyn = Util.Uni2Ksc(Util.checkString(req.getParameter("freeyn")));                     //���Ῡ��
        String freeclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("freeclsf")));                 //���ᱸ��
        String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));                       //������
        String subsuprc = Util.Uni2Ksc(Util.checkString(req.getParameter("subsuprc")));                 //�����ܰ�
        String subsqty = Util.Uni2Ksc(Util.checkString(req.getParameter("subsqty")));                   //�����μ�
        String dscnamt = Util.Uni2Ksc(Util.checkString(req.getParameter("dscnamt")));                   //���αݾ�
        String post_dlvfee = Util.Uni2Ksc(Util.checkString(req.getParameter("post_dlvfee")));           //��۷�
        String bns_itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemcd")));             //���˹��ڵ�
        String extnblngcd = Util.Uni2Ksc(Util.checkString(req.getParameter("extnblngcd")));             //Ȯ���ڼҼ��ڵ�
        String bodutycd = Util.Uni2Ksc(Util.checkString(req.getParameter("bodutycd")));                 //������å�ڵ�
        String boposicd = Util.Uni2Ksc(Util.checkString(req.getParameter("boposicd")));                 //���������ڵ�(Ȱ������)
        String stafclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("stafclsfcd")));             //��������ڵ�
        String stafno = Util.Uni2Ksc(Util.checkString(req.getParameter("stafno")));                     //�����ȣ
        String boemp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("boemp_no")));                 //������������ȣ
        String extntel1 = Util.Uni2Ksc(Util.checkString(req.getParameter("extntel1")));                 //Ȯ������ȭ1
        String extntel2 = Util.Uni2Ksc(Util.checkString(req.getParameter("extntel2")));                 //Ȯ������ȭ2
        String extntel3 = Util.Uni2Ksc(Util.checkString(req.getParameter("extntel3")));                 //Ȯ������ȭ3
        String extnptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("extnptph_no1")));         //Ȯ�����޴�����ȣ1
        String extnptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("extnptph_no2")));         //Ȯ�����޴�����ȣ2
        String extnptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("extnptph_no3")));         //Ȯ�����޴�����ȣ3
        String extnprn = Util.Uni2Ksc(Util.checkString(req.getParameter("extnprn")));                   //Ȯ�����ֹε�Ϲ�ȣ
        String extnemail = Util.Uni2Ksc(Util.checkString(req.getParameter("extnemail")));               //Ȯ�����̸���
        String aplcpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpathcd")));             //��û����ڵ�
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));                         //���

        // filtering
        // long type  "" --> "0"
        rdr_extncost = ("".equals(rdr_extncost))? "0" : rdr_extncost;
        subsuprc = ("".equals(subsuprc))? "0" : subsuprc;
        subsqty = ("".equals(subsqty))? "0" : subsqty;
        dscnamt = ("".equals(dscnamt))? "0" : dscnamt;
        post_dlvfee = ("".equals(post_dlvfee))? "0" : post_dlvfee;

        SL_A_NWSPSUBSCNTRDM dm = new SL_A_NWSPSUBSCNTRDM();

        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setCntrno(cntrno);
        dm.setMangno(mangno);
        dm.setRdr_extndt(rdr_extndt);
        dm.setRdr_extnno(rdr_extnno);
        dm.setRdr_extntypecd(rdr_extntypecd);
        dm.setExtnnm(extnnm);
        dm.setRdr_extncost(Long.parseLong(rdr_extncost));
        dm.setSubsfr_dt(subsfr_dt);
        dm.setFreeyn(freeyn);
        dm.setFreeclsf(freeclsf);
        dm.setValmm(valmm);
        dm.setSubsuprc(Long.parseLong(subsuprc));
        dm.setSubsqty(Long.parseLong(subsqty));
        dm.setDscnamt(Long.parseLong(dscnamt));
        dm.setPost_dlvfee(Long.parseLong(post_dlvfee));
        dm.setBns_itemcd(bns_itemcd);
        dm.setExtnblngcd(extnblngcd);
        dm.setBodutycd(bodutycd);
        dm.setBoposicd(boposicd);
        dm.setStafclsfcd(stafclsfcd);
        dm.setStafno(stafno);
        dm.setBoemp_no(boemp_no);
        dm.setExtntel1(extntel1);
        dm.setExtntel2(extntel2);
        dm.setExtntel3(extntel3);
        dm.setExtnptph_no1(extnptph_no1);
        dm.setExtnptph_no2(extnptph_no2);
        dm.setExtnptph_no3(extnptph_no3);
        dm.setExtnprn(extnprn);
        dm.setExtnemail(extnemail);
        dm.setAplcpathcd(aplcpathcd);
        dm.setRemk(remk);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.accessSubsCntr(dm);
        req.setAttribute("ds", ds);  // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_A_NWSPSUBSCNTRDataSet ds = null;
            ds = ejb.accessSubsCntr(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds);  // request�� ������� Binding
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
     * ������������(�Աݳ��������ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectRcpmList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_RDRCLAMTHSTYDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);			//���������ڵ�
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));		//���ڹ�ȣ
        String medicd = Util.checkString(req.getParameter("medicd"));		//��ü�ڵ�
        String basiyymm = Util.checkString(req.getParameter("basiyymm"));	//�˻����س��

        SL_L_RDRCLAMTHSTYDM dm = new SL_L_RDRCLAMTHSTYDM();
        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setBasiyymm(basiyymm);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectRcpmList(dm);
        req.setAttribute("ds", ds);  // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_RDRCLAMTHSTYDataSet ds = null;
            ds = ejb.selectRcpmList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds);  // request�� ������� Binding
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
     * ������������(�Աݳ����󼼺���)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectRcpmDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_S_RDR_NWSPCLAMTDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true); 				//���������ڵ�
        String rdr_no = Util.checkString(req.getParameter("rdr_no")); 			//���ڹ�ȣ
        String medicd = Util.checkString(req.getParameter("medicd")); 			//��ü�ڵ�
        String subsmappli = Util.checkString(req.getParameter("subsmappli")); 	//��������

        SL_S_RDR_NWSPCLAMTDM dm = new SL_S_RDR_NWSPCLAMTDM();
        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setSubsmappli(subsmappli);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectRcpmDetail(dm);
        req.setAttribute("ds", ds);     // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_S_RDR_NWSPCLAMTDataSet ds = null;
            ds = ejb.selectRcpmDetail(dm);  // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds);     // request�� ������� Binding
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
     * ������������(�Ա���������)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void accessRcpm(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_A_CLAMTRDRDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);					//���������ڵ� : ����
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);         //������(�α��ξ��̵�) : ����
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));               //���ڹ�ȣ : ����
        String medicd = Util.checkString(req.getParameter("medicd"));               //��ü�ڵ� : ����
        String subsmappli = Util.checkString(req.getParameter("subsmappli"));       //�������� : ����
        String dlvdstccd = Util.checkString(req.getParameter("dlvdstccd"));         //����������ڵ� : ����
        String clamtmthdcd = Util.checkString(req.getParameter("clamtmthdcd"));     //���ݹ���ڵ� : ����
        String rcpmclsfcd = Util.checkString(req.getParameter("rcpmclsfcd"));       //�Աݱ����ڵ� : ����
        String clamt = Util.checkString(req.getParameter("clamt"));                 //���ݾ� : ����
        String recpdt = Util.checkString(req.getParameter("recpdt"));               //�������� : ����

        SL_A_CLAMTRDRDM dm = new SL_A_CLAMTRDRDM();

        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setSubsmappli(subsmappli);
        dm.setDlvdstccd(dlvdstccd);
        dm.setClamtmthdcd(clamtmthdcd);
        dm.setRcpmclsfcd(rcpmclsfcd);
        dm.setClamt(clamt);
        dm.setRecpdt(recpdt);

        boolean bResult = false; // DML ���� ���� ����
        String sResult = "";
        SLReader1100DAO dao = new SLReader1100DAO();
        bResult = dao.accessRcpm(dm);
        if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";
        }
        req.setAttribute("result", sResult); // request�� ������� ��´�.
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        boolean bResult = false; // DML ���� ���� ����
        String sResult = "";
        try{
            SLReader1100EJB ejb = home.create();
            SL_A_CLAMTRDRDataSet ds = null;
            bResult = ejb.accessRcpm(dm); // ������ dm������ EJB�� ȣ��
            if(bResult == true){ // ���������� �Էµ� ���
                sResult = "true";
            }
            req.setAttribute("result", sResult); // request�� ������� ��´�.
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
     * ������������(���ϸ������޳����˾�-�ʱ�ȭ��)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void initMilgPayHistory(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_MILGPAY_INITDataSet ds = null;
        // session process
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		//���������ڵ�

        SL_L_MILGPAY_INITDM dm = new SL_L_MILGPAY_INITDM();

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.initMilgPayHistory(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_MILGPAY_INITDataSet ds = null;
            ds = ejb.initMilgPayHistory(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������������(���ϸ������޳����˾�-�����ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectMilgPayHistoryList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_MILGPAYDataSet ds = null;
        // parameter process
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String frpaydt = Util.checkString(req.getParameter("frpaydt"));
        String topaydt = Util.checkString(req.getParameter("topaydt"));
        String paybasicd = Util.checkString(req.getParameter("paybasicd"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        // filtering
        // long type  "" --> "0"
        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "10" : pagesize;

        SL_L_MILGPAYDM dm = new SL_L_MILGPAYDM();
        dm.setRdr_no(rdr_no);
        dm.setFrpaydt(frpaydt);
        dm.setTopaydt(topaydt);
        dm.setPaybasicd(paybasicd);
        dm.setMedicd(medicd);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectMilgPayHistoryList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_MILGPAYDataSet ds = null;
            ds = ejb.selectMilgPayHistoryList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������������(���ϸ������޳����˾�-����ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectMilgPayHistoryDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_S_MILGPAYDataSet ds = null;
        // parameter process
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String milgpaydt = Util.checkString(req.getParameter("milgpaydt"));
        String milgpayno = Util.checkString(req.getParameter("milgpayno"));

        SL_S_MILGPAYDM dm = new SL_S_MILGPAYDM();

        dm.setRdr_no(rdr_no);
        dm.setMilgpaydt(milgpaydt);
        dm.setMilgpayno(milgpayno);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectMilgPayHistoryDetail(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_S_MILGPAYDataSet ds = null;
            ds = ejb.selectMilgPayHistoryDetail(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������������(���ϸ������޳����˾�-���,����,����)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void accessMilgPayHistory(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_A_MILGPAYDataSet ds = null;
        // Session process
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		    //���������ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);		//�Է� Ȥ�� ����, ������ ID

        // Parameter process
        String accflag = Util.checkString(req.getParameter("accflag"));				//ó�� FLAG (I:���, U:����, D:����)
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));               //���ڹ�ȣ
        String milgpaydt = Util.checkString(req.getParameter("milgpaydt"));         //���ϸ�����������
        String milgpayno = Util.checkString(req.getParameter("milgpayno"));         //���ϸ������޹�ȣ
        String cmpycd = Util.checkString(req.getParameter("cmpycd"));               //ȸ���ڵ�
        String medicd = Util.checkString(req.getParameter("medicd"));               //��ü�ڵ�
        String paybasicd = Util.checkString(req.getParameter("paybasicd"));         //���ޱ����ڵ�
        String payclsfcd = Util.checkString(req.getParameter("payclsfcd"));         //���ޱ����ڵ�
        String pont = Util.checkString(req.getParameter("pont"));                   //����Ʈ

        // filtering
        // long type  "" --> "0"
        pont = ("".equals(pont))? "0" : pont;

        SL_A_MILGPAYDM dm = new SL_A_MILGPAYDM();

        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setRdr_no(rdr_no);
        dm.setMilgpaydt(milgpaydt);
        dm.setMilgpayno(milgpayno);
        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setPaybasicd(paybasicd);
        dm.setPayclsfcd(payclsfcd);
        dm.setPont(Long.parseLong(pont));

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.accessMilgPayHistory(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_A_MILGPAYDataSet ds = null;
            ds = ejb.accessMilgPayHistory(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������������(���������˾�-�ʱ�ȭ��)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void initDsct(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	CO_L_TAOCC_CDVDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String ciymgbcd = "97";   //�������� : �����������
        String cicdgb = "390";    //�ڵ屸�� : �����Ҹ�����
        String cimgtcd1 = "Y";  //�����׺�1
        String cimgtcd2 = "ALL";  //�����׸�2
        String cimgtcd3 = "ALL";  //�����׸�3
        String cimgtcd4 = "ALL";  //�����׸�4
        String cimgtcd5 = "ALL";  //�����׸�5
        String cimgtcd6 = "NO";   //�����׸�6
        String cimgtcd7 = "NO";   //�����׸�7

        CO_L_TAOCC_CDVDM dm = new CO_L_TAOCC_CDVDM();
        dm.setCiymgbcd(ciymgbcd);
        dm.setCicdgb(cicdgb);
        dm.setCimgtcd1(cimgtcd1);
        dm.setCimgtcd2(cimgtcd2);
        dm.setCimgtcd3(cimgtcd3);
        dm.setCimgtcd4(cimgtcd4);
        dm.setCimgtcd5(cimgtcd5);
        dm.setCimgtcd6(cimgtcd6);
        dm.setCimgtcd7(cimgtcd7);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.initDsct(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            CO_L_TAOCC_CDVDataSet ds = null;
            ds = ejb.initDsct(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������������(�����˾�)(�ʱ�ȭ)
     * ����ó���� ���� ��ü���, ���������� ���� �Ż����� ��ȸ
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectStopSubsList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_E_SUBS_CNTR_STOP_INIDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);				//���������ڵ�
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));			//���ڹ�ȣ

        SL_E_SUBS_CNTR_STOP_INIDM dm = new SL_E_SUBS_CNTR_STOP_INIDM();
        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);

        //debugging
        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        
        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectStopSubsList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_E_SUBS_CNTR_STOP_INIDataSet ds = null;
            ds = ejb.selectStopSubsList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������������(����ó��)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void updateStopSubs(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_A_SUBS_CNTR_STOPDataSet ds = null;
        //requesting parameters
        final String DELIMITER = "##";
        String[] idxs       = req.getParameterValues("idx");   //�ΰ��� �� üũ�� ����� idx����
        String bocd         = Util.getSessionParameterValue(req, "bocd", true);		//���������ڵ�
        String incmgpers    = Util.getSessionParameterValue(req, "uid", true);      //�Է���(�ܼ�)
        String suspdt       = Util.checkString(req.getParameter("suspdt"));         //��������
        String susptype     = Util.checkString(req.getParameter("susptype"));       //ó�� FLAG (97-360 10:�κ�����, 20:��ü����)
        String remk         = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));  //���(Ÿ��������ü ������ Ȱ���)
        String resv1 		= Util.checkString(req.getParameter("resv1"));
        String resv2 		= Util.checkString(req.getParameter("resv2"));
        String resv3 		= Util.checkString(req.getParameter("resv3"));

        StringBuffer sb_rdr_no 		= new StringBuffer(""); //���ڹ�ȣ (�����Էµ�)
        StringBuffer sb_medicd 		= new StringBuffer(""); //��ü     (�����Էµ�)
        StringBuffer sb_freeyn 		= new StringBuffer(""); //���Ῡ�� (�����Էµ�)
        StringBuffer sb_freeclsf 	= new StringBuffer(""); //���ᱸ�� (�����Էµ�)
        StringBuffer sb_qty 		= new StringBuffer(""); //�μ�     (�����Էµ�)
        StringBuffer sb_suspresncd 	= new StringBuffer(""); //�������� (97-370 )

        String[] rdr_nos 		= req.getParameterValues("rdr_no" 		);
        String[] medicds 		= req.getParameterValues("medicd" 		);
        String[] freeyns 		= req.getParameterValues("freeyn" 		);
        String[] freeclsfs 	    = req.getParameterValues("freeclsf" 	);
        String[] qtys 			= req.getParameterValues("qty" 			);
        String[] suspresncds 	= req.getParameterValues("suspresncd"   );



        if(idxs == null){
             throw new AppException("[SLReader1100WB.java-updateStopSubs](1)", "��������� üũ�� ���� �����ϴ�.");
        }

        for(int i=0; i<idxs.length; i++){
            sb_rdr_no.append(DELIMITER + rdr_nos[Integer.parseInt(idxs[i])]);
            sb_medicd.append(DELIMITER + Util.Uni2Ksc(medicds[Integer.parseInt(idxs[i])]));
            sb_freeyn.append(DELIMITER + freeyns[Integer.parseInt(idxs[i])]);
            sb_freeclsf.append(DELIMITER + freeclsfs[Integer.parseInt(idxs[i])]);
            sb_qty.append(DELIMITER + qtys[Integer.parseInt(idxs[i])]);
            sb_suspresncd.append(DELIMITER + suspresncds[Integer.parseInt(idxs[i])]);
        }
        if(idxs.length > 0){
            sb_rdr_no.delete(0,DELIMITER.length());
            sb_medicd.delete(0,DELIMITER.length());
            sb_freeyn.delete(0,DELIMITER.length());
            sb_freeclsf.delete(0,DELIMITER.length());
            sb_qty.delete(0,DELIMITER.length());
            sb_suspresncd.delete(0,DELIMITER.length());
        }

        //setting dm
        SL_A_SUBS_CNTR_STOPDM dm = new SL_A_SUBS_CNTR_STOPDM();
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setSusptype(susptype);
        dm.setSuspdt(suspdt);
        dm.setRemk(remk);
        dm.setRdr_no(sb_rdr_no.toString());
        dm.setMedicd(sb_medicd.toString());
        dm.setFreeyn(sb_freeyn.toString());
        dm.setFreeclsf(sb_freeclsf.toString());
        dm.setQty(sb_qty.toString());
        dm.setSuspresncd(sb_suspresncd.toString());
        dm.setResv1(resv1);
        dm.setResv2(resv2);
        dm.setResv3(resv3);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.updateStopSubs(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try {
            SLReader1100EJB ejb = home.create();
            SL_A_SUBS_CNTR_STOPDataSet ds = null;
            ds = ejb.updateStopSubs(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������������(���������˾�-�ʱ�ȭ��)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void initMovmTrsf(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_MOVM_RDR_INIT_01DataSet ds = null;
        SL_L_MOVM_RDR_INIT_01DM dm = new SL_L_MOVM_RDR_INIT_01DM();

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.initMovmTrsf(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_MOVM_RDR_INIT_01DataSet ds = null;
            ds = ejb.initMovmTrsf(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������������(���˹����޳����˾�-�����ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectBnsItemPayHistoryList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_BNS_ITEMPAYDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));					//���ڹ�ȣ
        String frpaydt = Util.Uni2Ksc(Util.checkString(req.getParameter("frpaydt")));               //from ��������
        String topaydt = Util.Uni2Ksc(Util.checkString(req.getParameter("topaydt")));               //to   ��������
        String search_order = Util.Uni2Ksc(Util.checkString(req.getParameter("search_order")));     //��������
        String search_ad = Util.Uni2Ksc(Util.checkString(req.getParameter("search_ad")));           //"ASC" or "DESC"
        String search_cond = Util.Uni2Ksc(Util.checkString(req.getParameter("search_cond")));       //�˻�����
        String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));       //�˻���
        String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));                 //����������
        String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));             //�������� ������ �Ǽ�


        // filtering
        // long type  "" --> "0"
        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "10" : pagesize;

        SL_L_BNS_ITEMPAYDM dm = new SL_L_BNS_ITEMPAYDM();
        dm.setRdr_no(rdr_no);
        dm.setFrpaydt(frpaydt);
        dm.setTopaydt(topaydt);
        dm.setSearch_order(search_order);
        dm.setSearch_ad(search_ad);
        dm.setSearch_cond(search_cond);
        dm.setSearch_word(search_word);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectBnsItemPayHistoryList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_BNS_ITEMPAYDataSet ds = null;
            ds = ejb.selectBnsItemPayHistoryList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������������(���˹����޳����˾�-����ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectBnsItemPayHistoryDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_S_BNS_ITEMPAYDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));				//���ڹ�ȣ
        String payno = Util.Uni2Ksc(Util.checkString(req.getParameter("payno")));               //���޹�ȣ

        SL_S_BNS_ITEMPAYDM dm = new SL_S_BNS_ITEMPAYDM();
        dm.setRdr_no(rdr_no);
        dm.setPayno(payno);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectBnsItemPayHistoryDetail(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_S_BNS_ITEMPAYDataSet ds = null;
            ds = ejb.selectBnsItemPayHistoryDetail(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������������(���˹����޳����˾�-���,����,����)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void accessBnsItemPayHistory(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_A_BNS_ITEMPAYDataSet ds = null;
        // Session process
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		    //���������ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);		//�Է� Ȥ�� ����, ������ ID

        // parameter requesting �ϰ�  DM�� ���� Setting
        String accflag = Util.checkString(req.getParameter("accflag"));         //ó�� FLAG (I:���, U:����, D:����)
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));           //���ڹ�ȣ
        String payno = Util.checkString(req.getParameter("payno"));             //���޹�ȣ
        String paydt = Util.checkString(req.getParameter("paydt"));             //��������
        String bns_itemcd = Util.checkString(req.getParameter("bns_itemcd"));   //���˹��ڵ�
        String qunt = Util.checkString(req.getParameter("qunt"));               //����
        String amt = Util.checkString(req.getParameter("amt"));                 //�ݾ�
        String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));   //Ȯ������
        String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));   //Ȯ���ȣ

        // filtering
        // long type  "" --> "0"
        qunt = ("".equals(qunt))? "1" : qunt;
        amt = ("".equals(amt))? "10" : amt;


        SL_A_BNS_ITEMPAYDM dm = new SL_A_BNS_ITEMPAYDM();
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setRdr_no(rdr_no);
        dm.setPayno(payno);
        dm.setPaydt(paydt);
        dm.setBns_itemcd(bns_itemcd);
        dm.setQunt(Long.parseLong(qunt));
        dm.setAmt(Long.parseLong(amt));
        dm.setRdr_extndt(rdr_extndt);
        dm.setRdr_extnno(rdr_extnno);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.accessBnsItemPayHistory(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_A_BNS_ITEMPAYDataSet ds = null;
            ds = ejb.accessBnsItemPayHistory(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������������(��ü��û�˾�-�űԽ�û �ʱ�ȭ)
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAplcNew(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SL_L_APLC_NEWDataSet ds = null;
        SL_L_APLC_NEWDM dm = new SL_L_APLC_NEWDM();

        // dm ���� ����
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		//���������ڵ�
        String rdr_no = req.getParameter("rdr_no");
        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        // dm ���� ��
        
        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectAplcNew(dm);
        req.setAttribute("ds", ds); // request�� ������� ��´�.

        /*
        SLReader1100EJBHome home = (SLReader1100EJBHome) JNDIManager.getInstance().getHome("SLReader1100EJB");
        try {
            SLReader1100EJB ejb = home.create();
            ds = ejb.selectAplcNew(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds); // request�� ������� ��´�.
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
     * ������������(��ü��û�˾�-������û �ʱ�ȭ)
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAplcExpy(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SL_L_APLC_EXPYDataSet ds = null;
        SL_L_APLC_EXPYDM dm = new SL_L_APLC_EXPYDM();

        // dm ���� ����
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		//���������ڵ�
        String rdr_no = req.getParameter("rdr_no");
        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        // dm ���� ��

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectAplcExpy(dm);
        req.setAttribute("ds", ds); // request�� ������� ��´�.
        
        /*
        SLReader1100EJBHome home = (SLReader1100EJBHome) JNDIManager.getInstance().getHome("SLReader1100EJB");
        try {
            SLReader1100EJB ejb = home.create();
            ds = ejb.selectAplcExpy(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds); // request�� ������� ��´�.
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
     * ������������(��ü��û�˾�-������û����� �󼼺���)
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAplcDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SL_S_APLC_EXPYDataSet ds = null;
        SL_S_APLC_EXPYDM dm = new SL_S_APLC_EXPYDM();

        // dm ���� ����
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		//���������ڵ�
        String rdr_no = req.getParameter("rdr_no");
        String medicd = req.getParameter("medicd");

        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        // dm ���� ��

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectAplcDetail(dm);
        req.setAttribute("ds", ds); // request�� ������� ��´�.
        
        /*
        SLReader1100EJBHome home = (SLReader1100EJBHome) JNDIManager.getInstance().getHome("SLReader1100EJB");
        try {
            SLReader1100EJB ejb = home.create();
            ds = ejb.selectAplcDetail(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds); // request�� ������� ��´�.
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
     * ������������(��ü��û�˾�-�ڵ���ü��û �Է�)
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertAutoShiftAplc(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SL_I_SHFTAPLCDataSet ds = null;
        SL_I_SHFTAPLCDM dm = new SL_I_SHFTAPLCDM();

        // dm ���� ����
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		//���������ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //�Է��� ���̵�
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String accflag = Util.checkString(req.getParameter("accflag"));
        String shftclsf = Util.checkString(req.getParameter("shftclsf"));
        String pymtnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtnm")));
        String pymttel1 = Util.checkString(req.getParameter("pymttel1"));
        String pymttel2 = Util.checkString(req.getParameter("pymttel2"));
        String pymttel3 = Util.checkString(req.getParameter("pymttel3"));
        String bankcd = Util.checkString(req.getParameter("recpinstt"));
        String acctno = Util.checkString(req.getParameter("acctno"));
        String cardcmpycd = Util.checkString(req.getParameter("cardcmpycd"));
        String cardno = Util.checkString(req.getParameter("cardno"));
        String vdtyprd = Util.checkString(req.getParameter("vdtyyy")) + Util.checkString(req.getParameter("vdtymm"));
        String prn = Util.checkString(req.getParameter("prn"));
        String aplcdt = Util.checkString(req.getParameter("aplcdt"));
        String aplyyymm = Util.checkString(req.getParameter("aplyyymm"));
        String email = Util.checkString(req.getParameter("email"));
        String tmpFlag = "R";

        dm.setAccflag(accflag);
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setShftclsf(shftclsf);
        dm.setPymtnm(pymtnm);
        dm.setPymttel1(pymttel1);
        dm.setPymttel2(pymttel2);
        dm.setPymttel3(pymttel3);
        dm.setBankcd(bankcd);
        dm.setAcctno(acctno);
        dm.setCardcmpycd(cardcmpycd);
        dm.setCardno(cardno);
        dm.setVdtyprd(vdtyprd);
        dm.setPrn(prn);
        dm.setAplcdt(aplcdt);
        dm.setAplyyymm(aplyyymm);
        dm.setEmail(email);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setTmpflag(tmpFlag);
        // dm ���� ��

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.insertAutoShiftAplc(dm);
        req.setAttribute("ds", ds); // request�� ������� ��´�.
        
        /*
        SLReader1100EJBHome home = (SLReader1100EJBHome) JNDIManager.getInstance().getHome("SLReader1100EJB");
        try {
            SLReader1100EJB ejb = home.create();
            ds = ejb.insertAutoShiftAplc(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds); // request�� ������� ��´�.
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
     * ������������(��ü��û�˾�-��ü�������)
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateShftMthd(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SL_U_SHFTMTHDCHGDataSet ds = null;
        SL_U_SHFTMTHDCHGDM dm = new SL_U_SHFTMTHDCHGDM();

        // dm ���� ����
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		//���������ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //�Է��� ���̵�
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String shftclsf = Util.checkString(req.getParameter("shftclsf"));
        String pymtnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtnm")));
        String pymttel1 = Util.checkString(req.getParameter("pymttel1"));
        String pymttel2 = Util.checkString(req.getParameter("pymttel2"));
        String pymttel3 = Util.checkString(req.getParameter("pymttel3"));
        String bankcd = Util.checkString(req.getParameter("recpinstt"));
        String acctno = Util.checkString(req.getParameter("acctno"));
        String cardcmpycd = Util.checkString(req.getParameter("cardcmpycd"));
        String cardno = Util.checkString(req.getParameter("cardno"));
        String vdtyprd = Util.checkString(req.getParameter("vdtyyy")) + Util.checkString(req.getParameter("vdtymm"));
        String prn = Util.checkString(req.getParameter("prn"));
        String aplcdt = Util.checkString(req.getParameter("aplcdt"));
        String aplyyymm = Util.checkString(req.getParameter("aplyyymm"));
        String email = Util.checkString(req.getParameter("email"));

        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setShftclsf(shftclsf);
        dm.setPymtnm(pymtnm);
        dm.setPymttel1(pymttel1);
        dm.setPymttel2(pymttel2);
        dm.setPymttel3(pymttel3);
        dm.setBankcd(bankcd);
        dm.setAcctno(acctno);
        dm.setCardcmpycd(cardcmpycd);
        dm.setCardno(cardno);
        dm.setVdtyprd(vdtyprd);
        dm.setPrn(prn);
        dm.setAplcdt(aplcdt);
        dm.setAplyyymm(aplyyymm);
        dm.setEmail(email);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        // dm ���� ��

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.updateShftMthd(dm);
        req.setAttribute("ds", ds); // request�� ������� ��´�.
        
        /*
        SLReader1100EJBHome home = (SLReader1100EJBHome) JNDIManager.getInstance().getHome("SLReader1100EJB");
        try {
            SLReader1100EJB ejb = home.create();
            ds = ejb.updateShftMthd(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds); // request�� ������� ��´�.
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
     * ������������(���ڸ޸��˾�-��ȸ,���,����,�ʱ�ȭ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void accessRdrMemo(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_A_RDRMEMODataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String accflag = Util.checkString(req.getParameter("accflag"));			//ó�� FLAG(R:��ȸ, U:����, D:�ʱ�ȭ)
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);     //�Է���(������)���̵�
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));           //���ڹ�ȣ
        String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont"))); //���ڷ� ���� �Է¹��� ����

        SL_A_RDRMEMODM dm = new SL_A_RDRMEMODM();
        dm.setAccflag(accflag);
        dm.setIncmgpers(incmgpers);
        dm.setRdr_no(rdr_no);
        dm.setCont(cont);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.accessRdrMemo(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_A_RDRMEMODataSet ds = null;
            ds = ejb.accessRdrMemo(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������������(���������˾�-�����ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectStopHist(HttpServletRequest req, HttpServletResponse res) throws AppException{

    	SL_L_SUBS_CNTR_STOP_HISTDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		//���������ڵ�
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));		//���ڹ�ȣ
        String medicd = Util.checkString(req.getParameter("medicd"));

        SL_L_SUBS_CNTR_STOP_HISTDM dm = new SL_L_SUBS_CNTR_STOP_HISTDM();
        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectStopHist(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_SUBS_CNTR_STOP_HISTDataSet ds = null;
            ds = ejb.selectStopHist(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������������(���������˾�-�������ó��)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void cancelStopMulti(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_A_SUBS_CNTR_STOP_CANCDataSet ds = null;
        //requesting parameters
        final String DELIMITER = "##";
        String[] idxs       = req.getParameterValues("idx");   //�ΰ��� �� üũ�� ����� idx����
        String bocd         = Util.getSessionParameterValue(req, "bocd", true);		//���������ڵ�
        String incmgpers    = Util.getSessionParameterValue(req, "uid", true);      //�Է���(�ܼ�)
        String resv1 		= Util.checkString(req.getParameter("resv1"));
        String resv2 		= Util.checkString(req.getParameter("resv2"));
        String resv3 		= Util.checkString(req.getParameter("resv3"));

        StringBuffer sb_rdr_no 		= new StringBuffer(""); //���ڹ�ȣ (�����Էµ�)
        StringBuffer sb_medicd 		= new StringBuffer(""); //��ü�ڵ� (�����Էµ�)
        StringBuffer sb_cntrno 		= new StringBuffer(""); //����ȣ (�����Էµ�)
        StringBuffer sb_mangno 		= new StringBuffer(""); //������ȣ (�����Էµ�)

        String[] rdr_nos 		= req.getParameterValues("rdr_no" 		);
        String[] medicds 		= req.getParameterValues("medicd" 		);
        String[] cntrnos 		= req.getParameterValues("cntrno" 		);
        String[] mangnos 	    = req.getParameterValues("mangno" 	    );

        if(idxs == null){
             throw new AppException("[SLReader1100WB.java-cancelStop](1)", "�������ó��");
        }

        for(int i=0; i<idxs.length; i++){
            sb_rdr_no.append(DELIMITER + rdr_nos[Integer.parseInt(idxs[i])]);
            sb_medicd.append(DELIMITER + Util.Uni2Ksc(medicds[Integer.parseInt(idxs[i])]));
            sb_cntrno.append(DELIMITER + cntrnos[Integer.parseInt(idxs[i])]);
            sb_mangno.append(DELIMITER + mangnos[Integer.parseInt(idxs[i])]);
        }
        if(idxs.length > 0){
            sb_rdr_no.delete(0,DELIMITER.length());
            sb_medicd.delete(0,DELIMITER.length());
            sb_cntrno.delete(0,DELIMITER.length());
            sb_mangno.delete(0,DELIMITER.length());
        }

        //setting dm
        SL_A_SUBS_CNTR_STOP_CANCDM dm = new SL_A_SUBS_CNTR_STOP_CANCDM();
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setRdr_no(sb_rdr_no.toString());
        dm.setMedicd(sb_medicd.toString());
        dm.setCntrno(sb_cntrno.toString());
        dm.setMangno(sb_mangno.toString());
        dm.setResv1(resv1);
        dm.setResv2(resv2);
        dm.setResv3(resv3);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.cancelStopMulti(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_A_SUBS_CNTR_STOP_CANCDataSet ds = null;
            ds = ejb.cancelStopMulti(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������������(�������ڸ���˾�-�����ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void dupChkRdrList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_RDR_DUP_CHKDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String medicd = Util.checkString(req.getParameter("medicd"));				//��ü�ڵ�
        String bocd = Util.getSessionParameterValue(req, "bocd", true);				//���������ڵ�
        String accflag = Util.checkString(req.getParameter("accflag"));             //ó�� FLAG ('10' : �������� ī��Ʈ, '20' : �������ڸ����ȸ )
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);      	//�Է���(�ܼ�)
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));   //���ڸ�
        String rdrtel_no1 = Util.checkString(req.getParameter("rdrtel_no1"));		//��ȭ��ȣ1
        String rdrtel_no2 = Util.checkString(req.getParameter("rdrtel_no2"));		//��ȭ��ȣ2
        String rdrtel_no3 = Util.checkString(req.getParameter("rdrtel_no3"));		//��ȭ��ȣ3
        String rdrptph_no1 = Util.checkString(req.getParameter("rdrptph_no1"));		//�޴�����ȣ1
        String rdrptph_no2 = Util.checkString(req.getParameter("rdrptph_no2"));		//�޴�����ȣ2
        String rdrptph_no3 = Util.checkString(req.getParameter("rdrptph_no3"));		//�޴�����ȣ3
        String prn = Util.checkString(req.getParameter("prn"));						//�ֹε�Ϲ�ȣ
        String dlvzip = Util.checkString(req.getParameter("dlvzip"));				//�����ȣ
        String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));				//�ּ�
        String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));		//���ּ�
        String dlvdong = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdong")));	            //��
        String dlvser_no = Util.checkString(req.getParameter("dlvser_no"));			                //ȣ��
        String dlvbnji = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvbnji")));				//����
        String email =Util.Uni2Ksc(Util.checkString(req.getParameter("email")));					//�̸���


        SL_L_RDR_DUP_CHKDM dm = new SL_L_RDR_DUP_CHKDM();
        dm.setAccflag(accflag);
        dm.setMedicd(medicd);
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setRdrnm(rdrnm);
        dm.setRdrtel_no1(rdrtel_no1);
        dm.setRdrtel_no2(rdrtel_no2);
        dm.setRdrtel_no3(rdrtel_no3);
        dm.setRdrptph_no1(rdrptph_no1);
        dm.setRdrptph_no2(rdrptph_no2);
        dm.setRdrptph_no3(rdrptph_no3);
        dm.setPrn(prn);
        dm.setDlvzip(dlvzip);
        dm.setDlvaddr(dlvaddr);
        dm.setDlvdtlsaddr(dlvdtlsaddr);
        dm.setDlvdong(dlvdong);
        dm.setDlvser_no(dlvser_no);
        dm.setDlvbnji(dlvbnji);
        dm.setEmail(email);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.dupChkRdrList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_RDR_DUP_CHKDataSet ds = null;

            ds = ejb.dupChkRdrList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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

    public void selectDsctList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_DSCTDataSet ds = null;
        //requesting parameters
        String bocd = Util.getSessionParameterValue(req, "bocd", true);                         //���������ڵ�
        String reg_fr_dt = Util.checkString(req.getParameter("reg_fr_dt"));                     //�������(~����)
        String reg_to_dt = Util.checkString(req.getParameter("reg_to_dt"));                     //�������(~����)
        String dscttypecd = Util.checkString(req.getParameter("dscttypecd"));                   //���������ڵ�(�����Ҹ������ڵ�)
        String acpnpathcd = Util.checkString(req.getParameter("acpnpathcd"));                   //��û���(10:���ڿ��,20:����,30:TM,40:��Ÿ)
        String boprocyn = Util.checkString(req.getParameter("boprocyn"));                       //����ó������("Y", "N")
        String search_cond = Util.Uni2Ksc(Util.checkString(req.getParameter("search_cond")));   //�˻�����('ALL', 'DSNO', 'NO', 'NM', 'TITLE', 'CONT')
        String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));   //�˻���
        String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));             //����������
        String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));         //�������� ������ �Ǽ�

        // filtering
        // long type  "" --> "0"
        pageno		 =	("".equals(pageno		))? "1" : pageno      ;		//����������
        pagesize	 =	("".equals(pagesize	 	))? "10": pagesize	  ;		//�������� ������ �Ǽ�

        //setting dm
        SL_L_DSCTDM dm = new SL_L_DSCTDM();
        dm.setBocd(bocd);
        dm.setReg_fr_dt(reg_fr_dt);
        dm.setReg_to_dt(reg_to_dt);
        dm.setDscttypecd(dscttypecd);
        dm.setAcpnpathcd(acpnpathcd);
        dm.setBoprocyn(boprocyn);
        dm.setSearch_cond(search_cond);
        dm.setSearch_word(search_word);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectDsctList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
        	
            SLReader1100EJB ejb = home.create();
            SL_L_DSCTDataSet ds = null;
            ds = ejb.selectDsctList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
