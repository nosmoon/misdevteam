<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.trg.ds.*
	,	chosun.ciis.se.trg.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_trg_1720_l.jsp
* ��� : ����򰡱��ذ��� - �򰡱�����ȸ
* �ۼ����� : 2009-04-07
* �ۼ��� : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_TRG_1720_LDataSet ds = (SE_TRG_1720_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "evlubaslist", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_TRG_1720_LCURLISTRecord rec = (SE_TRG_1720_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "evlu_clsf", rec.evlu_clsf);
			rx.add(record, "evlu_clsf_nm", rec.evlu_clsf_nm);
			rx.add(record, "bgn_yymm", rec.bgn_yymm);
			rx.add(record, "end_yymm", rec.end_yymm);
			rx.add(record, "psdo_midl_val", rec.psdo_midl_val);
			rx.add(record, "remk", rec.remk);
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
			<evlu_clsf/>
			<evlu_clsf_nm/>
			<bgn_yymm/>
			<end_yymm/>
			<psdo_midl_val/>
			<remk/>
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

<% /* �ۼ��ð� : Tue Apr 07 20:05:56 KST 2009 */ %>