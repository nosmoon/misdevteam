/***************************************************************************************************
* ���ϸ� : SSReader1100WB.java
* ��� : ������Ȳ-���ں��� ó���� ���� Worker Bean
* �ۼ����� : 2004-01-12
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.dao.*;

/**
 * ������Ȳ-���ں��� ���� WB
 */

public class SSReader2000WB{

    /**
     * ������Ȳ-���ں���-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void initDsctstat(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_DSCTSTAT_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_RDR_DSCTSTAT_INITDM dm = new SS_L_RDR_DSCTSTAT_INITDM();

        SSReader2000DAO dao = new SSReader2000DAO();
		// DAO ��ü�� selectInitList ȣ��
		ds = dao.initDsctstat(dm);
		req.setAttribute("ds", ds);
    }
    
    public void selectDsctstat(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_RDR_DSCTSTATDataSet ds = null;
    	
        // Request Parameter Processing
    	String deptcd = Util.checkString(req.getParameter("deptcd"));  //�μ��ڵ�
        String partcd = Util.checkString(req.getParameter("partcd"));  //�μ��ڵ�
        String areacd = Util.checkString(req.getParameter("areacd"));  //�����ڵ�
        String bocd = Util.checkString(req.getParameter("bocd"));      //�����ڵ�
        String acpnpathcd = Util.checkString(req.getParameter("acpnpathcd"));  //����ڵ�
        String fromtogb = Util.checkString(req.getParameter("fromtogb"));  //�Ⱓ��������
        String frdt = Util.checkString(req.getParameter("frdt")); //������
        String todt = Util.checkString(req.getParameter("todt")); //������
        String bocnfmyn = Util.checkString(req.getParameter("bocnfmyn"));  //��������Ȯ�λ���
        String boprocyn = Util.checkString(req.getParameter("boprocyn"));  //��������ó������ (Y:ó��, N:��ó��)
        String dscttypecd = Util.checkString(req.getParameter("dscttypecd"));  //�����Ҹ����� �ڵ�
        String medicd = Util.checkString(req.getParameter("medicd"));  //��ü
        String schlevel = Util.checkString(req.getParameter("schlevel"));  //��ȸ����
        String stflev = Util.checkString(req.getParameter("stflev"));  //������
        String schflag = Util.checkString(req.getParameter("schflag"));  //��ȸ����

        // DM Setting    	
    	SS_L_RDR_DSCTSTATDM dm = new SS_L_RDR_DSCTSTATDM();
    	dm.setDeptcd(deptcd);
    	dm.setPartcd(partcd);
    	dm.setAreacd(areacd);    	
    	dm.setBocd(bocd);
    	dm.setAcpnpathcd(acpnpathcd);
    	dm.setFromtogb(fromtogb);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setBocnfmyn(bocnfmyn);
    	dm.setBoprocyn(boprocyn);
    	dm.setDscttypecd(dscttypecd);
    	dm.setMedicd(medicd);
    	dm.setSchlevel(schlevel);
    	dm.setStflev(stflev);
    	dm.setSchflag(schflag);
    	
    	dm.print();

    	SSReader2000DAO dao = new SSReader2000DAO();
        // DAO ��ü�� selectInitList ȣ��
        ds = dao.selectDsctstat(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSReader1700EJBHome home = (SSReader1700EJBHome)JNDIManager.getInstance().getHome("SSReader1700EJB");
        try{
            SSReader1700EJB ejb = home.create();
            ds = ejb.selectList(dm);
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
