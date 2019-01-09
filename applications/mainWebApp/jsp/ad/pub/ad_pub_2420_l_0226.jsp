<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ad_pub_2420_l.jsp
* ��� : 
* �ۼ����� : 2009-02-23
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
	AD_PUB_2420_LDataSet ds = (AD_PUB_2420_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int gridData1 = rx.add(root, "gridData1", "");
	
	try {

		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_2420_LCURLISTRecord rec = (AD_PUB_2420_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "pubc_occr_dt", rec.pubc_occr_dt);
			rx.add(record, "wkdy", rec.wkdy);
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "pubc_side", rec.pubc_side);
			rx.add(record, "chro_clsf", rec.chro_clsf);
			rx.add(record, "cm", rec.cm);
			rx.add(record, "dn", rec.dn);
			rx.add(record, "agn", rec.agn);
			rx.add(record, "fee", rec.fee);
			rx.add(record, "pubc_occr_seq", rec.pubc_occr_seq);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "medi_cd", rec.medi_cd);
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
			<dlco_nm/>
			<sect_nm/>
			<pubc_occr_dt/>
			<wkdy/>
			<advt_fee/>
			<pubc_side/>
			<chro_clsf/>
			<cm/>
			<dn/>
			<agn/>
			<fee/>
			<pubc_occr_seq/>
			<cmpy_cd/>
			<medi_cd/>
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

<% /* �ۼ��ð� : Mon Feb 23 20:15:11 KST 2009 */ %>