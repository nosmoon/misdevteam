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


package chosun.ciis.hd.orga.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.hd.orga.wb.HD_ORGA_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class HDOrgaServlet extends BaseServlet {


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
            String servletMappedUrl = "/hd/orga/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("HDOrgaServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDOrgaServlet : process : nextPage : " + nextPage);
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
        HD_ORGA_1000WB wb = null;
        
        switch (pid) {
	        case HDOrgaWBMapping.HD_ORGA_1000:
	        	wb = new HD_ORGA_1000WB();
	        	wb.hd_orga_1000_m(req, res);
	        	nextPage = "/jsp/hd/orga/hd_orga_1000_m.jsp";
	        	break;
        	case HDOrgaWBMapping.HD_ORGA_1001:
        		wb = new HD_ORGA_1000WB();
        		wb.hd_orga_1001(req, res);
        		nextPage = "/jsp/hd/orga/hd_orga_1001_l.jsp";
        		break;
        	case HDOrgaWBMapping.HD_ORGA_1002:
        		wb = new HD_ORGA_1000WB();
                wb.hd_orga_1002(req, res);
        		nextPage = "/jsp/hd/orga/hd_orga_1002_l.jsp";
        		break;
        	case HDOrgaWBMapping.HD_ORGA_1003:
        		wb = new HD_ORGA_1000WB();
        		wb.hd_orga_1003(req, res);
        		nextPage = "/jsp/hd/orga/hd_orga_1003_l.jsp";
        		break;
        	case HDOrgaWBMapping.HD_ORGA_1004:
        		wb = new HD_ORGA_1000WB();
        		wb.hd_orga_1004_l(req, res);
        		nextPage = "/jsp/hd/orga/hd_orga_1004_l.jsp";
        		break;
        	case HDOrgaWBMapping.HD_ORGA_1005:
        		wb = new HD_ORGA_1000WB();
        		wb.hd_orga_1005_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case HDOrgaWBMapping.HD_ORGA_1006:
        		wb = new HD_ORGA_1000WB();
        		wb.hd_orga_1006_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
			case HDOrgaWBMapping.HD_ORGA_1007:
				wb = new HD_ORGA_1000WB();
				wb.hd_orga_1007_l(req, res);
				nextPage = "/jsp/hd/orga/hd_orga_1007_l.jsp";
				break;
			case HDOrgaWBMapping.HD_ORGA_1009:
				wb = new HD_ORGA_1000WB();
				((HD_ORGA_1000WB)wb).hd_orga_1009_l(req, res);
				nextPage = "/jsp/hd/orga/hd_orga_1009_l.jsp";
				break;
			case HDOrgaWBMapping.HD_ORGA_1010:
				wb = new HD_ORGA_1000WB();
				wb.hd_orga_1010_l(req, res);
				nextPage = "/jsp/hd/orga/hd_orga_1010_l.jsp";
				break;
			case HDOrgaWBMapping.HD_ORGA_1101:
				wb = new HD_ORGA_1000WB();
				((HD_ORGA_1000WB)wb).hd_orga_1101_l(req, res);
				nextPage = "/jsp/hd/orga/hd_orga_1101_l.jsp";
				break;
        	case HDOrgaWBMapping.HD_ORGA_1102:
        		wb = new HD_ORGA_1000WB();
        		wb.hd_orga_1102(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case HDOrgaWBMapping.HD_ORGA_1103:
        		wb = new HD_ORGA_1000WB();
        		wb.hd_orga_1103_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case HDOrgaWBMapping.HD_ORGA_1201:
        		wb = new HD_ORGA_1000WB();
        		wb.hd_orga_1101_l(req, res);
        		nextPage = "/jsp/hd/orga/hd_orga_1101_l.jsp";
        		break;
        	case HDOrgaWBMapping.HD_ORGA_1202:
        		wb = new HD_ORGA_1000WB();
        		wb.hd_orga_1202(req, res);
        		nextPage = "/jsp/hd/orga/hd_orga_1202_l.jsp";
        		break;
        	case HDOrgaWBMapping.HD_ORGA_1203:
        		wb = new HD_ORGA_1000WB();
        		wb.hd_orga_1203(req, res);
        		nextPage = "/jsp/hd/orga/hd_orga_1203_l.jsp";
        		break;
			case HDOrgaWBMapping.HD_ORGA_1204:
				wb = new HD_ORGA_1000WB();
				wb.hd_orga_1204_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDOrgaWBMapping.HD_ORGA_1205:
				wb = new HD_ORGA_1000WB();
				wb.hd_orga_1205_l(req, res);
				nextPage = "/jsp/hd/orga/hd_orga_1205_l.jsp";
				break;
			case HDOrgaWBMapping.HD_ORGA_1206:
				wb = new HD_ORGA_1000WB();
				wb.hd_orga_1206_l(req, res);
				nextPage = "/jsp/hd/orga/hd_orga_1206_l.jsp";
				break;
			case HDOrgaWBMapping.HD_ORGA_1207:
				wb = new HD_ORGA_1000WB();
				wb.hd_orga_1207_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDOrgaWBMapping.HD_ORGA_1208:
				wb = new HD_ORGA_1000WB();
				wb.hd_orga_1208_a(req, res);
				nextPage = "/jsp/hd/orga/hd_orga_1208_a.jsp";
				break;
			case HDOrgaWBMapping.HD_ORGA_1209:
				wb = new HD_ORGA_1000WB();
				((HD_ORGA_1000WB)wb).hd_orga_1209_a(req, res);
        		//nextPage = "/common/jsp/resultMsg.jsp";
				nextPage = "/jsp/hd/orga/hd_orga_1209_a.jsp";
				break;
			case HDOrgaWBMapping.HD_ORGA_1300:
				wb = new HD_ORGA_1000WB();
				wb.hd_orga_1300_l(req, res);
				nextPage = "/jsp/hd/orga/hd_orga_1300_l.jsp";
				break;
			case HDOrgaWBMapping.HD_ORGA_1301:
				wb = new HD_ORGA_1000WB();
				wb.hd_orga_1301_l(req, res);
				nextPage = "/jsp/hd/orga/hd_orga_1301_l.jsp";
				break;
			case HDOrgaWBMapping.HD_ORGA_1302:
				wb = new HD_ORGA_1000WB();
				wb.hd_orga_1302_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDOrgaWBMapping.HD_ORGA_1400:
				wb = new HD_ORGA_1000WB();
				wb.hd_orga_1400_l(req, res);
				nextPage = "/jsp/hd/orga/hd_orga_1400_l.jsp";
				break;
			case HDOrgaWBMapping.HD_ORGA_1401:
				wb = new HD_ORGA_1000WB();
				wb.hd_orga_1401_l(req, res);
				nextPage = "/jsp/hd/orga/hd_orga_1401_l.jsp";
				break;
			case HDOrgaWBMapping.HD_ORGA_2000_L:
				wb = new HD_ORGA_1000WB();
				((HD_ORGA_1000WB)wb).hd_orga_2000_l(req, res);
				nextPage = "/jsp/hd/orga/hd_orga_2000_l.jsp";
				break;
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
}
