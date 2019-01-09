/***************************************************************************************************
* 파일명 : SSExtn5600WB.java
* 기능 : 확장관리-정기구독권
* 작성일자 : 2018-01-08
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.wb;

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
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.dao.*;

/**
 * WB
 */

public class SSExtn5600WB{
	
	public void selectExtn5601(HttpServletRequest req, HttpServletResponse res) throws AppException {

   	 	SS_SLS_EXTN_5601_LDataSet ds = null;

        //request process
	   	String srch_word = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_word")));
	 	
	     // DM Setting
	 	SS_SLS_EXTN_5601_LDM dm = new SS_SLS_EXTN_5601_LDM();
	 	dm.setSrch_word(srch_word);
	
	 	SSExtn5600DAO dao = new SSExtn5600DAO();
	     // DAO 객체의 initApt 호출
	    ds = dao.selectExtn5601(dm);
	    req.setAttribute("ds", ds);
    }

    public void selectExtn5610(HttpServletRequest req, HttpServletResponse res) throws AppException {

   	 	SS_SLS_EXTN_5610_LDataSet ds = null;

        //request process
   	 	String dt_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("dt_gb")));
   	 	String fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_dt")));
   	 	String to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_dt")));
   	 	String subscrpt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscrpt_cd")));
   	 	String subscrpt_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("subscrpt_gb")));
   	 	String buyer_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("buyer_nm")));
   	 	String outyn = Util.Uni2Ksc(Util.checkString(req.getParameter("outyn")));
   	
   	 		
        SS_SLS_EXTN_5610_LDM dm = new SS_SLS_EXTN_5610_LDM();
        dm.setDt_gb(dt_gb);
        dm.setFr_dt(fr_dt);
        dm.setTo_dt(to_dt);
        dm.setSubscrpt_cd(subscrpt_cd);
        dm.setSubscrpt_gb(subscrpt_gb);
        dm.setBuyer_nm(buyer_nm);
        dm.setOutyn(outyn);
        
        dm.print();

        SSExtn5600DAO dao = new SSExtn5600DAO();         
        ds = dao.selectExtn5610(dm);
        req.setAttribute("ds", ds);
    }
    
    public void insertExtn5620(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	
   	 	SS_SLS_EXTN_5620_IDataSet ds = null;

        //request process
   	 	String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
   	 	String subscrpt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscrpt_cd")));
   	 	String in_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("in_dt")));
   	 	String gb = Util.Uni2Ksc(Util.checkString(req.getParameter("gb")));
   	 	String pub_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pub_dt")));
   	 	   		
   		SS_SLS_EXTN_5620_IDM dm = new SS_SLS_EXTN_5620_IDM();
        dm.setIncmgpers(incmgpers);
        dm.setSubscrpt_cd(subscrpt_cd);
        dm.setIn_dt(in_dt);
        dm.setGb(gb);
        dm.setPub_dt(pub_dt);
        
        dm.print();

        SSExtn5600DAO dao = new SSExtn5600DAO();         
        ds = dao.insertExtn5620(dm);        
        req.setAttribute("ds", ds);
    }
    
    public void updateExtn5630(HttpServletRequest req, HttpServletResponse res) throws AppException {

   	 	SS_SLS_EXTN_5630_UDataSet ds = null;
        
   	 	String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
   	 	String subscrpt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscrpt_cd")));
   	 	String subscrpt_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("subscrpt_gb")));   	 	
   	 	String buyer_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("buyer_cd")));
   	 	String buyer_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("buyer_nm")));
   	 	String buyer_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("buyer_cmpy")));
   		String buyer_team = Util.Uni2Ksc(Util.checkString(req.getParameter("buyer_team")));
   		String buy_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("buy_amt")));
	   	String out_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("out_dt")));
	   	String gb = Util.Uni2Ksc(Util.checkString(req.getParameter("gb")));
   	 	   		
   		SS_SLS_EXTN_5630_UDM dm = new SS_SLS_EXTN_5630_UDM();
        dm.setIncmgpers(incmgpers);
        dm.setSubscrpt_cd(subscrpt_cd);
        dm.setSubscrpt_gb(subscrpt_gb);        
        dm.setBuyer_cd(buyer_cd);
        dm.setBuyer_nm(buyer_nm);
        dm.setBuyer_cmpy(buyer_cmpy);
        dm.setBuyer_team(buyer_team);
        dm.setBuy_amt(buy_amt);
        dm.setOut_dt(out_dt);
        dm.setGb(gb);
        
        dm.print();

        SSExtn5600DAO dao = new SSExtn5600DAO();         
        ds = dao.updateExtn5630(dm);
        req.setAttribute("ds", ds);
    }
}    