/***************************************************************************************************
* 파일명 : SSExtn4900WB.java
* 기능 : 기업후원확장-기업확장실적입력
* 작성일자 : 2016-06-15
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

public class SSExtn4900WB{
	
	public void initExtn4900(HttpServletRequest req, HttpServletResponse res) throws AppException {

	   	 SS_SLS_EXTN_4900_ADataSet ds = null;
	            	 
	   	 SS_SLS_EXTN_4900_ADM dm = new SS_SLS_EXTN_4900_ADM();
	   	
	   	 dm.print();
	
	        SSExtn4900DAO dao = new SSExtn4900DAO();         
	        ds = dao.initExtn4900(dm);
	        req.setAttribute("ds", ds);

    }
	
	public void selectExtn4901(HttpServletRequest req, HttpServletResponse res) throws AppException {

	   	 SS_SLS_EXTN_4901_LDataSet ds = null;
	        
	   	 String searchnm = Util.Uni2Ksc(Util.checkString(req.getParameter("searchnm")));
	   	 
	   	 SS_SLS_EXTN_4901_LDM dm = new SS_SLS_EXTN_4901_LDM();
	   	 dm.setSearchnm(searchnm);
	   	 
	   	 dm.print();
	
	     SSExtn4900DAO dao = new SSExtn4900DAO();         
	     ds = dao.selectExtn4901(dm);
	     req.setAttribute("ds", ds);

   }
	
	public void selectExtn4910(HttpServletRequest req, HttpServletResponse res) throws AppException {

    	 SS_SLS_EXTN_4910_LDataSet ds = null;
         
    	 String fr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_yymm")));
    	 String to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("to_yymm")));
    	 String dncomp = Util.Uni2Ksc(Util.checkString(req.getParameter("dncomp")));
    	 String adv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_nm")));
    	 String adv_cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_cmpycd")));
    	 String adv_officd = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_officd")));
    	 String adv_deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_deptcd")));
    	 
    	 SS_SLS_EXTN_4910_LDM dm = new SS_SLS_EXTN_4910_LDM();
    	 dm.setFr_yymm(fr_yymm);
    	 dm.setTo_yymm(to_yymm);
    	 dm.setDncomp(dncomp);
    	 dm.setAdv_nm(adv_nm);
    	 dm.setAdv_cmpycd(adv_cmpycd);
    	 dm.setAdv_officd(adv_officd);
    	 dm.setAdv_deptcd(adv_deptcd);
    	 
    	 dm.print();

         SSExtn4900DAO dao = new SSExtn4900DAO();         
         ds = dao.selectExtn4910(dm);
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
    
    public void updateExtn4920(HttpServletRequest req, HttpServletResponse res) throws AppException {

   	 	SS_SLS_EXTN_4920_IDataSet ds = null;

    	//request process
   	 	String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
   		
   		String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate1"));
   		   		
   		SS_SLS_EXTN_4920_IDM dm = new SS_SLS_EXTN_4920_IDM();
    	
   		dm.setIncmgpers			(incmgpers			);
   		
    	Hashtable hash				= new Hashtable();
    	if ( !"".equals(multiUpdateData) ){  	
  	    	hash 					= getHashMultiUpdateData(multiUpdateData);
  	    	
  	    	String mode				= Util.checkString((String) hash.get("m"));      
  	    	String yymm				= Util.checkString((String) hash.get("yymm"));
  	    	String dncomp			= Util.checkString((String) hash.get("dncomp"));
  	    	String adv_id			= Util.checkString((String) hash.get("adv_id"));  	    	
  	    	String adv_nm			= Util.checkString((String) hash.get("adv_nm"));
  	    	String medi_qty			= Util.checkString((String) hash.get("medi_qty"));
  	    	String mob_qty			= Util.checkString((String) hash.get("mob_qty"));
  	    	String medi_amt			= Util.checkString((String) hash.get("medi_amt"));
  	    	String mob_amt			= Util.checkString((String) hash.get("mob_amt"));
  	    	String regdt			= Util.checkString((String) hash.get("regdt"));
  	    	String regno			= Util.checkString((String) hash.get("regno"));
  	    	
  	    	dm.setMode(mode);
  	    	dm.setYymm(yymm);
  	    	dm.setDncomp(dncomp);
  	    	dm.setAdv_id(adv_id);
  	    	dm.setAdv_nm(adv_nm);
  	    	dm.setMedi_qty(medi_qty);
  	    	dm.setMob_qty(mob_qty);
  	    	dm.setMedi_amt(medi_amt);
  	    	dm.setMob_amt(mob_amt);
  	    	dm.setRegdt(regdt);
  	    	dm.setRegno(regno);
  	    }  	 
   	        
        dm.print();

        SSExtn4900DAO dao = new SSExtn4900DAO();         
        ds = dao.updateExtn4920(dm);
        req.setAttribute("ds", ds);
    }
    
    public void selectExtn4930(HttpServletRequest req, HttpServletResponse res) throws AppException {

   	 SS_SLS_EXTN_4930_LDataSet ds = null;
     
     String regdt = Util.checkString(req.getParameter("regdt"));
     String regno = Util.checkString(req.getParameter("regno"));
   	 
   	 SS_SLS_EXTN_4930_LDM dm = new SS_SLS_EXTN_4930_LDM();
   	 
   	 dm.setRegdt(regdt);
   	 dm.setRegno(regno);
   	 
   	 dm.print();

     SSExtn4900DAO dao = new SSExtn4900DAO();         
     ds = dao.selectExtn4930(dm);
     req.setAttribute("ds", ds);

   }   
}    