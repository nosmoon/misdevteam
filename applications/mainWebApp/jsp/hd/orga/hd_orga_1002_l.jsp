<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.orga.rec.*
	,	chosun.ciis.hd.orga.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_ORGA_1002_LDataSet ds = (HD_ORGA_1002_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "resForm", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_ORGA_1002_LCURLISTRecord rec = (HD_ORGA_1002_LCURLISTRecord)ds.curlist.get(i);
			rx.add(formData, "cmpy_cd", rec.cmpy_cd);
			rx.add(formData, "dept_cd", rec.dept_cd);
			rx.add(formData, "dept_nm", rec.dept_nm);
			rx.add(formData, "engl_nm", rec.engl_nm);
			rx.add(formData, "insd_dept_cd", rec.insd_dept_cd);
			rx.add(formData, "abrv_nm", rec.abrv_nm);
			rx.add(formData, "use_bgn_dt", rec.use_bgn_dt);
			rx.add(formData, "use_end_dt", rec.use_end_dt);
			rx.add(formData, "natn_cd", rec.natn_cd);
			rx.add(formData, "natn_nm", rec.natn_nm);
			rx.add(formData, "duty_area", rec.duty_area);
			rx.add(formData, "duty_area_nm", rec.duty_area_nm);
			rx.add(formData, "now_use_yn", rec.now_use_yn);
			rx.add(formData, "cost_dept_clsf", rec.cost_dept_clsf);
			rx.add(formData, "make_dept_clsf", rec.make_dept_clsf);
			rx.add(formData, "offi_nm", rec.offi_nm);
			rx.add(formData, "dept_team_nm", rec.dept_team_nm);
			rx.add(formData, "part_nm", rec.part_nm);
			rx.add(formData, "part_dn_nm", rec.part_dn_nm);
			rx.add(formData, "inhr_seq_1", rec.inhr_seq_1);
			rx.add(formData, "inhr_seq_2", rec.inhr_seq_2);
			rx.add(formData, "inhr_seq_3", rec.inhr_seq_3);
			rx.add(formData, "supr_dept_cd", rec.supr_dept_cd);
			rx.add(formData, "srt_seq_1", rec.srt_seq_1);
			rx.add(formData, "srt_seq_2", rec.srt_seq_2);
			rx.add(formData, "cost_dstb_cd", rec.cost_dstb_cd);
			rx.add(formData, "cost_dstb_cd_1", rec.cost_dstb_cd_1);
			rx.add(formData, "cost_dstb_cd_2", rec.cost_dstb_cd_2);
			rx.add(formData, "cost_part_cd", rec.cost_part_cd);
			rx.add(formData, "prt_plac_clsf", rec.prt_plac_clsf);
			rx.add(formData, "dept_team_clsf", rec.dept_team_clsf);
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
			<dept_cd/>
			<dept_nm/>
			<engl_nm/>
			<insd_dept_cd/>
			<abrv_nm/>
			<use_bgn_dt/>
			<use_end_dt/>
			<natn_cd/>
			<duty_area/>
			<now_use_yn/>
			<cost_dept_clsf/>
			<offi_nm/>
			<dept_team_nm/>
			<part_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Feb 16 13:30:33 KST 2009 */ %>