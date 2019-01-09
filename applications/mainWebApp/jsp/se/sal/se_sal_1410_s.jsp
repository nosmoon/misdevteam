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
* 파일명 : se_sal_1410_s.jsp
* 기능 :   판매 - 지대관리 - 매출관리 - 지대원장
* 작성일자 : 2009-04-06
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
	SE_SAL_1410_SDataSet ds = (SE_SAL_1410_SDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	try {
		
		recordSet			= rx.add(formData	, "jidae_info"		, "");
		for(int i = 0; i < ds.jidaelist.size(); i++) {
			SE_SAL_1410_SJIDAELISTRecord rec 	= (SE_SAL_1410_SJIDAELISTRecord)ds.jidaelist.get(i);
			int record 		= rx.add(recordSet	, "record"				, "");
			rx.add(record, "cmpy_cd"			, rec.cmpy_cd				);
			rx.add(record, "bo_cd"				, rec.bo_cd					);
			rx.add(record, "bo_seq"				, rec.bo_seq				);
			rx.add(record, "yymm"				, rec.yymm					);
			rx.add(record, "area_cd"			, rec.area_cd				);
			rx.add(record, "val_qty_110"		, rec.val_qty_110			);
			rx.add(record, "icdc_calc_qty_110"	, rec.icdc_calc_qty_110		);
			rx.add(record, "spsl_qty_110"		, rec.spsl_qty_110			);
			rx.add(record, "cntr_qty_110"		, rec.cntr_qty_110			);
			rx.add(record, "basi_uprc_110"		, rec.basi_uprc_110			);
			rx.add(record, "rdff_rdu_uprc_110"	, rec.rdff_rdu_uprc_110		);
			rx.add(record, "cntr_uprc_110"		, rec.cntr_uprc_110			);
			rx.add(record, "dnt_qty_110"		, rec.dnt_qty_110			);
			rx.add(record, "regu_subs_uprc_110"	, rec.regu_subs_uprc_110	);
			rx.add(record, "dnt_amt_110"		, rec.dnt_amt_110			);
			rx.add(record, "stetsell_qty_110"	, rec.stetsell_qty_110		);
			rx.add(record, "stetsell_uprc_110"	, rec.stetsell_uprc_110		);
			rx.add(record, "stetsell_amt_110"	, rec.stetsell_amt_110		);
			rx.add(record, "incmp_sale_qty_110"	, rec.incmp_sale_qty_110	);
			rx.add(record, "incmp_sale_amt_110"	, rec.incmp_sale_amt_110	);
			rx.add(record, "prvmm_val_qty_110"	, rec.prvmm_val_qty_110		);
			rx.add(record, "fpymt_encur_amt_110", rec.fpymt_encur_amt_110	);
			rx.add(record, "smt_amt_110"		, rec.smt_amt_110			);
			rx.add(record, "sale_amt_110"		, rec.sale_amt_110			);
			rx.add(record, "dscn_amt_110"		, rec.dscn_amt_110			);
			rx.add(record, "net_sale_amt_110"	, rec.net_sale_amt_110		);
			rx.add(record, "net_sale_amt_all"	, rec.net_sale_amt_all		);
			rx.add(record, "val_qty_130"		, rec.val_qty_130			);
			rx.add(record, "icdc_calc_qty_130"	, rec.icdc_calc_qty_130		);
			rx.add(record, "spsl_qty_130"		, rec.spsl_qty_130			);
			rx.add(record, "cntr_qty_130"		, rec.cntr_qty_130			);
			rx.add(record, "basi_uprc_130"		, rec.basi_uprc_130			);
			rx.add(record, "rdff_rdu_uprc_130"	, rec.rdff_rdu_uprc_130		);
			rx.add(record, "cntr_uprc_130"		, rec.cntr_uprc_130			);
			rx.add(record, "dnt_qty_130"		, rec.dnt_qty_130			);
			rx.add(record, "regu_subs_uprc_130"	, rec.regu_subs_uprc_130	);
			rx.add(record, "dnt_amt_130"		, rec.dnt_amt_130			);
			rx.add(record, "stetsell_qty_130"	, rec.stetsell_qty_130		);
			rx.add(record, "stetsell_uprc_130"	, rec.stetsell_uprc_130		);
			rx.add(record, "stetsell_amt_130"	, rec.stetsell_amt_130		);
			rx.add(record, "incmp_sale_qty_130"	, rec.incmp_sale_qty_130	);
			rx.add(record, "incmp_sale_amt_130"	, rec.incmp_sale_amt_130	);
			rx.add(record, "prvmm_val_qty_130"	, rec.prvmm_val_qty_130		);
			rx.add(record, "fpymt_encur_amt_130", rec.fpymt_encur_amt_130	);
			rx.add(record, "smt_amt_130"		, rec.smt_amt_130			);
			rx.add(record, "sale_amt_130"		, rec.sale_amt_130			);
			rx.add(record, "dscn_amt_130"		, rec.dscn_amt_130			);
			rx.add(record, "net_sale_amt_130"	, rec.net_sale_amt_130		);
		}
		
		recordSet			= rx.add(formData	, "bo_info"			, "");
		for(int i = 0; i < ds.bolist.size(); i++) {
			SE_SAL_1410_SBOLISTRecord rec = (SE_SAL_1410_SBOLISTRecord)ds.bolist.get(i);
			int record 		= rx.add(recordSet, "record", ""				);
			rx.add(record, "bo_cd"				, rec.bo_cd					);
			rx.add(record, "bo_seq"				, rec.bo_seq				);
			rx.add(record, "bo_head_nm"			, rec.bo_head_nm			);
			rx.add(record, "dept_nm"			, rec.dept_nm				);
			rx.add(record, "part_nm"			, rec.part_nm				);
			rx.add(record, "area_nm"			, rec.area_nm				);
			rx.add(record, "flnm"				, rec.flnm					);
			rx.add(record, "cntr_stat_nm"		, rec.cntr_stat_nm			);
			rx.add(record, "bo_cntr_dt"			, rec.bo_cntr_dt			);
			rx.add(record, "jd_sell_net_nm"		, rec.jd_sell_net_nm		);
			rx.add(record, "jd_sell_net_clsf"	, rec.jd_sell_net_clsf		);
		}
		
		recordSet			= rx.add(formData	, "rcpm_info"			, "");
		for(int i = 0; i < ds.rcpmlist.size(); i++) {
			SE_SAL_1410_SRCPMLISTRecord rec = (SE_SAL_1410_SRCPMLISTRecord)ds.rcpmlist.get(i);
			int record 		= rx.add(recordSet, "record"				, "");
			rx.add(record, "fpymt_dt"			, rec.fpymt_dt				);
			rx.add(record, "ratio"				, rec.ratio					);
			rx.add(record, "cyov_bal"			, rec.cyov_bal				);
			rx.add(record, "prvmm_net_sale_amt"	, rec.prvmm_net_sale_amt	);
			rx.add(record, "smt_amt"			, rec.smt_amt				);
			rx.add(record, "rcpm_amt"			, rec.rcpm_amt				);
			rx.add(record, "rcpm_bal"			, rec.rcpm_bal				);
			rx.add(record, "label"				, rec.label					);
			rx.add(record, "bo_cyov"			, rec.bo_cyov				);
			rx.add(record, "adjm_cyov"			, rec.adjm_cyov				);
			rx.add(record, "bal"				, rec.bal					);
			rx.add(record, "net_sale_amt"		, rec.net_sale_amt			);
			rx.add(record, "smt_amt2"			, rec.smt_amt2				);
		}
		
		recordSet			= rx.add(formData	, "qty_info"			, "");
		for(int i = 0; i < ds.qtylist.size(); i++) {
			SE_SAL_1410_SQTYLISTRecord rec = (SE_SAL_1410_SQTYLISTRecord)ds.qtylist.get(i);
			int record = rx.add(recordSet, "record"						, "");
			rx.add(record, "qty_110_1"			, rec.qty_110_1				);
			rx.add(record, "qty_110_2"			, rec.qty_110_2				);
			rx.add(record, "qty_110_3"			, rec.qty_110_3				);
			rx.add(record, "qty_130_1"			, rec.qty_130_1				);
			rx.add(record, "qty_130_2"			, rec.qty_130_2				);
			rx.add(record, "qty_130_3"			, rec.qty_130_3				);
			rx.add(record, "qty_130_4"			, rec.qty_130_4				);
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
	<JIDAELIST>
		<record>
			<cmpy_cd/>
			<bo_cd/>
			<bo_seq/>
			<yymm/>
			<val_qty_110/>
			<icdc_calc_qty_110/>
			<spsl_qty_110/>
			<cntr_qty_110/>
			<basi_uprc_110/>
			<rdff_rdu_uprc_110/>
			<cntr_uprc_110/>
			<dnt_qty_110/>
			<regu_subs_uprc_110/>
			<dnt_amt_110/>
			<stetsell_qty_110/>
			<stetsell_uprc_110/>
			<stetsell_amt_110/>
			<incmp_sale_qty_110/>
			<incmp_sale_amt_110/>
			<prvmm_val_qty_110/>
			<fpymt_encur_amt_110/>
			<smt_amt_110/>
			<sale_amt_110/>
			<dscn_amt_110/>
			<net_sale_amt_110/>
			<net_sale_amt_all/>
			<val_qty_130/>
			<icdc_calc_qty_130/>
			<spsl_qty_130/>
			<cntr_qty_130/>
			<basi_uprc_130/>
			<rdff_rdu_uprc_130/>
			<cntr_uprc_130/>
			<dnt_qty_130/>
			<regu_subs_uprc_130/>
			<dnt_amt_130/>
			<stetsell_qty_130/>
			<stetsell_uprc_130/>
			<stetsell_amt_130/>
			<incmp_sale_qty_130/>
			<incmp_sale_amt_130/>
			<prvmm_val_qty_130/>
			<fpymt_encur_amt_130/>
			<smt_amt_130/>
			<sale_amt_130/>
			<dscn_amt_130/>
			<net_sale_amt_130/>
		</record>
	</JIDAELIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<BOLIST>
		<record>
			<bo_cd/>
			<bo_seq/>
			<bo_head_nm/>
			<dept_nm/>
			<part_nm/>
			<area_nm/>
			<flnm/>
			<cntr_stat_nm/>
			<bo_cntr_dt/>
			<jd_sell_net_nm/>
		</record>
	</BOLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<RCPMLIST>
		<record>
			<fpymt_dt/>
			<ratio/>
			<cyov_bal/>
			<prvmm_net_sale_amt/>
			<smt_amt/>
			<rcpm_amt/>
			<rcpm_bal/>
			<label/>
			<bo_cyov/>
			<adjm_cyov/>
			<bal/>
			<net_sale_amt/>
			<smt_amt2/>
		</record>
	</RCPMLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<QTYLIST>
		<record>
			<qty_110_1/>
			<qty_110_2/>
			<qty_130_1/>
			<qty_130_2/>
			<qty_130_3/>
		</record>
	</QTYLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<bolist/>
		<jidaelist/>
		<rcpmlist/>
		<qtylist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Mon Apr 06 10:59:45 KST 2009 */ %>