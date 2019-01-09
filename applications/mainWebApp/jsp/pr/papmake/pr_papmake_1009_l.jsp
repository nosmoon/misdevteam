<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.papmake.rec.*
	,	chosun.ciis.pr.papmake.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PAPMAKE_1009_LDataSet ds = (PR_PAPMAKE_1009_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	recordSet = rx.add(root, "tempData", "");

	try {
		formData = rx.add(recordSet, "medi_cd", "");
		for(int i = 0; i < ds.curlist5.size(); i++) {
			PR_PAPMAKE_1009_LCURLIST5Record rec = (PR_PAPMAKE_1009_LCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(formData, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm_cd);
		}
		//rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */
		
		formData = rx.add(recordSet, "fac_clsf", "");
		for(int i = 0; i < ds.curlist4.size(); i++) {
			PR_PAPMAKE_1009_LCURLIST4Record rec = (PR_PAPMAKE_1009_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(formData, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm_cd);
		}
		//rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		formData = rx.add(recordSet, "ref_clsf", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			PR_PAPMAKE_1009_LCURLIST3Record rec = (PR_PAPMAKE_1009_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(formData, "item", "");
			rx.add(record, "value", rec.cd);
//			rx.add(record, "cdnm", rec.cdnm);
//			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "label", rec.cdnm_cd);
//			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		//rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		formData = rx.add(recordSet, "mesr_plac_clsf", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			PR_PAPMAKE_1009_LCURLIST2Record rec = (PR_PAPMAKE_1009_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(formData, "item", "");
			rx.add(record, "value", rec.cd);
//			rx.add(record, "cdnm", rec.cdnm);
//			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "label", rec.cdnm_cd);
//			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		//rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		formData = rx.add(recordSet, "ecnt", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_PAPMAKE_1009_LCURLIST1Record rec = (PR_PAPMAKE_1009_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "ecnt", rec.ecnt);
			rx.add(record, "ecnt_nm", rec.ecnt_nm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
	<CURLIST4>
		<record>
			<cd/>
			<cdnm_cd/>
		</record>
	</CURLIST4>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST3>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURLIST3>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST2>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST1>
		<record>
			<ecnt/>
			<ecnt_nm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Wed May 27 10:38:42 KST 2009 */ %>