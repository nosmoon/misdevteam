/***************************************************************************************************
 * ���ϸ�   : PSReader1701WB.java
 * ��  ��   : ����-�����Է¸���Ʈ
 * �ۼ����� : 2004-11-29
 * �ۼ���   : ����ǥ
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

public class PSReader1701WB {

    /**
     * ����-�����Է¸���Ʈ
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectTodayInputList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_TODAYINPUT_RDRDataSet ds = null;

        //Session���� ���� ����Ÿ
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //�����ID

        //���������� Request�� ���� �Ķ����
        String asinbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("asinbocd")));                               //���������ڵ�
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));                     //��ü�ڵ�
        String input_fromdt = Util.checkString(req.getParameter("input_fromdt"));
        String input_todt = Util.checkString(req.getParameter("input_todt"));

        String pagenostr = Util.Uni2Ksc(Util.checkString(req.getParameter("curr_page_no")));                        //����������
        if (pagenostr.equals(""))   pagenostr = "1";
        long   pageno = Long.parseLong(pagenostr);
        String pagesizestr = Util.Uni2Ksc(Util.checkString(req.getParameter("records_per_page")));                    //�������� ������ �Ǽ�
        if (pagesizestr.equals(""))   pagesizestr = "15";
        long   pagesize = Long.parseLong(pagesizestr);

        //DM ���� Setting�Ѵ�.
        PS_L_TODAYINPUT_RDRDM dm = new PS_L_TODAYINPUT_RDRDM();

        dm.setCmpycd(cmpycd);
        dm.setAsinbocd(asinbocd);
        dm.setInput_fromdt(input_fromdt);
        dm.setInput_todt(input_todt);
        dm.setMedicd(medicd);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        PSReader1701EJBHome home = (PSReader1701EJBHome) JNDIManager.getInstance().getHome("PSReader1701EJB");
        try {

            PSReader1701EJB ejb = home.create();
            ds = ejb.selectTodayInputList(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);      // request�� ������� ��´�.
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