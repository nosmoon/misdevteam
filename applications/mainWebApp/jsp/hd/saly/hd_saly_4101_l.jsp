<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_4101_LDataSet ds = (HD_SALY_4101_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_SALY_4101_LCURLISTRecord rec = (HD_SALY_4101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			int tjamt 		= Integer.parseInt(rec.tjamt);
			int sbjanamt 	= Integer.parseInt(rec.sbjanamt);
			long bongaamt 	= tjamt -  sbjanamt;	//본인보증가능금액
			long yenbong = Integer.parseInt(rec.rgla_saly) * 12;	//연봉
			
			
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "emp_clsf", rec.emp_clsf);
			rx.add(record, "last_midl_adjm_dt", rec.last_midl_adjm_dt);
			rx.add(record, "gsycnt", rec.gsycnt);
			rx.add(record, "sb", rec.sb);
			rx.add(record, "eg", rec.eg);
			rx.add(record, "gm", rec.gm);
			rx.add(record, "rgla_saly", rec.rgla_saly);	//월정급여
			rx.add(record, "base_saly", rec.base_saly);
			rx.add(record, "supl_saly", rec.supl_saly);
			rx.add(record, "gb", rec.gb);
			rx.add(record, "tjamt", rec.tjamt);			//퇴직금
			rx.add(record, "tjg", rec.tjg);
			rx.add(record, "jgcmjamt", rec.jgcmjamt);	//자기채무잔액
			rx.add(record, "sbjanamt", rec.sbjanamt);	//복지제외잔액
			rx.add(record, "bongaamt", Long.toString(bongaamt)); //본인보증가능금액
			rx.add(record, "yenbong", Long.toString(yenbong));	 //연봉
			rx.add(record, "bogaamt", "");	 
			rx.add(record, "bhbhyb", "");	 
			rx.add(record, "sinamt", "");	 
			rx.add(record, "bhnosabeon", "");	 
			rx.add(record, "add_bogaamt", "");	 
			rx.add(record, "add_bhnosabeon", "");	 
			
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
<dataSet>
	<CURLIST>
		<record>
			<emp_no/>
			<emp_clsf/>
			<last_midl_adjm_dt/>
			<gsycnt/>
			<sb/>
			<eg/>
			<gm/>
			<rgla_saly/>
			<base_saly/>
			<supl_saly/>
			<gb/>
			<tjamt/>
			<tjg/>
			<jgcmjamt/>
			<sbjanamt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue May 19 15:35:58 KST 2009 */ %>