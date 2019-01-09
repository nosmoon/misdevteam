<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.qty.ds.*
	,	chosun.ciis.se.qty.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_qty_2200_m.jsp
* 기능 : 특판신청관리-초기화면
* 작성일자 : 2009-03-05
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
	SE_QTY_2200_MDataSet ds = (SE_QTY_2200_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	int recordSet = 0;
	int item = 0;
	comboSet = rx.add(root, "initcombo", "");

	try {
		//착지구분 
		int arvl_clsf = rx.add(comboSet, "arvl_clsf", "");
		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			SE_QTY_2200_MCOMMCDCUR1Record rec = (SE_QTY_2200_MCOMMCDCUR1Record)ds.commcdcur1.get(i);
			item  = rx.add( arvl_clsf , "item" , "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cdnm);
		}
		//판매구분
		int sell_clsf = rx.add(comboSet, "sell_clsf", "");
		for(int i = 0; i < ds.commcdcur2.size(); i++) {
			SE_QTY_2200_MCOMMCDCUR2Record rec = (SE_QTY_2200_MCOMMCDCUR2Record)ds.commcdcur2.get(i);
			item  = rx.add( sell_clsf , "item" , "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cdnm);
		}
		//확인상태
		int cnfm_stat_clsf = rx.add(comboSet, "cnfm_stat_clsf", "");
		for(int i = 0; i < ds.commcdcur3.size(); i++) {
			SE_QTY_2200_MCOMMCDCUR3Record rec = (SE_QTY_2200_MCOMMCDCUR3Record)ds.commcdcur3.get(i);
			item  = rx.add( cnfm_stat_clsf , "item" , "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cdnm);
		}
		//확인상태2
		int cnfm_stat_clsf2 = rx.add(comboSet, "cnfm_stat_clsf2", "");
		for(int i = 0; i < ds.commcdcur3.size(); i++) {
			SE_QTY_2200_MCOMMCDCUR3Record rec = (SE_QTY_2200_MCOMMCDCUR3Record)ds.commcdcur3.get(i);
			item  = rx.add( cnfm_stat_clsf2 , "item" , "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cdnm);
		}
		//전화DDD
		int tel_no_1 = rx.add(comboSet, "tel_no_1", "");
		for(int i = 0; i < ds.commcdcur4.size(); i++) {
			SE_QTY_2200_MCOMMCDCUR4Record rec = (SE_QTY_2200_MCOMMCDCUR4Record)ds.commcdcur4.get(i);
			item  = rx.add( tel_no_1 , "item" , "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cd);
		}
		//휴대폰통신사업자
		int ptph_no_1 = rx.add(comboSet, "ptph_no_1", "");
		for(int i = 0; i < ds.commcdcur5.size(); i++) {
			SE_QTY_2200_MCOMMCDCUR5Record rec = (SE_QTY_2200_MCOMMCDCUR5Record)ds.commcdcur5.get(i);
			item  = rx.add( ptph_no_1 , "item" , "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cd);
		}
		//매체코드
		int medi_cd = rx.add(comboSet, "medi_cd", "");
		for(int i = 0; i < ds.commcdcur6.size(); i++) {
			SE_QTY_2200_MCOMMCDCUR6Record rec = (SE_QTY_2200_MCOMMCDCUR6Record)ds.commcdcur6.get(i);
			item  = rx.add( medi_cd , "item" , "");
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
	<COMMCDCUR6>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</COMMCDCUR6>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<COMMCDCUR5>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</COMMCDCUR5>
</resData>
*/
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
	<resform>
		<commcdcur1/>
		<commcdcur2/>
		<commcdcur3/>
		<commcdcur4/>
		<commcdcur5/>
		<commcdcur6/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Thu Mar 05 15:29:19 KST 2009 */ %>