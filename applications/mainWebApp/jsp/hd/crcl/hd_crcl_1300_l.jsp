<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*		
	,	chosun.ciis.hd.crcl.rec.*
	,	chosun.ciis.hd.crcl.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_CRCL_1300_LDataSet ds = (HD_CRCL_1300_LDataSet)request.getAttribute("ds");
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
			HD_CRCL_1300_LCURLISTRecord rec = (HD_CRCL_1300_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "row_num", rec.row_num);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "paty_crc_cd", rec.paty_crc_cd);
			//if(rec.fix_fix_rate_clsf.equals("1")){	//정액
				rx.add(record, "paty_crc_dus", DigitUtil.nf_format(rec.paty_crc_dus));		
			//}else if(rec.fix_fix_rate_clsf.equals("2")){	//정률			
			//	rx.add(record, "paty_crc_dus", DigitUtil.cutUnderPoint(rec.paty_crc_dus,1)+"%");				
			//}
			rx.add(record, "entr_dt", rec.entr_dt);
			rx.add(record, "lve_dt", rec.lve_dt);
			rx.add(record, "entr_yn_nm", rec.entr_yn_nm);
			rx.add(record, "entr_yn", rec.entr_yn);
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
			<row_num/>
			<cmpy_cd/>
			<emp_no/>
			<occr_dt/>
			<seq/>
			<flnm/>
			<dept_cd/>
			<dept_nm/>
			<dty_cd/>
			<dty_nm/>
			<posi_cd/>
			<posi_nm/>
			<paty_crc_cd/>
			<paty_crc_dus/>
			<entr_dt/>
			<lve_dt/>
			<entr_yn/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Feb 18 21:30:23 KST 2009 */ %>