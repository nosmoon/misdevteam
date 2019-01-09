<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.prtexec.rec.*
	,	chosun.ciis.pr.prtexec.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PRTEXEC_1200_LDataSet ds = (PR_PRTEXEC_1200_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PRTEXEC_1200_LCURLISTRecord rec = (PR_PRTEXEC_1200_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "ecnt", rec.ecnt);
			rx.add(record, "avg_prt_bgn", rec.avg_prt_bgn);
			rx.add(record, "avg_prt_end", rec.avg_prt_end);
			rx.add(record, "avg_rmsg", rec.avg_rmsg);
			rx.add(record, "avg_off_plat", rec.avg_off_plat);
			rx.add(record, "avg_off_plat_end", rec.avg_off_plat_end);
			rx.add(record, "avg_qty", rec.avg_qty);
			rx.add(record, "avg_real_prt_qty", rec.avg_real_prt_qty);
		}
		/****** CURLIST END */

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
			<fac_clsf/>
			<fac_clsf_nm/>
			<ecnt/>
			<avg_prt_bgn/>
			<avg_prt_end/>
			<avg_rmsg/>
			<avg_off_plat/>
			<avg_off_plat_end/>
			<avg_qty/>
			<avg_real_prt_qty/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sat Jun 06 18:09:40 KST 2009 */ %>