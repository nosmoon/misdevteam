<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.snd.rec.*
	,	chosun.ciis.se.snd.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_snd_1210_l.jsp
* ��� : �Ǹ� - �߼۰��� - �뼱���е�� - �뼱���� ��ȸ
* �ۼ����� : 2009.01.20
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
	SE_SND_1210_LDataSet ds = (SE_SND_1210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";

	dataSet = rx.add(root, "gridData", "");
	errcode = ds.errcode;
	errmsg = ds.errmsg;

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet	, "curlist", "");
		String chg_dt_tm = "";
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_1210_LCURLISTRecord rec = (SE_SND_1210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd"			, rec.cd);
			rx.add(record, "cdnm"		, rec.cdnm);
			rx.add(record, "mang_cd_1"	, rec.mang_cd_1);
			rx.add(record, "use_yn"		, rec.use_yn);
			rx.add(record, "cd_key"		, rec.cd_key);
			rx.add(record, "chg_dt_tm"	, rec.chg_dt_tm);
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

<% /* �ۼ��ð� : Mon Jan 19 15:55:59 KST 2009 */ %>