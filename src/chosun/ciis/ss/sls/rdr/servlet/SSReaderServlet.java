/***************************************************************************************************
 * ���ϸ� : SSReaderServlet.java
 * ��� : ������Ȳ ����
 * �ۼ����� : 2003-12-20
 * �ۼ��� : ��뼷
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� : ����������û��Ȳ �߰� �� �����ڵ� �ڸ�Ʈ ó��
 * ������ : ��뼷
 * �������� : 2005-05-04
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.ss.sls.common.servlet.ChosunServlet;
import chosun.ciis.ss.sls.rdr.wb.SSReader1000WB;
import chosun.ciis.ss.sls.rdr.wb.SSReader11000WB;
import chosun.ciis.ss.sls.rdr.wb.SSReader1100WB;
import chosun.ciis.ss.sls.rdr.wb.SSReader11100WB;
import chosun.ciis.ss.sls.rdr.wb.SSReader1200WB;
import chosun.ciis.ss.sls.rdr.wb.SSReader1300WB;
import chosun.ciis.ss.sls.rdr.wb.SSReader1400WB;
import chosun.ciis.ss.sls.rdr.wb.SSReader1500WB;
import chosun.ciis.ss.sls.rdr.wb.SSReader1600WB;
import chosun.ciis.ss.sls.rdr.wb.SSReader1700WB;
import chosun.ciis.ss.sls.rdr.wb.SSReader1900WB;
import chosun.ciis.ss.sls.rdr.wb.SSReader2000WB;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class SSReaderServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ss/reader/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("SSReaderServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("SSReaderServlet : process : nextPage : " + nextPage);
        } catch (AppException ae) {
            req.setAttribute("appException", ae);
            nextPage = "/jsp/ss/comm_jsp/app_error.jsp";
        } catch (SysException se) {
            req.setAttribute("sysException", se);
            nextPage = "/jsp/ss/comm_jsp/sys_error.jsp";
        } catch (Exception e) {
            req.setAttribute("sysException", new SysException(e));
            nextPage = "/jsp/ss/comm_jsp/sys_error.jsp";
        }

        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
        rd.forward(req, res);
    }

    /**
     * PilotWBMapping.java �� ���ǵ� ����� ���� �б��Ͽ� Worker Bean�� �����ϰ�,<br>
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
    public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException {

        String nextPage = null;
        SSReader1000WB wb1000 = null; //��������
        SSReader1100WB wb1100 = null; //���ں���
        SSReader1200WB wb1200 = null; //VacationStop ��û
        SSReader1300WB wb1300 = null; //VacationStop ����
        SSReader1400WB wb1400 = null; //VacationStop ���
        SSReader1500WB wb1500 = null; //VacationStop �ް��� �ǿ� Code List
        SSReader1600WB wb1600 = null; //���ڵ�ް���
        SSReader1700WB wb1700 = null; //����������ȸ
        SSReader1900WB wb1900 = null; //��۵��ڰ���
        SSReader2000WB wb2000 = null; //�������

		/* ����ϰ��� wb ���� �и� 20161207 �弱�� */
        SSReader11000WB wb11000 = null; //��������_�����
        SSReader11100WB wb11100 = null; //��������_�����

        switch (pid) {
            // ���ڰ˻�
            case SSReaderWBMapping.READER_1000: //������Ȳ-��������-���ڰ˻� �ʱ�ȭ��
                //���ڰ˻� �ʱ�ȭ���� WB�� �޼ҵ� ȣ����� JSP�� �б��Ѵ�.
                nextPage = "/jsp/ss/reader/ss_reader_1000_a.jsp";
                break;
            case SSReaderWBMapping.READER_1005: //������Ȳ-��������-���ڰ˻� ���
                wb1000 = new SSReader1000WB();
                wb1000.selectRdrSrchList(req, res);
   				nextPage = "/jsp/ss/reader/ss_reader_1005_l.jsp";
                break;
            // �����̷��� ��������ȭ������ ��ü
            // ���ں���
            case SSReaderWBMapping.READER_1100: //������Ȳ-���ں��� �ʱ�ȭ��
                wb1100 = new SSReader1100WB();
                wb1100.selectInitList(req, res);
                String path = req.getParameter("path");
                nextPage = "/jsp/ss/reader/ss_reader_1100_a.jsp?path="+path;
                break;
            case SSReaderWBMapping.READER_1110: //������Ȳ-���ں��� ��ȸ(����Ʈ)
                wb1100 = new SSReader1100WB();
                wb1100.selectRdrDsctList(req, res);
  				nextPage = "/jsp/ss/reader/ss_reader_1110_l.jsp";
                break;
            case SSReaderWBMapping.READER_1120: //������Ȳ-���ں��� ��
                wb1100 = new SSReader1100WB();
                wb1100.selectRdrDsctDetail(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1120_s.jsp";
                break;
            case SSReaderWBMapping.READER_1130: //������Ȳ-���ں����� �μ�
                System.out.println("####### READER_1130 #######");
                nextPage = "/jsp/ss/reader/ss_reader_1130_p.jsp";
                break;
            case SSReaderWBMapping.READER_1200: //VacationStop-��û-�ʱ�ȭ��
                wb1200 = new SSReader1200WB();
                wb1200.selectInitList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1200_a.jsp";
                break;
            case SSReaderWBMapping.READER_1210: //VacationStop-��û-��ȸ(����Ʈ)
                wb1200 = new SSReader1200WB();
                wb1200.selectVsList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1210_l.jsp";
                break;
            case SSReaderWBMapping.READER_1220: //VacationStop-��û-�󼼺���
                wb1200 = new SSReader1200WB();
                wb1200.selectVsDetail(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1220_s.jsp";
                break;
                // ������Ȳ-VacationStop-����
            case SSReaderWBMapping.READER_1300: //������Ȳ-VacationStop-����-�ʱ�ȭ��

                // VacationStop ���� �ʱ�ȭ���� WB�� ��ġ�� �ʰ� �ٷ� JSP�� �б��Ų��.
                nextPage = "/jsp/ss/reader/ss_reader_1300_a.jsp";
                break;
            case SSReaderWBMapping.READER_1305: //������Ȳ-VacationStop-����-���
                wb1300 = new SSReader1300WB();
                wb1300.selectVsclosList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1305_l.jsp";
                break;
            case SSReaderWBMapping.READER_1310: //������Ȳ-VacationStop-����-��
                wb1300 = new SSReader1300WB();
                wb1300.selectVsclosDetail(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1310_s.jsp";
                break;
            case SSReaderWBMapping.READER_1315: //������Ȳ-VacationStop-����-�űԵ��
                wb1300 = new SSReader1300WB();
                wb1300.insertVsclos(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1315_i.jsp";
                break;
            case SSReaderWBMapping.READER_1320: //������Ȳ-VacationStop-����-����
                wb1300 = new SSReader1300WB();
                wb1300.updateVsclos(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1320_u.jsp";
                break;
            case SSReaderWBMapping.READER_1325: //������Ȳ-VacationStop-����-����
                wb1300 = new SSReader1300WB();
                wb1300.deleteVsclos(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1325_d.jsp";
                break;
            case SSReaderWBMapping.READER_1330: //������Ȳ-VacationStop-����-����
                wb1300 = new SSReader1300WB();
                wb1300.closeVsclos(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1330_a.jsp";
                break;
            case SSReaderWBMapping.READER_1335: //������Ȳ-VacationStop-����-���� ���
                wb1300 = new SSReader1300WB();
                wb1300.closeCancelVsclos(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1335_a.jsp";
                break;

            case SSReaderWBMapping.READER_1400: //������Ȳ-VacationStop-���-�ʱ�ȭ��
                wb1400 = new SSReader1400WB();
                wb1400.selectInitList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1400_a.jsp";
                break;
            case SSReaderWBMapping.READER_1410: //������Ȳ-VacationStop-���-��ȸ
                wb1400 = new SSReader1400WB();
                wb1400.selectVscostList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1410_l.jsp";
                break;
                // VacationStop
            case SSReaderWBMapping.READER_1500: //������Ȳ-VacationStop-�ڵ�-�ʱ�ȭ��
                wb1500 = new SSReader1500WB();
                wb1500.initVsCode(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1500_a.jsp";
                break;
            case SSReaderWBMapping.READER_1510: //������Ȳ-VacationStop-�ڵ�-���
                wb1500 = new SSReader1500WB();
                wb1500.selectVsCodeList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1510_l.jsp";
                break;
            case SSReaderWBMapping.READER_1520: //������Ȳ-VacationStop-�ڵ�-��
                wb1500 = new SSReader1500WB();
                wb1500.selectVsCodeDetail(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1520_s.jsp";
                break;
            case SSReaderWBMapping.READER_1530: //������Ȳ-VacationStop-�ڵ�-���
                wb1500 = new SSReader1500WB();
                wb1500.insertVsCode(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1530_i.jsp";
                break;
            case SSReaderWBMapping.READER_1540: //������Ȳ-VacationStop-�ڵ�-����
                wb1500 = new SSReader1500WB();
                wb1500.updateVsCode(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1540_u.jsp";
                break;
            case SSReaderWBMapping.READER_1550: //������Ȳ-VacationStop-�ڵ�-����
                wb1500 = new SSReader1500WB();
                wb1500.deleteVsCode(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1550_d.jsp";
                break;
            // ���ڵ�ް���
/* 20050505 ��뼷 ���� (������� ����)
            case SSReaderWBMapping.READER_1600:	//������Ȳ-���ڵ�ް���-�ʱ�ȭ��
                wb1600 = new SSReader1600WB();
                wb1600.selectGradAplcList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1600_a.jsp";
                break;
            case SSReaderWBMapping.READER_1605:	//������Ȳ-���ڵ�ް���-��ȸ
                wb1600 = new SSReader1600WB();
                wb1600.selectGradAplcList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1605_l.jsp";
                break;
            case SSReaderWBMapping.READER_1610:	//������Ȳ-���ڵ�ް���-����
                wb1600 = new SSReader1600WB();
                wb1600.updateGradAplcGrnt(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1610_u.jsp";
                break;
            case SSReaderWBMapping.READER_1615:	//������Ȳ-���ڵ�ް���-�񱳴��˻� �ʱ�
                wb1600 = new SSReader1600WB();
                wb1600.selectAplcCmprList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1615_l.jsp";
                break;
            case SSReaderWBMapping.READER_1620:	//������Ȳ-���ڵ�ް���-�񱳴�� �˻�
                wb1600 = new SSReader1600WB();
                wb1600.selectAplcCmprList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1620_l.jsp";
                break;
*/
            case SSReaderWBMapping.READER_1600:	//������Ȳ-���ڵ�ް���-�ʱ�ȭ��
                wb1600 = new SSReader1600WB();
                wb1600.initRdrCrts(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1600_a.jsp";
                break;
            case SSReaderWBMapping.READER_1605:	//������Ȳ-���ڵ�ް���-��ȸ
                wb1600 = new SSReader1600WB();
                wb1600.selectRdrCrtsList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1605_l.jsp";
                break;


            case SSReaderWBMapping.READER_1700: //
                wb1700 = new SSReader1700WB();
                wb1700.selectInitList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1700_a.jsp";
                break;

            case SSReaderWBMapping.READER_1701: //
                nextPage = "/jsp/ss/reader/ss_reader_1701_a.jsp";
                break;

            case SSReaderWBMapping.READER_1710: //������Ȳ-���ڰ���-�ʱ�ȭ��
            	wb1700 = new SSReader1700WB();
                wb1700.initList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1710_a.jsp";
                break;

            case SSReaderWBMapping.READER_1715: //
                wb1700 = new SSReader1700WB();
                wb1700.selectList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1715_l.jsp";
                break;

            case SSReaderWBMapping.READER_1717: //
                wb1700 = new SSReader1700WB();
                wb1700.selectList_mo(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1717_l.jsp";
                break;

            case SSReaderWBMapping.READER_1720: //
                wb1700 = new SSReader1700WB();
                wb1700.detailList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1720_l.jsp";
                break;

            case SSReaderWBMapping.READER_1725: //
                wb1700 = new SSReader1700WB();
                wb1700.insertList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1725_i.jsp";
                break;

            case SSReaderWBMapping.READER_1730: //
                wb1700 = new SSReader1700WB();
                wb1700.updateList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1730_u.jsp";
                break;

            case SSReaderWBMapping.READER_1735: //
                wb1700 = new SSReader1700WB();
                wb1700.deleteList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1735_d.jsp";
                break;

            case SSReaderWBMapping.READER_1800: //
            	wb1100 = new SSReader1100WB();
                wb1100.initCampTm(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1800_a.jsp";
                break;

            case SSReaderWBMapping.READER_1810: //
                wb1100 = new SSReader1100WB();
                wb1100.selectCampTmList(req, res);
  				nextPage = "/jsp/ss/reader/ss_reader_1810_l.jsp";
                break;

            case SSReaderWBMapping.READER_1820:         // ����-�������(LIST)
            	wb1100 = new SSReader1100WB();
            	wb1100.selectTmAgentList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1820_l.jsp";
                break;

            case SSReaderWBMapping.READER_1830:         // ����-�������(LIST)
            	wb1100 = new SSReader1100WB();
            	wb1100.selectTmCampList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1830_l.jsp";
                break;

            case SSReaderWBMapping.READER_1900: //��۵��ڰ��� �ʱ�
            	wb1900 = new SSReader1900WB();
            	wb1900.initList(req, res);
            	nextPage = "/jsp/ss/reader/ss_reader_1900_a.jsp";
            	break;

            case SSReaderWBMapping.READER_1905: //��۵��ڰ���  ����Ʈ
            	wb1900 = new SSReader1900WB();
            	wb1900.selectList(req, res);
            	nextPage = "/jsp/ss/reader/ss_reader_1905_l.jsp";
            	break;

            case SSReaderWBMapping.READER_1910: //��۵��ڰ��� ��
            	wb1900 = new SSReader1900WB();
            	wb1900.detailList(req, res);
            	nextPage = "/jsp/ss/reader/ss_reader_1910_s.jsp";
            	break;

            case SSReaderWBMapping.READER_1915: //��۵��ڰ��� ����
            	wb1900 = new SSReader1900WB();
            	wb1900.insertList(req, res);
            	nextPage = "/jsp/ss/reader/ss_reader_1915_i.jsp";
            	break;

            case SSReaderWBMapping.READER_2000: //������� �ʱ�
            	wb2000 = new SSReader2000WB();
            	wb2000.initDsctstat(req, res);
            	nextPage = "/jsp/ss/reader/ss_reader_2000_a.jsp";
            	break;

            case SSReaderWBMapping.READER_2010: //������� �ʱ�
            	wb2000 = new SSReader2000WB();
            	wb2000.selectDsctstat(req, res);
            	nextPage = "/jsp/ss/reader/ss_reader_2010_l.jsp";
            	break;

/*******************************************����Ͽ�******************************************************************/
            case SSReaderWBMapping.READER_11005: //���ڰ���-���������˻�
                wb11000 = new SSReader11000WB();
                wb11000.mo_selectRdrSrchList(req, res);
   				nextPage = "/jsp/ss/reader/mo_ss_reader_11005_l.jsp";		//����Ͽ� test 20160711 �弱��
                break;

            //������Ȳ
            case SSReaderWBMapping.READER_11100: //������Ȳ-���ں��� �ʱ�ȭ��
                wb11100 = new SSReader11100WB();
                wb11100.mo_selectInitList(req, res);
                nextPage = "/jsp/ss/reader/mo_ss_reader_11100_a.jsp";
                break;
            case SSReaderWBMapping.READER_11110: //������Ȳ-���ں��� ��ȸ(����Ʈ)
                wb11100 = new SSReader11100WB();
                wb11100.mo_selectRdrDsctList(req, res);
  				nextPage = "/jsp/ss/reader/mo_ss_reader_11110_l.jsp";
                break;
            case SSReaderWBMapping.READER_11120: //������Ȳ-���ں��� ��
                wb11100 = new SSReader11100WB();
                wb11100.mo_selectRdrDsctDetail(req, res);
                nextPage = "/jsp/ss/reader/mo_ss_reader_11120_s.jsp";
                break;

            default:
                throw new SysException(new Exception("��û�� �������� ã�� �� �����ϴ�."));
        }
        return nextPage;
    }
}
