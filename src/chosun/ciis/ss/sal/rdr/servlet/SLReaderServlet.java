/**************************************************************************************************
 * 파일명    : ReaderServlet.java
 * 기능      : Reader 메뉴 대표 서블릿
 * 작성일자  : 2003-11-19
 * 작성자    : 김영윤
 **************************************************************************************************/
/**************************************************************************************************
 * 수정내역  : flag를 이용하여 지국에서 타지국 조회가능하게 처리
 * 수정자    : 김대섭
 * 수정일자  : 2005-12-09
 * 백업      :
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
 * 독자
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
        IOException, ServletException {

        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/ss/slreader/"; // 판매국 reader와 구별한다.
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
     * SLReaderWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
    public String executeWorker(HttpServletRequest req, HttpServletResponse res,  int pid) throws SysException, AppException {

        String nextPage = null;
        SLReader1100WB wb1100 = null;
        HttpSession session = req.getSession(true);

		/* 모바일관련 wb 따로 분리 20161207 장선희 */
        SLReader11100WB wb11100 = null; //독자정보_모바일



        String bocd = "";
        String flag = "";

        switch (pid) {
            //독자정보관리
            case SLReaderWBMapping.READER_1100: //독자정보관리(초기화)

                /* 독자검색 페이지로부터 분기하므로, request로부터 bocd 값을 얻어서 session에 담는다*/
                bocd = req.getParameter("bocd");
                session.setAttribute("bocd",bocd);
                /*20051209 김대섭 추가*/
                flag = req.getParameter("flag");
                session.setAttribute("from_flag",flag);

                //////////*****************************************************************************//////////////////
                session.setAttribute("bonm", "연희");	//개발중 에러를 막기위한 임시 코드 bobjaru. 2009.03.10
                //////////*****************************************************************************//////////////////

                wb1100 = new SLReader1100WB();
                wb1100.selectCodeList(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1100_a.jsp";
                break;
            case SLReaderWBMapping.READER_1110: //독자정보관리(저장(독자추가))
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]권한이 없습니다.");
            case SLReaderWBMapping.READER_1120: //독자정보관리(독자목록검색)
/*20051209 김대섭 추가*/
                if("bo".equals(session.getAttribute("from_flag"))){
                    throw new AppException("[SLReaderServlet]","[SLReaderServlet]권한이 없습니다.");
                }
/*20051209 김대섭 추가*/
                wb1100 = new SLReader1100WB();
                wb1100.selectReaderList(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1120_l.jsp";
                break;
            case SLReaderWBMapping.READER_1130: //독자정보관리(독자상세보기)
                wb1100 = new SLReader1100WB();
                wb1100.selectReaderDetail(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1130_s.jsp";
                break;
            case SLReaderWBMapping.READER_1135: //독자정보관리(독자정보수정)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]권한이 없습니다.");
            case SLReaderWBMapping.READER_1140: //독자정보관리(구독내역팝업-초기화면)
                nextPage = "/jsp/ss/reader/sl_reader_1140_p.jsp";
                break;
            case SLReaderWBMapping.READER_1150: //독자정보관리(구독내역팝업-구독내역목록조회)
/*20051209 김대섭 추가*/
                if("bo".equals(session.getAttribute("from_flag"))){
                    throw new AppException("[SLReaderServlet]","[SLReaderServlet]권한이 없습니다.");
                }
/*20051209 김대섭 추가*/
                wb1100 = new SLReader1100WB();
                wb1100.selectSubsHistoryList(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1150_l.jsp";
                break;
            case SLReaderWBMapping.READER_1160: //독자정보관리(구독내역팝업-휴독내역목록조회)
                wb1100 = new SLReader1100WB();
                wb1100.selectStopsHistoryList(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1160_l.jsp";
                break;
            case SLReaderWBMapping.READER_1170: //독자정보관리(구독내역팝업-이사내역목록조회)
                wb1100 = new SLReader1100WB();
                wb1100.selectMoveHistoryList(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1170_l.jsp";
                break;
            case SLReaderWBMapping.READER_1180: //독자정보관리(구독추가변경팝업-초기화면)
                wb1100 = new SLReader1100WB();
                wb1100.initSubsCntr(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1180_p.jsp";
                break;
            case SLReaderWBMapping.READER_1185: //독자정보관리(구독추가변경팝업-목록조회)
                wb1100 = new SLReader1100WB();
                wb1100.selectSubsCntrList(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1185_l.jsp";
                break;
            case SLReaderWBMapping.READER_1190: //독자정보관리(구독계약등록)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]권한이 없습니다.");
            case SLReaderWBMapping.READER_1200: //독자정보관리(구독계약수정)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]권한이 없습니다.");
            case SLReaderWBMapping.READER_1210: //독자정보관리(구독상세보기)
                wb1100 = new SLReader1100WB();
                wb1100.selectSubsCntrDetail(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1210_s.jsp";
                break;
            case SLReaderWBMapping.READER_1220: //독자정보관리(입금내역목록조회)
                wb1100 = new SLReader1100WB();
                wb1100.selectRcpmList(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1220_l.jsp";
                break;
            case SLReaderWBMapping.READER_1225: //독자정보관리(입금내역상세보기)
                wb1100 = new SLReader1100WB();
                wb1100.selectRcpmDetail(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1225_s.jsp";
                break;
            case SLReaderWBMapping.READER_1230: //독자정보관리(입금정보저장)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]권한이 없습니다.");
            case SLReaderWBMapping.READER_1280: //독자정보관리(마일리지지급내역팝업-초기화면)
                wb1100 = new SLReader1100WB();
                wb1100.initMilgPayHistory(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1280_p.jsp";
                break;
            case SLReaderWBMapping.READER_1285: //독자정보관리(마일리지지급내역팝업-등록)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]권한이 없습니다.");
            case SLReaderWBMapping.READER_1290: //독자정보관리(마일리지지급내역팝업-목록조회)
                wb1100 = new SLReader1100WB();
                wb1100.selectMilgPayHistoryList(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1290_l.jsp";
                break;
            case SLReaderWBMapping.READER_1293: //독자정보관리(마일리지지급내역팝업-상세조회)
                wb1100 = new SLReader1100WB();
                wb1100.selectMilgPayHistoryDetail(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1293_s.jsp";
                break;
            case SLReaderWBMapping.READER_1294: //독자정보관리(마일리지지급내역팝업-수정)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]권한이 없습니다.");
            case SLReaderWBMapping.READER_1295: //독자정보관리(마일리지지급내역팝업-삭제)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]권한이 없습니다.");

            case SLReaderWBMapping.READER_1300: //독자정보관리(불편접수팝업-초기화면)

                /* 독자검색 페이지로부터 분기하므로, request로부터 bocd 값을 얻어서 session에 담는다*/
                bocd = req.getParameter("bocd");

                //////////*****************************************************************************//////////////////
                if( bocd!=null && bocd.equals("") == false ) {		//개발중 에러를 막기위한 임시 코드 bobjaru. 2009.03.10
                //////////*****************************************************************************//////////////////

                //if( bocd.equals("") == false ) {
                    session.setAttribute("bocd", bocd);

                    /*20070530 이혁 추가*/
                    flag = req.getParameter("flag");
                    session.setAttribute("from_flag",flag);
                }
                wb1100 = new SLReader1100WB();
                wb1100.initDsct(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1300_p.jsp";
                break;
            case SLReaderWBMapping.READER_1305: //독자정보관리(불편접수팝업-불편접수목록)

                /* 독자검색 페이지로부터 분기하므로, request로부터 bocd 값을 얻어서 session에 담는다*/
                bocd = req.getParameter("bocd");

                //////////*****************************************************************************//////////////////
                if( bocd!=null && bocd.equals("") == false ) {		//개발중 에러를 막기위한 임시 코드 bobjaru. 2009.03.10
                //////////*****************************************************************************//////////////////

                //if( bocd.equals("") == false ) {
                    session.setAttribute("bocd", bocd);

                    /*20070530 이혁 추가*/
                    flag = req.getParameter("flag");
                    session.setAttribute("from_flag",flag);
                }


               //불편관리 불편목록(재활용)
                wb1100 = new SLReader1100WB();
                wb1100.selectDsctList(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1305_l.jsp";
                break;
            case SLReaderWBMapping.READER_1310: //독자정보관리(불편접수팝업-불편저장)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]권한이 없습니다.");
            case SLReaderWBMapping.READER_1320: //독자정보관리(중지팝업)(초기화면)
                nextPage = "/jsp/ss/reader/sl_reader_1320_p.jsp";
                break;
            case SLReaderWBMapping.READER_1325: //독자정보관리(중지팝업)(초기화-독자가 구독중인 매체목록 및 중지사유 조회)
                wb1100 = new SLReader1100WB();
                wb1100.selectStopSubsList(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1325_e.jsp";
                break;
            case SLReaderWBMapping.READER_1330: //독자정보관리(중지처리)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]권한이 없습니다.");
            case SLReaderWBMapping.READER_1340: //독자정보관리(이사인계팝업-초기화면)
                wb1100 = new SLReader1100WB();
                wb1100.initMovmTrsf(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1340_p.jsp";
                break;
            case SLReaderWBMapping.READER_1350: //독자정보관리(이사인계팝업-이사신청)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]권한이 없습니다.");
            case SLReaderWBMapping.READER_1360: //독자정보관리(카드인쇄)
            	nextPage = "/jsp/ss/reader/sl_reader_1360_t.jsp";
                break;
            case SLReaderWBMapping.READER_1370: //독자정보관리(판촉물지급내역팝업-초기화면)
                nextPage = "/jsp/ss/reader/sl_reader_1370_p.jsp";
                break;
            case SLReaderWBMapping.READER_1375: //독자정보관리(판촉물지급내역팝업-초기화면)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]권한이 없습니다.");
            case SLReaderWBMapping.READER_1380: //독자정보관리(판촉물지급내역팝업-목록조회)
                wb1100 = new SLReader1100WB();
                wb1100.selectBnsItemPayHistoryList(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1380_l.jsp";
                break;
            case SLReaderWBMapping.READER_1383: //독자정보관리(판촉물지급내역팝업-상세조회)
                wb1100 = new SLReader1100WB();
                wb1100.selectBnsItemPayHistoryDetail(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1383_s.jsp";
                break;
            case SLReaderWBMapping.READER_1384: //독자정보관리(판촉물지급내역팝업-수정)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]권한이 없습니다.");
            case SLReaderWBMapping.READER_1385: //독자정보관리(판촉물지급내역팝업-삭제)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]권한이 없습니다.");
            case SLReaderWBMapping.READER_1390: //독자정보관리(이체신청팝업-초기화면)
                nextPage = "/jsp/ss/reader/sl_reader_1390_p.jsp";
                break;
            case SLReaderWBMapping.READER_1395: //독자정보관리(이체신청팝업-신규신청 초기화)
                wb1100 = new SLReader1100WB();
                wb1100.selectAplcNew(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1395_l.jsp";
                break;
            case SLReaderWBMapping.READER_1400: //독자정보관리(이체신청팝업-자동이체신청 입력)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]권한이 없습니다.");
            case SLReaderWBMapping.READER_1403: //독자정보관리(이체신청팝업-해지신청으로 초기화면)
                nextPage = "/jsp/ss/reader/sl_reader_1403_p.jsp";
                break;
            case SLReaderWBMapping.READER_1405: //독자정보관리(이체신청팝업-해지신청 초기화)
                wb1100 = new SLReader1100WB();
                wb1100.selectAplcExpy(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1405_l.jsp";
                break;
            case SLReaderWBMapping.READER_1408: //독자정보관리(이체신청팝업-해지신청대상목록 상세보기)
                wb1100 = new SLReader1100WB();
                wb1100.selectAplcDetail(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1408_s.jsp";
                break;
            case SLReaderWBMapping.READER_1410: //독자정보관리(이체신청팝업-카드인증)
                nextPage = "/jsp/ss/reader/sl_reader_1410_a.jsp";
                break;
            case SLReaderWBMapping.READER_1413: //독자정보관리(이체신청팝업-이체방법전환 초기화)
                wb1100 = new SLReader1100WB();
                wb1100.selectAplcExpy(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1413_l.jsp";
                break;
            case SLReaderWBMapping.READER_1415: //독자정보관리(이체신청팝업-이체방법전환 상세보기)
                wb1100 = new SLReader1100WB();
                wb1100.selectAplcDetail(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1415_s.jsp";
                break;
            case SLReaderWBMapping.READER_1418: //독자정보관리(이체신청팝업-이체방법전환)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]권한이 없습니다.");
            case SLReaderWBMapping.READER_1420: //독자정보관리(독자메모팝업-초기화면)
                //wb1100.accessRdrMemo(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1420_p.jsp";
                break;
            case SLReaderWBMapping.READER_1430: //독자정보관리(독자메모팝업-조회,등록,수정,초기화)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]권한이 없습니다.");
            case SLReaderWBMapping.READER_1440: //독자정보관리(중지내역팝업-초기화면))
                nextPage = "/jsp/ss/reader/sl_reader_1440_p.jsp";
                break;
            case SLReaderWBMapping.READER_1445: //독자정보관리(중지내역팝업-목록조회)
                wb1100 = new SLReader1100WB();
                wb1100.selectStopHist(req, res);
                nextPage = "/jsp/ss/reader/sl_reader_1445_l.jsp";
                break;
            case SLReaderWBMapping.READER_1450: //독자정보관리(중지내역팝업-중지취소처리)
                throw new AppException("[SLReaderServlet]","[SLReaderServlet]권한이 없습니다.");
            case SLReaderWBMapping.READER_1455: //독자정보관리(기존독자 카운트)
                wb1100 = new SLReader1100WB();
                wb1100.dupChkRdrList(req, res); //1465 와 공유
                nextPage = "/jsp/ss/reader/sl_reader_1455_l.jsp";
                break;
            case SLReaderWBMapping.READER_1460: //독자정보관리(기존독자목록팝업-초기화면)
                nextPage = "/jsp/ss/reader/sl_reader_1460_p.jsp";
                break;
            case SLReaderWBMapping.READER_1465: //독자정보관리(기존독자목록팝업-목록조회)
                wb1100 = new SLReader1100WB();
                wb1100.dupChkRdrList(req, res); //1455 와 공유
                nextPage = "/jsp/ss/reader/sl_reader_1465_l.jsp";
                break;

/*******************************************모바일용******************************************************************/
             //독자정보관리
			case SLReaderWBMapping.READER_11120: // 독자정보관리(독자목록검색)_모바일용
				wb11100 = new SLReader11100WB();
				wb11100.mo_selectReaderList(req, res);
				nextPage =  "/jsp/ss/reader/mo_sl_reader_11120_l.jsp";
				break;
			case SLReaderWBMapping.READER_11130: // 독자정보관리(독자상세보기)_모바일용
				wb11100 = new SLReader11100WB();
				wb11100.mo_selectReaderDetail(req, res);
					if (Util.checkString(req.getParameter("medicd")).equals(""))
						nextPage =  "/jsp/ss/reader/mo_sl_reader_11132_s.jsp"; //모바일용 독자정보리스트+매체리스트(ciis용은 초기커서리스트 제외함)agency는 11130_s.jsp임.
					else
						nextPage =  "/jsp/ss/reader/mo_sl_reader_11131_s.jsp"; // 모바일 각 매체에 대한 입금내역
				break;

            case SLReaderWBMapping.READER_11150: //독자정보관리(구독내역팝업-구독내역목록조회)
                wb11100 = new SLReader11100WB();
                wb11100.mo_selectSubsHistoryList(req, res);
                nextPage = "/jsp/ss/reader/mo_sl_reader_11150_l.jsp";
                break;
            case SLReaderWBMapping.READER_11160: //독자정보관리(구독내역팝업-휴독내역목록조회)
                wb11100 = new SLReader11100WB();
                wb11100.mo_selectStopsHistoryList(req, res);
                nextPage = "/jsp/ss/reader/mo_sl_reader_11160_l.jsp";
                break;
            case SLReaderWBMapping.READER_11170: //독자정보관리(구독내역팝업-이사내역목록조회)
                wb11100 = new SLReader11100WB();
                wb11100.mo_selectMoveHistoryList(req, res);
                nextPage = "/jsp/ss/reader/mo_sl_reader_11170_l.jsp";
                break;



			//독자정보관리-중지내역팝업
            case SLReaderWBMapping.READER_11445: //독자정보관리(중지내역팝업-목록조회)_모바일용
                wb11100 = new SLReader11100WB();
                wb11100.mo_selectStopHist(req, res);
                nextPage = "/jsp/ss/reader/mo_sl_reader_11445_l.jsp";
                break;


            default:
                nextPage = "/"; // or throw SysException...
                throw new AppException("AE003", "해당 PID가 없습니다.");
        }
        return nextPage;
    }
}
