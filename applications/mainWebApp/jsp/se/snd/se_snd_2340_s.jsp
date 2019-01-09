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
* ���ϸ� : se_snd_2320_l.jsp
* ��� : 
* �ۼ����� : 2009-02-13
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
	SE_SND_2340_SDataSet ds = (SE_SND_2340_SDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int recordSet 			= 0;

	recordSet				= rx.add(root	, "codeData"		, "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_2340_SCURLISTRecord rec = (SE_SND_2340_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "dlco_no"		, rec.dlco_no		);
			rx.add(record, "zip"			, rec.zip			);
			rx.add(record, "addr"			, rec.addr			);
			rx.add(record, "dtls_addr"		, rec.dtls_addr		);
			rx.add(record, "tel_no"			, rec.tel_no		);
			rx.add(record, "natn_tel_no"	, rec.natn_tel_no	);
			rx.add(record, "corp_clsf"		, rec.corp_clsf		);
			rx.add(record, "setl_bank"		, rec.setl_bank		);
			rx.add(record, "acct_no"		, rec.acct_no		);
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
			<aply_dt/>
			<route_clsf_nm/>
			<route_clsf/>
			<route_cd/>
			<route_nm/>
			<cnsg_seqo/>
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

<% /* �ۼ��ð� : Fri Feb 13 15:47:27 KST 2009 */ %>