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
* 파일명 : mt_close_6130_l.jsp
* 기능 : 자재 - 마감관리 - 위탁인쇄현황
* 작성일자 : 2010.07.21
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
	MT_CLOSE_6130_LDataSet ds = (MT_CLOSE_6130_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "wtislist", "");

	try {
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_CLOSE_6130_LCURLISTRecord rec = (MT_CLOSE_6130_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			
			rx.add(record, "yymm", rec.yymm);
			rx.add(record, "fac_nm", rec.fac_nm);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "prt_fee", rec.prt_fee);
			rx.add(record, "psplat_use_amt", rec.psplat_use_amt);
			rx.add(record, "gnaw_fee", rec.gnaw_fee);
			rx.add(record, "film_make_fee", rec.film_make_fee);
			rx.add(record, "pack_fee", rec.pack_fee);
			rx.add(record, "paper_portage", rec.paper_portage);
			rx.add(record, "gita_amt", rec.gita_amt);
			rx.add(record, "tot_amt", rec.tot_amt);
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Tue Jan 20 15:56:25 KST 2009 */ %>