<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.trg.ds.*
	,	chosun.ciis.se.trg.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_trg_1020_l.jsp
* 기능 : 지역별목표등록 - 목표 내역
* 작성일자 : 2009-03-20
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
	SE_TRG_1020_LDataSet ds = (SE_TRG_1020_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	long lTot = 0L;
	gridData = rx.add(root, "trgtlist", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_TRG_1020_LCURLISTRecord rec = (SE_TRG_1020_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "trgt_clsf_nm", rec.trgt_clsf_nm);
			rx.add(record, "trgt_clsf", rec.trgt_clsf);
			rx.add(record, "pr_trgt", rec.pr_trgt);
			rx.add(record, "pr_rslt", rec.pr_rslt);
			rx.add(record, "trgt_yy", rec.trgt_tot);
			rx.add(record, "trgt_01", rec.trgt_01);
			rx.add(record, "trgt_02", rec.trgt_02);
			rx.add(record, "trgt_03", rec.trgt_03);
			rx.add(record, "trgt_04", rec.trgt_04);
			rx.add(record, "trgt_05", rec.trgt_05);
			rx.add(record, "trgt_06", rec.trgt_06);
			rx.add(record, "trgt_07", rec.trgt_07);
			rx.add(record, "trgt_08", rec.trgt_08);
			rx.add(record, "trgt_09", rec.trgt_09);
			rx.add(record, "trgt_10", rec.trgt_10);
			rx.add(record, "trgt_11", rec.trgt_11);
			rx.add(record, "trgt_12", rec.trgt_12);
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
			<trgt_clsf/>
			<trgt_clsf_nm/>
			<pr_trgt/>
			<pr_rslt/>
			<trgt_01/>
			<trgt_02/>
			<trgt_03/>
			<trgt_04/>
			<trgt_05/>
			<trgt_06/>
			<trgt_07/>
			<trgt_08/>
			<trgt_09/>
			<trgt_10/>
			<trgt_11/>
			<trgt_12/>
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
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Fri Mar 20 18:01:39 KST 2009 */ %>