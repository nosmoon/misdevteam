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
* ���ϸ� : se_snd_1500_m.jsp
* ��� : �Ǹ� - �߼۰��� - ���庰�μ� - �ʱ�ȭ��
* �ۼ����� : 2009.02.03
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
	SE_SND_1500_MDataSet ds = (SE_SND_1500_MDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData 			= 0;
	int recordSet 			= 0;
	
	Calendar cal 	= Calendar.getInstance();
	String year 	= String.valueOf(cal.get(cal.YEAR));
	String month 	= String.valueOf(cal.get(cal.MONTH) + 1);
	month			= month.length() == 1 ? "0" + month : month;
	String day		= String.valueOf(cal.get(cal.DATE));
	day				= day.length() == 1 ? "0" + day : day;
	
	String today	= year + month + day;
	rx.add(root	, "issu_dt"	, today		);
	
	formData 		= rx.add(root	, "comboSet", "");

	try {
		recordSet			= rx.add(formData	, "curlist"	, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_1500_MCURLISTRecord rec = (SE_SND_1500_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "medilist", "");
		for(int i = 0; i < ds.medilist.size(); i++) {
			SE_SND_1500_MMEDILISTRecord rec = (SE_SND_1500_MMEDILISTRecord)ds.medilist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
		}
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
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<CURLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</CURLIST>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<MEDILIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</MEDILIST>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<resform>
		<curlist/>
		<medilist/>
		<rownum/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Tue Feb 03 09:26:38 KST 2009 */ %>