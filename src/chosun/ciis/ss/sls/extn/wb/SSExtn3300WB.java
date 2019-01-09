/***************************************************************************************************
 * 파일명 : SSExtn3300WB.java
 * 기능 : 문자점검독자관리를 위한 Worker Bean
 * 작성일자 : 2015-11-11
 * 작성자 : 장선희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.extn.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import utils.system;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.dao.*;

/**
 * 문자점검독자관리-설문등록 을 위한 WB
 */

public class SSExtn3300WB {

    /**
     * 문자점검독자관리-설문등록-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMoSvyList(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_MO_SVYDataSet ds = null;
        // Request Parameter Processing
        String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
        String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
        String svynm = Util.Uni2Ksc(Util.checkString(req.getParameter("svynm")));
        String svyid = Util.Uni2Ksc(Util.checkString(req.getParameter("svyid")));
        String stat = Util.Uni2Ksc(Util.checkString(req.getParameter("stat")));
        String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));

        //System.out.println("pageno=="+pageno);
        //System.out.println("pagesize=="+pagesize);

        // DM Setting
        SS_L_MO_SVYDM dm = new SS_L_MO_SVYDM();
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setSvynm(svynm);
        dm.setSvyid(svyid);
        dm.setStat(stat);
        dm.pageno = 0;
        dm.pagesize = 0;
/*		dm.pageno   = ("".equals(pageno)) ? 1 : Long.parseLong(pageno); 		// 'pageno'가 Null일경우 1을반환
		dm.pagesize = ("".equals(pagesize)) ? 10 : Long.parseLong(pagesize);
*/
		dm.print();

        SSExtn3300DAO dao = new SSExtn3300DAO();
        // DAO 객체의 init 호출
        ds = dao.selectMoSvyList(dm);
        req.setAttribute("ds", ds);
    }


    /**
     * 문자점검독자관리-설문등록-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMoSvyDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_S_MO_SVYDataSet ds = null;
        // Request Parameter Processing
    	String svyid = Util.Uni2Ksc(Util.checkString(req.getParameter("svyid")));
        // DM Setting
    	SS_S_MO_SVYDM dm = new SS_S_MO_SVYDM();
        dm.setSvyid(svyid);

        dm.print();

        SSExtn3300DAO dao = new SSExtn3300DAO();
        // DAO 객체의 selectExtnBlngCode 호출
        ds = dao.selectMoSvyDetail(dm);


        req.setAttribute("ds", ds);

        /*
        SSExtn1000EJBHome home = (SSExtn1000EJBHome) JNDIManager.getInstance().getHome("SSExtn1000EJB");
        try {
            SSExtn1000EJB ejb = home.create();
            ds = ejb.selectExtnBlngCodeList(dm);
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
     * 문자점검독자관리-설문등록-추가,수정,삭제
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void MoSvyUpdate(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_A_MO_SVYDataSet ds = null;
        // Request Parameter Processing
    	 String incmgpers = Util.getSessionParameterValue(req, "uid", true);
    	 String accflag = Util.checkString(req.getParameter("accflag"));
    	 String svyid = Util.checkString(req.getParameter("svyid"));
    	 String svynm = Util.checkString(req.getParameter("svynm"));
    	 String sttdt = Util.checkString(req.getParameter("sttdt"));
    	 String enddt = Util.checkString(req.getParameter("enddt"));
    	 String qstsnum = Util.checkString(req.getParameter("qstsnum"));
    	 String url = Util.checkString(req.getParameter("url"));
    	 String s_stat = Util.checkString(req.getParameter("s_stat"));
    	 String giftfg = Util.checkString(req.getParameter("giftfg"));
    	 String memo = Util.checkString(req.getParameter("memo"));
    	 String camptype = Util.checkString(req.getParameter("camptype"));
    	 String basicdt = Util.checkString(req.getParameter("basicdt"));
    	 String qstid1 = Util.checkString(req.getParameter("qstid1"));
    	 String qstid2 = Util.checkString(req.getParameter("qstid2"));
    	 String qstid3 = Util.checkString(req.getParameter("qstid3"));
    	 String qstid4 = Util.checkString(req.getParameter("qstid4"));
    	 String qstid5 = Util.checkString(req.getParameter("qstid5"));
    	 String qstid6 = Util.checkString(req.getParameter("qstid6"));
    	 String qstid7 = Util.checkString(req.getParameter("qstid7"));
    	 String qstid8 = Util.checkString(req.getParameter("qstid8"));
    	 String qstid9 = Util.checkString(req.getParameter("qstid9"));
    	 String qstid10 = Util.checkString(req.getParameter("qstid10"));
    	 String cont1 = Util.checkString(req.getParameter("cont1"));
    	 String cont2 = Util.checkString(req.getParameter("cont2"));
    	 String cont3 = Util.checkString(req.getParameter("cont3"));
    	 String cont4 = Util.checkString(req.getParameter("cont4"));
    	 String cont5 = Util.checkString(req.getParameter("cont5"));
    	 String cont6 = Util.checkString(req.getParameter("cont6"));
    	 String cont7 = Util.checkString(req.getParameter("cont7"));
    	 String cont8 = Util.checkString(req.getParameter("cont8"));
    	 String cont9 = Util.checkString(req.getParameter("cont9"));
    	 String cont10 = Util.checkString(req.getParameter("cont10"));
    	 String qtstype1 = Util.checkString(req.getParameter("qtstype1"));
    	 String qtstype2 = Util.checkString(req.getParameter("qtstype2"));
    	 String qtstype3 = Util.checkString(req.getParameter("qtstype3"));
    	 String qtstype4 = Util.checkString(req.getParameter("qtstype4"));
    	 String qtstype5 = Util.checkString(req.getParameter("qtstype5"));
    	 String qtstype6 = Util.checkString(req.getParameter("qtstype6"));
    	 String qtstype7 = Util.checkString(req.getParameter("qtstype7"));
    	 String qtstype8 = Util.checkString(req.getParameter("qtstype8"));
    	 String qtstype9 = Util.checkString(req.getParameter("qtstype9"));
    	 String qtstype10 = Util.checkString(req.getParameter("qtstype10"));
    	 String ans1_1 = Util.checkString(req.getParameter("ans1_1"));
    	 String ans1_2 = Util.checkString(req.getParameter("ans1_2"));
    	 String ans1_3 = Util.checkString(req.getParameter("ans1_3"));
    	 String ans1_4 = Util.checkString(req.getParameter("ans1_4"));
    	 String ans1_5 = Util.checkString(req.getParameter("ans1_5"));
    	 String ans1_6 = Util.checkString(req.getParameter("ans1_6"));
    	 String ans1_7 = Util.checkString(req.getParameter("ans1_7"));
    	 String ans2_1 = Util.checkString(req.getParameter("ans2_1"));
    	 String ans2_2 = Util.checkString(req.getParameter("ans2_2"));
    	 String ans2_3 = Util.checkString(req.getParameter("ans2_3"));
    	 String ans2_4 = Util.checkString(req.getParameter("ans2_4"));
    	 String ans2_5 = Util.checkString(req.getParameter("ans2_5"));
    	 String ans2_6 = Util.checkString(req.getParameter("ans2_6"));
    	 String ans2_7 = Util.checkString(req.getParameter("ans2_7"));
    	 String ans3_1 = Util.checkString(req.getParameter("ans3_1"));
    	 String ans3_2 = Util.checkString(req.getParameter("ans3_2"));
    	 String ans3_3 = Util.checkString(req.getParameter("ans3_3"));
    	 String ans3_4 = Util.checkString(req.getParameter("ans3_4"));
    	 String ans3_5 = Util.checkString(req.getParameter("ans3_5"));
    	 String ans3_6 = Util.checkString(req.getParameter("ans3_6"));
    	 String ans3_7 = Util.checkString(req.getParameter("ans3_7"));
    	 String ans4_1 = Util.checkString(req.getParameter("ans4_1"));
    	 String ans4_2 = Util.checkString(req.getParameter("ans4_2"));
    	 String ans4_3 = Util.checkString(req.getParameter("ans4_3"));
    	 String ans4_4 = Util.checkString(req.getParameter("ans4_4"));
    	 String ans4_5 = Util.checkString(req.getParameter("ans4_5"));
    	 String ans4_6 = Util.checkString(req.getParameter("ans4_6"));
    	 String ans4_7 = Util.checkString(req.getParameter("ans4_7"));
    	 String ans5_1 = Util.checkString(req.getParameter("ans5_1"));
    	 String ans5_2 = Util.checkString(req.getParameter("ans5_2"));
    	 String ans5_3 = Util.checkString(req.getParameter("ans5_3"));
    	 String ans5_4 = Util.checkString(req.getParameter("ans5_4"));
    	 String ans5_5 = Util.checkString(req.getParameter("ans5_5"));
    	 String ans5_6 = Util.checkString(req.getParameter("ans5_6"));
    	 String ans5_7 = Util.checkString(req.getParameter("ans5_7"));
    	 String ans6_1 = Util.checkString(req.getParameter("ans6_1"));
    	 String ans6_2 = Util.checkString(req.getParameter("ans6_2"));
    	 String ans6_3 = Util.checkString(req.getParameter("ans6_3"));
    	 String ans6_4 = Util.checkString(req.getParameter("ans6_4"));
    	 String ans6_5 = Util.checkString(req.getParameter("ans6_5"));
    	 String ans6_6 = Util.checkString(req.getParameter("ans6_6"));
    	 String ans6_7 = Util.checkString(req.getParameter("ans6_7"));
    	 String ans7_1 = Util.checkString(req.getParameter("ans7_1"));
    	 String ans7_2 = Util.checkString(req.getParameter("ans7_2"));
    	 String ans7_3 = Util.checkString(req.getParameter("ans7_3"));
    	 String ans7_4 = Util.checkString(req.getParameter("ans7_4"));
    	 String ans7_5 = Util.checkString(req.getParameter("ans7_5"));
    	 String ans7_6 = Util.checkString(req.getParameter("ans7_6"));
    	 String ans7_7 = Util.checkString(req.getParameter("ans7_7"));
    	 String ans8_1 = Util.checkString(req.getParameter("ans8_1"));
    	 String ans8_2 = Util.checkString(req.getParameter("ans8_2"));
    	 String ans8_3 = Util.checkString(req.getParameter("ans8_3"));
    	 String ans8_4 = Util.checkString(req.getParameter("ans8_4"));
    	 String ans8_5 = Util.checkString(req.getParameter("ans8_5"));
    	 String ans8_6 = Util.checkString(req.getParameter("ans8_6"));
    	 String ans8_7 = Util.checkString(req.getParameter("ans8_7"));
    	 String ans9_1 = Util.checkString(req.getParameter("ans9_1"));
    	 String ans9_2 = Util.checkString(req.getParameter("ans9_2"));
    	 String ans9_3 = Util.checkString(req.getParameter("ans9_3"));
    	 String ans9_4 = Util.checkString(req.getParameter("ans9_4"));
    	 String ans9_5 = Util.checkString(req.getParameter("ans9_5"));
    	 String ans9_6 = Util.checkString(req.getParameter("ans9_6"));
    	 String ans9_7 = Util.checkString(req.getParameter("ans9_7"));
    	 String ans10_1 = Util.checkString(req.getParameter("ans10_1"));
    	 String ans10_2 = Util.checkString(req.getParameter("ans10_2"));
    	 String ans10_3 = Util.checkString(req.getParameter("ans10_3"));
    	 String ans10_4 = Util.checkString(req.getParameter("ans10_4"));
    	 String ans10_5 = Util.checkString(req.getParameter("ans10_5"));
    	 String ans10_6 = Util.checkString(req.getParameter("ans10_6"));
    	 String ans10_7 = Util.checkString(req.getParameter("ans10_7"));
    	 String objcnt1 = Util.checkString(req.getParameter("objcnt1"));
    	 String objcnt2 = Util.checkString(req.getParameter("objcnt2"));
    	 String objcnt3 = Util.checkString(req.getParameter("objcnt3"));
    	 String objcnt4 = Util.checkString(req.getParameter("objcnt4"));
    	 String objcnt5 = Util.checkString(req.getParameter("objcnt5"));
    	 String objcnt6 = Util.checkString(req.getParameter("objcnt6"));
    	 String objcnt7 = Util.checkString(req.getParameter("objcnt7"));
    	 String objcnt8 = Util.checkString(req.getParameter("objcnt8"));
    	 String objcnt9 = Util.checkString(req.getParameter("objcnt9"));
    	 String objcnt10 = Util.checkString(req.getParameter("objcnt10"));
    	 String sbjlgth1 = Util.checkString(req.getParameter("sbjlgth1"));
    	 String sbjlgth2 = Util.checkString(req.getParameter("sbjlgth2"));
    	 String sbjlgth3 = Util.checkString(req.getParameter("sbjlgth3"));
    	 String sbjlgth4 = Util.checkString(req.getParameter("sbjlgth4"));
    	 String sbjlgth5 = Util.checkString(req.getParameter("sbjlgth5"));
    	 String sbjlgth6 = Util.checkString(req.getParameter("sbjlgth6"));
    	 String sbjlgth7 = Util.checkString(req.getParameter("sbjlgth7"));
    	 String sbjlgth8 = Util.checkString(req.getParameter("sbjlgth8"));
    	 String sbjlgth9 = Util.checkString(req.getParameter("sbjlgth9"));
    	 String sbjlgth10 = Util.checkString(req.getParameter("sbjlgth10"));
    	 String priority1 = Util.checkString(req.getParameter("priority1"));
    	 String priority2 = Util.checkString(req.getParameter("priority2"));
    	 String priority3 = Util.checkString(req.getParameter("priority3"));
    	 String priority4 = Util.checkString(req.getParameter("priority4"));
    	 String priority5 = Util.checkString(req.getParameter("priority5"));
    	 String priority6 = Util.checkString(req.getParameter("priority6"));
    	 String priority7 = Util.checkString(req.getParameter("priority7"));
    	 String priority8 = Util.checkString(req.getParameter("priority8"));
    	 String priority9 = Util.checkString(req.getParameter("priority9"));
    	 String priority10 = Util.checkString(req.getParameter("priority10"));
    	 String reqfg1 = Util.checkString(req.getParameter("reqfg1"));
    	 String reqfg2 = Util.checkString(req.getParameter("reqfg2"));
    	 String reqfg3 = Util.checkString(req.getParameter("reqfg3"));
    	 String reqfg4 = Util.checkString(req.getParameter("reqfg4"));
    	 String reqfg5 = Util.checkString(req.getParameter("reqfg5"));
    	 String reqfg6 = Util.checkString(req.getParameter("reqfg6"));
    	 String reqfg7 = Util.checkString(req.getParameter("reqfg7"));
    	 String reqfg8 = Util.checkString(req.getParameter("reqfg8"));
    	 String reqfg9 = Util.checkString(req.getParameter("reqfg9"));
    	 String reqfg10 = Util.checkString(req.getParameter("reqfg10"));
    	 String q_stat1 = Util.checkString(req.getParameter("q_stat1"));
    	 String q_stat2 = Util.checkString(req.getParameter("q_stat2"));
    	 String q_stat3 = Util.checkString(req.getParameter("q_stat3"));
    	 String q_stat4 = Util.checkString(req.getParameter("q_stat4"));
    	 String q_stat5 = Util.checkString(req.getParameter("q_stat5"));
    	 String q_stat6 = Util.checkString(req.getParameter("q_stat6"));
    	 String q_stat7 = Util.checkString(req.getParameter("q_stat7"));
    	 String q_stat8 = Util.checkString(req.getParameter("q_stat8"));
    	 String q_stat9 = Util.checkString(req.getParameter("q_stat9"));
    	 String q_stat10 = Util.checkString(req.getParameter("q_stat10"));
    	 String qstbsyn1 = Util.checkString(req.getParameter("qstbsyn1"));
    	 String qstbsyn2 = Util.checkString(req.getParameter("qstbsyn2"));
    	 String qstbsyn3 = Util.checkString(req.getParameter("qstbsyn3"));
    	 String qstbsyn4 = Util.checkString(req.getParameter("qstbsyn4"));
    	 String qstbsyn5 = Util.checkString(req.getParameter("qstbsyn5"));
    	 String qstbsyn6 = Util.checkString(req.getParameter("qstbsyn6"));
    	 String qstbsyn7 = Util.checkString(req.getParameter("qstbsyn7"));
    	 String qstbsyn8 = Util.checkString(req.getParameter("qstbsyn8"));
    	 String qstbsyn9 = Util.checkString(req.getParameter("qstbsyn9"));
    	 String qstbsyn10 = Util.checkString(req.getParameter("qstbsyn10"));
    	 String ans01_bastat1 = Util.checkString(req.getParameter("ans01_bastat1"));
    	 String ans01_bastat2 = Util.checkString(req.getParameter("ans01_bastat2"));
    	 String ans01_bastat3 = Util.checkString(req.getParameter("ans01_bastat3"));
    	 String ans01_bastat4 = Util.checkString(req.getParameter("ans01_bastat4"));
    	 String ans01_bastat5 = Util.checkString(req.getParameter("ans01_bastat5"));
    	 String ans01_bastat6 = Util.checkString(req.getParameter("ans01_bastat6"));
    	 String ans01_bastat7 = Util.checkString(req.getParameter("ans01_bastat7"));
    	 String ans02_bastat1 = Util.checkString(req.getParameter("ans02_bastat1"));
    	 String ans02_bastat2 = Util.checkString(req.getParameter("ans02_bastat2"));
    	 String ans02_bastat3 = Util.checkString(req.getParameter("ans02_bastat3"));
    	 String ans02_bastat4 = Util.checkString(req.getParameter("ans02_bastat4"));
    	 String ans02_bastat5 = Util.checkString(req.getParameter("ans02_bastat5"));
    	 String ans02_bastat6 = Util.checkString(req.getParameter("ans02_bastat6"));
    	 String ans02_bastat7 = Util.checkString(req.getParameter("ans02_bastat7"));
    	 String ans03_bastat1 = Util.checkString(req.getParameter("ans03_bastat1"));
    	 String ans03_bastat2 = Util.checkString(req.getParameter("ans03_bastat2"));
    	 String ans03_bastat3 = Util.checkString(req.getParameter("ans03_bastat3"));
    	 String ans03_bastat4 = Util.checkString(req.getParameter("ans03_bastat4"));
    	 String ans03_bastat5 = Util.checkString(req.getParameter("ans03_bastat5"));
    	 String ans03_bastat6 = Util.checkString(req.getParameter("ans03_bastat6"));
    	 String ans03_bastat7 = Util.checkString(req.getParameter("ans03_bastat7"));
    	 String ans04_bastat1 = Util.checkString(req.getParameter("ans04_bastat1"));
    	 String ans04_bastat2 = Util.checkString(req.getParameter("ans04_bastat2"));
    	 String ans04_bastat3 = Util.checkString(req.getParameter("ans04_bastat3"));
    	 String ans04_bastat4 = Util.checkString(req.getParameter("ans04_bastat4"));
    	 String ans04_bastat5 = Util.checkString(req.getParameter("ans04_bastat5"));
    	 String ans04_bastat6 = Util.checkString(req.getParameter("ans04_bastat6"));
    	 String ans04_bastat7 = Util.checkString(req.getParameter("ans04_bastat7"));
    	 String ans05_bastat1 = Util.checkString(req.getParameter("ans05_bastat1"));
    	 String ans05_bastat2 = Util.checkString(req.getParameter("ans05_bastat2"));
    	 String ans05_bastat3 = Util.checkString(req.getParameter("ans05_bastat3"));
    	 String ans05_bastat4 = Util.checkString(req.getParameter("ans05_bastat4"));
    	 String ans05_bastat5 = Util.checkString(req.getParameter("ans05_bastat5"));
    	 String ans05_bastat6 = Util.checkString(req.getParameter("ans05_bastat6"));
    	 String ans05_bastat7 = Util.checkString(req.getParameter("ans05_bastat7"));
    	 String ans06_bastat1 = Util.checkString(req.getParameter("ans06_bastat1"));
    	 String ans06_bastat2 = Util.checkString(req.getParameter("ans06_bastat2"));
    	 String ans06_bastat3 = Util.checkString(req.getParameter("ans06_bastat3"));
    	 String ans06_bastat4 = Util.checkString(req.getParameter("ans06_bastat4"));
    	 String ans06_bastat5 = Util.checkString(req.getParameter("ans06_bastat5"));
    	 String ans06_bastat6 = Util.checkString(req.getParameter("ans06_bastat6"));
    	 String ans06_bastat7 = Util.checkString(req.getParameter("ans06_bastat7"));
    	 String ans07_bastat1 = Util.checkString(req.getParameter("ans07_bastat1"));
    	 String ans07_bastat2 = Util.checkString(req.getParameter("ans07_bastat2"));
    	 String ans07_bastat3 = Util.checkString(req.getParameter("ans07_bastat3"));
    	 String ans07_bastat4 = Util.checkString(req.getParameter("ans07_bastat4"));
    	 String ans07_bastat5 = Util.checkString(req.getParameter("ans07_bastat5"));
    	 String ans07_bastat6 = Util.checkString(req.getParameter("ans07_bastat6"));
    	 String ans07_bastat7 = Util.checkString(req.getParameter("ans07_bastat7"));
    	 String ans08_bastat1 = Util.checkString(req.getParameter("ans08_bastat1"));
    	 String ans08_bastat2 = Util.checkString(req.getParameter("ans08_bastat2"));
    	 String ans08_bastat3 = Util.checkString(req.getParameter("ans08_bastat3"));
    	 String ans08_bastat4 = Util.checkString(req.getParameter("ans08_bastat4"));
    	 String ans08_bastat5 = Util.checkString(req.getParameter("ans08_bastat5"));
    	 String ans08_bastat6 = Util.checkString(req.getParameter("ans08_bastat6"));
    	 String ans08_bastat7 = Util.checkString(req.getParameter("ans08_bastat7"));
    	 String ans09_bastat1 = Util.checkString(req.getParameter("ans09_bastat1"));
    	 String ans09_bastat2 = Util.checkString(req.getParameter("ans09_bastat2"));
    	 String ans09_bastat3 = Util.checkString(req.getParameter("ans09_bastat3"));
    	 String ans09_bastat4 = Util.checkString(req.getParameter("ans09_bastat4"));
    	 String ans09_bastat5 = Util.checkString(req.getParameter("ans09_bastat5"));
    	 String ans09_bastat6 = Util.checkString(req.getParameter("ans09_bastat6"));
    	 String ans09_bastat7 = Util.checkString(req.getParameter("ans09_bastat7"));
    	 String ans10_bastat1 = Util.checkString(req.getParameter("ans10_bastat1"));
    	 String ans10_bastat2 = Util.checkString(req.getParameter("ans10_bastat2"));
    	 String ans10_bastat3 = Util.checkString(req.getParameter("ans10_bastat3"));
    	 String ans10_bastat4 = Util.checkString(req.getParameter("ans10_bastat4"));
    	 String ans10_bastat5 = Util.checkString(req.getParameter("ans10_bastat5"));
    	 String ans10_bastat6 = Util.checkString(req.getParameter("ans10_bastat6"));
    	 String ans10_bastat7 = Util.checkString(req.getParameter("ans10_bastat7"));

    	 // DM Setting
    	SS_A_MO_SVYDM dm = new SS_A_MO_SVYDM();
    	dm.setIncmgpers(incmgpers);
    	dm.setAccflag(accflag);
    	dm.setSvyid(svyid);
    	dm.setSvynm(svynm);
    	dm.setSttdt(sttdt);
    	dm.setEnddt(enddt);
    	dm.setQstsnum(qstsnum);
    	dm.setUrl(url);
    	dm.setS_stat(s_stat);
    	dm.setGiftfg(giftfg);
    	dm.setMemo(memo);
    	dm.setCamptype(camptype);
    	dm.setBasicdt(basicdt);
    	dm.setQstid1(qstid1);
    	dm.setQstid2(qstid2);
    	dm.setQstid3(qstid3);
    	dm.setQstid4(qstid4);
    	dm.setQstid5(qstid5);
    	dm.setQstid6(qstid6);
    	dm.setQstid7(qstid7);
    	dm.setQstid8(qstid8);
    	dm.setQstid9(qstid9);
    	dm.setQstid10(qstid10);
    	dm.setCont1(cont1);
    	dm.setCont2(cont2);
    	dm.setCont3(cont3);
    	dm.setCont4(cont4);
    	dm.setCont5(cont5);
    	dm.setCont6(cont6);
    	dm.setCont7(cont7);
    	dm.setCont8(cont8);
    	dm.setCont9(cont9);
    	dm.setCont10(cont10);
    	dm.setQtstype1(qtstype1);
    	dm.setQtstype2(qtstype2);
    	dm.setQtstype3(qtstype3);
    	dm.setQtstype4(qtstype4);
    	dm.setQtstype5(qtstype5);
    	dm.setQtstype6(qtstype6);
    	dm.setQtstype7(qtstype7);
    	dm.setQtstype8(qtstype8);
    	dm.setQtstype9(qtstype9);
    	dm.setQtstype10(qtstype10);
    	dm.setAns1_1(ans1_1);
    	dm.setAns1_2(ans1_2);
    	dm.setAns1_3(ans1_3);
    	dm.setAns1_4(ans1_4);
    	dm.setAns1_5(ans1_5);
    	dm.setAns1_6(ans1_6);
    	dm.setAns1_7(ans1_7);
    	dm.setAns2_1(ans2_1);
    	dm.setAns2_2(ans2_2);
    	dm.setAns2_3(ans2_3);
    	dm.setAns2_4(ans2_4);
    	dm.setAns2_5(ans2_5);
    	dm.setAns2_6(ans2_6);
    	dm.setAns2_7(ans2_7);
    	dm.setAns3_1(ans3_1);
    	dm.setAns3_2(ans3_2);
    	dm.setAns3_3(ans3_3);
    	dm.setAns3_4(ans3_4);
    	dm.setAns3_5(ans3_5);
    	dm.setAns3_6(ans3_6);
    	dm.setAns3_7(ans3_7);
    	dm.setAns4_1(ans4_1);
    	dm.setAns4_2(ans4_2);
    	dm.setAns4_3(ans4_3);
    	dm.setAns4_4(ans4_4);
    	dm.setAns4_5(ans4_5);
    	dm.setAns4_6(ans4_6);
    	dm.setAns4_7(ans4_7);
    	dm.setAns5_1(ans5_1);
    	dm.setAns5_2(ans5_2);
    	dm.setAns5_3(ans5_3);
    	dm.setAns5_4(ans5_4);
    	dm.setAns5_5(ans5_5);
    	dm.setAns5_6(ans5_6);
    	dm.setAns5_7(ans5_7);
    	dm.setAns6_1(ans6_1);
    	dm.setAns6_2(ans6_2);
    	dm.setAns6_3(ans6_3);
    	dm.setAns6_4(ans6_4);
    	dm.setAns6_5(ans6_5);
    	dm.setAns6_6(ans6_6);
    	dm.setAns6_7(ans6_7);
    	dm.setAns7_1(ans7_1);
    	dm.setAns7_2(ans7_2);
    	dm.setAns7_3(ans7_3);
    	dm.setAns7_4(ans7_4);
    	dm.setAns7_5(ans7_5);
    	dm.setAns7_6(ans7_6);
    	dm.setAns7_7(ans7_7);
    	dm.setAns8_1(ans8_1);
    	dm.setAns8_2(ans8_2);
    	dm.setAns8_3(ans8_3);
    	dm.setAns8_4(ans8_4);
    	dm.setAns8_5(ans8_5);
    	dm.setAns8_6(ans8_6);
    	dm.setAns8_7(ans8_7);
    	dm.setAns9_1(ans9_1);
    	dm.setAns9_2(ans9_2);
    	dm.setAns9_3(ans9_3);
    	dm.setAns9_4(ans9_4);
    	dm.setAns9_5(ans9_5);
    	dm.setAns9_6(ans9_6);
    	dm.setAns9_7(ans9_7);
    	dm.setAns10_1(ans10_1);
    	dm.setAns10_2(ans10_2);
    	dm.setAns10_3(ans10_3);
    	dm.setAns10_4(ans10_4);
    	dm.setAns10_5(ans10_5);
    	dm.setAns10_6(ans10_6);
    	dm.setAns10_7(ans10_7);
    	dm.setObjcnt1(objcnt1);
    	dm.setObjcnt2(objcnt2);
    	dm.setObjcnt3(objcnt3);
    	dm.setObjcnt4(objcnt4);
    	dm.setObjcnt5(objcnt5);
    	dm.setObjcnt6(objcnt6);
    	dm.setObjcnt7(objcnt7);
    	dm.setObjcnt8(objcnt8);
    	dm.setObjcnt9(objcnt9);
    	dm.setObjcnt10(objcnt10);
    	dm.setSbjlgth1(sbjlgth1);
    	dm.setSbjlgth2(sbjlgth2);
    	dm.setSbjlgth3(sbjlgth3);
    	dm.setSbjlgth4(sbjlgth4);
    	dm.setSbjlgth5(sbjlgth5);
    	dm.setSbjlgth6(sbjlgth6);
    	dm.setSbjlgth7(sbjlgth7);
    	dm.setSbjlgth8(sbjlgth8);
    	dm.setSbjlgth9(sbjlgth9);
    	dm.setSbjlgth10(sbjlgth10);
    	dm.setPriority1(priority1);
    	dm.setPriority2(priority2);
    	dm.setPriority3(priority3);
    	dm.setPriority4(priority4);
    	dm.setPriority5(priority5);
    	dm.setPriority6(priority6);
    	dm.setPriority7(priority7);
    	dm.setPriority8(priority8);
    	dm.setPriority9(priority9);
    	dm.setPriority10(priority10);
    	dm.setReqfg1(reqfg1);
    	dm.setReqfg2(reqfg2);
    	dm.setReqfg3(reqfg3);
    	dm.setReqfg4(reqfg4);
    	dm.setReqfg5(reqfg5);
    	dm.setReqfg6(reqfg6);
    	dm.setReqfg7(reqfg7);
    	dm.setReqfg8(reqfg8);
    	dm.setReqfg9(reqfg9);
    	dm.setReqfg10(reqfg10);
    	dm.setQ_stat1(q_stat1);
    	dm.setQ_stat2(q_stat2);
    	dm.setQ_stat3(q_stat3);
    	dm.setQ_stat4(q_stat4);
    	dm.setQ_stat5(q_stat5);
    	dm.setQ_stat6(q_stat6);
    	dm.setQ_stat7(q_stat7);
    	dm.setQ_stat8(q_stat8);
    	dm.setQ_stat9(q_stat9);
    	dm.setQ_stat10(q_stat10);
    	dm.setQstbsyn1(qstbsyn1);
    	dm.setQstbsyn2(qstbsyn2);
    	dm.setQstbsyn3(qstbsyn3);
    	dm.setQstbsyn4(qstbsyn4);
    	dm.setQstbsyn5(qstbsyn5);
    	dm.setQstbsyn6(qstbsyn6);
    	dm.setQstbsyn7(qstbsyn7);
    	dm.setQstbsyn8(qstbsyn8);
    	dm.setQstbsyn9(qstbsyn9);
    	dm.setQstbsyn10(qstbsyn10);
    	dm.setAns01_bastat1(ans01_bastat1);
    	dm.setAns01_bastat2(ans01_bastat2);
    	dm.setAns01_bastat3(ans01_bastat3);
    	dm.setAns01_bastat4(ans01_bastat4);
    	dm.setAns01_bastat5(ans01_bastat5);
    	dm.setAns01_bastat6(ans01_bastat6);
    	dm.setAns01_bastat7(ans01_bastat7);
    	dm.setAns02_bastat1(ans02_bastat1);
    	dm.setAns02_bastat2(ans02_bastat2);
    	dm.setAns02_bastat3(ans02_bastat3);
    	dm.setAns02_bastat4(ans02_bastat4);
    	dm.setAns02_bastat5(ans02_bastat5);
    	dm.setAns02_bastat6(ans02_bastat6);
    	dm.setAns02_bastat7(ans02_bastat7);
    	dm.setAns03_bastat1(ans03_bastat1);
    	dm.setAns03_bastat2(ans03_bastat2);
    	dm.setAns03_bastat3(ans03_bastat3);
    	dm.setAns03_bastat4(ans03_bastat4);
    	dm.setAns03_bastat5(ans03_bastat5);
    	dm.setAns03_bastat6(ans03_bastat6);
    	dm.setAns03_bastat7(ans03_bastat7);
    	dm.setAns04_bastat1(ans04_bastat1);
    	dm.setAns04_bastat2(ans04_bastat2);
    	dm.setAns04_bastat3(ans04_bastat3);
    	dm.setAns04_bastat4(ans04_bastat4);
    	dm.setAns04_bastat5(ans04_bastat5);
    	dm.setAns04_bastat6(ans04_bastat6);
    	dm.setAns04_bastat7(ans04_bastat7);
    	dm.setAns05_bastat1(ans05_bastat1);
    	dm.setAns05_bastat2(ans05_bastat2);
    	dm.setAns05_bastat3(ans05_bastat3);
    	dm.setAns05_bastat4(ans05_bastat4);
    	dm.setAns05_bastat5(ans05_bastat5);
    	dm.setAns05_bastat6(ans05_bastat6);
    	dm.setAns05_bastat7(ans05_bastat7);
    	dm.setAns06_bastat1(ans06_bastat1);
    	dm.setAns06_bastat2(ans06_bastat2);
    	dm.setAns06_bastat3(ans06_bastat3);
    	dm.setAns06_bastat4(ans06_bastat4);
    	dm.setAns06_bastat5(ans06_bastat5);
    	dm.setAns06_bastat6(ans06_bastat6);
    	dm.setAns06_bastat7(ans06_bastat7);
    	dm.setAns07_bastat1(ans07_bastat1);
    	dm.setAns07_bastat2(ans07_bastat2);
    	dm.setAns07_bastat3(ans07_bastat3);
    	dm.setAns07_bastat4(ans07_bastat4);
    	dm.setAns07_bastat5(ans07_bastat5);
    	dm.setAns07_bastat6(ans07_bastat6);
    	dm.setAns07_bastat7(ans07_bastat7);
    	dm.setAns08_bastat1(ans08_bastat1);
    	dm.setAns08_bastat2(ans08_bastat2);
    	dm.setAns08_bastat3(ans08_bastat3);
    	dm.setAns08_bastat4(ans08_bastat4);
    	dm.setAns08_bastat5(ans08_bastat5);
    	dm.setAns08_bastat6(ans08_bastat6);
    	dm.setAns08_bastat7(ans08_bastat7);
    	dm.setAns09_bastat1(ans09_bastat1);
    	dm.setAns09_bastat2(ans09_bastat2);
    	dm.setAns09_bastat3(ans09_bastat3);
    	dm.setAns09_bastat4(ans09_bastat4);
    	dm.setAns09_bastat5(ans09_bastat5);
    	dm.setAns09_bastat6(ans09_bastat6);
    	dm.setAns09_bastat7(ans09_bastat7);
    	dm.setAns10_bastat1(ans10_bastat1);
    	dm.setAns10_bastat2(ans10_bastat2);
    	dm.setAns10_bastat3(ans10_bastat3);
    	dm.setAns10_bastat4(ans10_bastat4);
    	dm.setAns10_bastat5(ans10_bastat5);
    	dm.setAns10_bastat6(ans10_bastat6);
    	dm.setAns10_bastat7(ans10_bastat7);

        dm.print();

        SSExtn3300DAO dao = new SSExtn3300DAO();
        // DAO 객체의 selectExtnBlngCode 호출
        ds = dao.MoSvyUpdate(dm);


        req.setAttribute("ds", ds);

    }



    /**
     * 문자점검독자관리-설문등록-대기중인문자일괄삭제
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void MoDelete(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_U_MO_SVY_DELDataSet ds = null;
        // Request Parameter Processing
    	String campid = Util.Uni2Ksc(Util.checkString(req.getParameter("campid")));
    	String svyid = Util.Uni2Ksc(Util.checkString(req.getParameter("svyid")));
    	String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));

    	// DM Setting
    	SS_U_MO_SVY_DELDM dm = new SS_U_MO_SVY_DELDM();
    	dm.setCampid(campid);
    	dm.setSvyid(svyid);
    	dm.setUid(uid);

        dm.print();

        SSExtn3300DAO dao = new SSExtn3300DAO();
        // DAO 객체의 selectExtnBlngCode 호출
        ds = dao.MoDelete(dm);


        req.setAttribute("ds", ds);

    }







}
