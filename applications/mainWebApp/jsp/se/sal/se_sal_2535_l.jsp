<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.sal.ds.*
	,	chosun.ciis.se.sal.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_sal_2535_l.jsp
* 기능 : 계산서단건등록-계산서상세조회
* 작성일자 : 2009-07-21
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
	SE_SAL_2535_LDataSet ds = (SE_SAL_2535_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resform = rx.add(root, "resform", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SAL_2535_LCURLISTRecord rec = (SE_SAL_2535_LCURLISTRecord)ds.curlist.get(i);
			rx.add(resform, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(resform, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(resform, "slip_seq", rec.slip_seq);
			/*
			rx.add(resform, "prof_type_cd", rec.prof_type_cd);
			rx.add(resform, "occr_slip_occr_dt", rec.occr_slip_occr_dt);
			rx.add(resform, "occr_slip_clsf_cd", rec.occr_slip_clsf_cd);
			rx.add(resform, "occr_slip_seq", rec.occr_slip_seq);
			rx.add(resform, "occr_slip_sub_seq", rec.occr_slip_sub_seq);
			rx.add(resform, "occr_slip_arow_no", rec.occr_slip_arow_no);
			*/
			rx.add(resform, "make_dt", rec.make_dt);
			rx.add(resform, "dlco_no", rec.dlco_no);
			rx.add(resform, "ern", rec.ern);
			rx.add(resform, "dlco_nm", rec.dlco_nm);
			rx.add(resform, "presi_nm", rec.presi_nm);
			rx.add(resform, "zip_1", rec.zip_1);
			rx.add(resform, "zip_2", rec.zip_2);
			rx.add(resform, "addr", rec.addr);
			rx.add(resform, "dtls_addr", rec.dtls_addr);
			rx.add(resform, "bizcond", rec.bizcond);
			rx.add(resform, "item", rec.item);
			rx.add(resform, "corp_clsf", rec.corp_clsf);
			rx.add(resform, "suply_amt", rec.suply_amt);
			rx.add(resform, "vat_amt", rec.vat_amt);
			rx.add(resform, "rcpm_amt", rec.rcpm_amt);
			rx.add(resform, "remk", rec.remk);
			rx.add(resform, "elec_tax_bill_yn", rec.elec_tax_bill_yn);
			rx.add(resform, "elec_tax_issu_dt", rec.elec_tax_issu_dt);
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
			<slip_clsf_cd/>
			<slip_occr_dt/>
			<slip_seq/>
			<prof_type_cd/>
			<occr_slip_occr_dt/>
			<occr_slip_clsf_cd/>
			<occr_slip_seq/>
			<occr_slip_sub_seq/>
			<occr_slip_arow_no/>
			<make_dt/>
			<dlco_no/>
			<ern/>
			<dlco_nm/>
			<presi_nm/>
			<zip_1/>
			<zip_2/>
			<addr/>
			<dtls_addr/>
			<bizcond/>
			<item/>
			<suply_amt/>
			<vat_amt/>
			<rcpm_amt/>
			<remk/>
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

<% /* 작성시간 : Tue Jul 21 11:05:14 KST 2009 */ %>