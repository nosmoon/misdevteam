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
* 파일명 : pl_bas_1800_m.jsp
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
	PL_BAS_1800_MDataSet ds = (PL_BAS_1800_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "comboSet", "");

	try {
		/****** ISSU_CMPYCUR BEGIN */
		int issu_cmpy = rx.add(dataSet, "issu_cmpy", "");	
		for(int i = 0; i < ds.issu_cmpycur.size(); i++) {
			PL_BAS_1800_MISSU_CMPYCURRecord rec = (PL_BAS_1800_MISSU_CMPYCURRecord)ds.issu_cmpycur.get(i);
			int record = rx.add(issu_cmpy, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** ISSU_CMPYCUR END */

		/****** HNDLMEDI_CLSFCUR BEGIN */
		int hndlmedi_clsf = rx.add(dataSet, "hndlmedi_clsf", "");	
		for(int i = 0; i < ds.hndlmedi_clsfcur.size(); i++) {
			PL_BAS_1800_MHNDLMEDI_CLSFCURRecord rec = (PL_BAS_1800_MHNDLMEDI_CLSFCURRecord)ds.hndlmedi_clsfcur.get(i);
			int record = rx.add(hndlmedi_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** HNDLMEDI_CLSFCUR END */

		/****** RATE_BASICUR BEGIN */
		int rate_basi = rx.add(dataSet, "rate_basi", "");	
		for(int i = 0; i < ds.rate_basicur.size(); i++) {
			PL_BAS_1800_MRATE_BASICURRecord rec = (PL_BAS_1800_MRATE_BASICURRecord)ds.rate_basicur.get(i);
			int record = rx.add(rate_basi, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** RATE_BASICUR END */

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
	<RATE_BASICUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</RATE_BASICUR>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<ISSU_CMPYCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</ISSU_CMPYCUR>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<HNDLMEDI_CLSFCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</HNDLMEDI_CLSFCUR>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Jun 22 15:04:08 KST 2009 */ %>