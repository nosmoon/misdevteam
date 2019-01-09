/***************************************************************************************************
* 파일명 : SSExtn5100WB.java
* 기능 : 기업후원확장-직원수당 지급준비
* 작성일자 : 2016-10-04
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

public class SSExtn5100WB{
		
	public void selectExtn5110(HttpServletRequest req, HttpServletResponse res) throws AppException {

    	 SS_SLS_EXTN_5110_LDataSet ds = null;
         
    	 String fr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_yymm")));
    	 String to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("to_yymm")));
    	 String proc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_yn")));
    	     	 
    	 SS_SLS_EXTN_5110_LDM dm = new SS_SLS_EXTN_5110_LDM();
    	 dm.setFr_yymm(fr_yymm);
    	 dm.setTo_yymm(to_yymm);
    	 dm.setProc_yn(proc_yn);
    	 
    	 dm.print();

         SSExtn5100DAO dao = new SSExtn5100DAO();         
         ds = dao.selectExtn5110(dm);
         req.setAttribute("ds", ds);

    }
	
	public void selectExtn5120(HttpServletRequest req, HttpServletResponse res) throws AppException {

	   	 SS_SLS_EXTN_5120_LDataSet ds = null;
	     
	   	 String fr_yymm2 = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_yymm2")));
	   	 String to_yymm2 = Util.Uni2Ksc(Util.checkString(req.getParameter("to_yymm2")));
	   	 String rcpm_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_yn")));
	   	 
	   	 SS_SLS_EXTN_5120_LDM dm = new SS_SLS_EXTN_5120_LDM();
	   	 
	   	 dm.setFr_dt(fr_yymm2);
	   	 dm.setTo_dt(to_yymm2);
	   	 dm.setGubun(rcpm_yn);
	   	 
	   	 dm.print();

	     SSExtn5100DAO dao = new SSExtn5100DAO();         
	     ds = dao.selectExtn5120(dm);
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
    
    public void updateExtn5130(HttpServletRequest req, HttpServletResponse res) throws AppException {

   	 	SS_SLS_EXTN_5130_UDataSet ds = null;

    	//request process
   	 	String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
   	 	String proc_dt = Util.checkString(req.getParameter("proc_dt"));   	 	
   		String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate1"));
   		   		
   		SS_SLS_EXTN_5130_UDM dm = new SS_SLS_EXTN_5130_UDM();
    	
   		dm.setIncmgpers(incmgpers);
   		dm.setProc_dt(proc_dt);	    
   		
    	Hashtable hash				= new Hashtable();
    	if ( !"".equals(multiUpdateData) ){  	
  	    	hash 					= getHashMultiUpdateData(multiUpdateData);
  	    	
  	    	String regdt			= Util.checkString((String) hash.get("regdt"));      
  	    	String regno			= Util.checkString((String) hash.get("regno"));  	    	
  	    	String rcpm_slip_no		= Util.checkString((String) hash.get("rcpm_slip_no"));
  	    	String proc_yn			= Util.checkString((String) hash.get("proc_yn"));
  	    	
  	    	dm.setRegdt(regdt);
  	    	dm.setRegno(regno);
  	    	dm.setRcpm_slip_no(rcpm_slip_no);
  	    	dm.setProc_yn(proc_yn);
  	    }  	 
   	        
        dm.print();

        SSExtn5100DAO dao = new SSExtn5100DAO();         
        ds = dao.updateExtn5130(dm);
        req.setAttribute("ds", ds);
    }   
}    