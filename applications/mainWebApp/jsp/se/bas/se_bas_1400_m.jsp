<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.bas.rec.*
	,	chosun.ciis.se.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_bas_1400_m.jsp
* ��� : �Ǹ� - �������� - ����� ��� - �ʱ�ȭ��
* �ۼ����� : 2009.01.15
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	RwXml rx = new RwXml();
	SE_BAS_1400_MDataSet ds = (SE_BAS_1400_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";

	//dataSet = rx.add(root, "dataSet", "");
	errcode = ds.errcode;
	errmsg = ds.errmsg;

	try {
		/****** CLSFLIST BEGIN */
		recordSet = rx.add(dataSet, "codeData", "");
		recordSet = rx.add(recordSet, "clsflist", "");

		for(int i = 0; i < ds.clsflist.size(); i++) {
			SE_BAS_1400_MCLSFLISTRecord rec = (SE_BAS_1400_MCLSFLISTRecord)ds.clsflist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd"		, rec.cd);
			rx.add(record, "cdnm"	, rec.cdnm);
		}
		rx.add(recordSet, "totalcnt", ds.clsflist.size());
		/****** CLSFLIST END */

		/****** DEPTLIST BEGIN */
		recordSet--;
		recordSet = rx.add(recordSet, "deptlist", "");
		for(int i = 0; i < ds.deptlist.size(); i++) {
			SE_BAS_1400_MDEPTLISTRecord rec = (SE_BAS_1400_MDEPTLISTRecord)ds.deptlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
		}
		rx.add(recordSet, "totalcnt", ds.deptlist.size());
		/****** DEPTLIST END */

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
	<CLSFLIST>
		<record>
			<cd/>
			<cdnm/>
		</record>
	</CLSFLIST>
	<DEPTLIST>
		<record>
			<dept_cd/>
			<dept_nm/>
		</record>
	</DEPTLIST>
</dataSet>
*/
%>


<% /* �ۼ��ð� : Thu Jan 15 11:30:23 KST 2009 */ %>