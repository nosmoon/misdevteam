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
* 파일명 : se_bns_1710_l.jsp
* 기능 :  판매-판촉물관리 - 판촉물배분현황조회
* 작성일자 : 2009-05-04
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
	SE_BNS_1710_LDataSet ds = (SE_BNS_1710_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BNS_1710_LCURLISTRecord rec = (SE_BNS_1710_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "bns_item_cd"	, rec.bns_item_cd	);
			rx.add(record, "bns_item_nm"	, rec.bns_item_nm	);
			rx.add(record, "bo_cd"			, rec.bo_cd			);
			rx.add(record, "dept_cd"		, rec.dept_cd		);
			rx.add(record, "dept_nm"		, rec.dept_nm		);
			rx.add(record, "part_cd"		, rec.part_cd		);
			rx.add(record, "part_nm"		, rec.part_nm		);
			rx.add(record, "area_cd"		, rec.area_cd		);
			rx.add(record, "area_nm"		, rec.area_nm		);
			rx.add(record, "bo_nm"			, rec.bo_nm			);
			rx.add(record, "in_tot_qunt"	, rec.in_tot_qunt	);
			rx.add(record, "divn_tot_qunt"	, rec.divn_tot_qunt	);
			rx.add(record, "uprc"			, rec.uprc			);
			rx.add(record, "divn_uprc"		, rec.divn_uprc		);
			rx.add(record, "divn_dt"		, rec.divn_dt		);
			rx.add(record, "qunt"			, rec.qunt			);
			rx.add(record, "un_divn_qunt"	, rec.un_divn_qunt	);
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
			<bns_item_cd/>
			<bns_item_nm/>
			<bo_cd/>
			<bo_seq/>
			<dept_cd/>
			<dept_nm/>
			<part_cd/>
			<part_nm/>
			<area_cd/>
			<area_nm/>
			<bo_nm/>
			<in_tot_qunt/>
			<divn_tot_qunt/>
			<uprc/>
			<divn_uprc/>
			<divn_dt/>
			<qunt/>
			<un_divn_qunt/>
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

<% /* 작성시간 : Mon May 04 14:08:41 KST 2009 */ %>