<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.bas.rec.*
	,	chosun.ciis.pl.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pl_bas_1710_l.jsp
* 기능 : 
* 작성일자 : 2009-06-15
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
	PL_BAS_1710_LDataSet ds = (PL_BAS_1710_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "gridData", "");

	try {
		/****** PTCRLIST BEGIN */
		int PTCRLIST = rx.add(dataSet, "PTCRLIST", "");
		for(int i = 0; i < ds.ptcrlist.size(); i++) {
			PL_BAS_1710_LPTCRLISTRecord rec = (PL_BAS_1710_LPTCRLISTRecord)ds.ptcrlist.get(i);
			int record = rx.add(PTCRLIST, "record", "");
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "dlco_clsf", rec.dlco_clsf);
			rx.add(record, "dlco_clsf_nm", StringUtil.replaceToXml(rec.dlco_clsf_nm));
			rx.add(record, "aply_bgn_yymm", rec.aply_bgn_yymm);
			rx.add(record, "aply_end_yymm", rec.aply_end_yymm);
			rx.add(record, "sale_aply_clsf", rec.sale_aply_clsf);
			rx.add(record, "sale_aply_clsf_nm", StringUtil.replaceToXml(rec.sale_aply_clsf_nm));
			rx.add(record, "sale_rate", rec.sale_rate);
			rx.add(record, "purc_aply_clsf", rec.purc_aply_clsf);
			rx.add(record, "purc_aply_clsf_nm", StringUtil.replaceToXml(rec.purc_aply_clsf_nm));
			rx.add(record, "purc_rate", rec.purc_rate);
			rx.add(record, "cntr_amt", rec.cntr_amt);
			rx.add(record, "dcrate_basi", rec.dcrate_basi);
			rx.add(record, "dcrate_basi_rate", rec.dcrate_basi_rate);
		}
		/****** PTCRLIST END */

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
	<PTCRLIST>
		<record>
			<medi_cd/>
			<dlco_clsf/>
			<dlco_clsf_nm/>
			<aply_bgn_yymm/>
			<aply_end_yymm/>
			<sale_aply_clsf/>
			<sale_aply_clsf_nm/>
			<sale_rate/>
			<purc_aply_clsf/>
			<purc_aply_clsf_nm/>
			<purc_rate/>
			<cntr_amt/>
			<dcrate_basi/>
			<dcrate_basi_rate/>
		</record>
	</PTCRLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Jun 15 20:27:49 KST 2009 */ %>