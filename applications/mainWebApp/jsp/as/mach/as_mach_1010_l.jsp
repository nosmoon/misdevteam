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
	AS_MACH_1010_LDataSet ds = (AS_MACH_1010_LDataSet)request.getAttribute("ds");
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
			AS_MACH_1010_LCURLISTRecord rec = (AS_MACH_1010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "mach_seq", rec.mach_seq);
			rx.add(record, "work_clsf", rec.work_clsf);
			rx.addCData(record, "work_clsf_nm", rec.work_clsf_nm);
			rx.add(record, "mach_clsf", rec.mach_clsf);
			rx.addCData(record, "mach_clsf_nm", rec.mach_clsf_nm);
			rx.add(record, "bldg_clsf", rec.bldg_clsf);
			rx.addCData(record, "bldg_clsf_nm", rec.bldg_clsf_nm);
			rx.addCData(record, "mach_name", rec.mach_name);
			rx.addCData(record, "model_name", rec.model_name);
			rx.addCData(record, "stnd", rec.stnd);
			rx.addCData(record, "usag", rec.usag);
			rx.addCData(record, "loca", rec.loca);
			rx.addCData(record, "life_year", rec.life_year);
			rx.addCData(record, "make_comp", rec.make_comp);
			rx.addCData(record, "inst_comp", rec.inst_comp);
			rx.add(record, "inst_fee", rec.inst_fee);
			rx.addCData(record, "inst_dt", rec.inst_dt);
			rx.addCData(record, "exp_dt", rec.exp_dt);
			rx.addCData(record, "as_comp", rec.as_comp);
			rx.add(record, "as_fee", rec.as_fee);
			rx.addCData(record, "as_tel", rec.as_tel);
			
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
<as_mach_1010_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<mach_seq/>
				<work_clsf/>
				<work_clsf_nm/>
				<mach_clsf/>
				<mach_clsf_nm/>
				<bldg_clsf/>
				<bldg_clsf_nm/>
				<mach_name/>
				<model_name/>
				<stnd/>
				<usag/>
				<loca/>
			</record>
		</CURLIST>
	</dataSet>
</as_mach_1010_l>
*/
%>

<% /* 작성시간 : Thu Jun 11 14:26:14 KST 2015 */ %>