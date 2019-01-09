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
* 파일명 : pl_lst_3000_m.jsp
* 기능 : 
* 작성일자 : 2009-06-09
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
	PL_LST_3000_MDataSet ds = (PL_LST_3000_MDataSet)request.getAttribute("ds");
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
			PL_LST_3000_MISSU_CMPYCURRecord rec = (PL_LST_3000_MISSU_CMPYCURRecord)ds.issu_cmpycur.get(i);
			int record = rx.add(issu_cmpy, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** ISSU_CMPYCUR END */

		/****** DECID_LINECUR BEGIN */
		int decid_line = rx.add(dataSet, "decid_line", "");
		for(int i = 0; i < ds.decid_linecur.size(); i++) {
			PL_LST_3000_MDECID_LINECURRecord rec = (PL_LST_3000_MDECID_LINECURRecord)ds.decid_linecur.get(i);
			int record = rx.add(decid_line, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** DECID_LINECUR END */

		/****** MEDI_CD_MAGZCUR BEGIN */
		int medi_cd_magz = rx.add(dataSet, "medi_cd_magz", "");
		for(int i = 0; i < ds.medi_cd_magzcur.size(); i++) {
			PL_LST_3000_MMEDI_CD_MAGZCURRecord rec = (PL_LST_3000_MMEDI_CD_MAGZCURRecord)ds.medi_cd_magzcur.get(i);
			int record = rx.add(medi_cd_magz, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			rx.add(record, "issu_cmpy", rec.issu_cmpy);
			rx.add(record, "issu_clsf", rec.issu_clsf);
		}
		/****** MEDI_CD_MAGZCUR END */

		/****** MEDI_CD_BOOKCUR BEGIN */
		int medi_cd_book = rx.add(dataSet, "medi_cd_book", "");
		for(int i = 0; i < ds.medi_cd_bookcur.size(); i++) {
			PL_LST_3000_MMEDI_CD_BOOKCURRecord rec = (PL_LST_3000_MMEDI_CD_BOOKCURRecord)ds.medi_cd_bookcur.get(i);
			int record = rx.add(medi_cd_book, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** MEDI_CD_BOOKCUR END */

		/****** MEDI_CLSFCUR BEGIN */
		int medi_clsf = rx.add(dataSet, "medi_clsf", "");
		for(int i = 0; i < ds.medi_clsfcur.size(); i++) {
			PL_LST_3000_MMEDI_CLSFCURRecord rec = (PL_LST_3000_MMEDI_CLSFCURRecord)ds.medi_clsfcur.get(i);
			int record = rx.add(medi_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** MEDI_CLSFCUR END */

		/****** RCPM_TYPECUR BEGIN */
		int rcpm_type = rx.add(dataSet, "rcpm_type", "");
		for(int i = 0; i < ds.rcpm_typecur.size(); i++) {
			PL_LST_3000_MRCPM_TYPECURRecord rec = (PL_LST_3000_MRCPM_TYPECURRecord)ds.rcpm_typecur.get(i);
			int record = rx.add(rcpm_type, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** RCPM_TYPECUR END */

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
	<MEDI_CD_MAGZCUR>
		<record>
			<cd/>
			<cdnm/>
			<issu_cmpy/>
			<issu_clsf/>
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
	<RCPM_TYPECUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</RCPM_TYPECUR>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Jun 09 19:20:43 KST 2009 */ %>
