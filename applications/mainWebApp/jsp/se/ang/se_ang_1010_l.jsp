<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.ang.ds.*
	,	chosun.ciis.se.ang.rec.*
	,	org.json.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_ang_1010_l.jsp
* 기능 : 
* 작성일자 : 
* 작성자 : 
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	//-----------------------------------------
	// ** XML 생성하는 로직은 기존 그대로 사용함 **
	//-----------------------------------------
	
	RwXml rx = new RwXml();
	SE_ANG_1010_LDataSet ds = (SE_ANG_1010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	int recordSet = 0; 
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		int teamlist = rx.add(comboSet, "teamlist", "");
		for(int i = 0; i < ds.team_cdcur.size(); i++) {
			SE_ANG_1010_LTEAM_CDCURRecord rec = (SE_ANG_1010_LTEAM_CDCURRecord)ds.team_cdcur.get(i);
			int record = rx.add(teamlist, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);  		//부서코드
			rx.add(record, "dept_nm", rec.dept_nm);			//부서명
		}
		int partlist_temp = rx.add(comboSet, "partlist", "");
		for(int i = 0; i < ds.part_cdcur.size(); i++) {
			SE_ANG_1010_LPART_CDCURRecord rec = (SE_ANG_1010_LPART_CDCURRecord)ds.part_cdcur.get(i);
			int record = rx.add(partlist_temp, "record", "");
			rx.add(record, "dept_cd"		, rec.dept_cd);  		//부서코드
			rx.add(record, "dept_nm"		, rec.dept_nm);			//부서명
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);	//상위부서코드
		}
		int arealist_temp = rx.add(comboSet, "arealist", "");
		for(int i = 0; i < ds.area_cdcur.size(); i++) {
			SE_ANG_1010_LAREA_CDCURRecord rec = (SE_ANG_1010_LAREA_CDCURRecord)ds.area_cdcur.get(i);
			int record = rx.add(arealist_temp, "record", "");
			rx.add(record, "area_cd"		, rec.area_cd);  		//지역코드
			rx.add(record, "area_nm"		, rec.area_nm);			//지역코드명
			rx.add(record, "dept_cd"		, rec.dept_cd);			//부서코드
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);    //상위부서코드
		}
		
	} catch (Exception e) {
	} finally {
	
		//-----------------------------------------
		// *기존: 생성된 XML 자체를  내보내는 방식은 막음
		//-----------------------------------------
		//out.println(rx.xmlFlush());
		//out.println(rx.xmlEndFlush());


		//-----------------------------------------
		// *신규: 생성된 XML을 JSON형태로 전환하여 내보냄
		//-----------------------------------------
		JSONObject obj = XML.toJSONObject(rx.getXml());
		out.println(obj.toString());
		out.println(rx.xmlEndFlush());
	}


%>
