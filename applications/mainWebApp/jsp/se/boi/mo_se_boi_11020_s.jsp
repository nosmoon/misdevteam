<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=EUC-KR" %>
<%@ include file="/jsp/se/comm_jsp/se_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_se_boi_11020_l.jsp
* 기능       : 센터정보관리-센터기초정보, 상세정보 리턴
* 작성일자   : 2016-12-07
* 작성자     : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SE_MO_BOI_1020_SDataSet ds = ( SE_MO_BOI_1020_SDataSet )request.getAttribute("ds");  // request dataset
%>
<boinfolist>
<%
	if( ds != null ){
		if( ds.getErrcode() == null || ds.getErrcode().equals( "" ) ){
%>
	<errinfo>
		<errcode></errcode> <!-- 에러코드 -->
		<errmsg></errmsg>	<!-- 에러메시지 -->
	</errinfo>
	<boinfo>
		<jbjiorder><![CDATA[<%=ds.jbjiorder%>]]></jbjiorder> <!--노선구분-->
		<jbpansu><%=ds.jbpansu%></jbpansu><!--판수-->
		<jbbusu><%=ds.jbbusu%></jbbusu><!--발송부수-->
		<rdr_qty><%=ds.rdr_qty%></rdr_qty><!--독자부수-->
<%
		String orgn_clsfnm = "";

		SE_MO_BOI_1020_SCOMMCDCUR1Record rec1 = null;
			for(int i=0; i<ds.commcdcur1.size(); i++){
				rec1 = (SE_MO_BOI_1020_SCOMMCDCUR1Record)ds.commcdcur1.get(i);

				String cd = rec1.cd;
				String orgn_clsf  = ds.orgn_clsf;

				if(cd.equals(orgn_clsf)){
					orgn_clsfnm = rec1.cdnm;
				}
			}
%>
      <orgn_clsf><%=ds.orgn_clsf%></orgn_clsf>	<!-- 등록구분코드 -->
      <orgn_clsfnm><![CDATA[<%=orgn_clsfnm %>]]></orgn_clsfnm> <!-- 등록구분명 -->
      <bo_cd><%=ds.bo_cd%></bo_cd><!-- 센터코드 -->
      <bo_nm><![CDATA[<%=ds.bo_nm%>]]></bo_nm><!-- 센터명 -->
<%
		String area_nm = "";

		SE_MO_BOI_1020_SCOMMCDCUR2Record rec2 = null;
			for(int i=0; i<ds.commcdcur2.size(); i++){
				rec2 = (SE_MO_BOI_1020_SCOMMCDCUR2Record)ds.commcdcur2.get(i);

				String cd = rec2.cd;
				String area_cd  = ds.area_cd;

				if(cd.equals(area_cd)){
					area_nm = rec2.cdnm;
				}
			}
%>
      	<area_cd><%=ds.area_cd%></area_cd><!-- 지역코드 -->
      	<area_nm><![CDATA[<%=area_nm %>]]></area_nm><!-- 지역코드명 -->
      	<bo_cntr_dt><%=ds.bo_cntr_dt%></bo_cntr_dt><!-- 계약일자 -->
      	<bo_head_nm><![CDATA[<%=ds.bo_head_nm%>]]></bo_head_nm> <!-- 센터대표명 -->
      	<bo_head_prn><![CDATA[<%=ds.bo_head_prn%>]]></bo_head_prn> <!-- 센터대표주민번호 -->
      	<email><%=ds.email %></email><!-- 이메일 -->
		<tel_no_1_1><%=ds.tel_no_1_1%></tel_no_1_1>                                     <!-- 전화1-1                    -->
		<tel_no_1_2><%=ds.tel_no_1_2%></tel_no_1_2>                                     <!-- 전화1-2                    -->
		<tel_no_1_3><%=ds.tel_no_1_3%></tel_no_1_3>                                     <!-- 전화1-3                    -->
		<tel_no_2_1><%=ds.tel_no_2_1%></tel_no_2_1>                                     <!-- 전화2-1                    -->
		<tel_no_2_2><%=ds.tel_no_2_2%></tel_no_2_2>                                     <!-- 전화2-2                    -->
		<tel_no_2_3><%=ds.tel_no_2_3%></tel_no_2_3>                                     <!-- 전화2-3                    -->
		<bo_zip_1><%=ds.bo_zip_1%></bo_zip_1>                                           <!-- 지국우편1                  -->
		<bo_zip_2><%=ds.bo_zip_2%></bo_zip_2>                                           <!-- 지국우편2                  -->
		<bo_addr><![CDATA[<%=ds.bo_addr%>]]></bo_addr>                                  <!-- 지국주소                   -->
		<bo_dtls_addr><![CDATA[<%=ds.bo_dtls_addr%>]]></bo_dtls_addr>                   <!-- 지국상세주소               -->
<%
		String jd_sell_net_clsf_nm = "";

			SE_MO_BOI_1020_SCOMMCDCUR7Record rec7 = null;
			for(int i=0; i<ds.commcdcur7.size(); i++){
				rec7 = (SE_MO_BOI_1020_SCOMMCDCUR7Record)ds.commcdcur7.get(i);

				String cd = rec7.cd;
				String jd_sell_net_clsf  = ds.jd_sell_net_clsf;

				if(cd.equals(jd_sell_net_clsf)){
					jd_sell_net_clsf_nm = rec7.cdnm;
				}
			}
%>
		<jd_sell_net_clsf><%=ds.jd_sell_net_clsf%></jd_sell_net_clsf>                   <!-- 센터판매망구분코드   -->
		<jd_sell_net_clsf_nm><%=jd_sell_net_clsf_nm %></jd_sell_net_clsf_nm>                   <!-- 센터판매망구분명   -->
		<sido_gugun_cd><%=ds.sido_gugun_cd%></sido_gugun_cd>                            <!-- 시군구코드                 -->
		<sido_gugun_nm><![CDATA[<%=ds.sido_gugun_nm%>]]></sido_gugun_nm>                <!-- 시군구코드명               -->
<%
		String adms_dstc_nm = "";

			SE_MO_BOI_1020_SCOMMCDCUR9Record rec9 = null;
			for(int i=0; i<ds.commcdcur9.size(); i++){
				rec9 = (SE_MO_BOI_1020_SCOMMCDCUR9Record)ds.commcdcur9.get(i);

				String cd = rec9.cd;
				String adms_dstc_cd  = ds.adms_dstc_cd;

				if(cd.equals(adms_dstc_cd)){
					adms_dstc_nm = rec9.cdnm;
				}
			}
%>
		<adms_dstc_cd><%=ds.adms_dstc_cd%></adms_dstc_cd>                               <!-- 행정구역코드-->
		<adms_dstc_nm><![CDATA[<%=adms_dstc_nm%>]]></adms_dstc_nm>                               <!-- 행정구역명-->
<%
		String adms_unit_clsf_nm = "";

			SE_MO_BOI_1020_SCOMMCDCUR10Record rec10 = null;
			for(int i=0; i<ds.commcdcur10.size(); i++){
				rec10 = (SE_MO_BOI_1020_SCOMMCDCUR10Record)ds.commcdcur10.get(i);

				String cd = rec10.cd;
				String adms_unit_clsf  = ds.adms_unit_clsf;

				if(cd.equals(adms_unit_clsf)){
					adms_unit_clsf_nm = rec10.cdnm;
				}
			}
%>
		<adms_unit_clsf><%=ds.adms_unit_clsf%></adms_unit_clsf>                         <!-- 행정단위코드-->
		<adms_unit_clsf_nm><%=adms_unit_clsf_nm %></adms_unit_clsf_nm>                         <!-- 행정단위명-->
		<acct_no><%=ds.acct_no %></acct_no>				<!-- 가상계좌 -->
	</boinfo>
<%
		}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode> <!-- 에러코드 -->
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>	<!-- 에러메시지 -->
	</errinfo>
	<boinfo>
		<jbjiorder></jbjiorder> <!--노선구분-->
		<jbpansu></jbpansu><!--판수-->
		<jbbusu></jbbusu><!--발송부수-->
		<rdr_qty></rdr_qty><!--독자부수-->
		<orgn_clsf></orgn_clsf>	<!-- 등록구분코드 -->
		<orgn_clsfnm></orgn_clsfnm> <!-- 등록구분명 -->
		<bo_cd></bo_cd><!-- 센터코드 -->
		<bo_nm></bo_nm><!-- 센터명 -->
		<area_cd></area_cd><!-- 지역코드 -->
		<area_nm></area_nm><!-- 지역코드명 -->
		<bo_cntr_dt></bo_cntr_dt><!-- 계약일자 -->
		<bo_head_nm></bo_head_nm> <!-- 센터대표명 -->
   	<bo_head_prn></bo_head_prn> <!-- 센터대표주민번호 -->
		<email></email><!-- 이메일 -->
		<tel_no_1_1></tel_no_1_1>                                     <!-- 전화1-1                    -->
		<tel_no_1_2></tel_no_1_2>                                     <!-- 전화1-2                    -->
		<tel_no_1_3></tel_no_1_3>                                     <!-- 전화1-3                    -->
		<tel_no_2_1></tel_no_2_1>                                     <!-- 전화2-1                    -->
		<tel_no_2_2></tel_no_2_2>                                     <!-- 전화2-2                    -->
		<tel_no_2_3></tel_no_2_3>                                     <!-- 전화2-3                    -->
		<bo_zip_1></bo_zip_1>                                           <!-- 지국우편1                  -->
		<bo_zip_2></bo_zip_2>                                           <!-- 지국우편2                  -->
		<bo_addr></bo_addr>                                  <!-- 지국주소                   -->
		<bo_dtls_addr></bo_dtls_addr>                   <!-- 지국상세주소               -->
		<jd_sell_net_clsf></jd_sell_net_clsf>                   <!-- 센터판매망구분코드   -->
		<jd_sell_net_clsf_nm></jd_sell_net_clsf_nm>                   <!-- 센터판매망구분명   -->
		<sido_gugun_cd></sido_gugun_cd>                            <!-- 시군구코드                 -->
		<sido_gugun_nm></sido_gugun_nm>                <!-- 시군구코드명               -->
		<adms_dstc_cd></adms_dstc_cd>                               <!-- 행정구역코드-->
		<adms_dstc_nm></adms_dstc_nm>                               <!-- 행정구역명-->
		<adms_unit_clsf></adms_unit_clsf>                         <!-- 행정단위코드-->
		<adms_unit_clsf_nm></adms_unit_clsf_nm>                         <!-- 행정단위명-->
		<acct_no></acct_no>				<!-- 가상계좌 -->
	</boinfo>

<%
		}
	}else{
%>
	<errinfo>
		<errcode></errcode> <!-- 에러코드 -->
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>	<!-- 에러메시지 -->
	</errinfo>
	<boinfo>
		<jbjiorder></jbjiorder> <!--노선구분-->
		<jbpansu></jbpansu><!--판수-->
		<jbbusu></jbbusu><!--발송부수-->
		<rdr_qty></rdr_qty><!--독자부수-->
		<orgn_clsf></orgn_clsf>	<!-- 등록구분코드 -->
		<orgn_clsfnm></orgn_clsfnm> <!-- 등록구분명 -->
		<bo_cd></bo_cd><!-- 센터코드 -->
		<bo_nm></bo_nm><!-- 센터명 -->
		<area_cd></area_cd><!-- 지역코드 -->
		<area_nm></area_nm><!-- 지역코드명 -->
		<bo_cntr_dt></bo_cntr_dt><!-- 계약일자 -->
		<bo_head_nm></bo_head_nm> <!-- 센터대표명 -->
   	<bo_head_prn></bo_head_prn> <!-- 센터대표주민번호 -->
		<email></email><!-- 이메일 -->
		<tel_no_1_1></tel_no_1_1>                                     <!-- 전화1-1                    -->
		<tel_no_1_2></tel_no_1_2>                                     <!-- 전화1-2                    -->
		<tel_no_1_3></tel_no_1_3>                                     <!-- 전화1-3                    -->
		<tel_no_2_1></tel_no_2_1>                                     <!-- 전화2-1                    -->
		<tel_no_2_2></tel_no_2_2>                                     <!-- 전화2-2                    -->
		<tel_no_2_3></tel_no_2_3>                                     <!-- 전화2-3                    -->
		<bo_zip_1></bo_zip_1>                                           <!-- 지국우편1                  -->
		<bo_zip_2></bo_zip_2>                                           <!-- 지국우편2                  -->
		<bo_addr></bo_addr>                                  <!-- 지국주소                   -->
		<bo_dtls_addr></bo_dtls_addr>                   <!-- 지국상세주소               -->
		<jd_sell_net_clsf></jd_sell_net_clsf>                   <!-- 센터판매망구분코드   -->
		<jd_sell_net_clsf_nm></jd_sell_net_clsf_nm>                   <!-- 센터판매망구분명   -->
		<sido_gugun_cd></sido_gugun_cd>                            <!-- 시군구코드                 -->
		<sido_gugun_nm></sido_gugun_nm>                <!-- 시군구코드명               -->
		<adms_dstc_cd></adms_dstc_cd>                               <!-- 행정구역코드-->
		<adms_dstc_nm></adms_dstc_nm>                               <!-- 행정구역명-->
		<adms_unit_clsf></adms_unit_clsf>                         <!-- 행정단위코드-->
		<adms_unit_clsf_nm></adms_unit_clsf_nm>                         <!-- 행정단위명-->
		<acct_no></acct_no>				<!-- 가상계좌 -->
	</boinfo>
<%
	}
%>
</boinfolist>