/***************************************************************************************************
 * ���ϸ� : SSMoveServlet.java
 * ��� : �̻絶�� ����
 * �ۼ����� : 2004-01-05
 * �ۼ��� : ��뼷
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.move.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.move.dm.*;
import chosun.ciis.ss.sls.move.wb.*;
import chosun.ciis.ss.sls.move.ds.*;
import chosun.ciis.ss.sls.common.servlet.*;

/**
 * �Ǹű� �������� �̻絶�� Servlet
 */

public class SSMoveServlet extends ChosunServlet {

    private static final String CONTENT_TYPE = "text/html; charset=KSC5601";
    //Initialize global variables
    public void init() throws ServletException {
    }

    //Clean up resources
    public void destroy() {
    }

    public void checkAuthority() {
    }

    /**
     * ����ϴ� ControllerServlet �� doGet, doPost �޼ҵ忡�� ȣ��ȴ�.<br>
     * ��û�� URL�� �Ľ��Ͽ� pid�� ��� excuteWorker()�� ȣ���ϸ�,<br>
     * ���ϵ� nextPage�� request�� forward�Ѵ�.
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws IOException
     * @throws ServletException
     */
    public void process(HttpServletRequest req, HttpServletResponse res) throws
        IOException, ServletException {

        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/ss/move/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SSMoveServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SSMoveServlet : process : nextPage : " + nextPage);
        } catch (AppException ae) {
            req.setAttribute("appException", ae);
            nextPage = "/jsp/ss/comm_jsp/app_error.jsp";
        } catch (SysException se) {
            req.setAttribute("sysException", se);
            nextPage = "/jsp/ss/comm_jsp/sys_error.jsp";
        } catch (Exception e){
            req.setAttribute("sysException", new SysException(e));
            nextPage = "/jsp/ss/comm_jsp/sys_error.jsp";
        }


        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
        rd.forward(req, res);
    }

    /**
     * SSMoveWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
     * �޼ҵ带 ȣ���Ѵ�.
     * ����� ���� nextPage�� ��ȯ�Ѵ�.
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @param pid process id
     * @return forward�� nextPage
     * @throws SysException
     * @throws AppException
     */
    public String executeWorker(HttpServletRequest req, HttpServletResponse res,
                                int pid) throws AppException {

        String nextPage = null;
        SSMove1000WB wb1000 = null; //�̻絶��-��û
        SSMove1100WB wb1100 = null; //�̻絶��-����
        SSMove1200WB wb1200 = null; //�̻絶��-���
        SSMove1300WB wb1300 = null; //�̻絶��-�۱�

        switch (pid) {
            // �̻絶��-��û
            case SSMoveWBMapping.MOVE_1000: //�̻絶��-��û��Ȳ �ʱ�ȭ��
                wb1000 = new SSMove1000WB();
                wb1000.init(req, res);
                nextPage = "/jsp/ss/move/ss_move_1000_a.jsp";
                break;
            case SSMoveWBMapping.MOVE_1010: //�̻絶��-��û��Ȳ ���
                wb1000 = new SSMove1000WB();
                wb1000.selectMoveList(req, res);
                nextPage = "/jsp/ss/move/ss_move_1010_l.jsp";
                break;
            case SSMoveWBMapping.MOVE_1020: //�̻絶��-��û��Ȳ ��
                wb1000 = new SSMove1000WB();
                wb1000.selectMoveDetail(req, res);
                nextPage = "/jsp/ss/move/ss_move_1020_s.jsp";
                break;
            case SSMoveWBMapping.MOVE_1030: //�̻絶��-��û��Ȳ ���
                wb1000 = new SSMove1000WB();
                wb1000.selectMoveCancel(req, res);
                nextPage = "/jsp/ss/move/ss_move_1030_s.jsp";
                break;
            case SSMoveWBMapping.MOVE_1040: //�̻絶��-��û��Ȳ ���
                wb1000 = new SSMove1000WB();
                wb1000.updateMoveRdr(req, res);
                nextPage = "/jsp/ss/move/ss_move_1040_u.jsp";
                break;
            case SSMoveWBMapping.MOVE_1050: //�̻絶��-��û��Ȳ �����ٿ�
                wb1000 = new SSMove1000WB();
                wb1000.printMoveRdr(req, res);
                nextPage = "/jsp/ss/move/ss_move_1050_p.jsp";
                break;


            // �̻絶��-����
            case SSMoveWBMapping.MOVE_1100: //�̻絶��-���� �ʱ�ȭ��
            	wb1000 = new SSMove1000WB();
                wb1000.init(req, res);	//��Ȱ��
                nextPage = "/jsp/ss/move/ss_move_1100_a.jsp";
                break;
            case SSMoveWBMapping.MOVE_1110: //�̻絶��-���� ���
                wb1100 = new SSMove1100WB();
                wb1100.selectMoveClosList(req, res);
                nextPage = "/jsp/ss/move/ss_move_1110_l.jsp";
                break;
            case SSMoveWBMapping.MOVE_1120: //�̻絶��-���� ��
                wb1100 = new SSMove1100WB();
                wb1100.selectMoveClosDetail(req, res);
                nextPage = "/jsp/ss/move/ss_move_1120_s.jsp";
                break;
            case SSMoveWBMapping.MOVE_1130: //�̻絶��-������
                wb1100 = new SSMove1100WB();
                wb1100.insertMoveClos(req, res);
                nextPage = "/jsp/ss/move/ss_move_1130_i.jsp";
                break;
            case SSMoveWBMapping.MOVE_1140: //�̻絶��-��������
                wb1100 = new SSMove1100WB();
                wb1100.insertMoveClos(req, res);
                nextPage = "/jsp/ss/move/ss_move_1140_i.jsp";
                break;
            case SSMoveWBMapping.MOVE_1150: //�̻絶��-���� ����
                wb1100 = new SSMove1100WB();
                wb1100.saveMoveClos(req, res);
                nextPage = "/jsp/ss/move/ss_move_1150_i.jsp";
                break;
            case SSMoveWBMapping.MOVE_1160: //�̻絶��-���� ������
                wb1100 = new SSMove1100WB();
                wb1100.saveMoveClos(req, res);
                nextPage = "/jsp/ss/move/ss_move_1160_i.jsp";
                break;
            case SSMoveWBMapping.MOVE_1170: //�̻絶��-���� ������ ���
                wb1100 = new SSMove1100WB();
                wb1100.saveMoveClos(req, res);
                nextPage = "/jsp/ss/move/ss_move_1170_i.jsp";
                break;
            case SSMoveWBMapping.MOVE_1180: //�̻絶��-������ ���
                wb1100 = new SSMove1100WB();
                wb1100.insertMoveClos(req, res);
                nextPage = "/jsp/ss/move/ss_move_1180_i.jsp";
                break;
            case SSMoveWBMapping.MOVE_1190: //�̻絶��-�������� ���
                wb1100 = new SSMove1100WB();
                wb1100.insertMoveClos(req, res);
                nextPage = "/jsp/ss/move/ss_move_1190_i.jsp";
                break;    

            // �̻絶��-���
            case SSMoveWBMapping.MOVE_1200: //�������
            	wb1000 = new SSMove1000WB();
                wb1000.init(req, res);	//��Ȱ��
                nextPage = "/jsp/ss/move/ss_move_1200_a.jsp";
                break;
            case SSMoveWBMapping.MOVE_1210: //�̻絶��-���(�������)-���
                wb1200 = new SSMove1200WB();
                wb1200.selectMoveCostList(req, res);
                nextPage = "/jsp/ss/move/ss_move_1210_l.jsp";
                break;
            case SSMoveWBMapping.MOVE_1220: //�̻絶��-���(�������)-�󼼸��
                wb1200 = new SSMove1200WB();
                wb1200.rebuildMoveCost(req, res);
                nextPage = "/jsp/ss/move/ss_move_1220_i.jsp";
                break;
            case SSMoveWBMapping.MOVE_1230: //�̻絶��
                wb1200 = new SSMove1200WB();
                wb1200.detailMoveCost(req, res);
                nextPage = "/jsp/ss/move/ss_move_1230_s.jsp";
                break;  
            case SSMoveWBMapping.MOVE_1240: //�̻絶��
                wb1200 = new SSMove1200WB();
                wb1200.saveMoveBoacct(req, res);
                nextPage = "/jsp/ss/move/ss_move_1240_i.jsp";
                break;      
            
            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }
        return nextPage;
    }
}
