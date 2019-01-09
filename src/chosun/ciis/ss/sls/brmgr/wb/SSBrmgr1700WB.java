/***************************************************************************************************
* 파일명 : SSBrmgr1700WB.java
* 기능 : 지국경영-관할지국조정를 위한 Worker Bean
* 작성일자 : 2004-03-06
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.wb;

import javax.ejb.*;
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


/**
 * 지국경영-관할지국조정을 위한 WB
 */

public class SSBrmgr1700WB{

    /**
     * 지국경영-관할지국조정-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initRdrMovm(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_MOVMWORK_INITDataSet ds = null;

        SS_L_RDR_MOVMWORK_INITDM dm = new SS_L_RDR_MOVMWORK_INITDM();
        
        SSBrmgr1700DAO dao = new SSBrmgr1700DAO();
		// DAO 객체의 selectInitList 호출
		ds = dao.initRdrMovm(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrmgr1700EJBHome home = (SSBrmgr1700EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1700EJB");
        try{
            SSBrmgr1700EJB ejb = home.create();
            ds = ejb.initRdrMovm(dm);
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
     * 지국경영-관할지국조정-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectRdrMovmList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        //local variables
        SS_L_RDR_MOVMWORKDataSet ds = null;

        //request process
        String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
        String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
        String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
        String procstat = Util.Uni2Ksc(Util.checkString(req.getParameter("procstat")));
        String dtflg = Util.Uni2Ksc(Util.checkString(req.getParameter("dtflg")));
        String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
        String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
        String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));

        //filter process
        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "10" : pagesize;

        SS_L_RDR_MOVMWORKDM dm = new SS_L_RDR_MOVMWORKDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setProcstat(procstat);
        dm.setDtflg(dtflg);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SSBrmgr1700DAO dao = new SSBrmgr1700DAO();
        // DAO 객체의 selectInitList 호출
        ds = dao.selectRdrMovmList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrmgr1700EJBHome home = (SSBrmgr1700EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1700EJB");
        try{
            SSBrmgr1700EJB ejb = home.create();
            ds = ejb.selectRdrMovmList(dm);
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
     * 지국경영-관할지국조정-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectRdrMovmDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        //local variables
        SS_S_RDR_MOVMWORKDataSet ds = null;

        //request process
        String regdt = Util.checkString(req.getParameter("regdt"));
        String regno = Util.checkString(req.getParameter("regno"));

        SS_S_RDR_MOVMWORKDM dm = new SS_S_RDR_MOVMWORKDM();
        dm.setRegdt(regdt);
        dm.setRegno(regno);
        
        SSBrmgr1700DAO dao = new SSBrmgr1700DAO();
        // DAO 객체의 selectInitList 호출
        ds = dao.selectRdrMovmDetail(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrmgr1700EJBHome home = (SSBrmgr1700EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1700EJB");
        try{
            SSBrmgr1700EJB ejb = home.create();
            ds = ejb.selectRdrMovmDetail(dm);
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
     * 지국경영-관할지국조정-담당확인
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateRdrMovm(HttpServletRequest req, HttpServletResponse res) throws AppException{
        //local variables
        SS_U_RDR_MOVMWORKDataSet ds = null;

        //session process
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);      //입력자(단수)
        //String incmgpers ="feelhouse";      //입력자(단수)

        //request process
        final String DELIMITER = "##";        //컬럼구분자
        String[] idxs   = req.getParameterValues("idx");                          //행 번호
        String[] regdts = req.getParameterValues("regdt");                        //등록일자(복수)
        String[] regnos = req.getParameterValues("regno");                        //등록번호(복수)

        StringBuffer sb_regdt = new StringBuffer("");
        StringBuffer sb_regno = new StringBuffer("");

        //application exception process
        if(idxs == null){
             throw new AppException("[SSBrmgr1700WB.java-updateRdrMovm](1)", "작업목록 중 체크된 건이 없습니다.");
        }

        for(int i=0; i<idxs.length; i++){
            sb_regdt.append(DELIMITER + regdts[Integer.parseInt((String)idxs[i])]);
            sb_regno.append(DELIMITER + regnos[Integer.parseInt((String)idxs[i])]);
        }
        if(regdts.length > 0){
            sb_regdt.delete(0,DELIMITER.length());
            sb_regno.delete(0,DELIMITER.length());
        }

        SS_U_RDR_MOVMWORKDM dm = new SS_U_RDR_MOVMWORKDM();
        dm.setIncmgpers(incmgpers);
        dm.setRegdt(sb_regdt.toString());
        dm.setRegno(sb_regno.toString());
        
        SSBrmgr1700DAO dao = new SSBrmgr1700DAO();
        // DAO 객체의 selectInitList 호출
        ds = dao.updateRdrMovm(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrmgr1700EJBHome home = (SSBrmgr1700EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1700EJB");
        try{
            SSBrmgr1700EJB ejb = home.create();
            ds = ejb.updateRdrMovm(dm);
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