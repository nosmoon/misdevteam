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


public class SSBrmgr2600WB
{
  public void initBrmgr2600(HttpServletRequest req, HttpServletResponse res)
    throws AppException
  {
    SS_SLS_BRMGR_2600_ADataSet ds = null;
    
    SS_SLS_BRMGR_2600_ADM dm = new SS_SLS_BRMGR_2600_ADM();

    SSBrmgr2600DAO dao = new SSBrmgr2600DAO();
   
    ds = dao.initBrmgr2600(dm);
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
  
  public void selectBrmgr2610(HttpServletRequest req, HttpServletResponse res)
	  throws AppException
	{
	  SS_SLS_BRMGR_2610_LDataSet ds = null;
	
	  String deptcd = Util.checkString(req.getParameter("deptcd"));
	  String partcd = Util.checkString(req.getParameter("partcd"));
	  String areacd = Util.checkString(req.getParameter("areacd"));
	  String bocd = Util.checkString(req.getParameter("bocd"));
	  String mode = Util.checkString(req.getParameter("mode"));
	  	
	  SS_SLS_BRMGR_2610_LDM dm = new SS_SLS_BRMGR_2610_LDM();
	  dm.setDeptcd(deptcd);
	  dm.setPartcd(partcd);
	  dm.setAreacd(areacd);
	  dm.setBocd(bocd);
	  dm.setCrm_usepers_type(mode);
		  
	  dm.print();
	
	  SSBrmgr2600DAO dao = new SSBrmgr2600DAO();
	
	  ds = dao.selectBrmgr2610(dm);
	  req.setAttribute("ds", ds);
	}
  
  public void saveBrmgr2620(HttpServletRequest req, HttpServletResponse res)
	  throws AppException
	{
	  SS_SLS_BRMGR_2620_UDataSet ds = null;
	  SS_SLS_BRMGR_2620_UDM dm = new SS_SLS_BRMGR_2620_UDM();	  
	 
	  String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate1"));
	  
	  Hashtable hash				= new Hashtable();
  	  if ( !"".equals(multiUpdateData) ){  	
	    	hash 					= getHashMultiUpdateData(multiUpdateData);
	    	           
	    	String acct_cd		= Util.checkString((String) hash.get("acct_cd"     ));
	    	String mode			= Util.checkString((String) hash.get("cmode"        ));
	    	
	    	dm.setAcct_cd(acct_cd);
	    	dm.setMode(mode);
	   }  	  
	  dm.print();
	  
	  SSBrmgr2600DAO dao = new SSBrmgr2600DAO();
	  ds = dao.saveBrmgr2620(dm);
      req.setAttribute("ds", ds);	  
	}   
}