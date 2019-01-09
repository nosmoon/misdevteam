/***************************************************************************************************
 * 파일명 : SSAdminServlet.java
 * 기능 : 관리자 서블릿
 * 작성일자 : 2004-03-12
 * 작성자 : 김대섭
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 : 지국월마감 추가
 * 수정자 : 김영윤
 * 수정일자 : 2005-01-28
 * 백업 : 추가
 ***************************************************************************************************/

package chosun.ciis.ss.sls.admin.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import somo.framework.servlet.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.wb.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.common.servlet.*;

/**
 * 판매국 업무지원 관리자 Servlet
 */

public class SSAdminServlet extends ChosunServlet {

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
            String servletMappedUrl = "/ss/admin/";
            iPid = extractPid(req, servletMappedUrl);
System.out.println("SSAdminServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
System.out.println("SSAdminServlet : process : nextPage : " + nextPage);
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
     * SSAdminWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
    public String executeWorker(HttpServletRequest req, HttpServletResponse res,
                                int pid) throws AppException {

        String nextPage = null;
        SSAdmin1000WB wb1000 = null; //관리자-공통코드,우편번호,판촉코드
        SSAdmin1100WB wb1100 = null; //관리자-작업-마이그레이션
        SSAdmin1200WB wb1200 = null; //관리자-작업-마이그레이션-검증
        SSAdmin1300WB wb1300 = null; //관리자-마일리지
        SSAdmin1400WB wb1400 = null; //관리자-작업-작업
        SSAdmin1500WB wb1500 = null; //관리자-지국월마감
        SSAdmin1600WB wb1600 = null; //관리자-담당별 우편번호 변경처리
        SSAdmin1700WB wb1700 = null;
        SSAdmin1800WB wb1800 = null;
        SSAdmin1900WB wb1900 = null;
        SSAdmin2000WB wb2000 = null;
        SSAdmin2100WB wb2100 = null; //관리자-모바일관리(로그인승인) 20160922 장선희

        /*******************************************모바일용******************************************************************/
        SSAdmin12100WB wb12100 = null;


        switch (pid) {

	        case SSAdminWBMapping.ADMIN_10000: //관리자-공통코드-초기화면
	            wb1000 = new SSAdmin1000WB();

	            java.util.Calendar systime10 = java.util.Calendar.getInstance();
	            StringBuffer sb = new StringBuffer();
	            sb.append(systime10.get(java.util.Calendar.YEAR));
	            sb.append("-");
	            sb.append(systime10.get(java.util.Calendar.MONTH));
	            sb.append("-");
	            sb.append(systime10.get(java.util.Calendar.DAY_OF_MONTH));
	            sb.append(" ");
	            sb.append(systime10.get(java.util.Calendar.HOUR_OF_DAY));
	            sb.append(":");
	            sb.append(systime10.get(java.util.Calendar.MINUTE));
	            sb.append(":");
	            sb.append(systime10.get(java.util.Calendar.SECOND));
	            sb.append(".");
	            sb.append(systime10.get(java.util.Calendar.MILLISECOND));

	            System.out.println("=====Servlet ENTRY1 TIME======: " + sb.toString());
	            req.setAttribute("SVR Entry", "\nSVR Entry \t : " + sb.toString());
	            wb1000.initCode(req, res);

	            systime10 = java.util.Calendar.getInstance();
	            sb = new StringBuffer();
	            sb.append(systime10.get(java.util.Calendar.YEAR));
	            sb.append("-");
	            sb.append(systime10.get(java.util.Calendar.MONTH));
	            sb.append("-");
	            sb.append(systime10.get(java.util.Calendar.DAY_OF_MONTH));
	            sb.append(" ");
	            sb.append(systime10.get(java.util.Calendar.HOUR_OF_DAY));
	            sb.append(":");
	            sb.append(systime10.get(java.util.Calendar.MINUTE));
	            sb.append(":");
	            sb.append(systime10.get(java.util.Calendar.SECOND));
	            sb.append(".");
	            sb.append(systime10.get(java.util.Calendar.MILLISECOND));
	            System.out.println("=====Servlet DONE TIME======: " + sb.toString());
	            req.setAttribute("SVR Done", "\nSVR Done \t : " + sb.toString());
	            nextPage = "/jsp/ss/admin/ss_admin_10000_a.jsp";
	       break;


            // 관리자-공통코드
	       	//지국정보관리-CRM공통코드
	       	//2009년 11월 3일 EJB 제거
            case SSAdminWBMapping.ADMIN_1000: //관리자-공통코드-초기화면
                wb1000 = new SSAdmin1000WB();

                java.util.Calendar systime = java.util.Calendar.getInstance();
                StringBuffer sb1 = new StringBuffer();
                sb1.append(systime.get(java.util.Calendar.YEAR));
                sb1.append("-");
                sb1.append(systime.get(java.util.Calendar.MONTH));
                sb1.append("-");
                sb1.append(systime.get(java.util.Calendar.DAY_OF_MONTH));
                sb1.append(" ");
                sb1.append(systime.get(java.util.Calendar.HOUR_OF_DAY));
                sb1.append(":");
                sb1.append(systime.get(java.util.Calendar.MINUTE));
                sb1.append(":");
                sb1.append(systime.get(java.util.Calendar.SECOND));
                sb1.append(".");
                sb1.append(systime.get(java.util.Calendar.MILLISECOND));

                System.out.println("=====Servlet ENTRY1 TIME======: " + sb1.toString());
                req.setAttribute("SVR Entry", "\nSVR Entry \t : " + sb1.toString());
                wb1000.initCode(req, res);

                systime = java.util.Calendar.getInstance();
                sb1 = new StringBuffer();
                sb1.append(systime.get(java.util.Calendar.YEAR));
                sb1.append("-");
                sb1.append(systime.get(java.util.Calendar.MONTH));
                sb1.append("-");
                sb1.append(systime.get(java.util.Calendar.DAY_OF_MONTH));
                sb1.append(" ");
                sb1.append(systime.get(java.util.Calendar.HOUR_OF_DAY));
                sb1.append(":");
                sb1.append(systime.get(java.util.Calendar.MINUTE));
                sb1.append(":");
                sb1.append(systime.get(java.util.Calendar.SECOND));
                sb1.append(".");
                sb1.append(systime.get(java.util.Calendar.MILLISECOND));
                System.out.println("=====Servlet DONE TIME======: " + sb1.toString());
                req.setAttribute("SVR Done", "\nSVR Done \t : " + sb1.toString());
                nextPage = "/jsp/ss/admin/ss_admin_1000_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1003: //관리자-공통코드-코드구분 목록
                wb1000 = new SSAdmin1000WB();
                wb1000.selectCodeGBList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1003_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1005: //관리자-공통코드-목록
                wb1000 = new SSAdmin1000WB();
                wb1000.selectCodeList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1005_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1010: //관리자-공통코드-상세
                wb1000 = new SSAdmin1000WB();
                wb1000.selectCodeDetail(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1010_s.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1015: //관리자-공통코드-등록
                wb1000 = new SSAdmin1000WB();
                wb1000.insertCode(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1015_i.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1020: //관리자-공통코드-수정
                wb1000 = new SSAdmin1000WB();
                wb1000.updateCode(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1020_u.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1025: //관리자-공통코드-삭제
                wb1000 = new SSAdmin1000WB();
                wb1000.deleteCode(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1025_d.jsp";
                break;

                // 관리자-우편번호
            case SSAdminWBMapping.ADMIN_1030: //관리자-우편번호-초기화면
                wb1000 = new SSAdmin1000WB();
                wb1000.initZip(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1030_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1035: //관리자-우편번호-목록
                wb1000 = new SSAdmin1000WB();
                wb1000.selectZipList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1035_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1040: //관리자-우편번호-상세
                wb1000 = new SSAdmin1000WB();
                wb1000.selectZipDetail(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1040_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1045: //관리자-우편번호-저장
                wb1000 = new SSAdmin1000WB();
                wb1000.accessZip(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1045_a.jsp";
                break;

                // 관리자-판촉코드
            case SSAdminWBMapping.ADMIN_1050:

                // 판촉코드 초기화면은 WB를 거치지 않고 바로 JSP로 분기시킨다.
                nextPage = "/jsp/ss/admin/ss_admin_1050_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1055:
                wb1000 = new SSAdmin1000WB();
                wb1000.selectBNSITEMSP(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1055_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1060:
                wb1000 = new SSAdmin1000WB();
                wb1000.detailBNSITEMSP(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1060_s.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1065:
                wb1000 = new SSAdmin1000WB();
                wb1000.actionBNSITEMSP(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1065_i.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1070:
                wb1000 = new SSAdmin1000WB();
                wb1000.actionBNSITEMSP(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1070_u.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1075:
                wb1000 = new SSAdmin1000WB();
                wb1000.actionBNSITEMSP(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1075_d.jsp";
                break;

                // 관리자-계정코드
            case SSAdminWBMapping.ADMIN_1080:
                wb1000 = new SSAdmin1000WB();
                wb1000.initAcctcd(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1080_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1082:
                wb1000 = new SSAdmin1000WB();
                wb1000.selectAcctcdList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1082_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1084:
                wb1000 = new SSAdmin1000WB();
                wb1000.selectAcctcdDetail(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1084_s.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1086:
                wb1000 = new SSAdmin1000WB();
                wb1000.insertAcctcd(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1086_i.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1088:
                wb1000 = new SSAdmin1000WB();
                wb1000.updateAcctcd(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1088_u.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1090:
                wb1000 = new SSAdmin1000WB();
                wb1000.deleteAcctcd(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1090_d.jsp";
                break;

                // 관리자-작업-마이그레이션
            case SSAdminWBMapping.ADMIN_1100: //관리자-작업-마이그레이션-초기화면
                wb1100 = new SSAdmin1100WB();
                wb1100.initMig(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1100_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1105: //관리자-작업-마이그레이션-목록
                wb1100 = new SSAdmin1100WB();
                wb1100.selectMigList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1105_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1110: //관리자-작업-마이그레이션-지국DB업로드
                wb1100 = new SSAdmin1100WB();
                //wb1100.boUpload(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1110_a.jsp";
                break;
                // 에러 확인은 DM, DataSet 없이 처리한다.(프로시저 호출이 아닌 에러 파일 IO)
            case SSAdminWBMapping.ADMIN_1113: //관리자-작업-마이그레이션-지국DB업로드 에러 확인
                wb1100 = new SSAdmin1100WB();
                wb1100.showError(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1113_p.jsp";
                break;

            case SSAdminWBMapping.ADMIN_1115: //관리자-작업-마이그레이션-빌링DB업로드
                wb1100 = new SSAdmin1100WB();
                wb1100.billUpload(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1115_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1120: //관리자-작업-마이그레이션-지국자료전환
                wb1100 = new SSAdmin1100WB();
                wb1100.boConvert(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1120_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1125: //관리자-작업-마이그레이션-빌링자료전환
                wb1100 = new SSAdmin1100WB();
                wb1100.billConvert(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1125_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1130: //관리자-작업-마이그레이션-지국DB업로드 작업이력
                wb1100 = new SSAdmin1100WB();
                wb1100.selectBoUploadHstyList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1130_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1135: //관리자-작업-마이그레이션-빌링DB업로드 작업이력
                wb1100 = new SSAdmin1100WB();
                wb1100.selectBillUploadHstyList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1135_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1140: //관리자-작업-마이그레이션-지국자료전환 작업이력
                wb1100 = new SSAdmin1100WB();
                wb1100.selectBoConvertHstyList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1140_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1145: //관리자-작업-마이그레이션-빌링자료전환 작업이력
                wb1100 = new SSAdmin1100WB();
                wb1100.selectBillConvertHstyList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1145_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1150: //관리자-작업-마이그레이션-지국DB업로드 작업내역
                wb1100 = new SSAdmin1100WB();
                wb1100.selectBoUploadPtcrList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1150_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1155: //관리자-작업-마이그레이션-빌링DB업로드 작업내역
                wb1100 = new SSAdmin1100WB();
                wb1100.selectBillUploadPtcrList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1155_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1160: //관리자-작업-마이그레이션-지국자료전환 작업내역
                wb1100 = new SSAdmin1100WB();
                wb1100.selectBoConvertPtcrList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1160_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1165: //관리자-작업-마이그레이션-빌링자료전환 작업내역
                wb1100 = new SSAdmin1100WB();
                wb1100.selectBillConvertPtcrList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1165_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1170: //관리자-작업-마이그레이션 현황-초기화면
                wb1100 = new SSAdmin1100WB();
                wb1100.initMigInfo(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1170_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1175: //관리자-작업-마이그레이션 현황-목록
                wb1100 = new SSAdmin1100WB();
                wb1100.selectMigInfoList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1175_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1180: //관리자-작업-마이그레이션 현황-저장
                wb1100 = new SSAdmin1100WB();
                wb1100.updateMigInfo(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1180_u.jsp";
                break;

                // 관리자-작업-마이그레이션-검증
            case SSAdminWBMapping.ADMIN_1200: //관리자-작업-마이그레이션-검증
                wb1200 = new SSAdmin1200WB();
                wb1200.init(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1200_a.jsp";
                break;

            case SSAdminWBMapping.ADMIN_1205: //관리자-작업-마이그레이션-검증
                wb1200 = new SSAdmin1200WB();
                wb1200.selectMigBOCDList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1205_l.jsp";
                break;

            case SSAdminWBMapping.ADMIN_1210: //관리자-작업-마이그레이션-검증
                wb1200 = new SSAdmin1200WB();
                wb1200.selectMIGRMECD(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1210_l.jsp";
                break;

            case SSAdminWBMapping.ADMIN_1215: //관리자-작업-마이그레이션-검증
                wb1200 = new SSAdmin1200WB();
                wb1200.selectMIGRGUYUK(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1215_l.jsp";
                break;

            case SSAdminWBMapping.ADMIN_1220: //관리자-작업-마이그레이션-검증
                wb1200 = new SSAdmin1200WB();
                wb1200.selectMIGRSGBANG(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1220_l.jsp";
                break;

            case SSAdminWBMapping.ADMIN_1230: //관리자-작업-마이그레이션-검증-오류독자조회
                wb1200 = new SSAdmin1200WB();
                wb1200.selectMIGRERR(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1230_l.jsp";
                break;

                // 관리자-마일리지
            case SSAdminWBMapping.ADMIN_1300: //관리자-마일리지-초기화면
                wb1300 = new SSAdmin1300WB();
                wb1300.initPayBasi(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1300_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1305: //관리자-마일리지-목록
                wb1300 = new SSAdmin1300WB();
                wb1300.selectPayBasiList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1305_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1310: //관리자-마일리지-상세
                wb1300 = new SSAdmin1300WB();
                wb1300.selectPayBasiDetail(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1310_s.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1315: //관리자-마일리지-등록
                wb1300 = new SSAdmin1300WB();
                wb1300.insertPayBasi(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1315_i.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1320: //관리자-마일리지-수정
                wb1300 = new SSAdmin1300WB();
                wb1300.updatePayBasi(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1320_u.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1325: //관리자-마일리지-삭제
                wb1300 = new SSAdmin1300WB();
                wb1300.deletePayBasi(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1325_d.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1330: //관리자-마일리지-마감-초기화면

                // 초기화면은 WB를 거치지 않고 바로 JSP로 분기시킨다.
                nextPage = "/jsp/ss/admin/ss_admin_1330_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1335: //관리자-마일리지-마감-목록
                wb1300 = new SSAdmin1300WB();
                wb1300.selectMigClosList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1335_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1340: //관리자-마일리지-마감-상세
                wb1300 = new SSAdmin1300WB();
                wb1300.selectMigClosDetail(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1340_s.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1345: //관리자-마일리지-마감-등록
                wb1300 = new SSAdmin1300WB();
                wb1300.insertMigClos(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1345_i.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1350: //관리자-마일리지-마감-수정
                wb1300 = new SSAdmin1300WB();
                wb1300.updateMigClos(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1350_u.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1355: //관리자-마일리지-마감-삭제
                wb1300 = new SSAdmin1300WB();
                wb1300.deleteMigClos(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1355_d.jsp";
                break;

            case SSAdminWBMapping.ADMIN_1360: //관리자-마일리지-마감-마감
                wb1300 = new SSAdmin1300WB();
                wb1300.closeMigClos(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1360_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1365: //관리자-마일리지-마감-마감취소
                wb1300 = new SSAdmin1300WB();
                wb1300.closeCancelMigClos(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1365_a.jsp";
                break;

                // 관리자-작업-등록,작업이력
            case SSAdminWBMapping.ADMIN_1400: //관리자-작업-등록-초기화면
                wb1400 = new SSAdmin1400WB();
                wb1400.initWrk(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1400_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1405: //관리자-작업-등록-목록
                wb1400 = new SSAdmin1400WB();
                wb1400.selectWrkList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1405_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1410: //관리자-작업-등록-상세
                wb1400 = new SSAdmin1400WB();
                wb1400.selectWrkDetail(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1410_s.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1415: //관리자-작업-등록-등록
                wb1400 = new SSAdmin1400WB();
                wb1400.insertWrk(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1415_i.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1420: //관리자-작업-등록-수정
                wb1400 = new SSAdmin1400WB();
                wb1400.updateWrk(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1420_u.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1425: //관리자-작업-등록-삭제
                wb1400 = new SSAdmin1400WB();
                wb1400.deleteWrk(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1425_d.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1427: //관리자-작업-등록-파일전송 팝업

                // 파일전송 팝업은 WB를 거치지 않고 바로 JSP로 분기시킨다.
                nextPage = "/jsp/ss/admin/ss_admin_1427_p.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1430: //관리자-작업-등록-수동실행
                wb1400 = new SSAdmin1400WB();
                wb1400.runWrk(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1430_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1435: //관리자-작업-이력-초기화면

                // 초기화면은 WB를 거치지 않고 바로 JSP로 분기시킨다.
                wb1400 = new SSAdmin1400WB();
                wb1400.initWrkHist(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1435_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1440: //관리자-작업-이력-목록(이력)
                wb1400 = new SSAdmin1400WB();
                wb1400.selectWrkHstyList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1440_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1445: //관리자-작업-이력-목록(내역)
                wb1400 = new SSAdmin1400WB();
                wb1400.selectWrkPtcrList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1445_l.jsp";
                break;

            //2005-01-28 김영윤 추가
            //관리자-지국월마감
            case SSAdminWBMapping.ADMIN_1500: //관리자-지국월마감-초기화면
                wb1500 = new SSAdmin1500WB();
                wb1500.initBoclos(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1500_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1505: //관리자-지국월마감-목록
                wb1500 = new SSAdmin1500WB();
                wb1500.selectBoclosList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1505_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1510: //관리자-지국월마감-상세
                wb1500 = new SSAdmin1500WB();
                wb1500.selectBoclosDetail(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1510_s.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1515: //관리자-지국월마감-마감
                wb1500 = new SSAdmin1500WB();
                wb1500.closeBoclos(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1515_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1520: //관리자-지국월마감-마감취소
                wb1500 = new SSAdmin1500WB();
                wb1500.closeCancelBoclos(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1520_a.jsp";
                break;

            //2009-04-27 우편번호 관리 신규개발 추가 권정윤
            case SSAdminWBMapping.ADMIN_1600: //관리자-담당별 우편번호 변경처리-초기화면
            	wb1600 = new SSAdmin1600WB();
                wb1600.initZipCode(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1600_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1601: //관리자-담당별 우편번호 변경처리-조회
            	wb1600 = new SSAdmin1600WB();
            	wb1600.selectZipCode(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1601_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1607: //관리자-담당별 우편번호 변경처리-상세조회
            	wb1600 = new SSAdmin1600WB();
            	wb1600.detailZipCode(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1607_s.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1602: //관리자-담당별 우편번호 변경처리-복수조회
            	wb1600 = new SSAdmin1600WB();
            	wb1600.unionZipCode(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1602_s.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1603: //관리자-담당별 우편번호 변경처리-판매국 복사
            	wb1600 = new SSAdmin1600WB();
            	wb1600.copyZipCode(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1603_i.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1604: //관리자-담당별 우편번호 변경처리-삭제
            	wb1600 = new SSAdmin1600WB();
            	wb1600.deleteZipCode(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1604_d.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1605: //관리자-담당별 우편번호 변경처리-승인요청
            	wb1600 = new SSAdmin1600WB();
            	wb1600.reqZipCode(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1605_u.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1606: //관리자-담당별 우편번호 변경처리-저장(하단
            	wb1600 = new SSAdmin1600WB();
            	wb1600.updateZipCode(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1606_u.jsp";
                break;

            //2009-05-07 우편번호 관리 신규개발 추가 권정윤
            case SSAdminWBMapping.ADMIN_1610: //관리자-마스터 우편번호 승인처리-초기화면
            	wb1600 = new SSAdmin1600WB();
            	wb1600.initMstZip(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1610_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1611: //관리자-마스터 우편번호 승인처리-조회
            	wb1600 = new SSAdmin1600WB();
            	wb1600.selectMstZip(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1611_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1612: //관리자-마스터 우편번호 승인처리-저장
            	wb1600 = new SSAdmin1600WB();
            	wb1600.updateMstZip(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1612_u.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1613: //관리자-마스터 우편번호 승인처리-승인
            	wb1600 = new SSAdmin1600WB();
            	wb1600.apprMstZip(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1613_u.jsp";
                break;

            case SSAdminWBMapping.ADMIN_1699: //관리자-담당별 우편번호 엑셀 일괄등록
            	wb1600 = new SSAdmin1600WB();
            	wb1600.uploadZipCode(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1699_i.jsp";
                break;

            //2009-05-08 우편번호 관리 신규개발 추가 권정윤
            case SSAdminWBMapping.ADMIN_1621: //관리자-일괄 우편번호 변경처리-조회
            	wb1600 = new SSAdmin1600WB();
            	wb1600.selectBatZip(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1621_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1622: //관리자-일괄 우편번호 변경처리-일괄적용
            	wb1600 = new SSAdmin1600WB();
            	wb1600.updateBatZip(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1622_u.jsp";
                break;

            case SSAdminWBMapping.ADMIN_1700: //신주소 승인 초기화면
            	wb1700 = new SSAdmin1700WB();
                nextPage = "/jsp/ss/admin/ss_admin_1700_a.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1701: //신주소 승인 조회
            	wb1700 = new SSAdmin1700WB();
            	wb1700.selectNewjusoAppr(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1701_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1702: //신주소 승인 요청
            	wb1700 = new SSAdmin1700WB();
            	wb1700.updateNewjusoApprReq(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1702_u.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1703: //신주소 승인
            	wb1700 = new SSAdmin1700WB();
            	wb1700.updateNewjusoAppr(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1703_u.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1710: //신주소 승인이력 팝업
            	wb1700 = new SSAdmin1700WB();
            	wb1700.newjusoApprHistory(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1710_p.jsp";
                break;                     
            case SSAdminWBMapping.ADMIN_1801:
            	wb1800 = new SSAdmin1800WB();
            	wb1800.executeSQLwrk(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1801_i.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1802:
            	wb1800 = new SSAdmin1800WB();
            	wb1800.executeSQLList(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1802_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1803:
            	wb1800 = new SSAdmin1800WB();
            	wb1800.executeSQLDwload(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1803_p.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1804:
            	wb1800 = new SSAdmin1800WB();
            	wb1800.executeSQLSample(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1804_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1805:
            	wb1800 = new SSAdmin1800WB();
            	wb1800.selectSQLquerylist(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1805_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1806:
            	wb1800 = new SSAdmin1800WB();
            	wb1800.detailSQLquerylist(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1806_s.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1807:
            	wb1800 = new SSAdmin1800WB();
            	wb1800.insertSQLquerylist(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1807_i.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1808:
            	wb1800 = new SSAdmin1800WB();
            	wb1800.executeSQLDwload(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1808_p.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1811:
            	wb1800 = new SSAdmin1800WB();
            	wb1800.executeSQLTablelist(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1811_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1812:
            	wb1800 = new SSAdmin1800WB();
            	wb1800.executeSQLColumnlist(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1812_s.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1901:
            	wb1900 = new SSAdmin1900WB();
            	wb1900.selectAddrcdTrsfbo(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1901_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1902:
            	wb1900 = new SSAdmin1900WB();
            	wb1900.selectAddrcdAcptbo(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1902_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_1903:
            	wb1900 = new SSAdmin1900WB();
            	wb1900.saveAddrcd(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_1903_i.jsp";
                break;

            case SSAdminWBMapping.ADMIN_2010:
            	wb2000 = new SSAdmin2000WB();
            	wb2000.selectNewjusoChg(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_2010_l.jsp";
                break;
            case SSAdminWBMapping.ADMIN_2020:
            	wb2000 = new SSAdmin2000WB();
            	wb2000.updateNewjusoChg(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_2020_u.jsp";
                break;

           //모바일관리
           case SSAdminWBMapping.ADMIN_2100:		//관리자-모바일관리-로그인승인 초기
            	wb2100 = new SSAdmin2100WB();
            	wb2100.initMoAplc(req, res);
                nextPage = "/jsp/ss/admin/ss_admin_2100_a.jsp";
                break;
           case SSAdminWBMapping.ADMIN_2110:		//관리자-모바일관리-로그인승인 조회리스트
               	wb2100 = new SSAdmin2100WB();
               	wb2100.selectMoAplc(req, res);
               	nextPage = "/jsp/ss/admin/ss_admin_2110_l.jsp";
                   break;
           case SSAdminWBMapping.ADMIN_2111:		//관리자-모바일관리-로그인이력리스트
        	   wb2100 = new SSAdmin2100WB();
        	   wb2100.selectLoginHist(req, res);
        	   nextPage = "/jsp/ss/admin/ss_admin_2111_l.jsp";
        	   break;
           case SSAdminWBMapping.ADMIN_2112:		//관리자-모바일관리-기기변경,휴대번호변경이력리스트
        	   wb2100 = new SSAdmin2100WB();
        	   wb2100.selectModiHist(req, res);
        	   nextPage = "/jsp/ss/admin/ss_admin_2112_l.jsp";
        	   break;
           case SSAdminWBMapping.ADMIN_2120:		//관리자-모바일관리-로그인승인 상세
              	wb2100 = new SSAdmin2100WB();
              	wb2100.detailMoAplc(req, res);
                  nextPage = "/jsp/ss/admin/ss_admin_2120_s.jsp";
                  break;

           case SSAdminWBMapping.ADMIN_2130:		//관리자-모바일관리-로그인승인 (1.담당승인, 2.담당거절, 3.비밀번호초기화, 4.차단, 5.차단해제, 6.기기변경승인)
             	wb2100 = new SSAdmin2100WB();
             	wb2100.updateMoAplc(req, res);
                 nextPage = "/jsp/ss/admin/ss_admin_2130_i.jsp";
                 break;

/*******************************************모바일용******************************************************************/

/*                 //모바일관리-담당로그인승인
               case SSAdminWBMapping.ADMIN_12100:		//관리자-모바일관리-로그인승인 초기_모바일용
                	wb12100 = new SSAdmin12100WB();
                	wb12100.mo_initMoAplc(req, res);
                    nextPage = "/jsp/ss/admin/mo_ss_admin_12100_a.jsp";
                    break;
*/
               case SSAdminWBMapping.ADMIN_12110:		//관리자-모바일관리-로그인승인 조회리스트_모바일용
                   	wb12100 = new SSAdmin12100WB();
                   	wb12100.mo_selectMoAplc(req, res);
                       nextPage = "/jsp/ss/admin/mo_ss_admin_12110_l.jsp";
                       break;
               case SSAdminWBMapping.ADMIN_12120:		//관리자-모바일관리-로그인승인 상세_모바일용
                  	wb12100 = new SSAdmin12100WB();
                  	wb12100.mo_detailMoAplc(req, res);
                      nextPage = "/jsp/ss/admin/mo_ss_admin_12120_s.jsp";
                      break;
               case SSAdminWBMapping.ADMIN_12130:		//관리자-모바일관리-로그인승인 담당승인,수정,비밀번호초기화_모바일용
                 	wb12100 = new SSAdmin12100WB();
                 	wb12100.mo_updateMoAplc(req, res);
                     nextPage = "/jsp/ss/admin/mo_ss_admin_12130_i.jsp";
                     break;



            default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
        return nextPage;
    }
}
