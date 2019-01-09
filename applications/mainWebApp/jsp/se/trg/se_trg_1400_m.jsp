<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.trg.ds.*
	,	chosun.ciis.se.trg.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_trg_1400_m.jsp
* 기능 : 지국평가 기준관리 - 초기화면
* 작성일자 : 2009-04-01
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
	SE_TRG_1400_MDataSet ds = (SE_TRG_1400_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int comboSet = 0;
	int recordSet = 0;
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");
	
	try {
		int teamlist = rx.add(comboSet, "teamlist", "");
		for(int i = 0; i < ds.team_cdcur.size(); i++) {
			SE_TRG_1400_MTEAM_CDCURRecord rec = (SE_TRG_1400_MTEAM_CDCURRecord)ds.team_cdcur.get(i);
			item  = rx.add( teamlist , "item" , "");
			rx.add(item, "dept_cd", rec.dept_cd);
			rx.add(item, "dept_nm", rec.dept_nm);
		}
		int evlu_grp = rx.add(comboSet, "evlu_grp", "");
		item  = rx.add( evlu_grp , "item" , "");
		rx.add(item, "value", "");
		rx.add(item, "label", "");
		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			SE_TRG_1400_MCOMMCDCUR1Record rec = (SE_TRG_1400_MCOMMCDCUR1Record)ds.commcdcur1.get(i);
			item  = rx.add( evlu_grp , "item" , "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cdnm);
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
		<colcnt/>
		<team_cdcur/>
		<part_cdcur/>
		<area_cdcur/>
		<commcdcur1/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Wed Apr 01 17:54:49 KST 2009 */ %>