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
* ���ϸ� : se_etc_1030_l.jsp
* ��� :  �Ǹ�-��Ÿ����-Ȯ�������
* �ۼ����� : 2009-03-03
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
	SE_ETC_1030_LDataSet ds = (SE_ETC_1030_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;

	formData				= rx.add(root	, "dlcolist"		, "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_ETC_1030_LCURLISTRecord rec = (SE_ETC_1030_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record"			, "");
			rx.add(record, "dlco_no"		, rec.dlco_no		);
			rx.add(record, "presi_prn"		, rec.bo_head_prn		);
			rx.add(record, "acct_no"		, rec.acct_no		);
			rx.add(record, "setl_bank"		, rec.setl_bank		);
			rx.add(record, "rcpm_main_nm"	, rec.rcpm_main_nm	);
			System.out.println("==========="+rec.bo_head_prn	);
			System.out.println("==========="+rec.rcpm_main_nm	);
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
			<dlco_no/>
			<presi_prn/>
			<acct_no/>
			<setl_bank/>
			<rcpm_main_nm/>
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

<% /* �ۼ��ð� : Tue Mar 03 11:03:16 KST 2009 */ %>