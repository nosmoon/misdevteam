package chosun.ciis.mt.submatrout.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.servlet.BaseServlet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.mt.submatrout.wb.MT_SUBMATROUT_1000WB;
import chosun.ciis.mt.submatrout.wb.MT_SUBMATROUT_2000WB;
import chosun.ciis.mt.submatrout.wb.MT_SUBMATROUT_3000WB;
import chosun.ciis.mt.submatrout.servlet.MtSubmatroutWBMapping;



public class MtSubmatroutServlet extends BaseServlet {


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
     */

    public void process(HttpServletRequest req, HttpServletResponse res) throws
        ServletException, IOException {
        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;

        try {
            String servletMappedUrl = "/mt/submatrout/";
            iPid = extractPid(req, servletMappedUrl);

            System.out.println("");
            System.out.println("############### Servlet Start ###############");
            System.out.println("MtpapinoutSevlet : req  : " + req);
            System.out.println("MtpapinoutSevlet : res  : " + res);
            System.out.println("MtpapinoutSevlet : iPid : " + iPid);
            System.out.println("MtpapinoutSevlet : nextPage : " + nextPage);

            nextPage = executeWorker(req, res, iPid);

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

    public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException, IOException {
        String nextPage = null;
        MT_SUBMATROUT_1000WB wb = null;
        MT_SUBMATROUT_2000WB wb2 = null;
        MT_SUBMATROUT_3000WB wb3 = null;
        switch (pid) {
        		case MtSubmatroutWBMapping.MT_SUBMATROUT_1100:
        			wb = new MT_SUBMATROUT_1000WB();
        			wb.mt_submatrout_1100(req, res);
        			nextPage = "/jsp/mt/submatrout/mt_submatrout_1100_l.jsp";
        			break;
		    	case MtSubmatroutWBMapping.MT_SUBMATROUT_1101:
				    wb = new MT_SUBMATROUT_1000WB();
				    wb.mt_submatrout_1101(req, res);
				    nextPage = "/jsp/mt/submatrout/mt_submatrout_1101_l.jsp";
				    break;
		        case MtSubmatroutWBMapping.MT_SUBMATROUT_1102:

				    System.out.println("MT_SUBMATROUT_1102:::::::::::::::");

				    wb = new MT_SUBMATROUT_1000WB();

				    wb.mt_submatrout_1102(req, res);

				    nextPage = "/jsp/mt/submatrout/mt_submatrout_1102_l.jsp";
				    break;
		        case MtSubmatroutWBMapping.MT_SUBMATROUT_1103:

				    System.out.println("MT_SUBMATROUT_1103:::::::::::::::");

				    wb = new MT_SUBMATROUT_1000WB();

				    wb.mt_submatrout_1103(req, res);

				    nextPage = "/jsp/mt/submatrout/mt_submatrout_1103_l.jsp";
				    break;
		        case MtSubmatroutWBMapping.MT_SUBMATROUT_1104:

				    System.out.println("MT_SUBMATROUT_1104:::::::::::::::");

				    wb = new MT_SUBMATROUT_1000WB();

				    wb.mt_submatrout_1104(req, res);

				    nextPage = "/jsp/mt/submatrout/mt_submatrout_1104_l.jsp";
				    break;
		        case MtSubmatroutWBMapping.MT_SUBMATROUT_1109:

				    System.out.println("MT_SUBMATROUT_1109:::::::::::::::");

				    wb = new MT_SUBMATROUT_1000WB();

				    wb.mt_submatrout_1109(req, res);

				    nextPage = "/common/jsp/resultMsg.jsp";
				    break;
		        case MtSubmatroutWBMapping.MT_SUBMATROUT_1111:

				    System.out.println("MT_SUBMATROUT_1111:::::::::::::::");

				    wb = new MT_SUBMATROUT_1000WB();

				    wb.mt_submatrout_1111(req, res);

				    nextPage = "/common/jsp/resultMsg.jsp";
				    break;
		        case MtSubmatroutWBMapping.MT_SUBMATROUT_1112:

				    System.out.println("MT_SUBMATROUT_1112:::::::::::::::");

				    wb = new MT_SUBMATROUT_1000WB();

				    wb.mt_submatrout_1112(req, res);

				    nextPage = "/common/jsp/resultMsg.jsp";
				    break;
		        case MtSubmatroutWBMapping.MT_SUBMATROUT_1114:

				    System.out.println("MT_SUBMATROUT_1114:::::::::::::::");

				    wb = new MT_SUBMATROUT_1000WB();

				    wb.mt_submatrout_1114(req, res);

				    nextPage = "/jsp/mt/submatrout/mt_submatrout_1114_l.jsp";
				    break;
		        case MtSubmatroutWBMapping.MT_SUBMATROUT_1115:

				    System.out.println("MT_SUBMATROUT_1115:::::::::::::::");

				    wb = new MT_SUBMATROUT_1000WB();

				    wb.mt_submatrout_1115(req, res);

				    nextPage = "/jsp/mt/submatrout/mt_submatrout_1115_l.jsp";
				    break;
		        case MtSubmatroutWBMapping.MT_SUBMATROUT_1116:

				    System.out.println("MT_SUBMATROUT_1116:::::::::::::::");

				    wb = new MT_SUBMATROUT_1000WB();

				    wb.mt_submatrout_1116(req, res);

				    nextPage = "/jsp/mt/submatrout/mt_submatrout_1116_l.jsp";
				    break;
		        case MtSubmatroutWBMapping.MT_SUBMATROUT_1118:

				    System.out.println("MT_SUBMATROUT_1118:::::::::::::::");

				    wb = new MT_SUBMATROUT_1000WB();

				    wb.mt_submatrout_1118(req, res);

				    nextPage = "/jsp/mt/submatrout/mt_submatrout_1118_l.jsp";
				    break;
		        case MtSubmatroutWBMapping.MT_SUBMATROUT_1117:
				    System.out.println("MT_SUBMATROUT_1117:::::::::::::::");
				    wb = new MT_SUBMATROUT_1000WB();
				    wb.mt_submatrout_1117(req, res);
				    nextPage = "/jsp/mt/submatrout/mt_submatrout_1117_u.jsp";
				    break;
		        case MtSubmatroutWBMapping.MT_SUBMATROUT_1150:
				    System.out.println("MT_SUBMATROUT_1150:::::::::::::::");
				    wb = new MT_SUBMATROUT_1000WB();
				    wb.mt_submatrout_1150(req, res);
				    nextPage = "/jsp/mt/submatrout/mt_submatrout_1150_l.jsp";
				    break;
		        case MtSubmatroutWBMapping.MT_SUBMATROUT_1151:
				    System.out.println("MT_SUBMATROUT_1151:::::::::::::::");
				    wb = new MT_SUBMATROUT_1000WB();
				    wb.mt_submatrout_1151(req, res);
				    nextPage = "/jsp/mt/submatrout/mt_submatrout_1151_a.jsp";
				    break;
		        case MtSubmatroutWBMapping.MT_SUBMATROUT_1152:
				    System.out.println("MT_SUBMATROUT_1152:::::::::::::::");
				    wb = new MT_SUBMATROUT_1000WB();
				    wb.mt_submatrout_1152(req, res);
				    nextPage = "/jsp/mt/submatrout/mt_submatrout_1152_l.jsp";
				    break;
		        case MtSubmatroutWBMapping.MT_SUBMATROUT_1200:

				    System.out.println("MT_SUBMATROUT_1200:::::::::::::::");

				    wb = new MT_SUBMATROUT_1000WB();

				    wb.mt_submatrout_1200(req, res);

				    nextPage = "/jsp/mt/submatrout/mt_submatrout_1200_l.jsp";
				    break;
		        case MtSubmatroutWBMapping.MT_SUBMATROUT_1201:

				    System.out.println("MT_SUBMATROUT_1201:::::::::::::::");

				    wb = new MT_SUBMATROUT_1000WB();

				    wb.mt_submatrout_1201(req, res);

				    nextPage = "/jsp/mt/submatrout/mt_submatrout_1201_l.jsp";
				    break;
		        case MtSubmatroutWBMapping.MT_SUBMATROUT_1202:

				    System.out.println("MT_SUBMATROUT_1202:::::::::::::::");

				    wb = new MT_SUBMATROUT_1000WB();

				    wb.mt_submatrout_1202(req, res);

				    nextPage = "/jsp/mt/submatrout/mt_submatrout_1202_l.jsp";
				    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_1300:

	    		    System.out.println("MT_SUBMATROUT_1300:::::::::::::::");

	    		    wb = new MT_SUBMATROUT_1000WB();

	    		    wb.mt_submatrout_1300(req, res);

	    		    nextPage = "/jsp/mt/submatrout/mt_submatrout_1300_l.jsp";
	    		    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_1301:

	    		    System.out.println("MT_SUBMATROUT_1301:::::::::::::::");

	    		    wb = new MT_SUBMATROUT_1000WB();
	    		    wb.mt_submatrout_1301(req, res);

	    		    nextPage = "/jsp/mt/submatrout/mt_submatrout_1301_l.jsp";
	    		    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_1400:

	    		    System.out.println("MT_SUBMATROUT_1400:::::::::::::::");

	    		    wb = new MT_SUBMATROUT_1000WB();
	    		    wb.mt_submatrout_1400(req, res);

	    		    nextPage = "/jsp/mt/submatrout/mt_submatrout_1400_l.jsp";
	    		    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_1401:

	    		    System.out.println("MT_SUBMATROUT_1401:::::::::::::::");

	    		    wb = new MT_SUBMATROUT_1000WB();
	    		    wb.mt_submatrout_1401(req, res);

	    		    nextPage = "/jsp/mt/submatrout/mt_submatrout_1401_l.jsp";
	    		    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_1402:
				    System.out.println("MT_SUBMATROUT_1402:::::::::::::::");
				    wb = new MT_SUBMATROUT_1000WB();
				    wb.mt_submatrout_1402(req, res);
				    nextPage = "/common/jsp/resultMsg.jsp";
				    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_1500:
				    System.out.println("MT_SUBMATROUT_1500:::::::::::::::");
				    wb = new MT_SUBMATROUT_1000WB();
				    wb.mt_submatrout_1500(req, res);
				    nextPage = "/jsp/mt/submatrout/mt_submatrout_1500_l.jsp";
				    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_1501:
				    System.out.println("MT_SUBMATROUT_1501:::::::::::::::");
				    wb = new MT_SUBMATROUT_1000WB();
				    wb.mt_submatrout_1501(req, res);
				    nextPage = "/jsp/mt/submatrout/mt_submatrout_1501_l.jsp";
				    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_1502:
				    System.out.println("MT_SUBMATROUT_1502:::::::::::::::");
				    wb = new MT_SUBMATROUT_1000WB();
				    wb.mt_submatrout_1502(req, res);
				    nextPage = "/jsp/mt/submatrout/mt_submatrout_1502_l.jsp";
				    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_1503:
				    System.out.println("MT_SUBMATROUT_1503:::::::::::::::");
				    wb = new MT_SUBMATROUT_1000WB();
				    wb.mt_submatrout_1503(req, res);
				    nextPage = "/jsp/mt/submatrout/mt_submatrout_1503_l.jsp";
				    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_1510:
				    System.out.println("MT_SUBMATROUT_1510:::::::::::::::");
				    wb = new MT_SUBMATROUT_1000WB();
				    wb.mt_submatrout_1510(req, res);
				    nextPage = "/jsp/mt/submatrout/mt_submatrout_1510_a.jsp";
				    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_1520:
				    System.out.println("MT_SUBMATROUT_1520:::::::::::::::");
				    wb = new MT_SUBMATROUT_1000WB();
				    wb.mt_submatrout_1520(req, res);
				    nextPage = "/common/jsp/resultMsg.jsp";
				    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_1521:
				    System.out.println("MT_SUBMATROUT_1521:::::::::::::::");
				    wb = new MT_SUBMATROUT_1000WB();
				    wb.mt_submatrout_1521(req, res);
				    nextPage = "/common/jsp/resultMsg.jsp";
				    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_1522:
				    System.out.println("MT_SUBMATROUT_1522:::::::::::::::");
				    wb = new MT_SUBMATROUT_1000WB();
				    wb.mt_submatrout_1522(req, res);
				    nextPage = "/common/jsp/resultMsg.jsp";
				    break;

	            case MtSubmatroutWBMapping.MT_SUBMATROUT_1600:
					wb = new MT_SUBMATROUT_1000WB();
					((MT_SUBMATROUT_1000WB)wb).mt_submatrout_1600_l(req, res);
					nextPage = "/jsp/mt/submatrout/mt_submatrout_1600_l.jsp";
					break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_1601:
					wb = new MT_SUBMATROUT_1000WB();
					((MT_SUBMATROUT_1000WB)wb).mt_submatrout_1601_l(req, res);
					nextPage = "/jsp/mt/submatrout/mt_submatrout_1601_l.jsp";
					break;
				case MtSubmatroutWBMapping.MT_SUBMATROUT_1602:
					wb = new MT_SUBMATROUT_1000WB();
					((MT_SUBMATROUT_1000WB)wb).mt_submatrout_1602_l(req, res);
					nextPage = "/jsp/mt/submatrout/mt_submatrout_1602_l.jsp";
					break;
				case MtSubmatroutWBMapping.MT_SUBMATROUT_1603:
					wb = new MT_SUBMATROUT_1000WB();
					((MT_SUBMATROUT_1000WB)wb).mt_submatrout_1603_a(req, res);
					nextPage = "/common/jsp/resultMsg.jsp";
					//nextPage = "/jsp/mt/submatrout/mt_submatrout_1603_a.jsp";
					break;

				case MtSubmatroutWBMapping.MT_SUBMATROUT_2000:

	    		    System.out.println("MT_SUBMATROUT_2000:::::::::::::::");

	    		    wb2 = new MT_SUBMATROUT_2000WB();
	    		    wb2.mt_submatrout_2000(req, res);

	    		    nextPage = "/jsp/mt/submatrout/mt_submatrout_2000_l.jsp";
	    		    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_2001:

	    		    System.out.println("MT_SUBMATROUT_2001:::::::::::::::");

	    		    wb2 = new MT_SUBMATROUT_2000WB();
	    		    wb2.mt_submatrout_2001(req, res);

	    		    nextPage = "/jsp/mt/submatrout/mt_submatrout_2001_l.jsp";
	    		    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_2002:

	    		    System.out.println("MT_SUBMATROUT_2002:::::::::::::::");

	    		    wb2 = new MT_SUBMATROUT_2000WB();
	    		    wb2.mt_submatrout_2002(req, res);

	    		    nextPage = "/jsp/mt/submatrout/mt_submatrout_2002_l.jsp";
	    		    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_2003:

	    		    System.out.println("MT_SUBMATROUT_2003:::::::::::::::");

	    		    wb2 = new MT_SUBMATROUT_2000WB();
	    		    wb2.mt_submatrout_2003(req, res);

	    		    nextPage = "/jsp/mt/submatrout/mt_submatrout_2003_l.jsp";
	    		    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_2004:

	    		    System.out.println("MT_SUBMATROUT_2004:::::::::::::::");

	    		    wb2 = new MT_SUBMATROUT_2000WB();
	    		    wb2.mt_submatrout_2004(req, res);

	    		    nextPage = "/common/jsp/resultMsg.jsp";
	    		    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_2005:

	    		    System.out.println("MT_SUBMATROUT_2005:::::::::::::::");

	    		    wb2 = new MT_SUBMATROUT_2000WB();
	    		    wb2.mt_submatrout_2005(req, res);

	    		    nextPage = "/common/jsp/resultMsg.jsp";
	    		    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_2006:

	    		    System.out.println("MT_SUBMATROUT_2006:::::::::::::::");

	    		    wb2 = new MT_SUBMATROUT_2000WB();
	    		    wb2.mt_submatrout_2006(req, res);

	    		    nextPage = "/common/jsp/resultMsg.jsp";
	    		    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_3000:

	    		    System.out.println("MT_SUBMATROUT_3000:::::::::::::::");

	    		    wb3 = new MT_SUBMATROUT_3000WB();
	    		    wb3.mt_submatrout_3000(req, res);

	    		    nextPage = "/jsp/mt/submatrout/mt_submatrout_3000_l.jsp";
	    		    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_3100:

	    		    System.out.println("MT_SUBMATROUT_3100:::::::::::::::");

	    		    wb3 = new MT_SUBMATROUT_3000WB();
	    		    wb3.mt_submatrout_3100(req, res);

	    		    nextPage = "/jsp/mt/submatrout/mt_submatrout_3100_l.jsp";
	    		    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_3101:

	    		    System.out.println("MT_SUBMATROUT_3101:::::::::::::::");

	    		    wb3 = new MT_SUBMATROUT_3000WB();
	    		    wb3.mt_submatrout_3101(req, res);

	    		    nextPage = "/jsp/mt/submatrout/mt_submatrout_3101_l.jsp";
	    		    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_3200:

	    		    System.out.println("MT_SUBMATROUT_3200:::::::::::::::");

	    		    wb3 = new MT_SUBMATROUT_3000WB();
	    		    wb3.mt_submatrout_3200(req, res);

	    		    nextPage = "/jsp/mt/submatrout/mt_submatrout_3200_l.jsp";
	    		    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_3201:

	    		    System.out.println("MT_SUBMATROUT_3201:::::::::::::::");

	    		    wb3 = new MT_SUBMATROUT_3000WB();
	    		    wb3.mt_submatrout_3201(req, res);

	    		    nextPage = "/jsp/mt/submatrout/mt_submatrout_3201_l.jsp";
	    		    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_3202:

	    		    System.out.println("MT_SUBMATROUT_3202:::::::::::::::");

	    		    wb3 = new MT_SUBMATROUT_3000WB();
	    		    wb3.mt_submatrout_3202(req, res);

	    		    nextPage = "/jsp/mt/submatrout/mt_submatrout_3202_l.jsp";
	    		    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_3203:

	    		    System.out.println("MT_SUBMATROUT_3203:::::::::::::::");

	    		    wb3 = new MT_SUBMATROUT_3000WB();
	    		    wb3.mt_submatrout_3203(req, res);

	    		    nextPage = "/jsp/mt/submatrout/mt_submatrout_3203_l.jsp";
	    		    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_3204:

	    		    System.out.println("MT_SUBMATROUT_3204:::::::::::::::");

	    		    wb3 = new MT_SUBMATROUT_3000WB();
	    		    wb3.mt_submatrout_3204(req, res);

	    		    nextPage = "/jsp/mt/submatrout/mt_submatrout_3204_l.jsp";
	    		    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_3205:

	    		    System.out.println("MT_SUBMATROUT_3205:::::::::::::::");

	    		    wb3 = new MT_SUBMATROUT_3000WB();
	    		    wb3.mt_submatrout_3205(req, res);

	    		    nextPage = "/jsp/mt/submatrout/mt_submatrout_3205_l.jsp";
	    		    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_3206:

	    		    System.out.println("MT_SUBMATROUT_3206:::::::::::::::");

	    		    wb3 = new MT_SUBMATROUT_3000WB();
	    		    wb3.mt_submatrout_3206(req, res);

	    		    nextPage = "/common/jsp/resultMsg.jsp";
	    		    break;
	            case MtSubmatroutWBMapping.MT_SUBMATROUT_3207:

	    		    System.out.println("MT_SUBMATROUT_3207:::::::::::::::");

	    		    wb3 = new MT_SUBMATROUT_3000WB();
	    		    wb3.mt_submatrout_3207(req, res);

	    		    nextPage = "/jsp/mt/submatrout/mt_submatrout_3207_l.jsp";
	    		    break;

	           default:
	                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
}