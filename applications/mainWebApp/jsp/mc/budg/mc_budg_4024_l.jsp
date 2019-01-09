<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.budg.rec.*
	,	chosun.ciis.mc.budg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_BUDG_4024_LDataSet ds = (MC_BUDG_4024_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_4024_LCURLISTRecord rec = (MC_BUDG_4024_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sub_no", rec.sub_no);
			rx.add(record, "work_no", rec.work_no);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "sub_seq", rec.sub_seq);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_cdnm", rec.budg_cdnm);
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "evnt_cdnm", rec.evnt_cdnm);
			rx.add(record, "budg_yymm", rec.budg_yymm);
			rx.add(record, "use_dept_cd", rec.use_dept_cd);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_cdnm", rec.medi_cdnm);
			rx.add(record, "rmks", rec.rmks);
			rx.add(record, "yrsqty", rec.yrsqty);
			rx.add(record, "yrdan", rec.yrdan);
			rx.add(record, "yramt", rec.yramt);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "amt", rec.amt);
			//rx.add(record, "sub_no", StringUtil.replaceToXml(rec.sub_no));
			//rx.add(record, "work_no", StringUtil.replaceToXml(rec.work_no));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "sub_seq", StringUtil.replaceToXml(rec.sub_seq));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_cdnm", StringUtil.replaceToXml(rec.budg_cdnm));
			//rx.add(record, "evnt_cd", StringUtil.replaceToXml(rec.evnt_cd));
			//rx.add(record, "evnt_cdnm", StringUtil.replaceToXml(rec.evnt_cdnm));
			//rx.add(record, "budg_yymm", StringUtil.replaceToXml(rec.budg_yymm));
			//rx.add(record, "use_dept_cd", StringUtil.replaceToXml(rec.use_dept_cd));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "medi_cdnm", StringUtil.replaceToXml(rec.medi_cdnm));
			//rx.add(record, "rmks", StringUtil.replaceToXml(rec.rmks));
			//rx.add(record, "yrsqty", StringUtil.replaceToXml(rec.yrsqty));
			//rx.add(record, "yrdan", StringUtil.replaceToXml(rec.yrdan));
			//rx.add(record, "yramt", StringUtil.replaceToXml(rec.yramt));
			//rx.add(record, "qunt", StringUtil.replaceToXml(rec.qunt));
			//rx.add(record, "uprc", StringUtil.replaceToXml(rec.uprc));
			//rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
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
<mc_budg_4024_l>
	<dataSet>
		<CURLIST>
			<record>
				<sub_no/>
				<work_no/>
				<seq/>
				<sub_seq/>
				<budg_cd/>
				<budg_cdnm/>
				<evnt_cd/>
				<evnt_cdnm/>
				<budg_yymm/>
				<use_dept_cd/>
				<medi_cd/>
				<medi_cdnm/>
				<rmks/>
				<yrsqty/>
				<yrdan/>
				<yramt/>
				<qunt/>
				<uprc/>
				<amt/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_4024_l>
*/
%>

<% /* 작성시간 : Thu May 21 16:31:32 KST 2009 */ %>