<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%------------------------------------------------------------------------------------------------
* 파일명 : mo_ss_share_11302_s.jsp /  agency/commun_11120_s.jsp동일
* 기능 : 공지사항 상세_모바일용
* 작성일자 : 2017-01-24
* 작성자 : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_MO_L_INFOEXG_SRCHDataSet ds = (SS_MO_L_INFOEXG_SRCHDataSet)request.getAttribute("ds");
%>
<notilist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>
	<totalcnt><%=ds.totalcnt%></totalcnt>
<%
	if( ds.infoexglist.size() > 0 ){
		SS_MO_L_INFOEXG_SRCHINFOEXGLISTRecord rec = null;
		for( int i=0; i < ds.infoexglist.size(); i++ ){
			rec = (SS_MO_L_INFOEXG_SRCHINFOEXGLISTRecord)ds.infoexglist.get( i );
%>
<notiinfo>
	<seq><%= rec.seq %></seq> <!-- 일련번호 -->
	<titl><![CDATA[<%= rec.titl %>]]></titl> <!-- 제목 -->
	<makepersnm><![CDATA[<%= rec.makepersnm %>]]></makepersnm> <!-- 작성자 -->
	<regdt><%= rec.regdt %></regdt><!-- 등록일자 -->
	<filenm><![CDATA[<%= rec.filenm %>]]></filenm> <!-- 파일명 -->
	<dwloadcnt><%= rec.dwloadcnt %></dwloadcnt><!-- 다운로드수 -->
	<brwscnt><%= rec.brwscnt %></brwscnt><!-- 검색수 -->
</notiinfo>
<%
			}
		}else{
%>
<notiinfo>
	<seq></seq>
	<titl></titl>
	<makepersnm></makepersnm>
	<regdt></regdt>
	<filenm></filenm>
	<dwloadcnt></dwloadcnt>
	<brwscnt></brwscnt>
</notiinfo>
<%
	}
%>
<%
	}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode>
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>
	</errinfo>
	<totalcnt></totalcnt>
<notiinfo>
	<seq></seq>
	<titl></titl>
	<makepersnm></makepersnm>
	<regdt></regdt>
	<filenm></filenm>
	<dwloadcnt></dwloadcnt>
	<brwscnt></brwscnt>
</notiinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
	<totalcnt></totalcnt>
<notiinfo>
	<seq></seq>
	<titl></titl>
	<makepersnm></makepersnm>
	<regdt></regdt>
	<filenm></filenm>
	<dwloadcnt></dwloadcnt>
	<brwscnt></brwscnt>
</notiinfo>
<%
	}
%>
</notilist>