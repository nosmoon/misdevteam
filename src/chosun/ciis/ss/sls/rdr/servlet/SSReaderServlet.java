/***************************************************************************************************
 * 파일명 : SSReaderServlet.java
 * 기능 : 독자현황 서블릿
 * 작성일자 : 2003-12-20
 * 작성자 : 김대섭
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 : 독자인증신청현황 추가 및 기존코드 코멘트 처리
 * 수정자 : 김대섭
 * 수정일자 : 2005-05-04
 * 백업 :
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
     * 상속하는 ControllerServlet 의 doGet, doPost 메소드에서 호출된다.<br>
     * 요청된 URL을 파싱하여 pid를 얻어 excuteWorker()를 호출하며,<br>
     * 리턴된 nextPage로 request를 forward한다.
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
     * PilotWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
     * 메소드를 호출한다.
     * 결과에 따라 nextPage를 반환한다.
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @param pid process id
     * @return forward할 nextPage
     * @throws SysException
     * @throws AppException
     */
    public String executeWorker(HttpServletRequest req, HttpServletResponse res, int pid) throws AppException {

        String nextPage = null;
        SSReader1000WB wb1000 = null; //독자정보
        SSReader1100WB wb1100 = null; //독자불편
        SSReader1200WB wb1200 = null; //VacationStop 신청
        SSReader1300WB wb1300 = null; //VacationStop 마감
        SSReader1400WB wb1400 = null; //VacationStop 비용
        SSReader1500WB wb1500 = null; //VacationStop 휴가지 권역 Code List
        SSReader1600WB wb1600 = null; //독자등급관리
        SSReader1700WB wb1700 = null; //독자정보조회
        SSReader1900WB wb1900 = null; //우송독자관리
        SSReader2000WB wb2000 = null; //불편통계

		/* 모바일관련 wb 따로 분리 20161207 장선희 */
        SSReader11000WB wb11000 = null; //독자정보_모바일
        SSReader11100WB wb11100 = null; //독자정보_모바일

        switch (pid) {
            // 독자검색
            case SSReaderWBMapping.READER_1000: //독자현황-독자정보-독자검색 초기화면
                //독자검색 초기화면은 WB의 메소드 호출없이 JSP로 분기한다.
                nextPage = "/jsp/ss/reader/ss_reader_1000_a.jsp";
                break;
            case SSReaderWBMapping.READER_1005: //독자현황-독자정보-독자검색 목록
                wb1000 = new SSReader1000WB();
                wb1000.selectRdrSrchList(req, res);
   				nextPage = "/jsp/ss/reader/ss_reader_1005_l.jsp";
                break;
            // 독자이력은 지국독자화면으로 대체
            // 독자불편
            case SSReaderWBMapping.READER_1100: //독자현황-독자불편 초기화면
                wb1100 = new SSReader1100WB();
                wb1100.selectInitList(req, res);
                String path = req.getParameter("path");
                nextPage = "/jsp/ss/reader/ss_reader_1100_a.jsp?path="+path;
                break;
            case SSReaderWBMapping.READER_1110: //독자현황-독자불편 조회(리스트)
                wb1100 = new SSReader1100WB();
                wb1100.selectRdrDsctList(req, res);
  				nextPage = "/jsp/ss/reader/ss_reader_1110_l.jsp";
                break;
            case SSReaderWBMapping.READER_1120: //독자현황-독자불편 상세
                wb1100 = new SSReader1100WB();
                wb1100.selectRdrDsctDetail(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1120_s.jsp";
                break;
            case SSReaderWBMapping.READER_1130: //독자현황-독자불편목록 인쇄
                System.out.println("####### READER_1130 #######");
                nextPage = "/jsp/ss/reader/ss_reader_1130_p.jsp";
                break;
            case SSReaderWBMapping.READER_1200: //VacationStop-신청-초기화면
                wb1200 = new SSReader1200WB();
                wb1200.selectInitList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1200_a.jsp";
                break;
            case SSReaderWBMapping.READER_1210: //VacationStop-신청-조회(리스트)
                wb1200 = new SSReader1200WB();
                wb1200.selectVsList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1210_l.jsp";
                break;
            case SSReaderWBMapping.READER_1220: //VacationStop-신청-상세보기
                wb1200 = new SSReader1200WB();
                wb1200.selectVsDetail(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1220_s.jsp";
                break;
                // 독자현황-VacationStop-마감
            case SSReaderWBMapping.READER_1300: //독자현황-VacationStop-마감-초기화면

                // VacationStop 마감 초기화면은 WB를 거치지 않고 바로 JSP로 분기시킨다.
                nextPage = "/jsp/ss/reader/ss_reader_1300_a.jsp";
                break;
            case SSReaderWBMapping.READER_1305: //독자현황-VacationStop-마감-목록
                wb1300 = new SSReader1300WB();
                wb1300.selectVsclosList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1305_l.jsp";
                break;
            case SSReaderWBMapping.READER_1310: //독자현황-VacationStop-마감-상세
                wb1300 = new SSReader1300WB();
                wb1300.selectVsclosDetail(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1310_s.jsp";
                break;
            case SSReaderWBMapping.READER_1315: //독자현황-VacationStop-마감-신규등록
                wb1300 = new SSReader1300WB();
                wb1300.insertVsclos(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1315_i.jsp";
                break;
            case SSReaderWBMapping.READER_1320: //독자현황-VacationStop-마감-수정
                wb1300 = new SSReader1300WB();
                wb1300.updateVsclos(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1320_u.jsp";
                break;
            case SSReaderWBMapping.READER_1325: //독자현황-VacationStop-마감-삭제
                wb1300 = new SSReader1300WB();
                wb1300.deleteVsclos(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1325_d.jsp";
                break;
            case SSReaderWBMapping.READER_1330: //독자현황-VacationStop-마감-마감
                wb1300 = new SSReader1300WB();
                wb1300.closeVsclos(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1330_a.jsp";
                break;
            case SSReaderWBMapping.READER_1335: //독자현황-VacationStop-마감-마감 취소
                wb1300 = new SSReader1300WB();
                wb1300.closeCancelVsclos(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1335_a.jsp";
                break;

            case SSReaderWBMapping.READER_1400: //독자현황-VacationStop-비용-초기화면
                wb1400 = new SSReader1400WB();
                wb1400.selectInitList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1400_a.jsp";
                break;
            case SSReaderWBMapping.READER_1410: //독자현황-VacationStop-비용-조회
                wb1400 = new SSReader1400WB();
                wb1400.selectVscostList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1410_l.jsp";
                break;
                // VacationStop
            case SSReaderWBMapping.READER_1500: //독자현황-VacationStop-코드-초기화면
                wb1500 = new SSReader1500WB();
                wb1500.initVsCode(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1500_a.jsp";
                break;
            case SSReaderWBMapping.READER_1510: //독자현황-VacationStop-코드-목록
                wb1500 = new SSReader1500WB();
                wb1500.selectVsCodeList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1510_l.jsp";
                break;
            case SSReaderWBMapping.READER_1520: //독자현황-VacationStop-코드-상세
                wb1500 = new SSReader1500WB();
                wb1500.selectVsCodeDetail(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1520_s.jsp";
                break;
            case SSReaderWBMapping.READER_1530: //독자현황-VacationStop-코드-등록
                wb1500 = new SSReader1500WB();
                wb1500.insertVsCode(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1530_i.jsp";
                break;
            case SSReaderWBMapping.READER_1540: //독자현황-VacationStop-코드-수정
                wb1500 = new SSReader1500WB();
                wb1500.updateVsCode(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1540_u.jsp";
                break;
            case SSReaderWBMapping.READER_1550: //독자현황-VacationStop-코드-삭제
                wb1500 = new SSReader1500WB();
                wb1500.deleteVsCode(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1550_d.jsp";
                break;
            // 독자등급관리
/* 20050505 김대섭 수정 (사용하지 않음)
            case SSReaderWBMapping.READER_1600:	//독자현황-독자등급관리-초기화면
                wb1600 = new SSReader1600WB();
                wb1600.selectGradAplcList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1600_a.jsp";
                break;
            case SSReaderWBMapping.READER_1605:	//독자현황-독자등급관리-조회
                wb1600 = new SSReader1600WB();
                wb1600.selectGradAplcList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1605_l.jsp";
                break;
            case SSReaderWBMapping.READER_1610:	//독자현황-독자등급관리-저장
                wb1600 = new SSReader1600WB();
                wb1600.updateGradAplcGrnt(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1610_u.jsp";
                break;
            case SSReaderWBMapping.READER_1615:	//독자현황-독자등급관리-비교대상검색 초기
                wb1600 = new SSReader1600WB();
                wb1600.selectAplcCmprList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1615_l.jsp";
                break;
            case SSReaderWBMapping.READER_1620:	//독자현황-독자등급관리-비교대상 검색
                wb1600 = new SSReader1600WB();
                wb1600.selectAplcCmprList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1620_l.jsp";
                break;
*/
            case SSReaderWBMapping.READER_1600:	//독자현황-독자등급관리-초기화면
                wb1600 = new SSReader1600WB();
                wb1600.initRdrCrts(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1600_a.jsp";
                break;
            case SSReaderWBMapping.READER_1605:	//독자현황-독자등급관리-조회
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

            case SSReaderWBMapping.READER_1710: //독자현황-비독자관리-초기화면
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

            case SSReaderWBMapping.READER_1820:         // 공통-지국목록(LIST)
            	wb1100 = new SSReader1100WB();
            	wb1100.selectTmAgentList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1820_l.jsp";
                break;

            case SSReaderWBMapping.READER_1830:         // 공통-지국목록(LIST)
            	wb1100 = new SSReader1100WB();
            	wb1100.selectTmCampList(req, res);
                nextPage = "/jsp/ss/reader/ss_reader_1830_l.jsp";
                break;

            case SSReaderWBMapping.READER_1900: //우송독자관리 초기
            	wb1900 = new SSReader1900WB();
            	wb1900.initList(req, res);
            	nextPage = "/jsp/ss/reader/ss_reader_1900_a.jsp";
            	break;

            case SSReaderWBMapping.READER_1905: //우송독자관리  리스트
            	wb1900 = new SSReader1900WB();
            	wb1900.selectList(req, res);
            	nextPage = "/jsp/ss/reader/ss_reader_1905_l.jsp";
            	break;

            case SSReaderWBMapping.READER_1910: //우송독자관리 상세
            	wb1900 = new SSReader1900WB();
            	wb1900.detailList(req, res);
            	nextPage = "/jsp/ss/reader/ss_reader_1910_s.jsp";
            	break;

            case SSReaderWBMapping.READER_1915: //우송독자관리 저장
            	wb1900 = new SSReader1900WB();
            	wb1900.insertList(req, res);
            	nextPage = "/jsp/ss/reader/ss_reader_1915_i.jsp";
            	break;

            case SSReaderWBMapping.READER_2000: //불편통계 초기
            	wb2000 = new SSReader2000WB();
            	wb2000.initDsctstat(req, res);
            	nextPage = "/jsp/ss/reader/ss_reader_2000_a.jsp";
            	break;

            case SSReaderWBMapping.READER_2010: //불편통계 초기
            	wb2000 = new SSReader2000WB();
            	wb2000.selectDsctstat(req, res);
            	nextPage = "/jsp/ss/reader/ss_reader_2010_l.jsp";
            	break;

/*******************************************모바일용******************************************************************/
            case SSReaderWBMapping.READER_11005: //독자관리-독자정보검색
                wb11000 = new SSReader11000WB();
                wb11000.mo_selectRdrSrchList(req, res);
   				nextPage = "/jsp/ss/reader/mo_ss_reader_11005_l.jsp";		//모바일용 test 20160711 장선희
                break;

            //불편현황
            case SSReaderWBMapping.READER_11100: //독자현황-독자불편 초기화면
                wb11100 = new SSReader11100WB();
                wb11100.mo_selectInitList(req, res);
                nextPage = "/jsp/ss/reader/mo_ss_reader_11100_a.jsp";
                break;
            case SSReaderWBMapping.READER_11110: //독자현황-독자불편 조회(리스트)
                wb11100 = new SSReader11100WB();
                wb11100.mo_selectRdrDsctList(req, res);
  				nextPage = "/jsp/ss/reader/mo_ss_reader_11110_l.jsp";
                break;
            case SSReaderWBMapping.READER_11120: //독자현황-독자불편 상세
                wb11100 = new SSReader11100WB();
                wb11100.mo_selectRdrDsctDetail(req, res);
                nextPage = "/jsp/ss/reader/mo_ss_reader_11120_s.jsp";
                break;

            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
        return nextPage;
    }
}
