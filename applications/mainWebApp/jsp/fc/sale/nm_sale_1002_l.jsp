<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.sale.rec.*
	,	chosun.ciis.fc.sale.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : nm_sale_1002_l.jsp
* 기능 :  컨텐츠판매수입결의
* 작성일자 : 
* 작성자 : 
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	NM_SALE_1002_LDataSet ds = (NM_SALE_1002_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;

	formData				= rx.add(root	, "chglist"		, "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			NM_SALE_1002_LCURLISTRecord rec = (NM_SALE_1002_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record"			, "");
			rx.add(record, "yymm"			, rec.yymm			);
			rx.add(record, "seq"			, rec.seq		);
			rx.add(record, "sub_seq"		, rec.sub_seq	);
			rx.add(record, "medi_cd"		, rec.medi_cd			);
			rx.add(record, "medi_clsf"		, rec.medi_clsf		);
			rx.add(record, "dtls_medi_cd"	, rec.dtls_medi_cd			);
			rx.addCData(record, "dtls_medi_nm"	, rec.dtls_medi_nm	);
			rx.addCData(record, "orgn_dtls_medi_nm"	, rec.orgn_dtls_medi_nm			);
			rx.add(record, "tms"			, rec.tms			);
			rx.add(record, "uprc"			, rec.uprc			);
			rx.add(record, "sale_amt"		, rec.sale_amt		);
			rx.add(record, "divn_per"		, rec.divn_per		);
			rx.add(record, "suply_amt"		, rec.suply_amt		);
			rx.add(record, "vat_amt"		, rec.tax_amt		);
			rx.add(record, "tot_amt"		, rec.tot_amt		);
			rx.add(record, "rmks"			, rec.rmks			);
			rx.add(record, "yymm"			, rec.yymm			);
			rx.add(record, "seq"			, rec.seq		);
			rx.add(record, "sub_seq"		, rec.sub_seq	);
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
			<yymm/>
			<pay_seq/>
			<pay_ptcr_seq/>
			<bo_cd/>
			<bo_seq/>
			<bo_nm/>
			<recp_pers_nm/>
			<prn/>
			<qty/>
			<uprc/>
			<amt/>
			<incm_tax/>
			<res_tax/>
			<real_amt/>
			<area_cd/>
			<area_nm/>
			<dept_cd/>
			<supr_dept_nm/>
			<sub_dept_cd/>
			<dept_nm/>
			<chrg_pers/>
			<acct_no/>
			<rmks/>
			<rcpm_main_nm/>
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

<% /* 작성시간 : Tue Mar 03 09:50:21 KST 2009 */ %>