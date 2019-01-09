<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_1042_LDataSet ds = (HD_INFO_1042_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int record = 0;
	record = rx.add(root, "resForm", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1042_LCURLISTRecord rec = (HD_INFO_1042_LCURLISTRecord)ds.curlist.get(i);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "army_clsf_cd", rec.army_clsf_cd);
			rx.add(record, "forc_clsi_cd", rec.forc_clsi_cd);
			rx.add(record, "army_svc_cd", rec.army_svc_cd);
			rx.add(record, "cmmd_army_part_cd", rec.cmmd_army_part_cd);
			rx.add(record, "cmmd_army_part_nm", rec.cmmd_army_part_nm);
			rx.add(record, "sold_main_spc_cd", rec.sold_main_spc_cd);
			rx.add(record, "sold_main_spc_nm", rec.sold_main_spc_nm);
			rx.add(record, "army_cd", rec.army_cd);
			rx.add(record, "crps_spc_cd", rec.crps_spc_cd);
			rx.add(record, "cls_cd", rec.cls_cd);
			rx.add(record, "forc_no", rec.forc_no);
			rx.add(record, "in_army_dt", rec.in_army_dt);
			rx.add(record, "out_army_dt", rec.out_army_dt);
			rx.add(record, "out_army_clsf_cd", rec.out_army_clsf_cd);
			rx.add(record, "army_un_finsh_resn_cd", rec.army_un_finsh_resn_cd);
			rx.add(record, "rsv_forc_form_cd", rec.rsv_forc_form_cd);
			rx.add(record, "rsv_forc_form_dt", rec.rsv_forc_form_dt);
		}
		/****** CURLIST END */

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
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<emp_no/>
			<army_clsf_cd/>
			<army_clsi_cd/>
			<army_svc_cd/>
			<cmmd_army_part_cd/>
			<sold_main_spc_cd/>
			<crps_spc_cd/>
			<cls_cd/>
			<forc_no/>
			<in_army_dt/>
			<out_army_dt/>
			<out_army_clsf_cd/>
			<army_un_finish_resn_cd/>
			<rsv_forc_form_cd/>
			<rsv_forc_form_dt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Feb 04 13:01:26 KST 2009 */ %>