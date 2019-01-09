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
* 파일명 : se_trg_1220_l.jsp
* 기능 : 목표결과조회-월별 내역
* 작성일자 : 2009-04-03
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
	SE_TRG_1220_LDataSet ds = (SE_TRG_1220_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "trgtlist", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_TRG_1220_LCURLISTRecord rec = (SE_TRG_1220_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "trgt_clsf_nm", rec.trgt_clsf_nm);
			rx.add(record, "trgt_01", rec.trgt_01);
			rx.add(record, "rslt_01", rec.rslt_01);
			rx.add(record, "trgt_02", rec.trgt_02);
			rx.add(record, "rslt_02", rec.rslt_02);
			rx.add(record, "trgt_03", rec.trgt_03);
			rx.add(record, "rslt_03", rec.rslt_03);
			rx.add(record, "trgt_04", rec.trgt_04);
			rx.add(record, "rslt_04", rec.rslt_04);
			rx.add(record, "trgt_05", rec.trgt_05);
			rx.add(record, "rslt_05", rec.rslt_05);
			rx.add(record, "trgt_06", rec.trgt_06);
			rx.add(record, "rslt_06", rec.rslt_06);
			rx.add(record, "trgt_07", rec.trgt_07);
			rx.add(record, "rslt_07", rec.rslt_07);
			rx.add(record, "trgt_08", rec.trgt_08);
			rx.add(record, "rslt_08", rec.rslt_08);
			rx.add(record, "trgt_09", rec.trgt_09);
			rx.add(record, "rslt_09", rec.rslt_09);
			rx.add(record, "trgt_10", rec.trgt_10);
			rx.add(record, "rslt_10", rec.rslt_10);
			rx.add(record, "trgt_11", rec.trgt_11);
			rx.add(record, "rslt_11", rec.rslt_11);
			rx.add(record, "trgt_12", rec.trgt_12);
			rx.add(record, "rslt_12", rec.rslt_12);
			rx.add(record, "trgt_sum", rec.trgt_sum);
			rx.add(record, "rslt_sum", rec.rslt_sum);
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
			<trgt_01/>
			<rslt_01/>
			<trgt_02/>
			<rslt_02/>
			<trgt_03/>
			<rslt_03/>
			<trgt_04/>
			<rslt_04/>
			<trgt_05/>
			<rslt_05/>
			<trgt_06/>
			<rslt_06/>
			<trgt_07/>
			<rslt_07/>
			<trgt_08/>
			<rslt_08/>
			<trgt_09/>
			<rslt_09/>
			<trgt_10/>
			<rslt_10/>
			<trgt_11/>
			<rslt_11/>
			<trgt_12/>
			<rslt_12/>
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

<% /* 작성시간 : Fri Apr 03 10:09:33 KST 2009 */ %>