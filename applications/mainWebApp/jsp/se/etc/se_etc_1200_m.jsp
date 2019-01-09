<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.etc.rec.*
	,	chosun.ciis.se.etc.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_etc_1200_m.jsp
* ��� :   �Ǹ�-��Ÿ����-������ ���޵��
* �ۼ����� : 2009-03-05
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
	SE_ETC_1200_MDataSet ds = (SE_ETC_1200_MDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	Calendar cal 	= Calendar.getInstance();
	String year 	= String.valueOf(cal.get(cal.YEAR));
	String month 	= String.valueOf(cal.get(cal.MONTH) + 1);
	month			= month.length() == 1 ? "0" + month : month;
	
	String today	= year + month;
	rx.add(root		, "bgn_yymm"	, today);
	rx.add(root		, "end_yymm"	, today);

	formData				= rx.add(root		, "comboSet"			, "");
	try {
		recordSet			= rx.add(formData	, "curlist"				, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_ETC_1200_MCURLISTRecord rec = (SE_ETC_1200_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record"	, "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "teamlist"			, "");
		for(int i = 0; i < ds.teamlist.size(); i++) {
			SE_ETC_1200_MTEAMLISTRecord rec = (SE_ETC_1200_MTEAMLISTRecord)ds.teamlist.get(i);
			int record = rx.add(recordSet, "record"	, "");
			rx.add(record, "dept_cd"	, rec.dept_cd	);
			rx.add(record, "dept_nm"	, rec.dept_nm	);
		}
		
		recordSet			= rx.add(formData	, "banklist"			, "");
		for(int i = 0; i < ds.banklist.size(); i++) {
			SE_ETC_1200_MBANKLISTRecord rec = (SE_ETC_1200_MBANKLISTRecord)ds.banklist.get(i);
			int record = rx.add(recordSet, "record"	, "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "decidlist"			, "");
		for(int i = 0; i < ds.decidlist.size(); i++) {
			SE_ETC_1200_MDECIDLISTRecord rec = (SE_ETC_1200_MDECIDLISTRecord)ds.decidlist.get(i);
			int record = rx.add(recordSet, "record"	, "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
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
	<resform>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Thu Mar 05 09:42:35 KST 2009 */ %>