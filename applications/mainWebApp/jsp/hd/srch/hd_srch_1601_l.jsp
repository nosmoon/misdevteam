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
	HD_SRCH_1601_LDataSet ds = (HD_SRCH_1601_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
    /****** CURLIST9 BEGIN */
    recordSet = rx.add(dataSet, "CURLIST9", "");

    for(int i = 0; i < ds.curlist9.size(); i++) {
      HD_SRCH_1601_LCURLIST9Record rec = (HD_SRCH_1601_LCURLIST9Record)ds.curlist9.get(i);
      int record = rx.add(recordSet, "record", "");
      rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
      rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
      rx.add(record, "lvcmpy_dt", StringUtil.replaceToXml(rec.lvcmpy_dt));
      rx.add(record, "real_wrk_term", StringUtil.replaceToXml(rec.real_wrk_term));
      //rx.add(record, "emp_no", rec.emp_no);
      //rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
      //rx.add(record, "lvcmpy_dt", rec.lvcmpy_dt);
      //rx.add(record, "real_wrk_term", rec.real_wrk_term);
    }
    rx.add(recordSet, "totalcnt", ds.curlist9.size());
    /****** CURLIST9 END */

	  /****** CURLIST8 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST8", "");

		for(int i = 0; i < ds.curlist8.size(); i++) {
			HD_SRCH_1601_LCURLIST8Record rec = (HD_SRCH_1601_LCURLIST8Record)ds.curlist8.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "from_dt", rec.from_dt);
			rx.add(record, "to_dt", rec.to_dt);
			rx.add(record, "dds", "");
			//rx.add(record, "from_dt", StringUtil.replaceToXml(rec.from_dt));
			//rx.add(record, "to_dt", StringUtil.replaceToXml(rec.to_dt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist8.size());
		/****** CURLIST8 END */

		/****** CURLIST7 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST7", "");

		for(int i = 0; i < ds.curlist7.size(); i++) {
			HD_SRCH_1601_LCURLIST7Record rec = (HD_SRCH_1601_LCURLIST7Record)ds.curlist7.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "from_dt", rec.from_dt);
			rx.add(record, "to_dt", rec.to_dt);
			rx.add(record, "dds", "");
			//rx.add(record, "from_dt", StringUtil.replaceToXml(rec.from_dt));
			//rx.add(record, "to_dt", StringUtil.replaceToXml(rec.to_dt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist7.size());
		/****** CURLIST7 END */

		/****** CURLIST6 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST6", "");

		for(int i = 0; i < ds.curlist6.size(); i++) {
			HD_SRCH_1601_LCURLIST6Record rec = (HD_SRCH_1601_LCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "from_dt", rec.from_dt);
			rx.add(record, "to_dt", rec.to_dt);
			//rx.add(record, "from_dt", StringUtil.replaceToXml(rec.from_dt));
			//rx.add(record, "to_dt", StringUtil.replaceToXml(rec.to_dt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist6.size());
		/****** CURLIST6 END */

		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			HD_SRCH_1601_LCURLIST4Record rec = (HD_SRCH_1601_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "prz_pnsh_nm", rec.prz_pnsh_nm);
			//rx.add(record, "main_insp_dt", rec.main_insp_dt);
			//rx.add(record, "prz_resn_nm", rec.prz_resn_nm);
			//rx.add(record, "prv_insp_resn", rec.prv_insp_resn);
			rx.add(record, "prz_pnsh_nm", StringUtil.replaceToXml(rec.prz_pnsh_nm));
			rx.add(record, "main_insp_dt", StringUtil.replaceToXml(rec.main_insp_dt));
			rx.add(record, "prz_resn_nm", StringUtil.replaceToXml(rec.prz_resn_nm));
			rx.add(record, "prv_insp_resn", StringUtil.replaceToXml(rec.prv_insp_resn));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_SRCH_1601_LCURLIST3Record rec = (HD_SRCH_1601_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "appmt_nm", rec.appmt_nm);
			//rx.add(record, "appmt_dt", rec.appmt_dt);
			//rx.add(record, "mtry_dt", rec.mtry_dt);
			//rx.add(record, "appmt_cont", rec.appmt_cont);
			//rx.add(record, "dlftn2", rec.dlftn2);
			rx.add(record, "appmt_nm", StringUtil.replaceToXml(rec.appmt_nm));
			rx.add(record, "appmt_dt", StringUtil.replaceToXml(rec.appmt_dt));
			rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			rx.add(record, "appmt_cont", StringUtil.replaceToXml(rec.appmt_cont));
			rx.add(record, "dlftn2", StringUtil.replaceToXml(rec.dlftn2));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_SRCH_1601_LCURLIST2Record rec = (HD_SRCH_1601_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "offi_nm", rec.offi_nm);
			//rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			//rx.add(record, "lvcmpy_dt", rec.lvcmpy_dt);
			//rx.add(record, "lvcmpy_resn", rec.lvcmpy_resn);
			//rx.add(record, "duty_yydd", rec.duty_yydd);
			rx.add(record, "offi_nm", StringUtil.replaceToXml(rec.offi_nm));
			rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			rx.add(record, "lvcmpy_dt", StringUtil.replaceToXml(rec.lvcmpy_dt));
			rx.add(record, "lvcmpy_resn", StringUtil.replaceToXml(rec.lvcmpy_resn));
			rx.add(record, "duty_yydd", StringUtil.replaceToXml(rec.duty_yydd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_SRCH_1601_LCURLIST1Record rec = (HD_SRCH_1601_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "wowlrdlftn2", rec.wowlrdlftn2);
			//rx.add(record, "duty_yydd", rec.duty_yydd);
			//rx.add(record, "qlrmsrlrks2", rec.qlrmsrlrks2);
			//rx.add(record, "rmsthrdlftn2", rec.rmsthrdlftn2);
			rx.add(record, "wowlrdlftn2", StringUtil.replaceToXml(rec.wowlrdlftn2));
			rx.add(record, "duty_yydd", StringUtil.replaceToXml(rec.duty_yydd));
			rx.add(record, "qlrmsrlrks2", StringUtil.replaceToXml(rec.qlrmsrlrks2));
			rx.add(record, "rmsthrdlftn2", StringUtil.replaceToXml(rec.rmsthrdlftn2));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST5", "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			HD_SRCH_1601_LCURLIST5Record rec = (HD_SRCH_1601_LCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "vaca_clsf_nm", rec.vaca_clsf_nm);
			//rx.add(record, "vaca_frdt", rec.vaca_frdt);
			//rx.add(record, "vaca_todt", rec.vaca_todt);
			//rx.add(record, "vaca_dds", rec.vaca_dds);
			//rx.add(record, "remk", rec.remk);
			rx.add(record, "vaca_clsf_nm", StringUtil.replaceToXml(rec.vaca_clsf_nm));
			rx.add(record, "vaca_frdt", StringUtil.replaceToXml(rec.vaca_frdt));
			rx.add(record, "vaca_todt", StringUtil.replaceToXml(rec.vaca_todt));
			rx.add(record, "vaca_dds", StringUtil.replaceToXml(rec.vaca_dds));
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
		}
		rx.add(recordSet, "totalcnt", ds.curlist5.size());
		/****** CURLIST5 END */

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
<hd_srch_1601_l>
	<dataSet>
		<CURLIST4>
			<record>
				<prz_pnsh_nm/>
				<main_insp_dt/>
				<prz_resn_nm/>
				<prv_insp_resn/>
			</record>
		</CURLIST4>
	</dataSet>
</hd_srch_1601_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_srch_1601_l>
	<dataSet>
		<CURLIST3>
			<record>
				<appmt_nm/>
				<appmt_dt/>
				<mtry_dt/>
				<appmt_cont/>
				<dlftn2/>
			</record>
		</CURLIST3>
	</dataSet>
</hd_srch_1601_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_srch_1601_l>
	<dataSet>
		<CURLIST2>
			<record>
				<offi_nm/>
				<in_cmpy_dt/>
				<lvcmpy_dt/>
				<lvcmpy_resn/>
				<duty_yydd/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_srch_1601_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_srch_1601_l>
	<dataSet>
		<CURLIST1>
			<record>
				<wowlrdlftn2/>
				<duty_yydd/>
				<qlrmsrlrks2/>
				<rmsthrdlftn2/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_srch_1601_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_srch_1601_l>
	<dataSet>
		<CURLIST5>
			<record>
				<vaca_clsf_nm/>
				<vaca_frdt/>
				<vaca_todt/>
				<vaca_dds/>
				<remk/>
			</record>
		</CURLIST5>
	</dataSet>
</hd_srch_1601_l>
*/
%>

<% /* 작성시간 : Mon Sep 07 11:11:56 KST 2009 */ %>