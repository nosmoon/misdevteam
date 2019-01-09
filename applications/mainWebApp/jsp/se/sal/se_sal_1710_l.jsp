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
* 파일명 : se_sal_1710_l.jsp
* 기능 :  판매 - 지대관리 - 매출관리 - 계산서 발
* 작성일자 : 2009-04-17
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
	SE_SAL_1710_LDataSet ds = (SE_SAL_1710_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "infolist"	, "");
		for(int i = 0; i < ds.infolist.size(); i++) {
			SE_SAL_1710_LINFOLISTRecord rec = (SE_SAL_1710_LINFOLISTRecord)ds.infolist.get(i);
			int record = rx.add(recordSet	, "record"			, "");
			rx.add(record, "cd"				, rec.cd				);	
			rx.add(record, "cdnm"			, rec.cdnm				);
			rx.add(record, "min_clam_seq_1"	, rec.min_clam_seq_1	);
			rx.add(record, "max_clam_seq_1"	, rec.max_clam_seq_1	);
			rx.add(record, "cnt_1"			, rec.cnt_1				);
			rx.add(record, "min_clam_seq_2"	, rec.min_clam_seq_2	);
			rx.add(record, "min_clam_seq_2"	, rec.min_clam_seq_2	);
			rx.add(record, "cnt_2"			, rec.cnt_2				);
		}
		
		recordSet			= rx.add(formData	, "clamlist"	, "");
		for(int i = 0; i < ds.clamlist.size(); i++) {
			SE_SAL_1710_LCLAMLISTRecord rec = (SE_SAL_1710_LCLAMLISTRecord)ds.clamlist.get(i);
			int record = rx.add(recordSet		, "record"			, "");
			rx.add(record, "clam_seq"			, rec.clam_seq			);
			rx.add(record, "yymm"				, rec.yymm				);
			rx.add(record, "dept_cd"			, rec.dept_cd			);
			rx.add(record, "dept_nm"			, rec.dept_nm			);
			rx.add(record, "sub_dept_cd"		, rec.sub_dept_cd		);
			rx.add(record, "part_nm"			, rec.part_nm			);
			rx.add(record, "area_cd"			, rec.area_cd			);
			rx.add(record, "area_nm"			, rec.area_nm			);
			rx.add(record, "bo_cd"				, rec.bo_cd				);
			rx.add(record, "bo_seq"				, rec.bo_seq			);
			rx.add(record, "bo_nm"				, rec.bo_nm				);
			rx.add(record, "bo_head_nm"			, rec.bo_head_nm		);
			rx.add(record, "zip_1"				, rec.zip_1				);
			rx.add(record, "zip_2"				, rec.zip_2				);
			rx.add(record, "addr"				, rec.addr				);
			rx.add(record, "add_snd_clam_seq"	, rec.add_snd_clam_seq	);
			rx.add(record, "add_snd_bo_cd"		, rec.add_snd_bo_cd		);
			rx.add(record, "add_snd_bo_seq"		, rec.add_snd_bo_seq	);
			rx.add(record, "add_snd_area_cd"	, rec.add_snd_area_cd	);
			rx.add(record, "add_snd_area_nm"	, rec.add_snd_area_nm	);
			rx.add(record, "add_snd_bo_nm"		, rec.add_snd_bo_nm		);
			rx.add(record, "download"			, "!" + rec.download + "!");
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
	<INFOLIST>
		<record>
			<cd/>
			<cdnm/>
			<min_clam_seq_1/>
			<max_clam_seq_1/>
			<cnt_1/>
			<min_clam_seq_2/>
			<min_clam_seq_2/>
			<cnt_2/>
		</record>
	</INFOLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<CLAMLIST>
		<record>
			<clam_seq/>
			<yymm/>
			<dept_cd/>
			<dept_nm/>
			<sub_dept_cd/>
			<part_nm/>
			<area_cd/>
			<area_nm/>
			<bo_cd/>
			<bo_seq/>
			<bo_nm/>
			<bo_head_nm/>
			<zip_1/>
			<zip_2/>
			<addr/>
			<add_snd_clam_seq/>
			<add_snd_bo_cd/>
			<add_snd_bo_seq/>
			<add_snd_area_cd/>
			<add_snd_area_nm/>
			<add_snd_bo_nm/>
			<download/>
		</record>
	</CLAMLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<clamlist/>
		<infolist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Fri Apr 17 13:29:34 KST 2009 */ %>