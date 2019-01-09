<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.hlywrk.rec.*
	,	chosun.ciis.hd.hlywrk.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_HLYWRK_1001_344_LDataSet ds = (HD_HLYWRK_1001_344_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
	//	recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_HLYWRK_1001_344_LCURLISTRecord rec = (HD_HLYWRK_1001_344_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "aply_basi_dt", rec.aply_basi_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "hody_clsf", rec.hody_clsf);
			rx.add(record, "obj_clsf", rec.obj_clsf);
			rx.add(record, "prsnt_hody_clsf", rec.prsnt_hody_clsf);
			rx.add(record, "finish_hody_clsf", rec.finish_hody_clsf);
			rx.add(record, "prsnt_tm", rec.prsnt_tm);
			rx.add(record, "finish_tm", rec.finish_tm);
			rx.add(record, "finish_dd_clsf", rec.finish_dd_clsf);
			rx.add(record, "duty_tm", rec.duty_tm);
			rx.add(record, "alvc_occr_yn", rec.alvc_occr_yn);
			rx.add(record, "base_alon", rec.base_alon);
			rx.add(record, "cmpn_alon", rec.cmpn_alon);
			rx.add(record, "tot_alon", rec.tot_alon);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "aply_basi_dt", StringUtil.replaceToXml(rec.aply_basi_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "hody_clsf", StringUtil.replaceToXml(rec.hody_clsf));
			//rx.add(record, "obj_clsf", StringUtil.replaceToXml(rec.obj_clsf));
			//rx.add(record, "prsnt_hody_clsf", StringUtil.replaceToXml(rec.prsnt_hody_clsf));
			//rx.add(record, "finish_hody_clsf", StringUtil.replaceToXml(rec.finish_hody_clsf));
			//rx.add(record, "prsnt_tm", StringUtil.replaceToXml(rec.prsnt_tm));
			//rx.add(record, "finish_tm", StringUtil.replaceToXml(rec.finish_tm));
			//rx.add(record, "finish_dd_clsf", StringUtil.replaceToXml(rec.finish_dd_clsf));
			//rx.add(record, "duty_tm", StringUtil.replaceToXml(rec.duty_tm));
			//rx.add(record, "alvc_occr_yn", StringUtil.replaceToXml(rec.alvc_occr_yn));
			//rx.add(record, "base_alon", StringUtil.replaceToXml(rec.base_alon));
			//rx.add(record, "cmpn_alon", StringUtil.replaceToXml(rec.cmpn_alon));
			//rx.add(record, "tot_alon", StringUtil.replaceToXml(rec.tot_alon));
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
TrustForm의 Instance 선언부에 복사해서 사용
<hd_hlywrk_1001_344_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<aply_basi_dt/>
				<seq/>
				<hody_clsf/>
				<obj_clsf/>
				<prsnt_hody_clsf/>
				<finish_hody_clsf/>
				<prsnt_tm/>
				<finish_tm/>
				<finish_dd_clsf/>
				<duty_tm/>
				<alvc_occr_yn/>
				<base_alon/>
				<cmpn_alon/>
				<tot_alon/>
			</record>
		</CURLIST>
	</dataSet>
</hd_hlywrk_1001_344_l>
*/
%>

<% /* 작성시간 : Mon Oct 08 19:21:15 KST 2012 */ %>