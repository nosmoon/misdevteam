<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.sal.rec.*
	,	chosun.ciis.se.sal.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_sal_1730_l.jsp
* 기능 :   판매 - 지대관리 - 매출관리 - 계산서 발행
* 작성일자 : 2009-04-20
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
	SE_SAL_1730_LDataSet ds = (SE_SAL_1730_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;

	formData				= rx.add(root	, "alllist"		, "");
	rx.add(formData				, "trsmy_cnt"					, ds.getTrsmy_cnt());
	rx.add(formData				, "trsmn_cnt"					, ds.getTrsmn_cnt());
	try {
		for(int i = 0; i < ds.alllist.size(); i++) {
			SE_SAL_1730_LALLLISTRecord rec = (SE_SAL_1730_LALLLISTRecord)ds.alllist.get(i);
			int record = rx.add(formData				, "record"					, "");
			rx.add(record, "bo_cd"						, rec.bo_cd						);
			rx.add(record, "bo_seq"						, rec.bo_seq					);
			rx.add(record, "dept_cd"					, rec.dept_cd					);
			rx.add(record, "dept_nm"					, rec.dept_nm					);
			rx.add(record, "part_cd"					, rec.part_cd					);
			rx.add(record, "part_nm"					, rec.part_nm					);
			rx.add(record, "area_cd"					, rec.area_cd					);
			rx.add(record, "area_nm"					, rec.area_nm					);
			rx.add(record, "bo_nm"						, rec.bo_nm						);
			rx.add(record, "sale_amt"					, rec.sale_amt					);
			rx.add(record, "bns_sale_amt"				, rec.bns_sale_amt				);
			rx.add(record, "bns_vat_amt"				, rec.bns_vat_amt				);
			rx.add(record, "sum_amt"					, rec.sum_amt					);
			rx.add(record, "elec_trsm_yn"				, rec.elec_trsm_yn				);
			rx.add(record, "area_srt_seq"				, rec.area_srt_seq				);
			rx.add(record, "jd_addr"					, rec.jd_addr					);
			rx.add(record, "jd_dtls_addr"				, rec.jd_dtls_addr				);
			rx.add(record, "bo_head_nm"					, rec.bo_head_nm				);
			rx.add(record, "tel"						, rec.tel						);
			rx.add(record, "zip"						, rec.zip						);
			rx.add(record, "vitl_acct_no"				, rec.vitl_acct_no				);
			rx.add(record, "prvmm_dd_tot_shet_qty_110"	, rec.prvmm_dd_tot_shet_qty_110	);
			rx.add(record, "prvmm_sale_amt_110"			, rec.prvmm_sale_amt_110		);
			rx.add(record, "prvmm_dd_tot_shet_qty_130"	, rec.prvmm_dd_tot_shet_qty_130	);
			rx.add(record, "prvmm_sale_amt_130"			, rec.prvmm_sale_amt_130		);
			rx.add(record, "prvmm_dd_tot_shet_qty_210"	, rec.prvmm_dd_tot_shet_qty_210	);
			rx.add(record, "prvmm_sale_amt_210"			, rec.prvmm_sale_amt_210		);
			rx.add(record, "nxt_qty_110"				, rec.nxt_qty_110				);
			rx.add(record, "prvmm_sale_amt"				, rec.prvmm_sale_amt			);
			rx.add(record, "prvmm_fpymt_amt"			, rec.prvmm_fpymt_amt			);
			rx.add(record, "prvmm_clam_amt"				, rec.prvmm_clam_amt			);
			rx.add(record, "rcpm_amt"					, rec.rcpm_amt					);
			rx.add(record, "un_pymt_amt"				, rec.un_pymt_amt				);
			rx.add(record, "clam_amt"					, rec.clam_amt					);
			rx.add(record, "cntr_gurt_amt_stot"			, rec.cntr_gurt_amt_stot		);
			rx.add(record, "prvmm_sum_rcpm_amt"			, rec.prvmm_sum_rcpm_amt		);
			rx.add(record, "prvmm_rcpm_amt"				, rec.prvmm_rcpm_amt			);
			rx.add(record, "trgt_rcpm_amt"				, rec.trgt_rcpm_amt				);
			rx.add(record, "ern"						, rec.ern						);
			rx.add(record, "yymm"						, rec.yymm						);
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
	<ALLLIST>
		<record>
			<bo_cd/>
			<bo_seq/>
			<dept_cd/>
			<dept_nm/>
			<part_cd/>
			<part_nm/>
			<area_cd/>
			<area_nm/>
			<bo_nm/>
			<sale_amt/>
			<bns_sale_amt/>
			<bns_vat_amt/>
			<sum_amt/>
			<elec_trsm_yn/>
			<area_srt_seq/>
			<jd_addr/>
			<jd_dtls_addr/>
			<bo_head_nm/>
			<tel/>
			<zip/>
			<vitl_acct_no/>
			<prvmm_dd_tot_shet_qty_110/>
			<prvmm_sale_amt_110/>
			<prvmm_dd_tot_shet_qty_130/>
			<prvmm_sale_amt_130/>
			<prvmm_dd_tot_shet_qty_210/>
			<prvmm_sale_amt_210/>
			<nxt_qty_110/>
			<prvmm_sale_amt/>
			<prvmm_fpymt_amt/>
			<prvmm_clam_amt/>
			<rcpm_amt/>
			<un_pymt_amt/>
			<clam_amt/>
			<cntr_gurt_amt_stot/>
			<prvmm_sum_rcpm_amt/>
			<prvmm_rcpm_amt/>
			<trgt_rcpm_amt/>
		</record>
	</ALLLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<alllist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Mon Apr 20 15:02:47 KST 2009 */ %>