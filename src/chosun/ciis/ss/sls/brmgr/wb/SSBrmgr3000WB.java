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


public class SSBrmgr3000WB
{
  public void initBrmgr3000(HttpServletRequest req, HttpServletResponse res)
    throws AppException
  {
    SS_SLS_BRMGR_3000_MDataSet ds = null;
    
    String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
    String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

    SS_SLS_BRMGR_3000_MDM dm = new SS_SLS_BRMGR_3000_MDM();

    SSBrmgr3000DAO dao = new SSBrmgr3000DAO();
    dm.setCmpy_cd(cmpycd);
    dm.setIncmg_pers(emp_no);

    ds = dao.initBrmgr2800(dm);
    req.setAttribute("ds", ds);
  }
  
  public void selectBrmgr3010(HttpServletRequest req, HttpServletResponse res)
	  throws AppException
	{
	  SS_SLS_BRMGR_3010_LDataSet ds = null;
	
	  String deptcd = Util.checkString(req.getParameter("deptcd"));
	  String partcd = Util.checkString(req.getParameter("partcd"));
	  String areacd = Util.checkString(req.getParameter("areacd"));
	  String bocd = Util.checkString(req.getParameter("bocd"));
	  String issu_dt = Util.checkString(req.getParameter("issu_dt"));	  
	  String medi_cd = Util.checkString(req.getParameter("medi_cd"));
	  String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
	  String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);
	  
	  SS_SLS_BRMGR_3010_LDM dm = new SS_SLS_BRMGR_3010_LDM();
	  dm.setDeptcd(deptcd);
	  dm.setPartcd(partcd);
	  dm.setAreacd(areacd);
	  dm.setBocd(bocd);
	  dm.setIssu_dt(issu_dt);	  
	  dm.setMedi_cd(medi_cd);
	  dm.setIncmgpers(emp_no);
	  dm.setCmpycd(cmpycd);
	  
	  dm.print();
	
	  SSBrmgr3000DAO dao = new SSBrmgr3000DAO();
	
	  ds = dao.selectBrmgr3010(dm);
	  req.setAttribute("ds", ds);
	}
  
  public void createBrmgr3020(HttpServletRequest req, HttpServletResponse res)
	  throws AppException
	{
	  SS_SLS_BRMGR_3020_IDataSet ds = null;
	  SS_SLS_BRMGR_3020_IDM dm = new SS_SLS_BRMGR_3020_IDM();	  
	  
	  String incmgpers = Util.getSessionParameterValue(req, "uid", true);	 
	  String issu_dt = Util.checkString(req.getParameter("issu_dt"));
	  String medi_cd = Util.checkString(req.getParameter("medi_cd"));
	  String accflag = Util.checkString(req.getParameter("accflag"));
	  
	  dm.setIncmgpers(incmgpers);
	  dm.setIssu_dt(issu_dt);
	  dm.setMedi_cd(medi_cd);
	  dm.setAccflag(accflag);	  
	  
	  dm.print();
	  
	  SSBrmgr3000DAO dao = new SSBrmgr3000DAO();
	  ds = dao.createBrmgr3020(dm);
	  req.setAttribute("ds", ds);	  
	}
  
  public void updateBrmgr3030(HttpServletRequest req, HttpServletResponse res)
	  throws AppException
	{
	  SS_SLS_BRMGR_3030_UDataSet ds = null;
	  SS_SLS_BRMGR_3030_UDM dm = new SS_SLS_BRMGR_3030_UDM();	  
	  
	  String incmgpers = Util.getSessionParameterValue(req, "uid", true);	  
	  
	  dm.setIncmgpers(incmgpers);
	  
	  String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate1"));
	  
	  Hashtable hash				= new Hashtable();
		  if ( !"".equals(multiUpdateData) ){  	
	    	hash 					= getHashMultiUpdateData(multiUpdateData);
	    	             
	    	String bocd				= Util.checkString((String) hash.get("bocd"      ));
	    	String resv_qty				= Util.checkString((String) hash.get("resv_qty"   ));
	    	String icdc_qty				= Util.checkString((String) hash.get("icdc_qty"   ));
	    	String issu_dt				= Util.checkString((String) hash.get("issu_dt"	  ));
	    	String medi_cd				= Util.checkString((String) hash.get("medi_cd"    ));
	    		 	    
	    	dm.setBocd(bocd);
	    	dm.setResv_qty(resv_qty);
	    	dm.setIcdc_qty(icdc_qty);
	    	dm.setIssu_dt(issu_dt);
	    	dm.setMedicd(medi_cd);
	   }  	  
	  dm.print();
	  
	  SSBrmgr3000DAO dao = new SSBrmgr3000DAO();
	  ds = dao.updateBrmgr3030(dm);
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