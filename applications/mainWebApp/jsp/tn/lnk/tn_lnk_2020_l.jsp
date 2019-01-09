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
	TN_LNK_2020_LDataSet ds = (TN_LNK_2020_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet   = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	//int resData = rx.add(root, "resData", "");
	//int gridDetail = rx.add(resData, "gridDetail", "");

	int totData    = rx.add(root, "totData", "");
	rx.add(totData, "new_ok_cnt",  ds.new_ok_cnt );
	rx.add(totData, "new_err_cnt", ds.new_err_cnt );
	rx.add(totData, "chg_ok_cnt",  ds.chg_ok_cnt );
	rx.add(totData, "chg_err_cnt", ds.chg_err_cnt);
	rx.add(totData, "rgn_ok_cnt",  ds.rgn_ok_cnt );
	rx.add(totData, "rgn_err_cnt", ds.rgn_err_cnt);
	rx.add(totData, "tot_cnt",     (ds.new_ok_cnt + ds.chg_ok_cnt + ds.rgn_ok_cnt)); //ds.tot_cnt);
	rx.add(totData, "tot_err_cnt", (ds.new_err_cnt + ds.chg_err_cnt + ds.rgn_err_cnt));
		
	int gridDetail = rx.add(root, "gridDetail", "");
	
	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(gridDetail, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_LNK_2020_LCURLISTRecord rec = (TN_LNK_2020_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridDetail, "record", "");

			rx.add(record, "chk", "");
			rx.add(record, "requestdate", rec.requestdate);
			rx.add(record, "resultdate",  rec.paydate);
			rx.add(record, "aplc_path", rec.aplc_path);
			rx.add(record, "support", rec.support);
			rx.add(record, "aplc_clsf", rec.aplc_clsf);
			rx.add(record, "cmsstatus_nm", rec.cmsstatus);
			rx.add(record, "memb_cd", rec.memb_cd);
			rx.add(record, "memb_nm", rec.memb_nm);
			rx.add(record, "pymt_cd", rec.pymt_cd);
			rx.add(record, "bankaccountowner", rec.bankaccountowner);
			rx.add(record, "banknm", rec.banknm);
			rx.add(record, "bankaccount", rec.bankaccount);
			rx.add(record, "isdelete", rec.isdelete);
			rx.add(record, "proof_stat", rec.proof_stat);
			rx.add(record, "result_stat", rec.result_stat);
			rx.add(record, "memberidx", rec.memberidx);
			rx.add(record, "promiseidx", rec.promiseidx);
			rx.add(record, "cmsidx", rec.cmsidx);
		}
		//rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */
		
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
<tn_lnk_2020_l>
	<dataSet>
		<CURLIST>
			<record>
				<requestdate/>
				<paydate/>
				<aplc_path/>
				<support/>
				<aplc_clsf/>
				<memb_cd/>
				<memb_nm/>
				<pymt_cd/>
				<bankaccountowner/>
				<banknm/>
				<bankaccount/>
				<isdelete/>
				<proof_stat/>
				<result_stat/>
				<memberidx/>
				<promiseidx/>
				<cmsidx/>
			</record>
		</CURLIST>
	</dataSet>
</tn_lnk_2020_l>
*/
%>

<% /* 작성시간 : Fri Jul 01 10:44:48 KST 2016 */ %>