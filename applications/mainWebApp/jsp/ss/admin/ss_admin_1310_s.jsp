<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1310_s.jsp
* 기능 : 관리자-마일리지-지급기준-상세
* 작성일자 : 2004-03-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_MIGLBASIDataSet ds = (SS_S_MIGLBASIDataSet)request.getAttribute("ds");
    int sel_idx = 0;	// 요율산정기준 값에 따라 화면의 readOnly 속성을 지정하기 위해 pontcalcclsfcd_changed(sel_idx) 스크립트 함수 호출의 매개변수 계산 변수
%>
<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="paybasi_detail_id">
<form name="paybasi_detail_form" method="post" action="">
    <input type="hidden" name="accflag" value="I">          					<!-- 입력(I),수정(U),삭제(D) 구분필드 초기값(I) -->
    <input name="cmpycd" type="hidden" value ="<%= ds.getCmpycd()%>">			<!--회사코드-->
    <input name="medicd" type="hidden" value ="<%= ds.getMedicd()%>">           <!--매체코드-->
    <input name="payclsfcd" type="hidden" value ="<%= ds.getPayclsfcd()%>">    	<!--지급구분-->
    <input name="paybasicd" type="hidden" value ="<%= ds.getPaybasicd()%>">    	<!--지급기준-->
	<input name="pontcalcclsfcd" type="hidden" value ="<%= ds.getPontcalcclsfcd()%>">   <!--산정구분-->
   
	<tr> 
		
		<td bgcolor="#dddddd" class="gray"> 회사<font color="red">*</font></td>
		<td colspan="3" class="gray" width="200" id="cmpycd_td_id">&nbsp;<%= ds.getCmpy()%></td>
		<td width="150" bgcolor="#dddddd" class="gray"> 산정구분<font color="red">*</font></td>
		<td width="150" bgcolor="#dddddd" class="gray"> 포인트</td>
		<td class="gray" width="130">
			<input name="pont" type="text" value="<%= ds.getPont()%>" size="8"  class="text_box" dataType="integer" comma >
		</td>			
		
	</tr>
	<tr> 
	
		<td bgcolor="#dddddd" class="gray"> 매체<font color="red">*</font></td>
		<td colspan="3" class="gray"  width="200" id="medicd_td_id">&nbsp;<%= ds.getMedinm()%></td>
		<td width="150" bgcolor="#dddddd" class="gray"> 
<%--요율산정구분코드 라디오버튼 출력--%>			
<%for(int i=0; i<ds.curpontcalcclsfcd.size(); i++){
		String checked = "";
		SS_S_MIGLBASICURPONTCALCCLSFCDRecord curpontcalcclsfcdRec = (SS_S_MIGLBASICURPONTCALCCLSFCDRecord)ds.curpontcalcclsfcd.get(i);		
		
		if(curpontcalcclsfcdRec.cicodeval.equals(ds.pontcalcclsfcd)){
			checked = "checked";
			sel_idx = i;
		}else{
			checked = ""; 
		}		
%>
		<input type="radio" name="pontcalcclsfcd_sel" value="<%= curpontcalcclsfcdRec.cicodeval%>" onclick="pontcalcclsfcd_changed('<%= i%>');" <%=checked%>><%= curpontcalcclsfcdRec.cicdnm%></input>
<%}%>
		</td>
		<td bgcolor="#dddddd" class="gray"> 포인트요율</td>
		<td class="gray" width="130">
			<input name="pontrate" type="text" value="<%= ds.getPontrate()%>" size="8"  class="text_box" >
		</td>
	</tr>
	<tr> 
		<td bgcolor="#dddddd" class="gray"> 지급구분코드<font color="red">*</font></td>
		<td colspan="3" class="gray" width="200" id="payclsfcd_td_id">&nbsp;<%= ds.getPayclsf()%></td>
		<td width="150" rowspan="2" bgcolor="#dddddd" class="gray"> 분담비율 </td>
		<td width="150" bgcolor="#dddddd" class="gray"> 본사<font color="red">*</font></td>
		<td class="gray" width="130"> 
			<input name="hdqtallmratio" type="text" value="<%= ds.getHdqtallmratio()%>" size="8" caption="본사분담비율" class="text_box" notEmpty>
		</td>
	</tr>
	<tr> 
		<td bgcolor="#dddddd" class="gray"> 지급기준코드<font color="red">*</font></td>
		<td colspan="3" class="gray" width="200" id="paybasicd_td_id">&nbsp;<%= ds.getPaybasi()%></td>
		<td bgcolor="#dddddd" class="gray" width="95"> 지국지사<font color="red">*</font></td>
		<td class="gray" width="130"> 
			<input name="boallmratio" type="text" value="<%= ds.getBoallmratio()%>" size="8"  class="text_box"  caption="지국지사분담비율" notEmpty>
		</td>
	</tr>
	<tr> 
		<td bgcolor="#dddddd" class="gray"> 독자등급합산여부</td>
		<td class="gray" width="50"> 
			<input name="rdrgradsumyn" type="checkbox" size="8"  class="text_box" <%= Util.convertYn(ds.getRdrgradsumyn(),"checked","")%>>
		</td>
		<td bgcolor="#dddddd" class="gray" width="150"> 유효여부</td>
		<td class="gray" width="50"> 
			<input name="vdtyyn" type="checkbox" size="8"  class="text_box" <%= Util.convertYn(ds.getVdtyyn(),"checked","")%>>
		</td>
		<td colspan="2" bgcolor="#dddddd" class="gray">정산환율<font color="red">*</font></td>
		<td class="gray" width="130"> 
			<input name="adjmexchrate" type="text" value="<%= ds.getAdjmexchrate()%>" size="8"  class="text_box"  caption="정산환율" notEmpty>
		</td>
	</tr>
	<tr> 
		<td bgcolor="#dddddd" class="gray"> 설명 </td>
		<td colspan="6" class="gray"> 
			<textarea name="descri" cols="96" rows="3" class="scroll1"><%= ds.getDescri()%></textarea>
		</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" class="gray"> 지급시점설명 </td>
		<td colspan="6" class="gray">
			<textarea name="paypointdescri" cols="96" rows="3" class="scroll1"><%= ds.getPaypointdescri()%></textarea>
		</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" class="gray"> 비고 </td>
		<td colspan="6" class="gray">
			<textarea name="remk" cols="96" rows="3" class="scroll1"><%= ds.getRemk()%></textarea>
		</td>
	</tr>
</form>
</table>

<script language="javascript">
    parent.document.all.paybasi_detail_id.outerHTML = paybasi_detail_id.outerHTML;

    // 이벤트 핸들러 호출
    parent.jsInit();
    
	// 요율산정기준 radio 적용
	parent.pontcalcclsfcd_changed(<%=sel_idx%>);

	// 폼의 accflag 를 'U'로 변경한다.
    parent.document.paybasi_detail_form.accflag.value = 'U'
	
	// 취소버튼 비활성화 
 	parent.document.all.cancel_id.disabled=false;							
   
        
</script>
