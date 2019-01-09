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
	PR_PRTEXEC_2010_LDataSet ds = (PR_PRTEXEC_2010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	recordSet = rx.add(root, "tempData", "");
	
	try {
		formData = rx.add(recordSet, "dual_out_clsf", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			PR_PRTEXEC_2010_LCURLIST2Record rec = (PR_PRTEXEC_2010_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(formData, "item", "");
			
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm_cd);
		}
		//rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */
		
		formData = rx.add(recordSet, "std_clsf", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			PR_PRTEXEC_2010_LCURLIST3Record rec = (PR_PRTEXEC_2010_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(formData, "item", "");
			
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd);
			//rx.add(record, "label", rec.cdnm_cd);
		}
		//rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		formData = rx.add(recordSet, "sect_cd", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_PRTEXEC_2010_LCURLIST1Record rec = (PR_PRTEXEC_2010_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(formData, "item", "");
			
			rx.add(record, "value", rec.cd);
			rx.addCData(record, "label", rec.cdnm_cd);
		}
		//rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		formData = rx.add(recordSet, "medi_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PRTEXEC_2010_LCURLISTRecord rec = (PR_PRTEXEC_2010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "item", "");
			
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm_cd);
		}
		formData = rx.add(recordSet, "medi_cd_2", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PRTEXEC_2010_LCURLISTRecord rec = (PR_PRTEXEC_2010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record", "");
			
			rx.add(record, "value", rec.cd);
			rx.add(record, "mang_cd_6", rec.mang_cd_6);
		}
		//rx.add(recordSet, "totalcnt", ds.curlist.size());
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
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Apr 20 14:55:27 KST 2009 */ %>