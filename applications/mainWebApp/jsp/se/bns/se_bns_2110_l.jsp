<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.bns.ds.*
	,	chosun.ciis.se.bns.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_bns_2110_l.jsp
* ��� : ���˹��Աݵ�� - �����ȸ
* �ۼ����� : 2009-05-18
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
	SE_BNS_2110_LDataSet ds = (SE_BNS_2110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "grid1", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BNS_2110_LCURLISTRecord rec = (SE_BNS_2110_LCURLISTRecord)ds.curlist.get(i);
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
			rx.add(record, "actu_slip_no", rec.actu_slip_no);
			rx.add(record, "acct_slip_no", rec.acct_slip_no);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "bank_cd", rec.bank_cd);
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
			<actu_slip_no/>
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

<% /* �ۼ��ð� : Mon May 18 14:03:52 KST 2009 */ %>