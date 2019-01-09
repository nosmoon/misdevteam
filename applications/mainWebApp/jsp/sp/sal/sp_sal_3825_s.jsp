<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sal.rec.*
	,	chosun.ciis.sp.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SAL_3825_SDataSet ds = (SP_SAL_3825_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resForm   = rx.add(root, "resForm", "");

	try {
		/****** CURLIST BEGIN */
		int gridData3 = rx.add(resForm, "gridData3", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			SP_SAL_3825_SCURLISTRecord rec = (SP_SAL_3825_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData3, "record", "");
			rx.add(record, "a_sale_yymm", rec.a_sale_yymm);
			rx.add(record, "a_sale_seq", rec.a_sale_seq);
			rx.add(record, "a_sale_item_cd_nm", rec.a_sale_item_cd_nm);
			rx.add(record, "a_suply_amt", rec.a_suply_amt);
			rx.add(record, "a_vat_amt", rec.a_vat_amt);
			rx.add(record, "a_tot_rvord_amt", rec.a_tot_rvord_amt);
		}
		/****** CURLIST END */
		
		rx.add(resForm, "prof_type_cd", ds.prof_type_cd);
		rx.add(resForm, "slip_clsf_cd", ds.slip_clsf_cd);
		rx.add(resForm, "slip_occr_dt", ds.slip_occr_dt);
		rx.add(resForm, "slip_seq", ds.slip_seq);
		rx.add(resForm, "re_issu_resn_cd", ds.re_issu_resn_cd);
		rx.add(resForm, "canc_yn", ds.canc_yn);
		rx.add(resForm, "issu_tms", ds.issu_tms);
		rx.add(resForm, "suply_erplace_cd", ds.suply_erplace_cd);
		rx.add(resForm, "make_dt", ds.make_dt); 
		rx.add(resForm, "tax_item", ds.tax_item);
		rx.add(resForm, "suply_amt", ds.suply_amt);
		rx.add(resForm, "vat_amt", ds.vat_amt);
		rx.add(resForm, "tot_amt", ds. tot_amt);
		rx.add(resForm, "demand_ern", ds.demand_ern);
		rx.add(resForm, "demand_dlco_no", ds.demand_dlco_no);
		rx.add(resForm, "demand_dlco_nm", ds.demand_dlco_nm);
		rx.add(resForm, "demand_dlco_abrv_nm", ds.demand_dlco_abrv_nm);
		rx.add(resForm, "demand_presi_nm", ds.demand_presi_nm);
		rx.add(resForm, "biz_plc_cd", ds.demand_biz_plc);	/**종사업장**/
		//rx.add(resForm, "remk", ds.remk);	/**비고**/
		rx.add(resForm, "demand_addr", ds.demand_addr);
		rx.add(resForm, "demand_bizcond", ds.demand_bizcond);
		rx.add(resForm, "demand_item", ds.demand_item);
		rx.add(resForm, "email_id", ds.email_id);
		rx.add(resForm, "elec_tax_comp_cd", ds.elec_tax_comp_cd);
		rx.add(resForm, "semuro_no", ds.semuro_no);
		rx.add(resForm, "flag", "U");

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<sp_sal_3825_s>
	<dataSet>
		<CURLIST>
			<record>
				<a_sale_yymm/>
				<a_sale_seq/>
				<a_sale_item_cd_nm/>
				<a_suply_amt/>
				<a_vat_amt/>
				<a_tot_rvord_amt/>
			</record>
		</CURLIST>
	</dataSet>
</sp_sal_3825_s>
*/
%>

<% /* 작성시간 : Thu Aug 02 17:57:43 KST 2012 */ %>