<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.rcp.rec.*
	,	chosun.ciis.se.rcp.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_rcp_5310_l.jsp
* ��� :  �Ǹ� - ������� - ������� - ���⸶��
* �ۼ����� : 2009-04-10
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
	SE_RCP_5310_LDataSet ds = (SE_RCP_5310_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_5310_LCURLISTRecord rec = (SE_RCP_5310_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record"					, "");
			rx.add(record, "yymm"				, rec.yymm				);
			rx.add(record, "clos_yn_10"			, rec.clos_yn_10		);
			rx.add(record, "clos_dt_tm_10"		, rec.clos_dt_tm_10		);
			rx.add(record, "clos_yn_20"			, rec.clos_yn_20		);
			rx.add(record, "actu_slip_no"		, rec.actu_slip_no		);
			rx.add(record, "qty"				, rec.qty				);
			rx.add(record, "pdlv_fee"			, rec.pdlv_fee			);
			rx.add(record, "uprc"				, rec.uprc				);
			rx.add(record, "pdlv_altn_amt"		, rec.pdlv_altn_amt		);
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
			<yymm/>
			<clos_yn_10/>
			<clos_dt_tm_10/>
			<clos_yn_20/>
			<actu_slip_no/>
			<qty/>
			<pdlv_fee/>
			<uprc/>
			<pdlv_altn_amt/>
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

<% /* �ۼ��ð� : Fri Apr 10 16:13:39 KST 2009 */ %>