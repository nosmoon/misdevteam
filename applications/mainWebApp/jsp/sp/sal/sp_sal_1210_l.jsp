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
	SP_SAL_1210_LDataSet ds = (SP_SAL_1210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			SP_SAL_1210_LCURLIST1Record rec = (SP_SAL_1210_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "mang_no", rec.mang_no);
			rx.add(record, "entr_fee", rec.entr_fee);
			rx.add(record, "phon_hdqt_fee", rec.phon_hdqt_fee);
			rx.add(record, "hzone_use_fee", rec.hzone_use_fee);
			rx.add(record, "ictry_tel_fee", rec.ictry_tel_fee);
			rx.add(record, "p00755tel_fee", rec.p00755tel_fee);
			rx.add(record, "intl_tel_fee", rec.intl_tel_fee);
			rx.add(record, "movm_tel_fee", rec.movm_tel_fee);
			rx.add(record, "onnet_curc_fee", rec.onnet_curc_fee);
			rx.add(record, "p070curc_fee", rec.p070curc_fee);
			rx.add(record, "in_pre_curc_fee", rec.in_pre_curc_fee);
			rx.add(record, "appm_curc_fee", rec.appm_curc_fee);
			rx.add(record, "img_curc_fee", rec.img_curc_fee);
			rx.add(record, "sms_use_fee", rec.sms_use_fee);
			rx.add(record, "supl_use_fee", rec.supl_use_fee);
			rx.add(record, "sound_src_make_fee", rec.sound_src_make_fee);
			rx.add(record, "frft", rec.frft);
			rx.add(record, "use_prd", rec.use_prd);
			rx.add(record, "chg_matt", rec.chg_matt);
			rx.add(record, "flag", rec.flag);
		}
		/****** CURLIST1 END */
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
<sp_sal_1210_l>
	<dataSet>
		<CURLIST1>
			<record>
				<seq/>
				<dlco_no/>
				<dlco_nm/>
				<sale_yymm/>
				<sale_seq/>
				<mang_no/>
				<entr_fee/>
				<phon_hdqt_fee/>
				<rent/>
				<hzone_use_fee/>
				<ictry_tel_fee/>
				<p00755tel_fee/>
				<intl_tel_fee/>
				<movm_tel_fee/>
				<onnet_curc_fee/>
				<p070curc_fee/>
				<in_pre_curc_fee/>
				<appm_curc_fee/>
				<img_curc_fee/>
				<sms_use_fee/>
				<supl_use_fee/>
				<sound_src_make_fee/>
				<frft/>
				<entr_fee_dscn/>
				<base_fee_dscn/>
				<rent_dscn/>
				<ictry_tel_dscn/>
				<hzone_dscn/>
				<movm_tel_dscn/>
				<intl_tel_dscn/>
				<p00755dscn/>
				<p070curc_dscn/>
				<in_pre_curc_dscn/>
				<appm_curc_dscn/>
				<cntr_prd_dscn/>
				<midl_plac_cmpy_dscn/>
				<onnet_dscn/>
				<etc_dscn/>
				<auto_shift_dscn/>
				<use_fee_tot/>
				<vat/>
				<stot/>
				<use_pers/>
				<use_prd/>
				<chg_matt/>
			</record>
		</CURLIST1>
	</dataSet>
</sp_sal_1210_l>
*/
%>

<% /* 작성시간 : Thu Jul 12 19:06:50 KST 2012 */ %>