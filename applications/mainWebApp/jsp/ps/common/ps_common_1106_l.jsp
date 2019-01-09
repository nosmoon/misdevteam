<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_common_1106_l.jsp
* 기능     : 공통 우편번호 검색을 통해 조회된 목록
* 작성일자 : 2004-01-30
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    //getting dataset
	PB_L_TAOCC_PSTCDDataSet ds = (PB_L_TAOCC_PSTCDDataSet)request.getAttribute("ds");

	//데이타 없을경우
    if(ds.zipaddrcur.size() == 0){
%>

      <table width="410" cellspacing="0" cellpadding="1" border="1" bordercolor="#FFFFFF" id="zip_list">
        <tr>
          <td bgcolor="#E7E7E7"><b>입력하신 '우편번호 혹은 읍/면/동 '이 없습니다.</b><br>
            거주하시는 지역의 '우편번호 혹은 읍/면/동 이름'이 정확하게<br>
            입력되었는지 다시 확인해주시기 바랍니다.
          </td>
        </tr>
      </table>

<%
	//데이타 있을경우
    }else{
        String color = null;
%>

      <!---주소나오는곳 한라인씩 색상 틀려요-->
      <table width="410" cellspacing="0" cellpadding="1" border="1" bordercolor="#FFFFFF" id="zip_list">
        <tr align="center" bgcolor="#979596">
          <td width="60"><font color="#ffffff">우편번호</font></td>
          <td           ><font color="#ffffff">주소</font></td>
        </tr>

<%
		//데이타 화면에 Display
		for(int i=0; i<ds.zipaddrcur.size(); i++){
			PB_L_TAOCC_PSTCDZIPADDRCURRecord zipaddrcurRec = (PB_L_TAOCC_PSTCDZIPADDRCURRecord)ds.zipaddrcur.get(i);

            // 배경색상
            color = ( Math.IEEEremainder(i, 2) == 0.0 )? "#F2F2F2" : "#DDDDDD";
%>
        <tr bgcolor="<%=color%>" onclick='set_addr("<%=zipaddrcurRec.juzipcd1%>-<%=zipaddrcurRec.juzipcd2%>-<%=zipaddrcurRec.juzipcd3%>","<%=zipaddrcurRec.jujuso1%> <%=zipaddrcurRec.jujuso2%> <%=zipaddrcurRec.jujuso3%> <%=zipaddrcurRec.jujuso4%>");' style="cursor:hand" onmouseover="this.style.backgroundColor='#BFD2DD'" onmouseout="this.style.backgroundColor='<%=color%>'">
          <td width="60" align="center"><%=zipaddrcurRec.juzipcd1%>-<%=zipaddrcurRec.juzipcd2%></td>
          <td><%=zipaddrcurRec.jujuso1%> <%=zipaddrcurRec.jujuso2%> <%=zipaddrcurRec.jujuso3%> <%=zipaddrcurRec.jujuso4%> <%=zipaddrcurRec.judoseo%>
<%
			//번지 체크후 Display
			if(!"".equals(zipaddrcurRec.jusaf) && !"".equals(zipaddrcurRec.jusat)) {
				out.write(zipaddrcurRec.jusaf+"-"+zipaddrcurRec.jusat);
			} else if("".equals(zipaddrcurRec.jusaf) || "".equals(zipaddrcurRec.jusat)) {
			    out.write(zipaddrcurRec.jusaf+" "+zipaddrcurRec.jusat);
			}
%>
          </td>
        </tr>
<%
  	    }
%>
      </table>
<%
    }
%>

<script language="javascript">
<!--
	var lo_form = parent.document.zip_search_form;
	parent.document.all.zip_list.outerHTML = zip_list.outerHTML;
    lo_form.zip.value   = "";
    lo_form.addr3.value = "";
    if(parent.validate_zip(lo_form.search_word.value)) parent.insertDash(lo_form.search_word, 3);
-->
</script>
