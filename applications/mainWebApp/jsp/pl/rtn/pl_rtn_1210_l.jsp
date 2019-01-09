<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.rtn.rec.*
	,	chosun.ciis.pl.rtn.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pl_rtn_1210_l.jsp
* 기능 : 
* 작성일자 : 2009-03-31
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
	PL_RTN_1210_LDataSet ds = (PL_RTN_1210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "gridData", "");

	try {
		/****** DEAL_PTCRLIST BEGIN */
		int DEAL_PTCRLIST = rx.add(dataSet, "DEAL_PTCRLIST", "");
		for(int i = 0; i < ds.deal_ptcrlist.size(); i++) {
			PL_RTN_1210_LDEAL_PTCRLISTRecord rec = (PL_RTN_1210_LDEAL_PTCRLISTRecord)ds.deal_ptcrlist.get(i);
			int record = rx.add(DEAL_PTCRLIST, "record", "");
			rx.add(record, "deal_dt", rec.deal_dt);
			rx.add(record, "deal_grp_seq", rec.deal_grp_seq);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "send_plac_seq", rec.send_plac_seq);
			rx.add(record, "send_plac_nm", StringUtil.replaceToXml(rec.send_plac_nm));
			rx.add(record, "basi_yymm", rec.basi_yymm);
			rx.add(record, "basi_dt", rec.basi_dt);
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "deal_qty", rec.deal_qty);
			rx.add(record, "deal_amt", rec.deal_amt);
		}
		/****** DEAL_PTCRLIST END */

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
	<DEAL_PTCRLIST>
		<record>
			<deal_dt/>
			<deal_grp_seq/>
			<dlco_cd/>
			<dlco_seq/>
			<dlco_nm/>
			<send_plac_seq/>
			<send_plac_nm/>
			<basi_yymm/>
			<basi_dt/>
			<clos_yn/>
			<deal_qty/>
			<deal_amt/>
		</record>
	</DEAL_PTCRLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 31 20:51:14 KST 2009 */ %>