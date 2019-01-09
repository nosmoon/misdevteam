/**************************************************************************************************
 * ���ϸ�    : ReaderServlet.java
 * ���      : Reader �޴� ��ǥ ����
 * �ۼ�����  : 2003-11-19
 * �ۼ���    : �迵��
 **************************************************************************************************/
/**************************************************************************************************
 * ��������  : flag�� �̿��Ͽ� �������� Ÿ���� ��ȸ�����ϰ� ó��
 * ������    : ��뼷
 * ��������  : 2005-12-09
 * ���      :
 **************************************************************************************************/
package chosun.ciis.ss.sal.rdr.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.util.Util;
import chosun.ciis.ss.sal.common.servlet.ChosunServlet;
import chosun.ciis.ss.sal.rdr.wb.SLReader1100WB;
import chosun.ciis.ss.sal.rdr.wb.SLReader11100WB;

/**
 * ����
 */
public class SLReaderServlet extends ChosunServlet {

    private static final String CONTENT_TYPE = "text/html; charset=KSC5601";
    //Initialize global variables
    public void init() throws ServletException {
    }

    //Clean up resources
    public void destroy() {
    }

    public void checkAuthority() {
    //System.out.println("PilotSystem Output : checkAuthority() called.");
    }

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
        IOException, ServletException {

        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/ss/slreader/"; // �Ǹű� reader�� �����Ѵ�.
            iPid = extractPid(req, servletMappedUrl);
            nextPage = executeWorker(req, res, iPid);
        } catch (AppException ae) {
            //ae.printStackTrace();
            req.setAttribute("appException", ae);
            nextPage = "/jsp/ss/comm_jsp/app_error.jsp";
        } catch (SysException se) {
            //se.printStackTrace();
            req.setAttribute("sysException", se);
            nextPage = "/jsp/ss/comm_jsp/sys_error.jsp";
        } catch (Exception e) {
            req.setAttribute("sysException", new SysException(e));
            nextPage = "/jsp/ss/comm_jsp/sys_error.jsp";
        }

        System.out.println("[SLReaderServlet]nextPage : " + nextPage);
        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
        rd.forward(req, res);
    }

    /**
     * SLReaderWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
    public String executeWorker(HttpServletRequest req, HttpServletResponse res,  int pid) throws SysException, AppException {

        String nextPage = null;
        SLReader1100WB wb1100 = null;
        HttpSession session = req.getSession(true);

		/* ����ϰ��� wb ���� �и� 20161207 �弱�� */
        SLReader11100WB wb11100 = null; //��������_�����



        String bocd = "";
        String flag = "";

        switch (pid) {
            //������������
            case SLReaderWBMapping.READER_1100: //������������(�ʱ�ȭ)

                /* ���ڰ˻� �������κ��� �б��ϹǷ�, request�κ��� bocd ���� �� session�� ��´�*/
                bocd = req.getParameter("bocd");
                session.setAttribute("bocd",bocd);
                /*20051209 ��뼷 �߰�*/
                flag = req.getParameter("flag");
                session.setAttribute("from_flag",flag);

                //////////*****************************************************************************//////////////////
                session.setAttribute("bonm", "����");	//������ ������ �������� �ӽ� �ڵ� bobjaru. 2009.03.10
                //////////*****************************************************************************//////////////////

                wb1100 = new SLReader1100WB();
                wb1100.selectCodeList(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1100_a.jsp";
                break;
            case SLReaderWBMapping.READER_1110: //������������(����(�����߰�))
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]������ �����ϴ�.");
            case SLReaderWBMapping.READER_1120: //������������(���ڸ�ϰ˻�)
/*20051209 ��뼷 �߰�*/
                if("bo".equals(session.getAttribute("from_flag"))){
                    throw new AppException("[SLReaderServlet]","[SLReaderServlet]������ �����ϴ�.");
                }
/*20051209 ��뼷 �߰�*/
                wb1100 = new SLReader1100WB();
                wb1100.selectReaderList(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1120_l.jsp";
                break;
            case SLReaderWBMapping.READER_1130: //������������(���ڻ󼼺���)
                wb1100 = new SLReader1100WB();
                wb1100.selectReaderDetail(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1130_s.jsp";
                break;
            case SLReaderWBMapping.READER_1135: //������������(������������)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]������ �����ϴ�.");
            case SLReaderWBMapping.READER_1140: //������������(���������˾�-�ʱ�ȭ��)
                nextPage = "/jsp/ss/reader/sl_reader_1140_p.jsp";
                break;
            case SLReaderWBMapping.READER_1150: //������������(���������˾�-�������������ȸ)
/*20051209 ��뼷 �߰�*/
                if("bo".equals(session.getAttribute("from_flag"))){
                    throw new AppException("[SLReaderServlet]","[SLReaderServlet]������ �����ϴ�.");
                }
/*20051209 ��뼷 �߰�*/
                wb1100 = new SLReader1100WB();
                wb1100.selectSubsHistoryList(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1150_l.jsp";
                break;
            case SLReaderWBMapping.READER_1160: //������������(���������˾�-�޵����������ȸ)
                wb1100 = new SLReader1100WB();
                wb1100.selectStopsHistoryList(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1160_l.jsp";
                break;
            case SLReaderWBMapping.READER_1170: //������������(���������˾�-�̻系�������ȸ)
                wb1100 = new SLReader1100WB();
                wb1100.selectMoveHistoryList(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1170_l.jsp";
                break;
            case SLReaderWBMapping.READER_1180: //������������(�����߰������˾�-�ʱ�ȭ��)
                wb1100 = new SLReader1100WB();
                wb1100.initSubsCntr(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1180_p.jsp";
                break;
            case SLReaderWBMapping.READER_1185: //������������(�����߰������˾�-�����ȸ)
                wb1100 = new SLReader1100WB();
                wb1100.selectSubsCntrList(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1185_l.jsp";
                break;
            case SLReaderWBMapping.READER_1190: //������������(���������)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]������ �����ϴ�.");
            case SLReaderWBMapping.READER_1200: //������������(����������)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]������ �����ϴ�.");
            case SLReaderWBMapping.READER_1210: //������������(�����󼼺���)
                wb1100 = new SLReader1100WB();
                wb1100.selectSubsCntrDetail(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1210_s.jsp";
                break;
            case SLReaderWBMapping.READER_1220: //������������(�Աݳ��������ȸ)
                wb1100 = new SLReader1100WB();
                wb1100.selectRcpmList(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1220_l.jsp";
                break;
            case SLReaderWBMapping.READER_1225: //������������(�Աݳ����󼼺���)
                wb1100 = new SLReader1100WB();
                wb1100.selectRcpmDetail(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1225_s.jsp";
                break;
            case SLReaderWBMapping.READER_1230: //������������(�Ա���������)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]������ �����ϴ�.");
            case SLReaderWBMapping.READER_1280: //������������(���ϸ������޳����˾�-�ʱ�ȭ��)
                wb1100 = new SLReader1100WB();
                wb1100.initMilgPayHistory(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1280_p.jsp";
                break;
            case SLReaderWBMapping.READER_1285: //������������(���ϸ������޳����˾�-���)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]������ �����ϴ�.");
            case SLReaderWBMapping.READER_1290: //������������(���ϸ������޳����˾�-�����ȸ)
                wb1100 = new SLReader1100WB();
                wb1100.selectMilgPayHistoryList(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1290_l.jsp";
                break;
            case SLReaderWBMapping.READER_1293: //������������(���ϸ������޳����˾�-����ȸ)
                wb1100 = new SLReader1100WB();
                wb1100.selectMilgPayHistoryDetail(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1293_s.jsp";
                break;
            case SLReaderWBMapping.READER_1294: //������������(���ϸ������޳����˾�-����)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]������ �����ϴ�.");
            case SLReaderWBMapping.READER_1295: //������������(���ϸ������޳����˾�-����)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]������ �����ϴ�.");

            case SLReaderWBMapping.READER_1300: //������������(���������˾�-�ʱ�ȭ��)

                /* ���ڰ˻� �������κ��� �б��ϹǷ�, request�κ��� bocd ���� �� session�� ��´�*/
                bocd = req.getParameter("bocd");

                //////////*****************************************************************************//////////////////
                if( bocd!=null && bocd.equals("") == false ) {		//������ ������ �������� �ӽ� �ڵ� bobjaru. 2009.03.10
                //////////*****************************************************************************//////////////////

                //if( bocd.equals("") == false ) {
                    session.setAttribute("bocd", bocd);

                    /*20070530 ���� �߰�*/
                    flag = req.getParameter("flag");
                    session.setAttribute("from_flag",flag);
                }
                wb1100 = new SLReader1100WB();
                wb1100.initDsct(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1300_p.jsp";
                break;
            case SLReaderWBMapping.READER_1305: //������������(���������˾�-�����������)

                /* ���ڰ˻� �������κ��� �б��ϹǷ�, request�κ��� bocd ���� �� session�� ��´�*/
                bocd = req.getParameter("bocd");

                //////////*****************************************************************************//////////////////
                if( bocd!=null && bocd.equals("") == false ) {		//������ ������ �������� �ӽ� �ڵ� bobjaru. 2009.03.10
                //////////*****************************************************************************//////////////////

                //if( bocd.equals("") == false ) {
                    session.setAttribute("bocd", bocd);

                    /*20070530 ���� �߰�*/
                    flag = req.getParameter("flag");
                    session.setAttribute("from_flag",flag);
                }


               //������� ������(��Ȱ��)
                wb1100 = new SLReader1100WB();
                wb1100.selectDsctList(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1305_l.jsp";
                break;
            case SLReaderWBMapping.READER_1310: //������������(���������˾�-��������)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]������ �����ϴ�.");
            case SLReaderWBMapping.READER_1320: //������������(�����˾�)(�ʱ�ȭ��)
                nextPage = "/jsp/ss/reader/sl_reader_1320_p.jsp";
                break;
            case SLReaderWBMapping.READER_1325: //������������(�����˾�)(�ʱ�ȭ-���ڰ� �������� ��ü��� �� �������� ��ȸ)
                wb1100 = new SLReader1100WB();
                wb1100.selectStopSubsList(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1325_e.jsp";
                break;
            case SLReaderWBMapping.READER_1330: //������������(����ó��)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]������ �����ϴ�.");
            case SLReaderWBMapping.READER_1340: //������������(�̻��ΰ��˾�-�ʱ�ȭ��)
                wb1100 = new SLReader1100WB();
                wb1100.initMovmTrsf(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1340_p.jsp";
                break;
            case SLReaderWBMapping.READER_1350: //������������(�̻��ΰ��˾�-�̻��û)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]������ �����ϴ�.");
            case SLReaderWBMapping.READER_1360: //������������(ī���μ�)
            	nextPage = "/jsp/ss/reader/sl_reader_1360_t.jsp";
                break;
            case SLReaderWBMapping.READER_1370: //������������(���˹����޳����˾�-�ʱ�ȭ��)
                nextPage = "/jsp/ss/reader/sl_reader_1370_p.jsp";
                break;
            case SLReaderWBMapping.READER_1375: //������������(���˹����޳����˾�-�ʱ�ȭ��)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]������ �����ϴ�.");
            case SLReaderWBMapping.READER_1380: //������������(���˹����޳����˾�-�����ȸ)
                wb1100 = new SLReader1100WB();
                wb1100.selectBnsItemPayHistoryList(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1380_l.jsp";
                break;
            case SLReaderWBMapping.READER_1383: //������������(���˹����޳����˾�-����ȸ)
                wb1100 = new SLReader1100WB();
                wb1100.selectBnsItemPayHistoryDetail(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1383_s.jsp";
                break;
            case SLReaderWBMapping.READER_1384: //������������(���˹����޳����˾�-����)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]������ �����ϴ�.");
            case SLReaderWBMapping.READER_1385: //������������(���˹����޳����˾�-����)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]������ �����ϴ�.");
            case SLReaderWBMapping.READER_1390: //������������(��ü��û�˾�-�ʱ�ȭ��)
                nextPage = "/jsp/ss/reader/sl_reader_1390_p.jsp";
                break;
            case SLReaderWBMapping.READER_1395: //������������(��ü��û�˾�-�űԽ�û �ʱ�ȭ)
                wb1100 = new SLReader1100WB();
                wb1100.selectAplcNew(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1395_l.jsp";
                break;
            case SLReaderWBMapping.READER_1400: //������������(��ü��û�˾�-�ڵ���ü��û �Է�)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]������ �����ϴ�.");
            case SLReaderWBMapping.READER_1403: //������������(��ü��û�˾�-������û���� �ʱ�ȭ��)
                nextPage = "/jsp/ss/reader/sl_reader_1403_p.jsp";
                break;
            case SLReaderWBMapping.READER_1405: //������������(��ü��û�˾�-������û �ʱ�ȭ)
                wb1100 = new SLReader1100WB();
                wb1100.selectAplcExpy(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1405_l.jsp";
                break;
            case SLReaderWBMapping.READER_1408: //������������(��ü��û�˾�-������û����� �󼼺���)
                wb1100 = new SLReader1100WB();
                wb1100.selectAplcDetail(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1408_s.jsp";
                break;
            case SLReaderWBMapping.READER_1410: //������������(��ü��û�˾�-ī������)
                nextPage = "/jsp/ss/reader/sl_reader_1410_a.jsp";
                break;
            case SLReaderWBMapping.READER_1413: //������������(��ü��û�˾�-��ü�����ȯ �ʱ�ȭ)
                wb1100 = new SLReader1100WB();
                wb1100.selectAplcExpy(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1413_l.jsp";
                break;
            case SLReaderWBMapping.READER_1415: //������������(��ü��û�˾�-��ü�����ȯ �󼼺���)
                wb1100 = new SLReader1100WB();
                wb1100.selectAplcDetail(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1415_s.jsp";
                break;
            case SLReaderWBMapping.READER_1418: //������������(��ü��û�˾�-��ü�����ȯ)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]������ �����ϴ�.");
            case SLReaderWBMapping.READER_1420: //������������(���ڸ޸��˾�-�ʱ�ȭ��)
                //wb1100.accessRdrMemo(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1420_p.jsp";
                break;
            case SLReaderWBMapping.READER_1430: //������������(���ڸ޸��˾�-��ȸ,���,����,�ʱ�ȭ)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]������ �����ϴ�.");
            case SLReaderWBMapping.READER_1440: //������������(���������˾�-�ʱ�ȭ��))
                nextPage = "/jsp/ss/reader/sl_reader_1440_p.jsp";
                break;
            case SLReaderWBMapping.READER_1445: //������������(���������˾�-�����ȸ)
                wb1100 = new SLReader1100WB();
                wb1100.selectStopHist(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1445_l.jsp";
                break;
            case SLReaderWBMapping.READER_1450: //������������(���������˾�-�������ó��)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]������ �����ϴ�.");
            case SLReaderWBMapping.READER_1455: //������������(�������� ī��Ʈ)
                wb1100 = new SLReader1100WB();
                wb1100.dupChkRdrList(req, res); //1465 �� ����
                nextPage = "/jsp/ss/reader/sl_reader_1455_l.jsp";
                break;
            case SLReaderWBMapping.READER_1460: //������������(�������ڸ���˾�-�ʱ�ȭ��)
                nextPage = "/jsp/ss/reader/sl_reader_1460_p.jsp";
                break;
            case SLReaderWBMapping.READER_1465: //������������(�������ڸ���˾�-�����ȸ)
                wb1100 = new SLReader1100WB();
                wb1100.dupChkRdrList(req, res); //1455 �� ����
                nextPage = "/jsp/ss/reader/sl_reader_1465_l.jsp";
                break;

/*******************************************����Ͽ�******************************************************************/
             //������������
			case SLReaderWBMapping.READER_11120: // ������������(���ڸ�ϰ˻�)_����Ͽ�
				wb11100 = new SLReader11100WB();
				wb11100.mo_selectReaderList(req, res);
				nextPage =  "/jsp/ss/reader/mo_sl_reader_11120_l.jsp";
				break;
			case SLReaderWBMapping.READER_11130: // ������������(���ڻ󼼺���)_����Ͽ�
				wb11100 = new SLReader11100WB();
				wb11100.mo_selectReaderDetail(req, res);
					if (Util.checkString(req.getParameter("medicd")).equals(""))
						nextPage =  "/jsp/ss/reader/mo_sl_reader_11132_s.jsp"; //����Ͽ� ������������Ʈ+��ü����Ʈ(ciis���� �ʱ�Ŀ������Ʈ ������)agency�� 11130_s.jsp��.
					else
						nextPage =  "/jsp/ss/reader/mo_sl_reader_11131_s.jsp"; // ����� �� ��ü�� ���� �Աݳ���
				break;

            case SLReaderWBMapping.READER_11150: //������������(���������˾�-�������������ȸ)
                wb11100 = new SLReader11100WB();
                wb11100.mo_selectSubsHistoryList(req, res);
                nextPage = "/jsp/ss/reader/mo_sl_reader_11150_l.jsp";
                break;
            case SLReaderWBMapping.READER_11160: //������������(���������˾�-�޵����������ȸ)
                wb11100 = new SLReader11100WB();
                wb11100.mo_selectStopsHistoryList(req, res);
                nextPage = "/jsp/ss/reader/mo_sl_reader_11160_l.jsp";
                break;
            case SLReaderWBMapping.READER_11170: //������������(���������˾�-�̻系�������ȸ)
                wb11100 = new SLReader11100WB();
                wb11100.mo_selectMoveHistoryList(req, res);
                nextPage = "/jsp/ss/reader/mo_sl_reader_11170_l.jsp";
                break;



			//������������-���������˾�
            case SLReaderWBMapping.READER_11445: //������������(���������˾�-�����ȸ)_����Ͽ�
                wb11100 = new SLReader11100WB();
                wb11100.mo_selectStopHist(req, res);
                nextPage = "/jsp/ss/reader/mo_sl_reader_11445_l.jsp";
                break;


            default:
                nextPage = "/"; // or throw SysException...
                throw new AppException("AE003", "�ش� PID�� �����ϴ�.");
        }
        return nextPage;
    }
}
