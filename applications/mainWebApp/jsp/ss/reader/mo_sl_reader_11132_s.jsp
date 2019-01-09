<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_sl_reader_11132_s.jsp / 모바일용 독자정보리스트+매체리스트(ciis용은 초기커서리스트 제외함) agency는 11130_s.jsp임.
* 기능       : 독자정보관리(독자상세보기)_모바일용
* 작성일자   : 2016-05-13
* 작성자     : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    // DataSet 얻어내기
    SL_MO_S_RDR_INFODataSet ds = (SL_MO_S_RDR_INFODataSet)request.getAttribute("ds");
%>

<rdr_detail>
<%
	if( ds != null ){
		if( ds.getErrcode() == null || ds.getErrcode().equals( "" ) ){
%>
	<errinfo>
		<errcode></errcode> 																<!-- 에러코드 -->
		<errmsg></errmsg>																	<!-- 에러메시지 -->
	</errinfo>
<!-- 가상계좌번호정보 시작 -->
<%
			if( ds.vactcur.size() > 0 ){
				SL_MO_S_RDR_INFOVACTCURRecord rec = null;
				for( int i=0; i<ds.vactcur.size(); i++ ){
					rec = ( SL_MO_S_RDR_INFOVACTCURRecord )ds.vactcur.get( i );
%>
	<vactlist>
		<vactinfo>
			<bank_cd><![CDATA[<%=rec.bank_cd%>]]></bank_cd>
			<acct_no><%=rec.acct_no%></acct_no>
		</vactinfo>
	</vactlist>
<%
				}
			}else{
%>
	<vactlist>
		<vactinfo>
			<bank_cd></bank_cd>
			<acct_no></acct_no>
		</vactinfo>
	</vactlist>
<%
			}
%>
<!-- 가상계좌번호정보 끝 -->
<%
		if(ds.readercur.size() > 0){
			SL_MO_S_RDR_INFOREADERCURRecord readercurRec = null;
			for(int i=0; i<ds.readercur.size(); i++){
				readercurRec = (SL_MO_S_RDR_INFOREADERCURRecord)ds.readercur.get(i);
%>
<!-- 독자신상정보 시작-->
	<readercur>
		<rdr_no><%=readercurRec.rdr_no%></rdr_no>         													<!--1.독자번호-->
        <%
			        String dlvdstccd_cd = "";
			        String dlvdstccd_value = "";

					SL_MO_S_RDR_INFODLVDSTCCDCURRecord rec = null;
					for(int j=0; j<ds.dlvdstccdcur.size(); j++){
						rec = (SL_MO_S_RDR_INFODLVDSTCCDCURRecord)ds.dlvdstccdcur.get(j);

						if ( rec.dstccd.equals( readercurRec.dlvdstccd ) ){
							dlvdstccd_cd = rec.dstccd;
							dlvdstccd_value = rec.dstcnm;
						}
					}
            %>
		<dlvdstccd><%=dlvdstccd_cd%></dlvdstccd>       											<!--2.구역코드-->
		<dlvdstcnm><%=dlvdstccd_value%></dlvdstcnm>       									<!--2.구역코드명-->
		<dlvno><%=readercurRec.dlvno%></dlvno>           														<!--3.배달번호-->
		<dlvintvno><%=readercurRec.dlvintvno%></dlvintvno>       											<!--4.배달사이번호-->
		<dstcnm><%=readercurRec.dstcnm%></dstcnm>          											<!--5.구역명-->
		<dlvzip><%=readercurRec.dlvzip%></dlvzip>          													<!--6.우편번호-->
		<dlvaddr><![CDATA[<%=readercurRec.dlvaddr%>]]></dlvaddr>         						<!--7.주소-->
		<dlvdtlsaddr><![CDATA[<%=readercurRec.dlvdtlsaddr%>]]></dlvdtlsaddr>     			<!--8.상세주소-->
		<dlvbnji><%=readercurRec.dlvbnji%></dlvbnji>         													<!--9.번지-->

	<%

	String dlvcd = "";
	String dlvnm = "";

	SL_MO_S_RDR_INFOADDRCDCURRecord rec6 = null;
	for(int j=0; j<ds.addrcdcur.size(); j++){
		rec6 = (SL_MO_S_RDR_INFOADDRCDCURRecord)ds.addrcdcur.get(j);

		if(rec6.addrcd.equals(readercurRec.dlvcd)){
			dlvcd = rec6.addrcd;
			dlvnm = rec6.addrnm;
		}
	}
	%>
		<dlvcd><%=dlvcd %></dlvcd>									<!-- 10. 배달지코드(주소코드) -->
		<dlvnm><![CDATA[<%=dlvnm %>]]></dlvnm>         <!-- 10. 배달지코드명(주소명) -->
		<dlvdong><%=readercurRec.dlvdong%></dlvdong>         											<!--11.배달지동-->
		<dlvser_no><%=readercurRec.dlvser_no%></dlvser_no>       									<!--12.배달지호수-->
		<pyong><%=readercurRec.pyong%></pyong>           													<!--13. 평수-->
		<rdrnm><![CDATA[<%=readercurRec.rdrnm%>]]></rdrnm>           							<!--14.독자명-->
        <%
        String paty_clsfcd_cd = "";
        String paty_clsfcd_value = "";

        SL_MO_S_RDR_INFOPATY_CLSFCDCURRecord rec3 = null;
        for(int j=0; j<ds.paty_clsfcdcur.size(); j++){
			rec3 = (SL_MO_S_RDR_INFOPATY_CLSFCDCURRecord)ds.paty_clsfcdcur.get(j);

			if (rec3.cicodeval.equals(readercurRec.paty_clsfcd)){
				paty_clsfcd_cd = rec3.cicodeval;
				paty_clsfcd_value = rec3.cicdnm;
			}
		}
            %>
		<paty_clsfcd><%=paty_clsfcd_cd%></paty_clsfcd>     								    			<!--15.단체구분코드-->
		<paty_clsfnm><![CDATA[<%=paty_clsfcd_value%>]]></paty_clsfnm>     						<!--15.단체구분코드-->
		<rdrtel_no1><%=readercurRec.rdrtel_no1%></rdrtel_no1>      									<!--16.독자전화번호1-->
		<rdrtel_no2><%=readercurRec.rdrtel_no2%></rdrtel_no2>     									<!--17.독자전화번호2-->
		<rdrtel_no3><%=readercurRec.rdrtel_no3%></rdrtel_no3>      									<!--18.독자전화번호3-->
        <%
        String resitypecd_cd = "";
        String resitypecd_value = "";

        SL_MO_S_RDR_INFORESITYPECDCURRecord rec2 = null;
        for(int j=0; j<ds.resitypecdcur.size(); j++){
			rec2 = (SL_MO_S_RDR_INFORESITYPECDCURRecord)ds.resitypecdcur.get(j);

			if (rec2.cicodeval.equals(readercurRec.resitypecd)){
				resitypecd_cd = rec2.cicodeval;
				resitypecd_value = rec2.cicdnm;
			}
		}
            %>
		<resitypecd><%=resitypecd_cd %></resitypecd>								<!--19.주거형태코드-->
		<resitypenm><![CDATA[<%=resitypecd_value %>]]></resitypenm>								<!--19.주거형태코드명-->
         <%
        String resiclsfcd_cd = "";
        String resiclsfcd_value = "";

         SL_MO_S_RDR_INFORESICLSFCDCURRecord rec4 = null;
        for(int j=0; j<ds.resiclsfcdcur.size(); j++){
			rec4 = (SL_MO_S_RDR_INFORESICLSFCDCURRecord)ds.resiclsfcdcur.get(j);

			if (rec4.cicodeval.equals(readercurRec.resiclsfcd)){
		        resiclsfcd_cd = rec4.cicodeval;
				resiclsfcd_value = rec4.cicdnm;
			}
		}
            %>
		<resiclsfcd><%=resiclsfcd_cd %></resiclsfcd>								<!--20.주거구분코드-->
		<resiclsfnm><![CDATA[<%=resiclsfcd_value %>]]></resiclsfnm>								<!--20.주거구분코드명-->
		<rdrptph_no1><%=readercurRec.rdrptph_no1%></rdrptph_no1>    							<!--21.독자휴대폰번호1-->
		<rdrptph_no2><%=readercurRec.rdrptph_no2%></rdrptph_no2>     							<!--22.독자휴대폰번호2-->
		<rdrptph_no3><%=readercurRec.rdrptph_no3%></rdrptph_no3>     							<!--23.독자휴대폰번호3-->
         <%
        String dlvmthdcd_cd = "";
        String dlvmthdcd_value = "";

         SL_MO_S_RDR_INFODLVMTHDCDCURRecord rec5 = null;
        for(int j=0; j<ds.dlvmthdcdcur.size(); j++){
			rec5 = (SL_MO_S_RDR_INFODLVMTHDCDCURRecord)ds.dlvmthdcdcur.get(j);

			if (rec5.cicodeval.equals(readercurRec.dlvmthdcd)){
				dlvmthdcd_cd = rec5.cicodeval;
				dlvmthdcd_value = rec5.cicdnm;
			}
		}
            %>
		<dlvmthdcd><%=dlvmthdcd_cd %></dlvmthdcd>								<!--24.배달방법코드-->
		<dlvmthdnm><![CDATA[<%=dlvmthdcd_value %>]]></dlvmthdnm>						<!--24.배달방법코드명-->
        <%
        String thrw_plac_cd = "";
        String thrw_plac_value = "";

        SL_MO_S_RDR_INFOTHRWPLACCDCURRecord rec7 = null;
        for(int j=0; j<ds.thrwplaccdcur.size(); j++){
			rec7 = (SL_MO_S_RDR_INFOTHRWPLACCDCURRecord)ds.thrwplaccdcur.get(j);

			if (rec7.cicodeval.equals(readercurRec.thrw_plac)){
				thrw_plac_cd = rec7.cicodeval;
				thrw_plac_value = rec7.cicdnm;
			}
		}
            %>
		<thrw_plac><%=thrw_plac_cd%></thrw_plac>       								<!--25.투입장소코드-->
		<thrw_plnm><![CDATA[<%=thrw_plac_value%>]]></thrw_plnm>       						<!--25.투입장소명-->
		<bidt><%=readercurRec.bidt%></bidt>            															<!--26.생년월일자-->
		<lusoclsfcd><%=readercurRec.lusoclsfcd%></lusoclsfcd>      									<!--27.음양구분코드-->
		<weddanvydt><%=readercurRec.weddanvydt%></weddanvydt>      							<!--28.결혼기념일자-->
		<email><%=readercurRec.email%></email>           													<!--29.이메일-->
		<prn><%=readercurRec.prn%></prn>            																<!--30.주민등록번호-->
		<remk><![CDATA[<%=readercurRec.remk%>]]></remk>            								<!--31.비고 -->
		<etc_post><%=readercurRec.etc_post%></etc_post>        										<!--32.직배독자우송처리용-->
		<oldnewgb><%=readercurRec.oldnewgb%></oldnewgb>											<!--33.-->
		<bldmngnn><%=readercurRec.bldmngnn%></bldmngnn>       									<!--34.건물관리번호-->
		<new_dlvaddr><![CDATA[<%=readercurRec.new_dlvaddr%>]]></new_dlvaddr>    	<!--35. 도로명주소-->
		<new_jbdlvaddr_fst><![CDATA[<%=readercurRec.new_jbdlvaddr_fst%>]]></new_jbdlvaddr_fst> 	<!--36. 지번주소 앞-->
		<new_jbdlvaddr_lst><![CDATA[<%=readercurRec.new_jbdlvaddr_lst%>]]></new_jbdlvaddr_lst>  <!--37. 번지-->
		<temp_bldmngnn><%=readercurRec.temp_bldmngnn%></temp_bldmngnn>
		<temp_dlvzip><%=readercurRec.temp_dlvzip%></temp_dlvzip>
		<temp_dlvrdaddr><%=readercurRec.temp_dlvrdaddr%></temp_dlvrdaddr>
		<temp_dlvjbaddr><%=readercurRec.temp_dlvjbaddr%></temp_dlvjbaddr>
		<temp_dlvbnji><%=readercurRec.temp_dlvbnji%></temp_dlvbnji>
	</readercur>

<%
				}
			}else{
%>
	<readercur>
		<rdr_no></rdr_no>	<!--1.독자번호-->
		<dlvdstccd></dlvdstccd>	<!--2.구역코드-->
		<dlvdstcnm></dlvdstcnm> <!--2.구역코드명-->
		<dlvno></dlvno>   	<!--3.배달번호-->
		<dlvintvno></dlvintvno>	<!--4.배달사이번호-->
		<dstcnm></dstcnm>	<!--5.구역명-->
		<dlvzip></dlvzip>	<!--6.우편번호-->
		<dlvaddr></dlvaddr>	<!--7.주소-->
		<dlvdtlsaddr></dlvdtlsaddr>	<!--8.상세주소-->
		<dlvbnji></dlvbnji>		<!--9.번지-->
		<dlvcd></dlvcd>			<!-- 10. 배달지코드(주소코드) -->
		<dlvnm></dlvnm>         	<!-- 10. 배달지코드명(주소명) -->
		<dlvdong></dlvdong>		<!--11.배달지동-->
		<dlvser_no></dlvser_no>		<!--12.배달지호수-->
		<pyong></pyong>			<!--13. 평수-->
		<rdrnm></rdrnm>           	<!--14.독자명-->
		<paty_clsfcd></paty_clsfcd>     <!--15.단체구분코드-->
		<paty_clsfnm></paty_clsfnm>     <!--15.단체구분코드-->
		<rdrtel_no1></rdrtel_no1>      	<!--16.독자전화번호1-->
		<rdrtel_no2></rdrtel_no2>     	<!--17.독자전화번호2-->
		<rdrtel_no3></rdrtel_no3>      	<!--18.독자전화번호3-->
		<resitypecd></resitypecd>	<!--19.주거형태코드-->
		<resitypenm></resitypenm>	<!--19.주거형태코드명-->
		<resiclsfcd></resiclsfcd>	<!--20.주거구분코드-->
		<resiclsfnm></resiclsfnm>	<!--20.주거구분코드명-->
		<rdrptph_no1></rdrptph_no1>    	<!--21.독자휴대폰번호1-->
		<rdrptph_no2></rdrptph_no2>     <!--22.독자휴대폰번호2-->
		<rdrptph_no3></rdrptph_no3>     <!--23.독자휴대폰번호3-->
		<dlvmthdcd></dlvmthdcd>		<!--24.배달방법코드-->
		<dlvmthdnm></dlvmthdnm>		<!--24.배달방법코드명-->
		<thrw_plac></thrw_plac>       	<!--25.투입장소코드-->
		<thrw_plnm></thrw_plnm>       	<!--25.투입장소명-->
		<bidt></bidt>            	<!--26.생년월일자-->
		<lusoclsfcd></lusoclsfcd>       <!--27.음양구분코드-->
		<weddanvydt></weddanvydt>       <!--28.결혼기념일자-->
		<email></email>           	<!--29.이메일-->
		<prn></prn>            		<!--30.주민등록번호-->
		<remk></remk>            	<!--31.비고 -->
		<etc_post></etc_post>        	<!--32.직배독자우송처리용-->
		<oldnewgb></oldnewgb>		<!--33.-->
		<bldmngnn></bldmngnn>       	<!--34.건물관리번호-->
		<new_dlvaddr></new_dlvaddr>    	<!--35. 도로명주소-->
		<new_jbdlvaddr_fst></new_jbdlvaddr_fst>		<!--36. 지번주소 앞-->
		<new_jbdlvaddr_lst></new_jbdlvaddr_lst>		<!--37. 번지-->
		<temp_bldmngnn></temp_bldmngnn>
		<temp_dlvzip></temp_dlvzip>
		<temp_dlvrdaddr></temp_dlvrdaddr>
		<temp_dlvjbaddr></temp_dlvjbaddr>
		<temp_dlvbnji></temp_dlvbnji>
	</readercur>
<%
			}
%>
<!-- 독자신상정보 끝-->
<!-- 구독매체리스트 시작 -->
<%
			if( ds.medicur.size() > 0 ){
				SL_MO_S_RDR_INFOMEDICURRecord rec1 = null;
				for( int i=0; i<ds.medicur.size(); i++ ){
					rec1 = ( SL_MO_S_RDR_INFOMEDICURRecord )ds.medicur.get( i );
%>
	<mediinfo>
		<medicd><%= rec1.medicd %></medicd>
		<medinm><![CDATA[<%=rec1.medinm%>]]></medinm>
	</mediinfo>
<%
				}
			}else{
%>
	<mediinfo>
		<medicd></medicd>
		<medinm></medinm>
	</mediinfo>
<%
			}
%>
<!-- 구독매체리스트 끝 -->
<%
		}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode> 		<!-- 에러코드 -->
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>			<!-- 에러메시지 -->
	</errinfo>
	<dstcinfo>
		<dstccd></dstccd>		<!-- 구역코드 -->
		<dstcnm></dstcnm>	<!-- 구역코드명 -->
	</dstcinfo>
	<addrinfo>
		<addrcd></addrcd>	<!-- 주소코드 -->
		<addrnm></addrnm>	<!-- 주소코드명 -->
	</addrinfo>
	<paty_clsfinfo>
		<paty_clsfcd></paty_clsfcd> <!-- 단체구분코드 -->
		<paty_clsfnm></paty_clsfnm> <!-- 단체구분코드명 -->
	</paty_clsfinfo>
	<resitypeinfo>
		<resitypecd></resitypecd><!-- 주거형태코드 -->
		<resitypenm></resitypenm><!-- 주거형태코드명 -->
	</resitypeinfo>
	<resiclsfinfo>
		<resiclsfcd></resiclsfcd>	<!-- 주거구분코드 -->
		<resiclsfnm></resiclsfnm><!-- 주거구분코드명 -->
	</resiclsfinfo>
	<dlvmthdinfo>
		<dlvmthdcd></dlvmthdcd><!-- 배달방법코드 -->
		<dlvmthdnm></dlvmthdnm><!-- 배달방법코드명 -->
	</dlvmthdinfo>
	<thrwplacinfo>
		<thrwplaccd></thrwplaccd><!-- 투입장소코드 -->
		<thrwplacnm></thrwplacnm><!-- 투입장소코드명 -->
	</thrwplacinfo>
	<bomediinfo>
		<bomedicd></bomedicd>	<!-- 센터취급매체코드 -->
		<bomedinm></bomedinm> <!-- 센터취급매체코드명 -->
	</bomediinfo>
	<rdr_extntypeinfo>
		<rdr_extntypecd></rdr_extntypecd><!-- 확장유형코드 -->
		<rdr_extntypenm></rdr_extntypenm><!-- 확장유형코드명 -->
	</rdr_extntypeinfo>
	<clamtmthdinfo>
		<clamtmthdcd></clamtmthdcd><!-- 수금방법코드 -->
		<clamtmthdnm></clamtmthdnm><!-- 수금방법코드명 -->
	</clamtmthdinfo>
	<freeclsfinfo>
		<freeclsfcd></freeclsfcd><!-- 무료구분코드 -->
		<freeclsfnm></freeclsfnm><!-- 무료구분코드명 -->
	</freeclsfinfo>
	<suspresninfo>
		<suspresncd></suspresncd><!-- 중지사유코드 -->
		<suspresnnm></suspresnnm><!-- 중지사유명 -->
	</suspresninfo>
	<vactlist><!--가상계좌리스트-->
		<vactinfo>
			<bank_cd></bank_cd>
			<acct_no></acct_no>
		</vactinfo>
	</vactlist>
	<readercur>
		<rdr_no></rdr_no>	<!--1.독자번호-->
		<dlvdstccd></dlvdstccd>	<!--2.구역코드-->
		<dlvdstcnm></dlvdstcnm> <!--2.구역코드명-->
		<dlvno></dlvno>   	<!--3.배달번호-->
		<dlvintvno></dlvintvno>	<!--4.배달사이번호-->
		<dstcnm></dstcnm>	<!--5.구역명-->
		<dlvzip></dlvzip>	<!--6.우편번호-->
		<dlvaddr></dlvaddr>	<!--7.주소-->
		<dlvdtlsaddr></dlvdtlsaddr>	<!--8.상세주소-->
		<dlvbnji></dlvbnji>		<!--9.번지-->
		<dlvcd></dlvcd>			<!-- 10. 배달지코드(주소코드) -->
		<dlvnm></dlvnm>         	<!-- 10. 배달지코드명(주소명) -->
		<dlvdong></dlvdong>		<!--11.배달지동-->
		<dlvser_no></dlvser_no>		<!--12.배달지호수-->
		<pyong></pyong>			<!--13. 평수-->
		<rdrnm></rdrnm>           	<!--14.독자명-->
		<paty_clsfcd></paty_clsfcd>     <!--15.단체구분코드-->
		<paty_clsfnm></paty_clsfnm>     <!--15.단체구분코드-->
		<rdrtel_no1></rdrtel_no1>      	<!--16.독자전화번호1-->
		<rdrtel_no2></rdrtel_no2>     	<!--17.독자전화번호2-->
		<rdrtel_no3></rdrtel_no3>      	<!--18.독자전화번호3-->
		<resitypecd></resitypecd>	<!--19.주거형태코드-->
		<resitypenm></resitypenm>	<!--19.주거형태코드명-->
		<resiclsfcd></resiclsfcd>	<!--20.주거구분코드-->
		<resiclsfnm></resiclsfnm>	<!--20.주거구분코드명-->
		<rdrptph_no1></rdrptph_no1>    	<!--21.독자휴대폰번호1-->
		<rdrptph_no2></rdrptph_no2>     <!--22.독자휴대폰번호2-->
		<rdrptph_no3></rdrptph_no3>     <!--23.독자휴대폰번호3-->
		<dlvmthdcd></dlvmthdcd>		<!--24.배달방법코드-->
		<dlvmthdnm></dlvmthdnm>		<!--24.배달방법코드명-->
		<thrw_plac></thrw_plac>       	<!--25.투입장소코드-->
		<thrw_plnm></thrw_plnm>       	<!--25.투입장소명-->
		<bidt></bidt>            	<!--26.생년월일자-->
		<lusoclsfcd></lusoclsfcd>       <!--27.음양구분코드-->
		<weddanvydt></weddanvydt>       <!--28.결혼기념일자-->
		<email></email>           	<!--29.이메일-->
		<prn></prn>            		<!--30.주민등록번호-->
		<remk></remk>            	<!--31.비고 -->
		<etc_post></etc_post>        	<!--32.직배독자우송처리용-->
		<oldnewgb></oldnewgb>		<!--33.-->
		<bldmngnn></bldmngnn>       	<!--34.건물관리번호-->
		<new_dlvaddr></new_dlvaddr>    	<!--35. 도로명주소-->
		<new_jbdlvaddr_fst></new_jbdlvaddr_fst>		<!--36. 지번주소 앞-->
		<new_jbdlvaddr_lst></new_jbdlvaddr_lst>		<!--37. 번지-->
		<temp_bldmngnn></temp_bldmngnn>
		<temp_dlvzip></temp_dlvzip>
		<temp_dlvrdaddr></temp_dlvrdaddr>
		<temp_dlvjbaddr></temp_dlvjbaddr>
		<temp_dlvbnji></temp_dlvbnji>
	</readercur>
	<medilist>
		<mediinfo>
			<medicd></medicd>
			<medinm></medinm>
		</mediinfo>
	</medilist>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>																<!-- 에러코드 -->
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>		<!-- 에러메시지 -->
	</errinfo>
	<dstcinfo>
		<dstccd></dstccd>		<!-- 구역코드 -->
		<dstcnm></dstcnm>	<!-- 구역코드명 -->
	</dstcinfo>
	<addrinfo>
		<addrcd></addrcd>	<!-- 주소코드 -->
		<addrnm></addrnm>	<!-- 주소코드명 -->
	</addrinfo>
	<paty_clsfinfo>
		<paty_clsfcd></paty_clsfcd> <!-- 단체구분코드 -->
		<paty_clsfnm></paty_clsfnm> <!-- 단체구분코드명 -->
	</paty_clsfinfo>
	<resitypeinfo>
		<resitypecd></resitypecd><!-- 주거형태코드 -->
		<resitypenm></resitypenm><!-- 주거형태코드명 -->
	</resitypeinfo>
	<resiclsfinfo>
		<resiclsfcd></resiclsfcd>	<!-- 주거구분코드 -->
		<resiclsfnm></resiclsfnm><!-- 주거구분코드명 -->
	</resiclsfinfo>
	<dlvmthdinfo>
		<dlvmthdcd></dlvmthdcd><!-- 배달방법코드 -->
		<dlvmthdnm></dlvmthdnm><!-- 배달방법코드명 -->
	</dlvmthdinfo>
	<thrwplacinfo>
		<thrwplaccd></thrwplaccd><!-- 투입장소코드 -->
		<thrwplacnm></thrwplacnm><!-- 투입장소코드명 -->
	</thrwplacinfo>
	<bomediinfo>
		<bomedicd></bomedicd>	<!-- 센터취급매체코드 -->
		<bomedinm></bomedinm> <!-- 센터취급매체코드명 -->
	</bomediinfo>
	<rdr_extntypeinfo>
		<rdr_extntypecd></rdr_extntypecd><!-- 확장유형코드 -->
		<rdr_extntypenm></rdr_extntypenm><!-- 확장유형코드명 -->
	</rdr_extntypeinfo>
	<clamtmthdinfo>
		<clamtmthdcd></clamtmthdcd><!-- 수금방법코드 -->
		<clamtmthdnm></clamtmthdnm><!-- 수금방법코드명 -->
	</clamtmthdinfo>
	<freeclsfinfo>
		<freeclsfcd></freeclsfcd><!-- 무료구분코드 -->
		<freeclsfnm></freeclsfnm><!-- 무료구분코드명 -->
	</freeclsfinfo>
	<suspresninfo>
		<suspresncd></suspresncd><!-- 중지사유코드 -->
		<suspresnnm></suspresnnm><!-- 중지사유명 -->
	</suspresninfo>
	<vactlist><!--가상계좌리스트-->
		<vactinfo>
			<bank_cd></bank_cd>
			<acct_no></acct_no>
		</vactinfo>
	</vactlist>
	<readercur>
		<rdr_no></rdr_no>	<!--1.독자번호-->
		<dlvdstccd></dlvdstccd>	<!--2.구역코드-->
		<dlvdstcnm></dlvdstcnm> <!--2.구역코드명-->
		<dlvno></dlvno>   	<!--3.배달번호-->
		<dlvintvno></dlvintvno>	<!--4.배달사이번호-->
		<dstcnm></dstcnm>	<!--5.구역명-->
		<dlvzip></dlvzip>	<!--6.우편번호-->
		<dlvaddr></dlvaddr>	<!--7.주소-->
		<dlvdtlsaddr></dlvdtlsaddr>	<!--8.상세주소-->
		<dlvbnji></dlvbnji>		<!--9.번지-->
		<dlvcd></dlvcd>			<!-- 10. 배달지코드(주소코드) -->
		<dlvnm></dlvnm>         	<!-- 10. 배달지코드명(주소명) -->
		<dlvdong></dlvdong>		<!--11.배달지동-->
		<dlvser_no></dlvser_no>		<!--12.배달지호수-->
		<pyong></pyong>			<!--13. 평수-->
		<rdrnm></rdrnm>           	<!--14.독자명-->
		<paty_clsfcd></paty_clsfcd>     <!--15.단체구분코드-->
		<paty_clsfnm></paty_clsfnm>     <!--15.단체구분코드-->
		<rdrtel_no1></rdrtel_no1>      	<!--16.독자전화번호1-->
		<rdrtel_no2></rdrtel_no2>     	<!--17.독자전화번호2-->
		<rdrtel_no3></rdrtel_no3>      	<!--18.독자전화번호3-->
		<resitypecd></resitypecd>	<!--19.주거형태코드-->
		<resitypenm></resitypenm>	<!--19.주거형태코드명-->
		<resiclsfcd></resiclsfcd>	<!--20.주거구분코드-->
		<resiclsfnm></resiclsfnm>	<!--20.주거구분코드명-->
		<rdrptph_no1></rdrptph_no1>    	<!--21.독자휴대폰번호1-->
		<rdrptph_no2></rdrptph_no2>     <!--22.독자휴대폰번호2-->
		<rdrptph_no3></rdrptph_no3>     <!--23.독자휴대폰번호3-->
		<dlvmthdcd></dlvmthdcd>		<!--24.배달방법코드-->
		<dlvmthdnm></dlvmthdnm>		<!--24.배달방법코드명-->
		<thrw_plac></thrw_plac>       	<!--25.투입장소코드-->
		<thrw_plnm></thrw_plnm>       	<!--25.투입장소명-->
		<bidt></bidt>            	<!--26.생년월일자-->
		<lusoclsfcd></lusoclsfcd>       <!--27.음양구분코드-->
		<weddanvydt></weddanvydt>       <!--28.결혼기념일자-->
		<email></email>           	<!--29.이메일-->
		<prn></prn>            		<!--30.주민등록번호-->
		<remk></remk>            	<!--31.비고 -->
		<etc_post></etc_post>        	<!--32.직배독자우송처리용-->
		<oldnewgb></oldnewgb>		<!--33.-->
		<bldmngnn></bldmngnn>       	<!--34.건물관리번호-->
		<new_dlvaddr></new_dlvaddr>    	<!--35. 도로명주소-->
		<new_jbdlvaddr_fst></new_jbdlvaddr_fst>		<!--36. 지번주소 앞-->
		<new_jbdlvaddr_lst></new_jbdlvaddr_lst>		<!--37. 번지-->
		<temp_bldmngnn></temp_bldmngnn>
		<temp_dlvzip></temp_dlvzip>
		<temp_dlvrdaddr></temp_dlvrdaddr>
		<temp_dlvjbaddr></temp_dlvjbaddr>
		<temp_dlvbnji></temp_dlvbnji>
	</readercur>
	<medilist>
		<mediinfo>
			<medicd></medicd>
			<medinm></medinm>
		</mediinfo>
	</medilist>
<%
	}
%>
</rdr_detail>
