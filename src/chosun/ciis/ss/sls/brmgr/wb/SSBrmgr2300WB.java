package chosun.ciis.ss.sls.brmgr.wb;

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
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.dao.*;


public class SSBrmgr2300WB
{
  public void initBrmgr2300(HttpServletRequest req, HttpServletResponse res)
    throws AppException
  {
    SS_SLS_BRMGR_2300_ADataSet ds = null;
    
    String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
    String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

    SS_SLS_BRMGR_2300_ADM dm = new SS_SLS_BRMGR_2300_ADM();

    SSBrmgr2300DAO dao = new SSBrmgr2300DAO();
    dm.setCmpy_cd(cmpycd);
    dm.setIncmg_pers(emp_no);

    ds = dao.initBrmgr2300(dm);
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
  
  public void selectBrmgr2310(HttpServletRequest req, HttpServletResponse res)
	  throws AppException
	{
	  SS_SLS_BRMGR_2310_LDataSet ds = null;
	
	  String deptcd = Util.checkString(req.getParameter("deptcd"));	  
	  String fr_yymm = Util.checkString(req.getParameter("fr_yymm"));
	  String to_yymm = Util.checkString(req.getParameter("to_yymm"));
	  String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
	  String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);
	
	  SS_SLS_BRMGR_2310_LDM dm = new SS_SLS_BRMGR_2310_LDM();
	  dm.setDeptcd(deptcd);	  
	  dm.setFr_yymm(fr_yymm);
	  dm.setTo_yymm(to_yymm);
	  dm.setIncmgpers(emp_no);
	  dm.setCmpycd(cmpycd);
	  
	  dm.print();
	
	  SSBrmgr2300DAO dao = new SSBrmgr2300DAO();
	
	  ds = dao.selectBrmgr2310(dm);
	  req.setAttribute("ds", ds);
	}
    
  public void saveBrmgr2320(HttpServletRequest req, HttpServletResponse res)
	  throws AppException
	{
	  SS_SLS_BRMGR_2320_UDataSet ds = null;
	  SS_SLS_BRMGR_2320_UDM dm = new SS_SLS_BRMGR_2320_UDM();	  
	  
	  String incmgpers = Util.getSessionParameterValue(req, "uid", true);	  
	  
	  dm.setIncmgpers(incmgpers);
	  
	  String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate1"));
	  
	  Hashtable hash				= new Hashtable();
  	  if ( !"".equals(multiUpdateData) ){  	
	    	hash 					= getHashMultiUpdateData(multiUpdateData);
	    	             
	    	String yymm				= Util.checkString((String) hash.get("yymm"         ));           
	    	String deptcd			= Util.checkString((String) hash.get("deptcd"       ));
	    	String clsf				= Util.checkString((String) hash.get("clsf"         ));
	    	String rate_a_min		= Util.checkString((String) hash.get("rate_a_min"   ));
	    	String rate_a_max		= Util.checkString((String) hash.get("rate_a_max"   ));
	    	String rate_a_point		= Util.checkString((String) hash.get("rate_a_point" ));
	    	String rate_b_min		= Util.checkString((String) hash.get("rate_b_min"   ));
	    	String rate_b_max		= Util.checkString((String) hash.get("rate_b_max"   ));
	    	String rate_b_point		= Util.checkString((String) hash.get("rate_b_point" ));
	    	String rate_c_min		= Util.checkString((String) hash.get("rate_c_min"   ));
	    	String rate_c_max		= Util.checkString((String) hash.get("rate_c_max"   ));
	    	String rate_c_point		= Util.checkString((String) hash.get("rate_c_point" ));
	    	String rate_d_min		= Util.checkString((String) hash.get("rate_d_min"   ));
	    	String rate_d_max		= Util.checkString((String) hash.get("rate_d_max"   ));
	    	String rate_d_point		= Util.checkString((String) hash.get("rate_d_point" ));
	    	String add_point		= Util.checkString((String) hash.get("add_point"    ));
	 	    
	    	dm.setYymm(yymm);
	    	dm.setDeptcd(deptcd);
	    	dm.setClsf(clsf);
	  	    dm.setRate_a_min(rate_a_min);
	  	    dm.setRate_a_max(rate_a_max);
	  	    dm.setRate_a_point(rate_a_point);
	  	    dm.setRate_b_min(rate_b_min);
	  	    dm.setRate_b_max(rate_b_max);
	  	    dm.setRate_b_point(rate_b_point);
	  	    dm.setRate_c_min(rate_c_min);
	  	    dm.setRate_c_max(rate_c_max);
	  	    dm.setRate_c_point(rate_c_point);
	  	    dm.setRate_d_min(rate_d_min);
	  	    dm.setRate_d_max(rate_d_max);
	  	    dm.setRate_d_point(rate_d_point);
	  	    dm.setAdd_point(add_point);
	   }  	  
	  dm.print();
	  
	  SSBrmgr2300DAO dao = new SSBrmgr2300DAO();
	  ds = dao.saveBrmgr2320(dm);
      req.setAttribute("ds", ds);	  
	}  
 
  public void createBrmgr2330(HttpServletRequest req, HttpServletResponse res)
	  throws AppException
	{
	  SS_SLS_BRMGR_2330_UDataSet ds = null;
	  SS_SLS_BRMGR_2330_UDM dm = new SS_SLS_BRMGR_2330_UDM();	  
	  
	  String incmgpers = Util.getSessionParameterValue(req, "uid", true);	 
	  String yymm = Util.checkString(req.getParameter("fr_yymm"));
	  String jobclsf = Util.checkString(req.getParameter("jobclsf"));
	  
	  dm.setIncmgpers(incmgpers);
	  dm.setYymm(yymm);
	  dm.setJobclsf(jobclsf);
	  
	  dm.print();
	  
	  SSBrmgr2300DAO dao = new SSBrmgr2300DAO();
	  ds = dao.createBrmgr2330(dm);
	  req.setAttribute("ds", ds);	  
	}
	  
}