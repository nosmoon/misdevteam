<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.cost.rec.*
	,	chosun.ciis.mc.cost.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_COST_1011_LDataSet ds = (MC_COST_1011_LDataSet)request.getAttribute("ds");
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
			MC_COST_1011_LCURLISTRecord rec = (MC_COST_1011_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "offi_nm", rec.offi_nm);
			//rx.add(record, "dept_cd", rec.dept_cd);
			//rx.add(record, "abrv_nm", rec.abrv_nm);
			//rx.add(record, "cost_dstb_cd", rec.cost_dstb_cd);
			//rx.add(record, "cost_dstb_cdnm", rec.cost_dstb_cdnm);
			//rx.add(record, "cost_dstb_cd_1", rec.cost_dstb_cd_1);
			//rx.add(record, "cost_dstb_cdnm_1", rec.cost_dstb_cdnm_1);
			//rx.add(record, "cost_dstb_cd_2", rec.cost_dstb_cd_2);
			//rx.add(record, "cost_dstb_cdnm_2", rec.cost_dstb_cdnm_2);
			//rx.add(record, "cost_dept_clsf", rec.cost_dept_clsf);
			//rx.add(record, "prt_plac_yn", rec.prt_plac_yn);
			rx.add(record, "offi_nm", StringUtil.replaceToXml(rec.offi_nm));
			rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			rx.add(record, "abrv_nm", StringUtil.replaceToXml(rec.abrv_nm));
			rx.add(record, "cost_dstb_cd", StringUtil.replaceToXml(rec.cost_dstb_cd));
			rx.add(record, "cost_dstb_cdnm", StringUtil.replaceToXml(rec.cost_dstb_cdnm));
			rx.add(record, "cost_dstb_cd_1", StringUtil.replaceToXml(rec.cost_dstb_cd_1));
			rx.add(record, "cost_dstb_cdnm_1", StringUtil.replaceToXml(rec.cost_dstb_cdnm_1));
			rx.add(record, "cost_dstb_cd_2", StringUtil.replaceToXml(rec.cost_dstb_cd_2));
			rx.add(record, "cost_dstb_cdnm_2", StringUtil.replaceToXml(rec.cost_dstb_cdnm_2));
			rx.add(record, "cost_dept_clsf", StringUtil.replaceToXml(rec.cost_dept_clsf));
			rx.add(record, "prt_plac_yn", StringUtil.replaceToXml(rec.prt_plac_yn));
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
<mc_cost_1011_l>
	<dataSet>
		<CURLIST>
			<record>
				<offi_nm/>
				<dept_cd/>
				<abrv_nm/>
				<cost_dstb_cd/>
				<cost_dstb_cdnm/>
				<cost_dstb_cd_1/>
				<cost_dstb_cdnm_1/>
				<cost_dstb_cd_2/>
				<cost_dstb_cdnm_2/>
				<cost_dept_clsf/>
				<prt_plac_yn/>
			</record>
		</CURLIST>
	</dataSet>
</mc_cost_1011_l>
*/
%>

<% /* 작성시간 : Fri Apr 24 15:29:39 KST 2009 */ %>