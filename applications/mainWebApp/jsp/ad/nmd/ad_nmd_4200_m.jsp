<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.nmd.rec.*
	,	chosun.ciis.ad.nmd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_NMD_4200_MDataSet ds = (AD_NMD_4200_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
//	int resData = rx.add(root, "resData", "");

	try {
	
		int gridData = rx.add(root, "gridData", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_NMD_4200_MCURLISTRecord rec = (AD_NMD_4200_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "sun", rec.sun);
			rx.add(record, "sun_yn", rec.sun_yn);
			rx.add(record, "mon", rec.mon);
			rx.add(record, "mon_yn", rec.mon_yn);
			rx.add(record, "tue", rec.tue);
			rx.add(record, "tue_yn", rec.tue_yn);
			rx.add(record, "wed", rec.wed);
			rx.add(record, "wed_yn", rec.wed_yn);
			rx.add(record, "thr", rec.thr);
			rx.add(record, "thr_yn", rec.thr_yn);
			rx.add(record, "fri", rec.fri);
			rx.add(record, "fri_yn", rec.fri_yn);
			rx.add(record, "sat", rec.sat);
			rx.add(record, "sat_yn", rec.sat_yn);
		}
		
	}
	catch (Exception e) {
	}
	finally {
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
			<sun/>
			<mon/>
			<tue/>
			<wed/>
			<thr/>
			<fri/>
			<sat/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>