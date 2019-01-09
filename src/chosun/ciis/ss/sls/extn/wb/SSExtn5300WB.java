/***************************************************************************************************
* 파일명 : SSExtn5300WB.java
* 기능 : 기업후원확장-구독배정내역(제휴)
* 작성일자 : 2017-10-11
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

public class SSExtn5300WB{
	
	/**
     * 초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initExtn5300(HttpServletRequest req, HttpServletResponse res) throws AppException {

    	 SS_SLS_EXTN_5300_ADataSet ds = null;

         //request process
         String bocd = Util.checkString(req.getParameter("bocd"));
         String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
         String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

         SS_SLS_EXTN_5300_ADM dm = new SS_SLS_EXTN_5300_ADM();
         dm.setBocd(bocd);
         dm.setCmpy_cd(cmpycd);
         dm.setIncmg_pers(emp_no);

         SSExtn5300DAO dao = new SSExtn5300DAO();         
         ds = dao.initExtn5300(dm);
         req.setAttribute("ds", ds);

    }

    public void selectExtn5310(HttpServletRequest req, HttpServletResponse res) throws AppException {

    	 SS_SLS_EXTN_5310_LDataSet ds = null;
         
    	 String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
    	 String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
    	 String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
    	 String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));    	 
         String fryymm = Util.checkString(req.getParameter("fryymm"));
    	 String toyymm = Util.checkString(req.getParameter("toyymm"));
    	 String incmgpers = Util.getSessionParameterValue(req, "emp_no", true);
         String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);
    	 
    	 
    	 SS_SLS_EXTN_5310_LDM dm = new SS_SLS_EXTN_5310_LDM();
    	 dm.setDeptcd(deptcd);
    	 dm.setPartcd(partcd);
    	 dm.setAreacd(areacd);
    	 dm.setBocd(bocd);
    	 dm.setFryymm(fryymm);
    	 dm.setToyymm(toyymm);
    	 dm.setIncmgpers(incmgpers);
    	 dm.setCmpycd(cmpycd);
    	 
    	 dm.print();

         SSExtn5300DAO dao = new SSExtn5300DAO();         
         ds = dao.selectExtn5310(dm);
         req.setAttribute("ds", ds);

    }
    
    public final String ROW_SEPARATOR = "|";
    public final String COL_SEPARATOR = "#";
    
    public Hashtable getHashMultiUpdateData(String multiUpdateData) throws AppException {
      	Hashtable 	hash	= new Hashtable();
      	
      	try{
        	String[][] temp_arr = null;
        	
        	StringTokenizer st = new StringTokenizer(multiUpdateData, ROW_SEPARATOR);
        	
        	int rowCount  = 0;
        	int colCount  = st.countTokens();
        	int col = 0;
        	int row = 0;
        	while(st.hasMoreTokens()){
        		row = 0;
        		String token 	 	= st.nextToken();
        		String[] token_arr 	= token.split(COL_SEPARATOR);
        		if(temp_arr == null){
        			rowCount = token_arr.length;
        			temp_arr = new String[rowCount][colCount];
        		}
        		for(int i=0; i<token_arr.length; i++){
        			temp_arr[row++][col] = token_arr[i];
        		}
        		col++;
        	}
        	for(int i=0; i<temp_arr.length; i++){
        		StringBuffer sb = new StringBuffer();
        		String header   = temp_arr[i][0];
        		for(int j=1; j<temp_arr[i].length; j++){
        			sb.append(StringUtil.nvl(temp_arr[i][j]));
        			if(j<temp_arr[i].length-1){
        				sb.append(COL_SEPARATOR);
        			}
        		}        		
        		hash.put(header, sb.toString());
        	}        	
      	}catch(Exception e){
      		throw new AppException("BaseWB.getHashMultiUpdateData", e.getLocalizedMessage()+ multiUpdateData);
      	}
      	return hash;   
    }
    
    public void updateExtn5320(HttpServletRequest req, HttpServletResponse res) throws AppException {

   	 	SS_SLS_EXTN_5320_UDataSet ds = null;

    	//request process
   	 	String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
   		
   		String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate1"));
   		   		
   		SS_SLS_EXTN_5320_UDM dm = new SS_SLS_EXTN_5320_UDM();
    	
   		dm.setIncmgpers			(incmgpers			);
   		
    	Hashtable hash				= new Hashtable();
    	if ( !"".equals(multiUpdateData) ){  	
  	    	hash 					= getHashMultiUpdateData(multiUpdateData);
  	    	            
  	    	String valmm			= Util.checkString((String) hash.get("valmm"));
  	    	String bocd				= Util.checkString((String) hash.get("bocd"));
  	    	String meda_amt			= Util.checkString((String) hash.get("meda_amt"));  	    	
  	    	
  	    	dm.setValmm(valmm);
  	    	dm.setBocd(bocd);
  	    	dm.setMeda_amt(meda_amt);
  	    }  	 
   	        
        dm.print();

        SSExtn5300DAO dao = new SSExtn5300DAO();         
        ds = dao.updateExtn5320(dm);
        req.setAttribute("ds", ds);
    }
    
    public void selectExtn5330(HttpServletRequest req, HttpServletResponse res) throws AppException {

   	 SS_SLS_EXTN_5330_LDataSet ds = null;
     
     String valmm = Util.checkString(req.getParameter("valmm"));
     String bocd = Util.checkString(req.getParameter("bocd"));
   	 
   	 SS_SLS_EXTN_5330_LDM dm = new SS_SLS_EXTN_5330_LDM();
   	 
   	 dm.setBocd(bocd);
   	 dm.setValmm(valmm);   	 
   	 
   	 dm.print();

     SSExtn5300DAO dao = new SSExtn5300DAO();         
     ds = dao.selectExtn5330(dm);
     req.setAttribute("ds", ds);

   }
    
    public void updateExtn5340(HttpServletRequest req, HttpServletResponse res) throws AppException {

      	 SS_SLS_EXTN_5340_UDataSet ds = null;
        
      	String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
        String valmm = Util.checkString(req.getParameter("fryymm"));
        String clos = Util.checkString(req.getParameter("clos"));
        String paydt = Util.checkString(req.getParameter("paydt"));
      	 
        SS_SLS_EXTN_5340_UDM dm = new SS_SLS_EXTN_5340_UDM();
      	 
      	 dm.setIncmgpers(incmgpers);
      	 dm.setValmm(valmm);
      	 dm.setClos(clos);
      	 dm.setPaydt(paydt);
      	 
      	 dm.print();

        SSExtn5300DAO dao = new SSExtn5300DAO();         
        ds = dao.updateExtn5340(dm);
        req.setAttribute("ds", ds);

      }
}    