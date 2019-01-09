<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.rcp.ds.*
	,	chosun.ciis.se.rcp.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_rcp_2010_l.jsp
* ��� : �Ա���Ȳ - ��Ȳ ����Ʈ
* �ۼ����� : 2009-04-15
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
	SE_RCP_2010_LDataSet ds = (SE_RCP_2010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	gridData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_2010_LCURLISTRecord rec = (SE_RCP_2010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "cyov_bal", rec.cyov_bal);
			rx.add(record, "net_sale_amt", rec.net_sale_amt);
			rx.add(record, "sale_tot", rec.sale_tot);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "bo_trans_amt", rec.bo_trans_amt);
			rx.add(record, "aft_rcpm_amt", rec.aft_rcpm_amt);
			rx.add(record, "clracct_amt", rec.clracct_amt);
			rx.add(record, "aft_clos_amt", rec.aft_clos_amt);
			rx.add(record, "rcpm_rate", rec.rcpm_rate);
			rx.add(record, "fpymt_dt", rec.fpymt_dt);
			rx.add(record, "pdlv_altn_amt", rec.pdlv_altn_amt);
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
			<dept_nm/>
			<part_nm/>
			<area_nm/>
			<bo_nm/>
			<cyov_bal/>
			<net_sale_amt/>
			<sale_tot/>
			<rcpm_amt/>
			<bo_trans_amt/>
			<aft_rcpm_amt/>
			<clracct_amt/>
			<aft_clos_amt/>
			<rcpm_rate/>
			<fpymt_dt/>
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

<% /* �ۼ��ð� : Wed Apr 15 19:11:44 KST 2009 */ %>