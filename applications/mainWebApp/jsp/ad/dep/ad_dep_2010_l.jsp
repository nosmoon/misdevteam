<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	chosun.ciis.co.base.util.*	
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.dep.rec.*
	,	chosun.ciis.ad.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_DEP_2010_LDataSet ds = (AD_DEP_2010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData", "");  


	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_DEP_2010_LCURLISTRecord rec = (AD_DEP_2010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "acct_num", rec.acct_num);
			rx.add(record, "bank_name", rec.bank_name);
			rx.add(record, "tran_date", rec.tran_date);
			rx.addCData(record, "remark", rec.remark);
			rx.add(record, "tran_amt", rec.tran_amt);
			rx.add(record, "extnc_amt", rec.extnc_amt);
			if(StringUtil.toNumber(rec.extnc_amt) < 0)
			{
				rx.add(record, "remain_amt", StringUtil.toNumber(rec.tran_amt));
			}
			else
			{
				rx.add(record, "remain_amt", StringUtil.toNumber(rec.tran_amt) - StringUtil.toNumber(rec.extnc_amt));
			}
			rx.add(record, "rcpm_slip_no", rec.rcpm_slip_no);
			rx.add(record, "mchrg_pers", rec.mchrg_pers);
		}		
		/****** CURLIST END */

	}
	catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
