/***************************************************************************************************
 * 파일명   : SSCa1100WB.java
 * 기능     : 사이버센터-사이버수당청구
 * 작성일자 : 2005-06-20
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


public class SSCa1100WB {

    /**
     * 사이버센터-사이버수당청구-조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectClamList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_CYBALON_BOCLAMDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);          //사용자

        // Request Parameter Processing
        String closyymm = Util.checkString(req.getParameter("closyymm"));            //청구월
        String deptcd = Util.checkString(req.getParameter("deptcd"));                //부서코드
        String partcd = Util.checkString(req.getParameter("partcd"));                //부서코드
        String areacd = Util.checkString(req.getParameter("areacd"));                //지역코드
        String bocd = Util.checkString(req.getParameter("bocd"));                    //지국지사코드
        String hdqtcnfmyn = Util.checkString(req.getParameter("hdqtcnfmyn"));        //본사담당확인여부
        String pageno = Util.checkString(req.getParameter("pageno"));                //페이지번호
        String pagesize = Util.checkString(req.getParameter("pagesize"));            //페이지사이즈

        // DM Setting
        SS_L_CYBALON_BOCLAMDM dm = new SS_L_CYBALON_BOCLAMDM();

        dm.setClosyymm(closyymm);                                                    //청구월          
        dm.setDeptcd(deptcd);                                                        //부서코드
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);                                                        //지역코드        
        dm.setBocd(bocd);                                                            //지국지사코드    
        dm.setIncmgpers(incmgpers);                                                  //사용자
        dm.setHdqtcnfmyn(hdqtcnfmyn);                                                //본사담당확인여부
        dm.setPageno(Long.parseLong(pageno));                                        //페이지번호      
        dm.setPagesize(Long.parseLong(pagesize));                                    //페이지사이즈
        
        SSCa1100DAO dao = new SSCa1100DAO();
        // DAO 객체의 selectClamList 호출
        ds = dao.selectClamList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSCa1100EJBHome home = (SSCa1100EJBHome)JNDIManager.getInstance().getHome("SSCa1100EJB");
        try{
            SSCa1100EJB ejb = home.create();
            ds = ejb.selectClamList(dm);
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
     * 사이버센터-사이버수당청구-저장
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateCybalon(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_CYBALON_BOCLAMCNFMDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);          //사용자
        
        // Request Parameter Processing
        String listcnt = Util.checkString(req.getParameter("listcnt"));              //조회건수     
        
        if (listcnt.equals(""))   listcnt = "0";
        long   ll_listcnt = Long.parseLong(listcnt);
        
        String closyymm = Util.checkString(req.getParameter("closyymm"));            //청구월
        
        StringBuffer bocdarr       = new StringBuffer("");                           //지국지사코드 Array
        StringBuffer clamtarr      = new StringBuffer("");                           //수금액 Array
        StringBuffer hdqtcnfmynarr = new StringBuffer("");                           //본사확인여부 Array

        //사이버수당청구내역 String Array로 구성
        for (int i=0 ; i < ll_listcnt ; i++) {
            bocdarr.append("##");                                                    //구분자+            
            bocdarr.append(Util.checkString(req.getParameter("bocd"+i)));            //지국지사코드+
            clamtarr.append("##");                                                   //구분자+
            clamtarr.append(Util.checkString(req.getParameter("clamt"+i)));          //수금액+
            hdqtcnfmynarr.append("##");                                              //구분자+
            hdqtcnfmynarr.append(Util.checkString(req.getParameter("hdqtcnfmyn"+i)));//본사확인여부+
        }

        bocdarr.delete(0,2);                                                         //처음 ## 제거
        clamtarr.delete(0,2);                                                        //처음 ## 제거
        hdqtcnfmynarr.delete(0,2);                                                   //처음 ## 제거

        // DM Setting
        SS_A_CYBALON_BOCLAMCNFMDM dm = new SS_A_CYBALON_BOCLAMCNFMDM();

        dm.setIncmgpers(incmgpers);                                                  //사용자
        dm.setListcnt(listcnt);                                                      //조회건수
        dm.setClosyymm(closyymm);                                                    //청구월
        dm.setBocdarr(bocdarr.toString());                                           //지국지사코드 Array
        dm.setClamtarr(clamtarr.toString());                                         //수금액 Array
        dm.setHdqtcnfmynarr(hdqtcnfmynarr.toString());                               //본사확인여부 Array
       
        SSCa1100DAO dao = new SSCa1100DAO();
        // DAO 객체의 updateCybalon 호출
        ds = dao.updateCybalon(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSCa1100EJBHome home = (SSCa1100EJBHome)JNDIManager.getInstance().getHome("SSCa1100EJB");
        try{
            SSCa1100EJB ejb = home.create();
            ds = ejb.updateCybalon(dm);
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