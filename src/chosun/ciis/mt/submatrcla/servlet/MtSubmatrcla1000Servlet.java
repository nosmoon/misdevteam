package chosun.ciis.mt.submatrcla.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import chosun.ciis.co.base.servlet.BaseServlet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
//import chosun.ciis.mt.submatrin.wb.*;
import chosun.ciis.mt.common.servlet.MtCommonWBMapping;
import chosun.ciis.mt.common.wb.MT_COMMON_WB;
import chosun.ciis.mt.etccar.servlet.MtEtccarWBMapping;
import chosun.ciis.mt.outsdelmt.servlet.MtOutsdelmtWBMapping;
import chosun.ciis.mt.outsdelmt.wb.MT_OUTSDELMT_1000WB;
import chosun.ciis.mt.submatrcla.wb.MT_SUBMATRCLA_1000WB;
import chosun.ciis.mt.submatrcla.wb.MT_SUBMATRCLA_2000WB;
import chosun.ciis.mt.submatrcla.wb.MT_SUBMATRCLA_3000WB;
import chosun.ciis.mt.submatrcla.wb.MT_SUBMATRCLA_4000WB;
import chosun.ciis.mt.submatrcla.servlet.MtSubmatrclaWBMapping;




public class MtSubmatrcla1000Servlet extends BaseServlet {


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
            String servletMappedUrl = "/mt/submatrcla/";
            iPid = extractPid(req, servletMappedUrl);

            System.out.println("MtSubmatrcla1000Sevlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("MtSubmatrcla1000Sevlet : process : nextPage : " + nextPage);
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
        MT_SUBMATRCLA_1000WB wb = null;
        MT_SUBMATRCLA_2000WB wb2 = null;
        MT_SUBMATRCLA_3000WB wb3 = null;
        MT_SUBMATRCLA_4000WB wb4 = null;

        switch (pid) {
	        case MtSubmatrclaWBMapping.MT_SUBMATRCLA_1100:
        		System.out.println("MT_SUBMATRIN_1100:::::::::::::::");
        	    wb = new MT_SUBMATRCLA_1000WB();
        		wb.mt_Submatrcla_1100(req, res);
        		nextPage = "/jsp/mt/submatrcla/mt_submatrcla_1100_l.jsp";
        		break;
			case MtSubmatrclaWBMapping.MT_SUBMATRCLA_1101:
				wb = new MT_SUBMATRCLA_1000WB();
				((MT_SUBMATRCLA_1000WB)wb).mt_submatrcla_1101_l(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_1101_l.jsp";
				break;
			case MtSubmatrclaWBMapping.MT_SUBMATRCLA_1104:
				wb = new MT_SUBMATRCLA_1000WB();
				((MT_SUBMATRCLA_1000WB)wb).mt_submatrcla_1104_l(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_1104_l.jsp";
				break;
			case MtSubmatrclaWBMapping.MT_SUBMATRCLA_1105:
				wb = new MT_SUBMATRCLA_1000WB();
				((MT_SUBMATRCLA_1000WB)wb).mt_submatrcla_1105_m(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_1105_m.jsp";
				break;
        	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_1110:
				wb = new MT_SUBMATRCLA_1000WB();
				((MT_SUBMATRCLA_1000WB)wb).mt_submatrcla_1110_l(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_1110_l.jsp";
				break;
			case MtSubmatrclaWBMapping.MT_SUBMATRCLA_1111:
				wb = new MT_SUBMATRCLA_1000WB();
				((MT_SUBMATRCLA_1000WB)wb).mt_submatrcla_1111_u(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_1111_u.jsp";
				break;
        	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_1120:
				wb = new MT_SUBMATRCLA_1000WB();
				((MT_SUBMATRCLA_1000WB)wb).mt_submatrcla_1120_l(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_1120_l.jsp";
				break;
        	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_1130:
				wb = new MT_SUBMATRCLA_1000WB();
				((MT_SUBMATRCLA_1000WB)wb).mt_submatrcla_1130_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_1140:
				wb = new MT_SUBMATRCLA_1000WB();
				((MT_SUBMATRCLA_1000WB)wb).mt_submatrcla_1140_l(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_1140_l.jsp";
				break;
			case MtSubmatrclaWBMapping.MT_SUBMATRCLA_1141:
				wb = new MT_SUBMATRCLA_1000WB();
				((MT_SUBMATRCLA_1000WB)wb).mt_submatrcla_1141_l(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_1141_l.jsp";
				break;
			case MtSubmatrclaWBMapping.MT_SUBMATRCLA_1142:
				wb = new MT_SUBMATRCLA_1000WB();
				((MT_SUBMATRCLA_1000WB)wb).mt_submatrcla_1142_l(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_1142_l.jsp";
				break;
			case MtSubmatrclaWBMapping.MT_SUBMATRCLA_1143:
				wb = new MT_SUBMATRCLA_1000WB();
				((MT_SUBMATRCLA_1000WB)wb).mt_submatrcla_1143_l(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_1143_l.jsp";
				break;
        	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_1150:
				wb = new MT_SUBMATRCLA_1000WB();
				((MT_SUBMATRCLA_1000WB)wb).mt_submatrcla_1150_l(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_1150_l.jsp";
				break;
        	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_1160:
				wb = new MT_SUBMATRCLA_1000WB();
				((MT_SUBMATRCLA_1000WB)wb).mt_submatrcla_1160_l(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_1160_l.jsp";
				break;
			case MtSubmatrclaWBMapping.MT_SUBMATRCLA_1310:
				wb = new MT_SUBMATRCLA_1000WB();
				((MT_SUBMATRCLA_1000WB)wb).mt_submatrcla_1310_l(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_1310_l.jsp";
				break;
			case MtSubmatrclaWBMapping.MT_SUBMATRCLA_1410:
				wb = new MT_SUBMATRCLA_1000WB();
				((MT_SUBMATRCLA_1000WB)wb).mt_submatrcla_1410_l(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_1410_l.jsp";
				break;
			case MtSubmatrclaWBMapping.MT_SUBMATRCLA_1420:
				wb = new MT_SUBMATRCLA_1000WB();
				((MT_SUBMATRCLA_1000WB)wb).mt_submatrcla_1420_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case MtSubmatrclaWBMapping.MT_SUBMATRCLA_2000:
				wb2 = new MT_SUBMATRCLA_2000WB();
				((MT_SUBMATRCLA_2000WB)wb2).mt_submatrcla_2000_l(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_2000_l.jsp";
				break;
			case MtSubmatrclaWBMapping.MT_SUBMATRCLA_2000_500:
				wb2 = new MT_SUBMATRCLA_2000WB();
				((MT_SUBMATRCLA_2000WB)wb2).mt_submatrcla_2000_500_l(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_2000_500_l.jsp";
				break;
        	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_2002:
				wb2 = new MT_SUBMATRCLA_2000WB();
				((MT_SUBMATRCLA_2000WB)wb2).mt_submatrcla_2002_m(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_2002_m.jsp";
				break;
        	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_2001:
				wb2 = new MT_SUBMATRCLA_2000WB();
				((MT_SUBMATRCLA_2000WB)wb2).mt_submatrcla_2001_l(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_2001_l.jsp";
				break;
        	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_2003:
				wb2 = new MT_SUBMATRCLA_2000WB();
				((MT_SUBMATRCLA_2000WB)wb2).mt_submatrcla_2003_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_2004:
				wb2 = new MT_SUBMATRCLA_2000WB();
				((MT_SUBMATRCLA_2000WB)wb2).mt_submatrcla_2004_l(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_2004_l.jsp";
				break;
        	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_2005:
				wb2 = new MT_SUBMATRCLA_2000WB();
				((MT_SUBMATRCLA_2000WB)wb2).mt_submatrcla_2005_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_2006:
				wb2 = new MT_SUBMATRCLA_2000WB();
				((MT_SUBMATRCLA_2000WB)wb2).mt_submatrcla_2006_a(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_2006_a.jsp";
				break;
        	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_2010:
				wb2 = new MT_SUBMATRCLA_2000WB();
				((MT_SUBMATRCLA_2000WB)wb2).mt_submatrcla_2010_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_2010_500:
				wb2 = new MT_SUBMATRCLA_2000WB();
				((MT_SUBMATRCLA_2000WB)wb2).mt_submatrcla_2010_500_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case MtSubmatrclaWBMapping.MT_SUBMATRCLA_2020:
				wb2 = new MT_SUBMATRCLA_2000WB();
				((MT_SUBMATRCLA_2000WB)wb2).mt_submatrcla_2020_u(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_2020_u.jsp";
				break;
			case MtSubmatrclaWBMapping.MT_SUBMATRCLA_3100:
				wb3 = new MT_SUBMATRCLA_3000WB();
				((MT_SUBMATRCLA_3000WB)wb3).mt_submatrcla_3100_m(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_3100_m.jsp";
				break;
	    	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_3101:
	    		wb3 = new MT_SUBMATRCLA_3000WB();
				((MT_SUBMATRCLA_3000WB)wb3).mt_submatrcla_3101_l(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_3101_l.jsp";
				break;
	    	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_3102:
	    		wb3 = new MT_SUBMATRCLA_3000WB();
				((MT_SUBMATRCLA_3000WB)wb3).mt_submatrcla_3102_l(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_3102_l.jsp";
				break;
	    	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_3103:
	    		wb3 = new MT_SUBMATRCLA_3000WB();
				((MT_SUBMATRCLA_3000WB)wb3).mt_submatrcla_3103_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
	    	 case MtSubmatrclaWBMapping.MT_SUBMATRCLA_3104:
			    System.out.println("MT_SUBMATRCLA_3104:::::::::::::::");
			    wb3 = new MT_SUBMATRCLA_3000WB();
			    wb3.getMt_submatrcla_3104(req, res);
			    nextPage = "/jsp/mt/submatrcla/mt_submatrcla_3104_l.jsp";
			    break;
		       	
	    	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_3201:
	    		wb3 = new MT_SUBMATRCLA_3000WB();
				((MT_SUBMATRCLA_3000WB)wb3).mt_submatrcla_3201_l(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_3201_l.jsp";
				break;
	    	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_3202:
	    		wb3 = new MT_SUBMATRCLA_3000WB();
				((MT_SUBMATRCLA_3000WB)wb3).mt_submatrcla_3202_l(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_3202_l.jsp";
				break;
	    	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_3203:
	    		wb3 = new MT_SUBMATRCLA_3000WB();
				((MT_SUBMATRCLA_3000WB)wb3).mt_submatrcla_3203_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
	    	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_3310:
	    		wb3 = new MT_SUBMATRCLA_3000WB();
				((MT_SUBMATRCLA_3000WB)wb3).mt_submatrcla_3310_l(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_3310_l.jsp";
				break;
	    	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_3320:
	    		wb3 = new MT_SUBMATRCLA_3000WB(); 
	    		((MT_SUBMATRCLA_3000WB)wb3).mt_submatrcla_3320_l(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_3320_l.jsp";
        		break;
	    	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_3321:
	    		wb3 = new MT_SUBMATRCLA_3000WB();
				((MT_SUBMATRCLA_3000WB)wb3).mt_submatrcla_3321_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
	    	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_3501:
	    		wb3 = new MT_SUBMATRCLA_3000WB(); 
	    		((MT_SUBMATRCLA_3000WB)wb3).mt_submatrcla_3501_l(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_3501_l.jsp";
        		break;
	    	case MtSubmatrclaWBMapping.MT_SUBMATRCLA_4201:
	    		wb4 = new MT_SUBMATRCLA_4000WB(); 
	    		((MT_SUBMATRCLA_4000WB)wb4).mt_submatrcla_4201_l(req, res);
				nextPage = "/jsp/mt/submatrcla/mt_submatrcla_4201_l.jsp";
        		break;
        	
			default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }

}