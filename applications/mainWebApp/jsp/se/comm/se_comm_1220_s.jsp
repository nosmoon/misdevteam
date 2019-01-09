<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.comm.rec.*
	,	chosun.ciis.se.comm.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_comm_1220_s.jsp
* ��� : �Ǹ� - �뼱�����ڵ� �˾� - �뼱������ȸ
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
	SE_COMM_1220_SDataSet ds = (SE_COMM_1220_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";

	recordSet = rx.add(root, "code", "");
	errcode = ds.errcode;
	errmsg = ds.errmsg;

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_COMM_1220_SCURLISTRecord rec = (SE_COMM_1220_SCURLISTRecord)ds.curlist.get(i);
			
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "route_cd"	, rec.route_cd);
			rx.add(record, "route_nm"	, rec.route_nm);
			rx.add(record, "route_rank"	, rec.route_rank);
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
			<cd/>
			<cdnm/>
			<mang_cd_1/>
			<use_yn/>
			<chg_dt_tm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Tue Jan 20 16:50:11 KST 2009 */ %>