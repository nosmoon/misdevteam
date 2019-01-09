<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.snd.rec.*
	,	chosun.ciis.se.snd.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_snd_1520_l.jsp
* 기능 : 판매 - 발송관리 - 공장별부수 - 공장별 부수 조회
* 작성일자 : 2009.02.03
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
	SE_SND_1520_LDataSet ds = (SE_SND_1520_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData 			= 0;

	formData				= rx.add(root	, "rowInfo"		, "");
	try {
		rx.add(formData		, "rownum"		, ds.rownum	);
	
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
			<tran_uprc_cd/>
			<aply_dt/>
			<tran_uprc_clas_nm/>
			<route_clsf_nm/>
			<tran_uprc_route_nm/>
			<prt_plac_nm/>
			<load_wgt/>
			<route_lgth/>
			<send_plac_nm/>
			<qty/>
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
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Tue Feb 24 13:19:52 KST 2009 */ %>