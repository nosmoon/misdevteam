/***************************************************************************************************
 * 파일명 : SSAdmin12100WB.java_모바일용
 * 기능 : 관리자-모바일로그인 담당승인을 위한 Worker Bean_모바일용
 * 작성일자 : 2017-01-23
 * 작성자 :  장선희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.admin.wb;

import javax.ejb.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.rmi.*;

import javax.servlet.http.*;

import org.json.JSONObject;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.dao.*;
import oracle.sql.*;

/**
 * 관리자-모바일로그인 담당승인을 위한 Worker Bean_모바일용
 */

public class SSAdmin12100WB {

	//모바일관리-로그인승인 초기
    public void mo_initMoAplc(HttpServletRequest req, HttpServletResponse res) throws AppException {


        // Request Parameter Processing
    	String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
    	String auth_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("auth_gb")));
    	String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
    	String base_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("base_dt")));

        // DM Setting
    	SS_MO_L_LOGINAPLC_INITDM dm = new SS_MO_L_LOGINAPLC_INITDM();

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setAuth_gb(auth_gb);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setBase_dt(base_dt);

        dm.print();

    	SS_MO_L_LOGINAPLC_INITDataSet ds = null;

        SSAdmin12100DAO dao = new SSAdmin12100DAO();
        ds = dao.mo_initMoAplc(dm);
        req.setAttribute("ds", ds);
    }


	//모바일관리-로그인승인 조회
    public void mo_selectMoAplc(HttpServletRequest req, HttpServletResponse res) throws AppException { //모바일용

        // Request Parameter Processing
    	String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
    	String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
    	String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
    	String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
    	String bonm = Util.Uni2Ksc(Util.checkString(req.getParameter("bonm")));
		String maprvstatcd = Util.checkString(req.getParameter("maprvstatcd"));
    	String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
    	String boemp_id = Util.Uni2Ksc(Util.checkString(req.getParameter("boemp_id")));
    	String ptph = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph")));
    	String dutycd = Util.checkString(req.getParameter("dutycd"));
    	String mblockyn = Util.checkString(req.getParameter("mblockyn"));
    	String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
    	String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));

		pageno = ("".equals(pageno)) ? "1" : pageno;
		pagesize = ("".equals(pagesize)) ? "5000" : pagesize;

        // DM Setting
		SS_MO_L_LOGINAPLC_APRVDM dm = new SS_MO_L_LOGINAPLC_APRVDM();

		dm.setDeptcd(deptcd);
		dm.setPartcd(partcd);
		dm.setAreacd(areacd);
		dm.setBocd(bocd);
		dm.setBonm(bonm);
		dm.setMaprvstatcd(maprvstatcd);
		dm.setFlnm(flnm);
		dm.setBoemp_id(boemp_id);
		dm.setPtph(ptph);
		dm.setDutycd(dutycd);
		dm.setMblockyn(mblockyn);
    	dm.setPageno(Long.parseLong((pageno)));
    	dm.setPagesize(Long.parseLong((pagesize)));
        dm.print();

        SS_MO_L_LOGINAPLC_APRVDataSet ds = null;

        SSAdmin12100DAO dao = new SSAdmin12100DAO();
        ds = dao.mo_selectMoAplc(dm);
        req.setAttribute("ds", ds);
    }

	//모바일관리-로그인승인 상세
    public void mo_detailMoAplc(HttpServletRequest req, HttpServletResponse res) throws AppException {

        // Request Parameter Processing
    	String bocd = Util.checkString(req.getParameter("bocd"));
    	String boemp_no = Util.checkString(req.getParameter("boemp_no"));
    	String boemp_id = Util.checkString(req.getParameter("boemp_id"));


        // DM Setting
    	SS_MO_S_LOGINAPLC_APRVDM dm = new SS_MO_S_LOGINAPLC_APRVDM();

		dm.setBocd(bocd);
		dm.setBoemp_no(boemp_no);
		dm.setBoemp_id(boemp_id);
        dm.print();

        SS_MO_S_LOGINAPLC_APRVDataSet ds = null;

        SSAdmin12100DAO dao = new SSAdmin12100DAO();
        ds = dao.mo_detailMoAplc(dm);
        req.setAttribute("ds", ds);
    }

	//모바일관리-로그인승인 담당승인, 수정, 비밀번호 초기화
    public void mo_updateMoAplc(HttpServletRequest req, HttpServletResponse res) throws AppException {

        // Request Parameter Processing
    	String bocd = Util.checkString(req.getParameter("bocd"));
    	String boemp_no = Util.checkString(req.getParameter("boemp_no"));
    	String boemp_id = Util.checkString(req.getParameter("boemp_id"));
    	String ddremk = Util.checkString(req.getParameter("ddremk"));
    	String workflag = Util.checkString(req.getParameter("workflag"));
    	String incmgpers = Util.checkString(req.getParameter("incmgpers"));

        // DM Setting
    	SS_MO_A_LOGINAPLC_APRVDM dm = new SS_MO_A_LOGINAPLC_APRVDM();

    	dm.setBocd(bocd);
    	dm.setBoemp_no(boemp_no);
    	dm.setBoemp_id(boemp_id);
    	dm.setDdremk(ddremk);
    	dm.setWorkflag(workflag);
    	dm.setIncmgpers(incmgpers);
        dm.print();

        SS_MO_A_LOGINAPLC_APRVDataSet ds = null;

        SSAdmin12100DAO dao = new SSAdmin12100DAO();
        ds = dao.mo_updateMoAplc(dm);

        //해당되는 기기에만 보냄. GCMID 가져와야 함. 2017-02-14추가
        String gcmid = ds.getGcmid();
        String errcd = ds.getErrcode();
        String errmsg = ds.getErrmsg();

        System.out.println("gcmid="+gcmid);
        System.out.println("errcd="+errcd);
        System.out.println("errmsg="+errmsg);

         //센터장 승인, 거절, 초기화할 때등록할 때 알림 보내기. / 차단일 때는 알림 보내지 않기.
        if (ds!=null && (workflag != "4" || workflag != "5")) {
        	System.out.println("SSAdmin12100WB.java");
        	String API_KEY = "AIzaSyA9_1WV0k74rUlYAwnCgEoWZzNND757BIo";

        	URL url = null;
        	HttpURLConnection conn = null;
        	OutputStream outputStream = null;
        	InputStream inputStream = null ;

            try {
            	// Prepare JSON containing the GCM message content. What to send and where to send.
                JSONObject jGcmData = new JSONObject();
                System.out.println(jGcmData.toString());
                JSONObject jData = new JSONObject();
                System.out.println(jData.toString());
                jData.put("message", "APRV");
//                jData.put("message", "EXTN"); test


                // Where to send GCM message.
                System.out.println("SSAdmin12100WB.java_APRV");
//                jGcmData.put("to", "d3LI0dS2NGk:APA91bFlpzkL-RMNZez2sykixLzLMpJFGyYR43r6KC1UfiWYe3gPHMjuUpaclLF20-djbjbl8NppOnzbw-_24Q_JH0VsifNy8K4SfUUR1SKDq7p1Mg889lUi_yDalnB5Vi6vXURUnOtv");
//                jGcmData.put("to", "/topics/19460");  test
                jGcmData.put("to", gcmid);

                // What to send in GCM message.
                jGcmData.put("data", jData);
                // Create connection to send GCM Message request.
                url = new URL("https://android.googleapis.com/gcm/send");
                conn = (HttpURLConnection) url.openConnection();
                conn.setRequestProperty("Authorization", "key=" + API_KEY);
                conn.setRequestProperty("Content-Type", "application/json");
                conn.setRequestMethod("POST");
                conn.setDoOutput(true);
                // Send GCM message content.
                outputStream = conn.getOutputStream();
                outputStream.write(jGcmData.toString().getBytes());
                // Read GCM response.
                inputStream = conn.getInputStream();
                //String resp = IOUtils.toString(inputStream);
                //System.out.println(resp);

                System.out.println("Check your device/emulator for notification or logcat for " +
                        "confirmation of the receipt of the GCM message.");
            } catch (Exception e) {
                System.out.println("Unable to send GCM message.");
                System.out.println("Please ensure that API_KEY has been replaced by the server " +
                        "API key, and that the device's registration token is correct (if specified).");
                e.printStackTrace();
            }finally{
                try {
                    if( conn != null ) conn.disconnect();
                    if( outputStream != null ) outputStream.close();
                    if( inputStream != null ) inputStream.close();
                 } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                 }
            }
        }

        req.setAttribute("ds", ds);
    }


}



