<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.dep.rec.*
	,	chosun.ciis.ad.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_DEP_3430_LDataSet ds = (AD_DEP_3430_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData3", "");;
	
	//변수선언//
	long tot1 = 0;
	long tot2 = 0;
	long tot3 = 0;
	long tot4 = 0;
	long all_tot = 0;
	//변수선언//
	
	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_DEP_3430_LCURLISTRecord rec = (AD_DEP_3430_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "misu_amt1", "0".equals(rec.misu_amt1) ? "" : rec.misu_amt1);
			tot1 = tot1 + Long.parseLong("".equals(rec.misu_amt1) ? "0" : rec.misu_amt1);
			rx.add(record, "misu_amt2", "0".equals(rec.misu_amt2) ? "" : rec.misu_amt2);
			tot2 = tot2 + Long.parseLong("".equals(rec.misu_amt2) ? "0" : rec.misu_amt2);
			rx.add(record, "misu_amt3", "0".equals(rec.misu_amt3) ? "" : rec.misu_amt3);
			tot3 = tot3 + Long.parseLong("".equals(rec.misu_amt3) ? "0" : rec.misu_amt3);
			rx.add(record, "misu_amt4", "0".equals(rec.misu_amt4) ? "" : rec.misu_amt4);
			tot4 = tot4 + Long.parseLong("".equals(rec.misu_amt4) ? "0" : rec.misu_amt4);
			rx.add(record, "tot", "0".equals(rec.tot) ? "" : rec.tot);
			all_tot = all_tot + Long.parseLong("".equals(rec.tot) ? "0" : rec.tot);			
		}
		/****** CURLIST END */
		int record = rx.add(gridData, "record", "");
		rx.add(record, "cd_nm", "합    계");
		rx.add(record, "misu_amt1", tot1);
		rx.add(record, "misu_amt2", tot2);
		rx.add(record, "misu_amt3", tot3);
		rx.add(record, "misu_amt4", tot4);
		rx.add(record, "tot", all_tot);
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
			<cd_nm/>
			<misu_amt1/>
			<misu_amt2/>
			<misu_amt3/>
			<misu_amt4/>
			<tot/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Apr 14 15:28:40 KST 2009 */ %>