<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.trg.ds.*
	,	chosun.ciis.se.trg.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_trg_1420_l.jsp
* 기능 : 지국평가 기준관리
* 작성일자 : 2009-04-01
* 작성자 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_TRG_1420_LDataSet ds = (SE_TRG_1420_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int tab2form = rx.add(root, "tab2form", "");
	try {
		int iColcnt = Integer.parseInt(ds.colcnt);	//그룹갯수
		rx.add(tab2form, "colcnt", iColcnt);
		rx.add(tab2form, "title", ds.title);
		rx.add(tab2form, "bo_grp", ds.bo_grp);
		rx.add(tab2form, "evlu_seq", ds.evlu_seq);
		rx.add(tab2form, "rfl_ratio1", ds.rfl_ratio1);
		rx.add(tab2form, "rfl_ratio2", ds.rfl_ratio2);
		
		int grid1 = rx.add(tab2form, "grid1", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			SE_TRG_1420_LCURLIST1Record rec = (SE_TRG_1420_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(grid1, "record", "");
			rx.add(record, "rank", rec.rank);
				
			String[] amt_ar;	
			amt_ar = rec.amt.split("\\^");		//반영액
			int amt_len = amt_ar.length;
				
			String refnm = "";
			for(int j = 0; j < 10; j++) {
				refnm = "grp"+(j+1);
				if(j<iColcnt && amt_len>j) rx.add(record, refnm, amt_ar[j]);
				else rx.add(record, refnm, "0");
			}
		}
		int grid2 = rx.add(tab2form, "grid2", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			SE_TRG_1420_LCURLIST2Record rec = (SE_TRG_1420_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(grid2, "record", "");
			rx.add(record, "rank", rec.rank);
			
			String[] amt_ar;	
			amt_ar = rec.amt.split("\\^");		//반영액
			int amt_len = amt_ar.length;
				
			String refnm = "";
			for(int j = 0; j < 10; j++) {
				refnm = "grp"+(j+1);
				if(j<iColcnt && amt_len>j) rx.add(record, refnm, amt_ar[j]);
				else rx.add(record, refnm, "0");
			}
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
