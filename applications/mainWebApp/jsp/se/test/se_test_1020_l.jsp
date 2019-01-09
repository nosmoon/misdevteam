<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.test.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.se.test.ds.*;
	"
%>

<%

	RwXml rx = new RwXml();
	SE_TEST_1020_LDataSet ds = (SE_TEST_1020_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "gridData", "");
	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_TEST_1020_LCURLISTRecord rec = (SE_TEST_1020_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(tempData, "record", "");
			rx.add(record, "yy", rec.yy);
			rx.add(record, "mm", rec.mm);
			rx.add(record, "week", rec.week);
			
			String	cmpynm = "";
			if("100".equals(rec.cmpycd)) 		cmpynm = "조선일보";
			else if("500".equals(rec.cmpycd)) 	cmpynm = "TV조선";
			else if("550".equals(rec.cmpycd)) 	cmpynm = "미디어렙";		
			else if("315".equals(rec.cmpycd)) 	cmpynm = "조선뉴스프레스";	
			else if("334".equals(rec.cmpycd)) 	cmpynm = "조선경제아이";		
			else if("700".equals(rec.cmpycd)) 	cmpynm = "통일나눔";				
			rx.add(record, "cmpynm", cmpynm);
			rx.add(record, "cmpycd", rec.cmpycd);
			
			String	worknm = "";
			if("0".equals(rec.workcd)) 			worknm = "EIP/전재결재";
			else if("1".equals(rec.workcd)) 	worknm = "인사급여";
			else if("2".equals(rec.workcd)) 	worknm = "회계";	
			else if("3".equals(rec.workcd)) 	worknm = "광고관리";
			else if("4".equals(rec.workcd)) 	worknm = "판매";	
			else if("5".equals(rec.workcd)) 	worknm = "자재";
			else if("6".equals(rec.workcd)) 	worknm = "자산";	
			else if("7".equals(rec.workcd)) 	worknm = "사업관리";
			else if("8".equals(rec.workcd)) 	worknm = "공정관리";	
			else if("9".equals(rec.workcd)) 	worknm = "출판";
			else if("10".equals(rec.workcd)) 	worknm = "공통관리";
			else if("11".equals(rec.workcd)) 	worknm = "공통";
			rx.add(record, "workcd", rec.workcd);
			rx.add(record, "worknm", worknm);
			
			rx.addCData(record, "vip_lastweek", rec.vip_lastweek);
			rx.addCData(record, "lastweek", rec.lastweek);
			rx.addCData(record, "thisweek", rec.thisweek);			
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Fri Jan 30 16:14:10 KST 2009 */ %>