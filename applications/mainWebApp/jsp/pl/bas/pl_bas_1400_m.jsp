<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pl.bas.rec.*
	,	chosun.ciis.pl.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pl_bas_1400_m.jsp
* 기능 : 
* 작성일자 : 2009-03-05
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
	PL_BAS_1400_MDataSet ds = (PL_BAS_1400_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "comboSet", "");

	try {
		/****** DLCO_CLSFCUR BEGIN */
		int dlco_clsf = rx.add(dataSet, "dlco_clsf", "");	
		for(int i = 0; i < ds.dlco_clsfcur.size(); i++) {
			PL_BAS_1400_MDLCO_CLSFCURRecord rec = (PL_BAS_1400_MDLCO_CLSFCURRecord)ds.dlco_clsfcur.get(i);
			int record = rx.add(dlco_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** DLCO_CLSFCUR END */

		/****** AREACUR BEGIN */
		int area = rx.add(dataSet, "area", "");	
		for(int i = 0; i < ds.areacur.size(); i++) {
			PL_BAS_1400_MAREACURRecord rec = (PL_BAS_1400_MAREACURRecord)ds.areacur.get(i);
			int record = rx.add(area, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cd_abrv_nm);
		}
		/****** AREACUR END */

		/****** MEDI_CLSFCUR BEGIN */
		int medi_clsf = rx.add(dataSet, "medi_clsf", "");	
		for(int i = 0; i < ds.medi_clsfcur.size(); i++) {
			PL_BAS_1400_MMEDI_CLSFCURRecord rec = (PL_BAS_1400_MMEDI_CLSFCURRecord)ds.medi_clsfcur.get(i);
			int record = rx.add(medi_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** MEDI_CLSFCUR END */

		/****** MEDA_CLSFCUR BEGIN */
		int meda_clsf = rx.add(dataSet, "meda_clsf", "");	
		for(int i = 0; i < ds.meda_clsfcur.size(); i++) {
			PL_BAS_1400_MMEDA_CLSFCURRecord rec = (PL_BAS_1400_MMEDA_CLSFCURRecord)ds.meda_clsfcur.get(i);
			int record = rx.add(meda_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** MEDA_CLSFCUR END */

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
	<MEDA_CLSFCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</MEDA_CLSFCUR>
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

<% /* 작성시간 : Thu Mar 05 19:55:11 KST 2009 */ %>