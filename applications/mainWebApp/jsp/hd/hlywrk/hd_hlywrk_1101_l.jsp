<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.hlywrk.rec.*
	,	chosun.ciis.hd.hlywrk.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_HLYWRK_1101_LDataSet ds = (HD_HLYWRK_1101_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int depth1 = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
//ALVC_USE_YN
		depth1 = rx.add(dataSet, "alvc_use_yn", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_HLYWRK_1101_LCURLISTRecord rec = (HD_HLYWRK_1101_LCURLISTRecord)ds.curlist.get(i);
			if ("ALVC_USE_YN".equals(rec.getCd_type()) && !rec.getCd().equals("30")){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(dataSet, "hody_clsf", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_HLYWRK_1101_LCURLISTRecord rec = (HD_HLYWRK_1101_LCURLISTRecord)ds.curlist.get(i);
			if ("HODY_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
	
	
		depth1 = rx.add(dataSet, "finish_dd_clsf", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_HLYWRK_1101_LCURLISTRecord rec = (HD_HLYWRK_1101_LCURLISTRecord)ds.curlist.get(i);
			if ("FINISH_DD_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<cd_type/>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Apr 20 11:23:31 KST 2009 */ %>