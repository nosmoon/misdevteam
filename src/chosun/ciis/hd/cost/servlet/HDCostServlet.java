package chosun.ciis.hd.cost.servlet;

import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.hd.cost.wb.HD_COST_1000WB;
import java.io.IOException;
import java.io.PrintStream;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;

public class HDCostServlet extends BaseServlet
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
      String servletMappedUrl = "/hd/cost/";
      iPid = extractPid(req, servletMappedUrl);

      System.out.println("HDCostServlet : process : iPid : " + iPid);
      nextPage = executeWorker(req, res, iPid);
      System.out.println("HDCostServlet : process : nextPage : " + nextPage);
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
    HD_COST_1000WB wb = null;

    switch (pid) {
    case 1000:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1000_l(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_1000_l.jsp";
      break;
    case 1001:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1001_l(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_1001_l.jsp";
      break;
    case 1002:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1002_l(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_1002_l.jsp";
      break;
    case 1002500:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1002_500_l(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_1002_500_l.jsp";
      break;
    case 1003:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1003_a(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 1004:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1004_a(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 1100:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1100_l(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_1100_l.jsp";
      break;
    case 1101:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1101_a(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 1102:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1102_l(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_1102_l.jsp";
      break;
    case 1103:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1103_a(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_1103_a.jsp";

      break;
    case 1104:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1104_d(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 1200:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1200_l(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_1200_l.jsp";
      break;
    case 1201:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1201_l(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_1201_l.jsp";
      break;
    case 1202:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1202_a(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 1300:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1300_l(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_1300_l.jsp";
      break;
    case 1301:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1301_l(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_1301_l.jsp";
      break;
    case 1302:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1302_a(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 1303:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1303_l(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_1303_l.jsp";
      break;
    case 1400:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1400_l(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_1400_l.jsp";
      break;
    case 1401:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1401_l(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_1401_l.jsp";
      break;
    case 1402:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1402_a(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 1403:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1403_a(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 1404:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1404_m(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_1404_m.jsp";
      break;
    case 1500:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1500_a(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 1501:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1501_l(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_1501_l.jsp";
      break;
    case 1502:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1502_a(req, res);

      nextPage = "/jsp/hd/cost/hd_cost_1502_a.jsp";
      break;
    case 1503:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1503_d(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 1506:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1506_m(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_1506_m.jsp";
      break;
    case 1600:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1600_l(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_1600_l.jsp";
      break;
    case 1700:
        wb = new HD_COST_1000WB();
        wb.hd_cost_1700_l(req, res);
        nextPage = "/jsp/hd/cost/hd_cost_1700_l.jsp";
        break;
    case 1006:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1006_a(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 1007:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1007_l(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_1007_l.jsp";
      break;
    case 1008:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1008_m(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_1008_m.jsp";
      break;
    case 1009:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1009_m(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_1009_m.jsp";
      break;
    case 1105:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1105_a(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 1106:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1106_a(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 1108:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1108_a(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 1109:
      wb = new HD_COST_1000WB();
      wb.hd_cost_1109_m(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_1109_m.jsp";
      break;
    case 2002:
      wb = new HD_COST_1000WB();
      wb.hd_cost_2002_l(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_2002_l.jsp";
      break;
    case 2003:
      wb = new HD_COST_1000WB();
      wb.hd_cost_2003_a(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 2006:
      wb = new HD_COST_1000WB();
      wb.hd_cost_2006_a(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 2007:
      wb = new HD_COST_1000WB();
      wb.hd_cost_2007_l(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_2007_l.jsp";
      break;
    case 2100:
      wb = new HD_COST_1000WB();
      wb.hd_cost_2100_l(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_2100_l.jsp";
      break;
    case 2101:
      wb = new HD_COST_1000WB();
      wb.hd_cost_2101_a(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 2102:
      wb = new HD_COST_1000WB();
      wb.hd_cost_2102_l(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_2102_l.jsp";
      break;
    case 2103:
      wb = new HD_COST_1000WB();
      wb.hd_cost_2103_a(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_2103_a.jsp";

      break;
    case 2104:
      wb = new HD_COST_1000WB();
      wb.hd_cost_2104_d(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 2108:
      wb = new HD_COST_1000WB();
      wb.hd_cost_2108_a(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 3002:
      wb = new HD_COST_1000WB();
      wb.hd_cost_3002_l(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_3002_l.jsp";
      break;
    case 3003:
      wb = new HD_COST_1000WB();
      wb.hd_cost_3003_a(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 3006:
      wb = new HD_COST_1000WB();
      wb.hd_cost_3006_a(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 3100:
      wb = new HD_COST_1000WB();
      wb.hd_cost_3100_l(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_3100_l.jsp";
      break;
    case 3101:
      wb = new HD_COST_1000WB();
      wb.hd_cost_3101_a(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 3103:
      wb = new HD_COST_1000WB();
      wb.hd_cost_3103_a(req, res);
      nextPage = "/jsp/hd/cost/hd_cost_3103_a.jsp";

      break;
    case 3105:
      wb = new HD_COST_1000WB();
      wb.hd_cost_3105_a(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 3106:
      wb = new HD_COST_1000WB();
      wb.hd_cost_3106_a(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    case 3108:
      wb = new HD_COST_1000WB();
      wb.hd_cost_3108_a(req, res);
      nextPage = "/common/jsp/resultMsg.jsp";
      break;
    default:
      throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
    }

    return nextPage;
  }
}