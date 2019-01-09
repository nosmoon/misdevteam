<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.lvcmpy.rec.*
	,	chosun.ciis.hd.lvcmpy.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_LVCMPY_3200_LDataSet ds = (HD_LVCMPY_3200_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
	//	recordSet = rx.add(dataSet, "CURLIST", "");

		
		
		
		if(ds.curlist.size()>0) {
			for(int i = 0; i < ds.curlist.size(); i++) {
				HD_LVCMPY_3200_LCURLISTRecord rec = (HD_LVCMPY_3200_LCURLISTRecord)ds.curlist.get(i);
				int record = rx.add(dataSet, "record", "");
				rx.add(record, "emp_dtls_clsf_nm", rec.emp_dtls_clsf_nm);
				rx.add(record, "tot_cnt", rec.tot_cnt);
				rx.add(record, "in_lv_cmpy_cnt", rec.in_lv_cmpy_cnt);
				rx.add(record, "year_cnt", rec.year_cnt);
				rx.add(record, "tot_amt", rec.tot_amt);
				rx.add(record, "in_lv_cmpy_amt", rec.in_lv_cmpy_amt);
				rx.add(record, "year_amt", rec.year_amt);
			}
			rx.add(dataSet, "totalcnt", ds.curlist.size());
		}else{
			
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "emp_dtls_clsf_nm", "임원구분");
			rx.add(record, "tot_cnt", "0");
			rx.add(record, "in_lv_cmpy_cnt", "0");
			rx.add(record, "year_cnt", "0");
			rx.add(record, "tot_amt", "0");
			rx.add(record, "in_lv_cmpy_amt", "0");
			rx.add(record, "year_amt", "0");
			
			int record2 = rx.add(dataSet, "record", "");
			rx.add(record2, "emp_dtls_clsf_nm", "사원구분");
			rx.add(record2, "tot_cnt", "0");
			rx.add(record2, "in_lv_cmpy_cnt", "0");
			rx.add(record2, "year_cnt", "0");
			rx.add(record2, "tot_amt", "0");
			rx.add(record2, "in_lv_cmpy_amt", "0");
			rx.add(record2, "year_amt", "0");
			
			int record3 = rx.add(dataSet, "record", "");
			rx.add(record3, "emp_dtls_clsf_nm", "계");
			rx.add(record3, "tot_cnt", "0");
			rx.add(record3, "in_lv_cmpy_cnt", "0");
			rx.add(record3, "year_cnt", "0");
			rx.add(record3, "tot_amt", "0");
			rx.add(record3, "in_lv_cmpy_amt", "0");
			rx.add(record3, "year_amt", "0");
			
			
			System.out.println("ds.curlist.size()="+ds.curlist.size());
		}
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
			<emp_dtls_clsf_nm/>
			<tot_cnt/>
			<in_lv_cmpy_cnt/>
			<year_cnt/>
			<tot_amt/>
			<in_lv_cmpy_amt/>
			<year_amt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri May 29 09:52:20 KST 2009 */ %>