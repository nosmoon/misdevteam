<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_bil_1516_a.jsp
* 기능 : 상담원-자동이체-등록
* 작성일자 : 2006-04-20
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<table  width="830" cellspacing="0" cellpadding="0" border="0" id="pbrdr_list">
    <tr bgcolor="#DDDDDD" >
        <td width="30" align="center" class="gray">
        <input type="checkbox" name="formcheckbox1">
        </td>
        <td width="100" align="center" class="gray"> 소속지사 </td>
        <td width="100" align="center" class="gray"> 구독매체 </td>
        <td width="150" align="center" class="gray"> 독자번호 </td>
        <td width="130" align="center" class="gray"> 구독기간 </td>
        <td width="80"  align="center" class="gray"> 주소 </td>
        <td width="80"  align="center" class="gray"> 납부자번호 </td>
    </tr>
    <tr>
        <td width="30" class="gray" align="center" >
        <input type="checkbox" name="formcheckbox12">
        </td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
    </tr>
</table>
<script language="javascript">
    alert("신청되었습니다.");

	// 화면 초기화
    parent.shftaplc_cancel();

    parent.document.all.pbrdr_list.outerHTML = pbrdr_list.outerHTML;
	parent.setEventHandler();

</script>
