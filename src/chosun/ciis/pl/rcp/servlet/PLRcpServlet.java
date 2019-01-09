/***************************************************************************************************
 * ���ϸ� : PLRcpServlet.java
 * ��� :  �Աݰ�������
 * �ۼ����� : 2009.04.15
 * �ۼ��� : ����
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.rcp.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.pl.rcp.wb.PL_RCP_1000WB;
import chosun.ciis.pl.rcp.wb.PL_RCP_1100WB;
import chosun.ciis.pl.rcp.wb.PL_RCP_3000WB;
import chosun.ciis.pl.rcp.wb.PL_RCP_3100WB;
import chosun.ciis.pl.rcp.wb.PL_RCP_3200WB;
import chosun.ciis.pl.rcp.wb.PL_RCP_3300WB;
import chosun.ciis.pl.rcp.wb.PL_RCP_3400WB;
import chosun.ciis.pl.rcp.wb.PL_RCP_3500WB;
import chosun.ciis.pl.base.servlet.BaseServlet;

public class PLRcpServlet extends BaseServlet {


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
            String servletMappedUrl = "/pl/rcp/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("PLRcpServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("PLRcpServlet : process : nextPage : " + nextPage);
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
     * PLRcpWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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

        PL_RCP_1000WB wb1000 = null;
        PL_RCP_1100WB wb1100 = null;
        PL_RCP_3000WB wb3000 = null;
        PL_RCP_3100WB wb3100 = null;
        PL_RCP_3200WB wb3200 = null;
        PL_RCP_3300WB wb3300 = null;
        PL_RCP_3400WB wb3400 = null;
        PL_RCP_3500WB wb3500 = null;
        
        switch (pid) {
            //�Աݵ�ϰ��� ����
        	case PLRcpWBMapping.PL_RCP_1000:
        		wb1000 = new PL_RCP_1000WB();
                System.out.println("PL_RCP_1000:::::::::::::::");
        		wb1000.pl_rcp_1000_m(req, res);
        		nextPage = "/jsp/pl/rcp/pl_rcp_1000_m.jsp";
        		break;        
            //�Աݵ�ϰ��� ��ȸ
        	case PLRcpWBMapping.PL_RCP_1010:
        		wb1000 = new PL_RCP_1000WB();
                System.out.println("PL_RCP_1010:::::::::::::::");
        		wb1000.pl_rcp_1010_l(req, res);
        		nextPage = "/jsp/pl/rcp/pl_rcp_1010_l.jsp";
        		break;        
            //�Աݵ�ϰ��� ����ȸ
        	case PLRcpWBMapping.PL_RCP_1020:
        		wb1000 = new PL_RCP_1000WB();
                System.out.println("PL_RCP_1020:::::::::::::::");
        		wb1000.pl_rcp_1020_l(req, res);
        		nextPage = "/jsp/pl/rcp/pl_rcp_1020_l.jsp";
        		break;        
            //�Աݵ�ϰ��� �����ݹ׸���������ȸ
        	case PLRcpWBMapping.PL_RCP_1030:
        		wb1000 = new PL_RCP_1000WB();
                System.out.println("PL_RCP_1030:::::::::::::::");
        		wb1000.pl_rcp_1030_l(req, res);
        		nextPage = "/jsp/pl/rcp/pl_rcp_1030_l.jsp";
        		break;        
            //�Աݵ�ϰ��� ����/����
        	case PLRcpWBMapping.PL_RCP_1040:
        		wb1000 = new PL_RCP_1000WB();
                System.out.println("PL_RCP_1040:::::::::::::::");
        		wb1000.pl_rcp_1040_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            //�Աݹ�ȯó�� ����
        	case PLRcpWBMapping.PL_RCP_1100:
        		wb1100 = new PL_RCP_1100WB();
                System.out.println("PL_RCP_1100:::::::::::::::");
        		wb1100.pl_rcp_1100_m(req, res);
        		nextPage = "/jsp/pl/rcp/pl_rcp_1100_m.jsp";
        		break;        
            //�Աݹ�ȯó�� ��ȸ
        	case PLRcpWBMapping.PL_RCP_1110:
        		wb1100 = new PL_RCP_1100WB();
                System.out.println("PL_RCP_1110:::::::::::::::");
        		wb1100.pl_rcp_1110_l(req, res);
        		nextPage = "/jsp/pl/rcp/pl_rcp_1110_l.jsp";
        		break;        
            //�Աݹ�ȯó�� ����ȸ
        	case PLRcpWBMapping.PL_RCP_1120:
        		wb1100 = new PL_RCP_1100WB();
                System.out.println("PL_RCP_1120:::::::::::::::");
        		wb1100.pl_rcp_1120_l(req, res);
        		nextPage = "/jsp/pl/rcp/pl_rcp_1120_l.jsp";
        		break;        
            //�Աݹ�ȯó�� �����ݹ׸���������ȸ
        	case PLRcpWBMapping.PL_RCP_1130:
        		wb1100 = new PL_RCP_1100WB();
                System.out.println("PL_RCP_1130:::::::::::::::");
        		wb1100.pl_rcp_1130_l(req, res);
        		nextPage = "/jsp/pl/rcp/pl_rcp_1130_l.jsp";
        		break;        
            //�Աݹ�ȯó�� ����/����
        	case PLRcpWBMapping.PL_RCP_1140:
        		wb1100 = new PL_RCP_1100WB();
                System.out.println("PL_RCP_1140:::::::::::::::");
        		wb1100.pl_rcp_1140_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            //�Ա���ǥ��ȸ ��ȸ
        	case PLRcpWBMapping.PL_RCP_3010:
        		wb3000 = new PL_RCP_3000WB();
                System.out.println("PL_RCP_3010:::::::::::::::");
        		wb3000.pl_rcp_3010_l(req, res);
        		nextPage = "/jsp/pl/rcp/pl_rcp_3010_l.jsp";
        		break;        

            //�������Աݸ��� ����
        	case PLRcpWBMapping.PL_RCP_3100:
        		wb3100 = new PL_RCP_3100WB();
                System.out.println("PL_RCP_3100:::::::::::::::");
        		wb3100.pl_rcp_3100_m(req, res);
        		nextPage = "/jsp/pl/rcp/pl_rcp_3100_m.jsp";
        		break;        
            //�������Աݸ��� ��ȸ
        	case PLRcpWBMapping.PL_RCP_3110:
        		wb3100 = new PL_RCP_3100WB();
                System.out.println("PL_RCP_3110:::::::::::::::");
        		wb3100.pl_rcp_3110_l(req, res);
        		nextPage = "/jsp/pl/rcp/pl_rcp_3110_l.jsp";
        		break;        

            //���꺰�Աݸ��� ����
        	case PLRcpWBMapping.PL_RCP_3200:
        		wb3200 = new PL_RCP_3200WB();
                System.out.println("PL_RCP_3200:::::::::::::::");
        		wb3200.pl_rcp_3200_m(req, res);
        		nextPage = "/jsp/pl/rcp/pl_rcp_3200_m.jsp";
        		break;        
            //���꺰�Աݸ��� ��ȸ
        	case PLRcpWBMapping.PL_RCP_3210:
        		wb3200 = new PL_RCP_3200WB();
                System.out.println("PL_RCP_3210:::::::::::::::");
        		wb3200.pl_rcp_3210_l(req, res);
        		nextPage = "/jsp/pl/rcp/pl_rcp_3210_l.jsp";
        		break;        

            //�㺸������Ȳ ����
        	case PLRcpWBMapping.PL_RCP_3300:
        		wb3300 = new PL_RCP_3300WB();
                System.out.println("PL_RCP_3300:::::::::::::::");
        		wb3300.pl_rcp_3300_m(req, res);
        		nextPage = "/jsp/pl/rcp/pl_rcp_3300_m.jsp";
        		break;        
            //�㺸������Ȳ ��ȸ
        	case PLRcpWBMapping.PL_RCP_3310:
        		wb3300 = new PL_RCP_3300WB();
                System.out.println("PL_RCP_3310:::::::::::::::");
        		wb3300.pl_rcp_3310_l(req, res);
        		nextPage = "/jsp/pl/rcp/pl_rcp_3310_l.jsp";
        		break;        

            //�̼��϶�ǥ ����
        	case PLRcpWBMapping.PL_RCP_3400:
        		wb3400 = new PL_RCP_3400WB();
                System.out.println("PL_RCP_3400:::::::::::::::");
        		wb3400.pl_rcp_3400_m(req, res);
        		nextPage = "/jsp/pl/rcp/pl_rcp_3400_m.jsp";
        		break;        
            //�̼��϶�ǥ ��ȸ
        	case PLRcpWBMapping.PL_RCP_3410:
        		wb3400 = new PL_RCP_3400WB();
                System.out.println("PL_RCP_3410:::::::::::::::");
        		wb3400.pl_rcp_3410_l(req, res);
        		nextPage = "/jsp/pl/rcp/pl_rcp_3410_l.jsp";
        		break;        

            //��������Ȳ ����
        	case PLRcpWBMapping.PL_RCP_3500:
        		wb3500 = new PL_RCP_3500WB();
                System.out.println("PL_RCP_3500:::::::::::::::");
        		wb3500.pl_rcp_3500_m(req, res);
        		nextPage = "/jsp/pl/rcp/pl_rcp_3500_m.jsp";
        		break;        
            //��������Ȳ ��ȸ(��1)
        	case PLRcpWBMapping.PL_RCP_3510:
        		wb3500 = new PL_RCP_3500WB();
                System.out.println("PL_RCP_3510:::::::::::::::");
        		wb3500.pl_rcp_3510_l(req, res);
        		nextPage = "/jsp/pl/rcp/pl_rcp_3510_l.jsp";
        		break;        
            //��������Ȳ ��ȸ(��2)
        	case PLRcpWBMapping.PL_RCP_3520:
        		wb3500 = new PL_RCP_3500WB();
                System.out.println("PL_RCP_3520:::::::::::::::");
        		wb3500.pl_rcp_3520_l(req, res);
        		nextPage = "/jsp/pl/rcp/pl_rcp_3520_l.jsp";
        		break;        

            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}
