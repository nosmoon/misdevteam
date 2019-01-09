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
* 파일명 : se_snd_2520_l.jsp
* 기능 :  판매-발송관리-발송비청구
* 작성일자 : 2009-02-25
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
	SE_SND_2520_LDataSet ds = (SE_SND_2520_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;

	formData				= rx.add(root	, "chglist"		, "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_2520_LCURLISTRecord rec = (SE_SND_2520_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData		, "record"				, "");
			rx.add(record, "cmpy_cd"			, rec.cmpy_cd          	  	);
			rx.add(record, "reg_dt"				, rec.reg_dt              	);
			rx.add(record, "reg_seq"			, rec.reg_seq             	);
			rx.add(record, "ptcr_seq"			, rec.ptcr_seq            	);
			rx.add(record, "route_clsf"			, rec.route_clsf          	);
			rx.add(record, "tran_uprc_cd"		, rec.tran_uprc_cd        	);
			rx.add(record, "tran_uprc_route_nm"	, rec.tran_uprc_route_nm  	);
			rx.add(record, "prt_plac_cd"		, rec.prt_plac_cd         	);
			rx.add(record, "tran_uprc_clas"		, rec.tran_uprc_clas      	);
			rx.add(record, "medi_cd"			, rec.medi_cd             	);
			rx.add(record, "sect_cd"			, rec.sect_cd             	);
			rx.add(record, "sect_nm"			, rec.sect_nm             	);
			rx.add(record, "tran_cmpy_cd"		, rec.tran_cmpy_cd        	);
			rx.add(record, "tran_cmpy_nm"		, rec.tran_cmpy_nm        	);
			rx.add(record, "std_tran_uprc"		, rec.std_tran_uprc       	);
			rx.add(record, "pay_tran_uprc"		, rec.pay_tran_uprc       	);
			rx.add(record, "dlco_no"			, rec.dlco_no             	);
			rx.add(record, "dlco_clsf"			, rec.dlco_clsf           	);
			rx.add(record, "pay_mthd_clsf"		, rec.pay_mthd_clsf       	);
			rx.add(record, "stmt_clsf"			, rec.stmt_clsf           	);
			rx.add(record, "stmt_no"			, rec.stmt_no             	);
			rx.add(record, "elec_stmt_yn"		, rec.elec_stmt_yn        	);
			rx.add(record, "elec_stmt_id"		, rec.elec_stmt_id        	);
			rx.add(record, "stmt_id"			, rec.stmt_id             	);
			rx.add(record, "rcpt_clsf"			, rec.rcpt_clsf           	);
			rx.add(record, "stmt_dt"			, rec.stmt_dt             	);
			rx.add(record, "work_dds"			, rec.work_dds            	);
			rx.add(record, "pay_tran_cost"		, rec.pay_tran_cost       	);
			rx.add(record, "vat"				, rec.vat					);
			rx.add(record, "eps_no"				, rec.eps_no              	);
			rx.add(record, "acct_no"			, rec.acct_no             	);
			rx.add(record, "zip"				, rec.zip                 	);
			rx.add(record, "addr"				, rec.addr                	);
			rx.add(record, "dtls_addr"			, rec.dtls_addr           	);
			rx.add(record, "tel_no"				, rec.tel_no              	);
			rx.add(record, "car_no"				, rec.car_no              	);
			rx.add(record, "bank_cd"			, rec.bank_cd              	);
			rx.add(record, "remk"				, rec.remk              	);
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
			<ptcr_seq/>
			<route_clsf/>
			<tran_uprc_cd/>
			<tran_uprc_route_nm/>
			<prt_plac_cd/>
			<medi_cd/>
			<tran_cmpy_nm/>
			<dlco_no/>
			<corp_clsf/>
			<tran_cost/>
			<work_dds/>
			<mm_tran_cost/>
			<eps_no/>
			<acct_no/>
			<zip/>
			<addr/>
			<dtls_addr/>
			<tel_no/>
			<car_no/>
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

<% /* 작성시간 : Wed Feb 25 14:32:14 KST 2009 */ %>