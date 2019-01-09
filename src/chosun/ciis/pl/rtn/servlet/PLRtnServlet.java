/***************************************************************************************************
 * ���ϸ� : PLRtnServlet.java
 * ��� :  ��ǰ��������
 * �ۼ����� : 2009.03.30
 * �ۼ��� : ����
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.rtn.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.pl.rtn.wb.PL_RTN_1000WB;
import chosun.ciis.pl.rtn.wb.PL_RTN_1100WB;
import chosun.ciis.pl.rtn.wb.PL_RTN_1200WB;
import chosun.ciis.pl.rtn.wb.PL_RTN_1300WB;
import chosun.ciis.pl.base.servlet.BaseServlet;

public class PLRtnServlet extends BaseServlet {


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
            String servletMappedUrl = "/pl/rtn/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("PLRtnServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("PLRtnServlet : process : nextPage : " + nextPage);
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
     * PLRtnWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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

        PL_RTN_1000WB wb1000 = null;
        PL_RTN_1100WB wb1100 = null;
        PL_RTN_1200WB wb1200 = null;
        PL_RTN_1300WB wb1300 = null;
        
        switch (pid) {
            //�������ŷ�ó����ǰ ����
        	case PLRtnWBMapping.PL_RTN_1000:
        		wb1000 = new PL_RTN_1000WB();
                System.out.println("PL_RTN_1000:::::::::::::::");
        		wb1000.pl_rtn_1000_m(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1000_m.jsp";
        		break;        
            //�������ŷ�ó����ǰ ��ȸ
        	case PLRtnWBMapping.PL_RTN_1010:
        		wb1000 = new PL_RTN_1000WB();
                System.out.println("PL_RTN_1010:::::::::::::::");
        		wb1000.pl_rtn_1010_l(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1010_l.jsp";
        		break;        
            //�������ŷ�ó����ǰ ����ȸ
        	case PLRtnWBMapping.PL_RTN_1020:
        		wb1000 = new PL_RTN_1000WB();
                System.out.println("PL_RTN_1020:::::::::::::::");
        		wb1000.pl_rtn_1020_l(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1020_l.jsp";
        		break;        
            //�������ŷ�ó����ǰ �����ȸ
        	case PLRtnWBMapping.PL_RTN_1030:
        		wb1000 = new PL_RTN_1000WB();
                System.out.println("PL_RTN_1030:::::::::::::::");
        		wb1000.pl_rtn_1030_l(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1030_l.jsp";
        		break;        
            //�������ŷ�ó����ǰ ����/����
        	case PLRtnWBMapping.PL_RTN_1040:
        		wb1000 = new PL_RTN_1000WB();
                System.out.println("PL_RTN_1040:::::::::::::::");
        		wb1000.pl_rtn_1040_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            //��������ü����ǰ ����
        	case PLRtnWBMapping.PL_RTN_1100:
        		wb1100 = new PL_RTN_1100WB();
                System.out.println("PL_RTN_1100:::::::::::::::");
        		wb1100.pl_rtn_1100_m(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1100_m.jsp";
        		break;        
            //��������ü����ǰ ��ȸ
        	case PLRtnWBMapping.PL_RTN_1110:
        		wb1100 = new PL_RTN_1100WB();
                System.out.println("PL_RTN_1110:::::::::::::::");
        		wb1100.pl_rtn_1110_l(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1110_l.jsp";
        		break;        
            //��������ü����ǰ ����ȸ
        	case PLRtnWBMapping.PL_RTN_1120:
        		wb1100 = new PL_RTN_1100WB();
                System.out.println("PL_RTN_1120:::::::::::::::");
        		wb1100.pl_rtn_1120_l(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1120_l.jsp";
        		break;        
            //��������ü����ǰ ����/����
        	case PLRtnWBMapping.PL_RTN_1130:
        		wb1100 = new PL_RTN_1100WB();
                System.out.println("PL_RTN_1130:::::::::::::::");
        		wb1100.pl_rtn_1130_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            //���ົ�ŷ�ó����ǰ ����
        	case PLRtnWBMapping.PL_RTN_1200:
        		wb1200 = new PL_RTN_1200WB();
                System.out.println("PL_RTN_1200:::::::::::::::");
        		wb1200.pl_rtn_1200_m(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1200_m.jsp";
        		break;        
            //���ົ�ŷ�ó����ǰ ��ȸ
        	case PLRtnWBMapping.PL_RTN_1210:
        		wb1200 = new PL_RTN_1200WB();
                System.out.println("PL_RTN_1210:::::::::::::::");
        		wb1200.pl_rtn_1210_l(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1210_l.jsp";
        		break;        
            //���ົ�ŷ�ó����ǰ ����ȸ
        	case PLRtnWBMapping.PL_RTN_1220:
        		wb1200 = new PL_RTN_1200WB();
                System.out.println("PL_RTN_1220:::::::::::::::");
        		wb1200.pl_rtn_1220_l(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1220_l.jsp";
        		break;        
            //���ົ�ŷ�ó����ǰ ����/����
        	case PLRtnWBMapping.PL_RTN_1230:
        		wb1200 = new PL_RTN_1200WB();
                System.out.println("PL_RTN_1230:::::::::::::::");
        		wb1200.pl_rtn_1230_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        
            //���ົ�ŷ�ó����ǰ �����ȸ
        	case PLRtnWBMapping.PL_RTN_1240:
        		wb1200 = new PL_RTN_1200WB();
                System.out.println("PL_RTN_1240:::::::::::::::");
        		wb1200.pl_rtn_1240_l(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1240_l.jsp";
        		break;        

            //���ົ��ü����ǰ ����
        	case PLRtnWBMapping.PL_RTN_1300:
        		wb1300 = new PL_RTN_1300WB();
                System.out.println("PL_RTN_1300:::::::::::::::");
        		wb1300.pl_rtn_1300_m(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1300_m.jsp";
        		break;        
            //���ົ��ü����ǰ ��ȸ
        	case PLRtnWBMapping.PL_RTN_1310:
        		wb1300 = new PL_RTN_1300WB();
                System.out.println("PL_RTN_1310:::::::::::::::");
        		wb1300.pl_rtn_1310_l(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1310_l.jsp";
        		break;        
            //���ົ��ü����ǰ ����ȸ
        	case PLRtnWBMapping.PL_RTN_1320:
        		wb1300 = new PL_RTN_1300WB();
                System.out.println("PL_RTN_1320:::::::::::::::");
        		wb1300.pl_rtn_1320_l(req, res);
        		nextPage = "/jsp/pl/rtn/pl_rtn_1320_l.jsp";
        		break;        
            //���ົ��ü����ǰ ����/����
        	case PLRtnWBMapping.PL_RTN_1330:
        		wb1300 = new PL_RTN_1300WB();
                System.out.println("PL_RTN_1330:::::::::::::::");
        		wb1300.pl_rtn_1330_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}
