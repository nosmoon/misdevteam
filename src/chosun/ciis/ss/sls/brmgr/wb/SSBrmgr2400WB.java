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


public class SSBrmgr2400WB
{
  public void initBrmgr2400(HttpServletRequest req, HttpServletResponse res)
    throws AppException
  {
    SS_SLS_BRMGR_2400_ADataSet ds = null;
    
    String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
    String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

    SS_SLS_BRMGR_2400_ADM dm = new SS_SLS_BRMGR_2400_ADM();
    
    dm.setCmpy_cd(cmpycd);
    dm.setIncmg_pers(emp_no);

    SSBrmgr2400DAO dao = new SSBrmgr2400DAO();

    ds = dao.initBrmgr2400(dm);
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
  
  public void selectBrmgr2410(HttpServletRequest req, HttpServletResponse res)
	  throws AppException
	{
	  SS_SLS_BRMGR_2410_LDataSet ds = null;
	
	  String deptcd = Util.checkString(req.getParameter("deptcd"));
	  String partcd = Util.checkString(req.getParameter("partcd"));
	  String areacd = Util.checkString(req.getParameter("areacd"));
	  String bocd = Util.checkString(req.getParameter("bocd"));
	  String fr_yymm = Util.checkString(req.getParameter("fr_yymm"));
	  String to_yymm = Util.checkString(req.getParameter("to_yymm"));
	  String schlevel = Util.checkString(req.getParameter("schlevel"));
	  String boclsf = Util.checkString(req.getParameter("boclsf"));
	  String schflag = Util.checkString(req.getParameter("schflag"));
	  String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
	  String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);
	  String boclsf_ar = Util.checkString(req.getParameter("boclsf_ar"));
	
	  SS_SLS_BRMGR_2410_LDM dm = new SS_SLS_BRMGR_2410_LDM();
	  dm.setDeptcd(deptcd);
	  dm.setPartcd(partcd);
	  dm.setAreacd(areacd);
	  dm.setBocd(bocd);
	  dm.setFr_yymm(fr_yymm);
	  dm.setTo_yymm(to_yymm);
	  dm.setSchlevel(schlevel);
	  dm.setBoclsf(boclsf);
	  dm.setBoclsf_ar(boclsf_ar);
	  dm.setSchflag(schflag);
	  dm.setIncmgpers(emp_no);
	  dm.setCmpycd(cmpycd);
	  
	  dm.print();
	
	  SSBrmgr2400DAO dao = new SSBrmgr2400DAO();
	
	  ds = dao.selectBrmgr2410(dm);
	  req.setAttribute("ds", ds);
	}
    
  public void saveBrmgr2420(HttpServletRequest req, HttpServletResponse res)
	  throws AppException
	{
	  SS_SLS_BRMGR_2420_UDataSet ds = null;
	  SS_SLS_BRMGR_2420_UDM dm = new SS_SLS_BRMGR_2420_UDM();	  
	  
	  String incmgpers = Util.getSessionParameterValue(req, "uid", true);	  
	  
	  dm.setIncmgpers(incmgpers);
	  
	  String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate1"));
	  
	  Hashtable hash				= new Hashtable();
  	  if ( !"".equals(multiUpdateData) ){  	
	    	hash 					= getHashMultiUpdateData(multiUpdateData);
	    	             
	    	String yymm				= Util.checkString((String) hash.get("yymm"         ));           
	    	String areacd			= Util.checkString((String) hash.get("areacd"       ));
	    	String bocd				= Util.checkString((String) hash.get("bocd"         ));
	    	String sale_dscn_amt	= Util.checkString((String) hash.get("sale_dscn_amt"   ));
	    	String remk				= Util.checkString((String) hash.get("remk"		    ));
	    		 	    
	    	dm.setYymm(yymm);
	    	dm.setAreacd(areacd);
	    	dm.setBocd(bocd);
	  	    dm.setSale_dscn_amt(sale_dscn_amt);
	  	    dm.setRemk(remk);	  	    
	   }  	  
	  dm.print();
	  
	  SSBrmgr2400DAO dao = new SSBrmgr2400DAO();
	  ds = dao.saveBrmgr2420(dm);
      req.setAttribute("ds", ds);	  
	}  
  
  public void createBrmgr2430(HttpServletRequest req, HttpServletResponse res)
	  throws AppException
	{
	  SS_SLS_BRMGR_2430_UDataSet ds = null;
	  SS_SLS_BRMGR_2430_UDM dm = new SS_SLS_BRMGR_2430_UDM();	  
	  
	  String incmgpers = Util.getSessionParameterValue(req, "uid", true);	 
	  String yymm = Util.checkString(req.getParameter("fr_yymm"));
	  String jobclsf = Util.checkString(req.getParameter("jobclsf"));
	  
	  dm.setIncmgpers(incmgpers);
	  dm.setYymm(yymm);
	  dm.setJobclsf(jobclsf);
	  
	  dm.print();
	  
	  SSBrmgr2400DAO dao = new SSBrmgr2400DAO();
	  ds = dao.createBrmgr2430(dm);
	  req.setAttribute("ds", ds);	  
	}	 
  
  public void selectBrmgr2440(HttpServletRequest req, HttpServletResponse res)
	  throws AppException
	{
	  SS_SLS_BRMGR_2440_LDataSet ds = null;
	  
	  String bocd = Util.checkString(req.getParameter("bocd"));
	  String yymm = Util.checkString(req.getParameter("yymm"));
	  
	  SS_SLS_BRMGR_2440_LDM dm = new SS_SLS_BRMGR_2440_LDM();
	  
	  dm.setBocd(bocd);
	  dm.setYymm(yymm);
	  	  
	  dm.print();
	
	  SSBrmgr2400DAO dao = new SSBrmgr2400DAO();
	
	  ds = dao.selectBrmgr2440(dm);
	  req.setAttribute("ds", ds);
	}
}