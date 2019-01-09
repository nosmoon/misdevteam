/***************************************************************************************************
 * ���ϸ� : 
 * ��� : 
 * �ۼ����� : 
 * �ۼ��� : 
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/


package chosun.ciis.hd.com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.hd.com.wb.HD_COM_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;
 
public class HDComServlet extends BaseServlet {


    public static final int ACT_ADD = 1;
    public static final int ACT_RMV = 0;
    /**
     * ����ϴ� ControllerServlet �� doGet, doPost �޼ҵ忡�� ȣ��ȴ�.<br>
     * ��û�� URL�� �Ľ��Ͽ� pid�� ��� excuteWorker()�� ȣ���ϸ�,<br>
     * ���ϵ� nextPage�� request�� forward�Ѵ�.
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
            String servletMappedUrl = "/hd/com/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("HDComServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDComServlet : process : nextPage : " + nextPage);
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
     * SEBasWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
     * �޼ҵ带 ȣ���Ѵ�.
     * ����� ���� nextPage�� ��ȯ�Ѵ�.
     *
     * @param req request
     * @param res response
     * @param pid process id
     * @return forward�� nextPage
     * @throws SysException
     * @throws AppException
     */

    public String executeWorker(HttpServletRequest req, HttpServletResponse res,
                                int pid) throws AppException, IOException {
        String nextPage = null;
        HD_COM_1000WB wb = null;
        
        switch (pid) {
	        case HDComWBMapping.HD_COM_1001:
				wb = new HD_COM_1000WB();
				wb.hd_com_1001_l(req, res);
				nextPage = "/jsp/hd/com/hd_com_1001_l.jsp";
				break;
        	case HDComWBMapping.HD_COM_1002: 
        		wb = new HD_COM_1000WB();
        		wb.hd_com_1002(req, res);
        		nextPage = "/jsp/hd/com/hd_com_1002_l.jsp";
        		break;
			case HDComWBMapping.HD_COM_1003:
				wb = new HD_COM_1000WB();
				((HD_COM_1000WB)wb).hd_com_1003_l(req, res);
				nextPage = "/jsp/hd/com/hd_com_1003_l.jsp";
				break;
			case HDComWBMapping.HD_COM_1005:
				wb = new HD_COM_1000WB();
				((HD_COM_1000WB)wb).hd_com_1005_m(req, res);
				nextPage = "/jsp/hd/com/hd_com_1005_m.jsp";
				break;	
			case HDComWBMapping.HD_COM_1100:
				wb = new HD_COM_1000WB();
				wb.hd_com_1100_l(req, res);
				nextPage = "/jsp/hd/com/hd_com_1100_l.jsp";
				break;
        	case HDComWBMapping.HD_COM_1101:
        		wb = new HD_COM_1000WB();
        		wb.hd_com_1101(req, res);
        		nextPage = "/jsp/hd/com/hd_com_1101_l.jsp";
        		break;
        	case HDComWBMapping.HD_COM_1102:
        		wb = new HD_COM_1000WB();
        		wb.hd_com_1102(req, res);
        		nextPage = "/jsp/hd/com/hd_com_1102_s.jsp";
        		break;
			case HDComWBMapping.HD_COM_1103:
				wb = new HD_COM_1000WB();
				wb.hd_com_1103_l(req, res);
				nextPage = "/jsp/hd/com/hd_com_1103_l.jsp";
				break;
			case HDComWBMapping.HD_COM_1110_L:
				wb = new HD_COM_1000WB();
				((HD_COM_1000WB)wb).hd_com_1110_l(req, res);
				nextPage = "/jsp/hd/com/hd_com_1110_l.jsp";
				break;
			case HDComWBMapping.HD_COM_1200:
				wb = new HD_COM_1000WB();
				((HD_COM_1000WB)wb).hd_com_1200_l(req, res);
				nextPage = "/jsp/hd/com/hd_com_1200_l.jsp";
				break;
			case HDComWBMapping.HD_COM_2000:
				wb = new HD_COM_1000WB();
				((HD_COM_1000WB)wb).hd_com_2000_l(req, res);
				nextPage = "/jsp/hd/com/hd_com_2000_l.jsp";
				break;
			case HDComWBMapping.HD_COM_2100:
				wb = new HD_COM_1000WB();
				((HD_COM_1000WB)wb).hd_com_2100_a(req, res);
				//nextPage = "/jsp/hd/com/hd_com_2100_a.jsp";
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDComWBMapping.HD_COM_5000_L:
				wb = new HD_COM_1000WB();
				((HD_COM_1000WB)wb).hd_com_5000_l(req, res);
				nextPage = "/jsp/hd/com/hd_com_5000_l.jsp";
				break;
			case HDComWBMapping.HD_COM_5001_L:
				wb = new HD_COM_1000WB();
				((HD_COM_1000WB)wb).hd_com_5001_l(req, res);
				nextPage = "/jsp/hd/com/hd_com_5000_l.jsp";
				break;
			case HDComWBMapping.HD_COM_5002_L:
				wb = new HD_COM_1000WB();
				((HD_COM_1000WB)wb).hd_com_5002_l(req, res);
				nextPage = "/jsp/hd/com/hd_com_5002_l.jsp";
				break;
			case HDComWBMapping.HD_COM_5003_L:
				wb = new HD_COM_1000WB();
				((HD_COM_1000WB)wb).hd_com_5003_l(req, res);
				nextPage = "/jsp/hd/com/hd_com_5002_l.jsp";
				break;
			case HDComWBMapping.HD_COM_5004_L:
				wb = new HD_COM_1000WB();
				((HD_COM_1000WB)wb).hd_com_5004_l(req, res);
				nextPage = "/jsp/hd/com/hd_com_5004_l.jsp";
				break;
			case HDComWBMapping.HD_COM_5100_L:
				wb = new HD_COM_1000WB();
				((HD_COM_1000WB)wb).hd_com_5100_l(req, res);
				nextPage = "/jsp/hd/com/hd_com_5100_l.jsp";
				break;
			case HDComWBMapping.HD_COM_5200_L:
				wb = new HD_COM_1000WB();
				((HD_COM_1000WB)wb).hd_com_5200_l(req, res);
				nextPage = "/jsp/hd/com/hd_com_5200_l.jsp";
				break;
			case HDComWBMapping.HD_COM_5300_I:
				wb = new HD_COM_1000WB();
				((HD_COM_1000WB)wb).hd_com_5300_i(req, res);
				nextPage = "/jsp/hd/com/hd_com_5300_i.jsp";
				break;
        	default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}
