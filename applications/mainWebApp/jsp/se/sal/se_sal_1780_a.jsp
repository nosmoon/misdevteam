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
* ���ϸ� : se_sal_1780_l.jsp
* ��� :   �Ǹ� - ������� - ������� - ��꼭 ����
* �ۼ����� : 2009-04-20
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_SAL_1780_ADataSet ds = (SE_SAL_1780_ADataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;

	//formData	= rx.add(root	    , "se_sal_1780_a"		, "");
	//formData	= rx.add(formData	, "dataSet"		        , "");
	formData	= rx.add(root   	, "dataSet"		        , "");
	
	try {
		if(ds != null){
			rx.add(formData		, "batch_id"	, ds.getBatch_id());
			rx.add(formData		, "smart_id"	, ds.getSmart_id());
			rx.add(formData		, "smart_pw"	, ds.getSmart_pw());
			}
	} catch (Exception e) { 
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
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
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<resform>
		<alllist/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Mon Apr 20 15:02:47 KST 2009 */ %>