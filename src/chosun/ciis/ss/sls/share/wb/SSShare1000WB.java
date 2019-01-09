/***************************************************************************************************
* 파일명 : SSShare1000WB.java
* 기능 : 정보공유-일정 처리를 위한 Work Bean
* 작성일자 : 2003-11-19
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
 * 정보공유-일정 위한 WB
 *
 */

public class SSShare1000WB{
    /**
     * 정보공유-일정-초기화면
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
       CO_L_SCHE_INITDataSet ds = null;
       CO_L_SCHE_INITDM dm = new CO_L_SCHE_INITDM();
       
       SSShare1000DAO dao = new SSShare1000DAO();
       // DAO 객체의 init 호출
       ds = dao.selectInitList(dm);
       req.setAttribute("ds", ds); // request에 결과값을 담는다.
       
       /*
       SSShare1000EJBHome home = (SSShare1000EJBHome)JNDIManager.getInstance().getHome("SSShare1000EJB");
       try{
          SSShare1000EJB ejb = home.create();
          ds = ejb.selectInitList(dm); // 설정된 dm값으로 EJB를 호출한다.
          req.setAttribute("ds", ds); // request에 결과값을 담는다.
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
	 * 정보공유-일정-조회(리스트)
	 * @param HttpServletRequest req
	 * @param HttpServletResponse res
	 **/

	public void selectTacomScheList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        CO_L_SCHEDataSet ds = null;
        // Request Parameter Processing
        String jobcd = Util.getSessionParameterValue(req, "jobcd", true); 	            //업무구분코드
        String uid = Util.getSessionParameterValue(req, "uid", true); 	                //입력자아이디
        String deptcd = Util.getSessionParameterValue(req, "selldeptcd", true);         //판매부서코드(소속)

        String schemangunitcd = Util.checkString(req.getParameter("schemangunitcd"));//일정구분코드
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        // DM Setting
        CO_L_SCHEDM dm = new CO_L_SCHEDM();
        dm.setSchemangunitcd(schemangunitcd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setDeptcd(deptcd);
        dm.setUse_pers(uid);
        dm.setUse_persclsf(jobcd);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SSShare1000DAO dao = new SSShare1000DAO();
		// DAO 객체의 selectTacomScheList 호출
		ds = dao.selectTacomScheList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSShare1000EJBHome home = (SSShare1000EJBHome) JNDIManager.getInstance().getHome("SSShare1000EJB");
        try {
            SSShare1000EJB ejb = home.create();
            ds = ejb.selectTacomScheList(dm);
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
	 * 정보공유-일정-상세보기
	 * @param HttpServletRequest req
	 * @param HttpServletResponse res
	 **/

	public void selectTacomScheDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        CO_S_SCHEDataSet ds = null;
        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        // DM Setting
        CO_S_SCHEDM dm = new CO_S_SCHEDM();
        dm.setSeq(Long.parseLong(seq));
        
        SSShare1000DAO dao = new SSShare1000DAO();
		// DAO 객체의 selectTacomScheDetail 호출
		ds = dao.selectTacomScheDetail(dm);
		req.setAttribute("ds", ds); // request에 결과값을 담는다.
		
		/*
        SSShare1000EJBHome home = (SSShare1000EJBHome) JNDIManager.getInstance().getHome("SSShare1000EJB");
        try {
            SSShare1000EJB ejb = home.create();
            ds = ejb.selectTacomScheDetail(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
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
	 * 정보공유-일정-저장(등록)
	 * @param HttpServletRequest req
	 * @param HttpServletResponse res
	 **/

	public void accessTacomSche(HttpServletRequest req, HttpServletResponse res) throws AppException{
        CO_A_SCHEDataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request로 반환할 String Type 결과값
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        String deptcd = Util.getSessionParameterValue(req, "selldeptcd", false);    //소속 판매부서코드
        String deptnm = Util.getSessionParameterValue(req, "selldeptnm", false);    //소속 판매부서명
        String use_pers = Util.getSessionParameterValue(req, "uid", true);         //사용자ID
        String use_persclsf = Util.getSessionParameterValue(req, "jobcd", false);   //사용자구분(작업구분)
        String empnm = Util.Uni2Ksc(Util.getSessionParameterValue(req, "emp_nm", false));         //사용자명

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String seq = Util.checkString(req.getParameter("seq"));
        String schemangitemcd = Util.checkString(req.getParameter("schemangitemcd"));
        String schemangunitcd = Util.checkString(req.getParameter("schemangunitcd"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));

        // DM Setting
        CO_A_SCHEDM dm = new CO_A_SCHEDM();

        dm.setAccflag(accflag);
        // 일련번호 보정
        if(!"I".equals(accflag)){ // 등록이 아닌경우에만 일련번호 설정
            dm.setSeq(Long.parseLong(seq));
        }
        dm.setSchemangitemcd(schemangitemcd);
        dm.setSchemangunitcd(schemangunitcd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setRemk(remk);
        dm.setDeptcd(deptcd);
        dm.setDeptnm(deptnm);
        dm.setUse_pers(use_pers);
        dm.setUse_persclsf(use_persclsf);
        dm.setEmpnm(empnm);
        dm.setIncmgpers(incmgpers);

        SSShare1000DAO dao = new SSShare1000DAO();
		// DAO 객체의 accessTacomSche 호출
        bResult = dao.accessTacomSche(dm);
		if(bResult == true){ // 성공적으로 입력된 경우
            sResult = "true";
         }
         req.setAttribute("result", sResult); // request에 결과값을 담는다.
		
         /*
        SSShare1000EJBHome home = (SSShare1000EJBHome) JNDIManager.getInstance().getHome("SSShare1000EJB");
        try {
            SSShare1000EJB ejb = home.create();
            bResult = ejb.accessTacomSche(dm);
            if(bResult == true){ // 성공적으로 입력된 경우
               sResult = "true";
            }
            req.setAttribute("result", sResult); // request에 결과값을 담는다.
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