/***************************************************************************************************
* 파일명 : SSExtn4700WB.java
* 기능 : 기업후원확장-수입처리
* 작성일자 : 2016-03-28
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

public class SSExtn4700WB{

    public void selectExtn4710(HttpServletRequest req, HttpServletResponse res) throws AppException {

    	 SS_SLS_EXTN_4710_LDataSet ds = null;
         
    	 String dncomp = Util.checkString(req.getParameter("dncomp"));
    	 String ern = Util.checkString(req.getParameter("ern"));
    	 String budg_cd = Util.checkString(req.getParameter("budg_cd"));
    	 String from_make_dt = Util.checkString(req.getParameter("from_make_dt"));
    	 String to_make_dt = Util.checkString(req.getParameter("to_make_dt"));
    	 String aprvyn = Util.checkString(req.getParameter("aprvyn"));
    	 
    	 SS_SLS_EXTN_4710_LDM dm = new SS_SLS_EXTN_4710_LDM();
    	 dm.setDncomp(dncomp);
    	 dm.setErn(ern);
    	 dm.setBudg_cd(budg_cd);
    	 dm.setFrom_make_dt(from_make_dt);
    	 dm.setTo_make_dt(to_make_dt);
    	 dm.setAprvyn(aprvyn);
    	 
    	 dm.print();

         SSExtn4700DAO dao = new SSExtn4700DAO();         
         ds = dao.selectExtn4710(dm);
         req.setAttribute("ds", ds);

    }
    
    public void selectExtn4720(HttpServletRequest req, HttpServletResponse res) throws AppException {

	   	 SS_SLS_EXTN_4720_LDataSet ds = null;
	        
	   	 String slip_occr_dt_fr = Util.checkString(req.getParameter("slip_occr_dt_fr"));
	   	 String slip_occr_dt_to = Util.checkString(req.getParameter("slip_occr_dt_to"));
	   	 String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
	   	 String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
	   	 
	   	 SS_SLS_EXTN_4720_LDM dm = new SS_SLS_EXTN_4720_LDM();
	   	 dm.setSlip_occr_dt_fr(slip_occr_dt_fr);
	   	 dm.setSlip_occr_dt_to(slip_occr_dt_to);
	   	 dm.setDlco_cd(dlco_cd);
	   	 dm.setDlco_nm(dlco_nm);
	   	 
	   	 dm.print();
	
	     SSExtn4700DAO dao = new SSExtn4700DAO();         
	     ds = dao.selectExtn4720(dm);
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
    
    public void updateExtn4730(HttpServletRequest req, HttpServletResponse res) throws AppException {

   	 	SS_SLS_EXTN_4730_UDataSet ds = null;

    	//request process
   	 	String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
   		
   		String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate1"));
   		   		
   		SS_SLS_EXTN_4730_UDM dm = new SS_SLS_EXTN_4730_UDM();
    	
   		dm.setIncmgpers			(incmgpers			);
   		
    	Hashtable hash				= new Hashtable();
    	if ( !"".equals(multiUpdateData) ){  	
  	    	hash 					= getHashMultiUpdateData(multiUpdateData);
  	    	            
  	    	String slip_clsf_cd		= Util.checkString((String) hash.get("slip_clsf_cd"));
  	    	String slip_occr_dt		= Util.checkString((String) hash.get("slip_occr_dt"));
  	    	String slip_seq			= Util.checkString((String) hash.get("slip_seq"));  	    	
  	    	String exp_slip_clsf_cd = Util.checkString((String) hash.get("exp_slip_clsf_cd"));
  	    	String exp_slip_occr_dt	= Util.checkString((String) hash.get("exp_slip_occr_dt"));
  	    	String exp_slip_seq		= Util.checkString((String) hash.get("exp_slip_seq"));
  	    	String exp_slip_no		= Util.checkString((String) hash.get("exp_slip_no"));
  	    	
  	    	dm.setSlip_clsf_cd(slip_clsf_cd);
  	    	dm.setSlip_occr_dt(slip_occr_dt);
  	    	dm.setSlip_seq(slip_seq);
  	    	dm.setExp_slip_clsf_cd(exp_slip_clsf_cd);
  	    	dm.setExp_slip_occr_dt(exp_slip_occr_dt);
  	    	dm.setExp_slip_seq(exp_slip_seq);
  	    	dm.setExp_slip_no(exp_slip_no);
  	    }  	 
   	        
        dm.print();

        SSExtn4700DAO dao = new SSExtn4700DAO();         
        ds = dao.updateExtn4730(dm);
        req.setAttribute("ds", ds);
    }
}    