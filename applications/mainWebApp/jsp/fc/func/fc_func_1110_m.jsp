<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_1110_MDataSet ds = (FC_FUNC_1110_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");
	
	rx.add(dataSet, "xx_budg_cd_010", ds.getXx_budg_cd_010());
	rx.add(dataSet, "xx_budg_cd_020", ds.getXx_budg_cd_020());
	rx.add(dataSet, "xx_budg_cd_030", ds.getXx_budg_cd_030());
	rx.add(dataSet, "xx_budg_cd_040", ds.getXx_budg_cd_040());
	rx.add(dataSet, "xx_budg_cd_050", ds.getXx_budg_cd_050());
	rx.add(dataSet, "xx_budg_cd_060", ds.getXx_budg_cd_060());
	rx.add(dataSet, "xx_budg_cd_070", ds.getXx_budg_cd_070());
	rx.add(dataSet, "xx_budg_cd_080", ds.getXx_budg_cd_080());
	rx.add(dataSet, "xx_budg_cd_090", ds.getXx_budg_cd_090());
	rx.add(dataSet, "xx_occr_slip_clsf", ds.getXx_occr_slip_clsf());
	rx.add(dataSet, "xx_trufnd_slip_no", ds.getXx_trufnd_slip_no());
	rx.add(dataSet, "xx_mang_cd_4", ds.getXx_mang_cd_4());

	try {
		/****** CURDRCR_BAL_FREX_CD BEGIN */
		recordSet = rx.add(dataSet, "CURDRCR_BAL_FREX_CD", "");

		for(int i = 0; i < ds.curdrcr_bal_frex_cd.size(); i++) {
			FC_FUNC_1110_MCURDRCR_BAL_FREX_CDRecord rec = (FC_FUNC_1110_MCURDRCR_BAL_FREX_CDRecord)ds.curdrcr_bal_frex_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.curdrcr_bal_frex_cd.size());
		/****** CURDRCR_BAL_FREX_CD END */

		/****** CURDRCR_BAL_DEPS_CLSF_CD BEGIN */
		recordSet = rx.add(dataSet, "CURDRCR_BAL_DEPS_CLSF_CD", "");

		for(int i = 0; i < ds.curdrcr_bal_deps_clsf_cd.size(); i++) {
			FC_FUNC_1110_MCURDRCR_BAL_DEPS_CLSF_CDRecord rec = (FC_FUNC_1110_MCURDRCR_BAL_DEPS_CLSF_CDRecord)ds.curdrcr_bal_deps_clsf_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.curdrcr_bal_deps_clsf_cd.size());
		/****** CURDRCR_BAL_DEPS_CLSF_CD END */

		
		/****** XX_BUDG_CD_100 BEGIN */
		recordSet = rx.add(dataSet, "XX_BUDG_CD_100", "");

		for(int i = 0; i < ds.xx_budg_cd_100.size(); i++) {
			FC_FUNC_1110_MXX_BUDG_CD_100Record rec = (FC_FUNC_1110_MXX_BUDG_CD_100Record)ds.xx_budg_cd_100.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_abrv_nm", rec.budg_abrv_nm);
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_abrv_nm", StringUtil.replaceToXml(rec.budg_abrv_nm));
		}
		rx.add(recordSet, "totalcnt", ds.xx_budg_cd_100.size());
		/****** XX_BUDG_CD_100 END */
		
		/****** XX_BUDG_CD_110 BEGIN */
		recordSet = rx.add(dataSet, "XX_BUDG_CD_110", "");

		for(int i = 0; i < ds.xx_budg_cd_110.size(); i++) {
			FC_FUNC_1110_MXX_BUDG_CD_110Record rec = (FC_FUNC_1110_MXX_BUDG_CD_110Record)ds.xx_budg_cd_110.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_abrv_nm", rec.budg_abrv_nm);
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_abrv_nm", StringUtil.replaceToXml(rec.budg_abrv_nm));
		}
		rx.add(recordSet, "totalcnt", ds.xx_budg_cd_110.size());
		/****** XX_BUDG_CD_110 END */
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
	<CURDRCR_BAL_FREX_CD>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CURDRCR_BAL_FREX_CD>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURDRCR_BAL_DEPS_CLSF_CD>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CURDRCR_BAL_DEPS_CLSF_CD>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Feb 25 18:01:06 KST 2009 */ %>