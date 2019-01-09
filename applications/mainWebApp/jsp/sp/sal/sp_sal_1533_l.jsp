<%@ page contentType="text/html; charset=KSC5601" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sal.rec.*
	,	chosun.ciis.sp.sal.ds.*
	,  somo.framework.util.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_account_1576_l.jsp
* 기능 	 	 : 판매지국-경리-매입(정산)-구독료정산-(세금계산서)팝업조회
* 작성일자 	 : 2012-07-25
* 작성자 	 : 이혁
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	 :
* 수정일자 	 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    int	idx = 0;
    int tot_amt = 0;
    int space_cnt = 0;
    String   cur_yymm = "";
    String[] suply_amt = new String[11];
    String[] vat_amt = new String[10];
    String[] uspace = { "①", "②", "③", "④", "⑤", "⑥", "⑦", "⑧", "⑨", "⑩", "⑪" };
    
    //	dataset 인스턴스 선언부분
    SP_SAL_1530_LDataSet ds = (SP_SAL_1530_LDataSet)request.getAttribute("ds");  // request dataset
    
    
    if(ds.curlist.size() > 0 ) {
    
	    for(int i=0; i<ds.curlist.size(); i++){
	    	SP_SAL_1530_LCURLISTRecord rsltcurRec = (SP_SAL_1530_LCURLISTRecord)ds.curlist.get(i);
	    	
	    	//공급가액컬럼계산
	    	idx = rsltcurRec.suply_amt.length();
	    	System.out.println("idx:"+idx);	    	
	    	for( int n=10; n>=0; n-- ) {
	    		if(idx>0) {
		    		suply_amt[n] = rsltcurRec.suply_amt.substring(idx-1,idx);
		    		idx -= 1;
		    	} else {
		    		suply_amt[n] = "";
		    		space_cnt += 1;
		    	}
	    		
	    		System.out.println("n"+n);	 
	    		
	    	}
	    	
	    	//세액컬럼계산
/*	    	
	    	idx = rsltcurRec.vat_amt.length();
	    	for( int n=9; n>=0; n-- ) {
	    		if(idx>0) {
		    		vat_amt[n] = rsltcurRec.vat_amt.substring(idx-1,idx);
		    		idx -= 1;
		    	} else {
		    		vat_amt[n] = "";
		    		//space_cnt += 1;
		    	}
	    	}
*/	    	
	    	//합계금액
	    	tot_amt = Integer.parseInt(rsltcurRec.suply_amt) + Integer.parseInt(rsltcurRec.vat_amt);
	    	cur_yymm = rsltcurRec.make_dt;
%>
  <table border="0" id="taxform_detail_table_id">
    <tr>
      <td align="left"><span style="font-size: 9pt">[별지제11호서식]</span></td>
      <td style="width: 381px" align="right"><img src="/images/btn_print.gif" id="imgbtn_print" border="0" onclick="printDiv();" style="cursor:pointer;" /></td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <table border="0" cellpadding="2" cellspacing="0" width="600" class="sam">
          <tr>
            <td colspan="26" align="center" height="50"><font size="6"><b>계산서</b></font><font>(공급받는자보관용)</font></td>
          </tr>
          <tr>
            <td colspan="26">
              <table width="100%" border="0" cellspacing="0" cellpadding="2" class="sam">
                <tr>
                  <td align="center" rowspan="4" width="20" class="sam">공<br/>급<br/>자</td>
                  <td align="center" width="80" class="sam">등록번호</td>
                  <td align="center" width="200" colspan="4" class="sam"><span id="l1" style="font-size:16pt;font-weight:bold;"><%=rsltcurRec.ern2%></span></td>
                  <td align="center" rowspan="4" width="20" class="sam">공<br/>급<br/>받<br/>는<br/>자</td>
                  <td align="center" width="80" class="sam">등록번호</td>
                  <td align="center" width="200" colspan="4" class="sam"><span id="r1" style="font-size:16pt;font-weight:bold;"><%=rsltcurRec.ern%></span></td>                                
                </tr>
                <tr>
                  <td align="center" width="80" class="sam">상 호<br/>(법인명)</td>
                  <td align="center" colspan="2" width="100" class="sam"><%=rsltcurRec.dlco_nm2%></td>
                  <td align="center" width="20" class="sam">성<br/>명</td>
                  <td align="center" width="80" class="sam"><%=rsltcurRec.presi_nm2%></td>
                  <td align="center" width="80" class="sam">상 호<br/>(법인명)</td>
                  <td align="center" colspan="2" width="100" class="sam"><%=rsltcurRec.dlco_nm%></td>
                  <td align="center" width="20" class="sam">성<br/>명</td>
                  <td align="center" width="100" class="sam"><%=rsltcurRec.presi_nm%></td>
                </tr>
                <tr>
                  <td align="center" width="80" class="sam">사업장<br/>주 소</td>
                  <td align="center" colspan="4" width="220" class="sam"><%=rsltcurRec.addr2%></td>
                  <td align="center" width="80" class="sam">사업장<br/>주 소</td>
                  <td align="center" colspan="4" width="220" class="sam"><%=rsltcurRec.addr%></td>
                </tr>
                <tr>
                  <td align="center" width="80" class="sam">업 태</td>
                  <td align="center" width="100" class="sam"><%=rsltcurRec.bizcond2%></td>
                  <td align="center" width="20" class="sam">종<br/>목</td>
                  <td colspan="2" width="100" class="sam"><%=rsltcurRec.item2%></td>
                  <td align="center" width="80" class="sam">업 태</td>
                  <td align="center" width="100" class="sam"><%=rsltcurRec.bizcond%></td>
                  <td align="center" width="20" class="sam">종<br/>목</td>
                  <td align="center" colspan="2" width="100" class="sam"><%=rsltcurRec.item%></td>
                </tr>
              </table>              
              </td>
          </tr>
          <tr>
            <td height="25" colspan="3" align="center" class="sam">작 &nbsp;&nbsp;성</td>
            <td colspan="12" align="center" class="sam">공 &nbsp;&nbsp;급 &nbsp;&nbsp;가&nbsp;&nbsp;액</td>
            <!--td colspan="10" align="center" class="sam">세 &nbsp;&nbsp;액</td-->
            <td width="280" align="center" style="text-align: center;" class="sam">비 &nbsp;&nbsp;고</td>
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
            <!--td height="22" align="center" class="sam">십</td>
            <td align="center" class="sam">억</td>
            <td align="center" class="sam">천</td>
            <td align="center" class="sam">백</td>
            <td align="center" class="sam">십</td>
            <td align="center" class="sam">만</td>
            <td align="center" class="sam">천</td>
            <td align="center" class="sam">백</td>
            <td align="center" class="sam">십</td>
            <td align="center" class="sam">일</td-->
            <td height="45" rowspan="2" align="center" class="sam">&nbsp;</td>
          </tr>
          <tr>
            <td height="23" align="center" class="sam">&nbsp;<%=cur_yymm.substring(2,4)%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=cur_yymm.substring(4,6)%></td>
            <td height="23" align="center" class="sam" >&nbsp;<%=cur_yymm.substring(6,8)%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=uspace[space_cnt-1]%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=suply_amt[0]%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=suply_amt[1]%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=suply_amt[2]%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=suply_amt[3]%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=suply_amt[4]%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=suply_amt[5]%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=suply_amt[6]%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=suply_amt[7]%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=suply_amt[8]%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=suply_amt[9]%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=suply_amt[10]%></td>
            <!--td height="23" align="center" class="sam">&nbsp;</td>
            <td height="23" align="center" class="sam">&nbsp;</td>
            <td height="23" align="center" class="sam">&nbsp;</td>
            <td height="23" align="center" class="sam">&nbsp;</td>
            <td height="23" align="center" class="sam">&nbsp;</td>
            <td height="23" align="center" class="sam">&nbsp;</td>
            <td height="23" align="center" class="sam">&nbsp;</td>
            <td height="23" align="center" class="sam">&nbsp;</td>
            <td height="23" align="center" class="sam">&nbsp;</td>
            <td height="23" align="center" class="sam">&nbsp;</td-->
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
                  <td class="sam">비 고</td>
                </tr>
                <tr>
                  <td align="center" class="sam"><%=rsltcurRec.mmdd.substring(0,2)%></td>
                  <td align="center" class="sam"><%=rsltcurRec.mmdd.substring(2,4)%></td>
                  <td align="center" class="sam"><%=rsltcurRec.item_2%></td>
                  <td class="sam">&nbsp;</td>
                  <td align="center" class="sam"><%=Util.comma(Integer.parseInt(rsltcurRec.qunt))%></td>
                  <td align="center" class="sam">&nbsp;</td>
                  <td align="center" class="sam"><%=Util.comma(Integer.parseInt(rsltcurRec.suply_amt_2))%></td>
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
                  <td class="sam">￦ <%=Util.comma(tot_amt)%></td>
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
<%
		}
%>

<script>
    parent.document.all.taxform_detail_table_id.outerHTML = taxform_detail_table_id.outerHTML;
//    parent.jsInit();
</script>
<%
	}
	else 
	{
%>
<script>
<%
        	out.print("alert(\"발행할 내역이 없습니다.\");");
        	out.print("window.close();");
%>
</script>
<%
	}
%>