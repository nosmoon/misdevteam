<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.se.ang.rec.*
	,	chosun.ciis.se.ang.ds.*
	,	org.json.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SE_ANG_1020_LDataSet ds = (SE_ANG_1020_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = 0;
	String errcode = ds.errcode;
	String errmsg  = ds.errmsg;
	gridData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_ANG_1020_LCURLISTRecord rec = (SE_ANG_1020_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "part_cd", rec.part_cd);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "area_cd", rec.area_cd);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_cd", rec.bo_cd);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "bo_seq", rec.bo_seq);
			rx.add(record, "qty", rec.qty);
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_dt", rec.chg_dt);
		}
		rx.add(gridData, "totalcnt", ds.curlist.size());
	}
	catch (Exception e) {
	}
	finally {
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
<% /* 작성시간 : Mon Sep 18 16:41:54 KST 2017 */ %>