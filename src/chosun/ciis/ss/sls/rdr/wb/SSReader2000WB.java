/***************************************************************************************************
* 파일명 : SSReader1100WB.java
* 기능 : 독자현황-독자불편 처리를 위한 Worker Bean
* 작성일자 : 2004-01-12
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
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

/**
 * 독자현황-독자불편 위한 WB
 */

public class SSReader2000WB{

    /**
     * 독자현황-독자불편-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void initDsctstat(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_DSCTSTAT_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_RDR_DSCTSTAT_INITDM dm = new SS_L_RDR_DSCTSTAT_INITDM();

        SSReader2000DAO dao = new SSReader2000DAO();
		// DAO 객체의 selectInitList 호출
		ds = dao.initDsctstat(dm);
		req.setAttribute("ds", ds);
    }
    
    public void selectDsctstat(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_RDR_DSCTSTATDataSet ds = null;
    	
        // Request Parameter Processing
    	String deptcd = Util.checkString(req.getParameter("deptcd"));  //부서코드
        String partcd = Util.checkString(req.getParameter("partcd"));  //부서코드
        String areacd = Util.checkString(req.getParameter("areacd"));  //지역코드
        String bocd = Util.checkString(req.getParameter("bocd"));      //지국코드
        String acpnpathcd = Util.checkString(req.getParameter("acpnpathcd"));  //경로코드
        String fromtogb = Util.checkString(req.getParameter("fromtogb"));  //기간선택종류
        String frdt = Util.checkString(req.getParameter("frdt")); //시작일
        String todt = Util.checkString(req.getParameter("todt")); //종료일
        String bocnfmyn = Util.checkString(req.getParameter("bocnfmyn"));  //지국지사확인상태
        String boprocyn = Util.checkString(req.getParameter("boprocyn"));  //지국지사처리여부 (Y:처리, N:미처리)
        String dscttypecd = Util.checkString(req.getParameter("dscttypecd"));  //구독불만유형 코드
        String medicd = Util.checkString(req.getParameter("medicd"));  //매체
        String schlevel = Util.checkString(req.getParameter("schlevel"));  //조회형태
        String stflev = Util.checkString(req.getParameter("stflev"));  //만족도
        String schflag = Util.checkString(req.getParameter("schflag"));  //조회구분

        // DM Setting    	
    	SS_L_RDR_DSCTSTATDM dm = new SS_L_RDR_DSCTSTATDM();
    	dm.setDeptcd(deptcd);
    	dm.setPartcd(partcd);
    	dm.setAreacd(areacd);    	
    	dm.setBocd(bocd);
    	dm.setAcpnpathcd(acpnpathcd);
    	dm.setFromtogb(fromtogb);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setBocnfmyn(bocnfmyn);
    	dm.setBoprocyn(boprocyn);
    	dm.setDscttypecd(dscttypecd);
    	dm.setMedicd(medicd);
    	dm.setSchlevel(schlevel);
    	dm.setStflev(stflev);
    	dm.setSchflag(schflag);
    	
    	dm.print();

    	SSReader2000DAO dao = new SSReader2000DAO();
        // DAO 객체의 selectInitList 호출
        ds = dao.selectDsctstat(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSReader1700EJBHome home = (SSReader1700EJBHome)JNDIManager.getInstance().getHome("SSReader1700EJB");
        try{
            SSReader1700EJB ejb = home.create();
            ds = ejb.selectList(dm);
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
