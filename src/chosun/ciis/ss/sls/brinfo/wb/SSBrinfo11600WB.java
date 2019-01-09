/***************************************************************************************************
* 파일명 : SSBrinfo1600WB.java
* 기능 : 지국Info-발송노선을 위한 Worker Bean
 * 작성일자 : 2004-04-01
 * 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국Info-발송노선을 위한 Worker Bean
 */

public class SSBrinfo11600WB{


    /**
     * 지국Info-발송노선(발차노선조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void mo_selectBsnsList(HttpServletRequest req, HttpServletResponse res) throws AppException{ //모바일용
    	SS_MO_L_BSNSDataSet ds = null;

         // parameter requesting 하고  DM에 값을 Setting
        String bocd = Util.checkString(req.getParameter("bocd"));    					    //지국지사코드
        String areacd = Util.checkString(req.getParameter("areacd"));	     		//지역코드
		String sendplacnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sendplacnm")));			//노선명
		String route_clsf = Util.checkString(req.getParameter("route_clsf"));
		String fromdate = Util.checkString(req.getParameter("fromdate"));			//조회 시작일자
        String todate = Util.checkString(req.getParameter("todate"));				//조회 종료일자

        SS_MO_L_BSNSDM dm = new SS_MO_L_BSNSDM();

        dm.setBocd(bocd);
        dm.setAreacd(areacd);
        dm.setSendplacnm(sendplacnm);
        dm.setRoute_clsf(route_clsf);
        dm.setFromdate(fromdate);
        dm.setTodate(todate);

        SSBrinfo11600DAO dao = new SSBrinfo11600DAO();
        // DAO 객체의 selectBsnsList 호출
        ds = dao.mo_selectBsnsList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding

    }

    /**
     * 지국Info-발송노선(발차노선조회_센터별상세)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void mo_selectBsnsDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{ //모바일용
    	SS_MO_S_BSNSDataSet ds = null;

         // parameter requesting 하고  DM에 값을 Setting
    	String areacd = Util.checkString(req.getParameter("areacd"));
    	String route_clsf = Util.checkString(req.getParameter("route_clsf"));
    	String fromdate = Util.checkString(req.getParameter("fromdate"));
    	String todate = Util.checkString(req.getParameter("todate"));
    	String bocd = Util.checkString(req.getParameter("bocd"));
    	String send_plac_seq = Util.checkString(req.getParameter("send_plac_seq"));

        SS_MO_S_BSNSDM dm = new SS_MO_S_BSNSDM();

        dm.setAreacd(areacd);
        dm.setRoute_clsf(route_clsf);
        dm.setFromdate(fromdate);
        dm.setTodate(todate);
        dm.setBocd(bocd);
        dm.setSend_plac_seq(send_plac_seq);

        SSBrinfo11600DAO dao = new SSBrinfo11600DAO();
        // DAO 객체의 selectBsnsList 호출
        ds = dao.mo_selectBsnsDetail(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding

    }


}
