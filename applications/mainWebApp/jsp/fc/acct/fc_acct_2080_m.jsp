<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2080_MDataSet ds = (FC_ACCT_2080_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CUR_WHCO_NDSTB_CD_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_WHCO_NDSTB_CD_LIST", "");

		for(int i = 0; i < ds.cur_whco_ndstb_cd_list.size(); i++) {
			FC_ACCT_2080_MCUR_WHCO_NDSTB_CD_LISTRecord rec = (FC_ACCT_2080_MCUR_WHCO_NDSTB_CD_LISTRecord)ds.cur_whco_ndstb_cd_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "whco_ndstb_cd", rec.whco_ndstb_cd);
			rx.add(record, "whco_comn_cost_yn", rec.whco_comn_cost_yn);
		}
		rx.add(recordSet, "totalcnt", ds.cur_whco_ndstb_cd_list.size());
		/****** CUR_WHCO_NDSTB_CD_LIST END */

		/****** CUR_MANG_ITEM_CD_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_MANG_ITEM_CD_LIST", "");

		for(int i = 0; i < ds.cur_mang_item_cd_list.size(); i++) {
			FC_ACCT_2080_MCUR_MANG_ITEM_CD_LISTRecord rec = (FC_ACCT_2080_MCUR_MANG_ITEM_CD_LISTRecord)ds.cur_mang_item_cd_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "mang_item_cd", rec.mang_item_cd);
			rx.add(record, "drcr_clsf", rec.drcr_clsf);
		}
		rx.add(recordSet, "totalcnt", ds.cur_mang_item_cd_list.size());
		/****** CUR_MANG_ITEM_CD_LIST END */

		/****** CUR_INCM_CLSF_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_INCM_CLSF_LIST", "");

		for(int i = 0; i < ds.cur_incm_clsf_list.size(); i++) {
			FC_ACCT_2080_MCUR_INCM_CLSF_LISTRecord rec = (FC_ACCT_2080_MCUR_INCM_CLSF_LISTRecord)ds.cur_incm_clsf_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.cur_incm_clsf_list.size());
		/****** CUR_INCM_CLSF_LIST END */

		/****** CUR_ERPLACE_CD_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_ERPLACE_CD_LIST", "");

		for(int i = 0; i < ds.cur_erplace_cd_list.size(); i++) {
			FC_ACCT_2080_MCUR_ERPLACE_CD_LISTRecord rec = (FC_ACCT_2080_MCUR_ERPLACE_CD_LISTRecord)ds.cur_erplace_cd_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.cur_erplace_cd_list.size());
		/****** CUR_ERPLACE_CD_LIST END */

		/****** CUR_PROF_TYPE_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_PROF_TYPE_LIST", "");

		for(int i = 0; i < ds.cur_prof_type_list.size(); i++) {
			FC_ACCT_2080_MCUR_PROF_TYPE_LISTRecord rec = (FC_ACCT_2080_MCUR_PROF_TYPE_LISTRecord)ds.cur_prof_type_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.cur_prof_type_list.size());
		/****** CUR_PROF_TYPE_LIST END */

		/****** CUR_BUDGMANGCD_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_BUDGMANGCD_LIST", "");

		for(int i = 0; i < ds.cur_budgmangcd_list.size(); i++) {
			FC_ACCT_2080_MCUR_BUDGMANGCD_LISTRecord rec = (FC_ACCT_2080_MCUR_BUDGMANGCD_LISTRecord)ds.cur_budgmangcd_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
		}
		rx.add(recordSet, "totalcnt", ds.cur_budgmangcd_list.size());
		/****** CUR_BUDGMANGCD_LIST END */

		/****** CUR_SLIP_CLSF_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_SLIP_CLSF_LIST", "");

		for(int i = 0; i < ds.cur_slip_clsf_list.size(); i++) {
			FC_ACCT_2080_MCUR_SLIP_CLSF_LISTRecord rec = (FC_ACCT_2080_MCUR_SLIP_CLSF_LISTRecord)ds.cur_slip_clsf_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.cur_slip_clsf_list.size());
		/****** CUR_SLIP_CLSF_LIST END */

		/****** CUR_DLCO_CLSF_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_DLCO_CLSF_LIST", "");

		for(int i = 0; i < ds.cur_dlco_clsf_list.size(); i++) {
			FC_ACCT_2080_MCUR_DLCO_CLSF_LISTRecord rec = (FC_ACCT_2080_MCUR_DLCO_CLSF_LISTRecord)ds.cur_dlco_clsf_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
		}
		rx.add(recordSet, "totalcnt", ds.cur_dlco_clsf_list.size());
		/****** CUR_DLCO_CLSF_LIST END */

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
	<CUR_WHCO_NDSTB_CD_LIST>
		<record>
			<whco_ndstb_cd/>
			<whco_comn_cost_yn/>
		</record>
	</CUR_WHCO_NDSTB_CD_LIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CUR_MANG_ITEM_CD_LIST>
		<record>
			<mang_item_cd/>
			<drcr_clsf/>
		</record>
	</CUR_MANG_ITEM_CD_LIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CUR_INCM_CLSF_LIST>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CUR_INCM_CLSF_LIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CUR_ERPLACE_CD_LIST>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CUR_ERPLACE_CD_LIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CUR_PROF_TYPE_LIST>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CUR_PROF_TYPE_LIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CUR_BUDGMANGCD_LIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</CUR_BUDGMANGCD_LIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CUR_SLIP_CLSF_LIST>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CUR_SLIP_CLSF_LIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CUR_DLCO_CLSF_LIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</CUR_DLCO_CLSF_LIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Feb 20 21:07:42 KST 2009 */ %>