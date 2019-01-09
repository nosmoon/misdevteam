/***************************************************************************************************
 * ���ϸ�   : PSReader1901WB.java
 * ��  ��   : ����-�����Է¸��
 * �ۼ����� : 2008-07-14
 * �ۼ���   : ������
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

public class PSReader1901WB {

    /**
     * ����-�����Է¸��
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectClamtList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_PBLMCLAMTDataSet ds = null;

        //Session���� ���� ����Ÿ
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                      //ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                         //�����ID

        //���������� Request�� ���� �Ķ����
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));                     //���������ڵ�
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));                 //��ü�ڵ�
        String procdt_to = Util.checkString(req.getParameter("procdt_to"));                         //�Ա�����(����)
        String procdt_fr = Util.checkString(req.getParameter("procdt_fr"));                         //�Ա�����(����)
        String recpmthd = Util.checkString(req.getParameter("recpmthd"));                           //�Աݹ��
        String pagenostr = Util.Uni2Ksc(Util.checkString(req.getParameter("curr_page_no")));        //����������
        if (pagenostr.equals(""))   pagenostr = "1";
        long   pageno = Long.parseLong(pagenostr);
        String pagesizestr = Util.Uni2Ksc(Util.checkString(req.getParameter("records_per_page")));  //�������� ������ �Ǽ�
        if (pagesizestr.equals(""))   pagesizestr = "15";
        long   pagesize = Long.parseLong(pagesizestr);

        //DM ���� Setting�Ѵ�.
        PS_L_PBLMCLAMTDM dm = new PS_L_PBLMCLAMTDM();

        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setMedicd(medicd);
        dm.setProcdt_to(procdt_to);
        dm.setProcdt_fr(procdt_fr);
        dm.setRecpmthd(recpmthd);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        PSReader1901EJBHome home = (PSReader1901EJBHome) JNDIManager.getInstance().getHome("PSReader1901EJB");
        try {

            PSReader1901EJB ejb = home.create();
            ds = ejb.selectClamtList(dm);   // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);     // request�� ������� ��´�.
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
