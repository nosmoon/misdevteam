<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.yadjm.rec.*
	,	chosun.ciis.hd.yadjm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_YADJM_2012_1221_LDataSet ds = (HD_YADJM_2012_1221_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_YADJM_2012_1221_LCURLISTRecord rec = (HD_YADJM_2012_1221_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "prsn_pens", rec.prsn_pens);
			rx.add(record, "pens_savg", rec.pens_savg);
			rx.add(record, "hous_subc_savg", rec.hous_subc_savg);
			rx.add(record, "multy_house_plan_savg", rec.multy_house_plan_savg);
			rx.add(record, "ltrm_hous_savg", rec.ltrm_hous_savg);
			rx.add(record, "labr_hous_savg", rec.labr_hous_savg);
			rx.add(record, "ltrm_stok_type_savg_incm_dduc1", rec.ltrm_stok_type_savg_incm_dduc1);
			rx.add(record, "ltrm_stok_type_savg_incm_dduc2", rec.ltrm_stok_type_savg_incm_dduc2);
			rx.add(record, "ltrm_stok_type_savg_incm_dduc3", rec.ltrm_stok_type_savg_incm_dduc3);
			rx.add(record, "lvcmpy_pens", rec.lvcmpy_pens);
			//rx.add(record, "prsn_pens", StringUtil.replaceToXml(rec.prsn_pens));
			//rx.add(record, "pens_savg", StringUtil.replaceToXml(rec.pens_savg));
			//rx.add(record, "hous_subc_savg", StringUtil.replaceToXml(rec.hous_subc_savg));
			//rx.add(record, "multy_house_plan_savg", StringUtil.replaceToXml(rec.multy_house_plan_savg));
			//rx.add(record, "ltrm_hous_savg", StringUtil.replaceToXml(rec.ltrm_hous_savg));
			//rx.add(record, "labr_hous_savg", StringUtil.replaceToXml(rec.labr_hous_savg));
			//rx.add(record, "ltrm_stok_type_savg_incm_dduc1", StringUtil.replaceToXml(rec.ltrm_stok_type_savg_incm_dduc1));
			//rx.add(record, "ltrm_stok_type_savg_incm_dduc2", StringUtil.replaceToXml(rec.ltrm_stok_type_savg_incm_dduc2));
			//rx.add(record, "ltrm_stok_type_savg_incm_dduc3", StringUtil.replaceToXml(rec.ltrm_stok_type_savg_incm_dduc3));
			//rx.add(record, "lvcmpy_pens", StringUtil.replaceToXml(rec.lvcmpy_pens));
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

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
TrustForm�� Instance ����ο� �����ؼ� ���
<hd_yadjm_2012_1221_l>
	<dataSet>
		<CURLIST>
			<record>
				<prsn_pens/>
				<pens_savg/>
				<hous_subc_savg/>
				<multy_house_plan_savg/>
				<ltrm_hous_savg/>
				<labr_hous_savg/>
				<ltrm_stok_type_savg_incm_dduc1/>
				<ltrm_stok_type_savg_incm_dduc2/>
				<ltrm_stok_type_savg_incm_dduc3/>
				<lvcmpy_pens/>
			</record>
		</CURLIST>
	</dataSet>
</hd_yadjm_2012_1221_l>
*/
%>

<% /* �ۼ��ð� : Wed Jan 16 02:00:27 KST 2013 */ %>