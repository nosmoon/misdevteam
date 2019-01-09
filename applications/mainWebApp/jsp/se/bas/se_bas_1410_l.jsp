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
* ���ϸ� : se_bas_1410_l.jsp
* ��� : �Ǹ� - �������� - ����� ��� - ����� ��ȸ
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
	SE_BAS_1410_LDataSet ds = (SE_BAS_1410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";

	//dataSet = rx.add(root, "dataSet", "");
	errcode = ds.errcode;
	errmsg = ds.errmsg;

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(root, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BAS_1410_LCURLISTRecord rec = (SE_BAS_1410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd"		, rec.cmpy_cd);
			rx.add(record, "chrg_pers"		, rec.chrg_pers);
			rx.add(record, "flnm"			, rec.flnm);
			rx.add(record, "clsf"			, rec.clsf);
			rx.add(record, "dept_cd"		, rec.dept_cd);
			rx.add(record, "use_yn"         , rec.use_yn);
			rx.add(record, "chrg_pers_key"	, rec.chrg_pers_key);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

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
	<CURLIST>
		<record>
			<cmpy_cd/>
			<chrg_pers/>
			<flnm/>
			<cslf/>
			<dept_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Thu Jan 15 13:28:22 KST 2009 */ %>