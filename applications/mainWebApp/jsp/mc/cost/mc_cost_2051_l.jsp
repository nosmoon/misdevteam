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
	MC_COST_2051_LDataSet ds = (MC_COST_2051_LDataSet)request.getAttribute("ds");
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
			MC_COST_2051_LCURLISTRecord rec = (MC_COST_2051_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "intfce_yn", rec.intfce_yn);
			rx.add(record, "cost_dstb_cd", rec.cost_dstb_cd);
			rx.add(record, "cost_dstb_cdnm", rec.cost_dstb_cdnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "offi_nm", rec.offi_nm);
			rx.add(record, "dept_cdnm", rec.dept_cdnm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_cdnm", rec.medi_cdnm);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "ratio1", rec.ratio1);
			rx.add(record, "ratio2", rec.ratio2);
			rx.add(record, "key_cost_dstb_cd", rec.key_cost_dstb_cd);
			rx.add(record, "key_dept_cd", rec.key_dept_cd);
			rx.add(record, "key_medi_cd", rec.key_medi_cd);
			//rx.add(record, "intfce_yn", StringUtil.replaceToXml(rec.intfce_yn));
			//rx.add(record, "cost_dstb_cd", StringUtil.replaceToXml(rec.cost_dstb_cd));
			//rx.add(record, "cost_dstb_cdnm", StringUtil.replaceToXml(rec.cost_dstb_cdnm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "offi_nm", StringUtil.replaceToXml(rec.offi_nm));
			//rx.add(record, "dept_cdnm", StringUtil.replaceToXml(rec.dept_cdnm));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "medi_cdnm", StringUtil.replaceToXml(rec.medi_cdnm));
			//rx.add(record, "qunt", StringUtil.replaceToXml(rec.qunt));
			//rx.add(record, "ratio1", StringUtil.replaceToXml(rec.ratio1));
			//rx.add(record, "ratio2", StringUtil.replaceToXml(rec.ratio2));
			//rx.add(record, "key_cost_dstb_cd", StringUtil.replaceToXml(rec.key_cost_dstb_cd));
			//rx.add(record, "key_dept_cd", StringUtil.replaceToXml(rec.key_dept_cd));
			//rx.add(record, "key_medi_cd", StringUtil.replaceToXml(rec.key_medi_cd));
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
<mc_cost_2051_l>
	<dataSet>
		<CURLIST>
			<record>
				<intfce_yn/>
				<cost_dstb_cd/>
				<cost_dstb_cdnm/>
				<dept_cd/>
				<offi_nm/>
				<dept_cdnm/>
				<medi_cd/>
				<medi_cdnm/>
				<qunt/>
				<ratio1/>
				<ratio2/>
				<key_cost_dstb_cd/>
				<key_dept_cd/>
				<key_medi_cd/>
			</record>
		</CURLIST>
	</dataSet>
</mc_cost_2051_l>
*/
%>

<% /* 작성시간 : Mon Jul 20 15:26:36 KST 2009 */ %>