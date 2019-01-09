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
* ���ϸ� : se_comm_2100_m.jsp
* ��� :  ���۴ܰ� ��ȸ �ʱ�ȭ��
* �ۼ����� : 2009-02-18
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
	SE_COMM_2100_MDataSet ds = (SE_COMM_2100_MDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData 			= 0;
	int recordSet			= 0;

	formData				= rx.add(root		, "initData"		, "");
	formData				= rx.add(formData	, "comboSet"		, "");

	try {
		recordSet			= rx.add(formData	, "curlist"			, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_COMM_2100_MCURLISTRecord rec = (SE_COMM_2100_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet	, "record", "");
			rx.add(record, "cd"				, rec.cd);
			rx.add(record, "cdnm"			, rec.cdnm);
			rx.add(record, "cd_abrv_nm"		, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "routelist"		, "");
		for(int i = 0; i < ds.routelist.size(); i++) {
			SE_COMM_2100_MROUTELISTRecord rec = (SE_COMM_2100_MROUTELISTRecord)ds.routelist.get(i);
			int record = rx.add(recordSet	, "record", "");
			rx.add(record, "cd"				, rec.cd);
			rx.add(record, "cdnm"			, rec.cdnm);
			rx.add(record, "cd_abrv_nm"		, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "prtlist"			, "");
		for(int i = 0; i < ds.prtlist.size(); i++) {
			SE_COMM_2100_MPRTLISTRecord rec = (SE_COMM_2100_MPRTLISTRecord)ds.prtlist.get(i);
			int record = rx.add(recordSet	, "record", "");
			rx.add(record, "cd"				, rec.cd);
			rx.add(record, "cdnm"			, rec.cdnm);
			rx.add(record, "cd_abrv_nm"		, rec.cd_abrv_nm);
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
	<PRTLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</PRTLIST>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<ROUTELIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</ROUTELIST>
</resData>
*/
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
		<routelist/>
		<prtlist/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Wed Feb 18 09:12:20 KST 2009 */ %>