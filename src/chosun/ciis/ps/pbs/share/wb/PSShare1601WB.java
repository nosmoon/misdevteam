/***************************************************************************************************
 * ���ϸ� : PSShare1601WB.java
 * ��� : ��������-�޷� ó���� ���� Work Bean
 * �ۼ����� : 2004-03-08
 * �ۼ��� : ����ǥ
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/
package chosun.ciis.ps.pbs.share.wb;

import javax.ejb.*;
import java.rmi.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ps.pbs.share.ds.*;
import chosun.ciis.ps.pbs.share.dm.*;
import chosun.ciis.ps.pbs.share.dao.*;
import chosun.ciis.ps.pbs.share.ejb.*;

/**
 * ��������-�޷� ó�� ���� WB
 *
 */

public class PSShare1601WB {

    /**
     * ��������-�޷�-��ȸ(����Ʈ)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectMonthScheList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_MONTH_SCHEDataSet ds = null;

        // Request Parameter Processing
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); 	//����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); 	//�Է��ھ��̵�

        String change_year = Util.checkString(req.getParameter("change_year"));		//�����
        String change_month = Util.checkString(req.getParameter("change_month"));	//�����

        //�޷°�ü ����
        Calendar myCalendar = Calendar.getInstance();

        int year = 0;
        int month = 0;

        if (change_year == null || change_year.equals("")) {
            year = myCalendar.get(myCalendar.YEAR);
            change_year = Integer.toString(year);
        }

        if (change_month == null || change_month.equals("")) {
            month = myCalendar.get(myCalendar.MONTH);
            month = month + 1;
            change_month = Integer.toString(month);
        }
        change_month = Util.addZero(change_month, 2);

        String yyyymm = change_year + change_month;
        // DM Setting
        PS_L_MONTH_SCHEDM dm = new PS_L_MONTH_SCHEDM();

        dm.setDeptcd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setYyyymm(yyyymm);

        PSShare1601EJBHome home = (PSShare1601EJBHome) JNDIManager.getInstance().getHome("PSShare1601EJB");
        try {
            PSShare1601EJB ejb = home.create();
            ds = ejb.selectMonthScheList(dm);
            req.setAttribute("ds", ds);
            req.setAttribute("change_year", change_year);
            req.setAttribute("change_month", change_month);
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
     * ��������-�޷�-�󼼺���
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectDayScheDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_DAY_SCHEDataSet ds = null;

        // Request Parameter Processing
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //����ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //�Է��ھ��̵�

        String yyyymmdd = Util.checkString(req.getParameter("select_day"));

        // DM Setting
        PS_L_DAY_SCHEDM dm = new PS_L_DAY_SCHEDM();
        dm.setDeptcd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setYyyymmdd(yyyymmdd);

        PSShare1601EJBHome home = (PSShare1601EJBHome) JNDIManager.getInstance().getHome("PSShare1601EJB");
        try {
            PSShare1601EJB ejb = home.create();
            ds = ejb.selectDayScheDetail(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
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
