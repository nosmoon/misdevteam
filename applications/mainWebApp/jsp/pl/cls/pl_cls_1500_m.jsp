<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.cls.rec.*
	,	chosun.ciis.pl.cls.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pl_cls_1500_m.jsp
* 기능 : 
* 작성일자 : 2009-08-26
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
	PL_CLS_1500_MDataSet ds = (PL_CLS_1500_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "comboSet", "");

	try {
		/****** MEDI_CLSFCUR BEGIN */
		int medi_clsf = rx.add(dataSet, "medi_clsf", "");
		for(int i = 0; i < ds.medi_clsfcur.size(); i++) {
			PL_CLS_1500_MMEDI_CLSFCURRecord rec = (PL_CLS_1500_MMEDI_CLSFCURRecord)ds.medi_clsfcur.get(i);
			int record = rx.add(medi_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** MEDI_CLSFCUR END */

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
	<MEDI_CLSFCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</MEDI_CLSFCUR>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Aug 26 11:14:57 KST 2009 */ %>