<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.sal.rec.*
	,	chosun.ciis.pl.sal.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pl_sal_1410_l.jsp
* 기능 : 
* 작성일자 : 2009-04-03
* 작성자 : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	PL_SAL_1410_LDataSet ds = (PL_SAL_1410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "gridData", "");

	try {
		/****** ORDR_PTCRLIST BEGIN */
		int ORDR_PTCRLIST = rx.add(dataSet, "ORDR_PTCRLIST", "");
		for(int i = 0; i < ds.ordr_ptcrlist.size(); i++) {
			PL_SAL_1410_LORDR_PTCRLISTRecord rec = (PL_SAL_1410_LORDR_PTCRLISTRecord)ds.ordr_ptcrlist.get(i);
			int record = rx.add(ORDR_PTCRLIST, "record", "");
			rx.add(record, "ordr_dt", rec.ordr_dt);
			rx.add(record, "ordr_grp_seq", rec.ordr_grp_seq);
			rx.add(record, "basi_dt", rec.basi_dt);
			rx.add(record, "send_plac_nm", StringUtil.replaceToXml(rec.send_plac_nm));
			rx.add(record, "owh_yn", rec.owh_yn);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "medi_clsf", rec.medi_clsf);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "phone_no", rec.phone_no);
			rx.add(record, "send_plac_addr", StringUtil.replaceToXml(rec.send_plac_addr));
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "deal_qty", rec.deal_qty);
			rx.add(record, "deal_amt", rec.deal_amt);
		}
		/****** ORDR_PTCRLIST END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<ORDR_PTCRLIST>
		<record>
			<ordr_dt/>
			<ordr_grp_seq/>
			<basi_dt/>
			<send_plac_nm/>
			<owh_yn/>
			<rcpm_amt/>
			<medi_clsf/>
			<dlco_cd/>
			<dlco_seq/>
			<dlco_nm/>
			<phone_no/>
			<send_plac_addr/>
			<clos_yn/>
			<deal_qty/>
			<deal_amt/>
		</record>
	</ORDR_PTCRLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Apr 02 18:08:00 KST 2009 */ %>