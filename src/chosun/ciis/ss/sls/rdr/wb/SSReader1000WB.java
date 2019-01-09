/***************************************************************************************************
* ���ϸ� : SSReader1000WB.java
* ��� : ������Ȳ-�������� ó���� ���� Worker Bean
* �ۼ����� : 2003-12-26
* �ۼ��� : ��뼷
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
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ������Ȳ-���������� ���� WB
 */

public class SSReader1000WB{

    /**
     * ������Ȳ-��������-���ڰ˻� ���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectRdrSrchList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_RDR_SRCHDataSet ds = null;
        // Request Parameter Processing
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
        String rdrtel_no1 = Util.checkString(req.getParameter("rdrtel_no1"));
        String rdrtel_no2 = Util.checkString(req.getParameter("rdrtel_no2"));
        String rdrtel_no3 = Util.checkString(req.getParameter("rdrtel_no3"));
        String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));
        String onlmembid = Util.Uni2Ksc(Util.checkString(req.getParameter("onlmembid")));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_RDR_SRCHDM dm = new SS_L_RDR_SRCHDM();
        dm.setRdr_no(rdr_no);
        dm.setRdrnm(rdrnm);
        dm.setRdrtel_no1(rdrtel_no1);
        dm.setRdrtel_no2(rdrtel_no2);
        dm.setRdrtel_no3(rdrtel_no3);
        dm.setAddr3(addr3);
        dm.setOnlmembid(onlmembid);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        SSReader1000DAO dao = new SSReader1000DAO();
        // DAO ��ü�� selectRdrSrchList ȣ��
        ds = dao.selectRdrSrchList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSReader1000EJBHome home = (SSReader1000EJBHome) JNDIManager.getInstance().getHome("SSReader1000EJB");
        try {
            SSReader1000EJB ejb = home.create();
            ds = ejb.selectRdrSrchList(dm);
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

    // �����̷��� ��������ȭ������ ��ü
}