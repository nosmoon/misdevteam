/***************************************************************************************************
 * 파일명 : PLBasServlet.java
 * 기능 :  기초관리서블릿
 * 작성일자 : 2009.02.11
 * 작성자 : 김상옥
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.bas.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.pl.bas.wb.PL_BAS_1000WB;
import chosun.ciis.pl.bas.wb.PL_BAS_1100WB;
import chosun.ciis.pl.bas.wb.PL_BAS_1200WB;
import chosun.ciis.pl.bas.wb.PL_BAS_1300WB;
import chosun.ciis.pl.bas.wb.PL_BAS_1400WB;
import chosun.ciis.pl.bas.wb.PL_BAS_1500WB;
import chosun.ciis.pl.bas.wb.PL_BAS_1600WB;
import chosun.ciis.pl.bas.wb.PL_BAS_1700WB;
import chosun.ciis.pl.bas.wb.PL_BAS_1800WB;
import chosun.ciis.pl.base.servlet.BaseServlet;

public class PLBasServlet extends BaseServlet {


    public static final int ACT_ADD = 1;
    public static final int ACT_RMV = 0;

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
//        String requestURI = null;
//        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/pl/bas/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("PLBasServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("PLBasServlet : process : nextPage : " + nextPage);
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
     * PLBasWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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

        PL_BAS_1000WB wb1000 = null;
        PL_BAS_1100WB wb1100 = null;
        PL_BAS_1200WB wb1200 = null;
        PL_BAS_1300WB wb1300 = null;
        PL_BAS_1400WB wb1400 = null;
        PL_BAS_1500WB wb1500 = null;
        PL_BAS_1600WB wb1600 = null;
        PL_BAS_1700WB wb1700 = null;
        PL_BAS_1800WB wb1800 = null;
        
        switch (pid) {
            //정간물매체관리 메인
        	case PLBasWBMapping.PL_BAS_1000:
        		wb1000 = new PL_BAS_1000WB();
                System.out.println("PL_BAS_1000:::::::::::::::");
        		wb1000.pl_bas_1000_m(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1000_m.jsp";
        		break;        
            //정간물매체관리 조회
        	case PLBasWBMapping.PL_BAS_1010:
        		wb1000 = new PL_BAS_1000WB();
                System.out.println("PL_BAS_1010:::::::::::::::");
        		wb1000.pl_bas_1010_l(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1010_l.jsp";
        		break;        
            //정간물매체관리 상세조회
        	case PLBasWBMapping.PL_BAS_1020:
        		wb1000 = new PL_BAS_1000WB();
                System.out.println("PL_BAS_1020:::::::::::::::");
        		wb1000.pl_bas_1020_l(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1020_l.jsp";
        		break;        
            //정간물매체관리 등록/수정/삭제
        	case PLBasWBMapping.PL_BAS_1030:
        		wb1000 = new PL_BAS_1000WB();
                System.out.println("PL_BAS_1030:::::::::::::::");
        		wb1000.pl_bas_1030_a(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1030_a.jsp";
        		break;        
            //정간물매체관리 발행내역
        	case PLBasWBMapping.PL_BAS_1040:
        		wb1000 = new PL_BAS_1000WB();
                System.out.println("PL_BAS_1040:::::::::::::::");
        		wb1000.pl_bas_1040_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        
            //정간물매체관리 판수내역
        	case PLBasWBMapping.PL_BAS_1050:
        		wb1000 = new PL_BAS_1000WB();
                System.out.println("PL_BAS_1050:::::::::::::::");
        		wb1000.pl_bas_1050_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        
            //정간물매체관리 부록내역
        	case PLBasWBMapping.PL_BAS_1060:
        		wb1000 = new PL_BAS_1000WB();
                System.out.println("PL_BAS_1060:::::::::::::::");
        		wb1000.pl_bas_1060_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            //단행본매체관리 메인
        	case PLBasWBMapping.PL_BAS_1100:
        		wb1100 = new PL_BAS_1100WB();
                System.out.println("PL_BAS_1100:::::::::::::::");
        		wb1100.pl_bas_1100_m(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1100_m.jsp";
        		break;        
            //단행본매체관리 조회
        	case PLBasWBMapping.PL_BAS_1110:
        		wb1100 = new PL_BAS_1100WB();
                System.out.println("PL_BAS_1110:::::::::::::::");
        		wb1100.pl_bas_1110_l(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1110_l.jsp";
        		break;        
            //단행본매체관리 상세조회
        	case PLBasWBMapping.PL_BAS_1120:
        		wb1100 = new PL_BAS_1100WB();
                System.out.println("PL_BAS_1120:::::::::::::::");
        		wb1100.pl_bas_1120_l(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1120_l.jsp";
        		break;        
            //단행본매체관리 등록/수정/삭제
        	case PLBasWBMapping.PL_BAS_1130:
        		wb1100 = new PL_BAS_1100WB();
                System.out.println("PL_BAS_1130:::::::::::::::");
        		wb1100.pl_bas_1130_a(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1130_a.jsp";
        		break;        
            //단행본매체관리 발행내역
        	case PLBasWBMapping.PL_BAS_1140:
        		wb1100 = new PL_BAS_1100WB();
                System.out.println("PL_BAS_1140:::::::::::::::");
        		wb1100.pl_bas_1140_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        
            //단행본매체관리 판수내역
        	case PLBasWBMapping.PL_BAS_1150:
        		wb1100 = new PL_BAS_1100WB();
                System.out.println("PL_BAS_1150:::::::::::::::");
        		wb1100.pl_bas_1150_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        
            //단행본매체관리 부록내역
        	case PLBasWBMapping.PL_BAS_1160:
        		wb1100 = new PL_BAS_1100WB();
                System.out.println("PL_BAS_1160:::::::::::::::");
        		wb1100.pl_bas_1160_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            //거래처관리 메인
        	case PLBasWBMapping.PL_BAS_1200:
        		wb1200 = new PL_BAS_1200WB();
                System.out.println("PL_BAS_1200:::::::::::::::");
        		wb1200.pl_bas_1200_m(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1200_m.jsp";
        		break;        
            //거래처관리 조회
        	case PLBasWBMapping.PL_BAS_1210:
        		wb1200 = new PL_BAS_1200WB();
                System.out.println("PL_BAS_1210:::::::::::::::");
        		wb1200.pl_bas_1210_l(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1210_l.jsp";
        		break;        
            //거래처관리 상세조회
        	case PLBasWBMapping.PL_BAS_1220:
        		wb1200 = new PL_BAS_1200WB();
                System.out.println("PL_BAS_1220:::::::::::::::");
        		wb1200.pl_bas_1220_l(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1220_l.jsp";
        		break;        
            //거래처관리 등록/수정/삭제
        	case PLBasWBMapping.PL_BAS_1230:
        		wb1200 = new PL_BAS_1200WB();
                System.out.println("PL_BAS_1230:::::::::::::::");
        		wb1200.pl_bas_1230_a(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1230_a.jsp";
        		break;        
            //거래처관리 취급매체
        	case PLBasWBMapping.PL_BAS_1240:
        		wb1200 = new PL_BAS_1200WB();
                System.out.println("PL_BAS_1240:::::::::::::::");
        		wb1200.pl_bas_1240_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        
            //거래처관리 발송처
        	case PLBasWBMapping.PL_BAS_1250:
        		wb1200 = new PL_BAS_1200WB();
                System.out.println("PL_BAS_1250:::::::::::::::");
        		wb1200.pl_bas_1250_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        
            //거래처관리 담보내역
        	case PLBasWBMapping.PL_BAS_1260:
        		wb1200 = new PL_BAS_1200WB();
                System.out.println("PL_BAS_1260:::::::::::::::");
        		wb1200.pl_bas_1260_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            //거래처관리 보증인
        	case PLBasWBMapping.PL_BAS_1270:
        		wb1200 = new PL_BAS_1200WB();
                System.out.println("PL_BAS_1270:::::::::::::::");
        		wb1200.pl_bas_1270_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            //거래처취급매체관리 메인
        	case PLBasWBMapping.PL_BAS_1300:
        		wb1300 = new PL_BAS_1300WB();
                System.out.println("PL_BAS_1300:::::::::::::::");
        		wb1300.pl_bas_1300_m(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1300_m.jsp";
        		break;        
            //거래처취급매체관리 조회
        	case PLBasWBMapping.PL_BAS_1310:
        		wb1300 = new PL_BAS_1300WB();
                System.out.println("PL_BAS_1310:::::::::::::::");
        		wb1300.pl_bas_1310_l(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1310_l.jsp";
        		break;        
            //거래처취급매체관리 상세조회
        	case PLBasWBMapping.PL_BAS_1320:
        		wb1300 = new PL_BAS_1300WB();
                System.out.println("PL_BAS_1320:::::::::::::::");
        		wb1300.pl_bas_1320_l(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1320_l.jsp";
        		break;        
            //거래처취급매체관리 저장
        	case PLBasWBMapping.PL_BAS_1330:
        		wb1300 = new PL_BAS_1300WB();
                System.out.println("PL_BAS_1330:::::::::::::::");
        		wb1300.pl_bas_1330_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        
            //거래처취급매체관리 생성
        	case PLBasWBMapping.PL_BAS_1340:
        		wb1300 = new PL_BAS_1300WB();
                System.out.println("PL_BAS_1340:::::::::::::::");
        		wb1300.pl_bas_1340_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            //기초잔액관리 메인
        	case PLBasWBMapping.PL_BAS_1400:
        		wb1400 = new PL_BAS_1400WB();
                System.out.println("PL_BAS_1400:::::::::::::::");
        		wb1400.pl_bas_1400_m(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1400_m.jsp";
        		break;        
            //기초잔액관리 조회
        	case PLBasWBMapping.PL_BAS_1410:
        		wb1400 = new PL_BAS_1400WB();
                System.out.println("PL_BAS_1410:::::::::::::::");
        		wb1400.pl_bas_1410_l(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1410_l.jsp";
        		break;        
            //기초잔액관리 상세조회
        	case PLBasWBMapping.PL_BAS_1420:
        		wb1400 = new PL_BAS_1400WB();
                System.out.println("PL_BAS_1420:::::::::::::::");
        		wb1400.pl_bas_1420_l(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1420_l.jsp";
        		break;        
            //기초잔액관리 저장/삭제
        	case PLBasWBMapping.PL_BAS_1430:
        		wb1400 = new PL_BAS_1400WB();
                System.out.println("PL_BAS_1430:::::::::::::::");
        		wb1400.pl_bas_1430_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            //목표관리 메인
        	case PLBasWBMapping.PL_BAS_1500:
        		wb1500 = new PL_BAS_1500WB();
                System.out.println("PL_BAS_1500:::::::::::::::");
        		wb1500.pl_bas_1500_m(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1500_m.jsp";
        		break;        
            //목표관리 상세조회
        	case PLBasWBMapping.PL_BAS_1510:
        		wb1500 = new PL_BAS_1500WB();
                System.out.println("PL_BAS_1510:::::::::::::::");
        		wb1500.pl_bas_1510_l(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1510_l.jsp";
        		break;        
            //목표관리 조회
        	case PLBasWBMapping.PL_BAS_1520:
        		wb1500 = new PL_BAS_1500WB();
                System.out.println("PL_BAS_1520:::::::::::::::");
        		wb1500.pl_bas_1520_l(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1520_l.jsp";
        		break;        
            //목표관리 저장/삭제
        	case PLBasWBMapping.PL_BAS_1530:
        		wb1500 = new PL_BAS_1500WB();
                System.out.println("PL_BAS_1530:::::::::::::::");
        		wb1500.pl_bas_1530_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            //매체코드관리 메인
        	case PLBasWBMapping.PL_BAS_1600:
        		wb1600 = new PL_BAS_1600WB();
                System.out.println("PL_BAS_1600:::::::::::::::");
        		wb1600.pl_bas_1600_m(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1600_m.jsp";
        		break;        
            //매체코드관리 조회
        	case PLBasWBMapping.PL_BAS_1610:
        		wb1600 = new PL_BAS_1600WB();
                System.out.println("PL_BAS_1610:::::::::::::::");
        		wb1600.pl_bas_1610_l(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1610_l.jsp";
        		break;        
            //매체코드관리 저장/삭제
        	case PLBasWBMapping.PL_BAS_1620:
        		wb1600 = new PL_BAS_1600WB();
                System.out.println("PL_BAS_1620:::::::::::::::");
        		wb1600.pl_bas_1620_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            //매출매입기준관리 메인
        	case PLBasWBMapping.PL_BAS_1700:
        		wb1700 = new PL_BAS_1700WB();
                System.out.println("PL_BAS_1700:::::::::::::::");
        		wb1700.pl_bas_1700_m(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1700_m.jsp";
        		break;        
            //매출매입기준관리 조회
        	case PLBasWBMapping.PL_BAS_1710:
        		wb1700 = new PL_BAS_1700WB();
                System.out.println("PL_BAS_1710:::::::::::::::");
        		wb1700.pl_bas_1710_l(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1710_l.jsp";
        		break;        
            //매출매입기준관리 저장/삭제
        	case PLBasWBMapping.PL_BAS_1720:
        		wb1700 = new PL_BAS_1700WB();
                System.out.println("PL_BAS_1720:::::::::::::::");
        		wb1700.pl_bas_1720_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            //발행사코드관리 메인
        	case PLBasWBMapping.PL_BAS_1800:
        		wb1800 = new PL_BAS_1800WB();
                System.out.println("PL_BAS_1800:::::::::::::::");
        		wb1800.pl_bas_1800_m(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1800_m.jsp";
        		break;        
            //발행사코드관리 조회
        	case PLBasWBMapping.PL_BAS_1810:
        		wb1800 = new PL_BAS_1800WB();
                System.out.println("PL_BAS_1810:::::::::::::::");
        		wb1800.pl_bas_1810_l(req, res);
        		nextPage = "/jsp/pl/bas/pl_bas_1810_l.jsp";
        		break;        
            //발행사코드관리 저장/삭제
        	case PLBasWBMapping.PL_BAS_1820:
        		wb1800 = new PL_BAS_1800WB();
                System.out.println("PL_BAS_1820:::::::::::::::");
        		wb1800.pl_bas_1820_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;        

            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }

        return nextPage;
    }
 
}
