/***************************************************************************************************
* 파일명 : SSExtn2280EJB.java
* 기능 : 일괄확장등록을 위한 Worker Bean
* 작성일자 : 2011-03-30
* 작성자 : 김태희
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
import java.util.*;

import javax.servlet.http.*;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 확장현황-일괄확장등록을 위한 WB
 */

public class SSExtn2280WB{ 
	
    /**
     * 확장현황-일괄확장-조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void listBatchExtnJob(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_BATCH_EXTNDataSet ds = null;
    	
    	String rdr_no_list = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
		String reqqty_list = Util.Uni2Ksc(Util.checkString(req.getParameter("subsqty")));

		System.out.println(rdr_no_list);
		System.out.println(reqqty_list);
    	
        // DM Setting
    	SS_L_BATCH_EXTNDM dm = new SS_L_BATCH_EXTNDM();
        
    	dm.setRdr_no_list(rdr_no_list);
    	  
    	SSExtn2280DAO dao = new SSExtn2280DAO();    	

        // DAO 객체의 selectExtnMovmList 호출
    	ds = dao.listBatchExtnJob(dm);
    	req.setAttribute("ds", ds);	 
    	
    }


    /**
     * 확장현황-일괄확장등록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void batchExtnJob(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_A_BATCH_EXTNDataSet ds = null;

      // Request Parameter Processing
		String chkno       = Util.Uni2Ksc(Util.checkString(req.getParameter("chkno")));
		String rdr_no_list = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
		String reqqty_list = Util.Uni2Ksc(Util.checkString(req.getParameter("subsqty")));
		String incmgpers   = Util.getSessionParameterValue(req, "uid", true);
    	
		String chknoTkStr = "";
		String rdrNoTkStr = "";
		String qtyTkStr = "";
		
		String ftRdr_no_list = "";
		String ftReqqty_list = "";
		
		Vector arrChk       = new Vector();
		
		int i=0;
		int frIdx = 0;
		int toIdx = 0;
		
		while(chkno.length()>0) {
			
			toIdx = chkno.indexOf("##");
			if (toIdx > 0)
				chknoTkStr = chkno.substring(frIdx, toIdx);
			else
				chknoTkStr = chkno.substring(frIdx);
			if (!chknoTkStr.equals("0")) {
				arrChk.add(new Integer(i));
			}
			chkno = chkno.substring(toIdx+2);
			i++;
		}


		StringTokenizer rdr_no_listToken = new StringTokenizer(rdr_no_list, "##");
		int ind = 0;
		while(rdr_no_listToken.hasMoreTokens()) {
			rdrNoTkStr = rdr_no_listToken.nextToken();
			if (arrChk.contains(new Integer(ind))) {
				//System.out.println(rdrNoTkStr);
				ftRdr_no_list +=rdrNoTkStr+"##";
			}
			ind++;
		}

		
		ind = 0;
		StringTokenizer reqqty_listToken = new StringTokenizer(reqqty_list, "##");			
		while(reqqty_listToken.hasMoreTokens()) {
			qtyTkStr = reqqty_listToken.nextToken();
			if (arrChk.contains(new Integer(ind))) {
				//System.out.println(qtyTkStr);
				ftReqqty_list +=qtyTkStr+"##";
			}
			ind++;
		}

		System.out.println(incmgpers+"\n");
		System.out.println(ftRdr_no_list+"\n");
		System.out.println(ftReqqty_list+"\n");				
    	
      // DM Setting
    	SS_A_BATCH_EXTNDM dm = new SS_A_BATCH_EXTNDM();
        
		dm.setRdr_no_list(ftRdr_no_list);
		dm.setReqqty_list(ftReqqty_list);
		dm.setIncmgpers(incmgpers);
    	
    	SSExtn2280DAO dao = new SSExtn2280DAO();
    	
      // DAO 객체의 selectExtnMovmList 호출
    	ds = dao.batchExtnJob(dm);
    	req.setAttribute("ds", ds);
        
        /*
        SSExtn2280EJBHome home = (SSExtn2200EJBHome)JNDIManager.getInstance().getHome("SSExtn2280EJB");
        try{
            SSExtn2200EJB ejb = home.create();
            ds = ejb.extnBosuspclosUpdate(dm);
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
    
    public void listIMTM(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_IMTMDataSet ds = null;
    	
    	
    	String fryy = Util.Uni2Ksc(Util.checkString(req.getParameter("fryy")));
		String toyy = Util.Uni2Ksc(Util.checkString(req.getParameter("toyy")));

		System.out.println(fryy);
		System.out.println(toyy);
    	
        // DM Setting
		SS_L_IMTMDM dm = new SS_L_IMTMDM();
        
		dm.setFrdt(fryy);
    	dm.setTodt(toyy);
    	  
    	SSExtn2280DAO dao = new SSExtn2280DAO();    	

        // DAO 객체의 selectExtnMovmList 호출
    	ds = dao.IMTM(dm);
    	req.setAttribute("ds", ds);	 
    	
    }
}

