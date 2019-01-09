/***************************************************************************************************
 * 파일명 : 
 * 기능 : 
 * 작성일자 : 
 * 작성자 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.en.innexp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.en.innexp.wb.EN_INNEXP_1000WB;
import chosun.ciis.en.innexp.wb.EN_INNEXP_2000WB;
import chosun.ciis.en.innexp.wb.EN_INNEXP_3000WB;

public class ENInnexpServlet extends BaseServlet {


    public static final int ACT_ADD = 1;
    public static final int ACT_RMV = 0;
    /**
     * 상속하는 ControllerServlet 의 doGet, doPost 메소드에서 호출된다.<br>
     * 요청된 URL을 파싱하여 pid를 얻어 excuteWorker()를 호출하며,<br>
     * 리턴된 nextPage로 request를 forward한다.
     *
     * @param req request
     * @param res response
     * @throws IOException
     * @throws ServletException
     */

    public void process(HttpServletRequest req, HttpServletResponse res) throws
        ServletException, IOException {
        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/en/innexp/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("ENInnexpServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("ENInnexpServlet : process : nextPage : " + nextPage);
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

    /**
     * SEBasWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
     * 메소드를 호출한다.
     * 결과에 따라 nextPage를 반환한다.
     *
     * @param req request
     * @param res response
     * @param pid process id
     * @return forward할 nextPage
     * @throws SysException
     * @throws AppException
     */

    public String executeWorker(HttpServletRequest req, HttpServletResponse res,
                                int pid) throws AppException, IOException {
        String nextPage = null;
        EN_INNEXP_1000WB wb1 = null;
        EN_INNEXP_2000WB wb2 = null;
        EN_INNEXP_3000WB wb3 = null;
        
        switch (pid) {
			case ENInnexpWBMapping.EN_INNEXP_1000:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1000_m(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1000_m.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1001:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1001_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1001_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1002:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1002_s(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1002_s.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1003:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1003_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1003_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1004:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1004_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1004_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1005:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1005_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1005_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1006:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1006_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1006_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1007:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1007_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1007_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1008:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1008_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1008_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1009:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1009_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1009_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1010:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1010_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1020:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1020_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
			case ENInnexpWBMapping.EN_INNEXP_1011:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1011_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1011_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1012:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1012_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1012_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1013:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1013_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1013_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1014:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1014_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1014_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1015:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1015_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1015_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1016:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1016_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1016_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1017:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1017_m(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1017_m.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1019:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1019_m(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1019_m.jsp";
				break;

			case ENInnexpWBMapping.EN_INNEXP_1100:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1100_m(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1100_m.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1101:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1101_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1101_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1102:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1102_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1102_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1103:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1103_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;

			case ENInnexpWBMapping.EN_INNEXP_1301:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1301_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1301_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1302:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1302_i(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1303:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1303_u(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1305:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1305_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1305_l.jsp";
				break;		

			case ENInnexpWBMapping.EN_INNEXP_1401:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1401_m(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1401_m.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1402:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1402_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1402_l.jsp";
				break;

			case ENInnexpWBMapping.EN_INNEXP_1501:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1501_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1501_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1502:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1502_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1502_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1503:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1503_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1503_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1504:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1504_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1504_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_1505:
				wb1 = new EN_INNEXP_1000WB();
				((EN_INNEXP_1000WB)wb1).en_innexp_1505_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_1505_l.jsp";
				break;

				
			case ENInnexpWBMapping.EN_INNEXP_2001:
				wb2 = new EN_INNEXP_2000WB();
				((EN_INNEXP_2000WB)wb2).en_innexp_2001_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_2001_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_2002:
				wb2 = new EN_INNEXP_2000WB();
				((EN_INNEXP_2000WB)wb2).en_innexp_2002_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_2002_l.jsp";
				break;

				
			case ENInnexpWBMapping.EN_INNEXP_3001:
				wb3 = new EN_INNEXP_3000WB();
				((EN_INNEXP_3000WB)wb3).en_innexp_3001_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_3001_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_3002:
				wb3 = new EN_INNEXP_3000WB();
				((EN_INNEXP_3000WB)wb3).en_innexp_3002_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_3002_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_3003:
				wb3 = new EN_INNEXP_3000WB();
				((EN_INNEXP_3000WB)wb3).en_innexp_3003_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_3003_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_3004:
				wb3 = new EN_INNEXP_3000WB();
				((EN_INNEXP_3000WB)wb3).en_innexp_3004_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_3004_l.jsp";
				break;
				
			case ENInnexpWBMapping.EN_INNEXP_3101:
				wb3 = new EN_INNEXP_3000WB();
				((EN_INNEXP_3000WB)wb3).en_innexp_3101_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_3101_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_3102:
				wb3 = new EN_INNEXP_3000WB();
				((EN_INNEXP_3000WB)wb3).en_innexp_3102_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_3102_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_3103:
				wb3 = new EN_INNEXP_3000WB();
				((EN_INNEXP_3000WB)wb3).en_innexp_3103_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_3103_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_3104:
				wb3 = new EN_INNEXP_3000WB();
				((EN_INNEXP_3000WB)wb3).en_innexp_3104_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_3104_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_3105:
				wb3 = new EN_INNEXP_3000WB();
				((EN_INNEXP_3000WB)wb3).en_innexp_3105_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_3105_l.jsp";
				break;

			case ENInnexpWBMapping.EN_INNEXP_3201:
				wb3 = new EN_INNEXP_3000WB();
				((EN_INNEXP_3000WB)wb3).en_innexp_3201_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_3201_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_3202:
				wb3 = new EN_INNEXP_3000WB();
				((EN_INNEXP_3000WB)wb3).en_innexp_3202_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_3202_l.jsp";
				break;
			case ENInnexpWBMapping.EN_INNEXP_3203:
				wb3 = new EN_INNEXP_3000WB();
				((EN_INNEXP_3000WB)wb3).en_innexp_3203_l(req, res);
				nextPage = "/jsp/en/innexp/en_innexp_3203_l.jsp";
				break;

			default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
