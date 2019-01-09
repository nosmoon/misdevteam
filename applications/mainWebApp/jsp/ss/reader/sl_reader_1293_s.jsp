<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명     : sl_reader_1380_s.jsp
* 기능       : 독자정보관리(판촉물내역팝업-상세조회)
* 작성일자   : 2004-06-03
* 작성자     : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	// request
	String rdr_no = Util.checkString(request.getParameter("rdr_no"));
	String milgpaydt = Util.checkString(request.getParameter("milgpaydt"));
	String milgpayno = Util.checkString(request.getParameter("milgpayno"));

    // getting dataset
    SL_S_MILGPAYDataSet ds = (SL_S_MILGPAYDataSet)request.getAttribute("ds");  // request dataset
%>
<!-------------------- 판촉물지급 상세폼 시작---------------------->
  <table width="670" border="0" cellpadding="1" cellspacing="0" bgcolor="#FFFFFF" class="gray" id="milg_detail_id">
    <form name="milg_detail_form" method="post">
      <input type=hidden name=accflag         ><!--	처리구분(I:입력, U:수정, D:삭제)  -->
      <input type=hidden name=rdr_no     value="<%=rdr_no%>"     ><!--	독자번호                    -->
      <tr height="23">
        <td width="73" bgcolor="#dddddd" class="gray">지급일자<font color="red">*</font></td>
        <td width="68" class="gray"><input name="milgpaydt" class="text_box" size="9"  tabindex="1" style="ime-mode:disabled" dataType="date" caption="지급일자" value="<%=Util.convertS(milgpaydt)%>" readonly>
        </td>
        <td width="73" bgcolor="#dddddd" class="gray">지급번호</td>
        <td width="93" class="gray"><input name="milgpayno" type="text" class="text_box" id="payno" tabIndex="2" size="3" maxlength="3" style="ime-mode:disabled;" dataType="number" caption="지급번호" readonly value="<%=milgpayno%>"></td>
        <td width="71" bgcolor="#dddddd" class="gray">지급기준<font color="red">*</font></td>
        <td colspan="3" class="gray"><input type="hidden" name="medicd" value="<%=ds.medicd%>">
            <input type="hidden" name="cmpycd" value="<%=ds.cmpycd%>">
            <input type="hidden" name="payclsfcd" value="<%=ds.payclsfcd%>">
            <%--지급기준코드("415":구독기간연장)일 경우 수정될수 있도록 초기화면에서 조회된 지급지준코드 select box 를 집어넣고 해당코드를 선택--%>
            <%
            if("415".equals(ds.paybasicd)){
            %>
               <select name="paybasicd" class="sel_all" style="width:200px" onchange="set_basi_info()">
               <%--지급기준--%>
                <%
                    StringBuffer sb = new StringBuffer("");
                    SL_S_MILGPAYPAYBASICURRecord paybasicurRec  = null;
                    for(int i=0; i<ds.paybasicur.size(); i++){
                        paybasicurRec = (SL_S_MILGPAYPAYBASICURRecord)ds.paybasicur.get(i);
                        String code = paybasicurRec.paybasicd;
                        String name = paybasicurRec.medinm + ":" + paybasicurRec.paybasinm;

                        sb.append("<option");
                        sb.append(" cmpycd=\""+paybasicurRec.cmpycd +"\"");
                        sb.append(" cmpynm=\""+paybasicurRec.cmpynm +"\"");
                        sb.append(" medicd=\""+paybasicurRec.medicd +"\"");
                        sb.append(" medinm=\""+paybasicurRec.medinm +"\"");
                        sb.append(" payclsfcd=\""+paybasicurRec.payclsfcd +"\"");
                        sb.append(" payclsfnm=\""+paybasicurRec.payclsfnm +"\"");
                        sb.append(" paybasicd=\""+paybasicurRec.paybasicd +"\"");
                        sb.append(" paybasinm=\""+paybasicurRec.paybasinm +"\"");
                        sb.append(" value=");
                        sb.append(code);
                        if(ds.cmpycd.equals(paybasicurRec.cmpycd) && ds.medicd.equals(paybasicurRec.medicd)
                            && ds.payclsfcd.equals(paybasicurRec.payclsfcd) && ds.paybasicd.equals(paybasicurRec.paybasicd)){
                            sb.append(" selected ");
                        }
                        sb.append(">");
                        sb.append(name);
                        sb.append("</option>");
                    }
                  %>
                  <%=sb.toString()%>
                </select>
            <%
            }else{
            %>
                <input type="hidden" name="paybasicd" value="<%=ds.paybasicd%>">
                <input type="text" style="width:200px" name="medinmpaybasinm" class="text_box" value="<%=ds.medinm + ":" + ds.paybasinm%>" readonly>
            <%
            }
            %>
        </td>
      </tr>
      <tr height="23">
        <td bgcolor="#dddddd" class="gray">포인트<font color="red">*</font></td>
        <td class="gray"><input name="pont" class="text_box" size="9"  tabindex="5" style="ime-mode:disabled;text-align:right" dataType="number" caption="포인트" comma notEmpty minValue="100" value="<%=Util.comma(ds.pont)%>" <%=("415".equals(ds.paybasicd))? "" : "readonly"%>></td>
        <td bgcolor="#dddddd" class="gray">본사분담금</td>
        <td class="gray"><input name="hdqtallmamt" type="text" class="text_box" tabIndex="6" size="10" maxlength="10" style="ime-mode:disabled;text-align:right" dataType="number" comma caption="본사분담금" readonly value="<%=Util.comma(ds.hdqtallmamt)%>">
        원</td>
        <td bgcolor="#dddddd" class="gray">지국분담금</td>
        <td class="gray">
          <input name="boallmamt" type="text" class="text_box" tabIndex="7" size="10" maxlength="10" style="ime-mode:disabled;text-align:right" dataType="number" comma caption="지국분담금" readonly value="<%=Util.comma(ds.boallmamt)%>">
        원 </td>
        <td bgcolor="#dddddd" class="gray">지급지국명</td>
        <td class="gray">
            <input name="bonm" type="text" class="text_box" tabIndex="8" size="15" style="ime-mode:active" caption="지급지국명" notEmpty readonly value="<%=ds.bonm%>"></td>
      </tr>
      <tr height="23">
        <td bgcolor="#dddddd" class="gray">마감여부</td>
        <td colspan="7" class="gray"><%=ds.margamyn%>&nbsp;</td>
      </tr>
    </form>
  </table>
  <!-------------------- 판촉물지급 상세폼 끝---------------------->
<script language="javascript">
    // 구독계약상세 정보 엎어치기
    parent.document.all.milg_detail_id.outerHTML = document.all.milg_detail_id.outerHTML;

    parent.jsInit();
</script>
