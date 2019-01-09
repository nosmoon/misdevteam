/***************************************************************************************************
* 파일명 : SSBrmgr1800WB.java
* 기능 : 지국경영-아파트투입률을 위한 Worker Bean
* 작성일자 : 2004-11-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.wb;

import javax.ejb.*;
import java.util.*;				//추가
import java.lang.*;				//추가
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국경영-아파트투입률을 위한 WB
 */

public class SSBrmgr1800WB{

    /**
     * 지국경영-아파트투입률-초기화면(아파트)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initApt(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_NWBUSEOCDDataSet ds = null;
        // DM Setting
        SS_L_NWBUSEOCDDM dm = new SS_L_NWBUSEOCDDM();

        SSBrmgr1800DAO dao = new SSBrmgr1800DAO();
		// DAO 객체의 initApt 호출
		ds = dao.initApt(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSBrmgr1800EJBHome home = (SSBrmgr1800EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1800EJB");
        try{
            SSBrmgr1800EJB ejb = home.create();
            ds = ejb.initApt(dm);
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
     * 지국경영-아파트투입률-아파트목록(조사지 인쇄 1853)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAptAddrList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SL_L_APTLISTDataSet ds = null;

        //request process
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));

        SL_L_APTLISTDM dm = new SL_L_APTLISTDM();
        dm.setBocd(bocd);

        //SSBrmgr1800EJBHome home = (SSBrmgr1800EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1800EJB");

        SSBrmgr1800DAO dao = new SSBrmgr1800DAO();
        // DAO 객체의 selectAptList 호출
        ds = dao.selectAptAddrList(dm);
        req.setAttribute("ds", ds);
        
        /*
        try{
            SSBrmgr1800EJB ejb = home.create();
            ds = ejb.selectAptAddrList(dm);
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
     * 지국경영-아파트투입률-목록(아파트)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAptList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_APTDataSet ds = null;

        //request process
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
        String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "10" : pagesize;

        SS_L_APTDM dm = new SS_L_APTDM();
        dm.setBocd(bocd);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        //SSBrmgr1800EJBHome home = (SSBrmgr1800EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1800EJB");

        SSBrmgr1800DAO dao = new SSBrmgr1800DAO();
        // DAO 객체의 selectAptList 호출
        ds = dao.selectAptList(dm);
        req.setAttribute("ds", ds);
        
        /*
        try{
            SSBrmgr1800EJB ejb = home.create();
            ds = ejb.selectAptList(dm);
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
     * 아파트투입현황(조회)
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @throws AppException
     **/
    public void selectThrwList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_COMM_APT_THRWDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
//        String bocd = Util.getSessionParameterValue(req, "bocd", true);    				//지국지사코드

        String bocd = Util.checkString(req.getParameter("bocd"));   //지국지사코드
        String pageno = Util.checkString(req.getParameter("curr_page_no"));				//페이지번호
        String pagesize = Util.checkString(req.getParameter("records_per_page"));		//페이지사이즈
        String invsgdt1 = Util.checkString(req.getParameter("invsgdt1"));				//조사일자1
        String invsgdt2 = Util.checkString(req.getParameter("invsgdt2"));				//조사일자2
        String addrcd = Util.checkString(req.getParameter("addrcd"));					//주소코드
        String jobcdset = Util.checkString(req.getParameter("jobcdset"));					//업무환경구분

        SS_L_COMM_APT_THRWDM dm = new SS_L_COMM_APT_THRWDM();

        pageno = ("".equals(pageno)) ? "1" : pageno; // 'pageno'가 Null일경우 1을 반환
        pagesize = ("".equals(pagesize)) ? "5" : pagesize; // 'pagesize'가 Null일경우 20을 반환

        dm.setBocd(bocd);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));
        dm.setInvsgdt1(invsgdt1);
        dm.setInvsgdt2(invsgdt2);
        dm.setAddrcd(addrcd);
        dm.setJobcdset(jobcdset);

        /*
        System.out.println(bocd);
        System.out.println(invsgdt1);
        System.out.println(invsgdt2);
        System.out.println(addrcd);
        */

        SSBrmgr1800DAO dao = new SSBrmgr1800DAO();
        ds = dao.selectThrwList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SSBrmgr1800EJBHome home = (SSBrmgr1800EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1800EJB");
        try{
            SSBrmgr1800EJB ejb = home.create();
            SS_L_COMM_APT_THRWDataSet ds = null;
            ds = ejb.selectThrwList(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
      * 아파트투입현황(상세보기)
      * 조회된 request값을 set한다.
      * @param HttpServletRequest req
      * @param HttpServletResponse res
      * @throws AppException
      **/
     public void selectThrwDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	 SL_S_COMM_APT_THRWDataSet ds = null;
         // parameter requesting 하고  DM에 값을 Setting
//         String bocd = Util.getSessionParameterValue(req, "bocd", true);    				//지국지사코드
         String bocd = Util.checkString(req.getParameter("bocd"));   //지국지사코드
         String invsgdt = Util.checkString(req.getParameter("invsgdt"));					//조사일자
         String invsgno = Util.checkString(req.getParameter("invsgno"));					//조사번호
         String addrcd = Util.checkString(req.getParameter("addrcd"));					//주소코드
         String dongno = Util.Uni2Ksc(Util.Uni2Ksc(Util.checkString(req.getParameter("dongno"))));					//동번호
         String regdt  = Util.checkString(req.getParameter("regdt"));					//등록일자

         SL_S_COMM_APT_THRWDM dm = new SL_S_COMM_APT_THRWDM();

         dm.setBocd(bocd);
         dm.setInvsgdt(invsgdt);
         dm.setInvsgno(invsgno);
         dm.setAddrcd(addrcd);
         dm.setDongno(dongno);
         dm.setRegdt(regdt);

//         System.out.println( "dongno: " + dongno );
//         System.out.println( "dongno2 : " + Util.Uni2Ksc(dongno) );

         SSBrmgr1800DAO dao = new SSBrmgr1800DAO();
         ds = dao.selectThrwDetail(dm);
         req.setAttribute("ds", ds); // request에 결과값을 Binding
         
         /*
         // JNDI lookup 을 통해 EJB Home interface 객체생성
         SSBrmgr1800EJBHome home = (SSBrmgr1800EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1800EJB");
         try{
             SSBrmgr1800EJB ejb = home.create();
             SL_S_COMM_APT_THRWDataSet ds = null;
             ds = ejb.selectThrwDetail(dm); // 설정된 dm값으로 EJB를 호출
             req.setAttribute("ds", ds); // request에 결과값을 Binding
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
      * 아파트투입현황(상세보기)
      * 조회된 request값을 set한다.
      * @param HttpServletRequest req
      * @param HttpServletResponse res
      * @throws AppException
      **/
     public void selectAptinfo(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	 SL_S_COMM_APT_STRUCTDataSet ds = null;
         // parameter requesting 하고  DM에 값을 Setting
//         String bocd = Util.getSessionParameterValue(req, "bocd", true);    				//지국지사코드
         String bocd = Util.checkString(req.getParameter("bocd"));                          //지국지사코드
         String invsgdt = Util.checkString(req.getParameter("invsgdt"));					//조사일자
         String invsgno = Util.checkString(req.getParameter("invsgno"));					//조사번호
         String addrcd = Util.checkString(req.getParameter("addrcd"));					    //주소코드
         String dongno = Util.Uni2Ksc(Util.checkString(req.getParameter("dongno")));					    //동번호

         SL_S_COMM_APT_STRUCTDM dm = new SL_S_COMM_APT_STRUCTDM();

         dm.setBocd(bocd);
         dm.setInvsgdt(invsgdt);
         dm.setInvsgno(invsgno);
         dm.setAddrcd(addrcd);
         dm.setDongno(dongno);

         /*
         System.out.println("-------------");
         System.out.println( bocd );
         System.out.println( invsgdt );
         System.out.println( invsgno );
         System.out.println( addrcd );
         System.out.println( dongno );
         System.out.println("-------------");
         */

         
         SSBrmgr1800DAO dao = new SSBrmgr1800DAO();
         ds = dao.selectAptinfo(dm);
         req.setAttribute("ds", ds); // request에 결과값을 Binding
         
         /*
         // JNDI lookup 을 통해 EJB Home interface 객체생성
         SSBrmgr1800EJBHome home = (SSBrmgr1800EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1800EJB");
         try{
             SSBrmgr1800EJB ejb = home.create();
             SL_S_COMM_APT_STRUCTDataSet ds = null;
             ds = ejb.selectAptinfo(dm); // 설정된 dm값으로 EJB를 호출
             req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 아파트투입현황(상세보기)
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @throws AppException
     **/
    public void selectAptQuickSearch(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_S_COMM_APT_QSEARCHDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
//        String bocd = Util.checkString(req.getParameter("bocd"));                       //지국지사코드
//        String invsgdt = Util.checkString(req.getParameter("invsgdt"));					//조사일자
//        String invsgno = Util.checkString(req.getParameter("invsgno"));					//조사번호
//        String addrcd = Util.checkString(req.getParameter("addrcd"));					//주소코드
//        String dongno = Util.Uni2Ksc(Util.checkString(req.getParameter("dongno")));		//동번호
        String qsearch = Util.Uni2Ksc(Util.checkString(req.getParameter("qsearch")));   //바로가기

        SL_S_COMM_APT_QSEARCHDM dm = new SL_S_COMM_APT_QSEARCHDM();

//        dm.setBocd(bocd);
//        dm.setInvsgdt(invsgdt);
//        dm.setInvsgno(invsgno);
//        dm.setAddrcd(addrcd);
//        dm.setDongno(dongno);
        dm.setQsearch(qsearch);

        SSBrmgr1800DAO dao = new SSBrmgr1800DAO();
        ds = dao.selectAptQuickSearch(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SSBrmgr1800EJBHome home = (SSBrmgr1800EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1800EJB");
        try{
            SSBrmgr1800EJB ejb = home.create();
            SL_S_COMM_APT_QSEARCHDataSet ds = null;
            ds = ejb.selectAptQuickSearch(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
      * 아파트투입현황-활동사항 (조회,수정,삭제)
      * 조회된 request값을 set한다.
      * @param HttpServletRequest req
      * @param HttpServletResponse res
      * @throws AppException
      **/
     public void accessActMemo(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	 SS_A_ACTMEMODataSet ds = null;
         // parameter requesting 하고  DM에 값을 Setting
         String accflag = Util.checkString(req.getParameter("accflag"));				//조사일자
         String invsgdt = Util.checkString(req.getParameter("invsgdt"));				//조사일자
         String invsgno = Util.checkString(req.getParameter("invsgno"));				//조사번호
         String addrcd = Util.checkString(req.getParameter("addrcd"));					//주소코드
         String dongno = Util.Uni2Ksc(Util.checkString(req.getParameter("dongno")));					//동번호
         String actmemo = Util.Uni2Ksc(Util.checkString(req.getParameter("actmemo")));				//활동사항

         SS_A_ACTMEMODM dm = new SS_A_ACTMEMODM();


         dm.setAccflag(accflag);
         dm.setInvsgdt(invsgdt);
         dm.setInvsgno(invsgno);
         dm.setAddrcd(addrcd);
         dm.setDongno(dongno);
         dm.setActmemo(actmemo);


         /*
         System.out.println("-------------");
         System.out.println( accflag );
         System.out.println( invsgdt );
         System.out.println( invsgno );
         System.out.println( addrcd );
         System.out.println( dongno );
         System.out.println( actmemo );
         System.out.println("-------------");
         */

         SSBrmgr1800DAO dao = new SSBrmgr1800DAO();
         ds = dao.accessActMemo(dm);
         req.setAttribute("ds", ds); // request에 결과값을 Binding
         
         /*
         // JNDI lookup 을 통해 EJB Home interface 객체생성
         SSBrmgr1800EJBHome home = (SSBrmgr1800EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1800EJB");
         try{
             SSBrmgr1800EJB ejb = home.create();
             SS_A_ACTMEMODataSet ds = null;
             ds = ejb.accessActMemo(dm); // 설정된 dm값으로 EJB를 호출
             req.setAttribute("ds", ds); // request에 결과값을 Binding
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
      * 아파트투입현황(동 리스트)
      * 조회된 request값을 set한다.
      * @param HttpServletRequest req
      * @param HttpServletResponse res
      * @throws AppException
      **/
     public void selectDongList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	 SL_L_COMM_APT_DONGNODataSet ds = null;
         // parameter requesting 하고  DM에 값을 Setting
//         String bocd = Util.getSessionParameterValue(req, "bocd", true);    				//지국지사코드

         String bocd = Util.checkString(req.getParameter("bocd"));   //지국지사코드
         String addrcd = Util.checkString(req.getParameter("addrcd"));					//주소코드

         SL_L_COMM_APT_DONGNODM dm = new SL_L_COMM_APT_DONGNODM();

         dm.setBocd(bocd);
         dm.setAddrcd(addrcd);

         SSBrmgr1800DAO dao = new SSBrmgr1800DAO();
         ds = dao.selectDongList(dm);
         req.setAttribute("ds", ds); // request에 결과값을 Binding
         
         /*
         // JNDI lookup 을 통해 EJB Home interface 객체생성
         SSBrmgr1800EJBHome home = (SSBrmgr1800EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1800EJB");
         try{
             SSBrmgr1800EJB ejb = home.create();
             SL_L_COMM_APT_DONGNODataSet ds = null;
             ds = ejb.selectDongList(dm); // 설정된 dm값으로 EJB를 호출
             req.setAttribute("ds", ds); // request에 결과값을 Binding
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
      * 아파트투입현황(동 리스트)
      * 조회된 request값을 set한다.
      * @param HttpServletRequest req
      * @param HttpServletResponse res
      * @throws AppException
      **/
     public void selectAddrToAptList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	 SS_L_ADDR_TO_APTDataSet ds = null;
         // parameter requesting 하고  DM에 값을 Setting
         String bocd = Util.checkString(req.getParameter("bocd"));					//지국지사코드
         String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));	//동명
         String zip = Util.checkString(req.getParameter("zip"));						//우편번호
         String pageno = Util.checkString(req.getParameter("pageno"));				//현재 페이지
         String pagesize = Util.checkString(req.getParameter("pagesize"));			//페이지사이즈

         SS_L_ADDR_TO_APTDM dm = new SS_L_ADDR_TO_APTDM();
         dm.setBocd(bocd); // 지국지사코드
         dm.setZip(zip);
         dm.setAddr3(addr3);
         dm.setPageno(Long.parseLong(pageno));
         dm.setPagesize(Long.parseLong(pagesize));

         SSBrmgr1800DAO dao = new SSBrmgr1800DAO();
         ds = dao.selectAddrToAptList(dm);
         req.setAttribute("ds", ds); // request에 결과값을 Binding
         
         /*
         // JNDI lookup 을 통해 EJB Home interface 객체생성
         SSBrmgr1800EJBHome home = (SSBrmgr1800EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1800EJB");
         try{
             SSBrmgr1800EJB ejb = home.create();
             SS_L_ADDR_TO_APTDataSet ds = null;
             ds = ejb.selectAddrToAptList(dm); // 설정된 dm값으로 EJB를 호출
             req.setAttribute("ds", ds); // request에 결과값을 Binding
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
       * 현금출납부관리(직원검색)
       * 조회된 request값을 set한다.
       * @param HttpServletRequest req
       * @param HttpServletResponse res
       * @throws AppException
       * @throws SysException
       * @return void
       **/
      public void selectBoempList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
    	  SL_L_BOEMPDataSet ds = null;
          // parameter requesting 하고  DM에 값을 Setting
//           String bocd = Util.getSessionParameterValue(req, "bocd", true);                    //지국지사코드

           String bocd = Util.checkString(req.getParameter("bocd"));   //지국지사코드
           String empcode = Util.checkString(req.getParameter("boemp_no"));                   //직원코드
           String empname = Util.Uni2Ksc(Util.checkString(req.getParameter("boemp_nm")));     //직원이름
           //String dutycd = Util.checkString(req.getParameter("dutycd"));                    //직책
           String pageno = Util.checkString(req.getParameter("pageno"));                		//페이지번호
           String pagesize = Util.checkString(req.getParameter("pagesize"));          		//페이지사이즈

           SL_L_BOEMPDM dm = new SL_L_BOEMPDM();

           pageno = ("".equals(pageno)) ? "1" : pageno; // 'pageno'가 Null일경우 1을 반환
           pagesize = ("".equals(pagesize)) ? "10" : pagesize; // 'pagesize'가 Null일경우 20을 반환

           dm.setBocd(bocd);
           //dm.setBocd("12345");
           dm.setEmpcode(empcode);
           dm.setEmpname(empname);
           dm.setDutycd("");
           dm.setPageno(Long.parseLong(pageno));
           dm.setPagesize(Long.parseLong(pagesize));

           SSBrmgr1800DAO dao = new SSBrmgr1800DAO();
           ds = dao.selectBoempList(dm);
           req.setAttribute("ds", ds); // request에 결과값을 Binding
           
           /*
           // JNDI lookup 을 통해 EJB Home interface 객체생성
           SSBrmgr1800EJBHome home = (SSBrmgr1800EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1800EJB");
           try{
               SSBrmgr1800EJB ejb = home.create();
               SL_L_BOEMPDataSet ds = null;
               ds = ejb.selectBoempList(dm); // 설정된 dm값으로 EJB를 호출
               req.setAttribute("ds", ds); // request에 결과값을 Binding
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
      * 아파트투입현황(매체약어 리스트)
      * 조회된 request값을 set한다.
      * @param HttpServletRequest req
      * @param HttpServletResponse res
      * @throws AppException
      **/
     public void selectMediyList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	 SL_L_COMM_MEDIYNMDataSet ds = null;
         SL_L_COMM_MEDIYNMDM dm = new SL_L_COMM_MEDIYNMDM();

         SSBrmgr1800DAO dao = new SSBrmgr1800DAO();
         ds = dao.selectMediyList(dm);
         req.setAttribute("ds", ds); // request에 결과값을 Binding
         
         /*
         // JNDI lookup 을 통해 EJB Home interface 객체생성
         SSBrmgr1800EJBHome home = (SSBrmgr1800EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1800EJB");
         try{
             SSBrmgr1800EJB ejb = home.create();
             SL_L_COMM_MEDIYNMDataSet ds = null;
             ds = ejb.selectMediyList(dm); // 설정된 dm값으로 EJB를 호출
             req.setAttribute("ds", ds); // request에 결과값을 Binding
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
      * 아파트투입현황(상세보기)
      * 조회된 request값을 set한다.
      * @param HttpServletRequest req
      * @param HttpServletResponse res
      * @throws AppException
      **/
     public void accessThrw(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	 SL_A_COMM_APT_THRWDataSet ds = null;
         // parameter requesting 하고  DM에 값을 Setting
//         String bocd = Util.getSessionParameterValue(req, "bocd", true);    					//지국지사코드

         String bocd = Util.checkString(req.getParameter("bocd"));                          //지국지사코드
         String accflag = Util.checkString(req.getParameter("accflag"));						//등록,수정flag
         String hmflag = Util.checkString(req.getParameter("hmflag"));						//호별,매체별flag
         String zip = Util.checkString(req.getParameter("zip"));								//우편번호
         String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));				//주소
         String addrcd = Util.checkString(req.getParameter("addrcd"));						//주소코드
         String dongno = Util.Uni2Ksc(Util.checkString(req.getParameter("dongno")));						//동번호
         String pyong1 = Util.checkString(req.getParameter("pyong1"));						//평수1
         String hoscnt1 = Util.checkString(req.getParameter("hoscnt1"));						//세대수1
         String pyong2 = Util.checkString(req.getParameter("pyong2"));						//평수2
         String hoscnt2 = Util.checkString(req.getParameter("hoscnt2"));						//세대수2
         String pyong3 = Util.checkString(req.getParameter("pyong3"));						//평수3
         String hoscnt3 = Util.checkString(req.getParameter("hoscnt3"));						//세대수3
         String invsgdt = Util.checkString(req.getParameter("invsgdt"));						//조사일자
         String invsgno = Util.checkString(req.getParameter("invsgno"));						//조사번호
         String invsghhmm = Util.checkString(req.getParameter("invsghhmm"));					//조사시간
         String invsgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgpers")));	//조사자명
         String housval = Util.checkString(req.getParameter("housval"));						//층,호,매체문자열
         String incmgpers = Util.getSessionParameterValue(req, "uid", true);					//입력자
         String medicd = Util.checkString(req.getParameter("medicd"));						//매체코드
         String qty = Util.checkString(req.getParameter("qty"));								//부수
         String qtyratio = Util.checkString(req.getParameter("qtyratio"));					//투입율
         String bgndlvtm = Util.checkString(req.getParameter("bgndlvtm"));					//배달시작시간
         String enddlvtm = Util.checkString(req.getParameter("enddlvtm"));					//배달종료시간
         String dlvstatcd = Util.checkString(req.getParameter("dlvstatcd"));					//배달상태코드
         String leaffeednosh = Util.checkString(req.getParameter("leaffeednosh"));			//전단삽지매수

         String dlvstatcd1 = Util.checkString(req.getParameter("dlvstatcd1"));
         String dlvstatcd2 = Util.checkString(req.getParameter("dlvstatcd2"));
         String dlvstatcd3 = Util.checkString(req.getParameter("dlvstatcd3"));
         String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
         String regtype1 = Util.checkString(req.getParameter("regtype1"));
         String regtype2 = Util.checkString(req.getParameter("regtype2"));
         String regdt = Util.checkString(req.getParameter("regdt"));


         String paramName = null;
         String paramVal = null;
         String paramString = "";
         String tempName = "";
         String tempVal = "";

         //평수가 복합일경우 분리한다.
         if(!"".equals(pyong1)) {
             StringTokenizer st = new StringTokenizer(pyong1, "/");
             pyong1 = st.nextToken();
             if(st.hasMoreTokens()){
                 pyong2 = st.nextToken();
             }
             if(st.hasMoreTokens()){
                 pyong3 = st.nextToken();
             }
         }

         //세대수가 복합일경우 분리한다.
         if(!"".equals(hoscnt1)) {
             StringTokenizer st = new StringTokenizer(hoscnt1, "/");
             hoscnt1 = st.nextToken();
             if(st.hasMoreTokens()){
                 hoscnt2 = st.nextToken();
             }
             if(st.hasMoreTokens()){
                 hoscnt3 = st.nextToken();
             }
         }

         //각층,호,매체값을 연결하여 문자열을 만들어 넘긴다.
         for (java.util.Enumeration e = req.getParameterNames(); e.hasMoreElements(); ) {
             paramName = (String) e.nextElement();
             paramVal = req.getParameter(paramName);
             tempName = paramName.substring(2);

             if("h_".equals(paramName.substring(0,2)) && !"".equals(paramVal)) {
                 StringTokenizer st = new StringTokenizer(paramVal, ",");
                 do {
                     tempVal = st.nextToken();
                     if(tempVal.length() == 1) tempVal = tempVal + " ";
                     paramString = paramString + "##" + tempName + tempVal.toUpperCase();
                     //tempVal = "";
                 } while(st.hasMoreTokens());
             }
         }

         if("".equals(paramString)){
             if("H".equals(hmflag)) throw new AppException("[SLCommun2600WB.java-accessThrw](1)", "최소한 하나의 호에는 매체가 등록되어야 합니다.");
         }else{
             paramString = paramString.substring(2);
         }

         SL_A_COMM_APT_THRWDM dm = new SL_A_COMM_APT_THRWDM();

         dm.setBocd(bocd);
         dm.setAccflag(accflag);
         dm.setHmflag(hmflag);
         dm.setZip(zip);
         dm.setAddr(addr);
         dm.setAddrcd(addrcd);
         dm.setDongno(dongno);
         dm.setPyong1(Long.parseLong(Util.convertNull(pyong1,"0")));
         dm.setHoscnt1(Long.parseLong(Util.convertNull(hoscnt1,"0")));
         dm.setPyong2(Long.parseLong(Util.convertNull(pyong2,"0")));
         dm.setHoscnt2(Long.parseLong(Util.convertNull(hoscnt2,"0")));
         dm.setPyong3(Long.parseLong(Util.convertNull(pyong3,"0")));
         dm.setHoscnt3(Long.parseLong(Util.convertNull(hoscnt3,"0")));
         dm.setInvsgdt(invsgdt);
         dm.setInvsgno(invsgno);
         dm.setInvsghhmm(invsghhmm);
         dm.setInvsgpers(invsgpers);
         dm.setHousval(paramString);
         dm.setIncmgpers(incmgpers);
         dm.setMedicd(medicd);
         dm.setQty(qty);
         dm.setQtyratio(qtyratio);
         dm.setBgndlvtm(bgndlvtm);
         dm.setEnddlvtm(enddlvtm);
         dm.setDlvstatcd(dlvstatcd);
         dm.setLeaffeednosh(leaffeednosh);

         dm.setDlvstatcd1(dlvstatcd1);
         dm.setDlvstatcd2(dlvstatcd2);
         dm.setDlvstatcd3(dlvstatcd3);
         dm.setRemk(remk);
         dm.setRegtype1(regtype1);
         dm.setRegtype2(regtype2);
         dm.setRegdt(regdt);

/*
         System.out.println("------------------------------------------------");
         System.out.println(bocd);
         System.out.println(accflag);
         System.out.println(hmflag);
         System.out.println(zip);
         System.out.println(addr);
         System.out.println(addrcd);
         System.out.println(dongno);
         System.out.println(Long.parseLong(Util.convertNull(pyong1,"0")));
         System.out.println(Long.parseLong(Util.convertNull(hoscnt1,"0")));
         System.out.println(Long.parseLong(Util.convertNull(pyong2,"0")));
         System.out.println(Long.parseLong(Util.convertNull(hoscnt2,"0")));
         System.out.println(Long.parseLong(Util.convertNull(pyong3,"0")));
         System.out.println(Long.parseLong(Util.convertNull(hoscnt3,"0")));
         System.out.println(invsgdt);
         System.out.println(invsgno);
         System.out.println(invsghhmm);
         System.out.println(invsgpers);
         System.out.println(paramString);
         System.out.println(incmgpers);
         System.out.println(medicd);
         System.out.println(qty);
         System.out.println(qtyratio);
         System.out.println(bgndlvtm);
         System.out.println(enddlvtm);
         System.out.println(dlvstatcd);
         System.out.println(leaffeednosh);

         System.out.println(dlvstatcd1);
         System.out.println(dlvstatcd2);
         System.out.println(dlvstatcd3);
         System.out.println(remk);
         System.out.println(regtype1);
         System.out.println(regtype2);
         System.out.println(regdt);
         System.out.println("------------------------------------------------");
*/

         SSBrmgr1800DAO dao = new SSBrmgr1800DAO();
         ds = dao.accessThrw(dm);
         req.setAttribute("ds", ds); // request에 결과값을 Binding
         
         /*
         // JNDI lookup 을 통해 EJB Home interface 객체생성
         SSBrmgr1800EJBHome home = (SSBrmgr1800EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1800EJB");
         try{
             SSBrmgr1800EJB ejb = home.create();
             SL_A_COMM_APT_THRWDataSet ds = null;
             ds = ejb.accessThrw(dm); // 설정된 dm값으로 EJB를 호출
             req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 아파트투입현황(결과보기)
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @throws AppException
     **/
    public void selectResult(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_COMM_APT_RESULTDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
//        String bocd = Util.getSessionParameterValue(req, "bocd", true);    			//지국지사코드
        String bocd = Util.checkString(req.getParameter("bocd"));    				    //지국지사코드
        String invsgdt1 = Util.checkString(req.getParameter("invsgdt1"));				//조사일자1
        String invsgdt2 = Util.checkString(req.getParameter("invsgdt2"));				//조사일자2
        String addrcd = Util.checkString(req.getParameter("addrcd"));                   //아파트코드
        String dongno = Util.Uni2Ksc(Util.checkString(req.getParameter("dongno")));                   //아파트 동
        String deptlist = Util.checkString(req.getParameter("deptlist"));
        String partlist = Util.checkString(req.getParameter("partlist"));
        String arealist = Util.checkString(req.getParameter("arealist"));
        String fullclsf = Util.checkString(req.getParameter("fullclsf"));
        String orderclsf = Util.checkString(req.getParameter("orderclsf"));
        String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        String regtype1 = Util.checkString(req.getParameter("sel_regtype1"));
        String regtype2 = Util.checkString(req.getParameter("sel_regtype2"));
        String invsgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgpers")));
        String jobcdset = Util.Uni2Ksc(Util.checkString(req.getParameter("jobcdset")));

        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "10" : pagesize;

        System.out.println("deptlist :" + deptlist + ":");
        
        SS_L_COMM_APT_RESULTDM dm = new SS_L_COMM_APT_RESULTDM();

        dm.setBocd(bocd);
        dm.setInvsgdt1(invsgdt1);
        dm.setInvsgdt2(invsgdt2);
        dm.setAddrcd(addrcd);
        dm.setDongno(dongno);
        dm.setDeptlist(deptlist);
        dm.setPartlist(partlist);
        dm.setArealist(arealist);
        dm.setFullclsf(fullclsf);
        dm.setOrderclsf(orderclsf);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));
        dm.setRegtype1(regtype1);
        dm.setRegtype2(regtype2);
        dm.setInvsgpers(invsgpers);
        dm.setJobcdset(jobcdset);

        SSBrmgr1800DAO dao = new SSBrmgr1800DAO();
        ds = dao.selectResult(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SSBrmgr1800EJBHome home = (SSBrmgr1800EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1800EJB");
        try{
            SSBrmgr1800EJB ejb = home.create();
            SS_L_COMM_APT_RESULTDataSet ds = null;
            ds = ejb.selectResult(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
       * 아파트투입현황-투입률계산
       * 조회된 request값을 set한다.
       * @param HttpServletRequest req
       * @param HttpServletResponse res
       * @throws AppException
       **/
      public void calcThrwRate(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	  SL_L_COMM_THRW_RATEDataSet ds = null;
          // parameter requesting 하고  DM에 값을 Setting
          String hoscnt = Util.checkString(req.getParameter("hoscnt"));					 //세대수
          String housval = Util.checkString(req.getParameter("housval"));	 //매체목록

          SL_L_COMM_THRW_RATEDM dm = new SL_L_COMM_THRW_RATEDM();

          dm.setHoscnt(hoscnt);
          dm.setHousval(housval);

          SSBrmgr1800DAO dao = new SSBrmgr1800DAO();
          ds = dao.calcThrwRate(dm);
          req.setAttribute("ds", ds); // request에 결과값을 Binding
          
          /*
          // JNDI lookup 을 통해 EJB Home interface 객체생성
          SSBrmgr1800EJBHome home = (SSBrmgr1800EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1800EJB");
          try{
              SSBrmgr1800EJB ejb = home.create();
              SL_L_COMM_THRW_RATEDataSet ds = null;
              ds = ejb.calcThrwRate(dm); // 설정된 dm값으로 EJB를 호출
              req.setAttribute("ds", ds); // request에 결과값을 Binding
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
