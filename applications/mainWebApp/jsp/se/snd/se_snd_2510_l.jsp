<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.snd.rec.*
	,	chosun.ciis.se.snd.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_snd_2510_l.jsp
* 기능 :   판매-발송관리-발송비청구
* 작성일자 : 2009-02-24
* 작성자 : 김대준
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_SND_2510_LDataSet ds = (SE_SND_2510_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_2510_LCURLISTRecord rec = (SE_SND_2510_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record"	, ""			);
			rx.add(record, "cmpy_cd"		, rec.cmpy_cd			);
			rx.add(record, "reg_dt"			, rec.reg_dt			);
			rx.add(record, "reg_seq"		, rec.reg_seq			);
			rx.add(record, "tran_uprc_clas"	, rec.tran_uprc_clas	);
			rx.add(record, "pay_dt"			, rec.pay_dt			);
			rx.add(record, "send_yymm"		, rec.send_yymm			);
			rx.add(record, "send_frdt"		, rec.send_frdt			);
			rx.add(record, "send_todt"		, rec.send_todt			);
			rx.add(record, "tot_amt"		, rec.tot_amt			);
			rx.add(record, "clos_yn"		, rec.clos_yn			);
			rx.add(record, "actu_slip_no"	, rec.actu_slip_no		);
			rx.add(record, "occr_dt"		, rec.occr_dt			);
			rx.add(record, "seq"			, rec.seq				);
			rx.add(record, "remk"			, rec.remk				);
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
			<cmpy_cd/>
			<reg_dt/>
			<reg_seq/>
			<tran_uprc_clas/>
			<pay_dt/>
			<send_yyymm/>
			<send_frdt/>
			<send_todt/>
			<tot_amt/>
			<decid_stat_clsf/>
			<decid_stat_nm/>
			<clos_stat_clsf/>
			<actu_slip_no/>
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

<% /* 작성시간 : Tue Feb 24 21:30:00 KST 2009 */ %>