<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.lnk.rec.*
	,	chosun.ciis.tn.lnk.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_LNK_2010_LDataSet ds = (TN_LNK_2010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
//	int resData = rx.add(root, "resData", "");
//	int gridData = rx.add(resData, "gridHeader", "");

	int gridData = rx.add(root, "gridHeader", "");

	try {
		//recordSet = rx.add(gridData, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_LNK_2010_LCURLISTRecord rec = (TN_LNK_2010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");

			rx.add(record, "aplc_path", rec.aplc_path);
			rx.add(record, "requestdate", rec.requestdate);
			rx.add(record, "paydate", rec.paydate);
			rx.add(record, "proof_file", rec.proof_file);
			rx.add(record, "aplc_file", rec.aplc_file);
			rx.add(record, "result_file", rec.result_file);
			rx.add(record, "tot_cnt", rec.tot_cnt);
			rx.add(record, "tot_err_cnt", rec.tot_err_cnt);
			rx.add(record, "stat1", rec.stat1);
			rx.add(record, "stat2", rec.stat2);
			rx.add(record, "stat3", rec.stat3);
			rx.add(record, "stat4", rec.stat4);
			rx.add(record, "remk",  "");
			rx.add(record, "cmsidx", rec.cmsidx);
			rx.add(record, "deptidx", rec.deptidx);
			rx.add(record, "status", rec.status);

		}
		//rx.add(recordSet, "totalcnt", ds.curlist.size());

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
<tn_lnk_2010_l>
	<dataSet>
		<CURLIST>
			<record>
				<aplc_path/>
				<requestdate/>
				<paydate/>
				<proof_file/>
				<aplc_file/>
				<result_file/>
				<tot_cnt/>
				<tot_err_cnt/>
				<stat1/>
				<stat2/>
				<stat3/>
				<stat4/>
				<cmsidx/>
				<deptidx/>
			</record>
		</CURLIST>
	</dataSet>
</tn_lnk_2010_l>
*/
%>

<% /* 작성시간 : Thu Jun 30 16:32:40 KST 2016 */ %>