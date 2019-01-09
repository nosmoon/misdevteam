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


package chosun.ciis.mt.etcpc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.mt.etcpc.wb.*;
import chosun.ciis.co.base.servlet.BaseServlet;

public class MtEtcpcServlet extends BaseServlet {

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
            String servletMappedUrl = "/mt/etcpc/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("CODlcoServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("CODlcoServlet : process : nextPage : " + nextPage);
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
		MT_ETCPC_1000WB wb = null;
		MT_ETCPC_2000WB wb2 = null;
		MT_ETCPC_3000WB wb3 = null;
		MT_ETCPC_4000WB wb4 = null;
		MT_ETCPC_6000WB wb6 = null;
		
		switch(pid) {
			case MtEtcpcWBMapping.MT_ETCPC_1101:
				wb = new MT_ETCPC_1000WB();
				((MT_ETCPC_1000WB)wb).mt_etcpc_1101_m(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_1101_m.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_1100:
				wb = new MT_ETCPC_1000WB();
				((MT_ETCPC_1000WB)wb).mt_etcpc_1100_l(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_1100_l.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_1105:
				wb = new MT_ETCPC_1000WB();
				((MT_ETCPC_1000WB)wb).mt_etcpc_1105_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_1201:
				wb = new MT_ETCPC_1000WB();
				((MT_ETCPC_1000WB)wb).mt_etcpc_1201_m(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_1201_m.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_1200:
				wb = new MT_ETCPC_1000WB();
				((MT_ETCPC_1000WB)wb).mt_etcpc_1200_l(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_1200_l.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_1202:
				wb = new MT_ETCPC_1000WB();
				((MT_ETCPC_1000WB)wb).mt_etcpc_1202_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_1203:
				wb = new MT_ETCPC_1000WB();
				((MT_ETCPC_1000WB)wb).mt_etcpc_1203_m(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_1203_m.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_1301:
				wb = new MT_ETCPC_1000WB();
				((MT_ETCPC_1000WB)wb).mt_etcpc_1301_m(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_1301_m.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_1302:
				wb = new MT_ETCPC_1000WB();
				((MT_ETCPC_1000WB)wb).mt_etcpc_1302_m(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_1302_m.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_1303:
				wb = new MT_ETCPC_1000WB();
				((MT_ETCPC_1000WB)wb).mt_etcpc_1303_l(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_1303_l.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_1304:
				wb = new MT_ETCPC_1000WB();
				((MT_ETCPC_1000WB)wb).mt_etcpc_1304_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_1305:
				wb = new MT_ETCPC_1000WB();
				((MT_ETCPC_1000WB)wb).mt_etcpc_1305_m(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_1305_m.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_2001:
				wb2 = new MT_ETCPC_2000WB();
				((MT_ETCPC_2000WB)wb2).mt_etcpc_2001_m(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_2001_m.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_2002:
				wb2 = new MT_ETCPC_2000WB();
				((MT_ETCPC_2000WB)wb2).mt_etcpc_2002_m(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_2002_m.jsp";
				break;
			case MtEtcpcWBMapping.MT_ETCPC_2003:
				wb2 = new MT_ETCPC_2000WB();
				((MT_ETCPC_2000WB)wb2).mt_etcpc_2003_l(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_2003_l.jsp";
				break;
			
			// ����� ��ȸ	
			case MtEtcpcWBMapping.MT_ETCPC_2000:
				wb2 = new MT_ETCPC_2000WB();
				((MT_ETCPC_2000WB)wb2).mt_etcpc_2000_l(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_2000_l.jsp";
				break;
			// �����,����,����
			case MtEtcpcWBMapping.MT_ETCPC_2103:
				wb2 = new MT_ETCPC_2000WB();
				((MT_ETCPC_2000WB)wb2).mt_etcpc_2103_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			//����� H/W ��ȸ
			case MtEtcpcWBMapping.MT_ETCPC_2200:
				wb2 = new MT_ETCPC_2000WB();
				((MT_ETCPC_2000WB)wb2).mt_etcpc_2200_l(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_2200_l.jsp";
				break;
			//����� H/W ����/����/����
			case MtEtcpcWBMapping.MT_ETCPC_2201:
				wb2 = new MT_ETCPC_2000WB();
				((MT_ETCPC_2000WB)wb2).mt_etcpc_2201_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
            //����� S/W ��ȸ �� ��ġ���̼��� , �������̼���
			case MtEtcpcWBMapping.MT_ETCPC_2300:
				wb2 = new MT_ETCPC_2000WB();
				((MT_ETCPC_2000WB)wb2).mt_etcpc_2300_l(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_2300_l.jsp";
				break;
            // ����� S/W ����/����
			case MtEtcpcWBMapping.MT_ETCPC_2301:
				wb2 = new MT_ETCPC_2000WB();
				((MT_ETCPC_2000WB)wb2).mt_etcpc_2301_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			
			//S/W���̼��� �˾� ��ȸ
			case MtEtcpcWBMapping.MT_ETCPC_3001:
				wb3 = new MT_ETCPC_3000WB();
				((MT_ETCPC_3000WB)wb3).mt_etcpc_3001_m(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_3001_m.jsp";
				break;
			//S/W���̼��� ��ȸ
			case MtEtcpcWBMapping.MT_ETCPC_3000:
				wb3 = new MT_ETCPC_3000WB();
				((MT_ETCPC_3000WB)wb3).mt_etcpc_3000_l(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_3000_l.jsp";
				break;
			//S/W ���̼��� �Է�/����/����	
			case MtEtcpcWBMapping.MT_ETCPC_3002:
				wb3 = new MT_ETCPC_3000WB();
				((MT_ETCPC_3000WB)wb3).mt_etcpc_3002_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
            //S/W ���̼��� S/W�� �޺� ��ȸ
			case MtEtcpcWBMapping.MT_ETCPC_3003:
				wb3 = new MT_ETCPC_3000WB();
				((MT_ETCPC_3000WB)wb3).mt_etcpc_3003_m(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_3003_m.jsp";
				break;
            //������ ��볻��
			case MtEtcpcWBMapping.MT_ETCPC_4100:
				wb4 = new MT_ETCPC_4000WB();
				((MT_ETCPC_4000WB)wb4).mt_etcpc_4100_l(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_4100_l.jsp";
				break;
			//��ġ s/w �˾�	
			case MtEtcpcWBMapping.MT_ETCPC_4201:
				wb4 = new MT_ETCPC_4000WB();
				((MT_ETCPC_4000WB)wb4).mt_etcpc_4201_m(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_4201_m.jsp";
				break;
			//����Ʈ���� ��볻�� ��ȸ	
			case MtEtcpcWBMapping.MT_ETCPC_4200:
				wb4 = new MT_ETCPC_4000WB();
				((MT_ETCPC_4000WB)wb4).mt_etcpc_4200_l(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_4200_l.jsp";
				break;
			//��/���ó �����Ȳ ��ȸ
			case MtEtcpcWBMapping.MT_ETCPC_6000:
				wb6 = new MT_ETCPC_6000WB();
				((MT_ETCPC_6000WB)wb6).mt_etcpc_6000_l(req, res);
				nextPage = "/jsp/mt/etcpc/mt_etcpc_6000_l.jsp";
				break;
			default:
				throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
			}
		return nextPage;
	}
    
    
 
}
