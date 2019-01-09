<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=EUC-KR" %>
<%@ include file="/jsp/se/comm_jsp/se_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_se_boi_11030_s.jsp
* 기능       : 센터정보관리-센터대표정보(개인정보, 학력및경력, 가족관계, 담당소견)
* 작성일자   : 2016-12-02
* 작성자     : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SE_BOI_1030_SDataSet ds = ( SE_BOI_1030_SDataSet )request.getAttribute("ds");  // request dataset
%>
<boheadlist>
<%
	if( ds != null ){
		if( ds.getErrcode() == null || ds.getErrcode().equals( "" ) ){
%>
	<errinfo>
		<errcode></errcode> 																<!-- 에러코드 -->
		<errmsg></errmsg>																	<!-- 에러메시지 -->
	</errinfo>
	<boinfo>
		<bo_head_nm><![CDATA[<%= ds.bo_head_nm %>]]></bo_head_nm>         <!-- 지국장명        -->
		<bo_head_prn><%= ds.bo_head_prn %></bo_head_prn>                  <!-- 주민번호        -->
		<tel_no_0><%= ds.tel_no_0 %></tel_no_0>                           <!-- 전화1           -->
		<tel_no_1><%= ds.tel_no_1 %></tel_no_1>                           <!-- 전화2           -->
		<tel_no_2><%= ds.tel_no_2 %></tel_no_2>                           <!-- 전화3           -->
		<tel_no_3><%= ds.tel_no_3 %></tel_no_3>                           <!-- 전화4           -->
		<ptph_no_1><%= ds.ptph_no_1 %></ptph_no_1>                        <!-- 휴대폰1         -->
		<ptph_no_2><%= ds.ptph_no_2 %></ptph_no_2>                        <!-- 휴대폰2         -->
		<ptph_no_3><%= ds.ptph_no_3 %></ptph_no_3>                        <!-- 휴대폰3         -->
		<bo_head_bidt><%= ds.bo_head_bidt %></bo_head_bidt>               <!-- 지국장생일      -->
		<luso_clsf><%= ds.luso_clsf %></luso_clsf>                        <!-- 지국장생일구분  -->
		<wedd_anvy_dd><%= ds.wedd_anvy_dd %></wedd_anvy_dd>               <!-- 결혼기념일      -->
		<zip_1><%= ds.zip_1 %></zip_1>                                    <!-- 자택우편1       -->
		<zip_2><%= ds.zip_2 %></zip_2>                                    <!-- 자택우편2       -->
		<addr><%= ds.addr %></addr>                                       <!-- 자택주소        -->
		<dtls_addr><%= ds.dtls_addr %></dtls_addr>                        <!-- 자택상세주소    -->
		<nativ><%= ds.nativ %></nativ>                                    <!-- 출생지          -->
		<hby><%= ds.hby %></hby>                                          <!-- 취미            -->
		<relg><%= ds.relg %></relg>                                       <!-- 종교            -->
		<drink_qunt><%= ds.drink_qunt %></drink_qunt>                     <!-- 주량            -->
		<smok_yn><%= ds.smok_yn %></smok_yn>                              <!-- 흡연여부        -->
		<bo_head_phot><%= ds.bo_head_phot %></bo_head_phot>               <!-- 지국장사진      -->
		<phot_size><%= ds.phot_size %></phot_size>                        <!-- 사진사이즈      -->
		<dlco_no><%= ds.dlco_no %></dlco_no>                              <!-- 거래처번호      -->
		<ern><%= ds.ern %></ern>                                          <!-- 주민/사업자번호 -->
		<bank_nm><![CDATA[<%= ds.bank_nm %>]]></bank_nm>                  <!-- 은행명          -->
		<acct_no><%= ds.acct_no %></acct_no>                              <!-- 계좌번호        -->
		<rcpm_main_nm><![CDATA[<%= ds.rcpm_main_nm %>]]></rcpm_main_nm>   <!-- 입금주명 -->
	</boinfo>

<!-- 학력및이력리스트 시작 -->
<%
			if( ds.boheadhstycur.size() > 0 ){
				SE_BOI_1030_SBOHEADHSTYCURRecord rec = null;
				for( int i=0; i<ds.boheadhstycur.size(); i++ ){
					rec = ( SE_BOI_1030_SBOHEADHSTYCURRecord )ds.boheadhstycur.get( i );
%>
	<boheadhstycurinfo>
		<hsty_seq><%=rec.hsty_seq%></hsty_seq>												<!-- 이력순번 -->
		<yymm><%=rec.yymm%></yymm>															<!-- 년월 -->
		<hsty_matt><%=rec.hsty_matt%></hsty_matt>											<!-- 이력사항 -->
	</boheadhstycurinfo>
<%
				}
			}else{
%>
	<boheadhstycurinfo>
		<hsty_seq></hsty_seq>																<!-- 이력순번 -->
		<yymm></yymm>																		<!-- 년월 -->
		<hsty_matt></hsty_matt>																<!-- 이력사항 -->
	</boheadhstycurinfo>
<%
			}
%>
<!-- 학력및이력리스트 끝 -->
<!-- 가족관례리스트 시작 -->
<%
			if( ds.boheadfamcur.size() > 0 ){
				SE_BOI_1030_SBOHEADFAMCURRecord rec = null;
				for( int i=0; i<ds.boheadfamcur.size(); i++ ){
					rec = ( SE_BOI_1030_SBOHEADFAMCURRecord )ds.boheadfamcur.get( i );
%>
	<boheadfamcurinfo>
		<faml_seq><%=rec.faml_seq%></faml_seq>												<!-- 가족순번 -->
		<flnm><![CDATA[<%=rec.flnm%>]]></flnm>												<!-- 성명 -->
		<faml_rshp_cd><%=rec.faml_rshp_cd%></faml_rshp_cd>									<!-- 가족관계코드 -->
		<faml_rshp_nm><![CDATA[<%=rec.faml_rshp_nm%>]]></faml_rshp_nm>						<!-- 가족관계코드명 -->
		<bidt><%=rec.bidt%></bidt>															<!-- 생년월일 -->
		<luso_clsf><%=rec.luso_clsf%></luso_clsf>											<!-- 음양구분 -->
	</boheadfamcurinfo>
<%
				}
			}else{
%>
	<boheadfamcurinfo>
		<faml_seq></faml_seq>																<!-- 가족순번 -->
		<flnm></flnm>																		<!-- 성명 -->
		<faml_rshp_cd></faml_rshp_cd>														<!-- 가족관계코드 -->
		<faml_rshp_nm></faml_rshp_nm>														<!-- 가족관계코드명 -->
		<bidt></bidt>																		<!-- 생년월일 -->
		<luso_clsf></luso_clsf>																<!-- 음양구분 -->
	</boheadfamcurinfo>
<%
			}
%>
<!-- 가족관례리스트 끝 -->
<!-- 지국장소견리스트 시작 -->
<%
			if( ds.boheadideacur.size() > 0 ){
				SE_BOI_1030_SBOHEADIDEACURRecord rec = null;
				for( int i=0; i<ds.boheadideacur.size(); i++ ){
					rec = ( SE_BOI_1030_SBOHEADIDEACURRecord )ds.boheadideacur.get( i );
%>
	<boheadideacurinfo>
		<idea_seq><%=rec.idea_seq%></idea_seq>												<!-- 소견순번 -->
		<make_dt><%=rec.make_dt%></make_dt>													<!-- 작성일자 -->
		<make_pers_nm><![CDATA[<%=rec.make_pers_nm%>]]></make_pers_nm>						<!-- 작성자명 -->
		<idea><%=rec.idea%></idea>															<!-- 소견 -->
	</boheadideacurinfo>
<%
				}
			}else{
%>
	<boheadideacurinfo>
		<idea_seq></idea_seq>																<!-- 소견순번 -->
		<make_dt></make_dt>																	<!-- 작성일자 -->
		<make_pers_nm></make_pers_nm>														<!-- 작성자명 -->
		<idea></idea>																		<!-- 소견 -->
	</boheadideacurinfo>
<%
			}
%>
<!-- 지국장소견리스트 끝 -->
<%
		}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode> 		<!-- 에러코드 -->
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>			<!-- 에러메시지 -->
	</errinfo>
	<boinfo>
		<bo_head_nm></bo_head_nm>      <!-- 지국장명        -->
		<bo_head_prn></bo_head_prn>    <!-- 주민번호        -->
		<tel_no_0></tel_no_0>          <!-- 전화1           -->
		<tel_no_1></tel_no_1>          <!-- 전화2           -->
		<tel_no_2></tel_no_2>          <!-- 전화3           -->
		<tel_no_3></tel_no_3>          <!-- 전화4           -->
		<ptph_no_1></ptph_no_1>        <!-- 휴대폰1         -->
		<ptph_no_2></ptph_no_2>        <!-- 휴대폰2         -->
		<ptph_no_3></ptph_no_3>        <!-- 휴대폰3         -->
		<bo_head_bidt></bo_head_bidt>  <!-- 지국장생일      -->
		<luso_clsf></luso_clsf>        <!-- 지국장생일구분  -->
		<wedd_anvy_dd></wedd_anvy_dd>  <!-- 결혼기념일      -->
		<zip_1><                       <!-- 자택우편1       -->
		<zip_2></zip_2>                <!-- 자택우편2       -->
		<addr></addr>                  <!-- 자택주소        -->
		<dtls_addr></dtls_addr>        <!-- 자택상세주소    -->
		<nativ></nativ>                <!-- 출생지          -->
		<hby></hby>                    <!-- 취미            -->
		<relg></relg>                  <!-- 종교            -->
		<drink_qunt></drink_qunt>      <!-- 주량            -->
		<smok_yn></smok_yn>            <!-- 흡연여부        -->
		<bo_head_phot></bo_head_phot>  <!-- 지국장사진      -->
		<phot_size></phot_size>        <!-- 사진사이즈      -->
		<dlco_no></dlco_no>            <!-- 거래처번호      -->
		<ern></ern>                    <!-- 주민/사업자번호 -->
		<bank_nm></bank_nm>            <!-- 은행명          -->
		<acct_no></acct_no>            <!-- 계좌번호        -->
		<rcpm_main_nm></rcpm_main_nm>  <!--                 -->
	</boinfo>
	<boheadhstycurinfo>
		<hsty_seq></hsty_seq>							<!-- 이력순번 -->
		<yymm></yymm>									<!-- 년월 -->
		<hsty_matt></hsty_matt>							<!-- 이력사항 -->
	</boheadhstycurinfo>
	<boheadfamcurinfo>
		<faml_seq></faml_seq>							<!-- 가족순번 -->
		<flnm></flnm>									<!-- 성명 -->
		<faml_rshp_cd></faml_rshp_cd>					<!-- 가족관계코드 -->
		<faml_rshp_nm></faml_rshp_nm>					<!-- 가족관계코드명 -->
		<bidt></bidt>									<!-- 생년월일 -->
		<luso_clsf></luso_clsf>							<!-- 음양구분 -->
	</boheadfamcurinfo>
	<boheadideacurinfo>
		<idea_seq></idea_seq>							<!-- 소견순번 -->
		<make_dt></make_dt>								<!-- 작성일자 -->
		<make_pers_nm></make_pers_nm>					<!-- 작성자명 -->
		<idea></idea>									<!-- 소견 -->
	</boheadideacurinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>																	<!-- 에러코드 -->
		<errmsg><![CDATA[시스템에 문제가 발생하였습니다. 관리자에게 문의하시기 바랍니다.]]></errmsg>		<!-- 에러메시지 -->
	</errinfo>
	<boinfo>
		<bo_head_nm></bo_head_nm>      <!-- 지국장명        -->
		<bo_head_prn></bo_head_prn>    <!-- 주민번호        -->
		<tel_no_0></tel_no_0>          <!-- 전화1           -->
		<tel_no_1></tel_no_1>          <!-- 전화2           -->
		<tel_no_2></tel_no_2>          <!-- 전화3           -->
		<tel_no_3></tel_no_3>          <!-- 전화4           -->
		<ptph_no_1></ptph_no_1>        <!-- 휴대폰1         -->
		<ptph_no_2></ptph_no_2>        <!-- 휴대폰2         -->
		<ptph_no_3></ptph_no_3>        <!-- 휴대폰3         -->
		<bo_head_bidt></bo_head_bidt>  <!-- 지국장생일      -->
		<luso_clsf></luso_clsf>        <!-- 지국장생일구분  -->
		<wedd_anvy_dd></wedd_anvy_dd>  <!-- 결혼기념일      -->
		<zip_1><                       <!-- 자택우편1       -->
		<zip_2></zip_2>                <!-- 자택우편2       -->
		<addr></addr>                  <!-- 자택주소        -->
		<dtls_addr></dtls_addr>        <!-- 자택상세주소    -->
		<nativ></nativ>                <!-- 출생지          -->
		<hby></hby>                    <!-- 취미            -->
		<relg></relg>                  <!-- 종교            -->
		<drink_qunt></drink_qunt>      <!-- 주량            -->
		<smok_yn></smok_yn>            <!-- 흡연여부        -->
		<bo_head_phot></bo_head_phot>  <!-- 지국장사진      -->
		<phot_size></phot_size>        <!-- 사진사이즈      -->
		<dlco_no></dlco_no>            <!-- 거래처번호      -->
		<ern></ern>                    <!-- 주민/사업자번호 -->
		<bank_nm></bank_nm>            <!-- 은행명          -->
		<acct_no></acct_no>            <!-- 계좌번호        -->
		<rcpm_main_nm></rcpm_main_nm>  <!--                 -->
	</boinfo>
	<boheadhstycurinfo>
		<hsty_seq></hsty_seq>							<!-- 이력순번 -->
		<yymm></yymm>									<!-- 년월 -->
		<hsty_matt></hsty_matt>							<!-- 이력사항 -->
	</boheadhstycurinfo>
	<boheadfamcurinfo>
		<faml_seq></faml_seq>							<!-- 가족순번 -->
		<flnm></flnm>									<!-- 성명 -->
		<faml_rshp_cd></faml_rshp_cd>					<!-- 가족관계코드 -->
		<faml_rshp_nm></faml_rshp_nm>					<!-- 가족관계코드명 -->
		<bidt></bidt>									<!-- 생년월일 -->
		<luso_clsf></luso_clsf>							<!-- 음양구분 -->
	</boheadfamcurinfo>
	<boheadideacurinfo>
		<idea_seq></idea_seq>							<!-- 소견순번 -->
		<make_dt></make_dt>								<!-- 작성일자 -->
		<make_pers_nm></make_pers_nm>					<!-- 작성자명 -->
		<idea></idea>									<!-- 소견 -->
	</boheadideacurinfo>
<%
	}
%>
</boheadlist>