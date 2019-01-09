<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : mo_ss_reader_11120_s.jsp
* 기능 : 독자현황-독자정보-독자검색 목록_모바일용
* 작성일자 : 2016-07-11
* 작성자 : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	:
* 수정자	:
* 수정일자	:
* 백업파일명:
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_RDR_DSCTDataSet ds = (SS_S_RDR_DSCTDataSet)request.getAttribute("ds");
%>
<rdrdetail>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode><!--에러코드-->
		<errmsg></errmsg><!--에러메세지-->
	</errinfo>
	<rdrinfo>
		<regdt><%=ds.regdt%></regdt>                           <!--등록일자           -->
		<regno><%=ds.regno%></regno>                           <!--등록번호           -->
		<rdrnm><![CDATA[<%=ds.rdrnm%>]]></rdrnm>                           <!--독자명             -->
		<rdr_no><%=ds.rdr_no%></rdr_no>                        <!--독자번호           -->
		<medicd><%=ds.medicd%></medicd>                        <!--매체코드           -->
		<rdrtel_no1><%=ds.rdrtel_no1%></rdrtel_no1>            <!--독자전화번호1      -->
		<rdrtel_no2><%=ds.rdrtel_no2%></rdrtel_no2>            <!--독자전화번호2      -->
		<rdrtel_no3><%=ds.rdrtel_no3%></rdrtel_no3>            <!--독자전화번호3      -->
		<rdrptph_no1><%=ds.rdrptph_no1%></rdrptph_no1>         <!--독자휴대폰번호1    -->
		<rdrptph_no2><%=ds.rdrptph_no2%></rdrptph_no2>         <!--독자휴대폰번호2    -->
		<rdrptph_no3><%=ds.rdrptph_no3%></rdrptph_no3>         <!--독자휴대폰번호3    -->
		<email><%=ds.email%></email>                           <!--이메일             -->
		<bocd><%=ds.bocd%></bocd>                              <!--지국지사코드       -->
		<botel><%=ds.botel%></botel>                           <!--지국전화번호       -->
		<bonm><![CDATA[<%=ds.bonm%>]]></bonm>                              <!--지국명             -->
		<dlvzip><%=ds.dlvzip%></dlvzip>                        <!--배달지우편번호     -->
		<dlvaddr><![CDATA[<%=ds.dlvaddr%>]]></dlvaddr>                     <!--배달지주소         -->
		<dlvdtlsaddr><![CDATA[<%=ds.dlvdtlsaddr%>]]></dlvdtlsaddr>         <!--배달지상세주소     -->
		<acpndt><%=ds.acpndt%></acpndt>                        <!--접수일자           -->
		<dscttypecdnm><![CDATA[<%=ds.dscttypecdnm%>]]></dscttypecdnm>      <!--불편유형명         -->
		<dscttypecd><%=ds.dscttypecd%></dscttypecd>            <!--불편유형코드       -->
		<acpnpathcdnm><![CDATA[<%=ds.acpnpathcdnm%>]]></acpnpathcdnm>      <!--접수경로명         -->
		<titl><![CDATA[<%=ds.titl%>]]></titl>                              <!--제목               -->
		<cont><![CDATA[<%=ds.cont%>]]></cont>                              <!--내용               -->
		<bocnfmyn><%=ds.bocnfmyn%></bocnfmyn>                  <!--지국지사처리여부   -->
		<boprocdt><%=ds.boprocdt%></boprocdt>                  <!--지국지사처리일자   -->
		<boproccont><![CDATA[<%=ds.boproccont%>]]></boproccont>            <!--지국처리내용       -->
		<cns_empnm><![CDATA[<%=ds.cns_empnm%>]]></cns_empnm>               <!--상담원명           -->
		<cns_empcnfmyn><%=ds.cns_empcnfmyn%></cns_empcnfmyn>   <!--상담원확인여부     -->
		<cns_empcnfmdt><%=ds.cns_empcnfmdt%></cns_empcnfmdt>   <!--상담원확인일자     -->
		<cns_empremk><![CDATA[<%=ds.cns_empremk%>]]></cns_empremk>         <!--상담원비고         -->
		<bo_procreqitm><%=ds.bo_procreqitm%></bo_procreqitm>   <!-- 지국처리소요시간  -->
		<bo_cnfmtel><%=ds.bo_cnfmtel%></bo_cnfmtel>            <!-- 지국확인전화여부  -->
		<cns_procreqitm><%=ds.cns_procreqitm%></cns_procreqitm><!-- 상담원처리소요시간-->
		<cns_cnfmtel><%=ds.cns_cnfmtel%></cns_cnfmtel>         <!-- 상담원확인전화여부-->
		<bldmngnn><%=ds.bldmngnn%></bldmngnn>                  <!--건물관리번호       -->
	</rdrinfo>
<%
	}else{
%>


	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode><!--에러코드-->
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg><!--에러메세지-->
	</errinfo>
	<rdrinfo>
		<regdt></regdt>                  <!--등록일자           -->
   		<regno></regno>                  <!--등록번호           -->
   		<rdrnm></rdrnm>                  <!--독자명             -->
   		<rdr_no></rdr_no>                <!--독자번호           -->
   		<medicd></medicd>                <!--매체코드           -->
   		<rdrtel_no1></rdrtel_no1>        <!--독자전화번호1      -->
   		<rdrtel_no2></rdrtel_no2>        <!--독자전화번호2      -->
   		<rdrtel_no3></rdrtel_no3>        <!--독자전화번호3      -->
   		<rdrptph_no1></rdrptph_no1>      <!--독자휴대폰번호1    -->
   		<rdrptph_no2></rdrptph_no2>      <!--독자휴대폰번호2    -->
   		<rdrptph_no3></rdrptph_no3>      <!--독자휴대폰번호3    -->
   		<email></email>                  <!--이메일             -->
   		<bocd></bocd>                    <!--지국지사코드       -->
   		<botel></botel>                  <!--지국전화번호       -->
   		<bonm></bonm>                    <!--지국명             -->
   		<dlvzip></dlvzip>                <!--배달지우편번호     -->
   		<dlvaddr></dlvaddr>              <!--배달지주소         -->
   		<dlvdtlsaddr></dlvdtlsaddr>      <!--배달지상세주소     -->
   		<acpndt></acpndt>                <!--접수일자           -->
   		<dscttypecdnm></dscttypecdnm>    <!--불편유형명         -->
   		<dscttypecd></dscttypecd>        <!--불편유형코드       -->
   		<acpnpathcdnm></acpnpathcdnm>    <!--접수경로명         -->
   		<titl></titl>                    <!--제목               -->
   		<cont></cont>                    <!--내용               -->
   		<bocnfmyn></bocnfmyn>            <!--지국지사처리여부   -->
   		<boprocdt></boprocdt>            <!--지국지사처리일자   -->
   		<boproccont></boproccont>        <!--지국처리내용       -->
   		<cns_empnm></cns_empnm>          <!--상담원명           -->
   		<cns_empcnfmyn></cns_empcnfmyn>  <!--상담원확인여부     -->
   		<cns_empcnfmdt></cns_empcnfmdt>  <!--상담원확인일자     -->
   		<cns_empremk></cns_empremk>      <!--상담원비고         -->
   		<bo_procreqitm></bo_procreqitm>  <!-- 지국처리소요시간  -->
   		<bo_cnfmtel></bo_cnfmtel>        <!-- 지국확인전화여부  -->
   		<cns_procreqitm></cns_procreqitm><!-- 상담원처리소요시간-->
   		<cns_cnfmtel></cns_cnfmtel>      <!-- 상담원확인전화여부-->
   		<bldmngnn></bldmngnn>            <!-- 건물관리번호-->
	</rdrinfo>
<%
		}
	}else{
%>


	<errinfo>
		<errcode><![CDATA[-9999]]></errcode><!--에러코드-->
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg><!--에러메세지-->
	</errinfo>
	<rdrinfo>
		<regdt></regdt>                  <!--등록일자           -->
   		<regno></regno>                  <!--등록번호           -->
   		<rdrnm></rdrnm>                  <!--독자명             -->
   		<rdr_no></rdr_no>                <!--독자번호           -->
   		<medicd></medicd>                <!--매체코드           -->
   		<rdrtel_no1></rdrtel_no1>        <!--독자전화번호1      -->
   		<rdrtel_no2></rdrtel_no2>        <!--독자전화번호2      -->
   		<rdrtel_no3></rdrtel_no3>        <!--독자전화번호3      -->
   		<rdrptph_no1></rdrptph_no1>      <!--독자휴대폰번호1    -->
   		<rdrptph_no2></rdrptph_no2>      <!--독자휴대폰번호2    -->
   		<rdrptph_no3></rdrptph_no3>      <!--독자휴대폰번호3    -->
   		<email></email>                  <!--이메일             -->
   		<bocd></bocd>                    <!--지국지사코드       -->
   		<botel></botel>                  <!--지국전화번호       -->
   		<bonm></bonm>                    <!--지국명             -->
   		<dlvzip></dlvzip>                <!--배달지우편번호     -->
   		<dlvaddr></dlvaddr>              <!--배달지주소         -->
   		<dlvdtlsaddr></dlvdtlsaddr>      <!--배달지상세주소     -->
   		<acpndt></acpndt>                <!--접수일자           -->
   		<dscttypecdnm></dscttypecdnm>    <!--불편유형명         -->
   		<dscttypecd></dscttypecd>        <!--불편유형코드       -->
   		<acpnpathcdnm></acpnpathcdnm>    <!--접수경로명         -->
   		<titl></titl>                    <!--제목               -->
   		<cont></cont>                    <!--내용               -->
   		<bocnfmyn></bocnfmyn>            <!--지국지사처리여부   -->
   		<boprocdt></boprocdt>            <!--지국지사처리일자   -->
   		<boproccont></boproccont>        <!--지국처리내용       -->
   		<cns_empnm></cns_empnm>          <!--상담원명           -->
   		<cns_empcnfmyn></cns_empcnfmyn>  <!--상담원확인여부     -->
   		<cns_empcnfmdt></cns_empcnfmdt>  <!--상담원확인일자     -->
   		<cns_empremk></cns_empremk>      <!--상담원비고         -->
   		<bo_procreqitm></bo_procreqitm>  <!-- 지국처리소요시간  -->
   		<bo_cnfmtel></bo_cnfmtel>        <!-- 지국확인전화여부  -->
   		<cns_procreqitm></cns_procreqitm><!-- 상담원처리소요시간-->
   		<cns_cnfmtel></cns_cnfmtel>      <!-- 상담원확인전화여부-->
   		<bldmngnn></bldmngnn>            <!-- 건물관리번호-->
	</rdrinfo>
<%
	}
%>
</rdrdetail>