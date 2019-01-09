<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.res.rec.*
	,	chosun.ciis.ad.res.ds.*
	,	chosun.ciis.co.base.util.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_RES_1250_LDataSet ds = (AD_RES_1250_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_RES_1250_LCURLISTRecord rec = (AD_RES_1250_LCURLISTRecord)ds.curlist.get(i);
			
			int record = rx.add(gridData, "record", "");
			rx.add(record, "pubc_occr_dt", rec.pubc_occr_dt);
			rx.add(record, "pubc_occr_seq", rec.pubc_occr_seq);
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "dlco_nm", rec.dlco_nm); 
			rx.add(record, "medi_cd", rec.medi_cd); 
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