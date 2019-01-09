<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.bns.rec.*
	,	chosun.ciis.se.bns.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_bns_1010_l.jsp
* 기능 :  판매-판촉물관리 - 판촉물미수금현황
* 작성일자 : 2009-04-28
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
	SE_BNS_1010_LDataSet ds = (SE_BNS_1010_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BNS_1010_LCURLISTRecord rec = (SE_BNS_1010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet		, "record"			, "");
			rx.add(record, "dept_cd"			, rec.dept_cd			);
			rx.add(record, "dept_nm"			, rec.dept_nm			);
			rx.add(record, "part_cd"			, rec.part_cd			);
			rx.add(record, "part_nm"			, rec.part_nm			);
			rx.add(record, "area_cd"			, rec.area_cd			);
			rx.add(record, "area_nm"			, rec.area_nm			);
			rx.add(record, "bo_cd"				, rec.bo_cd				);
			rx.add(record, "bo_nm"				, rec.bo_nm				);
			rx.addCData(record, "bo_head_nm"			, rec.bo_head_nm		);
			
			rx.add(record, "bo_seq"				, rec.bo_seq			);
			rx.add(record, "bns_item_cd"		, rec.bns_item_cd		);
			rx.add(record, "bns_item_nm"		, rec.bns_item_nm		);
			
			rx.add(record, "basi_yymm"			, rec.basi_yymm			);
			
			rx.add(record, "compen_divn_amt"	, rec.compen_divn_amt	);	//당월배분금액
			rx.add(record, "qunt"				, rec.qunt				);	//당월수량
			rx.add(record, "rcpm_amt"			, rec.rcpm_amt			);	//당월입금액
			rx.add(record, "bal"				, rec.bal				);	//당월잔액(미수금)
			
			rx.add(record, "cyov_compen_divn_amt"	, rec.cyov_compen_divn_amt	);	//누적미수배분금액
			rx.add(record, "cyov_qunt"				, rec.cyov_qunt				);	//누적미수수량
			rx.add(record, "cyov_rcpm_amt"			, rec.cyov_rcpm_amt			);	//누적미수입금액
			rx.add(record, "cyov_bal"				, rec.cyov_bal				);	//누적미수
			rx.add(record, "tot_cyov_bal"			, (Long.parseLong(rec.bal) + Long.parseLong(rec.cyov_bal)) 	);	//미수전체합계
			rx.add(record, "rcpm_rate"			, rec.rcpm_rate  		);
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
			<dept_cd/>
			<dept_nm/>
			<part_cd/>
			<part_nm/>
			<area_cd/>
			<area_nm/>
			<bo_cd/>
			<bo_nm/>
			<bo_head_nm/>
			<compen_divn_amt/>
			<qunt/>
			<nocompen_divn_amt/>
			<rcpm_amt/>
			<bal/>
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

<% /* 작성시간 : Tue Apr 28 17:20:56 KST 2009 */ %>
