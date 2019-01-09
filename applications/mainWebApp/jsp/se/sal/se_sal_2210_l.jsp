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
* 파일명 : se_sal_2210_l.jsp
* 기능 :   판매 - 지대관리 - 매출관리 - 매체별매출현황
* 작성일자 : 2009-04-07
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
	SE_SAL_2210_LDataSet ds = (SE_SAL_2210_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SAL_2210_LCURLISTRecord rec = (SE_SAL_2210_LCURLISTRecord)ds.curlist.get(i);
			int record 		= rx.add(recordSet, "record"			, "");
			rx.add(record, "dept_nm"			, rec.dept_nm			);
			rx.add(record, "sub_dept_cd"		, rec.sub_dept_cd		);
			rx.add(record, "sub_dept_nm"		, rec.sub_dept_nm		);
			rx.add(record, "area_cd"			, rec.area_cd			);
			rx.add(record, "area_nm"			, rec.area_nm			);
			rx.add(record, "bo_cd"				, rec.bo_cd				);
			rx.add(record, "bo_nm"				, rec.bo_nm				);
			rx.add(record, "bo_head_nm"			, rec.bo_head_nm		);
			rx.add(record, "val_qty_110"		, rec.val_qty_110		);
			rx.add(record, "sale_amt_110"		, rec.sale_amt_110		);
			rx.add(record, "net_sale_amt_110"	, rec.net_sale_amt_110	);
			rx.add(record, "val_qty_130"		, rec.val_qty_130		);
			rx.add(record, "sale_amt_130"		, rec.sale_amt_130		);
			rx.add(record, "net_sale_amt_130"	, rec.net_sale_amt_130	);
			rx.add(record, "sale_amt"			, rec.sale_amt			);
			rx.add(record, "net_sale_amt"		, rec.net_sale_amt		);
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
			<dept_nm/>
			<sub_dept_cd/>
			<sub_dept_nm/>
			<area_cd/>
			<area_nm/>
			<bo_cd/>
			<bo_nm/>
			<bo_head_nm/>
			<val_qty_110/>
			<sale_amt_110/>
			<net_sale_amt_110/>
			<val_qty_130/>
			<sale_amt_130/>
			<net_sale_amt_130/>
			<sale_amt/>
			<net_sale_amt/>
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

<% /* 작성시간 : Tue Apr 07 14:54:25 KST 2009 */ %>