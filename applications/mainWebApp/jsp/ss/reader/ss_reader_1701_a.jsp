<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : sl_reader_1701_a
* 기능     :   독자현황 > 독자정보검색에서 초기화면 기능을 함
* 작성일자 : 2005.07.22
* 작성자   :   이혁
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1"
<!--list start-->
<!--<form name="rdrsrch_list_form" method="post" action="" >-->
<table width="830" border="0" cellspacing="0" cellpadding="2" align=center>
  <tr>
    <td width="575"><table width="575" border="0" cellspacing="0" cellpadding="0" id="reader_detail_id">
<!----------------------- 독자상세 정보 폼 시작 --------------------------->
      <tr>
        <td><table width="575"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#ffffff" >
          <tr>
            <td width="62" height="22" class="gray" bgcolor="#EBE9DC"> 독자번호</td>
            <td width="99" height="22" bgcolor="#EBE9DC" class="gray" ><input name="rdr_no" type="text" class="text_box" style="ime-mode:disabled;background-color:#EBE9DC" size="9" maxlength="9" tabIndex="1" readonly caption="독자번호" ></td>
            <td class="gray" bgcolor="#EBE9DC" colspan="5" height="22">
              <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td bgcolor="#EBE9DC" width="9%">구역<font color="#FF0000">*</font></td>
                  <td width="10%" bgcolor="#EBE9DC"><input type="text" name="dlvdstccd" class="text_box" size="3" maxlength="3" tabIndex="2" caption="구역" dataType="number" len=3 >
                    <select name="dlvdstccd_hidden" class="sel_all" id="dlvdstccd_hidden" style="display:none;width:45px" >
                    </select>
                  </td>
                  <td bgcolor="#EBE9DC" width="15%">배달번호<font color="#FF0000">*</font></td>
                  <td width="27%" bgcolor="#EBE9DC">
                    <input name="dlvno" type="text" class="text_box" id="dlvno" tabIndex="3" size="3" maxlength="3" style="ime-mode:disabled;" len="3" dataType="number" caption="배달번호" >
                    -
                    <input name="dlvintvno" class="text_box" id="dlvintvno" tabIndex="4" size="2" maxlength="2" style="ime-mode:disabled;" len="2" dataType="number" caption="사이번호" >
                  </td>
                  <td bgcolor="#EBE9DC" width="13%">구역명</td>
                  <td width="26%"><input name="dlvdstcnm" type="text" class="text_box" size="16" style="ime-mode:active;background-color:#EBE9DC"  readonly  caption="구역명">
                  </td>
                </tr>
            </table></td>
          </tr>
          <tr>
            <td width="62" class="gray" bgcolor="#EBE9DC">우편번호<font color="#FF0000">*</font></td>
            <td colspan="6"  class="gray">
              <input name="dlvzip" type="text" class="text_box" id="dlvzip" tabIndex="6" size="6" maxlength="7" style="ime-mode:active"  caption="우편번호" >
              <input name="image" type="image" src="/html/slcomm_img/bu_search03.gif" align="absmiddle" width="39" height="19" border="0" >
              <input name="dlvaddr" type="text" class="text_box" style="width:176px;ime-mode:active" id="dlvaddr" size="28"  caption="주소" readOnly>
              <input name="dlvdtlsaddr" type="text" class="text_box" id="dlvdtlsaddr" size="23" tabIndex="8" style="ime-mode:active" caption="상세주소">
              <input name="dlvbnji" type="text" class="text_box" id="dlvbnji" size="6" maxlength="7" tabIndex="9" style="ime-mode:disabled" caption="번지">번지</td>
          </tr>
          <tr>
            <td width="62" class="gray" bgcolor="#EBE9DC">주소코드</td>
            <td colspan="6" class="gray">
              <select name="dlvcd" class="sel_all" id="dlvcd" style="width:269px" tabIndex="10"  caption="주소코드" disabled>
                <option value=""></option>
              </select>
              <!--input name="addrnm" type="text" class="text_box" style="background-color:#EBE9DC;ime-mode:active" id="addrnm" size="35" maxlength="35" readonly caption="주소코드명"-->
              <input name="dlvdong" type="text" class="text_box" id="dlvdong" size="5" maxlength="6" tabIndex="11" caption="동" >동
              <input name="dlvser_no" type="text" class="text_box" id="dlvser_no" size="5" tabIndex="12" maxlength="6" style="ime-mode:disabled" caption="호" dataType="number" >호
              <input name="dlvpyong" type="text" class="text_box" id="dlvpyong" size="3" maxlength="3" tabIndex="13" style="ime-mode:disabled;text-align:right" caption="평형" dataType="number" >평 </td>
          </tr>
          <tr>
            <td width="62" height="18" class="gray" bgcolor="#EBE9DC">독자명<font color="#FF0000">*</font></td>
            <td colspan="2" class="gray">
              <input name="rdrnm" type="text" class="text_box" id="rdrnm" value="" size="15" maxlength="15" tabIndex="14" style="ime-mode:active" caption="독자명" >
            </td>
            <td width="61" class="gray" bgcolor="#EBE9DC">단체구분<font color="#FF0000">*</font></td>
            <td width="96" class="gray">&nbsp;</td>
            <td width="60" class="gray" bgcolor="#EBE9DC">전화번호<font color="#FF0000">*</font></td>
            <td class="gray"><input name="rdrtel_no1" type="text" class="text_box" size="4" maxlength="4" tabIndex="20" style="ime-mode:disabled" dataType="number" caption="지역번호" value="<%//=ds.bo_tel1%>">
              -
              <input name="rdrtel_no2" type="text" class="text_box" size="4" maxlength="4" tabIndex="21" style="ime-mode:disabled" dataType="number" caption="국번호">
              -
              <input name="rdrtel_no3" type="text" class="text_box" size="4" maxlength="4" tabIndex="22" style="ime-mode:disabled" dataType="number" caption="번호">
            </td>
          </tr>
          <tr>
            <td bgcolor="#EBE9DC" class="gray">주거형태<font color="#FF0000">*</font></td>
            <td colspan="2" class="gray">
              <select name="resitypecd" class="sel_all" style="width:100px" tabIndex="23" caption="주거형태" disabled>
                <option value=""></option>
              </select>
            </td>
            <td bgcolor="#EBE9DC" class="gray">주거구분</td>
            <td class="gray">
              <select name="resiclsfcd" class="sel_all" style="width:100px" tabIndex="24" caption="주거구분" disabled>
                <option value=""></option>
              </select>
            </td>
            <td width="60" class="gray" bgcolor="#EBE9DC">휴대폰</td>
            <td class="gray"><input name="rdrptph_no1" type="text" class="text_box" size="4" maxlength="4" tabIndex="25" style="ime-mode:disabled" dataType="number"  caption="휴대폰번호">
              -
              <input name="rdrptph_no2" type="text" class="text_box" size="4" maxlength="4" tabIndex="26" style="ime-mode:disabled" dataType="number"  caption="휴대폰번호">
              -
              <input name="rdrptph_no3" type="text" class="text_box" size="4" maxlength="4" tabIndex="27" style="ime-mode:disabled" dataType="number"  caption="휴대폰번호" >
            </td>
          </tr>
          <tr>
            <td bgcolor="#EBE9DC" class="gray">배달방법<font color="#FF0000">*</font></td>
            <!-- 확장비용 정산시 우송건은 포함되지 않으므로 필수여야 함 -->
            <td colspan="2" class="gray">&nbsp;</td>
            <td bgcolor="#EBE9DC" class="gray">투입장소</td>
            <td class="gray">
              <select name="thrw_plac" class="sel_all" style="width:100px" tabIndex="30" caption="투입장소" disabled>
                <option value=""></option>
              </select>
            </td>
            <td width="60" rowspan="3" class="gray" bgcolor="#EBE9DC">비고</td>
            <td rowspan="3" class="gray">
              <textarea name="remk" cols="20" rows="5" class="text_box" tabIndex="36" style="ime-mode:active" caption="비고"></textarea>
            </td>
          </tr>
          <tr>
            <td width="62" height="20" class="gray" bgcolor="#EBE9DC">생년월일</td>
            <td colspan="2" class="gray"><input name="bidt" class="text_box" size="9" maxlength="10" tabIndex="31" style="ime-mode:disabled" dataType="date" caption="생년월일">음<input type="checkbox" name="lusoclsfcd" value="M" tabIndex="32" caption="음력체크" disabled></td>
            <td width="61" class="gray" bgcolor="#EBE9DC">결혼기념</td>
            <td width="96" class="gray"><input name="weddanvydt" class="text_box" size="9" maxlength="10" tabIndex="33" style="ime-mode:disabled" caption="결혼기념일" dataType="date" ></td>
          </tr>
          <tr>
            <td width="62" height="20" class="gray" bgcolor="#EBE9DC">이메일</td>
            <td colspan="2" class="gray">
              <input name="email" type="text" size="15" class="text_box" tabIndex="34" style="ime-mode:inactive" dataType="email" caption="이메일">
            </td>
            <td width="61" class="gray" bgcolor="#EBE9DC">주민번호</td>
            <td width="96" class="gray"><input name="prn" type="text" class="text_box" size="13" maxlength="14" tabIndex="35" style="ime-mode:disabled" caption="주민등록번호" dataType="jumin" >
            </td>
          </tr>
        </table>
          <table width="575" border="0" cellspacing="0" cellpadding="0">
            <tr height="4" colspan="2">
              <td><!--여백--></td>
            </tr>
            <tr id="subs_display_control" style="visibility:hidden">
              <td width="350">
                <!--tab table start-->
                <table width="350" border="0" cellpadding="0" cellspacing="0" id="tab_row_0">
                  <tr>
                    <td width="60">
                      <table id="tab_0" border=0 cellpadding=0 cellspacing=0 width="100%" style="cursor:hand;" >
                        <tr>
                          <td width=5 height=3 background="/html/slcomm_img/tb1_01.gif"></td>
                          <td height=3  background="/html/slcomm_img/tb1_02.gif" ></td>
                          <td width=5 height=3 background="/html/slcomm_img/tb1_03.gif"></td>
                        </tr>
                        <tr>
                          <td background="/html/slcomm_img/tb1_04.gif" height="17" width="5"></td>
                          <td background="/html/slcomm_img/tb1_05.gif" height="17" align="center">MM-999</td>
                          <td background="/html/slcomm_img/tb1_06.gif" height="17" width="5"></td>
                        </tr>
                    </table></td>
                    <td width="60">
                      <table id="tab_1" border=0 cellpadding=0 cellspacing=0 width="100%" style="cursor:hand;" >
                        <tr>
                          <td width=5 height=3 background="/html/slcomm_img/tb1_01.gif"></td>
                          <td height=3  background="/html/slcomm_img/tb1_02.gif" ></td>
                          <td width=5 height=3 background="/html/slcomm_img/tb1_03.gif"></td>
                        </tr>
                        <tr>
                          <td background="/html/slcomm_img/tb1_04.gif" height="17" width="5"></td>
                          <td background="/html/slcomm_img/tb1_05.gif" height="17" align="center">MM-999</td>
                          <td background="/html/slcomm_img/tb1_06.gif" height="17" width="5"></td>
                        </tr>
                    </table></td>
                    <td width="60">
                      <table id="tab_2" border=0 cellpadding=0 cellspacing=0 width="100%" style="cursor:hand;" >
                        <tr>
                          <td width=5 height=3 background="/html/slcomm_img/tb1_01.gif"></td>
                          <td height=3  background="/html/slcomm_img/tb1_02.gif" ></td>
                          <td width=5 height=3 background="/html/slcomm_img/tb1_03.gif"></td>
                        </tr>
                        <tr>
                          <td background="/html/slcomm_img/tb1_04.gif" height="17" width="5"></td>
                          <td background="/html/slcomm_img/tb1_05.gif" height="17" align="center">MM-999</td>
                          <td background="/html/slcomm_img/tb1_06.gif" height="17" width="5"></td>
                        </tr>
                    </table></td>
                    <td width="60">
                      <table id="tab_3" border=0 cellpadding=0 cellspacing=0 width="100%" style="cursor:hand;" >
                        <tr>
                          <td width=5 height=3 background="/html/slcomm_img/tb1_01.gif"></td>
                          <td height=3  background="/html/slcomm_img/tb1_02.gif" ></td>
                          <td width=5 height=3 background="/html/slcomm_img/tb1_03.gif"></td>
                        </tr>
                        <tr>
                          <td background="/html/slcomm_img/tb1_04.gif" height="17" width="5"></td>
                          <td background="/html/slcomm_img/tb1_05.gif" height="17" align="center">MM-999</td>
                          <td background="/html/slcomm_img/tb1_06.gif" height="17" width="5"></td>
                        </tr>
                    </table></td>
                    <td width="60">
                      <table id="tab_4" border=0 cellpadding=0 cellspacing=0 width="100%" style="cursor:hand;" >
                        <tr>
                          <td width=5 height=3 background="/html/slcomm_img/tb1_01.gif"></td>
                          <td height=3  background="/html/slcomm_img/tb1_02.gif" ></td>
                          <td width=5 height=3 background="/html/slcomm_img/tb1_03.gif"></td>
                        </tr>
                        <tr>
                          <td background="/html/slcomm_img/tb1_04.gif" height="17" width="5"></td>
                          <td background="/html/slcomm_img/tb1_05.gif" height="17" align="center">MM-999</td>
                          <td background="/html/slcomm_img/tb1_06.gif" height="17" width="5"></td>
                        </tr>
                    </table></td>

                    <td width="50">
                      <table border=0 cellpadding=0 cellspacing=0 width="100%" >
                        <tr>
                          <td valign="bottom">&nbsp;
                              <input type="image" src="/html/slcomm_img/bu_ar02.gif" name="prev_medi_btn" value="" align="absmiddle" >
                              <input type="image" src="/html/slcomm_img/bu_ar01.gif" name="next_medi_btn" value="" align="absmiddle" ></td>
                        </tr>
                    </table></td>
                  </tr>
                </table>
                <!--tab table end-->
              </td>
              <td align="right" valign="bottom">
                  <input name="image2" type="image" src="/html/reader/images/bu_jung.gif" align="absmiddle" width="61" height="19">
                  <input name="image2" type="image" src="/html/reader/images/bu_gu01.gif" align="absmiddle" width="61" height="19">
                  <input type="image" name="subs_access_btn" src="/html/slcomm_img/bu_gu01.gif"  align="absmiddle"></td>
            </tr>
          </table>
          <%-- 신문구독계약 정보 시작(독자추가시에는 하나의 유료구독계약, 무료구독계약 정보를 입력받는 폼필드) --%>
          <table width="575"  cellpadding="2" cellspacing="0" bgcolor="#ffffff" class="gray" >
            <tr>
              <td width="61" bgcolor="#D8DDE7" class="gray">매체명<font color="#FF0000">*</font></td>
              <td class="gray">
              <select name="medicd" class="sel_all" style="width:100px" tabIndex="40" caption="매체명" disabled>
              </select>
    </td>
              <td width="61" bgcolor="#D8DDE7" class="gray" >구독금액<font color="#FF0000">*</font></td>
              <td class="gray"><input name="subsamt" type="text" class="text_box" style="ime-mode:disabled;text-align:right" tabindex="41" value="<%//=Util.comma(firstMediUprc)%>" size="12" maxlength="12" readonly caption="구독금액" dataType="number" comma >원</td>
              <td width="60" bgcolor="#D8DDE7" class="gray" >청구금액</td>
              <td colspan="3" class="gray"><input name="realsubsamt" type="text" class="text_box" style="ime-mode:disabled;text-align:right" tabindex="42" size="12" maxlength="12" readonly caption="청구금액" dataType="number" comma>원</td>
            </tr>
            <tr>
              <td bgcolor="#D8DDE7" class="gray">유료부수<font color="blue">*</font></td>
              <td class="gray"><input name="valqty" type="text" class="text_box" size="10" maxlength="3" style="ime-mode:disabled;text-align:right" tabIndex="43" caption="유료부수" dataType="number" value="1" >부</td>
              <td bgcolor="#D8DDE7" class="gray"> 준유가부수</td>
              <td class="gray"><input name="pre_valqty" type="text" class="text_box" style="ime-mode:disabled;text-align:right" tabindex="44" size="10" maxlength="3" readonly  caption="준유가부수" dataType="number">부</td>
              <td bgcolor="#D8DDE7" class="gray"> 무료부수<font color="blue">*</font></td>
              <td colspan="3" class="gray"><input name="no_valqty" type="text" class="text_box" style="ime-mode:disabled;text-align:right" tabindex="45" size="10" maxlength="3" caption="무료부수" dataType="number">부
                <select name="rptvfreeclsf" class="sel_all" style="width:76px;font-size:12px" tabindex="46" caption="무료구분" disabled>
                    <option value="" ></option>
                </select></td>
              </tr>
            <tr>
              <td bgcolor="#D8DDE7" class="gray">할인금액</td>
              <td class="gray"><input name="dscnamt" type="text" class="text_box" style="ime-mode:disabled;text-align:right" size="6" maxlength="6" tabIndex="47" caption="할인금액" dataType="number" comma minValue="1000" >원</td>
              <td bgcolor="#D8DDE7" class="gray">우송료</td>
              <td class="gray"><input name="post_dlvfee" type="text" class="text_box" style="ime-mode:disabled;text-align:right" size="6" maxlength="6" tabIndex="48" caption="우송료" dataType="number" comma minValue="100" >원</td>
              <td bgcolor="#D8DDE7" class="gray">수금방법<font color="#FF0000">*</font></td>
              <td colspan="3" class="gray"><select name="clamtmthdcd" class="sel_all" style="width:100px" tabIndex="49" caption="수금방법" disabled></select></td>
            </tr>
            <tr>
              <td bgcolor="#D8DDE7" class="gray">구독일자<font color="#FF0000">*</font></td>
              <td class="gray"><input name="rptvsubsdt" type="text" size="10" maxlength="10" class="text_box" tabindex="50" style="ime-mode:disabled;" caption="구독일자" datatype="date" value="<%//=Util.getDate2()%>"></td>
              <td bgcolor="#D8DDE7" class="gray">확장일자</td>
              <td class="gray"><input name="rptvrdr_extndt" type="text" size="10" maxlength="10" class="text_box" style="ime-mode:disabled;" tabIndex="51" dataType="date" caption="확장일자"  value="<%//=Util.getDate2()%>"></td>
              <td bgcolor="#D8DDE7" class="gray">유가월<font color="#FF0000">*</font></td>
              <td class="gray" ><input name="rptvvalmm" type="text"  size="7" maxlength="7" class="text_box" tabIndex="52" style="ime-mode:disabled;" dataType="month" caption="유가월"  value="<%//=Util.convertMonthS(Util.addMonth(ds.curryymm + "01", 1).substring(0, 6))%>"></td>
              <td bgcolor="#dddddd" class="gray" >분기</td>
              <td class="gray" ><input name="clamtcyclcd" type="text" class="text_box" size="2" maxlength="2" style="ime-mode:disabled;text-align:right" tabIndex="53" caption="분기월" minValue="2" maxValue="6" dataType="number">개월</td>
            </tr>
            <tr>
              <td bgcolor="#D8DDE7" class="gray">확장유형<font color="#FF0000">*</font></td>
              <td class="gray"><select name="rdr_extntypecd" class="sel_all" style="width:100px" caption="확장유형" tabIndex="54" disabled>
              </select></td>
              <td bgcolor="#D8DDE7" class="gray">확장자<font color="blue">*</font></td>
              <td class="gray"><input name="rptvextn" type="text" size="8" style="ime-mode:active;width:60" class="text_box" tabIndex="55" caption="확장자"  >
                  <input id="rdr_extn_search_btn" type="image" src="/html/slcomm_img/bu_search.gif" align="absmiddle" width="36" height="19" border="0" >
        </td>
              <td bgcolor="#D8DDE7" class="gray">판촉물</td>
              <td colspan="3" class="gray"><!--<input type="hidden" name="bns_itemcd" class="text_box" caption="판촉물코드" >--><input name="bns_itemnm" type="text" size="17" class="text_box" tabIndex="56" style="ime-mode:active;" caption="판촉물명" >
                  <input id="bns_itemcd_search_btn" type="image" src="/html/slcomm_img/bu_search.gif" align="absmiddle" width="36" height="19" border="0" ></td>
              </tr>
            <tr>
              <td bgcolor="#D8DDE7" class="gray">확장비용</td>
              <td class="gray"><input name="totrdr_extncost" type="text" class="text_box" size="11" maxlength="11" style="ime-mode:disabled;text-align:right" tabIndex="57" caption="확장비용" dataType="number" comma minValue="1000" >원</td>
              <td bgcolor="#D8DDE7" class="gray">이전일자</td>
              <td class="gray"><input name="rptvrdr_movmdt" type="text" size="10" maxlength="10" class="text_box" tabIndex="58" style="ime-mode:disabled;" readonly caption="이전일자" dataType="date" ></td>
              <td bgcolor="#D8DDE7" class="gray">중지일자</td>
              <td colspan="3" class="gray"><input name="rptv_suspdt" type="text" size="10" maxlength="10" class="text_box" tabIndex="59" style="ime-mode:disabled;" readonly caption="중지일자" dataType="date" >
                  <select name="rptv_suspresncd" disabled class="sel_all" style="width:88px" tabIndex="60" caption="중지사유" >
                  <option value="" ></option>
              </select></td>
            </tr>
          </table>
          <%-- 신문구독계약 정보 끝(독자추가시에는 하나의 유료구독계약, 무료구독계약 정보를 입력받는 폼필드) --%></td>
      </tr>
<!----------------------- 독자상세 정보 폼 끝 --------------------------->
</table>
<table width="100%" border="0" cellspacing="0" cellpadding="0" height="30">
        <tr>
          <td height="30" valign="bottom">
            <input name="reader_add_btn" type="image" id="reader_add_btn" src="/html/reader/images/bu_ma01.gif" >
            <input name="reader_save_btn" type="image" id="reader_save_btn" tabindex="66" src="/html/reader/images/bu_ma02.gif" >
            <input type="image" tabIndex="67" src="/html/reader/images/bu_ma03.gif" name="reader_cancel_btn" id="reader_cancel_btn" >
            <input type="image" tabIndex="68" src="/html/reader/images/bu_ma04.gif" name="reader_stop_btn" id="reader_stop_btn" >
            <input type="image" tabIndex="69" src="/html/reader/images/bu_ma05.gif" name="reader_move_btn" id="reader_move_btn" >
            <input type="image" tabIndex="70" src="/html/reader/images/bu_ma06.gif" name="reader_card_btn" id="reader_card_btn" >
<%--             <input name="image4" type="image" id="reader_detail_search_btn" onclick="reader_detail_search();window.event.returnValue=false;" src="/html/reader/images/bu_dk02.gif" align="absmiddle" width="90" height="19" border="0">--%>
           <input name="image4" type="image" id="reader_detail_search_btn" src="/html/reader/images/bu_dk04.gif" align="absmiddle" width="90" border="0">
          </td>

          <td height="30" align="right" valign="bottom">
            <input type="image" tabIndex="71" src="/html/reader/images/bu_ma07.gif" name="reader_dsct_btn" id="reader_dsct_btn" >
          </td>
        </tr>
      </table>
      <table width="575" border="0" cellspacing="0" cellpadding="2" bgcolor="#EBE9DC" height="30">
          <tr>
            <td width="120" class="title" height="30">
              <table border="0" cellspacing="0" cellpadding="0" id="reader_list_navigator_id">
                <tr>
                  <td>
                    <input type="image" name="reader_first_btn" src="/html/slcomm_img/bu_ar03.gif" width="17" height="19" align="absmiddle" alt="처음" border="0" >
                    <input name="image4" type="image" id="reader_prev_btn" src="/html/slcomm_img/bu_ar02.gif" alt="이전" align="absmiddle" width="17" height="19" border="0">
                    <input name="image4" type="image" id="reader_next_btn" src="/html/slcomm_img/bu_ar01.gif" alt="다음" align="absmiddle" width="17" height="19" border="0">
                    <input name="image4" type="image" id="reader_last_btn" src="/html/slcomm_img/bu_ar04.gif" alt="끝" align="absmiddle" width="17" height="19" border="0">
<%--                     <input name="image4" type="image" id="reader_detail_search_btn" src="/html/reader/images/bu_dk02.gif" align="absmiddle" width="90" height="19" border="0">--%>
                  </td>
                </tr>
            </table></td>
            <td width="125" class="title" height="30"><img src="/html/slcomm_img/ic_title.gif" width="11" height="7" align="absmiddle">정렬
                <select name="search_order" style="width:85" class="sel_all" caption="정렬조건">
                  <option value="DSNO">구역+배달</option>
                  <option value="NO">독자번호</option>
                  <option value="NM">독자명</option>
                  <option value="TEL">전화번호</option>
                  <!--option value="MIL">마일리지</option-->
                  <option value="ADDR">주소</option>
                  <!--option value="AMT">총구독액</option-->
                </select>
            </td>
            <td width="*" class="title" height="30"><img src="/html/slcomm_img/ic_title.gif" width="11" height="7" align="absmiddle">조건
                <select name="search_cond" style="width:110" class="sel_all" caption="검색조건">
                  <option value="ALL" selected>통합검색</option>
                  <option value="DSTC">구역</option>
                  <option value="DSNO">구역+배달</option>
                  <option value="NO">독자번호</option>
                  <option value="NM">독자명</option>
                  <option value="ADDR">상세주소</option>
                  <option value="ADDRS">주소전체</option>
                  <option value="TEL">전화번호</option>
                  <option value="EMAIL">이메일</option>
                  <option value="PRVNO">전(前)독자번호</option>
                  <option value="">전체</option>
                </select>
                <select name="search_dstc" style="width:50" class="sel_all" caption="구역" disabled="disabled">
                </select>
                <input name="search_word" type="text" size="10" class="text_box" style="ime-mode:active;"  value="<%//=firstDlvdstccd%>">
                <input name="image4" type="image" id="reader_list_search_btn" src="/html/slcomm_img/bu_search.gif" align="absmiddle" width="36" height="19" border="0"></td>
          </tr>
<!----------------------- 독자검색 폼 끝 --------------------------->
      </table>
      <table width="575"  cellpadding="2" cellspacing="0" class="gray" id="reader_list_id" >
        <tr bgcolor="#DDDDDD">
          <td width="34"  class="gray" align="center">순번</td>
          <td width="63" height="22" class="gray" align="center">구역+배달</td>
          <td width="55" class="gray" align="center" > 독자번호 </td>
          <td width="67" height="22" class="gray" align="center">독자명</td>
          <td width="63" height="22" class="gray" align="center">전화번호</td>
          <td width="35" height="22" class="gray" align="center" title="대표구독매체">매체</td>
          <%--<td width="68" height="22" class="gray" align="center">매체</td>--%>
          <td height="22" class="gray" align="center">주소</td>
          <td width="54" height="22" class="gray" align="center"><span title="독자가 구독중인 매체의 실구독액(유료부수X매체단가-할인액)을 모두 합한 금액">총구독액</span></td>
        </tr>
        <tr bgcolor="#FFFFFF">
          <td align="right" class="gray">&nbsp;</td>
          <td height="17" class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td align="right" class="gray">&nbsp;</td>
        </tr>
        <tr bgcolor="#FFFFFF">
          <td align="right" class="gray">&nbsp;</td>
          <td height="17" class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td align="right" class="gray">&nbsp;</td>
        </tr>
        <tr bgcolor="#FFFFFF">
          <td align="right" class="gray">&nbsp;</td>
          <td height="17" class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td align="right" class="gray">&nbsp;</td>
        </tr>
      </table></td>
    <td width=255 valign="top"><table width="100%" cellpadding="0" cellspacing="0" border="0" id="rcpm_list_id">
        <tr>
          <td>
            <table width="100%" cellpadding="0" cellspacing="0" border="0" id="rcpm_ssum_id">
              <tr>
                <td>
                  <table width="100%" cellpadding="2" cellspacing="0" class="gray" id="milg_his_id" >
                    <tr>
                      <td width="50%" height="17" bgcolor="#D7D7D7" class="gray">마일리지(on/off)</td>
                      <td height="17" bgcolor="#D7D7D7" class="gray">&nbsp;</td>
                    </tr>
                  </table>
                  <table width="100%" cellpadding="2" cellspacing="0" >
                    <tr>
                      <td height="3"></td>
                    </tr>
                  </table>
                  <table width="100%" cellpadding="2" cellspacing="0" class="gray" id="rcpm_his_ssum_id" >
                    <tr>
                      <td width="50%" bgcolor="#EBE9DC" class="gray" height="17">입금내역</td>
                      <td width="50%" bgcolor="#F3DCCB" class="gray" height="17">입금내역</td>
                    </tr>
                    <tr bgcolor="#D7D7D7">
                      <td height="16" class="gray">&nbsp;</td>
                      <td class="gray">&nbsp;</td>
                    </tr>
                  </table>
                  <table width="100%" cellpadding="2" cellspacing="0" >
                    <tr>
                      <td height="3"></td>
                    </tr>
                  </table>
                  <table width="100%" cellpadding="2" cellspacing="0" class="gray" id="rcpm_un_recp_id" >
                    <tr bgcolor="#D7D7D7">
                      <td width="25%" height="16" bgcolor="#EBE9DC" class="gray">전월미수(개월/금액)</td>
                      <td width="25%" bgcolor="#EBE9DC" class="gray">&nbsp;</td>
                    </tr>
                  </table>
                  <table width="100%" cellpadding="2" cellspacing="0" >
                    <tr>
                      <td height="3"></td>
                    </tr>
                  </table>
                  <table border="0" cellspacing="0" cellpadding="2" bgcolor="#EBE9DC" id="rcpm_his_list_title_id">
                    <tr>
                      <td width="250" class="title"><input name="image5" type="image" id="rcpm_prev_btn" src="/html/slcomm_img/bu_ar02.gif" alt="이전" align="absmiddle" width="17" height="19" border="0">
                          <input name="image22" type="image" id="rcpm_next_btn" src="/html/slcomm_img/bu_ar01.gif" alt="다음" align="absmiddle" width="17" height="19" border="0">
                          <span class="gray">입금내역</span></td>
                    </tr>
                  </table>
                  <table width="100%" cellpadding="2" cellspacing="0" >
                    <tr>
                      <td height="3"></td>
                    </tr>
                  </table>
                  <table width="255" cellpadding="1" cellspacing="0" class="gray" bgcolor="#FFFFFF" id="rcpm_his_list_id">
                    <tr bgcolor="#DDDDDD">
                      <td width="20" align="center" class="gray">월</td>
                      <td width="65" class="gray">
                        <div align="center">입금일자</div></td>
                      <td width="50" class="gray">
                        <div align="center">청구액</div></td>
                      <td width="50" class="gray">
                        <div align="center">입금액</div></td>
                      <td align="center" class="gray">
                        <div align="center">입금구분</div></td>
                    </tr>
                    <tr>
                      <!-- 입금내역 수정시 필수 입력 항목 설정은 jsp 내에서 하도록 한다. -->
                      <td height="23" class="gray"><input name="subsmappli" type="text" class="text_box" style="border:0;width:20;text-align:right" readonly size="2" maxlength="2" tabIndex="125" caption="월" ></td>
                      <td class="gray"><input name="procdt" type="text" class="text_box" style="border:0;width:65;" readonly size="4" maxlength="4" dataType="date" tabIndex="125" caption="입금일자" ></td>
                      <td class="gray"><input name="clamamt" type="text" class="text_box" style="border:0;width:50;text-align:right" readonly dataType="number" comma size="4" maxlength="4" tabIndex="125" caption="구독금액" ></td>
                      <td class="gray"><input name="clamt" type="text" class="text_box" style="border:0;width:50;text-align:right" readonly dataType="number" comma size="4" maxlength="4" tabIndex="125" caption="입금액"></td>
                      <td class="gray"><input name="rcpmclsfnm" type="text" class="text_box" style="border:0;width:54" readonly size="4" maxlength="4" tabIndex="125" caption="입금구분"><!--<input type="hidden" name="rcpmclsfcd" ><input type="hidden" name="clamtmthdcd" >--></td>
                    </tr>
                    <tr>
                      <!-- 입금내역 수정시 필수 입력 항목 설정은 jsp 내에서 하도록 한다. -->
                      <td height="23" class="gray"><input name="subsmappli" type="text" class="text_box" style="border:0;width:20;text-align:right" readonly size="2" maxlength="2" tabIndex="125" caption="월" ></td>
                      <td class="gray"><input name="procdt" type="text" class="text_box" style="border:0;width:65;" readonly size="4" maxlength="4" tabIndex="125" caption="입금일자" ></td>
                      <td class="gray"><input name="clamamt" type="text" class="text_box" style="border:0;width:50;text-align:right" readonly dataType="number" comma size="4" maxlength="4" tabIndex="125" caption="구독금액" ></td>
                      <td class="gray"><input name="clamt" type="text" class="text_box" style="border:0;width:50;text-align:right" readonly dataType="number" comma size="4" maxlength="4" tabIndex="125" caption="입금액"></td>
                      <td class="gray"><input name="rcpmclsfnm" type="text" class="text_box" style="border:0;width:54" readonly size="4" maxlength="4" tabIndex="125" caption="입금구분"><!--<input type="hidden" name="rcpmclsfcd" ><input type="hidden" name="clamtmthdcd" >--></td>
                    </tr>
                    <tr>
                      <!-- 입금내역 수정시 필수 입력 항목 설정은 jsp 내에서 하도록 한다. -->
                      <td height="23" class="gray"><input name="subsmappli" type="text" class="text_box" style="border:0;width:20;text-align:right" readonly size="2" maxlength="2" tabIndex="125" caption="월" ></td>
                      <td class="gray"><input name="procdt" type="text" class="text_box" style="border:0;width:65;" readonly size="4" maxlength="4" tabIndex="125" caption="입금일자" ></td>
                      <td class="gray"><input name="clamamt" type="text" class="text_box" style="border:0;width:50;text-align:right" readonly dataType="number" comma size="4" maxlength="4" tabIndex="125" caption="구독금액" ></td>
                      <td class="gray"><input name="clamt" type="text" class="text_box" style="border:0;width:50;text-align:right" readonly dataType="number" comma size="4" maxlength="4" tabIndex="125" caption="입금액"></td>
                      <td class="gray"><input name="rcpmclsfnm" type="text" class="text_box" style="border:0;width:54" readonly size="4" maxlength="4" tabIndex="125" caption="입금구분"><!--<input type="hidden" name="rcpmclsfcd" ><input type="hidden" name="clamtmthdcd" >--></td>
                    </tr>
                    <tr>
                      <!-- 입금내역 수정시 필수 입력 항목 설정은 jsp 내에서 하도록 한다. -->
                      <td height="23" class="gray"><input name="subsmappli" type="text" class="text_box" style="border:0;width:20;text-align:right" readonly size="2" maxlength="2" tabIndex="125" caption="월" ></td>
                      <td class="gray"><input name="procdt" type="text" class="text_box" style="border:0;width:65;" readonly size="4" maxlength="4" tabIndex="125" caption="입금일자" ></td>
                      <td class="gray"><input name="clamamt" type="text" class="text_box" style="border:0;width:50;text-align:right" readonly dataType="number" comma size="4" maxlength="4" tabIndex="125" caption="구독금액" ></td>
                      <td class="gray"><input name="clamt" type="text" class="text_box" style="border:0;width:50;text-align:right" readonly dataType="number" comma size="4" maxlength="4" tabIndex="125" caption="입금액"></td>
                      <td class="gray"><input name="rcpmclsfnm" type="text" class="text_box" style="border:0;width:54" readonly size="4" maxlength="4" tabIndex="125" caption="입금구분"><!--<input type="hidden" name="rcpmclsfcd" ><input type="hidden" name="clamtmthdcd" >--></td>
                    </tr>
                    <tr>
                      <!-- 입금내역 수정시 필수 입력 항목 설정은 jsp 내에서 하도록 한다. -->
                      <td height="23" class="gray"><input name="subsmappli" type="text" class="text_box" style="border:0;width:20;text-align:right" readonly size="2" maxlength="2" tabIndex="125" caption="월" ></td>
                      <td class="gray"><input name="procdt" type="text" class="text_box" style="border:0;width:65;" readonly size="4" maxlength="4" tabIndex="125" caption="입금일자" ></td>
                      <td class="gray"><input name="clamamt" type="text" class="text_box" style="border:0;width:50;text-align:right" readonly dataType="number" comma size="4" maxlength="4" tabIndex="125" caption="구독금액" ></td>
                      <td class="gray"><input name="clamt" type="text" class="text_box" style="border:0;width:50;text-align:right" readonly dataType="number" comma size="4" maxlength="4" tabIndex="125" caption="입금액"></td>
                      <td class="gray"><input name="rcpmclsfnm" type="text" class="text_box" style="border:0;width:54" readonly size="4" maxlength="4" tabIndex="125" caption="입금구분"><!--<input type="hidden" name="rcpmclsfcd" ><input type="hidden" name="clamtmthdcd" >--></td>
                    </tr>
                    <tr>
                      <!-- 입금내역 수정시 필수 입력 항목 설정은 jsp 내에서 하도록 한다. -->
                      <td height="23" class="gray"><input name="subsmappli" type="text" class="text_box" style="border:0;width:20;text-align:right" readonly size="2" maxlength="2" tabIndex="125" caption="월" ></td>
                      <td class="gray"><input name="procdt" type="text" class="text_box" style="border:0;width:65;" readonly size="4" maxlength="4" tabIndex="125" caption="입금일자" ></td>
                      <td class="gray"><input name="clamamt" type="text" class="text_box" style="border:0;width:50;text-align:right" readonly dataType="number" comma size="4" maxlength="4" tabIndex="125" caption="구독금액" ></td>
                      <td class="gray"><input name="clamt" type="text" class="text_box" style="border:0;width:50;text-align:right" readonly dataType="number" comma size="4" maxlength="4" tabIndex="125" caption="입금액"></td>
                      <td class="gray"><input name="rcpmclsfnm" type="text" class="text_box" style="border:0;width:54" readonly size="4" maxlength="4" tabIndex="125" caption="입금구분"><!--<input type="hidden" name="rcpmclsfcd" ><input type="hidden" name="clamtmthdcd" >--></td>
                    </tr>
                    <tr>
                      <!-- 입금내역 수정시 필수 입력 항목 설정은 jsp 내에서 하도록 한다. -->
                      <td height="23" class="gray"><input name="subsmappli" type="text" class="text_box" style="border:0;width:20;text-align:right" readonly size="2" maxlength="2" tabIndex="125" caption="월" ></td>
                      <td class="gray"><input name="procdt" type="text" class="text_box" style="border:0;width:65;" readonly size="4" maxlength="4" tabIndex="125" caption="입금일자" ></td>
                      <td class="gray"><input name="clamamt" type="text" class="text_box" style="border:0;width:50;text-align:right" readonly dataType="number" comma size="4" maxlength="4" tabIndex="125" caption="구독금액" ></td>
                      <td class="gray"><input name="clamt" type="text" class="text_box" style="border:0;width:50;text-align:right" readonly dataType="number" comma size="4" maxlength="4" tabIndex="125" caption="입금액"></td>
                      <td class="gray"><input name="rcpmclsfnm" type="text" class="text_box" style="border:0;width:54" readonly size="4" maxlength="4" tabIndex="125" caption="입금구분"><!--<input type="hidden" name="rcpmclsfcd" ><input type="hidden" name="clamtmthdcd" >--></td>
                    </tr>
                    <tr>
                      <!-- 입금내역 수정시 필수 입력 항목 설정은 jsp 내에서 하도록 한다. -->
                      <td height="23" class="gray"><input name="subsmappli" type="text" class="text_box" style="border:0;width:20;text-align:right" readonly size="2" maxlength="2" tabIndex="125" caption="월" ></td>
                      <td class="gray"><input name="procdt" type="text" class="text_box" style="border:0;width:65;" readonly size="4" maxlength="4" tabIndex="125" caption="입금일자" ></td>
                      <td class="gray"><input name="clamamt" type="text" class="text_box" style="border:0;width:50;text-align:right" readonly dataType="number" comma size="4" maxlength="4" tabIndex="125" caption="구독금액" ></td>
                      <td class="gray"><input name="clamt" type="text" class="text_box" style="border:0;width:50;text-align:right" readonly dataType="number" comma size="4" maxlength="4" tabIndex="125" caption="입금액"></td>
                      <td class="gray"><input name="rcpmclsfnm" type="text" class="text_box" style="border:0;width:54" readonly size="4" maxlength="4" tabIndex="125" caption="입금구분"><!--<input type="hidden" name="rcpmclsfcd" ><input type="hidden" name="clamtmthdcd" >--></td>
                    </tr>
                    <tr>
                      <!-- 입금내역 수정시 필수 입력 항목 설정은 jsp 내에서 하도록 한다. -->
                      <td height="23" class="gray"><input name="subsmappli" type="text" class="text_box" style="border:0;width:20;text-align:right" readonly size="2" maxlength="2" tabIndex="125" caption="월" ></td>
                      <td class="gray"><input name="procdt" type="text" class="text_box" style="border:0;width:65;" readonly size="4" maxlength="4" tabIndex="125" caption="입금일자" ></td>
                      <td class="gray"><input name="clamamt" type="text" class="text_box" style="border:0;width:50;text-align:right" readonly dataType="number" comma size="4" maxlength="4" tabIndex="125" caption="구독금액" ></td>
                      <td class="gray"><input name="clamt" type="text" class="text_box" style="border:0;width:50;text-align:right" readonly dataType="number" comma size="4" maxlength="4" tabIndex="125" caption="입금액"></td>
                      <td class="gray"><input name="rcpmclsfnm" type="text" class="text_box" style="border:0;width:54" readonly size="4" maxlength="4" tabIndex="125" caption="입금구분"><!--<input type="hidden" name="rcpmclsfcd" ><input type="hidden" name="clamtmthdcd" >--></td>
                    </tr>
                    <tr>
                      <!-- 입금내역 수정시 필수 입력 항목 설정은 jsp 내에서 하도록 한다. -->
                      <td height="23" class="gray"><input name="subsmappli" type="text" class="text_box" style="border:0;width:20;text-align:right" readonly size="2" maxlength="2" tabIndex="125" caption="월" ></td>
                      <td class="gray"><input name="procdt" type="text" class="text_box" style="border:0;width:65;" readonly size="4" maxlength="4" tabIndex="125" caption="입금일자" ></td>
                      <td class="gray"><input name="clamamt" type="text" class="text_box" style="border:0;width:50;text-align:right" readonly dataType="number" comma size="4" maxlength="4" tabIndex="125" caption="구독금액" ></td>
                      <td class="gray"><input name="clamt" type="text" class="text_box" style="border:0;width:50;text-align:right" readonly dataType="number" comma size="4" maxlength="4" tabIndex="125" caption="입금액"></td>
                      <td class="gray"><input name="rcpmclsfnm" type="text" class="text_box" style="border:0;width:54" readonly size="4" maxlength="4" tabIndex="125" caption="입금구분"><!--<input type="hidden" name="rcpmclsfcd" ><input type="hidden" name="clamtmthdcd" >--></td>
                    </tr>
                    <tr>
                      <!-- 입금내역 수정시 필수 입력 항목 설정은 jsp 내에서 하도록 한다. -->
                      <td height="23" class="gray"><input name="subsmappli" type="text" class="text_box" style="border:0;width:20;text-align:right" readonly size="2" maxlength="2" tabIndex="125" caption="월" ></td>
                      <td class="gray"><input name="procdt" type="text" class="text_box" style="border:0;width:65;" readonly size="4" maxlength="4" tabIndex="125" caption="입금일자" ></td>
                      <td class="gray"><input name="clamamt" type="text" class="text_box" style="border:0;width:50;text-align:right" readonly dataType="number" comma size="4" maxlength="4" tabIndex="125" caption="구독금액" ></td>
                      <td class="gray"><input name="clamt" type="text" class="text_box" style="border:0;width:50;text-align:right" readonly dataType="number" comma size="4" maxlength="4" tabIndex="125" caption="입금액"></td>
                      <td class="gray"><input name="rcpmclsfnm" type="text" class="text_box" style="border:0;width:54" readonly size="4" maxlength="4" tabIndex="125" caption="입금구분"><!--<input type="hidden" name="rcpmclsfcd" ><input type="hidden" name="clamtmthdcd" >--></td>
                    </tr>
                  </table>
                  <table width="100%" cellpadding="2" cellspacing="0" >
                    <tr>
                      <td height="3"></td>
                    </tr>
                  </table>
                  <table width="255" cellpadding="2" cellspacing="0" class="gray" id="rcpm_his_detail_id">
                    <tr>
                      <td width="60" height="23" bgcolor="#D7D7D7" class="gray">구독월분</td>
                      <td width="68" bgcolor="#FFFFFF" class="gray"><input name="subsmappli" type="text" class="text_box" style="width:65;" disabled dataType="month" size="4" maxlength="7" tabIndex="125" caption="구독월분" ></td>
                      <td width="60" bgcolor="#D7D7D7" class="gray">청구액</td>
                      <td width="67" bgcolor="#FFFFFF" class="gray"><input name="clamamt" type="text" class="text_box" style="width:65;" disabled dataType="number" size="4" maxlength="7" tabIndex="125" caption="구독금액" ></td>
                    </tr>
                    <tr>
                      <td height="23" bgcolor="#D7D7D7" class="gray">입금일자</td>
                      <td bgcolor="#FFFFFF" class="gray"><input name="procdt" type="text" class="text_box" style="width:65;" disabled dataType="date" size="4" maxlength="10" tabIndex="125" caption="입금일자" ></td>
                      <td bgcolor="#D7D7D7" class="gray">입금액</td>
                      <td bgcolor="#FFFFFF" class="gray"><input name="clamt" type="text" class="text_box" style="width:65;" disabled dataType="number" size="4" maxlength="7" tabIndex="125" caption="입금액" ></td>
                    </tr>
                    <tr>
                      <td height="23" bgcolor="#D7D7D7" class="gray">수금방법</td>
                      <td bgcolor="#FFFFFF" class="gray"><select name="clamtmthdcd" class="sel_all" style="width:66" caption="수금방법" disabled  tabIndex="51" >
                        <option  value=""></option>
                        </select></td>
                      <td bgcolor="#D7D7D7" class="gray">입금구분</td>
                      <td bgcolor="#FFFFFF" class="gray"><select name="rcpmclsfcd" class="sel_all" style="width:66" caption="수금방법" disabled  tabIndex="51" >
                          <option  value=""></option>
                        </select></td>
                    </tr>
                  </table>
                  <!--table width="100%" cellpadding="2" cellspacing="0" >
                    <tr>
                      <td height="3"></td>
                    </tr>
                  </table-->
                  <table width="100%" cellpadding="1" cellspacing="0" bgcolor="#EBE9DC" class="title1" id="rcpm_his_detail_save_id">
                    <tr>
                      <td align="center" bgcolor="#D7D7D7" >
                        <input type="image" src="/html/slcomm_img/bu_save03.gif" width="90" height="19" align="absmiddle" disabled></td>
                    </tr>
                </table></td>
              </tr>
          </table></td>
        </tr>
    </table>
      <table width="100%" cellpadding="1" cellspacing="0" bgcolor="#EBE9DC" >
        <tr>
          <td height="7" align="center" valign="bottom">
        </tr>
      </table>
      <table width="100%" cellpadding="1" cellspacing="0" bgcolor="#EBE9DC" class="title1" >
        <tr>
          <td height="27" align="center" valign="bottom">
            <input name="image22" type="image" src="/html/reader/images/bu_pn01.gif" width="75" height="19" >
            <input name="image22" type="image" src="/html/reader/images/bu_memo.gif" width="62" height="19" >
            <input name="image22" type="image" src="/html/reader/images/bu_eche.gif" width="62" height="19" ></td>
        </tr>
      </table></td>
  </tr>
</table>

<!--</form>-->
</body>
</html>
