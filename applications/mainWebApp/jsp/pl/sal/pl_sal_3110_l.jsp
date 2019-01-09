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
* 파일명 : pl_sal_3110_l.jsp
* 기능 : 
* 작성일자 : 2009-04-08
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
	PL_SAL_3110_LDataSet ds = (PL_SAL_3110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "gridData", "");

	try {
		/****** DEAL_PTCRCUR BEGIN */
		int DEAL_PTCRCUR = rx.add(dataSet, "DEAL_PTCRCUR", "");
		for(int i = 0; i < ds.deal_ptcrcur.size(); i++) {
			PL_SAL_3110_LDEAL_PTCRCURRecord rec = (PL_SAL_3110_LDEAL_PTCRCURRecord)ds.deal_ptcrcur.get(i);
			int record = rx.add(DEAL_PTCRCUR, "record", "");
			rx.add(record, "dlco_clsf", rec.dlco_clsf);
			rx.add(record, "dlco_clsf_nm", StringUtil.replaceToXml(rec.dlco_clsf_nm));
			rx.add(record, "area", rec.area);
			rx.add(record, "area_nm", StringUtil.replaceToXml(rec.area_nm));
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "medi_clsf", rec.medi_clsf);
			rx.add(record, "medi_clsf_nm", StringUtil.replaceToXml(rec.medi_clsf_nm));
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_ser_no", rec.medi_ser_no);
			rx.add(record, "medi_nm", StringUtil.replaceToXml(rec.medi_nm));
			rx.add(record, "sendclsf", rec.sendclsf);
			rx.add(record, "sendclsf_nm", StringUtil.replaceToXml(rec.sendclsf_nm));
			rx.add(record, "deal_qty", rec.deal_qty);
			rx.add(record, "deal_uprc", rec.deal_uprc);
			rx.add(record, "dcrate", rec.dcrate);
			rx.add(record, "deal_amt", rec.deal_amt);
		}
		/****** DEAL_PTCRCUR END */

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
	<DEAL_PTCRCUR>
		<record>
			<dlco_clsf/>
			<dlco_clsf_nm/>
			<area/>
			<area_nm/>
			<dlco_cd/>
			<dlco_seq/>
			<dlco_nm/>
			<medi_clsf/>
			<medi_clsf_nm/>
			<medi_cd/>
			<medi_ser_no/>
			<medi_nm/>
			<sendclsf/>
			<sendclsf_nm/>
			<deal_qty/>
			<deal_uprc/>
			<dcrate/>
			<deal_amt/>
		</record>
	</DEAL_PTCRCUR>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 08 15:15:54 KST 2009 */ %>