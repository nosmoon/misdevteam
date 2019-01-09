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
* 파일명 : mt_close_6110_l.jsp
* 기능 : 자재 - 마감관리 - 원가
* 작성일자 : 2010.07.07
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
	MT_CLOSE_6110_LDataSet ds = (MT_CLOSE_6110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "curlist", "");

	try {
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_CLOSE_6110_LCURLISTRecord rec = (MT_CLOSE_6110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			
			rx.add(record, "yymm", rec.yymm);
			rx.add(record, "w_wgt", rec.w_wgt);
			rx.add(record, "w_amt", rec.w_amt);
			rx.add(record, "b_isink_amt", rec.b_isink_amt);
			rx.add(record, "b_isgt_amt", rec.b_isgt_amt);
			rx.add(record, "b_hsjr_amt", rec.b_hsjr_amt);
			rx.add(record, "b_pjjr_amt", rec.b_pjjr_amt);
			rx.add(record, "b_smjj_amt", rec.b_smjj_amt);
			rx.add(record, "b_tot_amt", rec.b_tot_amt);
			rx.add(record, "ndduc_rate", rec.ndduc_rate);
			rx.add(record, "tot_amt", rec.tot_amt);
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Tue Jan 20 15:56:25 KST 2009 */ %>