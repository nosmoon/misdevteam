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
* 파일명 : pl_bas_1200_m.jsp
* 기능 : 
* 작성일자 : 2009-03-04
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
	PL_BAS_1200_MDataSet ds = (PL_BAS_1200_MDataSet)request.getAttribute("ds");
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
			PL_BAS_1200_MDLCO_CLSFCURRecord rec = (PL_BAS_1200_MDLCO_CLSFCURRecord)ds.dlco_clsfcur.get(i);
			int record = rx.add(dlco_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** DLCO_CLSFCUR END */

		/****** AREACUR BEGIN */
		int area = rx.add(dataSet, "area", "");	
		for(int i = 0; i < ds.areacur.size(); i++) {
			PL_BAS_1200_MAREACURRecord rec = (PL_BAS_1200_MAREACURRecord)ds.areacur.get(i);
			int record = rx.add(area, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cd_abrv_nm);
		}
		/****** AREACUR END */

		/****** WH_CDCUR BEGIN */
		int wh_cd = rx.add(dataSet, "wh_cd", "");	
		for(int i = 0; i < ds.wh_cdcur.size(); i++) {
			PL_BAS_1200_MWH_CDCURRecord rec = (PL_BAS_1200_MWH_CDCURRecord)ds.wh_cdcur.get(i);
			int record = rx.add(wh_cd, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** WH_CDCUR END */

		/****** SENDCLSFCUR BEGIN */
		int sendclsf = rx.add(dataSet, "sendclsf", "");	
		for(int i = 0; i < ds.sendclsfcur.size(); i++) {
			PL_BAS_1200_MSENDCLSFCURRecord rec = (PL_BAS_1200_MSENDCLSFCURRecord)ds.sendclsfcur.get(i);
			int record = rx.add(sendclsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** SENDCLSFCUR END */

		/****** COLT_CLSFCUR BEGIN */
		int colt_clsf = rx.add(dataSet, "colt_clsf", "");	
		for(int i = 0; i < ds.colt_clsfcur.size(); i++) {
			PL_BAS_1200_MCOLT_CLSFCURRecord rec = (PL_BAS_1200_MCOLT_CLSFCURRecord)ds.colt_clsfcur.get(i);
			int record = rx.add(colt_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** COLT_CLSFCUR END */

		/****** SETUP_STATCUR BEGIN */
		int setup_stat = rx.add(dataSet, "setup_stat", "");	
		for(int i = 0; i < ds.setup_statcur.size(); i++) {
			PL_BAS_1200_MSETUP_STATCURRecord rec = (PL_BAS_1200_MSETUP_STATCURRecord)ds.setup_statcur.get(i);
			int record = rx.add(setup_stat, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** SETUP_STATCUR END */

		/****** RSHPCUR BEGIN */
		int rshp = rx.add(dataSet, "rshp", "");	
		for(int i = 0; i < ds.rshpcur.size(); i++) {
			PL_BAS_1200_MRSHPCURRecord rec = (PL_BAS_1200_MRSHPCURRecord)ds.rshpcur.get(i);
			int record = rx.add(rshp, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** RSHPCUR END */

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
	<COLT_CLSFCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</COLT_CLSFCUR>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<SETUP_STATCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</SETUP_STATCUR>
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
	<RSHPCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</RSHPCUR>
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

<% /* 작성시간 : Wed Mar 04 12:56:30 KST 2009 */ %>