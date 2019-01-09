<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.yadjm.rec.*
	,	chosun.ciis.hd.yadjm.ds.*
	,	java.lang.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_YADJM_5400_LDataSet ds = (HD_YADJM_5400_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");
//System.out.println("니나노 "+ ds.curlist.size());
        if(ds.curlist.size() > 0 )
        {
			for(int i = 0; i < ds.curlist.size(); i++) {
				HD_YADJM_5400_LCURLISTRecord rec = (HD_YADJM_5400_LCURLISTRecord)ds.curlist.get(i);
				int record = rx.add(recordSet, "record", "");
				rx.add(record, "adjm_rvrs_yy", rec.adjm_rvrs_yy);
				rx.add(record, "seq", rec.seq);
				rx.add(record, "emp_no", rec.emp_no);
				rx.add(record, "leas_flnm", rec.leas_flnm);
				rx.add(record, "leas_prn", rec.leas_prn);
				rx.add(record, "addr", rec.addr);
				rx.add(record, "leas_fr_dt", rec.leas_fr_dt);
				rx.add(record, "leas_to_dt", rec.leas_to_dt);
				rx.add(record, "month_rent_amt", rec.month_rent_amt);
				rx.add(record, "resi_clsf_cd", rec.resi_clsf_cd);
				rx.add(record, "hous_cntr_sqr", rec.hous_cntr_sqr);
				//rx.add(record, "adjm_rvrs_yy", StringUtil.replaceToXml(rec.adjm_rvrs_yy));
				//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
				//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
				//rx.add(record, "leas_flnm", StringUtil.replaceToXml(rec.leas_flnm));
				//rx.add(record, "leas_prn", StringUtil.replaceToXml(rec.leas_prn));
				//rx.add(record, "addr", StringUtil.replaceToXml(rec.addr));
				//rx.add(record, "leas_fr_dt", StringUtil.replaceToXml(rec.leas_fr_dt));
				//rx.add(record, "leas_to_dt", StringUtil.replaceToXml(rec.leas_to_dt));
				//rx.add(record, "month_rent_amt", StringUtil.replaceToXml(rec.month_rent_amt));
			}
		}
		else 
		{
		
				int record = rx.add(recordSet, "record", "");
				rx.add(record, "adjm_rvrs_yy", "");
				rx.add(record, "seq", "");
				rx.add(record, "emp_no", "");
				rx.add(record, "leas_flnm", "");
				rx.add(record, "leas_prn", "");
				rx.add(record, "addr", "");
				rx.add(record, "leas_fr_dt", "");
				rx.add(record, "leas_to_dt", "");
				rx.add(record, "month_rent_amt", "");
				rx.add(record, "resi_clsf_cd", "");
				rx.add(record, "hous_cntr_sqr", "");
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
<hd_yadjm_5400_l>
	<dataSet>
		<CURLIST>
			<record>
				<adjm_rvrs_yy/>
				<seq/>
				<emp_no/>
				<leas_flnm/>
				<leas_prn/>
				<addr/>
				<leas_fr_dt/>
				<leas_to_dt/>
				<month_rent_amt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_yadjm_5400_l>
*/
%>

<% /* 작성시간 : Fri Jan 10 21:12:08 KST 2014 */ %>