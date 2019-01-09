/***************************************************************************************************
 * ���ϸ� : PLAssServlet.java
 * ��� :  ������������
 * �ۼ����� : 2009.03.12
 * �ۼ��� : ����
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.ass.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.pl.ass.wb.PL_ASS_1000WB;
import chosun.ciis.pl.ass.wb.PL_ASS_1100WB;
import chosun.ciis.pl.base.servlet.BaseServlet;

public class PLAssServlet extends BaseServlet {


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
            String servletMappedUrl = "/pl/ass/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("PLAssServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("PLAssServlet : process : nextPage : " + nextPage);
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
     * PLAssWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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

        PL_ASS_1000WB wb1000 = null;
        PL_ASS_1100WB wb1100 = null;
        
        switch (pid) {
            //���������� ����
        	case PLAssWBMapping.PL_ASS_1000:
        		wb1000 = new PL_ASS_1000WB();
                System.out.println("PL_ASS_1000:::::::::::::::");
        		wb1000.pl_ass_1000_m(req, res);
        		nextPage = "/jsp/pl/ass/pl_ass_1000_m.jsp";
        		break;        
            //���������� ������ȹ
        	case PLAssWBMapping.PL_ASS_1010:
        		wb1000 = new PL_ASS_1000WB();
                System.out.println("PL_ASS_1010:::::::::::::::");
        		wb1000.pl_ass_1010_l(req, res);
        		nextPage = "/jsp/pl/ass/pl_ass_1010_l.jsp";
        		break;        
            //���������� ������ȸ
        	case PLAssWBMapping.PL_ASS_1020:
        		wb1000 = new PL_ASS_1000WB();
                System.out.println("PL_ASS_1020:::::::::::::::");
        		wb1000.pl_ass_1020_l(req, res);
        		nextPage = "/jsp/pl/ass/pl_ass_1020_l.jsp";
        		break;        
            //���������� ���/����/����
        	case PLAssWBMapping.PL_ASS_1030:
        		wb1000 = new PL_ASS_1000WB();
                System.out.println("PL_ASS_1030:::::::::::::::");
        		wb1000.pl_ass_1030_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        
            //���������� ȣ��Get
        	case PLAssWBMapping.PL_ASS_1040:
        		wb1000 = new PL_ASS_1000WB();
                System.out.println("PL_ASS_1040:::::::::::::::");
        		wb1000.pl_ass_1040_s(req, res);
        		nextPage = "/jsp/pl/ass/pl_ass_1040_s.jsp";
        		break;        

            //���ົ���� ����
        	case PLAssWBMapping.PL_ASS_1100:
        		wb1100 = new PL_ASS_1100WB();
                System.out.println("PL_ASS_1100:::::::::::::::");
        		wb1100.pl_ass_1100_m(req, res);
        		nextPage = "/jsp/pl/ass/pl_ass_1100_m.jsp";
        		break;        
            //���ົ���� ������ȹ
        	case PLAssWBMapping.PL_ASS_1110:
        		wb1100 = new PL_ASS_1100WB();
                System.out.println("PL_ASS_1110:::::::::::::::");
        		wb1100.pl_ass_1110_l(req, res);
        		nextPage = "/jsp/pl/ass/pl_ass_1110_l.jsp";
        		break;        
            //���ົ���� ������ȸ
        	case PLAssWBMapping.PL_ASS_1120:
        		wb1100 = new PL_ASS_1100WB();
                System.out.println("PL_ASS_1120:::::::::::::::");
        		wb1100.pl_ass_1120_l(req, res);
        		nextPage = "/jsp/pl/ass/pl_ass_1120_l.jsp";
        		break;        
            //���ົ���� ���/����/����
        	case PLAssWBMapping.PL_ASS_1130:
        		wb1100 = new PL_ASS_1100WB();
                System.out.println("PL_ASS_1130:::::::::::::::");
        		wb1100.pl_ass_1130_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}
