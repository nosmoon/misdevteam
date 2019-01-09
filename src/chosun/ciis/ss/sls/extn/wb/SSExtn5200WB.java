/***************************************************************************************************
* 파일명 : SSExtn5200WB.java
* 기능 : 기업후원확장-직원수당 지급처리
* 작성일자 : 2016-10-05
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

public class SSExtn5200WB{
		
	public void selectExtn5210(HttpServletRequest req, HttpServletResponse res) throws AppException {

    	 SS_SLS_EXTN_5210_LDataSet ds = null;
         
    	 String proc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_dt")));
    	     	     	 
    	 SS_SLS_EXTN_5210_LDM dm = new SS_SLS_EXTN_5210_LDM();
    	 dm.setFr_dt(proc_dt);
    	     	 
    	 dm.print();

         SSExtn5200DAO dao = new SSExtn5200DAO();         
         ds = dao.selectExtn5210(dm);
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
    
    public void updateExtn5220(HttpServletRequest req, HttpServletResponse res) throws AppException {

   	 	SS_SLS_EXTN_5220_UDataSet ds = null;

    	//request process
   	 	String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디   	 	
   		String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate1"));
   		String proc_dt				= Util.checkString(req.getParameter("proc_dt"	));
   		   		
   		SS_SLS_EXTN_5220_UDM dm = new SS_SLS_EXTN_5220_UDM();
    	
   		dm.setIncmgpers(incmgpers);
   		dm.setProc_dt(proc_dt);
   		
    	Hashtable hash				= new Hashtable();
    	if ( !"".equals(multiUpdateData) ){  	
  	    	hash 					= getHashMultiUpdateData(multiUpdateData);
  	    	
  	    	String regdt			= Util.checkString((String) hash.get("regdt"));      
  	    	String regno			= Util.checkString((String) hash.get("regno"));  	    	
  	    	String empseq			= Util.checkString((String) hash.get("empseq"));
  	    	String medi_amt			= Util.checkString((String) hash.get("medi_amt"));
  	    	String mob_amt			= Util.checkString((String) hash.get("mob_amt"));
  	    	String tax1				= Util.checkString((String) hash.get("tax1"));
  	    	String tax2				= Util.checkString((String) hash.get("tax2"));
  	    	String tax3				= Util.checkString((String) hash.get("tax3"));
  	    	
  	    	dm.setRegdt(regdt);
  	    	dm.setRegno(regno);
  	    	dm.setEmpseq(empseq);
  	    	dm.setMedi_amt(medi_amt);
  	    	dm.setMob_amt(mob_amt);
  	    	dm.setTax1(tax1);
  	    	dm.setTax2(tax2);
  	    	dm.setTax3(tax3);
  	    }  	 
   	        
        dm.print();

        SSExtn5200DAO dao = new SSExtn5200DAO();         
        ds = dao.updateExtn5220(dm);
        req.setAttribute("ds", ds);
    }     
    
    public void updateExtn5230(HttpServletRequest req, HttpServletResponse res) throws AppException {

   	 	SS_SLS_EXTN_5230_UDataSet ds = null;

    	//request process
	   	String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);
	    String incmg_pers	  		= Util.getSessionParameterValue(req, "emp_no", true);
	    String incmg_pers_ip   	 	= Util.checkString(req.getRemoteAddr());
	    String clos_yn				= Util.checkString(req.getParameter("clos_yn"	)); 
	    String proc_dt				= Util.checkString(req.getParameter("proc_dt"	));
	    String draft_doc_no			= Util.checkString(req.getParameter("draft_doc_no"	));
	    String draft_dept_cd		= Util.checkString(req.getParameter("draft_dept_cd"	));
	    String draft_expn_amt		= Util.checkString(req.getParameter("draft_expn_amt"	));
   		   		
   		SS_SLS_EXTN_5230_UDM dm = new SS_SLS_EXTN_5230_UDM();
    	
   		dm.setCmpy_cd(cmpy_cd);
   		dm.setIncmg_pers(incmg_pers);
   		dm.setIncmg_pers_ip(incmg_pers_ip);
   		dm.setClos_yn(clos_yn);
   		dm.setProc_dt(proc_dt);
   		dm.setDraft_doc_no(draft_doc_no);
   		dm.setDraft_dept_cd(draft_dept_cd);
   		dm.setDraft_expn_amt(draft_expn_amt);
   		
        dm.print();

        SSExtn5200DAO dao = new SSExtn5200DAO();         
        ds = dao.updateExtn5230(dm);
        req.setAttribute("ds", ds);
    }     
}    