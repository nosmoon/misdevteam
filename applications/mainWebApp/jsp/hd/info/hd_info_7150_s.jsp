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
	HD_INFO_7150_SDataSet ds = (HD_INFO_7150_SDataSet)request.getAttribute("ds");
    String strEncodeImage_phot = "";
	strEncodeImage_phot = ds.getEncodeimage_phot();	

	int root = RwXml.rootNodeID;
    int resPhoto = 0;
		int record = 0;
		String errcode = ds.errcode;
		String errmsg = ds.errmsg;
		resPhoto = rx.add(root, "resPhoto", "");

	try {
	 	record = rx.add(resPhoto, "phot", 	strEncodeImage_phot,   "type=\"xsd:base64Binary\"");
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(resPhoto, "errcode", errcode);
		rx.add(resPhoto, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
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

<% /* 작성시간 : Tue Dec 04 16:01:54 KST 2012 */ %>