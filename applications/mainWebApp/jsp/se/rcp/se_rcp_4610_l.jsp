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
* ���ϸ� : se_rcp_4610_l.jsp
* ��� : �������Աݵ��(��) - ��ǥ������ȸ
* �ۼ����� : 2010-05-28
* �ۼ��� : �̹�ȿ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_RCP_4610_LDataSet ds = (SE_RCP_4610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "grid1", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_4610_LCURLISTRecord rec = (SE_RCP_4610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "slip_clsf", rec.slip_clsf);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "rcpm_dt", rec.rcpm_dt);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "area_cd", rec.area_cd);
			rx.add(record, "cnt", rec.cnt);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "rcpm_amt1", rec.rcpm_amt1);
			rx.add(record, "rcpm_amt2", rec.rcpm_amt2);
			rx.add(record, "rcpm_amt3", rec.rcpm_amt3);			
			rx.add(record, "clos_yn", rec.clos_yn);
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
			<occr_dt/>
			<slip_clsf/>
			<seq/>
			<rcpm_dt/>
			<dept_nm/>
			<part_nm/>
			<area_nm/>
			<area_cd/>
			<cnt/>
			<slip_no/>
			<rcpm_amt/>
			<clos_yn/>
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

<% /* �ۼ��ð� : Fri May 08 15:31:30 KST 2009 */ %>