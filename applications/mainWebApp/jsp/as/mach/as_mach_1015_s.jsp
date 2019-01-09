<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.mach.rec.*
	,	chosun.ciis.as.mach.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_MACH_1015_SDataSet ds = (AS_MACH_1015_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int reqForm = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");
	reqForm = rx.add(dataSet, "reqForm", "");
	
	rx.add(reqForm, "work_clsf", ds.work_clsf);
	rx.add(reqForm, "mach_clsf", ds.mach_clsf);
	rx.add(reqForm, "bldg_clsf", ds.bldg_clsf);
	rx.add(reqForm, "mach_seq", ds.mach_seq);
	rx.addCData(reqForm, "mach_name", ds.mach_name);
	rx.addCData(reqForm, "model_name", ds.model_name);
	rx.addCData(reqForm, "stnd", ds.stnd);
	rx.addCData(reqForm, "usag", ds.usag);
	rx.addCData(reqForm, "loca", ds.loca);
	rx.add(reqForm, "inst_dt", ds.inst_dt);
	rx.add(reqForm, "exp_dt", ds.exp_dt);
	rx.addCData(reqForm, "life_year", ds.life_year);
	rx.addCData(reqForm, "make_comp", ds.make_comp);
	rx.addCData(reqForm, "inst_comp", ds.inst_comp);
	rx.add(reqForm, "inst_fee", ds.inst_fee);
	rx.addCData(reqForm, "as_comp", ds.as_comp);
	rx.add(reqForm, "as_fee", ds.as_fee);
	rx.addCData(reqForm, "as_tel", ds.as_tel);
	rx.addCData(reqForm, "remk", ds.remk);
		
	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AS_MACH_1015_SCURLISTRecord rec = (AS_MACH_1015_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "mach_seq", rec.mach_seq);
			rx.add(record, "as_seq", rec.as_seq);
			rx.add(record, "mach_as_dt", rec.mach_as_dt);
			rx.addCData(record, "as_comp", rec.as_comp);
			rx.add(record, "as_fee", rec.as_fee);
			rx.addCData(record, "as_cont", rec.as_cont);
			rx.addCData(record, "remk", rec.remk);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "mach_seq", StringUtil.replaceToXml(rec.mach_seq));
			//rx.add(record, "as_seq", StringUtil.replaceToXml(rec.as_seq));
			//rx.add(record, "mach_as_dt", StringUtil.replaceToXml(rec.mach_as_dt));
			//rx.add(record, "as_comp", StringUtil.replaceToXml(rec.as_comp));
			//rx.add(record, "as_fee", StringUtil.replaceToXml(rec.as_fee));
			//rx.add(record, "as_cont", StringUtil.replaceToXml(rec.as_cont));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
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
<as_mach_1015_s>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<mach_seq/>
				<as_seq/>
				<mach_as_dt/>
				<as_comp/>
				<as_fee/>
				<as_cont/>
				<remk/>
			</record>
		</CURLIST>
	</dataSet>
</as_mach_1015_s>
*/
%>

<% /* 작성시간 : Thu Jun 11 15:26:30 KST 2015 */ %>