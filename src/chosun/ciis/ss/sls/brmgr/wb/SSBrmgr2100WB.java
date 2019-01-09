package chosun.ciis.ss.sls.brmgr.wb;

import chosun.ciis.ss.sls.brmgr.dao.SSBrmgr2100DAO;
import chosun.ciis.ss.sls.brmgr.dm.SS_L_BO_PROXYDM;
import chosun.ciis.ss.sls.brmgr.dm.SS_L_BO_PROXY_INITDM;
import chosun.ciis.ss.sls.brmgr.ds.SS_L_BO_PROXYDataSet;
import chosun.ciis.ss.sls.brmgr.ds.SS_L_BO_PROXY_INITDataSet;
import java.io.PrintStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import somo.framework.expt.AppException;
import somo.framework.util.Util;

public class SSBrmgr2100WB
{
  public void initBoProxy(HttpServletRequest req, HttpServletResponse res)
    throws AppException
  {
    SS_L_BO_PROXY_INITDataSet ds = null;

    SS_L_BO_PROXY_INITDM dm = new SS_L_BO_PROXY_INITDM();

    SSBrmgr2100DAO dao = new SSBrmgr2100DAO();

    ds = dao.initBoProxy(dm);
    req.setAttribute("ds", ds);
  }

  public void selectBoProxyList(HttpServletRequest req, HttpServletResponse res)
    throws AppException
  {
    SS_L_BO_PROXYDataSet ds = null;

    String deptcd = Util.checkString(req.getParameter("deptcd"));
    String partcd = Util.checkString(req.getParameter("partcd"));
    String areacd = Util.checkString(req.getParameter("areacd"));
    String bocd = Util.checkString(req.getParameter("bocd"));
    String regdt1 = Util.checkString(req.getParameter("regdt1"));
    String regdt2 = Util.checkString(req.getParameter("regdt2"));

    System.out.println("deptcd:" + deptcd);
    System.out.println("partcd:" + partcd);
    System.out.println("areacd:" + areacd);
    System.out.println("bocd:" + bocd);
    System.out.println("regdt1:" + regdt1);
    System.out.println("regdt2:" + regdt2);

    SS_L_BO_PROXYDM dm = new SS_L_BO_PROXYDM();
    dm.setDeptcd(deptcd);
    dm.setPartcd(partcd);
    dm.setAreacd(areacd);
    dm.setBocd(bocd);
    dm.setRegdt1(regdt1);
    dm.setRegdt2(regdt2);

    SSBrmgr2100DAO dao = new SSBrmgr2100DAO();

    ds = dao.selectBoProxyList(dm);
    req.setAttribute("ds", ds);
  }
}