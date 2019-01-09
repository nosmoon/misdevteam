/***************************************************************************************************
 * 파일명   : SSCa1300WB.java
 * 기능     : 사이버센터-사이버수당마감
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


public class SSCa1300WB {

    /**
     * 사이버센터-사이버수당마감-마감내역
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAlonClos(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_CYBALON_CLOSPTCRDataSet ds = null;

        // Request Parameter Processing
        String etc1 = Util.checkString(req.getParameter("etc1"));                    //기타1
        String etc2 = Util.checkString(req.getParameter("etc2"));                    //기타2
        String etc3 = Util.checkString(req.getParameter("etc3"));                    //기타3
        String pageno = Util.checkString(req.getParameter("pageno"));                //페이지번호
        String pagesize = Util.checkString(req.getParameter("pagesize"));            //페이지사이즈

        //페이지번호체크
        if(pageno.equals("")) {
        	pageno  =  "1";
        }
        //페이지사이즈체크
        if(pagesize.equals("")) {
        	pagesize  =  "15";
        }

        // DM Setting
        SS_L_CYBALON_CLOSPTCRDM dm = new SS_L_CYBALON_CLOSPTCRDM();

        dm.setEtc1(etc1);                                                            //기타1
        dm.setEtc2(etc2);                                                            //기타2
        dm.setEtc3(etc3);                                                            //기타3
        dm.setPageno(Long.parseLong(pageno));                                        //페이지번호      
        dm.setPagesize(Long.parseLong(pagesize));                                    //페이지사이즈    

        SSCa1300DAO dao = new SSCa1300DAO();
        // DAO 객체의 selectStafpayList 호출
        ds = dao.selectAlonClos(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSCa1300EJBHome home = (SSCa1300EJBHome)JNDIManager.getInstance().getHome("SSCa1300EJB");
        try{
            SSCa1300EJB ejb = home.create();
            ds = ejb.selectAlonClos(dm);
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
     * 사이버센터-사이버수당마감-정산마감및취소
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void accessAlonClos(HttpServletRequest req, HttpServletResponse res) throws AppException{
        CO_A_CYBALONCLOSDataSet ds = null;

        // Session Processing

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));              //처리구분코드(M:마감 , C:취소)
        String closyymm = Util.checkString(req.getParameter("closyymm"));            //정산마감월

        // DM Setting
        CO_A_CYBALONCLOSDM dm = new CO_A_CYBALONCLOSDM();

        dm.setAccflag(accflag);                                                      //처리구분코드(M:마감 , C:취소)
        dm.setClosyymm(closyymm);                                                    //정산마감월
        
        SSCa1300DAO dao = new SSCa1300DAO();
        // DAO 객체의 selectStafpayList 호출
        ds = dao.accessAlonClos(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSCa1300EJBHome home = (SSCa1300EJBHome)JNDIManager.getInstance().getHome("SSCa1300EJB");
        try{
            SSCa1300EJB ejb = home.create();
            ds = ejb.accessAlonClos(dm);
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