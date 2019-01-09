<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.bas.rec.*
	,	chosun.ciis.ad.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_BAS_2110_LDataSet ds = (AD_BAS_2110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_2110_LCURLISTRecord rec = (AD_BAS_2110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
		
			rx.add(record, "prfl_no", rec.prfl_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "cur_job", rec.cur_job);
			rx.add(record, "offi_tel_no", rec.offi_tel_no);
			rx.add(record, "home_tel_no", rec.home_tel_no);
			rx.add(record, "ceph_no1", rec.ceph_no1);
			rx.add(record, "email", rec.email);
			rx.add(record, "cust_mang_item", rec.cust_mang_item);
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
<gridData>
	<record>
		<prfl_no/>
		<flnm/>
		<dlco_nm/>
		<cur_job/>
		<offi_tel_no/>
		<home_tel_no/>
		<ceph_no1/>
		<email/>
		<cust_mang_item/>
	</record>
</gridData>
*/
%>

<% /* 작성시간 : Fri Jan 16 11:06:54 KST 2009 */ %>