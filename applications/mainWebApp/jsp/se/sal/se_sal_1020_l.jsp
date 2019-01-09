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
* 파일명 : se_sal_1020_l.jsp
* 기능 :  판매 - 지대관리 - 매출관리 - 월지역담당정보관리
* 작성일자 : 2009-04-09
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
	SE_SAL_1020_LDataSet ds = (SE_SAL_1020_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SAL_1020_LCURLISTRecord rec = (SE_SAL_1020_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "yymm"			, rec.yymm			);
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd	);
			rx.add(record, "supr_dept_nm"	, rec.supr_dept_nm	);
			rx.add(record, "dept_cd"		, rec.dept_cd		);
			rx.add(record, "dept_nm"		, rec.dept_nm		);
			rx.add(record, "sido_cd"		, rec.sido_cd		);
			rx.add(record, "sido_nm"		, rec.sido_nm		);
			rx.add(record, "area_cd"		, rec.area_cd		);
			rx.add(record, "area_nm"		, rec.area_nm		);
			rx.add(record, "chrg_pers"		, rec.chrg_pers		);
			rx.add(record, "flnm"			, rec.flnm			);
			rx.add(record, "gubun"			, rec.gubun			);
			rx.add(record, "crte_yn"		, rec.crte_yn		);
			rx.add(record, "hdpt_cd"		, rec.hdpt_cd		);
			rx.add(record, "step"			, rec.step			);
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
			<supr_dept_cd/>
			<supr_dept_nm/>
			<dept_cd/>
			<dept_nm/>
			<sido_cd/>
			<sido_nm/>
			<area_cd/>
			<area_nm/>
			<chrg_pers/>
			<flnm/>
			<gubun/>
			<crte_yn/>
			<hdpt_cd/>
			<step/>
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

<% /* 작성시간 : Thu Apr 09 11:38:05 KST 2009 */ %>