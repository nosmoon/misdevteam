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
* 파일명 : se_snd_2710_l.jsp
* 기능 :  판매-발송관리-기간별수송비 조회
* 작성일자 : 2009-03-02
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
	SE_SND_2710_LDataSet ds = (SE_SND_2710_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_2710_LCURLISTRecord rec = (SE_SND_2710_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet		, "record"			, "");
			rx.add(record, "pay_dt"				, rec.pay_dt			);
			rx.add(record, "tran_uprc_clas"		, rec.tran_uprc_clas	);
			rx.add(record, "tran_uprc_nm"		, rec.tran_uprc_nm		);
			rx.add(record, "std_tran_uprc"		, rec.std_tran_uprc		);
			rx.add(record, "pay_tran_uprc"		, rec.pay_tran_uprc		);
			rx.add(record, "work_dds"			, rec.work_dds			);
			rx.add(record, "pay_tran_cost"		, rec.pay_tran_cost		);
			rx.add(record, "tran_uprc_cd"		, rec.tran_uprc_cd		);
			rx.add(record, "tran_uprc_route_nm"	, rec.tran_uprc_route_nm);
			rx.add(record, "route_clsf"			, rec.route_clsf		);
			rx.add(record, "route_clsf_nm"		, rec.route_clsf_nm		);
			rx.add(record, "route_cd"			, rec.route_cd			);
			rx.add(record, "route_nm"			, rec.route_nm			);
			rx.add(record, "prt_plac_cd"		, rec.prt_plac_cd		);
			rx.add(record, "prt_plac_nm"		, rec.prt_plac_nm		);
			rx.add(record, "dlco_no"			, rec.dlco_no			);
			rx.add(record, "tran_cmpy_cd"		, rec.tran_cmpy_cd		);
			rx.add(record, "tran_cmpy_nm"		, rec.tran_cmpy_nm		);
			rx.add(record, "corp_clsf"			, rec.corp_clsf			);
			rx.add(record, "corp_clsf_nm"		, rec.corp_clsf_nm		);
			rx.add(record, "acct_no"			, rec.acct_no			);
			rx.add(record, "medi_cd"			, rec.medi_cd			);
			rx.add(record, "medi_nm"			, rec.medi_nm			);
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
			<pay_dt/>
			<tran_uprc_clas/>
			<tran_uprc_nm/>
			<std_tran_uprc/>
			<pay_tran_uprc/>
			<work_dds/>
			<pay_tran_cost/>
			<tran_uprc_cd/>
			<tran_uprc_route_nm/>
			<route_clsf/>
			<route_clsf_nm/>
			<route_cd/>
			<route_nm/>
			<prt_plac_cd/>
			<prt_plac_nm/>
			<dlco_no/>
			<tran_cmpy_cd/>
			<tran_cmpy_nm/>
			<corp_clsf/>
			<corp_clsf_nm/>
			<acct_no/>
			<medi_cd/>
			<medi_nm/>
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

<% /* 작성시간 : Mon Mar 02 13:18:46 KST 2009 */ %>