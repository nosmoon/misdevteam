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


public class SSBrmgr2700WB
{
  public void initBrmgr2700(HttpServletRequest req, HttpServletResponse res)
    throws AppException
  {
    SS_SLS_BRMGR_2700_ADataSet ds = null;
    
    String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
    String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

    SS_SLS_BRMGR_2700_ADM dm = new SS_SLS_BRMGR_2700_ADM();

    SSBrmgr2700DAO dao = new SSBrmgr2700DAO();
    dm.setCmpy_cd(cmpycd);
    dm.setIncmg_pers(emp_no);

    ds = dao.initBrmgr2700(dm);
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
  
  public void selectBrmgr2710(HttpServletRequest req, HttpServletResponse res)
	  throws AppException
	{
	  SS_SLS_BRMGR_2710_LDataSet ds = null;
	
	  String deptcd = Util.checkString(req.getParameter("deptcd"));	  
	  String fr_yymm = Util.checkString(req.getParameter("fr_yymm"));
	  String to_yymm = Util.checkString(req.getParameter("to_yymm"));
	  String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
	  String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);
	
	  SS_SLS_BRMGR_2710_LDM dm = new SS_SLS_BRMGR_2710_LDM();
	  dm.setDeptcd(deptcd);	  
	  dm.setFr_yymm(fr_yymm);
	  dm.setTo_yymm(to_yymm);
	  dm.setIncmgpers(emp_no);
	  dm.setCmpycd(cmpycd);
	  
	  dm.print();
	
	  SSBrmgr2700DAO dao = new SSBrmgr2700DAO();
	
	  ds = dao.selectBrmgr2710(dm);
	  req.setAttribute("ds", ds);
	}
  public void selectBrmgr2720(HttpServletRequest req, HttpServletResponse res)
	  throws AppException
	{
	  SS_SLS_BRMGR_2720_SDataSet ds = null;
	
	  String yymm = Util.checkString(req.getParameter("yymm"));
	  String deptcd = Util.checkString(req.getParameter("deptcd"));
	  String clsf = Util.checkString(req.getParameter("clsf"));
	  
	  SS_SLS_BRMGR_2720_SDM dm = new SS_SLS_BRMGR_2720_SDM();
	  
	  dm.setYymm(yymm);
	  dm.setDeptcd(deptcd);
	  dm.setClsf(clsf);
	  
	  dm.print();
	
	  SSBrmgr2700DAO dao = new SSBrmgr2700DAO();
	
	  ds = dao.selectBrmgr2720(dm);
	  req.setAttribute("ds", ds);
	}
    
  public void updateBrmgr2730(HttpServletRequest req, HttpServletResponse res)
	  throws AppException
	{
	  SS_SLS_BRMGR_2730_UDataSet ds = null;
	  SS_SLS_BRMGR_2730_UDM dm = new SS_SLS_BRMGR_2730_UDM();	  
	  
	  String incmgpers = Util.getSessionParameterValue(req, "uid", true);
	  String mode = Util.checkString(req.getParameter("mode"));
	  String yymm = Util.checkString(req.getParameter("yymm"));
	  String deptcd = Util.checkString(req.getParameter("deptcd"));
	  String clsf = Util.checkString(req.getParameter("clsf"));
	  String point_min = Util.checkString(req.getParameter("point_min"));
	  String point_max = Util.checkString(req.getParameter("point_max"));
	  
	  dm.setMode(mode);
	  dm.setIncmgpers(incmgpers);
	  dm.setYymm(yymm);
	  dm.setDeptcd(deptcd);
	  dm.setClsf(clsf);
	  dm.setPoint_min(point_min);
	  dm.setPoint_max(point_max);
	  
	  dm.print();
	  
	  SSBrmgr2700DAO dao = new SSBrmgr2700DAO();
	  ds = dao.updateBrmgr2730(dm);
      req.setAttribute("ds", ds);	  
	}  
/* 
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
*/	  
}