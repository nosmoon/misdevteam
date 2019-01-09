<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=EUC-KR" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_se_boi_11010_l.jsp
* 기능       :
* 작성일자   :
* 작성자     : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_MO_L_RDR_SRCHDataSet ds = (SS_MO_L_RDR_SRCHDataSet)request.getAttribute("ds");
%>
<curcommlist>
<%
	if( ds != null ){
		if( ds.getErrcode() == null || ds.getErrcode().equals( "" ) ){
%>
	<errinfo>
		<errcode></errcode> 													<!-- 에러코드 -->
		<errmsg></errmsg>														<!-- 에러메시지 -->
	</errinfo>
<%
			if( ds.curcommlist.size() > 0 ){
				SS_MO_L_RDR_SRCHCURCOMMLISTRecord rec = null;
				for( int i=0; i<ds.curcommlist.size(); i++ ){
					rec = ( SS_MO_L_RDR_SRCHCURCOMMLISTRecord )ds.curcommlist.get( i );
%>
	<cur_info>
		<bocd><%= rec.bocd %></bocd>											<!-- 지국지사코드 -->
		<bonm><![CDATA[<%= rec.bonm %>]]></bonm>								<!-- 지국지사명 -->
		<tel_no11><%= rec.tel_no11 %></tel_no11>								<!-- 지국지사 전화번호1 -->
		<tel_no12><%= rec.tel_no12 %></tel_no12>								<!-- 지국지사 전화번호2 -->
		<tel_no13><%= rec.tel_no13 %></tel_no13>								<!-- 지국지사 전화번호3 -->
		<rdr_no><%= rec.rdr_no %></rdr_no>										<!-- 독자번호 -->
		<rdrnm><![CDATA[<%= rec.rdrnm %>]]></rdrnm>								<!-- 독자명 -->
		<rdrtel_no1><%= rec.rdrtel_no1 %></rdrtel_no1>							<!-- 독자전화번호1 -->
		<rdrtel_no2><%= rec.rdrtel_no2 %></rdrtel_no2>							<!-- 독자전화번호2 -->
		<rdrtel_no3><%= rec.rdrtel_no3 %></rdrtel_no3>							<!-- 독자전화번호3 -->
		<dlvaddr><![CDATA[<%= rec.dlvaddr %>]]></dlvaddr>						<!-- 독자주소 -->
		<dlvdtlsaddr><![CDATA[<%= rec.dlvdtlsaddr %>]]></dlvdtlsaddr>			<!-- 독자상세주소 -->
		<dlvqty><%= rec.dlvqty %></dlvqty>										<!-- 배달부수(dlvqty 값이 0이면 중지독자 0이상이면 구독독자) -->
		<onlmembid><%= rec.onlmembid %></onlmembid>								<!-- 회원아이디 -->
	</cur_info>
<%
				}
			}else{
%>
	<cur_info>
		<bocd></bocd>              												<!-- 지국지사코드 -->
		<bonm></bonm>              												<!-- 지국지사명 -->
		<tel_no11></tel_no11>      												<!-- 지국지사 전화번호1 -->
		<tel_no12></tel_no12>      												<!-- 지국지사 전화번호2 -->
		<tel_no13></tel_no13>      												<!-- 지국지사 전화번호3 -->
		<rdr_no></rdr_no>          												<!-- 독자번호 -->
		<rdrnm></rdrnm>            												<!-- 독자명 -->
		<rdrtel_no1></rdrtel_no1>  												<!-- 독자전화번호1 -->
		<rdrtel_no2></rdrtel_no2>  												<!-- 독자전화번호2 -->
		<rdrtel_no3></rdrtel_no3>  												<!-- 독자전화번호3 -->
		<dlvaddr></dlvaddr>        												<!-- 독자주소 -->
		<dlvdtlsaddr></dlvdtlsaddr>												<!-- 독자상세주소 -->
		<dlvqty></dlvqty>          												<!-- 배달부수(dlvqty 값이 0이면 중지독자 0이상이면 구독독자) -->
		<onlmembid></onlmembid>    												<!-- 회원아이디 -->
	</cur_info>
<%
			}
%>
	<cnt>
		<totalcnt><%=ds.totalcnt %></totalcnt>									<!-- 총건수 -->
	</cnt>
<%
		}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode> 					<!-- 에러코드 -->
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>						<!-- 에러메시지 -->
	</errinfo>
	<cur_info>
		<bocd></bocd>              												<!-- 지국지사코드 -->
		<bonm></bonm>              												<!-- 지국지사명 -->
		<tel_no11></tel_no11>      												<!-- 지국지사 전화번호1 -->
		<tel_no12></tel_no12>      												<!-- 지국지사 전화번호2 -->
		<tel_no13></tel_no13>      												<!-- 지국지사 전화번호3 -->
		<rdr_no></rdr_no>          												<!-- 독자번호 -->
		<rdrnm></rdrnm>            												<!-- 독자명 -->
		<rdrtel_no1></rdrtel_no1>  												<!-- 독자전화번호1 -->
		<rdrtel_no2></rdrtel_no2>  												<!-- 독자전화번호2 -->
		<rdrtel_no3></rdrtel_no3>  												<!-- 독자전화번호3 -->
		<dlvaddr></dlvaddr>        												<!-- 독자주소 -->
		<dlvdtlsaddr></dlvdtlsaddr>												<!-- 독자상세주소 -->
		<dlvqty></dlvqty>          												<!-- 배달부수(dlvqty 값이 0이면 중지독자 0이상이면 구독독자) -->
		<onlmembid></onlmembid>    												<!-- 회원아이디 -->
	</cur_info>
	<cnt>
		<totalcnt></totalcnt>													<!-- 총건수 -->
	</cnt>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>																	<!-- 에러코드 -->
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>		<!-- 에러메시지 -->
	</errinfo>
	<cur_info>
		<bocd></bocd>              												<!-- 지국지사코드 -->
		<bonm></bonm>              												<!-- 지국지사명 -->
		<tel_no11></tel_no11>      												<!-- 지국지사 전화번호1 -->
		<tel_no12></tel_no12>      												<!-- 지국지사 전화번호2 -->
		<tel_no13></tel_no13>      												<!-- 지국지사 전화번호3 -->
		<rdr_no></rdr_no>          												<!-- 독자번호 -->
		<rdrnm></rdrnm>            												<!-- 독자명 -->
		<rdrtel_no1></rdrtel_no1>  												<!-- 독자전화번호1 -->
		<rdrtel_no2></rdrtel_no2>  												<!-- 독자전화번호2 -->
		<rdrtel_no3></rdrtel_no3>  												<!-- 독자전화번호3 -->
		<dlvaddr></dlvaddr>        												<!-- 독자주소 -->
		<dlvdtlsaddr></dlvdtlsaddr>												<!-- 독자상세주소 -->
		<dlvqty></dlvqty>          												<!-- 배달부수(dlvqty 값이 0이면 중지독자 0이상이면 구독독자) -->
		<onlmembid></onlmembid>    												<!-- 회원아이디 -->
	</cur_info>
	<cnt>
		<totalcnt></totalcnt>													<!-- 총건수 -->
	</cnt>
<%
	}
%>
</curcommlist>