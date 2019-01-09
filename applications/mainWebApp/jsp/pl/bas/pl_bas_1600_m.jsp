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
* 파일명 : pl_bas_1600_m.jsp
* 기능 : 
* 작성일자 : 2009-05-18
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
	PL_BAS_1600_MDataSet ds = (PL_BAS_1600_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "comboSet", "");

	try {
		/****** ISSU_CLSFCUR BEGIN */
		int issu_clsf = rx.add(dataSet, "issu_clsf", "");	
		for(int i = 0; i < ds.issu_clsfcur.size(); i++) {
			PL_BAS_1600_MISSU_CLSFCURRecord rec = (PL_BAS_1600_MISSU_CLSFCURRecord)ds.issu_clsfcur.get(i);
			int record = rx.add(issu_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** ISSU_CLSFCUR END */

		/****** MEDI_CLSFCUR BEGIN */
		int medi_clsf = rx.add(dataSet, "medi_clsf", "");	
		for(int i = 0; i < ds.medi_clsfcur.size(); i++) {
			PL_BAS_1600_MMEDI_CLSFCURRecord rec = (PL_BAS_1600_MMEDI_CLSFCURRecord)ds.medi_clsfcur.get(i);
			int record = rx.add(medi_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** MEDI_CLSFCUR END */

		/****** ISSU_CMPYCUR BEGIN */
		int issu_cmpy = rx.add(dataSet, "issu_cmpy", "");	
		for(int i = 0; i < ds.issu_cmpycur.size(); i++) {
			PL_BAS_1600_MISSU_CMPYCURRecord rec = (PL_BAS_1600_MISSU_CMPYCURRecord)ds.issu_cmpycur.get(i);
			int record = rx.add(issu_cmpy, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** ISSU_CMPYCUR END */

		/****** BASI_WHCUR BEGIN */
		int basi_wh = rx.add(dataSet, "basi_wh", "");	
		for(int i = 0; i < ds.basi_whcur.size(); i++) {
			PL_BAS_1600_MBASI_WHCURRecord rec = (PL_BAS_1600_MBASI_WHCURRecord)ds.basi_whcur.get(i);
			int record = rx.add(basi_wh, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** BASI_WHCUR END */

		/****** SER_NO_BASICUR BEGIN */
		int ser_no_basi = rx.add(dataSet, "ser_no_basi", "");	
		for(int i = 0; i < ds.ser_no_basicur.size(); i++) {
			PL_BAS_1600_MSER_NO_BASICURRecord rec = (PL_BAS_1600_MSER_NO_BASICURRecord)ds.ser_no_basicur.get(i);
			int record = rx.add(ser_no_basi, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** SER_NO_BASICUR END */
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
	<ISSU_CLSFCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</ISSU_CLSFCUR>
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
	<BASI_WHCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</BASI_WHCUR>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<SER_NO_BASICUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</SER_NO_BASICUR>
</dataSet>
*/
%>

<% /* 작성시간 : Mon May 18 10:36:27 KST 2009 */ %>