/**************************************************************************************************
* ���ϸ�    : SLReader2400WB.java
* ���      : ����-VacationStop������ ���� Worker Bean
* �ۼ�����  : 2004-01-20
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
 * ����-VacationStop������ ���� Worker Bean
 */
public class SLReader2400WB {
    /**
     * VacationStop����-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void initVS(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_VS_INITDataSet ds = null;
        // ���������ڵ带 WB �� ���ǿ���
        String bocd = Util.getSessionParameterValue(req, "bocd", true); //���������ڵ�

        // parameter requesting �ϰ�  DM�� ���� Setting
        SL_L_VS_INITDM dm = new SL_L_VS_INITDM();
        dm.setBocd(bocd);
        
        SLReader2400DAO dao = new SLReader2400DAO();
        ds = dao.initVS(dm);
        req.setAttribute("ds", ds);     // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader2400EJBHome home = (SLReader2400EJBHome)JNDIManager.getInstance().getHome("SLReader2400EJB");
        try{
            SLReader2400EJB ejb = home.create();
            SL_L_VS_INITDataSet ds = null;
            ds = ejb.initVS(dm);          // ������ dm������ EJB�� ȣ��
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
     * VacationStop����-�����ȸ
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectVSList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_VSDataSet ds = null;
        // ���������ڵ带 WB �� ���ǿ���
        String bocd = Util.getSessionParameterValue(req, "bocd", true); //���������ڵ�

        // parameter requesting �ϰ�  DM�� ���� Setting
        String workflag = Util.checkString(req.getParameter("workflag"));
        String clsfcd = Util.checkString(req.getParameter("clsfcd"));
        String bocnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("bocnfmyn")));
        String ing = Util.Uni2Ksc(Util.checkString(req.getParameter("ing")));
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        SL_L_VSDM dm = new SL_L_VSDM();
        dm.setBocd(bocd);
        dm.setWorkflag(workflag);
        dm.setClsfcd(clsfcd);
        dm.setBocnfmyn(bocnfmyn);
        dm.setIng(ing);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        
        SLReader2400DAO dao = new SLReader2400DAO();
        ds = dao.selectVSList(dm);
        req.setAttribute("ds", ds);     // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader2400EJBHome home = (SLReader2400EJBHome)JNDIManager.getInstance().getHome("SLReader2400EJB");
        try{
            SLReader2400EJB ejb = home.create();
            SL_L_VSDataSet ds = null;
            ds = ejb.selectVSList(dm);          // ������ dm������ EJB�� ȣ��
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
     * VacationStop����-�󼼺���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectVSDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_S_VSDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String regdt = Util.checkString(req.getParameter("regdt"));
        String regno = Util.checkString(req.getParameter("regno"));

        SL_S_VSDM dm = new SL_S_VSDM();
        dm.setRegdt(regdt);
        dm.setRegno(regno);

        SLReader2400DAO dao = new SLReader2400DAO();
        ds = dao.selectVSDetail(dm);
        req.setAttribute("ds", ds);     // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader2400EJBHome home = (SLReader2400EJBHome)JNDIManager.getInstance().getHome("SLReader2400EJB");
        try{
            SLReader2400EJB ejb = home.create();
            SL_S_VSDataSet ds = null;
            ds = ejb.selectVSDetail(dm);          // ������ dm������ EJB�� ȣ��
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
     * VacationStop����-�ް���������� �����ȸ
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectVSAreaRegn(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_VS_AREANMDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String vaca_arearegncd = Util.checkString(req.getParameter("vaca_arearegncd"));

        SL_L_VS_AREANMDM dm = new SL_L_VS_AREANMDM();
        dm.setVaca_arearegncd(vaca_arearegncd);

        SLReader2400DAO dao = new SLReader2400DAO();
        ds = dao.selectVSAreaRegn(dm);
        req.setAttribute("ds", ds);     // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader2400EJBHome home = (SLReader2400EJBHome)JNDIManager.getInstance().getHome("SLReader2400EJB");
        try{
            SLReader2400EJB ejb = home.create();
            SL_L_VS_AREANMDataSet ds = null;
            ds = ejb.selectVSAreaRegn(dm);          // ������ dm������ EJB�� ȣ��
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
     * VacationStop����-�ް���������� ������,������ȭ��ȣ ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectVSBODetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_S_VS_AREABODataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String vaca_arearegncd = Util.checkString(req.getParameter("vaca_arearegncd"));
        String vaca_areacd = Util.checkString(req.getParameter("vaca_areacd"));

        SL_S_VS_AREABODM dm = new SL_S_VS_AREABODM();
        dm.setVaca_arearegncd(vaca_arearegncd);
        dm.setVaca_areacd(vaca_areacd);

        SLReader2400DAO dao = new SLReader2400DAO();
        ds = dao.selectVSBODetail(dm);
        req.setAttribute("ds", ds);     // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader2400EJBHome home = (SLReader2400EJBHome)JNDIManager.getInstance().getHome("SLReader2400EJB");
        try{
            SLReader2400EJB ejb = home.create();
            SL_S_VS_AREABODataSet ds = null;
            ds = ejb.selectVSBODetail(dm);          // ������ dm������ EJB�� ȣ��
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
     * VacationStop����-�Է�,����,����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void accessVS(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_A_VSDataSet ds = null;
        // ���������ڵ带 WB �� ���ǿ���
        String bocd = Util.getSessionParameterValue(req, "bocd", true); //���������ڵ�

        // parameter requesting �ϰ�  DM�� ���� Setting
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);												// ������(�α��ξ��̵�) : ����
        String accflag = Util.checkString(req.getParameter("accflag"));                                                 // ó������(I:�Է�, U:����, D:����)
        String userflag = Util.checkString(req.getParameter("userflag"));                                               // ����ڱ���(10:����, 20:��������(��), 30:��������(�ް���) 40:���ڼ��񽺼�Ÿ)
        String regdt = Util.checkString(req.getParameter("regdt"));                                                     // �������
        String regno = Util.checkString(req.getParameter("regno"));                                                     // ��Ϲ�ȣ
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));                                                   // ���ڹ�ȣ
        String medicd = Util.checkString(req.getParameter("medicd"));                                                   // ��ü�ڵ�
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));                                       // ���ڸ�
        String rdrtel_no1 = Util.checkString(req.getParameter("rdrtel_no1"));                                           // ������ȭ��ȣ1
        String rdrtel_no2 = Util.checkString(req.getParameter("rdrtel_no2"));                                           // ������ȭ��ȣ2
        String rdrtel_no3 = Util.checkString(req.getParameter("rdrtel_no3"));                                           // ������ȭ��ȣ3
        String dlvzip = Util.checkString(req.getParameter("dlvzip"));                                                   // ����������ȣ
        String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));                                   // ������ּ�
        String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));                           // ��������ּ�
        String qty = Util.checkString(req.getParameter("qty"));                                                         // �μ�
        String aplcpathcd = Util.checkString(req.getParameter("aplcpathcd"));                                           // ��û����ڵ�
        String clsfcd = Util.checkString(req.getParameter("clsfcd"));                                                   // �����ڵ�(���񽺱���: 10:V-Stop, 20:V-Stop+�ް������, 30:V-Stop+Ư���Ϲ��)
        String suspfrdt = Util.checkString(req.getParameter("suspfrdt"));                                               // ������������
        String susptodt = Util.checkString(req.getParameter("susptodt"));                                               // ������������
        String bgnmappli = Util.checkString(req.getParameter("bgnmappli"));                                             // ���ۿ���
        String endmappli = Util.checkString(req.getParameter("endmappli"));                                             // �������
        String spcfdlvdt = Util.checkString(req.getParameter("spcfdlvdt"));                                             // Ư���������
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));                                         // ���
        String rdrptph_no1 = Util.checkString(req.getParameter("rdrptph_no1"));                                         // �����޴�����ȣ1
        String rdrptph_no2 = Util.checkString(req.getParameter("rdrptph_no2"));                                         // �����޴�����ȣ2
        String rdrptph_no3 = Util.checkString(req.getParameter("rdrptph_no3"));                                         // �����޴�����ȣ3
        String vaca_areadlvfrdt = Util.checkString(req.getParameter("vaca_areadlvfrdt"));                               // �ް�����޽�������
        String vaca_areadlvtodt = Util.checkString(req.getParameter("vaca_areadlvtodt"));                               // �ް��������������
        String vaca_arearegncd = Util.checkString(req.getParameter("vaca_arearegncd"));                                 // �ް����ǿ��ڵ�
        String vaca_areacd = Util.checkString(req.getParameter("vaca_areacd"));                                         // �ް����ڵ�
        String vaca_areazip = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areazip")));                         // �ް��������ȣ
        String vaca_areaaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areaaddr")));                       // �ް����ּ�
        String vaca_areadtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areadtlsaddr")));               // �ް������ּ�
        String vaca_areabocd = Util.checkString(req.getParameter("vaca_areabocd"));                                     // �ް������������ڵ�
        String bocnfmyn = Util.checkString(req.getParameter("bocnfmyn"));                                               // ����Ȯ��
        String boremk = Util.Uni2Ksc(Util.checkString(req.getParameter("boremk")));                                     // �������
        String vaca_areadlvofficnfmyn = Util.checkString(req.getParameter("vaca_areadlvofficnfmyn"));                   // �ް����������Ȯ��
        String vaca_areadlvoffiremk = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areadlvoffiremk")));         // �ް�������������

        SL_A_VSDM dm = new SL_A_VSDM();

        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setUserflag(userflag);
        dm.setRegdt(regdt);
        dm.setRegno(regno);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setRdrnm(rdrnm);
        dm.setRdrtel_no1(rdrtel_no1);
        dm.setRdrtel_no2(rdrtel_no2);
        dm.setRdrtel_no3(rdrtel_no3);
        dm.setBocd(bocd);
        dm.setDlvzip(dlvzip);
        dm.setDlvaddr(dlvaddr);
        dm.setDlvdtlsaddr(dlvdtlsaddr);
        dm.setQty(qty);
        dm.setAplcpathcd(aplcpathcd);
        dm.setClsfcd(clsfcd);
        dm.setSuspfrdt(suspfrdt);
        dm.setSusptodt(susptodt);
        dm.setBgnmappli(bgnmappli);
        dm.setEndmappli(endmappli);
        dm.setSpcfdlvdt(spcfdlvdt);
        dm.setRemk(remk);
        dm.setRdrptph_no1(rdrptph_no1);
        dm.setRdrptph_no2(rdrptph_no2);
        dm.setRdrptph_no3(rdrptph_no3);
        dm.setVaca_areadlvfrdt(vaca_areadlvfrdt);
        dm.setVaca_areadlvtodt(vaca_areadlvtodt);
        dm.setVaca_arearegncd(vaca_arearegncd);
        dm.setVaca_areacd(vaca_areacd);
        dm.setVaca_areazip(vaca_areazip);
        dm.setVaca_areaaddr(vaca_areaaddr);
        dm.setVaca_areadtlsaddr(vaca_areadtlsaddr);
        dm.setVaca_areabocd(vaca_areabocd);
        dm.setBocnfmyn(bocnfmyn);
        dm.setBoremk(boremk);
        dm.setVaca_areadlvofficnfmyn(vaca_areadlvofficnfmyn);
        dm.setVaca_areadlvoffiremk(vaca_areadlvoffiremk);

        SLReader2400DAO dao = new SLReader2400DAO();
        ds = dao.accessVS(dm);
        req.setAttribute("ds", ds);     // request�� ������� Binding
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader2400EJBHome home = (SLReader2400EJBHome)JNDIManager.getInstance().getHome("SLReader2400EJB");
        try{
            SLReader2400EJB ejb = home.create();
            SL_A_VSDataSet ds = null;
            ds = ejb.accessVS(dm);          // ������ dm������ EJB�� ȣ��
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
}
