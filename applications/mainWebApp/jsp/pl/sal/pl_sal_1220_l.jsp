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
* 파일명 : pl_sal_1220_l.jsp
* 기능 : 
* 작성일자 : 2009-03-24
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
	PL_SAL_1220_LDataSet ds = (PL_SAL_1220_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	int DEAL_PTCRCUR = rx.add(root, "DEAL_PTCRCUR", "");

	try {
		/****** DEAL_PTCRCUR BEGIN */
		for(int i = 0; i < ds.deal_ptcrcur.size(); i++) {
			PL_SAL_1220_LDEAL_PTCRCURRecord rec = (PL_SAL_1220_LDEAL_PTCRCURRecord)ds.deal_ptcrcur.get(i);
			int record = rx.add(DEAL_PTCRCUR, "record", "");
			rx.add(record, "deal_dt", rec.deal_dt);
			rx.add(record, "deal_grp_seq", rec.deal_grp_seq);
			rx.add(record, "deal_seq", rec.deal_seq);
			rx.add(record, "medi_clsf", rec.medi_clsf);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_ser_no", rec.medi_ser_no);
			rx.add(record, "medi_nm", StringUtil.replaceToXml(rec.medi_nm));
			rx.add(record, "stok_qty", rec.stok_qty);
			rx.add(record, "deal_qty", rec.deal_qty);
			rx.add(record, "deal_uprc", rec.deal_uprc);
			rx.add(record, "dcrate", rec.dcrate);
			rx.add(record, "deal_amt", rec.deal_amt);
			rx.add(record, "sale_clsf", rec.sale_clsf);
			rx.add(record, "sendclsf", rec.sendclsf);
			rx.add(record, "wh_cd", rec.wh_cd);
			rx.add(record, "sell_type", rec.sell_type);
			rx.add(record, "absence_clsf", "");
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
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
			<deal_dt/>
			<deal_grp_seq/>
			<deal_seq/>
			<medi_clsf/>
			<medi_cd/>
			<medi_ser_no/>
			<medi_nm/>
			<stok_qty/>
			<deal_qty/>
			<deal_uprc/>
			<dcrate/>
			<deal_amt/>
			<sale_clsf/>
			<sendclsf/>
			<wh_cd/>
			<sell_type/>
			<remk/>
		</record>
	</DEAL_PTCRCUR>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 24 18:16:37 KST 2009 */ %>