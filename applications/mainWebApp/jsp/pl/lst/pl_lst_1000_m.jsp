<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.lst.rec.*
	,	chosun.ciis.pl.lst.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pl_lst_1000_m.jsp
* 기능 : 
* 작성일자 : 2009-05-25
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
	PL_LST_1000_MDataSet ds = (PL_LST_1000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "comboSet", "");

	try {
		/****** MEDI_CLSFCUR BEGIN */
		int medi_clsf1 = rx.add(dataSet, "medi_clsf1", "");
		for(int i = 0; i < ds.medi_clsfcur.size(); i++) {
			PL_LST_1000_MMEDI_CLSFCURRecord rec = (PL_LST_1000_MMEDI_CLSFCURRecord)ds.medi_clsfcur.get(i);
			int record = rx.add(medi_clsf1, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** MEDI_CLSFCUR END */

		/****** MEDI_CLSFCUR BEGIN */
		int medi_clsf2 = rx.add(dataSet, "medi_clsf2", "");
		for(int i = 0; i < ds.medi_clsfcur.size(); i++) {
			PL_LST_1000_MMEDI_CLSFCURRecord rec = (PL_LST_1000_MMEDI_CLSFCURRecord)ds.medi_clsfcur.get(i);
			int record = rx.add(medi_clsf2, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** MEDI_CLSFCUR END */

		/****** MEDI_CDCUR BEGIN */
		int medi_cd = rx.add(dataSet, "medi_cd", "");
		for(int i = 0; i < ds.medi_cdcur.size(); i++) {
			PL_LST_1000_MMEDI_CDCURRecord rec = (PL_LST_1000_MMEDI_CDCURRecord)ds.medi_cdcur.get(i);
			int record = rx.add(medi_cd, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** MEDI_CDCUR END */

		/****** DEAL_CLSFCUR BEGIN */
		int deal_clsf = rx.add(dataSet, "deal_clsf", "");
		for(int i = 0; i < ds.deal_clsfcur.size(); i++) {
			PL_LST_1000_MDEAL_CLSFCURRecord rec = (PL_LST_1000_MDEAL_CLSFCURRecord)ds.deal_clsfcur.get(i);
			int record = rx.add(deal_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** DEAL_CLSFCUR END */

		/****** ISSU_CMPYCUR BEGIN */
		int issu_cmpy = rx.add(dataSet, "issu_cmpy", "");
		for(int i = 0; i < ds.issu_cmpycur.size(); i++) {
			PL_LST_1000_MISSU_CMPYCURRecord rec = (PL_LST_1000_MISSU_CMPYCURRecord)ds.issu_cmpycur.get(i);
			int record = rx.add(issu_cmpy, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** ISSU_CMPYCUR END */

		/****** WH_CDCUR BEGIN */
		int wh_cd = rx.add(dataSet, "wh_cd", "");
		for(int i = 0; i < ds.wh_cdcur.size(); i++) {
			PL_LST_1000_MWH_CDCURRecord rec = (PL_LST_1000_MWH_CDCURRecord)ds.wh_cdcur.get(i);
			int record = rx.add(wh_cd, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** WH_CDCUR END */

		/****** WH_CDCUR BEGIN */
		int wh_cd1 = rx.add(dataSet, "wh_cd1", "");
		for(int i = 0; i < ds.wh_cdcur.size(); i++) {
			PL_LST_1000_MWH_CDCURRecord rec = (PL_LST_1000_MWH_CDCURRecord)ds.wh_cdcur.get(i);
			int record = rx.add(wh_cd1, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** WH_CDCUR END */

		/****** DLCO_CLSFCUR BEGIN */
		int dlco_clsf = rx.add(dataSet, "dlco_clsf", "");
		for(int i = 0; i < ds.dlco_clsfcur.size(); i++) {
			PL_LST_1000_MDLCO_CLSFCURRecord rec = (PL_LST_1000_MDLCO_CLSFCURRecord)ds.dlco_clsfcur.get(i);
			int record = rx.add(dlco_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** DLCO_CLSFCUR END */

		/****** DLCO_CLSFCUR BEGIN */
		int dlco_clsf1 = rx.add(dataSet, "dlco_clsf1", "");
		for(int i = 0; i < ds.dlco_clsfcur.size(); i++) {
			PL_LST_1000_MDLCO_CLSFCURRecord rec = (PL_LST_1000_MDLCO_CLSFCURRecord)ds.dlco_clsfcur.get(i);
			int record = rx.add(dlco_clsf1, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** DLCO_CLSFCUR END */

		/****** AREACUR BEGIN */
		int area = rx.add(dataSet, "area", "");
		for(int i = 0; i < ds.areacur.size(); i++) {
			PL_LST_1000_MAREACURRecord rec = (PL_LST_1000_MAREACURRecord)ds.areacur.get(i);
			int record = rx.add(area, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cd_abrv_nm));
		}
		/****** AREACUR END */

		/****** AREACUR BEGIN */
		int area1 = rx.add(dataSet, "area1", "");
		for(int i = 0; i < ds.areacur.size(); i++) {
			PL_LST_1000_MAREACURRecord rec = (PL_LST_1000_MAREACURRecord)ds.areacur.get(i);
			int record = rx.add(area1, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cd_abrv_nm));
		}
		/****** AREACUR END */

		/****** SENDCLSFCUR BEGIN */
		int sendclsf = rx.add(dataSet, "sendclsf", "");
		for(int i = 0; i < ds.sendclsfcur.size(); i++) {
			PL_LST_1000_MSENDCLSFCURRecord rec = (PL_LST_1000_MSENDCLSFCURRecord)ds.sendclsfcur.get(i);
			int record = rx.add(sendclsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** SENDCLSFCUR END */

		/****** SALE_CLSFCUR BEGIN */
		int sale_clsf = rx.add(dataSet, "sale_clsf", "");
		for(int i = 0; i < ds.sale_clsfcur.size(); i++) {
			PL_LST_1000_MSALE_CLSFCURRecord rec = (PL_LST_1000_MSALE_CLSFCURRecord)ds.sale_clsfcur.get(i);
			int record = rx.add(sale_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** SALE_CLSFCUR END */

		/****** ABSENCE_CLSFCUR BEGIN */
		int absence_clsf = rx.add(dataSet, "absence_clsf", "");
		for(int i = 0; i < ds.absence_clsfcur.size(); i++) {
			PL_LST_1000_MABSENCE_CLSFCURRecord rec = (PL_LST_1000_MABSENCE_CLSFCURRecord)ds.absence_clsfcur.get(i);
			int record = rx.add(absence_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** ABSENCE_CLSFCUR END */

		/****** MEDI_CD_MAGZCUR BEGIN */
		int medi_cd_magz = rx.add(dataSet, "medi_cd_magz", "");
		for(int i = 0; i < ds.medi_cd_magzcur.size(); i++) {
			PL_LST_1000_MMEDI_CD_MAGZCURRecord rec = (PL_LST_1000_MMEDI_CD_MAGZCURRecord)ds.medi_cd_magzcur.get(i);
			int record = rx.add(medi_cd_magz, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** MEDI_CD_MAGZCUR END */

		/****** MEDI_CD_BOOKCUR BEGIN */
		int medi_cd_book = rx.add(dataSet, "medi_cd_book", "");
		for(int i = 0; i < ds.medi_cd_bookcur.size(); i++) {
			PL_LST_1000_MMEDI_CD_BOOKCURRecord rec = (PL_LST_1000_MMEDI_CD_BOOKCURRecord)ds.medi_cd_bookcur.get(i);
			int record = rx.add(medi_cd_book, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** MEDI_CD_BOOKCUR END */

		/****** DECID_LINECUR BEGIN */
		int decid_line = rx.add(dataSet, "decid_line", "");
		for(int i = 0; i < ds.decid_linecur.size(); i++) {
			PL_LST_1000_MDECID_LINECURRecord rec = (PL_LST_1000_MDECID_LINECURRecord)ds.decid_linecur.get(i);
			int record = rx.add(decid_line, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** DECID_LINECUR END */

		/****** EWH_CLSFCUR BEGIN */
		int ewh_clsf = rx.add(dataSet, "ewh_clsf", "");
		for(int i = 0; i < ds.ewh_clsfcur.size(); i++) {
			PL_LST_1000_MEWH_CLSFCURRecord rec = (PL_LST_1000_MEWH_CLSFCURRecord)ds.ewh_clsfcur.get(i);
			int record = rx.add(ewh_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** EWH_CLSFCUR END */

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
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</MEDI_CLSFCUR>
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
	<DEAL_CLSFCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</DEAL_CLSFCUR>
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
	<AREACUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</AREACUR>
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
	<ABSENCE_CLSFCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</ABSENCE_CLSFCUR>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<MEDI_CD_MAGZCUR>
		<record>
			<cd/>
			<cdnm/>
		</record>
	</MEDI_CD_MAGZCUR>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<MEDI_CD_BOOKCUR>
		<record>
			<cd/>
			<cdnm/>
		</record>
	</MEDI_CD_BOOKCUR>
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

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<EWH_CLSFCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</EWH_CLSFCUR>
</dataSet>
*/
%>

<% /* 작성시간 : Mon May 25 17:34:15 KST 2009 */ %>
