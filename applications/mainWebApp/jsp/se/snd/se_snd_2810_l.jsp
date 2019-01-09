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
* ���ϸ� : se_snd_2810_l.jsp
* ��� :   �߼۰��� - �������� - �߼����� DOWNLOAD
* �ۼ����� : 2009-03-25
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
	SE_SND_2810_LDataSet ds = (SE_SND_2810_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_2810_LCURLISTRecord rec = (SE_SND_2810_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record"	, "");
			rx.add(record, "issu_dt"	, rec.issu_dt	);
			rx.add(record, "tmsg_seq"	, rec.tmsg_seq	);
			rx.add(record, "tmsg_dt_tm"	, rec.tmsg_dt_tm);
			rx.add(record, "flnm"		, rec.flnm		);
			rx.add(record, "medi_nm"	, rec.medi_nm	);
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<CURLIST>
		<record>
			<issu_dt/>
			<tmsg_seq/>
			<tmsg_dt_tm/>
			<incmg_pers/>
			<medi_nm/>
		</record>
	</CURLIST>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<resform>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Wed Mar 25 20:29:53 KST 2009 */ %>