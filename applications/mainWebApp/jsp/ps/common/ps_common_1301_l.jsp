<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_common_1301_l.jsp
* ���     : ���纰 �μ��˻��� ���ϵǴ°�
* �ۼ����� : 2004-03-08
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    // dataset �ν��Ͻ� ����κ�
	PB_L_BOCDDEPTDataSet ds = (PB_L_BOCDDEPTDataSet)request.getAttribute("ds");
%>

            <select name="deptcd" size="1" class="sel_all" caption="�μ�" style="width:80;" id="bodept_sel" >
              <option value="%" selected >��ü</option>
<%--�μ� �޺��ڽ�--%>
<%
	for(int i=0; i<ds.deptlistcur.size(); i++){
		PB_L_BOCDDEPTDEPTLISTCURRecord deptlistcurRec = (PB_L_BOCDDEPTDEPTLISTCURRecord)ds.deptlistcur.get(i);
%>
              <option value="<%= deptlistcurRec.deptcd%>"><%= deptlistcurRec.deptnm%></option>
<%
	}
%>
            </select>

    <script language="javascript">
		parent.document.all.bodept_sel.outerHTML = bodept_sel.outerHTML;
    </script>
