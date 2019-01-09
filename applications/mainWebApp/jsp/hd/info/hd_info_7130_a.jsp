<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_7130_ADataSet ds = (HD_INFO_7130_ADataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	tempData = rx.add(root, "tempData", "");

	try {
		rx.add(tempData, "frlc_no", ds.frlc_no);
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(tempData, "errcode", errcode);
		rx.add(tempData, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<hd_info_7002_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<frlc_no/>
				<flnm/>
				<prn/>
				<tel_no/>
				<addr/>
				<chrg_posk_cd/>
				<thrw_pgm/>
				<pay_cycl/>
				<servcost/>
				<serv_pay_cond/>
				<fst_cntr_dt/>
				<last_cntr_dt/>
				<cntr_expr_dt/>
				<draft_no/>
				<bank_cd/>
				<acct_no/>
				<medi_cd/>
				<mang_no/>
			</record>
		</CURLIST>
	</dataSet>
</hd_info_7002_l>
*/
%>

<% /* �ۼ��ð� : Tue Dec 04 16:01:54 KST 2012 */ %>