<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1660_l.jsp
* ��� : Ȯ����Ȳ-���̹�Ȯ��-����-��
* �ۼ����� : 2004-04-06
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_PROMSTAF_CYEXPAY_DTLDataSet ds = (SS_L_PROMSTAF_CYEXPAY_DTLDataSet)request.getAttribute("ds");
	int listCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
%>
    <!--����Ʈ -->
      <table width="830" border="0" cellspacing="0"  cellpadding="1" class="gray" bgcolor="#FFFFFF" id="cyexpay_detail_id">	  
        <tr align="center" bgcolor="#dddddd"> 
          <td width="120" class="gray"> Ȯ���ȸ </td>
          <td width="120" class="gray"> ��ü </td>
          <td width="120" class="gray"> Ȯ�� </td>
          <td width="120" class="gray"> ���� </td>
          <td width="120" class="gray"> ���رݾ� </td>
          <td width="120" class="gray"> ���ظ��ϸ��� </td>
          <td width="120" class="gray"> �ݾ�/���ϸ��� </td>
        </tr>
		<%-- ����Ʈ ���� ���� �κ�--%>
		<%
		for(int i=0; i<ds.curcommlist.size(); i++){
			SS_L_PROMSTAF_CYEXPAY_DTLCURCOMMLISTRecord curcommlistRec = (SS_L_PROMSTAF_CYEXPAY_DTLCURCOMMLISTRecord)ds.curcommlist.get(i);
		%>          
        <tr> 
          <td class="gray" width="120" align="center">&nbsp;<%= curcommlistRec.campnm%></td>
          <td class="gray" width="120" align="center">&nbsp;<%= curcommlistRec.medicdnm%></td>
          <td class="gray" width="120" align="right">&nbsp;<%= curcommlistRec.rdr_extnqty%></td>
          <td class="gray" width="120" align="right">&nbsp;<%= curcommlistRec.calcqty%></td>
          <td class="gray" width="120" align="right">&nbsp;<%= curcommlistRec.basialonamt%></td>
          <td class="gray" width="120" align="right">&nbsp;<%= curcommlistRec.basialonpont%></td>
          <td class="gray" width="120" align="right">&nbsp;<%= curcommlistRec.alonamt%>/<%= curcommlistRec.alonpont%></td>
        </tr>
        <%}%>  
	    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
	    <%for(int i=0; i<(listCount-ds.curcommlist.size()); i++){%>
        <tr> 
          <td class="gray" width="120" align="center">&nbsp;</td>
          <td class="gray" width="120" align="center">&nbsp;</td>
          <td class="gray" width="120" align="center">&nbsp;</td>
          <td class="gray" width="120" align="right">&nbsp;</td>
          <td class="gray" width="120" align="right">&nbsp;</td>
          <td class="gray" width="120" align="right">&nbsp;</td>
          <td class="gray" width="120" align="right">&nbsp;</td>
        </tr>	    
		<%}%> 
	    <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>	    
        <tr>          
        <tr bgcolor="#dddddd" align="right"> 
          <td colspan="10" class="gray"> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">�ѰǼ� 
            <b><%= ds.getTotalcnt()%> </b>��</td>
        </tr>
       </form>
      </table>
    <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move2">
      <tr> 
        <td align="center" height="2"> 
          <!--����-->
        </td>
      </tr>
      <tr> 
        <td align="center" height="24" bgcolor="#E8E8E8"> 
		    <!--JSP PAGE START---------------------------------------------------------------------------------->
		    <%
		        String pageno = request.getParameter("pageno");
		        String totalcnt = String.valueOf(ds.getTotalcnt());
		        String js_fn_nm = request.getParameter("js_fn_nm");
		    %>
		    <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
		        <jsp:param name = "pageno" 		value="<%=pageno%>"/>
		        <jsp:param name = "totalcnt" 	value="<%=totalcnt%>"/>
		        <jsp:param name = "js_fn_nm" 	value="<%=js_fn_nm%>"/>
		        <jsp:param name = "pagesize" 	value="<%=listCount%>"/>
		        <jsp:param name = "page_set_gubun" 	value="0"/>
		    </jsp:include>
		    <!--JSP PAGE END------------------------------------------------------------------------------------>		    
        </td>
      </tr>
    </table>      

<script language="javascript">
    parent.document.all.cyexpay_detail_id.outerHTML = cyexpay_detail_id.outerHTML;
    parent.document.all.page_move2.outerHTML = page_move2.outerHTML;    
	parent.jsInit();
</script>