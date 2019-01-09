<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.rcp.rec.*
	,	chosun.ciis.se.rcp.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_rcp_2810_l.jsp
* 기능 :   판매 - 입금관리 - 지대입금관리 - 보증인채무통보
* 작성일자 : 2009-04-27
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
	SE_RCP_2810_LDataSet ds = (SE_RCP_2810_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_2810_LCURLISTRecord rec = (SE_RCP_2810_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet			, "record"				, "");
			rx.add(record, "cmpy_cd"				, rec.cmpy_cd				);
			rx.add(record, "yymm"					, rec.yymm					);
			rx.add(record, "bo_cd"					, rec.bo_cd					);
			rx.add(record, "bo_seq"					, rec.bo_seq				);
			rx.add(record, "dept_cd"				, rec.dept_cd				);
			rx.add(record, "dept_nm"				, rec.dept_nm				);
			rx.add(record, "sub_dept_cd"			, rec.sub_dept_cd			);
			rx.add(record, "part_nm"				, rec.part_nm				);
			rx.add(record, "area_cd"				, rec.area_cd				);
			rx.add(record, "area_nm"				, rec.area_nm				);
			rx.add(record, "dlco_no"				, rec.dlco_no				);
			rx.add(record, "bo_nm"					, rec.bo_nm					);
			rx.addCData(record, "bo_head_nm"				, rec.bo_head_nm			);
			rx.add(record, "cyov_bal"				, rec.cyov_bal				);
			rx.add(record, "net_sale_amt"			, rec.net_sale_amt			);
			rx.add(record, "rcpm_amt"				, rec.rcpm_amt				);
			rx.add(record, "uprcp_amt"				, rec.uprcp_amt				);
			rx.add(record, "bal"					, rec.bal					);
			rx.add(record, "cntr_gurt_amt_stot"		, rec.cntr_gurt_amt_stot	);
			rx.add(record, "jont_debtgurt_limt_amt"	, rec.jont_debtgurt_limt_amt);
			rx.add(record, "sum_excs_uprcp_amt"		, rec.sum_excs_uprcp_amt	);
			rx.add(record, "excs_uprcp_amt"			, rec.excs_uprcp_amt		);
			rx.add(record, "gurt_pers_flnm"			, rec.gurt_pers_flnm		);
			rx.add(record, "zip"					, rec.zip					);
			rx.add(record, "addr"					, rec.addr					);
			rx.add(record, "dtls_addr"				, rec.dtls_addr				);
			rx.add(record, "tel"					, rec.tel					);
			rx.add(record, "rn"						, rec.rn					);
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
			<yymm/>
			<bo_cd/>
			<bo_seq/>
			<dept_cd/>
			<dept_nm/>
			<sub_dept_cd/>
			<part_nm/>
			<area_cd/>
			<area_nm/>
			<dlco_no/>
			<bo_nm/>
			<bo_head_nm/>
			<cyov_bal/>
			<net_sale_amt/>
			<rcpm_amt/>
			<uprcp_amt/>
			<bal/>
			<cntr_gurt_amt_stot/>
			<jont_debtgurt_limt_amt/>
			<sum_excs_uprcp_amt/>
			<excs_uprcp_amt/>
			<gurt_pers_flnm/>
			<zip/>
			<addr/>
			<dtls_addr/>
			<tel/>
			<rn/>
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

<% /* 작성시간 : Mon Apr 27 11:26:08 KST 2009 */ %>
