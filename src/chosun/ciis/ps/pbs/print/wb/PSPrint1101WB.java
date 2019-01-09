/***************************************************************************************************
 * ���ϸ�   : PSprint1101EJBHome.java
 * ���     : ���-���ȭ���� �ڵ尪�� ��ȸ
 * �ۼ����� : 2006-02-01
 * �ۼ���   : ����ǥ
 **************************************************************************************************/
/**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ��  ��   :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.print.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.print.ejb.*;
import chosun.ciis.ps.pbs.print.ds.*;
import chosun.ciis.ps.pbs.print.dm.*;
import chosun.ciis.ps.pbs.print.dao.*;

/**
 * ���-����ʱ�Ŵ�
 */

public class PSPrint1101WB {

    /**
     * ��ȸȭ�鿡 ���Ǵ� �ڵ尪�� �����´�
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_PRINT_INITDataSet ds = null;

        //����� ��������
       String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);        // ȸ���ڵ�
       String incmgpers   = Util.getSessionParameterValue(req, "uid", true);           //�Է��ھ��̵�


        PS_S_PRINT_INITDM dm = new PS_S_PRINT_INITDM(); // DM ���� Setting�Ѵ�.

        dm.setCmpycd(cmpycd); // ���������ڵ�

        PSPrint1101EJBHome home = (PSPrint1101EJBHome) JNDIManager.getInstance().getHome("PSPrint1101EJB");
        try {

            PSPrint1101EJB ejb = home.create();
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

}
