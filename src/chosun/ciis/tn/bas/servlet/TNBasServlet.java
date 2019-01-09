package chosun.ciis.tn.bas.servlet;

import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.tn.bas.wb.TN_BAS_1000WB;
import java.io.IOException;
import java.io.PrintStream;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;

public class TNBasServlet extends BaseServlet
{
  public static final int ACT_ADD = 1;
  public static final int ACT_RMV = 0;

  public void process(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException
  {
    String requestURI = null;
    String strPid = null;
    int iPid = 0;
    String nextPage = null;
    try {
      String servletMappedUrl = "/tn/bas/";
      iPid = extractPid(req, servletMappedUrl);

      System.out.println("TNBasServlet : process : iPid : " + iPid);
      nextPage = executeWorker(req, res, iPid);
      System.out.println("TNBasServlet : process : nextPage : " + nextPage);
    }
    catch (AppException ae) {
      req.setAttribute("appException", ae);
      nextPage = "/common/jsp/app_error.jsp";
    }
    catch (SysException se) {
      req.setAttribute("sysException", se);
      nextPage = "/common/jsp/sys_error.jsp";
    }
    catch (Exception e) {
      req.setAttribute("sysException", new SysException(e));
      nextPage = "/common/jsp/sys_error.jsp";
    }

    RequestDispatcher rd = getServletContext().getRequestDispatcher(
      nextPage);
    rd.forward(req, res);
  }

  public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid)
    throws AppException, IOException
  {
    String nextPage = null;
    TN_BAS_1000WB wb = null;

    switch (pid) {
    case 1000:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_1000(req, res);
      nextPage = "/jsp/tn/bas/tn_bas_1000_l.jsp";
      break;
    case 1001:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_1001(req, res);
      nextPage = "/jsp/tn/bas/tn_bas_1001_l.jsp";
      break;
    case 1002:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_1002(req, res);

      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 1003:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_1003(req, res);

      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 1004:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_1004(req, res);

      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 1100:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_1100(req, res);
      nextPage = "/jsp/tn/bas/tn_bas_1100_m.jsp";
      break;
    case 1101:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_1101(req, res);
      System.out.println("1101");
      nextPage = "/jsp/tn/bas/tn_bas_1101_l.jsp";
      break;
    case 1102:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_1102(req, res);

      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 1103:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_1103(req, res);

      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 2000:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_2000(req, res);
      nextPage = "/jsp/tn/bas/tn_bas_2000_m.jsp";
      break;
    case 2001:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_2001(req, res);
      nextPage = "/jsp/tn/bas/tn_bas_2001_l.jsp";
      break;
    case 2002:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_2002(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 2003:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_2003(req, res);

      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 2100:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_2100(req, res);
      nextPage = "/jsp/tn/bas/tn_bas_2100_m.jsp";
      break;
    case 2101:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_2101(req, res);
      nextPage = "/jsp/tn/bas/tn_bas_2101_l.jsp";
      break;
    case 2102:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_2102(req, res);

      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 2103:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_2103(req, res);

      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 3000:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_3000(req, res);
      nextPage = "/jsp/tn/bas/tn_bas_3000_m.jsp";
      break;
    case 3001:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_3001(req, res);
      nextPage = "/jsp/tn/bas/tn_bas_3001_l.jsp";
      break;
    case 3002:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_3002(req, res);

      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 3003:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_3003(req, res);

      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 3100:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_3100(req, res);
      nextPage = "/jsp/tn/bas/tn_bas_3100_m.jsp";
      break;
    case 3102:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_3102(req, res);

      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 3103:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_3103(req, res);

      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 3101:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_3101(req, res);
      nextPage = "/jsp/tn/bas/tn_bas_3101_l.jsp";
      break;
    case 3200:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_3200(req, res);
      nextPage = "/jsp/tn/bas/tn_bas_3200_m.jsp";
      break;
    case 3201:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_3201(req, res);
      nextPage = "/jsp/tn/bas/tn_bas_3201_l.jsp";
      break;
    case 3202:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_3202(req, res);

      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 3203:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_3203(req, res);

      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 3300:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_3300(req, res);
      nextPage = "/jsp/tn/bas/tn_bas_3300_m.jsp";
      break;
    case 3301:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_3301(req, res);
      nextPage = "/jsp/tn/bas/tn_bas_3301_l.jsp";
      break;
    case 3302:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_3302(req, res);

      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 3303:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_3303(req, res);

      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 3400:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_3400(req, res);
      nextPage = "/jsp/tn/bas/tn_bas_3400_m.jsp";
      break;
    case 3401:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_3401(req, res);
      nextPage = "/jsp/tn/bas/tn_bas_3401_l.jsp";
      break;
    case 3402:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_3402(req, res);

      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 4000:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_4000(req, res);
      nextPage = "/jsp/tn/bas/tn_bas_4000_m.jsp";
      break;
    case 4001:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_4001(req, res);
      nextPage = "/jsp/tn/bas/tn_bas_4001_l.jsp";
      break;
    case 4002:
      wb = new TN_BAS_1000WB();
      wb.tn_bas_4002(req, res);

      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    default:
      throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
    }
    return nextPage;
  }
}