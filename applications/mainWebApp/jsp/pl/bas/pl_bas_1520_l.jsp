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
* 파일명 : pl_bas_1520_l.jsp
* 기능 : 
* 작성일자 : 2009-04-30
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
	PL_BAS_1520_LDataSet ds = (PL_BAS_1520_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "resform", "");

	try {
		/****** TRGTPTCRCUR BEGIN */
		int TRGTPTCRCUR = rx.add(dataSet, "TRGTPTCRCUR", "");
		for(int i = 0; i < ds.trgtptcrcur.size(); i++) {
			PL_BAS_1520_LTRGTPTCRCURRecord rec = (PL_BAS_1520_LTRGTPTCRCURRecord)ds.trgtptcrcur.get(i);
			int record = rx.add(TRGTPTCRCUR, "record", "");
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "dlco_clsf", rec.dlco_clsf);
			rx.add(record, "dlco_clsf_nm", rec.dlco_clsf_nm);
			rx.add(record, "basi_yymm", rec.basi_yymm);
			rx.add(record, "trgt_qty", rec.trgt_qty);
			rx.add(record, "trgt_amt", rec.trgt_amt);
		}
		/****** BASEBALLIST END */

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
	<TRGTPTCRCUR>
		<record>
			<medi_cd/>
			<medi_nm/>
			<dlco_clsf/>
			<dlco_clsf_nm/>
			<basi_yymm/>
			<trgt_qty/>
			<trgt_amt/>
		</record>
	</TRGTPTCRCUR>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Apr 30 14:29:47 KST 2009 */ %>