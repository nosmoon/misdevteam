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
* 파일명 : pl_bas_1810_l.jsp
* 기능 : 
* 작성일자 : 2009-06-22
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
	PL_BAS_1810_LDataSet ds = (PL_BAS_1810_LDataSet)request.getAttribute("ds");
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
			PL_BAS_1810_LPTCRLISTRecord rec = (PL_BAS_1810_LPTCRLISTRecord)ds.ptcrlist.get(i);
			int record = rx.add(PTCRLIST, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			rx.add(record, "mang_cd_1", rec.mang_cd_1);
			rx.add(record, "hndlmedi_clsf", StringUtil.replaceToXml(rec.hndlmedi_clsf));
			rx.add(record, "mang_cd_2", rec.mang_cd_2);
			rx.add(record, "rate_basi", StringUtil.replaceToXml(rec.rate_basi));
			rx.add(record, "mang_cd_3", rec.mang_cd_3);
			rx.add(record, "use_yn", rec.use_yn);
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
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<mang_cd_1/>
			<hndlmedi_clsf/>
			<mang_cd_2/>
			<rate_basi/>
			<mang_cd_3/>
			<use_yn/>
		</record>
	</PTCRLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Jun 22 15:25:03 KST 2009 */ %>