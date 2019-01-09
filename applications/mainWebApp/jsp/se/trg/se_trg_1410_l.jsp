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
* 파일명 : se_trg_1410_l.jsp
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
	SE_TRG_1410_LDataSet ds = (SE_TRG_1410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int tab1form = rx.add(root, "tab1form", "");

	try {
	
		int iColcnt = (int)ds.colcnt;	//그룹갯수
		rx.add(tab1form, "colcnt", iColcnt);
		rx.add(tab1form, "title", ds.title);
		rx.add(tab1form, "bo_grp", ds.bo_grp);
		rx.add(tab1form, "evlu_seq", ds.evlu_seq);
		
		String[] bo_cnt_ar;	
		bo_cnt_ar = ds.bo_cnt.split("\\^");		//지국갯수
		
		int grid1 = rx.add(tab1form, "grid1", "");
		int record = rx.add(grid1, "record", "");
		rx.add(record, "col1", "지국수");
		
		int bo_cnt_len = bo_cnt_ar.length;
		
		String refnm = "";
		//그룹별 지국수 조회
		for(int i = 0; i < 10; i++) {
			refnm = "grp"+(i+1);
			if(i<iColcnt && bo_cnt_len>i) rx.add(record, refnm, bo_cnt_ar[i]);
			else rx.add(record, refnm, "0");
		}
		rx.add(record, "bo_cnt_sum", ds.bo_cnt_sum);		//합계
		rx.add(record, "real_bocnt", ds.real_bocnt);		//실제지국수
		
		//지국별 그룹수정
		int grid2 = rx.add(tab1form, "grid2", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_TRG_1410_LCURLISTRecord rec = (SE_TRG_1410_LCURLISTRecord)ds.curlist.get(i);
			int record2 = rx.add(grid2, "record", "");
			rx.add(record2, "evlu_grp", rec.evlu_grp);
			rx.add(record2, "area_nm", rec.area_nm);
			rx.add(record2, "bo_cdseq", rec.bo_cd+rec.bo_seq);
			rx.add(record2, "bo_nm", rec.bo_nm);
			rx.add(record2, "thmmsendqty", rec.thmmsendqty);
			rx.add(record2, "chrg_flnm", rec.chrg_flnm);
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<CURLIST>
		<record>
			<evlu_grp/>
			<area_nm/>
			<bo_cd/>
			<bo_seq/>
			<bo_nm/>
			<thmmsendqty/>
			<chrg_flnm/>
		</record>
	</CURLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<schgb/>
		<colcnt/>
		<title/>
		<bo_grp/>
		<bo_cnt/>
		<bo_cnt_sum/>
		<real_bocnt/>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Wed Apr 01 17:55:21 KST 2009 */ %>