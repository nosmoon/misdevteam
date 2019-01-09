<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@	page import="chosun.ciis.ss.sls.rdr.ds.*,chosun.ciis.ss.sls.rdr.rec.*,chosun.ciis.ss.sls.rdr.dm.*"%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : mo_ss_reader_11110_l.jsp
* 기능 :
* 작성일자 : 2016-12-22
* 작성자 : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	:
* 수정자	:
* 수정일자	:
* 백업파일명:
---------------------------------------------------------------------------------------------------%>
<%
	SS_MO_L_RDR_DSCTDataSet ds = (SS_MO_L_RDR_DSCTDataSet)request.getAttribute("ds");
%>
<curcommlist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode><!--에러코드 -->
		<errmsg></errmsg><!--에러메세지 -->
	</errinfo>

	<cntinfo>
		<totalcnt><%=ds.totalcnt%></totalcnt><!--총건수 -->
	</cntinfo>

<%
	if( ds.curcommlist.size() > 0 ){
		SS_MO_L_RDR_DSCTCURCOMMLISTRecord rec = null;
		for( int i=0; i < ds.curcommlist.size(); i++ ){
			rec = (SS_MO_L_RDR_DSCTCURCOMMLISTRecord)ds.curcommlist.get( i );
%>
	<dsctinfo>
		<regdt><%= rec.regdt %></regdt>                         <!--등록일자              -->
		<regno><%= rec.regno %></regno>                         <!--등록번호              -->
		<rdr_no><%= rec.rdr_no %></rdr_no>                      <!--독자번호              -->
		<rdrnm><![CDATA[<%= rec.rdrnm %>]]></rdrnm>                         <!--독자명                -->
		<acpndt><%= rec.acpndt %></acpndt>                      <!--접수일자              -->
		<bonm><![CDATA[<%= rec.bonm %>]]></bonm>                            <!--지국지사명            -->
		<dscttypecdnm><![CDATA[<%= rec.dscttypecdnm %>]]></dscttypecdnm>    <!--불편유형(약어)명      -->
		<acpnpathcdnm><![CDATA[<%= rec.acpnpathcdnm %>]]></acpnpathcdnm>    <!--신청경로명            -->
		<bocnfmyn><%= rec.bocnfmyn %></bocnfmyn>                <!--지국지사확인여부      -->
		<titl><![CDATA[<%= rec.titl %>]]></titl>                            <!--제목                  -->
	</dsctinfo>
<%
			}
		}else{
%>
	<dsctinfo>
 		<regdt></regdt>                     <!--등록일자              -->
 		<regno></regno>                     <!--등록번호              -->
 		<rdr_no></rdr_no>                   <!--독자번호              -->
 		<rdrnm></rdrnm>                     <!--독자명                -->
 		<acpndt></acpndt>                   <!--접수일자              -->
 		<bonm></bonm>                       <!--지국지사명            -->
 		<dscttypecdnm></dscttypecdnm>       <!--불편유형(약어)명      -->
 		<acpnpathcdnm></acpnpathcdnm>       <!--신청경로명            -->
 		<bocnfmyn></bocnfmyn>               <!--지국지사확인여부      -->
		<titl></titl>                       <!--제목                  -->
	</dsctinfo>
<%
	}
%>
<%
	}else{
%>


	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode><!--에러코드 -->
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg><!--에러메세지 -->
	</errinfo>
	<cntinfo>
		<totalcnt></totalcnt>				<!--리스트수 -->
	</cntinfo>
	<dsctinfo>
 		<regdt></regdt>                     <!--등록일자              -->
 		<regno></regno>                     <!--등록번호              -->
 		<rdr_no></rdr_no>                   <!--독자번호              -->
 		<rdrnm></rdrnm>                     <!--독자명                -->
 		<acpndt></acpndt>                   <!--접수일자              -->
 		<bonm></bonm>                       <!--지국지사명            -->
 		<dscttypecdnm></dscttypecdnm>       <!--불편유형(약어)명      -->
 		<acpnpathcdnm></acpnpathcdnm>       <!--신청경로명            -->
 		<bocnfmyn></bocnfmyn>               <!--지국지사확인여부      -->
		<titl></titl>                       <!--제목                  -->
	</dsctinfo>
<%
		}
	}else{
%>


	<errinfo>
		<errcode><![CDATA[-9999]]></errcode><!--에러코드 -->
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg><!--에러메세지 -->
	</errinfo>
	<cntinfo>
		<totalcnt></totalcnt>				<!--리스트수 -->
	</cntinfo>
	<dsctinfo>
 		<regdt></regdt>                     <!--등록일자              -->
 		<regno></regno>                     <!--등록번호              -->
 		<rdr_no></rdr_no>                   <!--독자번호              -->
 		<rdrnm></rdrnm>                     <!--독자명                -->
 		<acpndt></acpndt>                   <!--접수일자              -->
 		<bonm></bonm>                       <!--지국지사명            -->
 		<dscttypecdnm></dscttypecdnm>       <!--불편유형(약어)명      -->
 		<acpnpathcdnm></acpnpathcdnm>       <!--신청경로명            -->
 		<bocnfmyn></bocnfmyn>               <!--지국지사확인여부      -->
		<titl></titl>                       <!--제목                  -->
	</dsctinfo>
<%
	}
%>
</curcommlist>