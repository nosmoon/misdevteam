<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_reader_1430_a.jsp
* 기능 		 : 판매국-아파트투입율-활동사항(등록,수정,삭제)
* 작성일자 	 : 2005-11-03
* 작성자 	 : 이혁
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	 :
* 수정일자 	 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    // request
    // getting dataset
    SS_A_ACTMEMODataSet ds = (SS_A_ACTMEMODataSet)request.getAttribute("ds");  // request dataset
%>
<table width="100%" border="0" cellspacing="0" cellpadding="0" height="100%" id="rdrmemo_detail_id">
  <tr>
    <td height="76">
      <!--title-->
      <table width=100% border=0 cellpadding=0 cellspacing=0>
        <tr>
          <td style width="16"><img src="/html/comm_img/memo_01.gif" width=16 height=76 ></td>
          <td width="72"><img src="/html/comm_img/memo_02.gif" width=72 height=76 ></td>
          <td width="133"><img src="/html/comm_img/memo_03.gif" width=133 height=76 ></td>
          <td background="/html/comm_img/memo_04.gif">&nbsp;</td>
        </tr>
      </table>
      <!--title end-->
    </td>
  </tr>
  <tr>
    <td  height="7">
      <!-----리스트사이여백-- -->
    </td>
  </tr>
  <tr>
    <td align="center" class="scroll1" valign="top">
      <!--내용-->
      <table border="0" cellspacing="0" cellpadding="5"  style="border: #AEACAE 1px solid;">
<form name="rdrmemo_detail_form" method="post">
    <input type=hidden name=accflag	    >  <!--처리 FLAG(R:조회, U:수정, D:초기화) -->
    <input type=hidden name=invsgdt value="<%=request.getParameter("invsgdt")%>">
    <input type=hidden name=invsgno value="<%=request.getParameter("invsgno")%>">
    <input type=hidden name=addrcd value="<%=request.getParameter("addrcd")%>">
    <input type=hidden name=dongno value="<%=request.getParameter("dongno")%>">
    <input type=hidden name=incmgpers   >  <!--입력자(수정자)아이디                -->
        <tr>
          <td bgcolor="#dddddd" valign="top">
            <textarea name="actmemo" cols="40" rows="20"><%=ds.cont%></textarea>
          </td>
        </tr>
</form>
      </table>
    </td>
  </tr>
  <tr>
    <td align="center" height="7">
      <!--하단여백-->
    </td>
  </tr>
  <tr>
    <td align="center" height="27"  bgcolor="#959595">
    <%-- <input name="image2" type="image" id="image" onclick="access_rdrmemo('U');window.event.returnValue=false;" src="/html/comm_img/bu_save.gif" align="absmiddle">--%>
    <input name="image2" type="image" id="image" onclick="access_ActMemo('U');window.event.returnValue=false;" src="/html/comm_img/bu_save.gif" align="absmiddle">
    <input type="image" src="/html/comm_img/bu_close.gif" onclick="close_modal();window.event.returnValue=false;" align="absmiddle">
    <input name="image" type="image" id="default_btn" onclick="access_ActMemo('D');window.event.returnValue=false;" src="/html/comm_img/bu_default.gif" align="absmiddle" width="50" height="19"></td>
  </tr>
</table>
<script language="javascript">
    parent.document.all.rdrmemo_detail_id.outerHTML = document.all.rdrmemo_detail_id.outerHTML;
    parent.jsInit();
<%if ("U".equals(request.getParameter("accflag"))){ %>
    alert("저장되었습니다.");
<%}%>

</script>
