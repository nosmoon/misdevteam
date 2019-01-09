<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.sal.rec.*
	,	chosun.ciis.se.sal.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_sal_2010_l.jsp
* ��� :   �Ǹ� - ������� - ������� - ��������ܰ�����
* �ۼ����� : 2009-04-08
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
	SE_SAL_2010_LDataSet ds = (SE_SAL_2010_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SAL_2010_LCURLISTRecord rec = (SE_SAL_2010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "yymm"			, rec.yymm				);
			rx.add(record, "net_sale_amt"	, rec.net_sale_amt		);
			rx.add(record, "val_qty"		, rec.val_qty			);
			rx.add(record, "icdc_calc_qty"	, rec.icdc_calc_qty		);
			rx.add(record, "spsl_qty"		, rec.spsl_qty			);
			rx.add(record, "stetsell_qty"	, rec.stetsell_qty		);
			rx.add(record, "basi_uprc"		, rec.basi_uprc			);
			rx.add(record, "rdff_rdu_uprc"	, rec.rdff_rdu_uprc		);
			rx.add(record, "cntr_uprc"		, rec.cntr_uprc			);
			rx.add(record, "fpymt_encur_amt", rec.fpymt_encur_amt	);
			rx.add(record, "sale_amt"		, rec.sale_amt			);
			rx.add(record, "sply_amt"		, rec.sply_amt			);
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
			<net_sale_amt/>
			<val_qty/>
			<icdc_calc_qty/>
			<spsl_qty/>
			<stetsell_qty/>
			<basi_uprc/>
			<rdff_rdu_uprc/>
			<cntr_uprc/>
			<fpymt_encur_amt/>
			<sale_amt/>
			<sply_amt/>
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

<% /* �ۼ��ð� : Wed Apr 08 17:31:22 KST 2009 */ %>