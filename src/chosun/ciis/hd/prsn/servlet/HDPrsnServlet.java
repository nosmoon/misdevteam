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


package chosun.ciis.hd.prsn.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.hd.prsn.wb.HD_PRSN_1000WB;
import chosun.ciis.co.base.servlet.BaseServlet;
 
public class HDPrsnServlet extends BaseServlet {


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
            String servletMappedUrl = "/hd/prsn/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("HDPrsnServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDPrsnServlet : process : nextPage : " + nextPage);
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
        HD_PRSN_1000WB wb = null;

        switch (pid) {
			case HDPrsnWBMapping.HD_PRSN_1000:
				wb = new HD_PRSN_1000WB();
				((HD_PRSN_1000WB)wb).hd_prsn_1000_l(req, res);
				nextPage = "/jsp/hd/prsn/hd_prsn_1000_l.jsp";
				break;
			case HDPrsnWBMapping.HD_PRSN_1001:
				wb = new HD_PRSN_1000WB();
				((HD_PRSN_1000WB)wb).hd_prsn_1001_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDPrsnWBMapping.HD_PRSN_1002:
				wb = new HD_PRSN_1000WB();
				((HD_PRSN_1000WB)wb).hd_prsn_1002_l(req, res);
				nextPage = "/jsp/hd/prsn/hd_prsn_1002_l.jsp";
				break;
			case HDPrsnWBMapping.HD_PRSN_2000:
				wb = new HD_PRSN_1000WB();
				((HD_PRSN_1000WB)wb).hd_prsn_2000_l(req, res);
				nextPage = "/jsp/hd/prsn/hd_prsn_2000_l.jsp";
				break;
			case HDPrsnWBMapping.HD_PRSN_2001:
				wb = new HD_PRSN_1000WB();
				((HD_PRSN_1000WB)wb).hd_prsn_2001_l(req, res);
				nextPage = "/jsp/hd/prsn/hd_prsn_2001_l.jsp";
				break;
			case HDPrsnWBMapping.HD_PRSN_2002:
				wb = new HD_PRSN_1000WB();
				((HD_PRSN_1000WB)wb).hd_prsn_2002_l(req, res);
				nextPage = "/jsp/hd/prsn/hd_prsn_2002_l.jsp";
				break;
			case HDPrsnWBMapping.HD_PRSN_2003:
				wb = new HD_PRSN_1000WB();
				((HD_PRSN_1000WB)wb).hd_prsn_2003_l(req, res);
				nextPage = "/jsp/hd/prsn/hd_prsn_2003_l.jsp";
				break;
			case HDPrsnWBMapping.HD_PRSN_2004:
				wb = new HD_PRSN_1000WB();
				((HD_PRSN_1000WB)wb).hd_prsn_2004_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDPrsnWBMapping.HD_PRSN_2005:
				wb = new HD_PRSN_1000WB();
				((HD_PRSN_1000WB)wb).hd_prsn_2005_l(req, res);
				nextPage = "/jsp/hd/prsn/hd_prsn_2005_l.jsp";
				break;
			case HDPrsnWBMapping.HD_PRSN_2006:
				wb = new HD_PRSN_1000WB();
				((HD_PRSN_1000WB)wb).hd_prsn_2006_l(req, res);
				nextPage = "/jsp/hd/prsn/hd_prsn_2006_l.jsp";
				break;
			case HDPrsnWBMapping.HD_PRSN_2007:
				wb = new HD_PRSN_1000WB();
				((HD_PRSN_1000WB)wb).hd_prsn_2007_l(req, res);
				nextPage = "/jsp/hd/prsn/hd_prsn_2007_l.jsp";
				break;
			case HDPrsnWBMapping.HD_PRSN_2010:
				wb = new HD_PRSN_1000WB();
				((HD_PRSN_1000WB)wb).hd_prsn_2010_a(req, res);
				nextPage = "/jsp/hd/prsn/hd_prsn_2010_a.jsp";
				//nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDPrsnWBMapping.HD_PRSN_5000_L:
				wb = new HD_PRSN_1000WB();
				((HD_PRSN_1000WB)wb).hd_prsn_5000_l(req, res);
				nextPage = "/jsp/hd/prsn/hd_prsn_5000_l.jsp";
				break;
				//���ܰ�����&��������� ����  
			case HDPrsnWBMapping.HD_PRSN_6001_L:
				wb = new HD_PRSN_1000WB();
				((HD_PRSN_1000WB)wb).hd_prsn_6001_l(req, res);
				nextPage = "/jsp/hd/prsn/hd_prsn_6001_l.jsp";
				break;
			case HDPrsnWBMapping.HD_PRSN_6002_A:
				wb = new HD_PRSN_1000WB();
				((HD_PRSN_1000WB)wb).hd_prsn_6002_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDPrsnWBMapping.HD_PRSN_6003_D:
				wb = new HD_PRSN_1000WB();
				((HD_PRSN_1000WB)wb).hd_prsn_6003_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}
