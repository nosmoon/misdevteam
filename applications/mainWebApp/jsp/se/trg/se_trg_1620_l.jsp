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
* 파일명 : se_trg_1620_l.jsp
* 기능 : 지국평가결과조회 - 종합결과
* 작성일자 : 2009-04-06
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
	SE_TRG_1620_LDataSet ds = (SE_TRG_1620_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "tab2form", "");

	try {
		int grid1 = rx.add(resData, "grid1", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_TRG_1620_LCURLISTRecord rec = (SE_TRG_1620_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(grid1, "record", "");
			rx.add(record, "evlu_grp_nm", rec.evlu_grp_nm);
			rx.add(record, "hwak_p", rec.hwak_p);
			rx.add(record, "hwak", rec.hwak);
			rx.add(record, "sil_p", rec.sil_p);
			rx.add(record, "sil", rec.sil);
		}
		int grid2 = rx.add(resData, "grid2", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			SE_TRG_1620_LCURLIST2Record rec = (SE_TRG_1620_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(grid2, "record", "");
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "chrg_flnm", rec.chrg_flnm);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "evlu_grp_nm", rec.evlu_grp_nm);
			rx.add(record, "cmpt_acpn", rec.cmpt_acpn);
			rx.add(record, "borank", rec.borank);
			rx.add(record, "prz_amt", rec.prz_amt);
			rx.add(record, "scor1", rec.scor1);
			rx.add(record, "std_scor1", rec.std_scor1);
			rx.add(record, "scor2", rec.scor2);
			rx.add(record, "std_scor2", rec.std_scor2);
			//System.out.println("std_scor>>>>>>"+rec.std_scor1);
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
	<CURLIST2>
		<record>
			<area_nm/>
			<chrg_flnm/>
			<bo_nm/>
			<bo_head_nm/>
			<evlu_grp_nm/>
			<cmpt_acpn/>
			<borank/>
			<prz_amt/>
			<scor1/>
			<std_scor1/>
			<scor2/>
			<std_scor2/>
		</record>
	</CURLIST2>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<CURLIST>
		<record>
			<evlu_grp_nm/>
			<hwak_p/>
			<hwak/>
			<sil_p/>
			<sil/>
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
		<curlist/>
		<curlist2/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Mon Apr 06 15:30:33 KST 2009 */ %>