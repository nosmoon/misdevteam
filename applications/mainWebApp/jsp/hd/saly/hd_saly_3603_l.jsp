<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_3603_LDataSet ds = (HD_SALY_3603_LDataSet)request.getAttribute("ds");
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
			HD_SALY_3603_LCURLISTRecord rec = (HD_SALY_3603_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "saly_yy", rec.saly_yy);
			rx.add(record, "saly_no", rec.saly_no);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "bsgwanm", rec.bsgwanm);
			rx.add(record, "pay_saly", rec.pay_saly);
			rx.add(record, "yymm_alon", rec.yymm_alon);
			rx.add(record, "hody_alon", rec.hody_alon);
			rx.add(record, "non_regu_alon_stot", rec.non_regu_alon_stot);
			rx.add(record, "etc_saly_amt1", rec.etc_saly_amt1);
			rx.add(record, "etc_saly_amt", rec.etc_saly_amt);
			rx.add(record, "lvcmpy_alon", rec.lvcmpy_alon);
			rx.add(record, "corr_base_stay_fee", rec.corr_base_stay_fee);
			rx.add(record, "bns", rec.bns);
			rx.add(record, "mm_saly", rec.mm_saly);
			rx.add(record, "non_tax_stot", rec.non_tax_stot);
			//rx.add(record, "saly_yy", StringUtil.replaceToXml(rec.saly_yy));
			//rx.add(record, "saly_no", StringUtil.replaceToXml(rec.saly_no));
			//rx.add(record, "bsgwanm", StringUtil.replaceToXml(rec.bsgwanm));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "real_pay_rgla_saly", StringUtil.replaceToXml(rec.real_pay_rgla_saly));
			//rx.add(record, "non_tax_stot", StringUtil.replaceToXml(rec.non_tax_stot));
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
<hd_saly_3603_l>
	<dataSet>
		<CURLIST>
			<record>
				<saly_yy/>
				<saly_no/>
				<bsgwanm/>
				<flnm/>
				<emp_no/>
				<real_pay_rgla_saly/>
				<non_tax_stot/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_3603_l>
*/
%>

<% /* 작성시간 : Mon Oct 26 11:39:09 KST 2009 */ %>