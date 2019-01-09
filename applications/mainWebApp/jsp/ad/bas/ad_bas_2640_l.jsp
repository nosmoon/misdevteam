<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.co.base.util.*
                ,chosun.ciis.ad.bas.rec.*
			    ,chosun.ciis.ad.bas.ds.*
			    ,somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();
	AD_BAS_2640_LDataSet ds = (AD_BAS_2640_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData3", "");

	try {
		/****** BEGIN */
		for(int i = 0; i < ds.trgt.size(); i++) {
			AD_BAS_2640_LTRGTRecord rec = (AD_BAS_2640_LTRGTRecord)ds.trgt.get(i); 
			int record = rx.add(gridData, "record", "");

			rx.add(record, "hndl_plac_nm", rec.hndl_plac_nm);
			rx.add(record, "pre_trgt_amt", rec.pre_trgt_amt);
			rx.add(record, "pre_pubc_amt", rec.pre_pubc_amt);
//		    rx.add(record, "pre_trgt_amt", DigitUtil.nf_format(rec.pre_trgt_amt));
//			rx.add(record, "pre_pubc_amt", DigitUtil.nf_format(rec.pre_pubc_amt));
			rx.add(record, "pre_achi_rate", DigitUtil.cutUnderPoint(rec.pre_achi_rate, 2));
			rx.add(record, "cur_trgt_amt", rec.cur_trgt_amt);
			rx.add(record, "cur_pubc_amt", rec.cur_pubc_amt);
//			rx.add(record, "cur_trgt_amt", DigitUtil.nf_format(rec.cur_trgt_amt));
//			rx.add(record, "cur_pubc_amt", DigitUtil.nf_format(rec.cur_pubc_amt));
			rx.add(record, "cur_achi_rate", DigitUtil.cutUnderPoint(rec.cur_achi_rate,2));
			rx.add(record, "yy_trgt_amt", rec.yy_trgt_amt);
			rx.add(record, "yy_pubc_amt", rec.yy_pubc_amt);  
//			rx.add(record, "yy_trgt_amt", DigitUtil.nf_format(rec.yy_trgt_amt));
//			rx.add(record, "yy_pubc_amt", DigitUtil.nf_format(rec.yy_pubc_amt));  
			rx.add(record, "yy_achi_rate", DigitUtil.cutUnderPoint(rec.yy_achi_rate,2));
			rx.add(record, "trgt_clsf", rec.trgt_clsf);
			rx.add(record, "trgt_obj", rec.trgt_obj);
			rx.add(record, "trgt_yymm", rec.trgt_yymm);
		}
		/****** END */
	}  
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
