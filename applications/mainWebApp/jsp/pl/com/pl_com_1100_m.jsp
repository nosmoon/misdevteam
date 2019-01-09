<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.com.rec.*
	,	chosun.ciis.pl.com.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pl_com_1100_m.jsp
* 기능 : 
* 작성일자 : 2009-02-17
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
	PL_COM_1100_MDataSet ds = (PL_COM_1100_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	resData = rx.add(root, "comboSet", "");

	try {
		/****** MEDI_CLSFCUR BEGIN */
		//매체구분
		int medi_clsf = rx.add(resData, "medi_clsf", "");	
		for(int i = 0; i < ds.medi_clsfcur.size(); i++) {
			PL_COM_1100_MMEDI_CLSFCURRecord rec = (PL_COM_1100_MMEDI_CLSFCURRecord)ds.medi_clsfcur.get(i);
			int record = rx.add(medi_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** MEDI_CLSFCUR END */

		/****** MEDI_CDCUR BEGIN */
		//매체종류
		int medi_cd = rx.add(resData, "medi_cd", "");	
		for(int i = 0; i < ds.medi_cdcur.size(); i++) {
			PL_COM_1100_MMEDI_CDCURRecord rec = (PL_COM_1100_MMEDI_CDCURRecord)ds.medi_cdcur.get(i);
			int record = rx.add(medi_cd, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			rx.add(record, "issu_cmpy", rec.issu_cmpy);
			rx.add(record, "medi_clsf", rec.medi_clsf);
		}
		/****** MEDI_CDCUR END */

		/****** ABSENCE_CLSFCUR BEGIN */
		//절판구분
		int absence_clsf = rx.add(resData, "absence_clsf", "");	
		for(int i = 0; i < ds.absence_clsfcur.size(); i++) {
			PL_COM_1100_MABSENCE_CLSFCURRecord rec = (PL_COM_1100_MABSENCE_CLSFCURRecord)ds.absence_clsfcur.get(i);
			int record = rx.add(absence_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		/****** ABSENCE_CLSFCUR END */

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
	<MEDI_CDCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<issu_cmpy/>
			<medi_clsf/>
			<ser_no_bas/>
		</record>
	</MEDI_CDCUR>
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

<% /* 작성시간 : Tue Feb 17 11:40:23 KST 2009 */ %>