/***************************************************************************************************
* ���ϸ� : MtPapmedaServlet��Ź�μ����� �����μ���� ����
* �ۼ����� : 2009-05-06
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.mt.papmeda.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.mt.papmeda.wb.*;
import chosun.ciis.co.base.servlet.BaseServlet;

public class MtPapmedaServlet extends BaseServlet {

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
            String servletMappedUrl = "/mt/papmeda/";
            iPid = extractPid(req, servletMappedUrl);

            System.out.println("MT_PAPMEDA_Servlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("MT_PAPMEDA_Servlet : process : nextPage : " + nextPage);
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
    public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException, IOException {
		String nextPage = null;
		MT_PAPMEDA_1000WB wb  = null;

		switch(pid) {
			//��Źó, ������, ��ü�޺�
			case MtPapmedaWBMapping.MT_PAPMEDA_1000:
				wb = new MT_PAPMEDA_1000WB();
				((MT_PAPMEDA_1000WB)wb).mt_papmeda_1000_m(req, res);
				nextPage = "/jsp/mt/papmeda/mt_papmeda_1000_m.jsp";
				break;
			//����ڵ�Ϲ�ȣ ��ȸ
			case MtPapmedaWBMapping.MT_PAPMEDA_1100:
				wb = new MT_PAPMEDA_1000WB();
				((MT_PAPMEDA_1000WB)wb).mt_papmeda_1100_l(req, res);
				nextPage = "/jsp/mt/papmeda/mt_papmeda_1100_l.jsp";
				break;
			//��Źó�����ݾ׳��� ����,����,����
			case MtPapmedaWBMapping.MT_PAPMEDA_1101:
				wb = new MT_PAPMEDA_1000WB();
				((MT_PAPMEDA_1000WB)wb).mt_papmeda_1101_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//��Źó�����ݾ׳��� ��ȸ
			case MtPapmedaWBMapping.MT_PAPMEDA_1102:
				wb = new MT_PAPMEDA_1000WB();
				((MT_PAPMEDA_1000WB)wb).mt_papmeda_1102_l(req, res);
				nextPage = "/jsp/mt/papmeda/mt_papmeda_1102_l.jsp";
				break;
//				��Źó�����ݾ׳��� ��ȸ
			case MtPapmedaWBMapping.MT_PAPMEDA_1104:
				wb = new MT_PAPMEDA_1000WB();
				((MT_PAPMEDA_1000WB)wb).mt_papmeda_1104_m(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//��Źó�� ��ȸ - ��Źó(�����׸���)��ȸ
			case MtPapmedaWBMapping.MT_PAPMEDA_1200:
				wb = new MT_PAPMEDA_1000WB();
				((MT_PAPMEDA_1000WB)wb).mt_papmeda_1200_l(req, res);
				nextPage = "/jsp/mt/papmeda/mt_papmeda_1200_l.jsp";
				break;
			//��Źó�� ��ȸ
			case MtPapmedaWBMapping.MT_PAPMEDA_1201:
				wb = new MT_PAPMEDA_1000WB();
				((MT_PAPMEDA_1000WB)wb).mt_papmeda_1201_l(req, res);
				nextPage = "/jsp/mt/papmeda/mt_papmeda_1201_l.jsp";
				break;
			//�����纰 ��ȸ - ������(�����׸���)��ȸ
			case MtPapmedaWBMapping.MT_PAPMEDA_1300:
				wb = new MT_PAPMEDA_1000WB();
				((MT_PAPMEDA_1000WB)wb).mt_papmeda_1300_l(req, res);
				nextPage = "/jsp/mt/papmeda/mt_papmeda_1300_l.jsp";
				break;
			//�����纰 ��ȸ
			case MtPapmedaWBMapping.MT_PAPMEDA_1301:
				wb = new MT_PAPMEDA_1000WB();
				((MT_PAPMEDA_1000WB)wb).mt_papmeda_1301_l(req, res);
				nextPage = "/jsp/mt/papmeda/mt_papmeda_1301_l.jsp";
				break;
			default:
				throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
			}
		return nextPage;
	}
}
