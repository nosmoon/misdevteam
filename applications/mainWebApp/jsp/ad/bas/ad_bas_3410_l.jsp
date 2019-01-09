<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.bas.rec.*
			    ,chosun.ciis.ad.bas.ds.*
			    ,chosun.ciis.co.base.util.*
			    ,somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();
	AD_BAS_3410_LDataSet ds = (AD_BAS_3410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData1", "");

	try {
		/****** BEGIN */
		for(int i = 0; i < ds.trgt.size(); i++) {
			AD_BAS_3410_LTRGTRecord rec = (AD_BAS_3410_LTRGTRecord)ds.trgt.get(i); 
			int record = rx.add(gridData, "record", "");

			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "trgt_clsf", rec.trgt_clsf);
			rx.add(record, "trgt_obj", rec.trgt_obj);
			rx.add(record, "trgt_yymm", rec.trgt_yymm);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "trgt_amt_pre", rec.trgt_amt_pre);
			rx.add(record, "pubc_tot_amt_pre", rec.pubc_tot_amt_pre);
			rx.add(record, "achi_rate_pre", DigitUtil.cutUnderPoint(rec.achi_rate_pre,2));
			rx.add(record, "trgt_amt", rec.trgt_amt);
			rx.add(record, "pubc_tot_amt", rec.pubc_tot_amt);
			rx.add(record, "achi_rate", DigitUtil.cutUnderPoint(rec.achi_rate,2));
			rx.add(record, "trgt_amt_sum", rec.trgt_amt_sum);
			rx.add(record, "pubc_tot_amt_sum", rec.pubc_tot_amt_sum);
			rx.add(record, "achi_rate_sum", DigitUtil.cutUnderPoint(rec.achi_rate_sum,2));
		}
		/****** END */
	}
	catch (Exception e) {
		System.out.println(e);
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
