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
	SE_ANG_1040_MDataSet ds = (SE_ANG_1040_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		recordSet = rx.add(dataSet, "bo_cdcur", "");

		for(int i = 0; i < ds.bo_cdcur.size(); i++) {
			SE_ANG_1040_MBO_CDCURRecord rec = (SE_ANG_1040_MBO_CDCURRecord)ds.bo_cdcur.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "bocd", rec.bocd);
			rx.add(record, "bonm", rec.bonm);
		}
		rx.add(recordSet, "totalcnt", ds.bo_cdcur.size());


		recordSet = rx.add(dataSet, "clamtmthd_cdcur", "");

		for(int i = 0; i < ds.clamtmthd_cdcur.size(); i++) {
			SE_ANG_1040_MCLAMTMTHD_CDCURRecord rec = (SE_ANG_1040_MCLAMTMTHD_CDCURRecord)ds.clamtmthd_cdcur.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		rx.add(recordSet, "totalcnt", ds.clamtmthd_cdcur.size());

		recordSet = rx.add(dataSet, "medi_cdcur", "");

		for(int i = 0; i < ds.medi_cdcur.size(); i++) {
			SE_ANG_1040_MMEDI_CDCURRecord rec = (SE_ANG_1040_MMEDI_CDCURRecord)ds.medi_cdcur.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		rx.add(recordSet, "totalcnt", ds.medi_cdcur.size());
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
		System.out.println(errmsg);
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
		
		//System.out.println(obj.toString());
	}

%>

<% /* 작성시간 : Tue Oct 31 13:58:41 KST 2017 */ %>