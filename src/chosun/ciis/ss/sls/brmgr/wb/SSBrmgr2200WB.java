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


public class SSBrmgr2200WB
{
  public void initBrmgr2200(HttpServletRequest req, HttpServletResponse res)
    throws AppException
  {
    SS_SLS_BRMGR_2200_ADataSet ds = null;
    
    String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
    String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

    SS_SLS_BRMGR_2200_ADM dm = new SS_SLS_BRMGR_2200_ADM();

    SSBrmgr2200DAO dao = new SSBrmgr2200DAO();
    dm.setCmpy_cd(cmpycd);
    dm.setIncmg_pers(emp_no);

    ds = dao.initBrmgr2200(dm);
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
  
  public void selectBrmgr2210(HttpServletRequest req, HttpServletResponse res)
	  throws AppException
	{
	  SS_SLS_BRMGR_2210_LDataSet ds = null;
	
	  String deptcd = Util.checkString(req.getParameter("deptcd"));
	  String partcd = Util.checkString(req.getParameter("partcd"));
	  String areacd = Util.checkString(req.getParameter("areacd"));
	  String bocd = Util.checkString(req.getParameter("bocd"));
	  String fr_yymm = Util.checkString(req.getParameter("fr_yymm"));
	  String to_yymm = Util.checkString(req.getParameter("to_yymm"));
	  String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
	  String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);
	
	  SS_SLS_BRMGR_2210_LDM dm = new SS_SLS_BRMGR_2210_LDM();
	  dm.setDeptcd(deptcd);
	  dm.setPartcd(partcd);
	  dm.setAreacd(areacd);
	  dm.setBocd(bocd);
	  dm.setFr_yymm(fr_yymm);
	  dm.setTo_yymm(to_yymm);
	  dm.setIncmgpers(emp_no);
	  dm.setCmpycd(cmpycd);
	  
	  dm.print();
	
	  SSBrmgr2200DAO dao = new SSBrmgr2200DAO();
	
	  ds = dao.selectBrmgr2210(dm);
	  req.setAttribute("ds", ds);
	}
  
  public void saveBrmgr2220(HttpServletRequest req, HttpServletResponse res)
	  throws AppException
	{
	  SS_SLS_BRMGR_2220_UDataSet ds = null;
	  SS_SLS_BRMGR_2220_UDM dm = new SS_SLS_BRMGR_2220_UDM();	  
	  
	  String incmgpers = Util.getSessionParameterValue(req, "uid", true);	  
	  
	  dm.setIncmgpers(incmgpers);
	  
	  String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate1"));
	  
	  Hashtable hash				= new Hashtable();
  	  if ( !"".equals(multiUpdateData) ){  	
	    	hash 					= getHashMultiUpdateData(multiUpdateData);
	    	             
	    	String yymm				= Util.checkString((String) hash.get("yymm"         ));           
	    	String bocd				= Util.checkString((String) hash.get("bocd"         ));
	    	String clsf1			= Util.checkString((String) hash.get("clsf1"        ));
	    	String clsf2			= Util.checkString((String) hash.get("clsf2"        ));
	    	String clsf3			= Util.checkString((String) hash.get("clsf3"        ));
	 	    
	    	dm.setYymm(yymm);
	    	dm.setBocd(bocd);
	    	dm.setClsf1(clsf1);
	  	    dm.setClsf2(clsf2);
	  	    dm.setClsf3(clsf3);
	    	
	   }  	  
	  dm.print();
	  
	  SSBrmgr2200DAO dao = new SSBrmgr2200DAO();
	  ds = dao.saveBrmgr2220(dm);
      req.setAttribute("ds", ds);	  
	}  
  
  public void createBrmgr2230(HttpServletRequest req, HttpServletResponse res)
	  throws AppException
	{
	  SS_SLS_BRMGR_2230_UDataSet ds = null;
	  SS_SLS_BRMGR_2230_UDM dm = new SS_SLS_BRMGR_2230_UDM();	  
	  
	  String incmgpers = Util.getSessionParameterValue(req, "uid", true);	 
	  String yymm = Util.checkString(req.getParameter("fr_yymm"));
	  String jobclsf = Util.checkString(req.getParameter("jobclsf"));
	  
	  dm.setIncmgpers(incmgpers);
	  dm.setYymm(yymm);
	  dm.setJobclsf(jobclsf);
	  
	  dm.print();
	  
	  SSBrmgr2200DAO dao = new SSBrmgr2200DAO();
	  ds = dao.createBrmgr2230(dm);
	  req.setAttribute("ds", ds);	  
	}  
}