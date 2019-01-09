<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.snd.rec.*
	,	chosun.ciis.is.snd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_SND_1010_LDataSet ds = (IS_SND_1010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_SND_1010_LCURLIST1Record rec = (IS_SND_1010_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "send_atic_no", rec.send_atic_no);
			rx.add(record, "send_atic_nm", rec.send_atic_nm);
			rx.add(record, "reg_dd", rec.reg_dd);
			rx.add(record, "car_kind", rec.car_kind);
			rx.add(record, "yy_styl", rec.yy_styl);
			rx.add(record, "car_no", rec.car_no);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "tel", rec.tel);
			rx.add(record, "ceph", rec.ceph);
			rx.add(record, "zip_1", rec.zip_1);
			rx.add(record, "zip_2", rec.zip_2);
			rx.add(record, "addr", rec.addr);
			rx.add(record, "dtls_addr", rec.dtls_addr);
			rx.add(record, "wh_cd", rec.wh_cd);
			rx.add(record, "driv_yn", rec.driv_yn);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
			rx.add(record, "remk", rec.remk);
		}
		/****** CURLIST1 END */
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
