<%@ page contentType="text/html; charset=KSC5601" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_account_1573_p.jsp
* 기능 	 	 : 판매지국-경리-매입(정산)-구독료정산(세금계산서)팝업
* 작성일자 	 : 2012-07-25
* 작성자 	 : 이혁
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	 :
* 수정일자 	 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<html xmlns="http://www.w3.org/1999/xhtml" >
<head><title>
	유치원배달료(세금계산서)
</title>
    
<style type="text/css">
body, table, tr, td {font-size:12px; font-family:"돋움", Arial;}
.sam {border:1px solid black; border-collapse:collapse;}
</style>
<script type="text/javascript" language="JavaScript">

    //페이지가 로딩될때 기본값으로 검색
    function default_search(){
        var ls_args = ""; // dialog argument
        var sale_yymm = "";
        var cta_rdr_extn_amt_clsf = "";
        var bo_cd = "";
        
        
        if(window.dialogArguments){
           ls_args = window.dialogArguments;

           var sale_yymm             = ls_args.sale_yymm;
           var cta_rdr_extn_amt_clsf = ls_args.cta_rdr_extn_amt_clsf;
           var bo_cd                  = ls_args.bo_cd;
          // alert ("변수값"+sale_yymm+'*'+cta_rdr_extn_amt_clsf+'*'+ bo_cd);
           window.returnValue = ls_args;
           list_search(sale_yymm,cta_rdr_extn_amt_clsf,bo_cd);
        }

    }
    
    
    function list_search(sale_yymm,cta_rdr_extn_amt_clsf,bo_cd) {
	var lo_form = document.taxform_detail_form;

	lo_form.sale_yymm.value = sale_yymm;
	lo_form.cta_rdr_extn_amt_clsf.value = cta_rdr_extn_amt_clsf;
	lo_form.bo_cd.value = bo_cd;
	
	lo_form.method = "post";
	lo_form.action = "/sp/sal/1531";
	lo_form.target = "ifrm";
        lo_form.submit();
    }
    
    
    function printDiv () {
	window.print();
	window.close();
    }

</script>

</head>
<body onload="default_search();">
<center>
   <form name="taxform_detail_form" method="post" action="">
   <input type="hidden" name="sale_yymm" value="">
   <input type="hidden" name="cta_rdr_extn_amt_clsf" value="">
   <input type="hidden" name="bo_cd" value="">
   
    <span id="taxspan" width="600">
           <table border="0" id="taxform_detail_table_id">
              <tr>
                <td align="left"><span style="font-size: 9pt">[별지제11호서식]</span></td>
                <td style="width: 381px" align="right"><img src="/images/btn_print.gif" id="imgbtn_print" border="0" onclick="printDiv();" style="cursor:pointer;" /></td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <table border="0" cellpadding="2" cellspacing="0" width="600" class="sam">
                    <tr>
                      <td colspan="26" align="center" height="50"><font size="6"><b>세금계산서</b></font><font>(공급받는자보관용)</font></td>
                    </tr>
                    <tr>
                      <td colspan="26">
                        <table width="100%" border="0" cellspacing="0" cellpadding="2" class="sam">
                          <tr>
                            <td rowspan="4" width="20" align="center" class="sam">공<br/>급<br/>자</td>
                            <td width="80" class="sam">등록번호</td>
                            <td width="200" colspan="4" class="sam" align="center"><span id="l1" style="font-size:16pt;font-weight:bold;">&nbsp;</span></td>
                            <td rowspan="4" width="20" align="center" class="sam">공<br/>급<br/>받<br/>는<br/>자</td>
                            <td width="80" class="sam">등록번호</td>
                            <td width="200" colspan="4" class="sam" align="center"><span id="r1" style="font-size:16pt;font-weight:bold;">&nbsp;</span></td>                                
                          </tr>
                          <tr>
                            <td width="80" class="sam">상 호<br/>(법인명)</td>
                            <td colspan="2" width="100" align="left" class="sam">&nbsp;</td>
                            <td width="20" class="sam">성<br/>명</td>
                            <td width="80" align="left" class="sam">&nbsp;</td>
                            <td width="80" class="sam">상 호<br/>(법인명)</td>
                            <td colspan="2" width="100" align="left" class="sam">&nbsp;</td>
                            <td width="20" class="sam">성<br/>명</td>
                            <td width="100" align="left" class="sam">&nbsp;</td>
                          </tr>
                          <tr>
                            <td width="80" class="sam">사업장<br/>주 소</td>
                            <td colspan="4" width="220" align="left" class="sam">&nbsp;</td>
                            <td  width="80" class="sam">사업장<br/>주 소</td>
                            <td colspan="4" width="220" align="left" class="sam">&nbsp;</td>
                          </tr>
                          <tr>
                            <td width="80" class="sam">업 태</td>
                            <td width="100" align="left" class="sam">&nbsp;</td>
                            <td width="20" class="sam">종<br/>목</td>
                            <td colspan="2" width="100" align="left" class="sam">&nbsp;</td>
                            <td width="80" class="sam">업 태</td>
                            <td width="100" align="left" class="sam">&nbsp;</td>
                            <td width="20" class="sam">종<br/>목</td>
                            <td colspan="2" width="100" align="left" class="sam">&nbsp;</td>
                          </tr>
                        </table>              
                        </td>
                    </tr>
                    <tr>
                      <td height="25" colspan="3" align="center" class="sam">작 &nbsp;&nbsp;성</td>
                      <td colspan="12" align="center" class="sam">공 &nbsp;&nbsp;급 &nbsp;&nbsp;가&nbsp;&nbsp;액</td>
                      <td colspan="10" align="center" class="sam">세 &nbsp;&nbsp;액</td>
                      <td align="center" style="text-align: center;" class="sam">비 &nbsp;&nbsp;고</td>
                    </tr>
                    <tr>
                      <td height="22" align="center" class="sam">년</td>
                      <td align="center" class="sam">월</td>
                      <td align="center" class="sam">일</td>
                      <td height="22" align="center" class="sam"><span style="font-size: 8pt; font-family: 돋움">공란</span></td>
                      <td align="center" class="sam">백</td>
                      <td align="center" class="sam">십</td>
                      <td align="center" class="sam">억</td>
                      <td align="center" class="sam">천</td>
                      <td align="center" class="sam">백</td>
                      <td align="center" class="sam">십</td>
                      <td align="center" class="sam">만</td>
                      <td align="center" class="sam">천</td>
                      <td align="center" class="sam">백</td>
                      <td align="center" class="sam">십</td>
                      <td align="center" class="sam">일</td>
                      <td height="22" align="center" class="sam">십</td>
                      <td align="center" class="sam">억</td>
                      <td align="center" class="sam">천</td>
                      <td align="center" class="sam">백</td>
                      <td align="center" class="sam">십</td>
                      <td align="center" class="sam">만</td>
                      <td align="center" class="sam">천</td>
                      <td align="center" class="sam">백</td>
                      <td align="center" class="sam">십</td>
                      <td align="center" class="sam">일</td>
                      <td height="45" rowspan="2" align="center" style="width: 99px" class="sam">&nbsp;</td>
                    </tr>
                    <tr>
                      <td height="23" align="center" class="sam">&nbsp;</td>
                      <td height="23" align="center" class="sam">&nbsp;</td>
                      <td height="23" align="center" class="sam">&nbsp;</td>
                      <td height="23" align="center" class="sam">&nbsp;</td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp;0</td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp;0</td>
                    </tr>
                    <tr>
                      <td colspan="26" height="86">
                        <table cellpadding="1" cellspacing="0" width="100%" class="sam">
                          <tr align="center">
                            <td class="sam">월</td>
                            <td class="sam">일</td>
                            <td class="sam">품 목</td>
                            <td class="sam">규 격</td>
                            <td class="sam">수 량</td>
                            <td class="sam">단 가</td>
                            <td class="sam">공급가액</td>
                            <td class="sam">세 액</td>
                            <td class="sam">비 고</td>
                          </tr>
                          <tr>
                            <td align="center" class="sam">&nbsp;</td>
                            <td align="center" class="sam">&nbsp;</td>
                            <td align="center" class="sam">&nbsp;</td>
                            <td class="sam">&nbsp;</td>
                            <td align="center" class="sam">0</td>
                            <td align="right" class="sam">&nbsp;</td>
                            <td align="right" class="sam">0</td>
                            <td align="right" class="sam">0</td>
                            <td class="sam">&nbsp;</td>
                          </tr>
                          <tr>
                            <td align="center" class="sam">&nbsp;</td>
                            <td align="center" class="sam">&nbsp;</td>
                            <td class="sam">&nbsp;</td>
                            <td class="sam">&nbsp;</td>
                            <td align="center" class="sam">&nbsp;</td>
                            <td align="right" class="sam">&nbsp;</td>
                            <td align="right" class="sam">&nbsp;</td>
                            <td align="right" class="sam">&nbsp;</td>
                            <td class="sam">&nbsp;</td>
                          </tr>
                          <tr>
                            <td align="center" class="sam">&nbsp;</td>
                            <td align="center" class="sam">&nbsp;</td>
                            <td class="sam">&nbsp;</td>
                            <td class="sam">&nbsp;</td>
                            <td align="center" class="sam">&nbsp;</td>
                            <td align="right" class="sam">&nbsp;</td>
                            <td align="right" class="sam">&nbsp;</td>
                            <td align="right" class="sam">&nbsp;</td>
                            <td class="sam">&nbsp;</td>
                          </tr>
                          <tr>
                            <td align="center" class="sam">&nbsp;</td>
                            <td align="center" class="sam">&nbsp;</td>
                            <td class="sam">&nbsp;</td>
                            <td class="sam">&nbsp;</td>
                            <td align="center" class="sam">&nbsp;</td>
                            <td align="right" class="sam">&nbsp;</td>
                            <td align="right" class="sam">&nbsp;</td>
                            <td align="right" class="sam">&nbsp;</td>
                            <td></td>
                          </tr>
                        </table>              
                        </td>
                    </tr>
                    <tr>
                      <td colspan="26">
                        <table cellpadding="1" cellspacing="0" width="100%" class="sam">
                          <tr align="center">
                            <td class="sam">합 계 금 액</td>
                            <td class="sam">현 금</td>
                            <td class="sam">수 표</td>
                            <td class="sam">어 음</td>
                            <td class="sam">외 상 미 수 금</td>
                            <td rowspan="2" width="120" align="center" class="sam"><span style="font-size: 9pt; font-family: 굴림체">이 금액을 <br/>영수 함.
                                </span></td>
                          </tr>
                          <tr align="center">
                            <td class="sam">￦0</td>
                            <td class="sam">&nbsp;</td>
                            <td class="sam">&nbsp;</td>
                            <td class="sam">&nbsp;</td>
                            <td class="sam">&nbsp;</td>
                          </tr>
                        </table>
                        </td>
                    </tr>
                  </table>
                </td>
              </tr>
              <tr>
                <td align="left" style="height: 16px">22226-28131일'95.1.25승인</td>
                <td align="right" style="width: 421px; height: 16px;">인쇄용지(특급)34g/m 182mm*128mm</td>
              </tr>
          </table>       
          </span>
    </form>
</center>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width=00 height=00></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>