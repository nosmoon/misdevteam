<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.as.aset.rec.*
	,	chosun.ciis.as.aset.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_ASET_1701_MDataSet ds = (AS_ASET_1701_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			AS_ASET_1701_MCURLIST4Record rec = (AS_ASET_1701_MCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			AS_ASET_1701_MCURLIST3Record rec = (AS_ASET_1701_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			AS_ASET_1701_MCURLIST2Record rec = (AS_ASET_1701_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			AS_ASET_1701_MCURLIST1Record rec = (AS_ASET_1701_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST4>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURLIST4>
</dataSet>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
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
TrustForm�� Instance ����ο� �����ؼ� ���
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
TrustForm�� Instance ����ο� �����ؼ� ���
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

<% /* �ۼ��ð� : Fri Mar 27 16:24:58 KST 2009 */ %>