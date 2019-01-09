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
	IS_SND_1710_LDataSet ds = (IS_SND_1710_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resForm   = rx.add(root, "resForm", "");

	try {
		/****** CURLIST1 BEGIN */
		int gridData = rx.add(resForm, "gridData", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_SND_1710_LCURLIST1Record rec = (IS_SND_1710_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "wh_cd", rec.wh_cd);
			rx.add(record, "send_dt", rec.send_dt);
			rx.add(record, "send_seq", rec.send_seq);
			rx.add(record, "send_atic_no", rec.send_atic_no);
			rx.add(record, "send_atic_nm", rec.send_atic_nm);
			rx.add(record, "sendclsf", rec.sendclsf);
			rx.add(record, "serv_ref", rec.serv_ref);
			rx.add(record, "cntc_plac", rec.cntc_plac);
			rx.add(record, "send_fee", rec.send_fee);
			rx.add(record, "start_tm", rec.start_tm);
			rx.add(record, "end_tm", rec.end_tm);
			rx.add(record, "send_path", rec.send_path);
			rx.add(record, "send_advt_cont", rec.send_advt_cont);
			rx.add(record, "send_qunt", rec.send_qunt);
			rx.add(record, "remk", rec.remk);
		}
		/****** CURLIST1 END */
		
		
		
		rx.add(resForm, "d_ji_cnt", ds.d_ji_cnt);
		rx.add(resForm, "d_ji_qunt", ds.d_ji_qunt);
		rx.add(resForm, "d_yo_cnt", ds.d_yo_cnt);
		rx.add(resForm, "d_yo_qunt", ds.d_yo_qunt);
		rx.add(resForm, "d_cnt", ds.d_cnt);
		rx.add(resForm, "d_qunt", ds.d_qunt);
		rx.add(resForm, "d_fee", ds.d_fee);
		rx.add(resForm, "m_ji_cnt", ds.m_ji_cnt);
		rx.add(resForm, "m_ji_qunt", ds.m_ji_qunt);
		rx.add(resForm, "m_yo_cnt", ds.m_yo_cnt);
		rx.add(resForm, "m_yo_qunt", ds.m_yo_qunt);
		rx.add(resForm, "m_cnt", ds.m_cnt);
		rx.add(resForm, "m_qunt", ds.m_qunt);
		rx.add(resForm, "m_fee", ds.m_fee);
		
		rx.add(resForm, "spc_matt_1", ds.spc_matt_1);/**특기사항**/
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
