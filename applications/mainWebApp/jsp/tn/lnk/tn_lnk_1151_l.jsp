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

<%	System.out.println("jsp go");
	RwXml rx = new RwXml();
	TN_LNK_1151_LDataSet ds = (TN_LNK_1151_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_LNK_1151_LCURLISTRecord rec = (TN_LNK_1151_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "seq", rec.seq);
			rx.add(record, "inpt_type", rec.inpt_type);
			rx.addCData(record, "name", rec.name);
			rx.add(record, "fund_idx", rec.fund_idx);
			rx.add(record, "suprt_idx", rec.suprt_idx);
			rx.add(record, "memb_cd", rec.memb_cd);
			rx.add(record, "prms_cd", rec.prms_cd);
			rx.add(record, "prms_amt", rec.prms_amt);
			rx.add(record, "pay_dt", rec.pay_dt);
			rx.add(record, "pay_amt", rec.pay_amt);
			rx.add(record, "status", rec.status);
			rx.addCData(record, "memo", rec.memo);
			rx.add(record, "memb_idx", rec.memberidx);
			rx.add(record, "prms_idx", rec.promiseidx);
		}
		int resForm = rx.add(resData, "resForm", "");
		rx.addCData(resForm, "file_nm", ds.file_nm );
		rx.add(resForm, "dept_idx", ds.dept_idx );
		rx.add(resForm, "excl_type", ds.excl_type );
		rx.addCData(resForm, "title", ds.title );
		rx.add(resForm, "upload", ds.upload);
		rx.add(resForm, "file_yn", ds.file_yn);
		rx.add(resForm, "tot_cnt", ds.tcnt );
		rx.add(resForm, "cnt1", ds.cnt1 );
		rx.add(resForm, "cnt24", ds.cnt24 );
		rx.add(resForm, "cnt3", ds.cnt3 );
		rx.add(resForm, "excl_pmnt_idx", "");
		rx.add(resForm, "flag", "");
		rx.add(resForm, "multiUpdateData", "");
		rx.add(resForm, "multiUpdateData2", "");
		rx.add(resForm, "chk_cnt","");
		rx.add(resForm, "add_file_nm","");
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
<tn_lnk_1110_l>
	<dataSet>
		<CURLIST>
			<record>
				<excl_pmnt_idx/>
				<excl_type/>
				<deptidx/>
				<title/>
				<dtl_cnt/>
				<insrt_dt/>
				<adminidx/>
			</record>
		</CURLIST>
	</dataSet>
</tn_lnk_1110_l>
*/
%>

<% /* 작성시간 : Mon Jul 04 16:03:34 KST 2016 */ %>