<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.close.rec.*
	,	chosun.ciis.mt.close.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : mt_close_6120_l.jsp
* 기능 : 자재 - 마감관리 - 참고지표
* 작성일자 : 2010.07.14
* 작성자 : 이민효
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	RwXml rx = new RwXml();
	MT_CLOSE_6120_LDataSet ds = (MT_CLOSE_6120_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "cgjplist", "");

	try {
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_CLOSE_6120_LCURLISTRecord rec = (MT_CLOSE_6120_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			
			rx.add(record, "yymm", rec.yymm);
			rx.add(record, "fac_nm", rec.fac_nm);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "issu_cnt", rec.issu_cnt);
			rx.add(record, "issu_pcnt", rec.issu_pcnt);
			rx.add(record, "issu_real_pcnt", rec.issu_real_pcnt);
			rx.add(record, "issu_qty", rec.issu_qty);
			rx.add(record, "issu_medi_pcnt", rec.issu_medi_pcnt);
			rx.add(record, "issu_tot_pcnt", rec.issu_tot_pcnt);
			rx.add(record, "w_amt", rec.w_amt);
			rx.add(record, "b_amt", rec.b_amt);
			rx.add(record, "y_amt", rec.y_amt);
			rx.add(record, "tot_amt", rec.tot_amt);
			rx.add(record, "ndduc_rate", rec.ndduc_rate);
			rx.add(record, "one_qty", rec.one_qty);
			rx.add(record, "one_pcnt", rec.one_pcnt);
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Tue Jan 20 15:56:25 KST 2009 */ %>