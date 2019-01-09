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
* 파일명 : pl_bas_1700_m.jsp
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
	PL_BAS_1700_MDataSet ds = (PL_BAS_1700_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "comboSet", "");

	try {
		/****** MEDI_CDCUR BEGIN */
		int medi_cd = rx.add(dataSet, "medi_cd", "");	
		for(int i = 0; i < ds.medi_cdcur.size(); i++) {
			PL_BAS_1700_MMEDI_CDCURRecord rec = (PL_BAS_1700_MMEDI_CDCURRecord)ds.medi_cdcur.get(i);
			int record = rx.add(medi_cd, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** MEDI_CDCUR END */

		/****** DLCO_CLSFCUR BEGIN */
		int dlco_clsf = rx.add(dataSet, "dlco_clsf", "");	
		for(int i = 0; i < ds.dlco_clsfcur.size(); i++) {
			PL_BAS_1700_MDLCO_CLSFCURRecord rec = (PL_BAS_1700_MDLCO_CLSFCURRecord)ds.dlco_clsfcur.get(i);
			int record = rx.add(dlco_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** DLCO_CLSFCUR END */

		/****** SALE_APLY_CLSFCUR BEGIN */
		int sale_aply_clsf = rx.add(dataSet, "sale_aply_clsf", "");	
		for(int i = 0; i < ds.sale_aply_clsfcur.size(); i++) {
			PL_BAS_1700_MSALE_APLY_CLSFCURRecord rec = (PL_BAS_1700_MSALE_APLY_CLSFCURRecord)ds.sale_aply_clsfcur.get(i);
			int record = rx.add(sale_aply_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** SALE_APLY_CLSFCUR END */

		/****** PURC_APLY_CLSFCUR BEGIN */
		int purc_aply_clsf = rx.add(dataSet, "purc_aply_clsf", "");	
		for(int i = 0; i < ds.purc_aply_clsfcur.size(); i++) {
			PL_BAS_1700_MPURC_APLY_CLSFCURRecord rec = (PL_BAS_1700_MPURC_APLY_CLSFCURRecord)ds.purc_aply_clsfcur.get(i);
			int record = rx.add(purc_aply_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** PURC_APLY_CLSFCUR END */

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
	<DLCO_CLSFCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</DLCO_CLSFCUR>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<PURC_APLY_CLSF>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</PURC_APLY_CLSF>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<SALE_APLY_CLSF>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</SALE_APLY_CLSF>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<MEDI_CDCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</MEDI_CDCUR>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Jun 15 20:27:49 KST 2009 */ %>