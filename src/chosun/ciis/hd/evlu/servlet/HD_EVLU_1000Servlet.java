/***************************************************************************************************
 * 파일명	: HD_EVLU_1000Servlet.java
 * 기능		: 인사시스템 평가관리 분기
 * 작성일자	:
 * 작성자	:
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역	:
 * 수정자	:
 * 수정일자	:
 * 백업		:
 ***************************************************************************************************/

package chosun.ciis.hd.evlu.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.co.base.servlet.BaseServlet;
import chosun.ciis.hd.evlu.wb.*;

public class HD_EVLU_1000Servlet extends BaseServlet {

    /**
     * 상속하는 ControllerServlet 의 doGet, doPost 메소드에서 호출된다.<br>
     * 요청된 URL을 파싱하여 pid를 얻어 excuteWorker()를 호출하며,<br>
     * 리턴된 nextPage로 request를 forward한다.
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
            String servletMappedUrl = "/servlet/hd/evlu/";
            iPid = extractPid(req, servletMappedUrl);
            System.out.println("HD_EVLU_1000Servlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HD_EVLU_1000Servlet : process : nextPage : " + nextPage);
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
     * PilotWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
     * 메소드를 호출한다.
     * 결과에 따라 nextPage를 반환한다.
     *
     * @param req request
     * @param res response
     * @param pid process id
     * @return forward할 nextPage
     * @throws SysException
     * @throws AppException
     */

    public String executeWorker(HttpServletRequest req, HttpServletResponse res,
                                int pid) throws AppException, IOException {
        String nextPage = null;
        HD_EVLU_1000WB wb = null;
        
        switch (pid) {

		case HD_EVLU_1000WBMapping.HD_EVLU_9999:
			wb = new HD_EVLU_1000WB();
			wb.hd_evlu_9999_s(req, res);
			nextPage = "/jsp/hd/evlu/hd_evlu_9999_s.jsp";
			break;
    	case HD_EVLU_1000WBMapping.HD_EVLU_1000:
    		wb = new HD_EVLU_1000WB();
    		wb.initTahds_Evlubasi(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1000_m.jsp";
    		break;
    	
    	case HD_EVLU_1000WBMapping.HD_EVLU_1001:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahds_Evlubasi(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1001_l.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1002:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahds_Evlubasi(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1003:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahds_Evlusche(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1003_l.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1004:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahds_Evlusche(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1100:
    		wb = new HD_EVLU_1000WB();
    		wb.initTahds_Evlubasiitem(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1100_m.jsp";
    		break;

    	case HD_EVLU_1000WBMapping.HD_EVLU_1101:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahds_Evlubasiitem(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1101_l.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1102:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahds_Evlubasiitem(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1103:
    		wb = new HD_EVLU_1000WB();
    		wb.copyTahds_Evlubasiitem(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1200:
    		wb = new HD_EVLU_1000WB();
    		wb.initTahds_Evlugrp(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1200_m.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1201:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahds_Evlugrp(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1201_l.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1202:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahds_Evlugrp(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;

    	case HD_EVLU_1000WBMapping.HD_EVLU_1300:
    		wb = new HD_EVLU_1000WB();
    		wb.initTahds_Evlupart(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1300_m.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1301:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahds_Evlupart(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1301_l.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1302:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahds_Evlupart(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1400:
    		wb = new HD_EVLU_1000WB();
    		wb.initTahds_Evlugrprflratio(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1400_m.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1401:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahds_Evlugrprflratio(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1401_l.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1402:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahds_Evlugrprflratio(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1500:
    		wb = new HD_EVLU_1000WB();
    		wb.initTahds_Evluindx(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1500_m.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1501:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahds_Evlupart2(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1501_l.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1502:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahds_Evluindx(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1502_l.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1503:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahds_Evluindx(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1504:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahds_Actindx(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1504_l.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1505:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahds_Actindx(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1600:
    		wb = new HD_EVLU_1000WB();
    		wb.initTahds_Evlugrpdeptmbrmap(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1600_m.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1601:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahds_Evlugrpcombo(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1601_l.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1602:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahds_Evlutotalgrp(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1602_l.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1603:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahds_Evlugrpdeptmbrmapnon(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1603_l.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1604:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahds_Evlugrpdeptmbrmap(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1604_l.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1605:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahds_Evlugrpdeptmbrmap(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1700:
    		wb = new HD_EVLU_1000WB();
    		wb.initTahds_Evlugraddivnrate(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1700_m.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1701:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahds_Evlugraddivnrate(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1701_l.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1702:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahds_Evlugraddivnrate(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1800:
    		wb = new HD_EVLU_1000WB();
    		wb.initTahds_Evlugrpactindxmap(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1800_m.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1801:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahds_EvlugrpactindxmapCombo(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1801_l.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1802:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahds_EvlugrpactindxmapEvlugrp(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1802_l.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1803:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahds_EvlugrpactindxmapActindx(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1803_l.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1804:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahds_Evlugrpactindxmap(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1804_l.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1805:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahds_Evlugrpactindxmap(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_1900:
    		wb = new HD_EVLU_1000WB();
    		wb.initTahds_Evluitemgradsetup(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1900_m.jsp";
    		break;

    	case HD_EVLU_1000WBMapping.HD_EVLU_1901:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahds_Evluitemgradsetup(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_1901_l.jsp";
    		break;

    	case HD_EVLU_1000WBMapping.HD_EVLU_1902:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahds_Evluitemgradsetup(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_2000:
    		wb = new HD_EVLU_1000WB();
    		wb.initTahds_Spcaddsbtbasireg(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_2000_m.jsp";
    		break;

    	case HD_EVLU_1000WBMapping.HD_EVLU_2001:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahds_Spcaddsbtbasireg(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_2001_l.jsp";
    		break;

    	case HD_EVLU_1000WBMapping.HD_EVLU_2002:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahds_Spcaddsbtbasireg(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;

    	case HD_EVLU_1000WBMapping.HD_EVLU_2101:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahds_Evlugraddivnnops(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_2101_l.jsp";
    		break;

    	case HD_EVLU_1000WBMapping.HD_EVLU_2102:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahds_Evlugraddivnnops(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_2200:
    		wb = new HD_EVLU_1000WB();
    		wb.initTahds_Evluexclchce(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_2200_m.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_2201:
    		wb = new HD_EVLU_1000WB();
    		wb.getTahds_Evluexcldd(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_2201_s.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_2202:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahds_Evluexclchceappmt(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_2202_l.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_2203:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahds_Evluexclchcevaca(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_2203_l.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_2204:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahds_Evluexclchceappmt(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_2205:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahds_Evluexclchcevaca(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_2301:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahdm_Evluexcl(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_2301_l.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_2302:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahdm_Evluexcl(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_2303:
    		wb = new HD_EVLU_1000WB();
    		wb.batchTahdm_Evlupersnexcl(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_2400:
    		wb = new HD_EVLU_1000WB();
    		wb.initTahdm_Evluobj(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_2400_m.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_2401:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahdm_Evluobj(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_2401_l.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_2402:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahdm_Evluobj(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_2403:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahdm_Evluobjmapping(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_2404:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahdm_Evluobjscorupload(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_2405:
    		wb = new HD_EVLU_1000WB();
    		wb.updateTahdm_Evluobjspcpnt(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
    	case 2451:
            wb = new HD_EVLU_1000WB();
            wb.hd_evlu_2451_l(req, res);
            nextPage = "/jsp/hd/evlu/hd_evlu_2451_l.jsp";
            break;
          case 2452:
            wb = new HD_EVLU_1000WB();
            wb.hd_evlu_2452_l(req, res);
            nextPage = "/jsp/hd/evlu/hd_evlu_2452_l.jsp";
            break;
          case 2453:
            wb = new HD_EVLU_1000WB();
            wb.hd_evlu_2453_a(req, res);
            nextPage = "/common/jsp/resultMsg.jsp";
            break;
    	case HD_EVLU_1000WBMapping.HD_EVLU_2500:
    		wb = new HD_EVLU_1000WB();
    		wb.initTahdm_PgmregEvlupers(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_2500_m.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_2501:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahdm_PgmregEvlupers(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_2501_l.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_2502:
    		wb = new HD_EVLU_1000WB();
    		wb.insertTahdm_Prsnannc(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_2502_i.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_2600:
    		wb = new HD_EVLU_1000WB();
    		wb.initTahds_Tgtevlupersevlu(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_2600_s.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_2601:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahdd_Evluindxachvdesc(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_result_msg.jsp";
    		//nextPage = "/common/jsp/resultMsg.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_2602:
    		wb = new HD_EVLU_1000WB();
    		wb.updateTahds_Selfevluprocstat(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_result_msg.jsp"; // "/jsp/hd/evlu/hd_evlu_2602_u.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_2700:
    		wb = new HD_EVLU_1000WB();
    		wb.initTahds_Prevevluindxachvdesc(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_2700_s.jsp";
    		break;
    		
    	//EP포탈 : 개인별 특별가감내역 보기(POPUP)
    	case HD_EVLU_1000WBMapping.HD_EVLU_2801:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahds_SpcaddsbtbasiregPop(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_2801_l.jsp";
    		break;
    		
    	//EP포탈 : 보조평가자 평가하기 초기화면
    	case HD_EVLU_1000WBMapping.HD_EVLU_2900:
    		wb = new HD_EVLU_1000WB();
    		wb.initTahdm_Asstevlupersevlu(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_2900_m.jsp";
    		break;
    	//EP포탈 : 보조평가자 평가하기 목록조회
    	case HD_EVLU_1000WBMapping.HD_EVLU_2901:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahdm_Asstevlupersevlu(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_2901_l.jsp";
    		break;
    	//EP포탈 : 보조평가자 평가하기 임시저장
    	case HD_EVLU_1000WBMapping.HD_EVLU_2902:
    		wb = new HD_EVLU_1000WB();
    		wb.updateTahdm_Asstevlupersevlu(req, res);
			nextPage = "/jsp/hd/evlu/hd_evlu_result_msg.jsp";
    		break;
    	//EP포탈,인사부 : 보조평가자 등록, 삭제
    	case HD_EVLU_1000WBMapping.HD_EVLU_2903:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahdm_Asstevlupersevlu(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
        //EP포탈 : 보조평가자 평가하기 제출
    	case HD_EVLU_1000WBMapping.HD_EVLU_2904:
    		wb = new HD_EVLU_1000WB();
    		wb.updateTahdm_AsstevlupersevluDone(req, res);
			nextPage = "/jsp/hd/evlu/hd_evlu_result_msg.jsp";
    		break;
        //EP포탈 : 보조평가자 평가하기 자기평가조회
    	case HD_EVLU_1000WBMapping.HD_EVLU_2905:
    		wb = new HD_EVLU_1000WB();
    		wb.HD_EVLU_2905_L(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_2905_l.jsp";
    		break;
    	//EP포탈 : 보조평가자 피평가자 자기평가보기(2600과동일)
    	case HD_EVLU_1000WBMapping.HD_EVLU_3000:
    		wb = new HD_EVLU_1000WB();
    		wb.initTahds_TgtevlupersevluPop(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3000_s.jsp";
    		break;
        //EP포탈 : 1차평가자 평가화면 초기화면
    	case HD_EVLU_1000WBMapping.HD_EVLU_3100:
    		wb = new HD_EVLU_1000WB();
    		wb.initTahdm_Evlupersgrpper1tms(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3100_m.jsp";
    		break;
    	//EP포탈 : 1차평가자 평가화면 피평가자 그룹목록 조회
    	case HD_EVLU_1000WBMapping.HD_EVLU_3101:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahdm_Evlupersgrpper1tms(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3101_l.jsp";
    		break;
    	//EP포탈 : 1차평가자평가화면 그룹별 피평가자 목록 조회	
    	case HD_EVLU_1000WBMapping.HD_EVLU_3102:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahdm_Evluobjgrpper1tms(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3102_l.jsp";
    		break;
        	//EP포탈 : 1차평가자평가화면 그룹별 피평가자 목록 조회	
    	case HD_EVLU_1000WBMapping.HD_EVLU_3102_500:
    		wb = new HD_EVLU_1000WB();
    		wb.hd_evlu_3102_500_l(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3102_500_l.jsp";
    		break;
    	//EP포탈 : 1차평가자 평가화면 피평가자 자기평가보기(3000과동일)
    	case HD_EVLU_1000WBMapping.HD_EVLU_3103:
    		wb = new HD_EVLU_1000WB();
    		wb.getTahds_Tgtevlupersevluper1tms(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3103_s.jsp";
    		break;
    	//EP포탈 : 1차평가자 평가화면 피평가자 자기평가보기(3000과동일)(TV조선용) 
    	case HD_EVLU_1000WBMapping.HD_EVLU_3103_500:
    		wb = new HD_EVLU_1000WB();
    		wb.hd_evlu_3103_500_s(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3103_500_s.jsp";
    		break;
    	//EP포탈 : 1차평가자 평가화면 임시저장
    	case HD_EVLU_1000WBMapping.HD_EVLU_3104:
    		wb = new HD_EVLU_1000WB();
    		wb.updateTahds_Evluobjevlugradper1tms(req, res);
			nextPage = "/jsp/hd/evlu/hd_evlu_3104_u.jsp" ;
					//resultMsg.jsp";
    		break;
        	//EP포탈 : 1차평가자 평가화면 임시저장
    	case HD_EVLU_1000WBMapping.HD_EVLU_3104_500:
    		wb = new HD_EVLU_1000WB();
    		wb.hd_evlu_3104_500_u(req, res);
			nextPage = "/jsp/hd/evlu/hd_evlu_3104_500_u.jsp" ;
					//resultMsg.jsp";
    		break;
        //EP포탈 : 1차평가자 평가화면 반려
    	case HD_EVLU_1000WBMapping.HD_EVLU_3105:
    		wb = new HD_EVLU_1000WB();
    		wb.updateTahds_Evluobjgivingback1tms(req, res);
			nextPage = "/jsp/hd/evlu/hd_evlu_result_msg.jsp";
    		break;
        //EP포탈 : 1차평가자 평가화면 제출(평가완료)
    	case HD_EVLU_1000WBMapping.HD_EVLU_3106:
    		wb = new HD_EVLU_1000WB();
    		wb.updateTahds_Evluobjdoneevlu1tms(req, res);
			nextPage = "/jsp/hd/evlu/hd_evlu_result_msg.jsp";
    		break;
        //EP포탈 : 1차평가자 평가화면 잠정등급집계
    	case HD_EVLU_1000WBMapping.HD_EVLU_3107:
    		wb = new HD_EVLU_1000WB();
    		wb.updateTahds_Evluobjcaltmpgrad1tms(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
        //EP포탈 : 1차평가자 평가화면 그룹평가완료
    	case HD_EVLU_1000WBMapping.HD_EVLU_3108:
    		wb = new HD_EVLU_1000WB();
    		wb.updateTahds_Evluobjdoneevlugrp1tms(req, res);
			nextPage = "/jsp/hd/evlu/hd_evlu_result_msg.jsp";
    		break;
    	//EP포탈 : 1차평가자 평가화면 > 조정건의등급 팝업 > 조정건의조회
    	case HD_EVLU_1000WBMapping.HD_EVLU_3201:
    		wb = new HD_EVLU_1000WB();
    		wb.getTahds_Evluobjmedainfoper1tms(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3201_s.jsp";
    		break;
        //EP포탈 : 1차평가자 평가화면 > 조정건의등급 팝업 > 조정건의등록
    	case HD_EVLU_1000WBMapping.HD_EVLU_3202:
    		wb = new HD_EVLU_1000WB();
    		wb.updateTahds_Evluobjmedainfoper1tms(req, res);
			nextPage = "/jsp/hd/evlu/hd_evlu_result_msg.jsp";
    		break;
        //EP포탈 : 2차평가자 평가화면 초기화면
    	case HD_EVLU_1000WBMapping.HD_EVLU_3300:
    		wb = new HD_EVLU_1000WB();
    		wb.initTahdm_Evlupersgrpper2tms(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3300_m.jsp";
    		break;
        //EP포탈 : 2차평가자 평가화면 피평가자 그룹목록 조회
    	case HD_EVLU_1000WBMapping.HD_EVLU_3301:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahdm_Evlupersgrpper2tms(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3301_l.jsp";
    		break;
        //EP포탈 : 2차평가자 평가화면 피평가자 그룹목록 조회
    	case HD_EVLU_1000WBMapping.HD_EVLU_3301_100:
    		wb = new HD_EVLU_1000WB();
    		wb.HD_EVLU_3301_100_L(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3301_100_l.jsp";
    		break;
    	case HD_EVLU_1000WBMapping.HD_EVLU_3301_500:
    		wb = new HD_EVLU_1000WB();
    		wb.hd_evlu_3301_500_l(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3301_500_l.jsp";
    		break;    		
       	//EP포탈 : 2차평가자평가화면 그룹별 피평가자 목록 조회	
    	case HD_EVLU_1000WBMapping.HD_EVLU_3302:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahdm_Evluobjgrpper2tms(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3302_l.jsp";
    		break;
    	case HD_EVLU_1000WBMapping.HD_EVLU_3302_500:
    		wb = new HD_EVLU_1000WB();
    		wb.hd_evlu_3302_500_l(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3302_500_l.jsp";
    		break;
    	//EP포탈 : 2차평가자 평가화면 피평가자 자기평가보기(3000과동일)
    	case HD_EVLU_1000WBMapping.HD_EVLU_3303:
    		wb = new HD_EVLU_1000WB();
    		wb.getTahds_Tgtevlupersevluper2tms(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3303_s.jsp";
    		break;
    	case HD_EVLU_1000WBMapping.HD_EVLU_3303_500:
    		wb = new HD_EVLU_1000WB();
    		wb.hd_evlu_3303_500_s(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3303_500_s.jsp";
    		break;    		
    	//EP포탈 : 2차평가자 평가화면 그룹별 평가완료
    	case HD_EVLU_1000WBMapping.HD_EVLU_3304:
    		wb = new HD_EVLU_1000WB();
    		wb.updateTahds_Evluobjdoneevlu2tms(req, res);
			nextPage = "/jsp/hd/evlu/hd_evlu_result_msg.jsp";
    		break;
//    		EP포탈 : 2차평가자 평가화면 피평가자 그룹 인원 평가등급 수 
    	case HD_EVLU_1000WBMapping.HD_EVLU_3305:
    		wb = new HD_EVLU_1000WB();
    		wb.hd_evlu_3305_l(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3305_l.jsp";
    		break;
        //EP포탈 : 2차평가자 평가화면 > 조정의견 팝업 > 조정의견조회
    	case HD_EVLU_1000WBMapping.HD_EVLU_3401:
    		wb = new HD_EVLU_1000WB();
    		wb.getTahds_Evluobjmedainfoper2tms(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3401_s.jsp";
    		break;
        //EP포탈 : 2차평가자 평가화면 > 조정의견 팝업 > 조정의견등록
    	case HD_EVLU_1000WBMapping.HD_EVLU_3402:
    		wb = new HD_EVLU_1000WB();
    		wb.updateTahds_Evluobjmedainfoper2tms(req, res);
			nextPage = "/jsp/hd/evlu/hd_evlu_result_msg.jsp";
    		break;
        //평가진행상태 관리 초기화면
    	case HD_EVLU_1000WBMapping.HD_EVLU_3500:
    		wb = new HD_EVLU_1000WB();
    		wb.initTahdm_Evluobjmanagestat(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3500_m.jsp";
    		break;
        //평가진행상태 관리 조회
    	case HD_EVLU_1000WBMapping.HD_EVLU_3501:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahdm_Evluobjmanagestat(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3501_l.jsp";
    		break;
        //평가진행상태 관리 등록,수정,삭제
    	case HD_EVLU_1000WBMapping.HD_EVLU_3502:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahdm_Evluobjmanagestat(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
        //평가진행상태 관리 일괄수정
    	case HD_EVLU_1000WBMapping.HD_EVLU_3503:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahdm_Evluobjbatchstat(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
    	//평가진행상태 관리  : 평가 결과 ERP 데이터 EIS 로 이관 상태
    	case HD_EVLU_1000WBMapping.HD_EVLU_3504:
    		wb = new HD_EVLU_1000WB();
    		wb.hd_evlu_3504_l(req, res);
			nextPage = "/jsp/hd/evlu/hd_evlu_3504_l.jsp";
    		break;
        //평가진행상태 관리  : 평가 결과 ERP 데이터 EIS 로 이관 작업
    	case HD_EVLU_1000WBMapping.HD_EVLU_3505:
    		wb = new HD_EVLU_1000WB();
    		wb.hd_evlu_3505_a(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;
        //평가진행상태 조회 초기화면
    	case HD_EVLU_1000WBMapping.HD_EVLU_3600:
    		wb = new HD_EVLU_1000WB();
    		wb.initTahdm_Evluobjreportstat(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3600_m.jsp";
    		break;
        	//평가진행상태 조회 목록조회
    	case HD_EVLU_1000WBMapping.HD_EVLU_3601:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahdm_Evluobjreportstat(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3601_l.jsp";
    		break;
    	//평가결과조회(인사팀) 초기화면
    	case HD_EVLU_1000WBMapping.HD_EVLU_3700:
    		wb = new HD_EVLU_1000WB();
    		wb.initTahdm_Evluobjsearchresult(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3700_m.jsp";
    		break;
    	//평가결과조회(인사팀) 피평가자 목록조회
    	case HD_EVLU_1000WBMapping.HD_EVLU_3701:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahdm_Evluobjsearchresult(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3701_l.jsp";
    		break;
    	//평가결과조회(인사팀) 피평가자 상세조회
    	case HD_EVLU_1000WBMapping.HD_EVLU_3702:
    		wb = new HD_EVLU_1000WB();
    		wb.getTahdm_Evluobjsearchresult(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3702_s.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_3801:
    		wb = new HD_EVLU_1000WB();
    		wb.getListTahds_2tmsevlugrp(req, res);
    		nextPage = "/jsp/hd/evlu/hd_evlu_3801_l.jsp";
    		break;
    		
    	case HD_EVLU_1000WBMapping.HD_EVLU_3802:
    		wb = new HD_EVLU_1000WB();
    		wb.accessTahds_2tmsevlugrp(req, res);
			nextPage = "/common/jsp/resultMsg.jsp";
    		break;

    	case HD_EVLU_1000WBMapping.HD_EVLU_3901:
    		wb = new HD_EVLU_1000WB();
    		wb.hd_evlu_3901_l(req, res);
    		
			nextPage = "/jsp/hd/evlu/hd_evlu_3901_l.jsp";
    		break;

    	case HD_EVLU_1000WBMapping.HD_EVLU_3902:
    		wb = new HD_EVLU_1000WB();
    		wb.hd_evlu_3902_l(req, res);
    		
			nextPage = "/jsp/hd/evlu/hd_evlu_3902_l.jsp";
    		break;
    		
//    		************************* 근무평가********************************************************//        	
    	case HD_EVLU_1000WBMapping.HD_EVLU_4000_M:
			wb = new HD_EVLU_1000WB();
			
			wb.hd_evlu_4000_m(req, res);
			nextPage = "/jsp/hd/evlu/hd_evlu_4000_m.jsp";
			break;

//************************* 파 견 직********************************************************//        	
        	case HD_EVLU_1000WBMapping.HD_EVLU_5000_M:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5000_m(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5000_m.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5001_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5001_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5001_l.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5002_A:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5002_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5003_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5003_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5003_l.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5004_A:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5004_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5100_M:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5100_m(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5100_m.jsp";
				break;	
        	case HD_EVLU_1000WBMapping.HD_EVLU_5101_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5101_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5101_l.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5102_A:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5102_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5103_A:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5103_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5200_M:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5200_m(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5200_m.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5201_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5201_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5201_l.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5202_A:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5202_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5300_M:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5300_m(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5300_m.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5301_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5301_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5301_l.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5302_U:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5302_u(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5400_M:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5400_m(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5400_m.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5401_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5401_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5401_l.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5402_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5402_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5402_l.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5403_A:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5403_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5404_A:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5404_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5501_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5501_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5501_l.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5502_A:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5502_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5600_M:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5600_m(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5600_m.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5601_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5601_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5601_l.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5602_A:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5602_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5700_M:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5700_m(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5700_m.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5701_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5701_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5701_l.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5702_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5702_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5702_l.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5703_A:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5703_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5704_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5704_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5704_l.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5705_A:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5705_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5706_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5706_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5706_l.jsp";
				break;
				
				
        	case HD_EVLU_1000WBMapping.HD_EVLU_5900_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5900_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5900_l.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5901_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5901_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5901_l.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5902_M:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5902_m(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5902_m.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5903_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5903_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5903_l.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5904_A:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5904_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5905_A:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5905_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_6200_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_6200_l(req, res); 
				nextPage = "/jsp/hd/evlu/hd_evlu_6200_l.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_6201_A:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_6201_a(req, res); 
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_6202_A:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_6202_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_6203_A:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_6203_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_6204_A:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_6204_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_6300_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_6300_l(req, res); 
				nextPage = "/jsp/hd/evlu/hd_evlu_5903_l.jsp";
				break;
				
				
			//2009-06-08 : 문종호 작업
        	case HD_EVLU_1000WBMapping.HD_EVLU_5800_M:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5800_m(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5800_m.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5801_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5801_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5801_l.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_5802_I:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_5802_i(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_5802_i.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_6000_M:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_6000_m(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_6000_m.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_6001_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_6001_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_6001_l.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_6002_A:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_6002_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_6003_A:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_6003_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_6101_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_6101_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_6101_l.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_6401_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_6401_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_6401_l.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_6410_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_6410_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_6410_l.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_6420_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_6420_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_6420_l.jsp";
				break;
			//2009-06-08 : 문종호 작업
        	
        	case HD_EVLU_1000WBMapping.HD_EVLU_8000_L:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_8000_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_8000_l.jsp";
				break;
        	case HD_EVLU_1000WBMapping.HD_EVLU_8001_M:
				wb = new HD_EVLU_1000WB();
				wb.hd_evlu_8001_m(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_8001_m.jsp";
				break;
       		
        		
//***************************파 견 직 끝**************************************************************//        		
        		
        		
        		
        		
	    	case HD_EVLU_1000WBMapping.HD_EVLU_9000:
	    		wb = new HD_EVLU_1000WB();
	    		wb.getListTahds_EvlucdCombo(req, res);
	    		nextPage = "/jsp/hd/evlu/hd_evlu_9000_l.jsp";
	    		break;
	    		
	    	case HD_EVLU_1000WBMapping.HD_EVLU_9001:
	    		wb = new HD_EVLU_1000WB();
	    		wb.getListTahds_EvlugrpcdCombo(req, res);
	    		nextPage = "/jsp/hd/evlu/hd_evlu_9001_l.jsp";
	    		break;
	    		
	    	case HD_EVLU_1000WBMapping.HD_EVLU_9002:
	    		wb = new HD_EVLU_1000WB();
	    		wb.getListTahds_EvlugrpcdPopup(req, res);
	    		nextPage = "/jsp/hd/evlu/hd_evlu_9002_l.jsp";
	    		break;
	    		
	    	case HD_EVLU_1000WBMapping.HD_EVLU_9003:
	    		wb = new HD_EVLU_1000WB();
	    		wb.getListTahds_AsstevlupersevluPopup(req, res);
	    		nextPage = "/jsp/hd/evlu/hd_evlu_9003_l.jsp";
	    		break;
	    		
	    	case HD_EVLU_1000WBMapping.HD_EVLU_9004:
	    		wb = new HD_EVLU_1000WB();
	    		wb.accessTahds_Evluobjevlustat(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
	    	
	    	case HD_EVLU_1000WBMapping.HD_EVLU_4001:
				wb = new HD_EVLU_1000WB();
				((HD_EVLU_1000WB)wb).hd_evlu_4001_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_4001_l.jsp";
				break;
				
	    	case HD_EVLU_1000WBMapping.HD_EVLU_3751:
				wb = new HD_EVLU_1000WB();
				((HD_EVLU_1000WB)wb).hd_evlu_3751_l(req, res);
				nextPage = "/jsp/hd/evlu/hd_evlu_3751_l.jsp";
				break;
				
	    	case HD_EVLU_1000WBMapping.HD_EVLU_6500_M:
	    		wb = new HD_EVLU_1000WB();
	    		((HD_EVLU_1000WB)wb).hd_evlu_6500_m(req, res);
	    		nextPage = "/jsp/hd/evlu/hd_evlu_6500_m.jsp";
	    		break;
	    		
	    	case HD_EVLU_1000WBMapping.HD_EVLU_6501_L:
	    		wb = new HD_EVLU_1000WB();
	    		((HD_EVLU_1000WB)wb).hd_evlu_6501_l(req, res);
	    		nextPage = "/jsp/hd/evlu/hd_evlu_6501_l.jsp";
	    		break;
	    		
    		//조선일보_평가업로드_국실별가점_업로드_20160712
	    	case HD_EVLU_1000WBMapping.HD_EVLU_2454:
	    		wb = new HD_EVLU_1000WB();
	    		wb.hd_evlu_2454_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
	    		
	    	//조선일보_평가업로드_국실별가점_조회_20160712
	    	case HD_EVLU_1000WBMapping.HD_EVLU_2455:
	    		wb = new HD_EVLU_1000WB();
	            wb.hd_evlu_2455_l(req, res);
	            nextPage = "/jsp/hd/evlu/hd_evlu_2455_l.jsp";
	    		break;
	    		
	    	//조선일보_평가업로드_평가자_업로드_20171109
	    	case HD_EVLU_1000WBMapping.HD_EVLU_2456:
	    		wb = new HD_EVLU_1000WB();
	    		wb.hd_evlu_2456_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
	    		break;
	    		
	    	//조선일보_평가업로드_평가자_조회_20171109
	    	case HD_EVLU_1000WBMapping.HD_EVLU_2457:
	    		wb = new HD_EVLU_1000WB();
	            wb.hd_evlu_2457_l(req, res);
	            nextPage = "/jsp/hd/evlu/hd_evlu_2457_l.jsp";
	    		break;
	    	
	    	//조선일보_본인업적기술(자기평가) 초기화면
	    	case HD_EVLU_1000WBMapping.HD_EVLU_2600_100:
	    		wb = new HD_EVLU_1000WB();
	    		wb.hd_evlu_2600_s_100(req, res);
	    		nextPage = "/jsp/hd/evlu/hd_evlu_2600_s_100.jsp";
	    		break;
	    		
	    	//조선일보_국실별가점팝업화면_조회_20160720
	    	case HD_EVLU_1000WBMapping.HD_EVLU_2850:
	    		wb = new HD_EVLU_1000WB();
	            wb.hd_evlu_2850_l(req, res);
	            nextPage = "/jsp/hd/evlu/hd_evlu_2850_l.jsp";
	    		break;
	    		
	    	//조선일보_1차평가_피평가자기본정보조회_20160726
	    	case HD_EVLU_1000WBMapping.HD_EVLU_3103_100:
	    		wb = new HD_EVLU_1000WB();
	    		wb.hd_evlu_3103_s_100(req, res);
	    		nextPage = "/jsp/hd/evlu/hd_evlu_3103_s_100.jsp";
	    		break;
	    	
	    	//조선일보_2차평가_피평가자기본정보조회_20160805
	    	case HD_EVLU_1000WBMapping.HD_EVLU_3303_100:
	    		wb = new HD_EVLU_1000WB();
	    		wb.hd_evlu_3303_s_100(req, res);
	    		nextPage = "/jsp/hd/evlu/hd_evlu_3303_s_100.jsp";
	    		break;
	    		
            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
