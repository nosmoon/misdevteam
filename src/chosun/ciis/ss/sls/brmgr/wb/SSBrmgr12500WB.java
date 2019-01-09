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


public class SSBrmgr12500WB
{

  public void mo_selectBrmgr2510(HttpServletRequest req, HttpServletResponse res) //모바일용
	  throws AppException
	{
	  SS_MO_SLS_BRMGR_2510_LDataSet ds = null;

	  String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
	  String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
	  String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
	  String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
	  String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
	  String fr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_yymm")));
	  String to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("to_yymm")));

	  SS_MO_SLS_BRMGR_2510_LDM dm = new SS_MO_SLS_BRMGR_2510_LDM();

	  dm.setDeptcd(deptcd);
	  dm.setPartcd(partcd);
	  dm.setAreacd(areacd);
	  dm.setBocd(bocd);
	  dm.setIncmg_pers(incmg_pers);
	  dm.setFr_yymm(fr_yymm);
	  dm.setTo_yymm(to_yymm);

	  dm.print();

	  SSBrmgr12500DAO dao = new SSBrmgr12500DAO();
	  ds = dao.mo_selectBrmgr2510(dm);

	  req.setAttribute("ds", ds);
	}


  public void mo_selectBrmgr2511(HttpServletRequest req, HttpServletResponse res) //모바일용
		  throws AppException
		{
		  SS_MO_SLS_BRMGR_2511_LDataSet ds = null;

		  String bocd = Util.checkString(req.getParameter("bocd"));
		  String deptcd = Util.checkString(req.getParameter("deptcd"));
		  String partcd = Util.checkString(req.getParameter("partcd"));
		  String areacd = Util.checkString(req.getParameter("areacd"));
		  String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		  String fr_yymm = Util.checkString(req.getParameter("fr_yymm"));
		  String to_yymm = Util.checkString(req.getParameter("to_yymm"));

		  SS_MO_SLS_BRMGR_2511_LDM dm = new SS_MO_SLS_BRMGR_2511_LDM();
		  dm.setBocd(bocd);
		  dm.setDeptcd(deptcd);
		  dm.setPartcd(partcd);
		  dm.setAreacd(areacd);
		  dm.setIncmg_pers(incmg_pers);
		  dm.setFr_yymm(fr_yymm);
		  dm.setTo_yymm(to_yymm);

		  dm.print();

		  SSBrmgr12500DAO dao = new SSBrmgr12500DAO();
		  ds = dao.mo_selectBrmgr2511(dm);

		  req.setAttribute("ds", ds);
		}

  public void mo_selectBrmgr2512(HttpServletRequest req, HttpServletResponse res) //모바일용
		  throws AppException
		{
		  SS_MO_SLS_BRMGR_2512_LDataSet ds = null;

		  String deptcd = Util.checkString(req.getParameter("deptcd"));
		  String partcd = Util.checkString(req.getParameter("partcd"));
		  String areacd = Util.checkString(req.getParameter("areacd"));
		  String bocd = Util.checkString(req.getParameter("bocd"));
		  String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		  String fr_yymm = Util.checkString(req.getParameter("fr_yymm"));
		  String to_yymm = Util.checkString(req.getParameter("to_yymm"));

		  SS_MO_SLS_BRMGR_2512_LDM dm = new SS_MO_SLS_BRMGR_2512_LDM();

		  dm.setDeptcd(deptcd);
		  dm.setPartcd(partcd);
		  dm.setAreacd(areacd);
		  dm.setBocd(bocd);
		  dm.setIncmg_pers(incmg_pers);
		  dm.setFr_yymm(fr_yymm);
		  dm.setTo_yymm(to_yymm);


		  dm.print();

		  SSBrmgr12500DAO dao = new SSBrmgr12500DAO();
		  ds = dao.mo_selectBrmgr2512(dm);

		  req.setAttribute("ds", ds);
		}

  public void mo_selectBrmgr2513(HttpServletRequest req, HttpServletResponse res) //모바일용
		  throws AppException
		{
		  SS_MO_SLS_BRMGR_2513_LDataSet ds = null;

		  String deptcd = Util.checkString(req.getParameter("deptcd"));
		  String partcd = Util.checkString(req.getParameter("partcd"));
		  String areacd = Util.checkString(req.getParameter("areacd"));
		  String bocd = Util.checkString(req.getParameter("bocd"));
		  String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		  String fr_yymm = Util.checkString(req.getParameter("fr_yymm"));
		  String to_yymm = Util.checkString(req.getParameter("to_yymm"));

		  SS_MO_SLS_BRMGR_2513_LDM dm = new SS_MO_SLS_BRMGR_2513_LDM();

		  dm.setDeptcd(deptcd);
		  dm.setPartcd(partcd);
		  dm.setAreacd(areacd);
		  dm.setBocd(bocd);
		  dm.setIncmg_pers(incmg_pers);
		  dm.setFr_yymm(fr_yymm);
		  dm.setTo_yymm(to_yymm);


		  dm.print();

		  SSBrmgr12500DAO dao = new SSBrmgr12500DAO();
		  ds = dao.mo_selectBrmgr2513(dm);

		  req.setAttribute("ds", ds);
		}

  public void mo_selectBrmgr2514(HttpServletRequest req, HttpServletResponse res) //모바일용
		  throws AppException
		{
		  SS_MO_SLS_BRMGR_2514_LDataSet ds = null;

		  String deptcd = Util.checkString(req.getParameter("deptcd"));
		  String partcd = Util.checkString(req.getParameter("partcd"));
		  String areacd = Util.checkString(req.getParameter("areacd"));
		  String bocd = Util.checkString(req.getParameter("bocd"));
		  String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		  String fr_yymm = Util.checkString(req.getParameter("fr_yymm"));
		  String to_yymm = Util.checkString(req.getParameter("to_yymm"));

		  SS_MO_SLS_BRMGR_2514_LDM dm = new SS_MO_SLS_BRMGR_2514_LDM();

		  dm.setDeptcd(deptcd);
		  dm.setPartcd(partcd);
		  dm.setAreacd(areacd);
		  dm.setBocd(bocd);
		  dm.setIncmg_pers(incmg_pers);
		  dm.setFr_yymm(fr_yymm);
		  dm.setTo_yymm(to_yymm);


		  dm.print();

		  SSBrmgr12500DAO dao = new SSBrmgr12500DAO();
		  ds = dao.mo_selectBrmgr2514(dm);

		  req.setAttribute("ds", ds);
		}



}