<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_2602_LDataSet ds = (HD_INFO_2602_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_INFO_2602_LCURLIST2Record rec = (HD_INFO_2602_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "aply_yymm", rec.aply_yymm);
			rx.add(record, "emp_cnt", rec.emp_cnt);
			rx.add(record, "cmpy_nm", rec.cmpy_nm);
			rx.add(record, "mm_servcost", rec.mm_servcost);
			rx.add(record, "one_pers_servcost", rec.one_pers_servcost);
			rx.add(record, "spc_matt", rec.spc_matt);
			rx.add(record, "remk", rec.remk);
			//rx.add(record, "aply_yymm", StringUtil.replaceToXml(rec.aply_yymm));
			//rx.add(record, "emp_cnt", StringUtil.replaceToXml(rec.emp_cnt));
			//rx.add(record, "cmpy_nm", StringUtil.replaceToXml(rec.cmpy_nm));
			//rx.add(record, "mm_servcost", StringUtil.replaceToXml(rec.mm_servcost));
			//rx.add(record, "one_pers_servcost", StringUtil.replaceToXml(rec.one_pers_servcost));
			//rx.add(record, "spc_matt", StringUtil.replaceToXml(rec.spc_matt));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_INFO_2602_LCURLIST1Record rec = (HD_INFO_2602_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rptv_movm_nm", rec.rptv_movm_nm);
			rx.add(record, "vip_serv_job", rec.vip_serv_job);
			rx.add(record, "cntr_cnclus_dt", rec.cntr_cnclus_dt);
			//rx.add(record, "rptv_movm_nm", StringUtil.replaceToXml(rec.rptv_movm_nm));
			//rx.add(record, "vip_serv_job", StringUtil.replaceToXml(rec.vip_serv_job));
			//rx.add(record, "cntr_cnclus_dt", StringUtil.replaceToXml(rec.cntr_cnclus_dt));
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
<hd_info_2602_l>
	<dataSet>
		<CURLIST2>
			<record>
				<aply_yymm/>
				<emp_cnt/>
				<cmpy_nm/>
				<mm_servcost/>
				<one_pers_servcost/>
				<spc_matt/>
				<remk/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_info_2602_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_info_2602_l>
	<dataSet>
		<CURLIST1>
			<record>
				<rptv_movm_nm/>
				<vip_serv_job/>
				<cntr_cnclus_dt/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_info_2602_l>
*/
%>

<% /* 작성시간 : Tue Aug 25 15:34:37 KST 2009 */ %>