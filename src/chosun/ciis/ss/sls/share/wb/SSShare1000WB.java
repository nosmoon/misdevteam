/***************************************************************************************************
* ���ϸ� : SSShare1000WB.java
* ��� : ��������-���� ó���� ���� Work Bean
* �ۼ����� : 2003-11-19
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/
package chosun.ciis.ss.sls.share.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.dao.*;

/**
 * ��������-���� ���� WB
 *
 */

public class SSShare1000WB{
    /**
     * ��������-����-�ʱ�ȭ��
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
       CO_L_SCHE_INITDataSet ds = null;
       CO_L_SCHE_INITDM dm = new CO_L_SCHE_INITDM();
       
       SSShare1000DAO dao = new SSShare1000DAO();
       // DAO ��ü�� init ȣ��
       ds = dao.selectInitList(dm);
       req.setAttribute("ds", ds); // request�� ������� ��´�.
       
       /*
       SSShare1000EJBHome home = (SSShare1000EJBHome)JNDIManager.getInstance().getHome("SSShare1000EJB");
       try{
          SSShare1000EJB ejb = home.create();
          ds = ejb.selectInitList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
          req.setAttribute("ds", ds); // request�� ������� ��´�.
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
	 * ��������-����-��ȸ(����Ʈ)
	 * @param HttpServletRequest req
	 * @param HttpServletResponse res
	 **/

	public void selectTacomScheList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        CO_L_SCHEDataSet ds = null;
        // Request Parameter Processing
        String jobcd = Util.getSessionParameterValue(req, "jobcd", true); 	            //���������ڵ�
        String uid = Util.getSessionParameterValue(req, "uid", true); 	                //�Է��ھ��̵�
        String deptcd = Util.getSessionParameterValue(req, "selldeptcd", true);         //�Ǹźμ��ڵ�(�Ҽ�)

        String schemangunitcd = Util.checkString(req.getParameter("schemangunitcd"));//���������ڵ�
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        // DM Setting
        CO_L_SCHEDM dm = new CO_L_SCHEDM();
        dm.setSchemangunitcd(schemangunitcd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setDeptcd(deptcd);
        dm.setUse_pers(uid);
        dm.setUse_persclsf(jobcd);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SSShare1000DAO dao = new SSShare1000DAO();
		// DAO ��ü�� selectTacomScheList ȣ��
		ds = dao.selectTacomScheList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSShare1000EJBHome home = (SSShare1000EJBHome) JNDIManager.getInstance().getHome("SSShare1000EJB");
        try {
            SSShare1000EJB ejb = home.create();
            ds = ejb.selectTacomScheList(dm);
            req.setAttribute("ds", ds);
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
	 * ��������-����-�󼼺���
	 * @param HttpServletRequest req
	 * @param HttpServletResponse res
	 **/

	public void selectTacomScheDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        CO_S_SCHEDataSet ds = null;
        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        // DM Setting
        CO_S_SCHEDM dm = new CO_S_SCHEDM();
        dm.setSeq(Long.parseLong(seq));
        
        SSShare1000DAO dao = new SSShare1000DAO();
		// DAO ��ü�� selectTacomScheDetail ȣ��
		ds = dao.selectTacomScheDetail(dm);
		req.setAttribute("ds", ds); // request�� ������� ��´�.
		
		/*
        SSShare1000EJBHome home = (SSShare1000EJBHome) JNDIManager.getInstance().getHome("SSShare1000EJB");
        try {
            SSShare1000EJB ejb = home.create();
            ds = ejb.selectTacomScheDetail(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
	 * ��������-����-����(���)
	 * @param HttpServletRequest req
	 * @param HttpServletResponse res
	 **/

	public void accessTacomSche(HttpServletRequest req, HttpServletResponse res) throws AppException{
        CO_A_SCHEDataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request�� ��ȯ�� String Type �����
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        String deptcd = Util.getSessionParameterValue(req, "selldeptcd", false);    //�Ҽ� �Ǹźμ��ڵ�
        String deptnm = Util.getSessionParameterValue(req, "selldeptnm", false);    //�Ҽ� �Ǹźμ���
        String use_pers = Util.getSessionParameterValue(req, "uid", true);         //�����ID
        String use_persclsf = Util.getSessionParameterValue(req, "jobcd", false);   //����ڱ���(�۾�����)
        String empnm = Util.Uni2Ksc(Util.getSessionParameterValue(req, "emp_nm", false));         //����ڸ�

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String seq = Util.checkString(req.getParameter("seq"));
        String schemangitemcd = Util.checkString(req.getParameter("schemangitemcd"));
        String schemangunitcd = Util.checkString(req.getParameter("schemangunitcd"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));

        // DM Setting
        CO_A_SCHEDM dm = new CO_A_SCHEDM();

        dm.setAccflag(accflag);
        // �Ϸù�ȣ ����
        if(!"I".equals(accflag)){ // ����� �ƴѰ�쿡�� �Ϸù�ȣ ����
            dm.setSeq(Long.parseLong(seq));
        }
        dm.setSchemangitemcd(schemangitemcd);
        dm.setSchemangunitcd(schemangunitcd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setRemk(remk);
        dm.setDeptcd(deptcd);
        dm.setDeptnm(deptnm);
        dm.setUse_pers(use_pers);
        dm.setUse_persclsf(use_persclsf);
        dm.setEmpnm(empnm);
        dm.setIncmgpers(incmgpers);

        SSShare1000DAO dao = new SSShare1000DAO();
		// DAO ��ü�� accessTacomSche ȣ��
        bResult = dao.accessTacomSche(dm);
		if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";
         }
         req.setAttribute("result", sResult); // request�� ������� ��´�.
		
         /*
        SSShare1000EJBHome home = (SSShare1000EJBHome) JNDIManager.getInstance().getHome("SSShare1000EJB");
        try {
            SSShare1000EJB ejb = home.create();
            bResult = ejb.accessTacomSche(dm);
            if(bResult == true){ // ���������� �Էµ� ���
               sResult = "true";
            }
            req.setAttribute("result", sResult); // request�� ������� ��´�.
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
}

/* �ۼ��ð� : Tue Nov 18 11:50:05 KST 2003 */