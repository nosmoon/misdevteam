/***************************************************************************************************
 * ���ϸ� : PLTrnServlet.java
 * ��� :  ȸ����������
 * �ۼ����� : 2009.04.01
 * �ۼ��� : ����
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.trn.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.pl.trn.wb.PL_TRN_1000WB;
import chosun.ciis.pl.trn.wb.PL_TRN_1100WB;
import chosun.ciis.pl.trn.wb.PL_TRN_1200WB;
import chosun.ciis.pl.trn.wb.PL_TRN_1300WB;
import chosun.ciis.pl.base.servlet.BaseServlet;

public class PLTrnServlet extends BaseServlet {


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
            String servletMappedUrl = "/pl/trn/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("PLTrnServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("PLTrnServlet : process : nextPage : " + nextPage);
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
     * PLTrnWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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

        PL_TRN_1000WB wb1000 = null;
        PL_TRN_1100WB wb1100 = null;
        PL_TRN_1200WB wb1200 = null;
        PL_TRN_1300WB wb1300 = null;
        
        switch (pid) {
            //�������ŷ�ó��ȸ�� ����
        	case PLTrnWBMapping.PL_TRN_1000:
        		wb1000 = new PL_TRN_1000WB();
                System.out.println("PL_TRN_1000:::::::::::::::");
        		wb1000.pl_trn_1000_m(req, res);
        		nextPage = "/jsp/pl/trn/pl_trn_1000_m.jsp";
        		break;        
            //�������ŷ�ó��ȸ�� ��ȸ
        	case PLTrnWBMapping.PL_TRN_1010:
        		wb1000 = new PL_TRN_1000WB();
                System.out.println("PL_TRN_1010:::::::::::::::");
        		wb1000.pl_trn_1010_l(req, res);
        		nextPage = "/jsp/pl/trn/pl_trn_1010_l.jsp";
        		break;        
            //�������ŷ�ó��ȸ�� ����ȸ
        	case PLTrnWBMapping.PL_TRN_1020:
        		wb1000 = new PL_TRN_1000WB();
                System.out.println("PL_TRN_1020:::::::::::::::");
        		wb1000.pl_trn_1020_l(req, res);
        		nextPage = "/jsp/pl/trn/pl_trn_1020_l.jsp";
        		break;        
            //�������ŷ�ó��ȸ�� ����/����
        	case PLTrnWBMapping.PL_TRN_1030:
        		wb1000 = new PL_TRN_1000WB();
                System.out.println("PL_TRN_1030:::::::::::::::");
        		wb1000.pl_trn_1030_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            //��������ü��ȸ�� ����
        	case PLTrnWBMapping.PL_TRN_1100:
        		wb1100 = new PL_TRN_1100WB();
                System.out.println("PL_TRN_1100:::::::::::::::");
        		wb1100.pl_trn_1100_m(req, res);
        		nextPage = "/jsp/pl/trn/pl_trn_1100_m.jsp";
        		break;        
            //��������ü��ȸ�� ��ȸ
        	case PLTrnWBMapping.PL_TRN_1110:
        		wb1100 = new PL_TRN_1100WB();
                System.out.println("PL_TRN_1110:::::::::::::::");
        		wb1100.pl_trn_1110_l(req, res);
        		nextPage = "/jsp/pl/trn/pl_trn_1110_l.jsp";
        		break;        
            //��������ü��ȸ�� ����ȸ
        	case PLTrnWBMapping.PL_TRN_1120:
        		wb1100 = new PL_TRN_1100WB();
                System.out.println("PL_TRN_1120:::::::::::::::");
        		wb1100.pl_trn_1120_l(req, res);
        		nextPage = "/jsp/pl/trn/pl_trn_1120_l.jsp";
        		break;        
            //��������ü��ȸ�� ����/����
        	case PLTrnWBMapping.PL_TRN_1130:
        		wb1100 = new PL_TRN_1100WB();
                System.out.println("PL_TRN_1130:::::::::::::::");
        		wb1100.pl_trn_1130_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            //���ົ�ŷ�ó��ȸ�� ����
        	case PLTrnWBMapping.PL_TRN_1200:
        		wb1200 = new PL_TRN_1200WB();
                System.out.println("PL_TRN_1200:::::::::::::::");
        		wb1200.pl_trn_1200_m(req, res);
        		nextPage = "/jsp/pl/trn/pl_trn_1200_m.jsp";
        		break;        
            //���ົ�ŷ�ó��ȸ�� ��ȸ
        	case PLTrnWBMapping.PL_TRN_1210:
        		wb1200 = new PL_TRN_1200WB();
                System.out.println("PL_TRN_1210:::::::::::::::");
        		wb1200.pl_trn_1210_l(req, res);
        		nextPage = "/jsp/pl/trn/pl_trn_1210_l.jsp";
        		break;        
            //���ົ�ŷ�ó��ȸ�� ����ȸ
        	case PLTrnWBMapping.PL_TRN_1220:
        		wb1200 = new PL_TRN_1200WB();
                System.out.println("PL_TRN_1220:::::::::::::::");
        		wb1200.pl_trn_1220_l(req, res);
        		nextPage = "/jsp/pl/trn/pl_trn_1220_l.jsp";
        		break;        
            //���ົ�ŷ�ó��ȸ�� ����/����
        	case PLTrnWBMapping.PL_TRN_1230:
        		wb1200 = new PL_TRN_1200WB();
                System.out.println("PL_TRN_1230:::::::::::::::");
        		wb1200.pl_trn_1230_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            //���ົ��ü��ȸ�� ����
        	case PLTrnWBMapping.PL_TRN_1300:
        		wb1300 = new PL_TRN_1300WB();
                System.out.println("PL_TRN_1300:::::::::::::::");
        		wb1300.pl_trn_1300_m(req, res);
        		nextPage = "/jsp/pl/trn/pl_trn_1300_m.jsp";
        		break;        
            //���ົ��ü��ȸ�� ��ȸ
        	case PLTrnWBMapping.PL_TRN_1310:
        		wb1300 = new PL_TRN_1300WB();
                System.out.println("PL_TRN_1310:::::::::::::::");
        		wb1300.pl_trn_1310_l(req, res);
        		nextPage = "/jsp/pl/trn/pl_trn_1310_l.jsp";
        		break;        
            //���ົ��ü��ȸ�� ����ȸ
        	case PLTrnWBMapping.PL_TRN_1320:
        		wb1300 = new PL_TRN_1300WB();
                System.out.println("PL_TRN_1320:::::::::::::::");
        		wb1300.pl_trn_1320_l(req, res);
        		nextPage = "/jsp/pl/trn/pl_trn_1320_l.jsp";
        		break;        
            //���ົ��ü��ȸ�� ����/����
        	case PLTrnWBMapping.PL_TRN_1330:
        		wb1300 = new PL_TRN_1300WB();
                System.out.println("PL_TRN_1330:::::::::::::::");
        		wb1300.pl_trn_1330_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }

        return nextPage;
    }
 
}
