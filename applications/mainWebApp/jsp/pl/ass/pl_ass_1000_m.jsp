<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.ass.rec.*
	,	chosun.ciis.pl.ass.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pl_ass_1000_m.jsp
* 기능 : 
* 작성일자 : 2009-03-12
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
	PL_ASS_1000_MDataSet ds = (PL_ASS_1000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "comboSet", "");

	try {
		/****** SALE_CLSFCUR BEGIN */
		int sale_clsf = rx.add(dataSet, "sale_clsf", "");
		for(int i = 0; i < ds.sale_clsfcur.size(); i++) {
			PL_ASS_1000_MSALE_CLSFCURRecord rec = (PL_ASS_1000_MSALE_CLSFCURRecord)ds.sale_clsfcur.get(i);
			int record = rx.add(sale_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** SALE_CLSFCUR END */

		/****** SENDCLSFCUR BEGIN */
		int sendclsf = rx.add(dataSet, "sendclsf", "");
		for(int i = 0; i < ds.sendclsfcur.size(); i++) {
			PL_ASS_1000_MSENDCLSFCURRecord rec = (PL_ASS_1000_MSENDCLSFCURRecord)ds.sendclsfcur.get(i);
			int record = rx.add(sendclsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** SENDCLSFCUR END */

		/****** MEDI_CDCUR BEGIN */
		int medi_cd = rx.add(dataSet, "medi_cd", "");
		for(int i = 0; i < ds.medi_cdcur.size(); i++) {
			PL_ASS_1000_MMEDI_CDCURRecord rec = (PL_ASS_1000_MMEDI_CDCURRecord)ds.medi_cdcur.get(i);
			int record = rx.add(medi_cd, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** MEDI_CDCUR END */

		/****** WH_CDCUR BEGIN */
		int wh_cd = rx.add(dataSet, "wh_cd", "");
		for(int i = 0; i < ds.wh_cdcur.size(); i++) {
			PL_ASS_1000_MWH_CDCURRecord rec = (PL_ASS_1000_MWH_CDCURRecord)ds.wh_cdcur.get(i);
			int record = rx.add(wh_cd, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** WH_CDCUR END */

		/****** SELL_TYPECUR BEGIN */
		int sell_type = rx.add(dataSet, "sell_type", "");
		for(int i = 0; i < ds.sell_typecur.size(); i++) {
			PL_ASS_1000_MSELL_TYPECURRecord rec = (PL_ASS_1000_MSELL_TYPECURRecord)ds.sell_typecur.get(i);
			int record = rx.add(sell_type, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** SELL_TYPECUR END */

		/****** DECID_LINECUR BEGIN */
		int decid_line = rx.add(dataSet, "decid_line", "");
		for(int i = 0; i < ds.decid_linecur.size(); i++) {
			PL_ASS_1000_MDECID_LINECURRecord rec = (PL_ASS_1000_MDECID_LINECURRecord)ds.decid_linecur.get(i);
			int record = rx.add(decid_line, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** DECID_LINECUR END */

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
	<SALE_CLSFCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</SALE_CLSFCUR>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<SENDCLSFCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</SENDCLSFCUR>
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

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<WH_CDCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</WH_CDCUR>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<SELL_TYPECUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</SELL_TYPECUR>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<DECID_LINECUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</DECID_LINECUR>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 12 19:40:30 KST 2009 */ %>