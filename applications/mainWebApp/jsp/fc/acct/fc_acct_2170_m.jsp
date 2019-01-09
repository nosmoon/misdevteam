<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2170_MDataSet ds = (FC_ACCT_2170_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CUR_PROF_KIND_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_PROF_KIND_LIST", "");

		for(int i = 0; i < ds.cur_prof_kind_list.size(); i++) {
			FC_ACCT_2170_MCUR_PROF_KIND_LISTRecord rec = (FC_ACCT_2170_MCUR_PROF_KIND_LISTRecord)ds.cur_prof_kind_list.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd_nm", rec.cd_nm);
			//rx.add(record, "cd", rec.cd);
			rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.cur_prof_kind_list.size());
		/****** CUR_PROF_KIND_LIST END */

		/****** SEMURO_ID BEGIN */
		recordSet = rx.add(dataSet, "SEMURO_ID", "");

		for(int i = 0; i < ds.semuro_id.size(); i++) {
			FC_ACCT_2170_MSEMURO_IDRecord rec = (FC_ACCT_2170_MSEMURO_IDRecord)ds.semuro_id.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "semuro_id", rec.semuro_id);
			rx.add(record, "semuro_id", StringUtil.replaceToXml(rec.semuro_id));
		}
		rx.add(recordSet, "totalcnt", ds.semuro_id.size());
		/****** SEMURO_ID END */

		/****** CUR_SLIP_CLSF_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_SLIP_CLSF_LIST", "");

		for(int i = 0; i < ds.cur_slip_clsf_list.size(); i++) {
			FC_ACCT_2170_MCUR_SLIP_CLSF_LISTRecord rec = (FC_ACCT_2170_MCUR_SLIP_CLSF_LISTRecord)ds.cur_slip_clsf_list.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd_nm", rec.cd_nm);
			//rx.add(record, "cd", rec.cd);
			rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.cur_slip_clsf_list.size());
		/****** CUR_SLIP_CLSF_LIST END */

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
<fc_acct_2170_m>
	<dataSet>
		<CUR_PROF_KIND_LIST>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</CUR_PROF_KIND_LIST>
	</dataSet>
</fc_acct_2170_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2170_m>
	<dataSet>
		<SEMURO_ID>
			<record>
				<semuro_id/>
			</record>
		</SEMURO_ID>
	</dataSet>
</fc_acct_2170_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2170_m>
	<dataSet>
		<CUR_SLIP_CLSF_LIST>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</CUR_SLIP_CLSF_LIST>
	</dataSet>
</fc_acct_2170_m>
*/
%>

<% /* 작성시간 : Thu Aug 13 16:28:41 KST 2009 */ %>