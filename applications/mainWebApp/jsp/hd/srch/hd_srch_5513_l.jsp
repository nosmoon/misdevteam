<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.srch.rec.*
	,	chosun.ciis.hd.srch.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SRCH_5513_LDataSet ds = (HD_SRCH_5513_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	//rx.addCData(dataSet, "head_clsf_01_02", ds.head_clsf_01_02 );
	rx.addCData(dataSet, "text_tag", ds.tag1 );
	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_SRCH_5513_LCURLIST1Record rec = (HD_SRCH_5513_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "yymm", rec.yymm);
			rx.addCData(record, "human_resour_1", rec.human_resour_1);
			rx.addCData(record, "human_resour_2", rec.human_resour_2);
			rx.addCData(record, "tot_nops_cnt", rec.tot_nops_cnt);
			rx.addCData(record, "emp_clsf_30_cnt", rec.emp_clsf_30_cnt);
			rx.addCData(record, "emp_ratio", rec.emp_ratio);
			rx.addCData(record, "emp_fml_cnt", rec.emp_fml_cnt);
			//rx.add(record, "yymm", StringUtil.replaceToXml(rec.yymm));
			//rx.add(record, "human_resour_1", StringUtil.replaceToXml(rec.human_resour_1));
			//rx.add(record, "human_resour_2", StringUtil.replaceToXml(rec.human_resour_2));
			//rx.add(record, "tot_nops_cnt", StringUtil.replaceToXml(rec.tot_nops_cnt));
			//rx.add(record, "emp_clsf_30_cnt", StringUtil.replaceToXml(rec.emp_clsf_30_cnt));
			//rx.add(record, "emp_ratio", StringUtil.replaceToXml(rec.emp_ratio));
			//rx.add(record, "emp_fml_cnt", StringUtil.replaceToXml(rec.emp_fml_cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<hd_srch_5513_l>
	<dataSet>
		<CURLIST1>
			<record>
				<yymm/>
				<human_resour_1/>
				<human_resour_2/>
				<tot_nops_cnt/>
				<emp_clsf_30_cnt/>
				<emp_ratio/>
				<emp_fml_cnt/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_srch_5513_l>
*/
%>

<% /* 작성시간 : Mon Nov 26 16:12:37 KST 2018 */ %>