/***************************************************************************************************
* 파일명 : SSExtn5000WB.java
* 기능 : 기업후원확장-확장자 배정
* 작성일자 : 2016-06-20
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

public class SSExtn5000WB{
	
	public void initExtn5000(HttpServletRequest req, HttpServletResponse res) throws AppException {

	   	 SS_SLS_EXTN_5000_ADataSet ds = null;
	            	 
	   	 SS_SLS_EXTN_5000_ADM dm = new SS_SLS_EXTN_5000_ADM();
	   	
	   	 dm.print();
	
	        SSExtn5000DAO dao = new SSExtn5000DAO();         
	        ds = dao.initExtn5000(dm);
	        req.setAttribute("ds", ds);

   }
	
	public void selectExtn5010(HttpServletRequest req, HttpServletResponse res) throws AppException {

    	 SS_SLS_EXTN_5010_LDataSet ds = null;
         
    	 String fr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_yymm")));
    	 String to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("to_yymm")));
    	 String dncomp = Util.Uni2Ksc(Util.checkString(req.getParameter("dncomp")));
    	 String adv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_nm")));
    	 String adv_cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_cmpycd")));
    	 String adv_officd = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_officd")));
    	 String adv_deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_deptcd")));
    	 
    	 SS_SLS_EXTN_5010_LDM dm = new SS_SLS_EXTN_5010_LDM();
    	 dm.setFr_yymm(fr_yymm);
    	 dm.setTo_yymm(to_yymm);
    	 dm.setDncomp(dncomp);
    	 dm.setAdv_nm(adv_nm);
    	 dm.setAdv_cmpycd(adv_cmpycd);
    	 dm.setAdv_officd(adv_officd);
    	 dm.setAdv_deptcd(adv_deptcd);
    	 
    	 dm.print();

         SSExtn5000DAO dao = new SSExtn5000DAO();         
         ds = dao.selectExtn5010(dm);
         req.setAttribute("ds", ds);

    }
	
	public void selectExtn5020(HttpServletRequest req, HttpServletResponse res) throws AppException {

	   	 SS_SLS_EXTN_5020_LDataSet ds = null;
	     
	     String regdt = Util.checkString(req.getParameter("regdt"));
	     String regno = Util.checkString(req.getParameter("regno"));
	   	 
	   	 SS_SLS_EXTN_5020_LDM dm = new SS_SLS_EXTN_5020_LDM();
	   	 
	   	 dm.setRegdt(regdt);
	   	 dm.setRegno(regno);
	   	 
	   	 dm.print();

	     SSExtn5000DAO dao = new SSExtn5000DAO();         
	     ds = dao.selectExtn5020(dm);
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
    
    public void updateExtn5030(HttpServletRequest req, HttpServletResponse res) throws AppException {

   	 	SS_SLS_EXTN_5030_IDataSet ds = null;

    	//request process
   	 	String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
   	 	String regdt = Util.checkString(req.getParameter("regdt"));
   	 	String regno = Util.checkString(req.getParameter("regno"));
   		String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate1"));
   		   		
   		SS_SLS_EXTN_5030_IDM dm = new SS_SLS_EXTN_5030_IDM();
    	
   		dm.setIncmgpers(incmgpers);
   		dm.setRegdt(regdt);
	    dm.setRegno(regno);
   		
    	Hashtable hash				= new Hashtable();
    	if ( !"".equals(multiUpdateData) ){  	
  	    	hash 					= getHashMultiUpdateData(multiUpdateData);
  	    	
  	    	String mode				= Util.checkString((String) hash.get("m"));      
  	    	String empseq			= Util.checkString((String) hash.get("empseq"));  	    	
  	    	String medi_qty			= Util.checkString((String) hash.get("medi_qty"));
  	    	String mob_qty			= Util.checkString((String) hash.get("mob_qty"));
  	    	
  	    	dm.setMode(mode);
  	    	dm.setEmpseq(empseq);
  	    	dm.setMedi_qty(medi_qty);
  	    	dm.setMob_qty(mob_qty);  	    	
  	    }  	 
   	        
        dm.print();

        SSExtn5000DAO dao = new SSExtn5000DAO();         
        ds = dao.updateExtn5030(dm);
        req.setAttribute("ds", ds);
    }
    
    public void excelExtn5040(HttpServletRequest req, HttpServletResponse res) throws AppException {

	   	 SS_SLS_EXTN_5040_LDataSet ds = null;
	        
	   	 String fr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_yymm")));
	   	 String to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("to_yymm")));
	   	 String dncomp = Util.Uni2Ksc(Util.checkString(req.getParameter("dncomp")));
	   	 String adv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_nm")));
	   	 String adv_cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_cmpycd")));
	   	 String adv_officd = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_officd")));
	   	 String adv_deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_deptcd")));
	   	 
	   	 SS_SLS_EXTN_5040_LDM dm = new SS_SLS_EXTN_5040_LDM();
	   	 dm.setFr_yymm(fr_yymm);
	   	 dm.setTo_yymm(to_yymm);
	   	 dm.setDncomp(dncomp);
	   	 dm.setAdv_nm(adv_nm);
	   	 dm.setAdv_cmpycd(adv_cmpycd);
	   	 dm.setAdv_officd(adv_officd);
	   	 dm.setAdv_deptcd(adv_deptcd);
	   	 
	   	 dm.print();
	
	     SSExtn5000DAO dao = new SSExtn5000DAO();         
	     ds = dao.excelExtn5040(dm);
	     req.setAttribute("ds", ds);

   }
}    