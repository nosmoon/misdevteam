<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.boi.rec.*
	,	chosun.ciis.se.boi.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_boi_1500_m.jsp
* 기능 : 지국주소관련발행 - 초기화면
* 작성일자 : 2009-03-27
* 작성자 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_BOI_1500_MDataSet ds = (SE_BOI_1500_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		int dept_cd = rx.add(comboSet, "dept_cd", "");		
		for(int i = 0; i < ds.team_cdcur.size(); i++) {
			SE_BOI_1500_MTEAM_CDCURRecord rec = (SE_BOI_1500_MTEAM_CDCURRecord)ds.team_cdcur.get(i);
			int item = rx.add(dept_cd, "item", "");
			rx.add(item, "value", rec.dept_cd);  		//부서코드
			rx.add(item, "label", rec.dept_cd+" "+rec.dept_nm);			//부서명
		}

		int area_cd = rx.add(comboSet, "area_cd", "");	
		for(int i = 0; i < ds.area_cdcur.size(); i++) {
			SE_BOI_1500_MAREA_CDCURRecord rec = (SE_BOI_1500_MAREA_CDCURRecord)ds.area_cdcur.get(i);
			int item = rx.add(area_cd, "item", "");
			rx.add(item, "value", rec.area_cd);  		//지역코드
			rx.add(item, "label", rec.area_nm);		//지역코드명
		}
		int adms_dstc_cd = rx.add(comboSet, "adms_dstc_cd", "");
		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			SE_BOI_1500_MCOMMCDCUR1Record rec = (SE_BOI_1500_MCOMMCDCUR1Record)ds.commcdcur1.get(i);
			int item  = rx.add( adms_dstc_cd , "item" , "");
			rx.add(item, "value", rec.cd );
			rx.add(item, "label", rec.cd+"  "+rec.cdnm);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<COMMCDCUR4>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</COMMCDCUR4>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<AREA_CDCUR>
		<record>
			<area_cd/>
			<area_nm/>
			<dept_cd/>
			<supr_dept_cd/>
		</record>
	</AREA_CDCUR>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<COMMCDCUR3>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</COMMCDCUR3>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<COMMCDCUR2>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</COMMCDCUR2>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<COMMCDCUR1>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</COMMCDCUR1>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<TEAM_CDCUR>
		<record>
			<dept_cd/>
			<dept_nm/>
		</record>
	</TEAM_CDCUR>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<PART_CDCUR>
		<record>
			<dept_cd/>
			<dept_nm/>
			<supr_dept_cd/>
		</record>
	</PART_CDCUR>
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

<% /* 작성시간 : Tue Feb 03 10:01:21 KST 2009 */ %>