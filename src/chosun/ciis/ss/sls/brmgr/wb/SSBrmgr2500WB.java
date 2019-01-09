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


public class SSBrmgr2500WB
{
  public void initBrmgr2500(HttpServletRequest req, HttpServletResponse res)
    throws AppException
    {
	    SS_SLS_BRMGR_2500_ADataSet ds = null;
	    
	    String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
	    String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);
	
	    SS_SLS_BRMGR_2500_ADM dm = new SS_SLS_BRMGR_2500_ADM();
	    
	    dm.setCmpy_cd(cmpycd);
	    dm.setIncmg_pers(emp_no);
	
	    SSBrmgr2500DAO dao = new SSBrmgr2500DAO();
	
	    ds = dao.initBrmgr2500(dm);
	    req.setAttribute("ds", ds);
	}

  public void selectBrmgr2510(HttpServletRequest req, HttpServletResponse res)
	  throws AppException
	{
	  SS_SLS_BRMGR_2510_LDataSet ds = null;
	
	  String deptcd = Util.checkString(req.getParameter("deptcd"));
	  String partcd = Util.checkString(req.getParameter("partcd"));
	  String areacd = Util.checkString(req.getParameter("areacd"));
	  String bocd = Util.checkString(req.getParameter("bocd"));
	  String fr_yymm = Util.checkString(req.getParameter("fr_yymm"));
	  String to_yymm = Util.checkString(req.getParameter("to_yymm"));
	  String medicd = Util.checkString(req.getParameter("medicd"));
	  String boclsf = Util.checkString(req.getParameter("boclsf"));
	  String sell_net_clsf = Util.checkString(req.getParameter("sellnetclsf"));
	  String orderby = Util.checkString(req.getParameter("orderby"));
	  String orderby2 = Util.checkString(req.getParameter("orderby2"));
	  String area_avg = Util.checkString(req.getParameter("area_avg"));
	  String prx_excp = Util.checkString(req.getParameter("prx_excp"));
	  String boclsf_ar = Util.checkString(req.getParameter("boclsf_ar"));
	  String d_stat_ar = Util.checkString(req.getParameter("d_stat_ar"));
	  String schlevel = Util.checkString(req.getParameter("schlevel"));
	  String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
	  String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);
	
	  SS_SLS_BRMGR_2510_LDM dm = new SS_SLS_BRMGR_2510_LDM();
	  dm.setDeptcd(deptcd);
	  dm.setPartcd(partcd);
	  dm.setAreacd(areacd);
	  dm.setBocd(bocd);
	  dm.setFr_yymm(fr_yymm);
	  dm.setTo_yymm(to_yymm);
	  dm.setMedicd(medicd);
	  dm.setBoclsf(boclsf);
	  dm.setSell_net_clsf(sell_net_clsf);
	  dm.setOrderby(orderby);
	  dm.setOrderby2(orderby2);
	  dm.setArea_avg(area_avg);
	  dm.setPrx_excp(prx_excp);
	  dm.setBoclsf_ar(boclsf_ar);
	  dm.setD_stat_ar(d_stat_ar);
	  dm.setSchlevel(schlevel);
	  dm.setIncmgpers(emp_no);
	  dm.setCmpycd(cmpycd);
	  
	  dm.print();
	
	  SSBrmgr2500DAO dao = new SSBrmgr2500DAO();
	
	  ds = dao.selectBrmgr2510(dm);
	  req.setAttribute("ds", ds);
	} 
}