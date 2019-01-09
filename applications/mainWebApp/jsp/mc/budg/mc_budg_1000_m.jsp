<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mc.budg.rec.*
	,	chosun.ciis.mc.budg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_BUDG_1000_MDataSet ds = (MC_BUDG_1000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_cd_010", ds.getXx_cd_010());
		rx.add(dataSet, "xx_cd_020", ds.getXx_cd_020());
		rx.add(dataSet, "xx_cd_clsf_060", ds.getXx_cd_clsf_060());
		rx.add(dataSet, "xx_whco_ndstb_cd", ds.getXx_whco_ndstb_cd());
		rx.add(dataSet, "xx_medi_dstb_cd", ds.getXx_medi_dstb_cd());
		rx.add(dataSet, "xx_job_clsf_10", ds.getXx_job_clsf_10());
		rx.add(dataSet, "xx_cd_clsf_050", ds.getXx_cd_clsf_050());
		
		/****** CURDRCR_BUDG BEGIN */
		recordSet = rx.add(dataSet, "CURDRCR_BUDG", "");

		for(int i = 0; i < ds.curdrcr_budg.size(); i++) {
			MC_BUDG_1000_MCURDRCR_BUDGRecord rec = (MC_BUDG_1000_MCURDRCR_BUDGRecord)ds.curdrcr_budg.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.curdrcr_budg.size());
		/****** CURDRCR_BUDG END */

		/****** CURDRCR_MANG BEGIN */
		recordSet = rx.add(dataSet, "CURDRCR_MANG", "");

		for(int i = 0; i < ds.curdrcr_mang.size(); i++) {
			MC_BUDG_1000_MCURDRCR_MANGRecord rec = (MC_BUDG_1000_MCURDRCR_MANGRecord)ds.curdrcr_mang.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.curdrcr_mang.size());
		/****** CURDRCR_MANG END */

		/****** CURDRCR_MANG_CLSF BEGIN */
		recordSet = rx.add(dataSet, "CURDRCR_MANG_CLSF", "");

		for(int i = 0; i < ds.curdrcr_mang_clsf.size(); i++) {
			MC_BUDG_1000_MCURDRCR_MANG_CLSFRecord rec = (MC_BUDG_1000_MCURDRCR_MANG_CLSFRecord)ds.curdrcr_mang_clsf.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.curdrcr_mang_clsf.size());
		/****** CURDRCR_MANG_CLSF END */

		/****** CURDRCR_DTL BEGIN */
		recordSet = rx.add(dataSet, "CURDRCR_DTL", "");

		for(int i = 0; i < ds.curdrcr_dtl.size(); i++) {
			MC_BUDG_1000_MCURDRCR_DTLRecord rec = (MC_BUDG_1000_MCURDRCR_DTLRecord)ds.curdrcr_dtl.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.curdrcr_dtl.size());
		/****** CURDRCR_DTL END */

		/****** CURDRCR_COMPGB BEGIN */
		recordSet = rx.add(dataSet, "CURDRCR_COMPGB", "");

		for(int i = 0; i < ds.curdrcr_compgb.size(); i++) {
			MC_BUDG_1000_MCURDRCR_COMPGBRecord rec = (MC_BUDG_1000_MCURDRCR_COMPGBRecord)ds.curdrcr_compgb.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.curdrcr_compgb.size());
		/****** CURDRCR_COMPGB END */

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
	<CURDRCR_BUDG>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CURDRCR_BUDG>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURDRCR_MANG>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CURDRCR_MANG>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURDRCR_MANG_CLSF>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CURDRCR_MANG_CLSF>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURDRCR_DTL>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CURDRCR_DTL>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURDRCR_COMPGB>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CURDRCR_COMPGB>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Mar 20 16:40:57 KST 2009 */ %>