/***************************************************************************************************
 * ���ϸ� : PLLstServlet.java
 * ��� :  ��°�������
 * �ۼ����� : 2009.05.25
 * �ۼ��� : ����
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.lst.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.pl.lst.wb.PL_LST_1000WB;
import chosun.ciis.pl.lst.wb.PL_LST_3000WB;
import chosun.ciis.pl.base.servlet.BaseServlet;

public class PLLstServlet extends BaseServlet {


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
//        String requestURI = null;
//        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/pl/lst/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("PLLstServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("PLLstServlet : process : nextPage : " + nextPage);
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
     * PLLstWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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

        PL_LST_1000WB wb1000 = null;
        PL_LST_3000WB wb3000 = null;
        
        switch (pid) {
        	//�ŷ����� ����
        	case PLLstWBMapping.PL_LST_1000:
        		wb1000 = new PL_LST_1000WB();
                System.out.println("PL_LST_1000:::::::::::::::");
                wb1000.pl_lst_1000_m(req, res);
				nextPage = "/jsp/pl/lst/pl_lst_1000_m.jsp";
				break;

        	//����� UPLOAD�� ���� DOWNLOAD
        	case PLLstWBMapping.PL_LST_1710:
        		wb1000 = new PL_LST_1000WB();
                System.out.println("PL_LST_1710:::::::::::::::");
                wb1000.pl_lst_1710_p(req, res);
				nextPage = "/jsp/pl/lst/pl_lst_1710_p.jsp";
				break;

        	//�������� ����
        	case PLLstWBMapping.PL_LST_3000:
        		wb3000 = new PL_LST_3000WB();
                System.out.println("PL_LST_3000:::::::::::::::");
                wb3000.pl_lst_3000_m(req, res);
				nextPage = "/jsp/pl/lst/pl_lst_3000_m.jsp";
				break;

            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}
