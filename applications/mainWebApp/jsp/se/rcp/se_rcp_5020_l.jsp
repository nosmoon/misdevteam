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
* 파일명 : se_rcp_5020_l.jsp
* 기능 :  판매 - 입금관리 - 마감관리 - 일입금마감
* 작성일자 : 2009-05-20
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
	SE_RCP_5020_LDataSet ds = (SE_RCP_5020_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root	, "gridData2"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_5020_LCURLISTRecord rec = (SE_RCP_5020_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "dept_cd"		, rec.dept_cd		);
			rx.add(record, "dept_nm"		, rec.dept_nm		);
			rx.add(record, "part_cd"		, rec.part_cd		);
			rx.add(record, "part_nm"		, rec.part_nm		);
			rx.add(record, "area_cd"		, rec.area_cd		);
			rx.add(record, "area_nm"		, rec.area_nm		);
			rx.add(record, "bo_nm"			, rec.bo_nm			);
			rx.add(record, "part_clos_yn"	, rec.part_clos_yn	);
			rx.add(record, "aera_clos_yn"	, rec.aera_clos_yn	);
			rx.add(record, "amt_1"			, rec.amt_1			);
			rx.add(record, "amt_2"			, rec.amt_2			);
			rx.add(record, "amt_3"			, rec.amt_3			);
			rx.add(record, "amt_etc"		, rec.amt_etc		);
			rx.add(record, "amt"			, rec.amt			);
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
			<bo_nm/>
			<part_clos_yn/>
			<aera_clos_yn/>
			<amt_1/>
			<amt_2/>
			<amt_3/>
			<amt/>
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

<% /* 작성시간 : Wed May 20 17:02:22 KST 2009 */ %>