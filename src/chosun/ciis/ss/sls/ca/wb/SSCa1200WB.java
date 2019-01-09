/***************************************************************************************************
 * 파일명   : SSCa1200WB.java
 * 기능     : 사이버센터-사이버수당지급
 * 작성일자 : 2005-06-22
 * 작성자   : 김상옥
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.ca.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.ca.ds.*;
import chosun.ciis.ss.sls.ca.dm.*;
import chosun.ciis.ss.sls.ca.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;


public class SSCa1200WB {

    /**
     * 사이버센터-사이버수당지급-조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectStafpayList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_CYBALON_STAFPAYDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);          //사용자

        // Request Parameter Processing
        String closyymm = Util.checkString(req.getParameter("closyymm"));            //정산마감월
        String selcd = Util.checkString(req.getParameter("selcd"));                  //검색코드
        String selnm = Util.Uni2Ksc(Util.checkString(req.getParameter("selnm")));    //검색어
        String pageno = Util.checkString(req.getParameter("pageno"));                //페이지번호
        String pagesize = Util.checkString(req.getParameter("pagesize"));            //페이지사이즈

        // DM Setting
        SS_L_CYBALON_STAFPAYDM dm = new SS_L_CYBALON_STAFPAYDM();

        dm.setClosyymm(closyymm);                                                    //정산마감월
        dm.setSelcd(selcd);                                                          //검색코드
        dm.setSelnm(selnm);                                                          //검색어
        dm.setIncmgpers(incmgpers);                                                  //사용자
        dm.setPageno(Long.parseLong(pageno));                                        //페이지번호      
        dm.setPagesize(Long.parseLong(pagesize));                                    //페이지사이즈    

        SSCa1200DAO dao = new SSCa1200DAO();
        // DAO 객체의 selectStafpayList 호출
        ds = dao.selectStafpayList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSCa1200EJBHome home = (SSCa1200EJBHome)JNDIManager.getInstance().getHome("SSCa1200EJB");
        try{
            SSCa1200EJB ejb = home.create();
            ds = ejb.selectStafpayList(dm);
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

    /**
     * 사이버센터-사이버수당지급-DOWNLOAD
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectDownloadList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_P_CYBALON_STAFPAYDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);          //사용자

        // Request Parameter Processing
        String closyymm = Util.checkString(req.getParameter("closyymm"));            //정산마감월
        String selcd = Util.checkString(req.getParameter("selcd"));                  //검색코드
        String selnm = Util.Uni2Ksc(Util.checkString(req.getParameter("selnm")));    //검색어

        // DM Setting
        SS_P_CYBALON_STAFPAYDM dm = new SS_P_CYBALON_STAFPAYDM();

        dm.setClosyymm(closyymm);                                                    //정산마감월
        dm.setSelcd(selcd);                                                          //검색코드
        dm.setSelnm(selnm);                                                          //검색어
        dm.setIncmgpers(incmgpers);                                                  //사용자

        SSCa1200DAO dao = new SSCa1200DAO();
        // DAO 객체의 selectStafpayList 호출
        ds = dao.selectDownloadList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSCa1200EJBHome home = (SSCa1200EJBHome)JNDIManager.getInstance().getHome("SSCa1200EJB");
        try{
            SSCa1200EJB ejb = home.create();
            ds = ejb.selectDownloadList(dm);
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