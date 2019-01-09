/***************************************************************************************************
* 파일명 : SSShare1100WB.java
* 기능 : 정보공유-타사발송부수 처리를 위한 Work Bean
* 작성일자 : 2003-12-02
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
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
 * 정보공유-타사발송부수 위한 WB
 *
 */

public class SSShare1100WB{
    /**
     * 정보공유-타사발송부수-조회(리스트)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectOthqtyList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_OTHQTYDataSet ds = null;
        // Request Parameter Processing

        String invsgdt = Util.checkString(req.getParameter("invsgdt"));
        String invsgdt2 = Util.checkString(req.getParameter("invsgdt2"));
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pageno"));
        if( pageno == "") { pageno = "1"; }
        if( pagesize == "") { pagesize = "10"; }

        // DM Setting
        SS_L_OTHQTYDM dm = new SS_L_OTHQTYDM();
        dm.setInvsgdt(invsgdt);
        dm.setInvsgdt2(invsgdt2);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SSShare1100DAO dao = new SSShare1100DAO();
		// DAO 객체의 selectTacomScheList 호출
		ds = dao.selectOthqtyList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSShare1100EJBHome home = (SSShare1100EJBHome) JNDIManager.getInstance().getHome("SSShare1100EJB");
        try {
            SSShare1100EJB ejb = home.create();
            ds = ejb.selectOthqtyList(dm);
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
}

/* 작성시간 : Tue Nov 18 11:50:05 KST 2003 */