/***************************************************************************************************
 * 파일명 : SSCAMP1000WB.java
 * 기능 :
 * 작성일자 : 2005-05-27
 * 작성자 :  이혁
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.camp.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.camp.ds.*;
import chosun.ciis.ss.sls.camp.dm.*;
import chosun.ciis.ss.sls.camp.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 캠페인확장
 */

public class SSCAMP1000WB {


         /**
         * 캠페인확장등록-초기화면
         * @param req HttpServletRequest
         * @param res HttpServletResponse
         * @throws AppException
         **/
        public void init(HttpServletRequest req, HttpServletResponse res) throws AppException {

            SS_L_CAMP_EXTN_INITDataSet ds = null;
            // Request Parameter Processing
            // String XXX = req.getParameter("XXX");
            // DM Setting
            SS_L_CAMP_EXTN_INITDM dm = new SS_L_CAMP_EXTN_INITDM();

            SSCAMP1000DAO dao = new SSCAMP1000DAO();
            // DAO 객체의 init 호출
            ds = dao.init(dm);
            req.setAttribute("ds", ds);
            
            /*
            SSCAMP1000EJBHome home = (SSCAMP1000EJBHome) JNDIManager.getInstance().getHome("SSCAMP1000EJB");
            try {
                SSCAMP1000EJB ejb = home.create();
                ds = ejb.init(dm);
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
           * 캠페인확장-등록
           * @param req HttpServletRequest
           * @param res HttpServletResponse
           * @throws AppException
           **/
          public void saveCampExtn(HttpServletRequest req, HttpServletResponse res) throws AppException {
              SS_I_CAMP_EXTNDataSet ds = null;
              // Session Processing
              String uid = Util.getSessionParameterValue(req, "uid", true);
//              String nm = Util.getSessionParameterValue(req, "emp_nm", true);

              // Request Parameter Processing
              String jobflag = Util.Uni2Ksc(Util.checkString(req.getParameter("jobflag")));
              String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
              String dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dt")));
              String no = Util.Uni2Ksc(Util.checkString(req.getParameter("no")));
              String rshpclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("rshpclsfcd")));
              String aplcpersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersnm")));
              String aplcperstel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no1")));
              String aplcperstel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no2")));
              String aplcperstel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no3")));
              String aplcpersemail = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersemail")));
              String aplcpersptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersptph_no1")));
              String aplcpersptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersptph_no2")));
              String aplcpersptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersptph_no3")));
              String aplcperszip = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperszip")));
              String aplcpersaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersaddr")));
              String aplcpersdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersdtlsaddr")));
              String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
              String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
              String natncd = Util.Uni2Ksc(Util.checkString(req.getParameter("natncd")));
              String rdrtel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no1")));
              String rdrtel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no2")));
              String rdrtel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no3")));
              String rdremail = Util.Uni2Ksc(Util.checkString(req.getParameter("rdremail")));
              String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));
              String rdrptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no2")));
              String rdrptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no3")));
              String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));
              String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));
              String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));
              String movmresiclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("movmresiclsf")));
              String movmresitype = Util.Uni2Ksc(Util.checkString(req.getParameter("movmresitype")));
              String movmdt = Util.Uni2Ksc(Util.checkString(req.getParameter("movmdt")));
              String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
              String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
              String dlvhopedt = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvhopedt")));
              String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
              String bocd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd2")));
              String resiclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("resiclsfcd")));
              String resitypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("resitypecd")));
              String dscttypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("dscttypecd")));
              String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));
              String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont")));
              String clsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("clsfcd")));
              String suspfrdt = Util.Uni2Ksc(Util.checkString(req.getParameter("suspfrdt")));
              String susptodt = Util.Uni2Ksc(Util.checkString(req.getParameter("susptodt")));
              String vaca_arearegncd = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_arearegncd")));
              String vaca_areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areacd")));
              String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
              String cnscnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("cnscnfmyn")));
              String cnscnfmcd = Util.Uni2Ksc(Util.checkString(req.getParameter("cnscnfmcd")));
              String camptypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("type_id")));
              String camp_event_id = Util.Uni2Ksc(Util.checkString(req.getParameter("camp_id")));

              System.out.println("------------------------");
              System.out.println(jobflag);
              System.out.println(accflag);
              System.out.println(dt);
              System.out.println(no);
              System.out.println(rshpclsfcd);
              System.out.println(aplcpersnm);
              System.out.println(aplcperstel_no1);
              System.out.println(aplcperstel_no2);
              System.out.println(aplcperstel_no3);
              System.out.println(aplcpersemail);
              System.out.println(aplcpersptph_no1);
              System.out.println(aplcpersptph_no2);
              System.out.println(aplcpersptph_no3);
              System.out.println(aplcperszip);
              System.out.println(aplcpersaddr);
              System.out.println(aplcpersdtlsaddr);
              System.out.println(rdr_no);
              System.out.println(rdrnm);
              System.out.println(natncd);
              System.out.println(rdrtel_no1);
              System.out.println(rdrtel_no2);
              System.out.println(rdrtel_no3);
              System.out.println(rdremail);
              System.out.println(rdrptph_no1);
              System.out.println(rdrptph_no2);
              System.out.println(rdrptph_no3);
              System.out.println(dlvzip);
              System.out.println(dlvaddr);
              System.out.println(dlvdtlsaddr);
              System.out.println(movmresiclsf);
              System.out.println(movmresitype);
              System.out.println(movmdt);
              System.out.println(medicd);
              System.out.println(qty);
              System.out.println(dlvhopedt);
              System.out.println(bocd);
              System.out.println(bocd2);
              System.out.println(resiclsfcd);
              System.out.println(resitypecd);
              System.out.println(dscttypecd);
              System.out.println(titl);
              System.out.println(cont);
              System.out.println(clsfcd);
              System.out.println(suspfrdt);
              System.out.println(susptodt);
              System.out.println(vaca_arearegncd);
              System.out.println(vaca_areacd);
              System.out.println(remk);
              System.out.println(cnscnfmyn);
              System.out.println(cnscnfmcd);
              System.out.println(camptypecd);
              System.out.println(camp_event_id);
              System.out.println("------------------------");


              // DM Setting
              SS_I_CAMP_EXTNDM dm = new SS_I_CAMP_EXTNDM();
              dm.setJobflag(jobflag);
              dm.setAccflag(accflag);
              dm.setDt(dt);
              dm.setNo(no);
              dm.setRshpclsfcd(rshpclsfcd);
              dm.setAplcpersnm(aplcpersnm);
              dm.setAplcperstel_no1(aplcperstel_no1);
              dm.setAplcperstel_no2(aplcperstel_no2);
              dm.setAplcperstel_no3(aplcperstel_no3);
              dm.setAplcpersemail(aplcpersemail);
              dm.setAplcpersptph_no1(aplcpersptph_no1);
              dm.setAplcpersptph_no2(aplcpersptph_no2);
              dm.setAplcpersptph_no3(aplcpersptph_no3);
              dm.setAplcperszip(aplcperszip);
              dm.setAplcpersaddr(aplcpersaddr);
              dm.setAplcpersdtlsaddr(aplcpersdtlsaddr);
              dm.setRdr_no(rdr_no);
              dm.setRdrnm(rdrnm);
              dm.setNatncd(natncd);
              dm.setRdrtel_no1(rdrtel_no1);
              dm.setRdrtel_no2(rdrtel_no2);
              dm.setRdrtel_no3(rdrtel_no3);
              dm.setRdremail(rdremail);
              dm.setRdrptph_no1(rdrptph_no1);
              dm.setRdrptph_no2(rdrptph_no2);
              dm.setRdrptph_no3(rdrptph_no3);
              dm.setDlvzip(dlvzip);
              dm.setDlvaddr(dlvaddr);
              dm.setDlvdtlsaddr(dlvdtlsaddr);
              dm.setMovmresiclsf(movmresiclsf);
              dm.setMovmresitype(movmresitype);
              dm.setMovmdt(movmdt);
              dm.setMedicd(medicd);
              dm.setQty(qty);
              dm.setDlvhopedt(dlvhopedt);
              dm.setBocd(bocd);
              dm.setBocd2(bocd2);
              dm.setResiclsfcd(resiclsfcd);
              dm.setResitypecd(resitypecd);
              dm.setDscttypecd(dscttypecd);
              dm.setTitl(titl);
              dm.setCont(cont);
              dm.setClsfcd(clsfcd);
              dm.setSuspfrdt(suspfrdt);
              dm.setSusptodt(susptodt);
              dm.setVaca_arearegncd(vaca_arearegncd);
              dm.setVaca_areacd(vaca_areacd);
              dm.setUid(uid);
//              dm.setNm(nm);
              dm.setRemk(remk);
              dm.setCnscnfmyn(cnscnfmyn);
              dm.setCnscnfmcd(cnscnfmcd);
              dm.setCamptypecd(camptypecd);
              dm.setCampid(camp_event_id);
              
              SSCAMP1000DAO dao = new SSCAMP1000DAO();
              // DAO 객체의 init 호출
              ds = dao.saveCampExtn(dm);
              req.setAttribute("ds", ds);

              /*
              SSCAMP1000EJBHome home = (SSCAMP1000EJBHome) JNDIManager.getInstance().getHome("SSCAMP1000EJB");
              try {
                  SSCAMP1000EJB ejb = home.create();
                  ds = ejb.saveCampExtn(dm);
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
         * 캠페인확장등록-캠페인이벤트목록 검색
         * @param req HttpServletRequest
         * @param res HttpServletResponse
         * @throws AppException
         **/

    public void searchCampEventList(HttpServletRequest req, HttpServletResponse res) throws AppException {

            SS_L_CAMP_EVENT_LISTDataSet ds = null;
            // Request Parameter Processing
            // String XXX = req.getParameter("XXX");
            // DM Setting

            String camptypecd = req.getParameter("camp_event_id");
            System.out.println("##################");
            System.out.println(camptypecd);

            SS_L_CAMP_EVENT_LISTDM dm = new SS_L_CAMP_EVENT_LISTDM();
            dm.setCamptypecd(camptypecd);

            SSCAMP1000DAO dao = new SSCAMP1000DAO();
            // DAO 객체의 init 호출
            ds = dao.searchCampEventList(dm);
            req.setAttribute("ds", ds);

            /*
            SSCAMP1000EJBHome home = (SSCAMP1000EJBHome) JNDIManager.getInstance().getHome("SSCAMP1000EJB");

            try {
                SSCAMP1000EJB ejb = home.create();
                ds = ejb.searchCampEventList(dm);
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
