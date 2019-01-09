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
	MC_COST_2016_LDataSet ds = (MC_COST_2016_LDataSet)request.getAttribute("ds");
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
			MC_COST_2016_LCURLISTRecord rec = (MC_COST_2016_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "intfce_yn", rec.intfce_yn);
			rx.add(record, "cost_dstb_cd", rec.cost_dstb_cd);
			rx.add(record, "cost_dstb_cdnm", rec.cost_dstb_cdnm);
			rx.add(record, "dept_cdnm", rec.dept_cdnm);
			rx.add(record, "medi_cdnm", rec.medi_cdnm);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "ratio1", rec.ratio1);
			rx.add(record, "ratio2", rec.ratio2);
			//rx.add(record, "intfce_yn", StringUtil.replaceToXml(rec.intfce_yn));
			//rx.add(record, "cost_dstb_cd", StringUtil.replaceToXml(rec.cost_dstb_cd));
			//rx.add(record, "cost_dstb_cdnm", StringUtil.replaceToXml(rec.cost_dstb_cdnm));
			//rx.add(record, "dept_cdnm", StringUtil.replaceToXml(rec.dept_cdnm));
			//rx.add(record, "medi_cdnm", StringUtil.replaceToXml(rec.medi_cdnm));
			//rx.add(record, "qunt", StringUtil.replaceToXml(rec.qunt));
			//rx.add(record, "ratio1", StringUtil.replaceToXml(rec.ratio1));
			//rx.add(record, "ratio2", StringUtil.replaceToXml(rec.ratio2));
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
<mc_cost_2016_l>
	<dataSet>
		<CURLIST>
			<record>
				<intfce_yn/>
				<cost_dstb_cd/>
				<cost_dstb_cdnm/>
				<dept_cdnm/>
				<medi_cdnm/>
				<qunt/>
				<ratio1/>
				<ratio2/>
			</record>
		</CURLIST>
	</dataSet>
</mc_cost_2016_l>
*/
%>

<% /* 작성시간 : Thu May 07 15:01:54 KST 2009 */ %>