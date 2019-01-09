/***************************************************************************************************
* 파일명 : SSExtn5500WB.java
* 기능 : 확장수당공지
* 작성일자 : 2017-10-31
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

public class SSExtn5500WB{

    /**
     * 초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initExtn5500(HttpServletRequest req, HttpServletResponse res) throws AppException {

    	 SS_SLS_EXTN_5500_ADataSet ds = null;

         //request process
         //String bocd = Util.checkString(req.getParameter("bocd"));
         String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
         String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

         SS_SLS_EXTN_5500_ADM dm = new SS_SLS_EXTN_5500_ADM();
         //dm.setBocd(bocd);
         dm.setCmpy_cd(cmpycd);
         dm.setIncmg_pers(emp_no);

         SSExtn5500DAO dao = new SSExtn5500DAO();         
         ds = dao.initExtn5500(dm);
         req.setAttribute("ds", ds);

    }
        
    public void uploadExtn5510(HttpServletRequest req, HttpServletResponse res) throws AppException {

   	 	SS_SLS_EXTN_5510_IDataSet ds = null;

        //request process
   	 	String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
   	 	String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
   	 	String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
   	 	String extnaloncd = Util.Uni2Ksc(Util.checkString(req.getParameter("extnaloncd")));
   	 	String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
   	 		
        SS_SLS_EXTN_5510_IDM dm = new SS_SLS_EXTN_5510_IDM();
        dm.setIncmgpers(incmgpers);
        dm.setYymm(yymm);
        dm.setBocd(bocd);
        dm.setExtnaloncd(extnaloncd);
        dm.setAmt(amt);
        
        dm.print();

        SSExtn5500DAO dao = new SSExtn5500DAO();         
        ds = dao.uploadExtn5510(dm);
        req.setAttribute("ds", ds);
    }
    
    public void selectExtn5520(HttpServletRequest req, HttpServletResponse res) throws AppException {

   	 	SS_SLS_EXTN_5520_LDataSet ds = null;

        //request process
   	 	String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
   	 	String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
   	 	String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
   	 	String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
   	 	String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
   	 	String extnaloncd = Util.Uni2Ksc(Util.checkString(req.getParameter("extnaloncd")));
   	 	   		
   		SS_SLS_EXTN_5520_LDM dm = new SS_SLS_EXTN_5520_LDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setYymm(yymm);
        dm.setExtnaloncd(extnaloncd);
        
        dm.print();

        SSExtn5500DAO dao = new SSExtn5500DAO();         
        ds = dao.selectExtn5520(dm);
        req.setAttribute("ds", ds);
    }
    
    public void deleteExtn5530(HttpServletRequest req, HttpServletResponse res) throws AppException {

   	 	SS_SLS_EXTN_5530_DDataSet ds = null;
        
   	 	String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
   	 	String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
   	 	   		
   		SS_SLS_EXTN_5530_DDM dm = new SS_SLS_EXTN_5530_DDM();
        dm.setIncmgpers(incmgpers);
        dm.setYymm(yymm);
        
        dm.print();

        SSExtn5500DAO dao = new SSExtn5500DAO();         
        ds = dao.deleteExtn5530(dm);
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
}    