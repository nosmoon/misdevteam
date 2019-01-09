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
* 파일명 : pl_bas_1310_l.jsp
* 기능 : 
* 작성일자 : 2009-02-27
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
	PL_BAS_1310_LDataSet ds = (PL_BAS_1310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "MEDI_CDCUR", "");

	try {
		/****** MEDI_CDCUR BEGIN */
		for(int i = 0; i < ds.medi_cdcur.size(); i++) {
			PL_BAS_1310_LMEDI_CDCURRecord rec = (PL_BAS_1310_LMEDI_CDCURRecord)ds.medi_cdcur.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "medi_clsf", rec.medi_clsf);
			rx.add(record, "issu_cmpy", rec.issu_cmpy);
			rx.add(record, "issu_cmpy_nm", StringUtil.replaceToXml(rec.issu_cmpy_nm));
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_cd_nm", StringUtil.replaceToXml(rec.medi_cd_nm));
			rx.add(record, "issu_clsf", rec.issu_clsf);
			rx.add(record, "issu_clsf_nm", rec.issu_clsf_nm);
		}
		/****** MEDI_CDCUR END */

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
	<MEDI_CDCUR>
		<record>
			<medi_clsf/>
			<issu_cmpy/>
			<issu_cmpy_nm/>
			<medi_cd/>
			<medi_cd_nm/>
			<issu_clsf/>
			<issu_clsf_nm/>
		</record>
	</MEDI_CDCUR>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Feb 26 19:45:46 KST 2009 */ %>