<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.papmake.rec.*
	,	chosun.ciis.pr.papmake.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PAPMAKE_1021_LDataSet ds = (PR_PAPMAKE_1021_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
    int seq1=1;
    int formData = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	recordSet = rx.add(root, "tempData", "");
   
	try {
		/****** CURLIST BEGIN */
		formData = rx.add(recordSet, "gridData", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_PAPMAKE_1021_LCURLIST1Record rec = (PR_PAPMAKE_1021_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "duty_dt", rec.duty_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "sub_seq", rec.sub_seq);
			rx.add(record, "prt_clsf", rec.prt_clsf);
			rx.add(record, "mesr_plac_clsf", rec.mesr_plac_clsf);
			rx.add(record, "tmpt", rec.tmpt);
			rx.add(record, "hmdt", rec.hmdt);
			rx.add(record, "cnfm_tm", rec.cnfm_tm);
            rx.add(record, "seq1",seq1);
            seq1++;
		}
		//rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */
		
		formData = rx.add(recordSet, "ecnt", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			PR_PAPMAKE_1021_LCURLIST2Record rec = (PR_PAPMAKE_1021_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(formData, "item", "");
			rx.add(record, "value", rec.ecnt);
			rx.add(record, "label", rec.ecnt_nm);
		}
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
			<cmpy_cd/>
			<duty_dt/>
			<fac_clsf/>
			<sub_seq/>
			<prt_clsf/>
			<mesr_plac_clsf/>
			<tmpt/>
			<hmdt/>
			<cnfm_tm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Apr 10 10:51:54 KST 2009 */ %>