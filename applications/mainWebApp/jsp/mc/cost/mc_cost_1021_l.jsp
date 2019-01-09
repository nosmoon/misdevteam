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
	MC_COST_1021_LDataSet ds = (MC_COST_1021_LDataSet)request.getAttribute("ds");
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
			MC_COST_1021_LCURLISTRecord rec = (MC_COST_1021_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_cdnm", rec.budg_cdnm);
			rx.add(record, "medi_dstb_cd", rec.medi_dstb_cd);
			rx.add(record, "mccdnm", rec.mccdnm);
			rx.add(record, "dtls_medi_dstb_cd", rec.dtls_medi_dstb_cd);
			rx.add(record, "dtls_medi_dstb_cdnm", rec.dtls_medi_dstb_cdnm);
			rx.add(record, "whco_ndstb_cd", rec.whco_ndstb_cd);
			rx.add(record, "jscdnm", rec.jscdnm);
			rx.add(record, "whco_comn_cost_yn", rec.whco_comn_cost_yn);
			rx.add(record, "use_yn", rec.use_yn);
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_cdnm", StringUtil.replaceToXml(rec.budg_cdnm));
			//rx.add(record, "medi_dstb_cd", StringUtil.replaceToXml(rec.medi_dstb_cd));
			//rx.add(record, "mccdnm", StringUtil.replaceToXml(rec.mccdnm));
			//rx.add(record, "dtls_medi_dstb_cd", StringUtil.replaceToXml(rec.dtls_medi_dstb_cd));
			//rx.add(record, "dtls_medi_dstb_cdnm", StringUtil.replaceToXml(rec.dtls_medi_dstb_cdnm));
			//rx.add(record, "whco_ndstb_cd", StringUtil.replaceToXml(rec.whco_ndstb_cd));
			//rx.add(record, "jscdnm", StringUtil.replaceToXml(rec.jscdnm));
			//rx.add(record, "whco_comn_cost_yn", StringUtil.replaceToXml(rec.whco_comn_cost_yn));
			//rx.add(record, "use_yn", StringUtil.replaceToXml(rec.use_yn));
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
<mc_cost_1021_l>
	<dataSet>
		<CURLIST>
			<record>
				<budg_cd/>
				<budg_cdnm/>
				<medi_dstb_cd/>
				<mccdnm/>
				<dtls_medi_dstb_cd/>
				<dtls_medi_dstb_cdnm/>
				<whco_ndstb_cd/>
				<jscdnm/>
				<whco_comn_cost_yn/>
				<use_yn/>
			</record>
		</CURLIST>
	</dataSet>
</mc_cost_1021_l>
*/
%>

<% /* 작성시간 : Tue Apr 28 13:38:23 KST 2009 */ %>