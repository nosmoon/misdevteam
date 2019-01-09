/***************************************************************************************************
 * 파일명 : 
 * 기능 : 
 * 작성일자 : 
 * 작성자 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.hd.info.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.hd.info.wb.HD_INFO_1000WB;
import chosun.ciis.hd.info.wb.HD_INFO_2000WB;
import chosun.ciis.hd.info.wb.HD_INFO_3000WB;
import chosun.ciis.hd.info.wb.HD_INFO_4000WB;
import chosun.ciis.hd.info.wb.HD_INFO_5000WB;
import chosun.ciis.hd.info.wb.HD_INFO_7000WB;
import chosun.ciis.co.base.servlet.BaseServlet;

public class HDInfoServlet extends BaseServlet {


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
        String requestURI = null;
        String strPid = null;
        int iPid = 0;
        String nextPage = null;
        try {
            String servletMappedUrl = "/hd/info/";
            iPid = extractPid(req, servletMappedUrl);
            
            System.out.println("HDInfoServlet : process : iPid : " + iPid);
            nextPage = executeWorker(req, res, iPid);
            System.out.println("HDInfoServlet : process : nextPage : " + nextPage);
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
     * SEBasWBMapping.java 에 정의된 상수에 따라 분기하여 Worker Bean을 생성하고,<br>
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
        HD_INFO_1000WB wb = null;
        HD_INFO_2000WB wb_2000 = null;
        HD_INFO_3000WB wb_3000 = null;
        HD_INFO_4000WB wb_4000 = null;
        HD_INFO_5000WB wb_5000 = null;
        
        
       
        HD_INFO_7000WB wb_7000;
		switch (pid) {
        	case HDInfoWBMapping.HD_INFO_2404_L:
        		wb_2000 = new HD_INFO_2000WB();
				wb_2000.hd_info_2404_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_2404_l.jsp";
			break;
	        case HDInfoWBMapping.HD_INFO_6000_L:
				wb = new HD_INFO_1000WB();
				wb.hd_info_6000_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_6000_l.jsp";
			break;
	        case HDInfoWBMapping.HD_INFO_6010_L:
				wb = new HD_INFO_1000WB();
				System.out.print("11111");
				wb.hd_info_6010_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_6010_l.jsp";
				
			break;
	        case HDInfoWBMapping.HD_INFO_6001:
				wb = new HD_INFO_1000WB();
				wb.hd_info_6001_m(req, res);
				nextPage = "/jsp/hd/info/hd_info_6001_m.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_1000:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1000(req, res);
        		nextPage = "/jsp/hd/info/hd_info_1000_l.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1001:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1001(req, res);
        		nextPage = "/jsp/hd/info/hd_info_1001_l.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1002:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1002(req, res);
        		nextPage = "/jsp/hd/info/hd_info_1002_s.jsp";
        		break;
			case HDInfoWBMapping.HD_INFO_1003:
				wb = new HD_INFO_1000WB();
				wb.hd_info_1003_a(req, res);
				nextPage = "/jsp/hd/info/hd_info_1003_a.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_1004:
				wb = new HD_INFO_1000WB();
				wb.hd_info_1004_s(req, res);
				nextPage = "/jsp/hd/info/hd_info_1004_s.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_1005:
				wb = new HD_INFO_1000WB();
				wb.hd_info_1005_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_1005_l.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_1006_L:
				wb = new HD_INFO_1000WB();
				wb.hd_info_1006_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_1006_l.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_1008:
				wb = new HD_INFO_1000WB();
				wb.hd_info_1008_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_1008_l.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_1009:
				wb = new HD_INFO_1000WB();
				wb.hd_info_1009_A(req, res);
				nextPage = "/jsp/hd/info/hd_info_1009_a.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_1007_A:
				wb = new HD_INFO_1000WB();
				wb.hd_info_1007_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_1010:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1010(req, res);
        		nextPage = "/jsp/hd/info/hd_info_1010_l.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1011:
        		System.out.print("아놔");
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1011(req, res);
        		nextPage = "/jsp/hd/info/hd_info_1011_l.jsp";
        		break;
			case HDInfoWBMapping.HD_INFO_1012:
				wb = new HD_INFO_1000WB();
				((HD_INFO_1000WB)wb).hd_info_1012_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_1013:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1013(req, res);
        		nextPage = "/jsp/hd/info/hd_info_1013_l.jsp";
        		break;
			case HDInfoWBMapping.HD_INFO_1014:
				wb = new HD_INFO_1000WB();
				wb.hd_info_1014_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_1014_l.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_1015:
				wb = new HD_INFO_1000WB();
				((HD_INFO_1000WB)wb).hd_info_1015_m(req, res);
				nextPage = "/jsp/hd/info/hd_info_1015_m.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_1020:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1020(req, res);
        		nextPage = "/jsp/hd/info/hd_info_1020_l.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1021:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1021(req, res);
        		nextPage = "/jsp/hd/info/hd_info_1021_l.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1022:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1022(req, res);
        		nextPage = "/jsp/hd/info/hd_info_1022_l.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1023:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1023(req, res);
        		nextPage = "/jsp/hd/info/hd_info_1023_l.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1024:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1024_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1025:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1025_u(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
			case HDInfoWBMapping.HD_INFO_1026:
				wb = new HD_INFO_1000WB();
				wb.hd_info_1026_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_1026_l.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_1027:
				wb = new HD_INFO_1000WB();
				wb.hd_info_1027_m(req, res);
				nextPage = "/jsp/hd/info/hd_info_1027_m.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_1031:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1031(req, res);
        		nextPage = "/jsp/hd/info/hd_info_1031_l.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1032:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1032(req, res);
        		nextPage = "/jsp/hd/info/hd_info_1032_l.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1033:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1033_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1040:
				wb = new HD_INFO_1000WB();
				wb.hd_info_1040_m(req, res);
				nextPage = "/jsp/hd/info/hd_info_1040_m.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_1041:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1041(req, res);
        		nextPage = "/jsp/hd/info/hd_info_1041_l.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1042:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1042(req, res);
        		nextPage = "/jsp/hd/info/hd_info_1042_l.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1043:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1043_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1050:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1050_l(req, res);
        		nextPage = "/jsp/hd/info/hd_info_1050_l.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1051:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1051(req, res);
        		nextPage = "/jsp/hd/info/hd_info_1051_l.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1052:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1052(req, res);
        		nextPage = "/jsp/hd/info/hd_info_1052_l.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1053:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1053_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1054:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1054_l(req, res);
        		nextPage = "/jsp/hd/info/hd_info_1054_l.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1060:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1060_l(req, res);
        		nextPage = "/jsp/hd/info/hd_info_1060_l.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1061:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1061_l(req, res);
        		nextPage = "/jsp/hd/info/hd_info_1061_l.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1062:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1062_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1070:
				wb = new HD_INFO_1000WB();
				wb.hd_info_1070_m(req, res);
				nextPage = "/jsp/hd/info/hd_info_1070_m.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_1071:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1071(req, res);
        		nextPage = "/jsp/hd/info/hd_info_1071_l.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1072:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1072_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
			case HDInfoWBMapping.HD_INFO_1080:
				wb = new HD_INFO_1000WB();
				wb.hd_info_1080_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_1080_l.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_1081:
				wb = new HD_INFO_1000WB();
				wb.hd_info_1081_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_1081_l.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_1082:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1082_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
			case HDInfoWBMapping.HD_INFO_1083:
				wb = new HD_INFO_1000WB();
				wb.hd_info_1083_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_1083_l.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_1084:
				wb = new HD_INFO_1000WB();
				wb.hd_info_1084_m(req, res);
				nextPage = "/jsp/hd/info/hd_info_1084_m.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_1090:
				wb = new HD_INFO_1000WB();
				wb.hd_info_1090_m(req, res);
				nextPage = "/jsp/hd/info/hd_info_1090_m.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_1091:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1091(req, res);
        		nextPage = "/jsp/hd/info/hd_info_1091_l.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1092:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1092_l(req, res);
        		nextPage = "/jsp/hd/info/hd_info_1092_l.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1093:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1093_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_1100:
				wb = new HD_INFO_1000WB();
				wb.hd_info_1100_m(req, res);
				nextPage = "/jsp/hd/info/hd_info_1100_m.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_1110:
				wb = new HD_INFO_1000WB();
				wb.hd_info_1110_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_1110_l.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_1120:
				wb = new HD_INFO_1000WB();
				wb.hd_info_1120_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_1120_l.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_1180:
        		wb = new HD_INFO_1000WB();
        		wb.hd_info_1180_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";		
        		break;
			case HDInfoWBMapping.HD_INFO_2000:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2000_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_2000_l.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_2001:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2001_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_2001_l.jsp";
				break;	
			case HDInfoWBMapping.HD_INFO_2002:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2002_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_2003:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2003_a(req, res);
        		//nextPage = "/common/jsp/resultMsg.jsp";
				nextPage = "/jsp/hd/info/hd_info_2003_a.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_2004:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2004_a(req, res);
        		//nextPage = "/common/jsp/resultMsg.jsp";
				nextPage = "/jsp/hd/info/hd_info_2004_a.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_2006:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2006_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_2100:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2100_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_2100_l.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_2101:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2101_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_2102:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2102_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_2102_l.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_2103:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2103_u(req, res);
				nextPage = "/jsp/hd/info/hd_info_2103_u.jsp";
        		//nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_2104:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2104_m(req, res);
				nextPage = "/jsp/hd/info/hd_info_2104_m.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_2500:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2500_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_2500_l.jsp";
				break;	
			case HDInfoWBMapping.HD_INFO_2600:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2600_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_2600_l.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_2601:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2601_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_2602:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2602_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_2602_l.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_2200:
        		wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2200_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_2200_l.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_2201:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2201_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_2201_l.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_2202:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2202_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_2202_l.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_2203:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2203_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_2204:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2204_m(req, res);
				nextPage = "/jsp/hd/info/hd_info_2204_m.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_2300:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2300_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_2300_l.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_2301:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2301_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_2302:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2302_m(req, res);
				nextPage = "/jsp/hd/info/hd_info_2302_m.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_2400:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2400_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_2401:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2401_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_2401_l.jsp";
				break;
			case HDInfoWBMapping.HD_INFO_2402:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2402_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_2402_l.jsp";
				break;	
			case HDInfoWBMapping.HD_INFO_2403:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2403_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_2403_l.jsp";
				break;	
			case HDInfoWBMapping.HD_INFO_2405:
				wb_2000 = new HD_INFO_2000WB();
				((HD_INFO_2000WB)wb_2000).hd_info_2405_m(req, res);
				nextPage = "/jsp/hd/info/hd_info_2405_m.jsp";
				break;	
				
        	case HDInfoWBMapping.HD_INFO_3000:
				wb_3000 = new HD_INFO_3000WB();
				((HD_INFO_3000WB)wb_3000).hd_info_3000_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_3000_l.jsp";
				break;	
        	case HDInfoWBMapping.HD_INFO_3001:
        		wb_3000 = new HD_INFO_3000WB();
        		((HD_INFO_3000WB)wb_3000).hd_info_3001_m(req, res);
        		nextPage = "/jsp/hd/info/hd_info_3001_m.jsp";
        		break;	
        	case HDInfoWBMapping.HD_INFO_3010:
				wb_3000 = new HD_INFO_3000WB();
				((HD_INFO_3000WB)wb_3000).hd_info_3010_s(req, res);
				nextPage = "/jsp/hd/info/hd_info_3010_s.jsp";
				break;		
        	case HDInfoWBMapping.HD_INFO_3020:
				wb_3000 = new HD_INFO_3000WB();
				((HD_INFO_3000WB)wb_3000).hd_info_3020_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
				
				
        	case HDInfoWBMapping.HD_INFO_4000:
				wb_4000 = new HD_INFO_4000WB();
				((HD_INFO_4000WB)wb_4000).hd_info_4000_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
        	case HDInfoWBMapping.HD_INFO_4020:
				wb_4000 = new HD_INFO_4000WB();
				((HD_INFO_4000WB)wb_4000).hd_info_4020_m(req, res);
				nextPage = "/jsp/hd/info/hd_info_4020_m.jsp";
				break;	
				
        	case HDInfoWBMapping.HD_INFO_5210:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5210_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_5210_l.jsp";
				break;	
        	case HDInfoWBMapping.HD_INFO_5211:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5211_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_5211_l.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_5212:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5212_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_5212_l.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_5213:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5213_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
        	case HDInfoWBMapping.HD_INFO_5214:
        		wb_5000 = new HD_INFO_5000WB();
        		((HD_INFO_5000WB)wb_5000).hd_info_5214_m(req, res);
        		nextPage = "/jsp/hd/info/hd_info_5214_m.jsp";
        		break;	
        	case HDInfoWBMapping.HD_INFO_5220:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5220_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_5220_l.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_5221:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5221_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_5221_l.jsp";
				break;	
        	case HDInfoWBMapping.HD_INFO_5222:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5222_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
        	case HDInfoWBMapping.HD_INFO_5223:
        		wb_5000 = new HD_INFO_5000WB();
        		((HD_INFO_5000WB)wb_5000).hd_info_5223_m(req, res);
        		nextPage = "/jsp/hd/info/hd_info_5223_m.jsp";
        		break;	
        	case HDInfoWBMapping.HD_INFO_5230:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5230_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_5230_l.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_5231:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5231_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_5231_l.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_5232:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5232_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
        	case HDInfoWBMapping.HD_INFO_5233:
        		wb_5000 = new HD_INFO_5000WB();
        		((HD_INFO_5000WB)wb_5000).hd_info_5233_m(req, res);
        		nextPage = "/jsp/hd/info/hd_info_5233_m.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_5240:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5240_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_5240_l.jsp";
				break;	
        	case HDInfoWBMapping.HD_INFO_5241:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5241_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_5241_l.jsp";
				break;	
        	case HDInfoWBMapping.HD_INFO_5250:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5250_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_5250_l.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_5242:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5242_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_5242_l.jsp";
				break;	
        	case HDInfoWBMapping.HD_INFO_5243:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5243_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
        	case HDInfoWBMapping.HD_INFO_5244:
        		wb_5000 = new HD_INFO_5000WB();
        		((HD_INFO_5000WB)wb_5000).hd_info_5244_m(req, res);
        		nextPage = "/jsp/hd/info/hd_info_5244_m.jsp";
        		break;	
        	case HDInfoWBMapping.HD_INFO_5251:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5251_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_5251_l.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_5252:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5252_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_5252_l.jsp";
				break;	
        	case HDInfoWBMapping.HD_INFO_5253:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5253_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
        	case HDInfoWBMapping.HD_INFO_5254:
        		wb_5000 = new HD_INFO_5000WB();
        		((HD_INFO_5000WB)wb_5000).hd_info_5254_m(req, res);
        		nextPage = "/jsp/hd/info/hd_info_5254_m.jsp";
        		break;	
        	case HDInfoWBMapping.HD_INFO_5260:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5260_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_5260_l.jsp";
				break;	
        	case HDInfoWBMapping.HD_INFO_5261:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5261_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_5261_l.jsp";
				break;				
        	case HDInfoWBMapping.HD_INFO_5262:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5262_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_5262_l.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_5263:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5263_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_5264:
        		wb_5000 = new HD_INFO_5000WB();
        		((HD_INFO_5000WB)wb_5000).hd_info_5264_m(req, res);
        		nextPage = "/jsp/hd/info/hd_info_5264_m.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_5300:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5300_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_5300_l.jsp";
				break;		
        	case HDInfoWBMapping.HD_INFO_5301:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5301_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_5301_l.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_5302:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5302_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
        	case HDInfoWBMapping.HD_INFO_5303:
        		wb_5000 = new HD_INFO_5000WB();
        		((HD_INFO_5000WB)wb_5000).hd_info_5303_m(req, res);
        		nextPage = "/jsp/hd/info/hd_info_5303_m.jsp";
        		break;	
        	case HDInfoWBMapping.HD_INFO_5100:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5100_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;	
        	case HDInfoWBMapping.HD_INFO_5101:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_5101_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_5101_l.jsp";
				break;	
        	case HDInfoWBMapping.HD_INFO_7000:
        		wb_5000 = new HD_INFO_5000WB();
        		((HD_INFO_5000WB)wb_5000).hd_info_7000_l(req, res);
        		nextPage = "/jsp/hd/info/hd_info_7000_l.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_7001:
        		wb_5000 = new HD_INFO_5000WB();
        		((HD_INFO_5000WB)wb_5000).hd_info_7001_a(req, res);
        		nextPage = "/common/jsp/resultMsg.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_7002:
        		wb_5000 = new HD_INFO_5000WB();
        		((HD_INFO_5000WB)wb_5000).hd_info_7002_l(req, res);
        		nextPage = "/jsp/hd/info/hd_info_7002_l.jsp";
        		break;
        	case HDInfoWBMapping.HD_INFO_7010:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_7010_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_7010_l.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_7012:
        		wb_5000 = new HD_INFO_5000WB();
				((HD_INFO_5000WB)wb_5000).hd_info_7012_m(req, res);
				nextPage = "/jsp/hd/info/hd_info_7012_m.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_7100:
        		wb_7000 = new HD_INFO_7000WB();
				((HD_INFO_7000WB)wb_7000).hd_info_7100_m(req, res);
				nextPage = "/jsp/hd/info/hd_info_7100_m.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_7110:
        		wb_7000 = new HD_INFO_7000WB();
				((HD_INFO_7000WB)wb_7000).hd_info_7110_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_7110_l.jsp";
				break;
				
         	case HDInfoWBMapping.HD_INFO_7130:
        		wb_7000 = new HD_INFO_7000WB();
				((HD_INFO_7000WB)wb_7000).hd_info_7130_a(req, res);
				nextPage = "/jsp/hd/info/hd_info_7130_a.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_7140:
        		wb_7000 = new HD_INFO_7000WB();
				((HD_INFO_7000WB)wb_7000).hd_info_7140_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_7150:
        		wb_7000 = new HD_INFO_7000WB();
				((HD_INFO_7000WB)wb_7000).hd_info_7150_s(req, res);
				nextPage = "/jsp/hd/info/hd_info_7150_s.jsp";
				break;
				
        	case HDInfoWBMapping.HD_INFO_7120:
        		wb_7000 = new HD_INFO_7000WB();
				((HD_INFO_7000WB)wb_7000).hd_info_7120_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_7120_l.jsp";
				break;
         	case HDInfoWBMapping.HD_INFO_7200:
        		wb_7000 = new HD_INFO_7000WB();
				((HD_INFO_7000WB)wb_7000).hd_info_7200_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_7200_l.jsp";
				break;
         	case HDInfoWBMapping.HD_INFO_7201:
        		wb_7000 = new HD_INFO_7000WB();
				((HD_INFO_7000WB)wb_7000).hd_info_7201_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_7202:
        		wb_7000 = new HD_INFO_7000WB();
				((HD_INFO_7000WB)wb_7000).hd_info_7202_l(req, res);
				nextPage = "/jsp/hd/info/hd_info_7202_l.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_7203:
        		wb_7000 = new HD_INFO_7000WB();
				((HD_INFO_7000WB)wb_7000).hd_info_7203_m(req, res);
				nextPage = "/jsp/hd/info/hd_info_7203_m.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_7204:
        		wb_7000 = new HD_INFO_7000WB();
				((HD_INFO_7000WB)wb_7000).hd_info_7204_a(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_7206:
        		wb_7000 = new HD_INFO_7000WB();
				((HD_INFO_7000WB)wb_7000).hd_info_7206_a(req, res);
				nextPage = "/jsp/hd/info/hd_info_7206_a.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_7207:
        		wb_7000 = new HD_INFO_7000WB();
				((HD_INFO_7000WB)wb_7000).hd_info_7207_d(req, res);
				nextPage = "/common/jsp/resultMsg.jsp";
				break;
        	case HDInfoWBMapping.HD_INFO_7208:
        		wb_7000 = new HD_INFO_7000WB();
				((HD_INFO_7000WB)wb_7000).hd_info_7208_m(req, res);
				nextPage = "/jsp/hd/info/hd_info_7208_m.jsp";
				break;
        	default:
                throw new SysException(new Exception("요청한 페이지를 찾을 수 없습니다."));
        }
       
        return nextPage;
    }
}
