<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.etccar.rec.*
	,	chosun.ciis.mt.etccar.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCCAR_5410_MDataSet ds = (MT_ETCCAR_5410_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			MT_ETCCAR_5410_MCURLIST4Record rec = (MT_ETCCAR_5410_MCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "label", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_ETCCAR_5410_MCURLIST3Record rec = (MT_ETCCAR_5410_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "label", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_ETCCAR_5410_MCURLIST2Record rec = (MT_ETCCAR_5410_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
		//	rx.add(record, "cdnm", rec.cdnm);
		//	rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
		//	rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "label", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_ETCCAR_5410_MCURLIST1Record rec = (MT_ETCCAR_5410_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
		//	rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "label", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST6 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST6", "");

		for(int i = 0; i < ds.curlist6.size(); i++) {
			MT_ETCCAR_5410_MCURLIST6Record rec = (MT_ETCCAR_5410_MCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
		//	rx.add(record, "cdnm", rec.cdnm);
		//	rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
		//	rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "label", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist6.size());
		/****** CURLIST6 END */

		/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST5", "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			MT_ETCCAR_5410_MCURLIST5Record rec = (MT_ETCCAR_5410_MCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "label", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist5.size());
		/****** CURLIST5 END */

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

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST6>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURLIST6>
</dataSet>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST5>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURLIST5>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Fri Apr 24 13:19:03 KST 2009 */ %>