<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1005_l.jsp
* ��� : ��������-�Ź�������ǰ-��ǰ-���
* �ۼ����� : 2004-01-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-03-25
* ������ϸ� : ss_brsup_1005_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%--
request�κ��� form_name, type, itemclsf ���� �� ��ǰ��� select�� ���� �����Ѵ�.
	<input name="form_name" type="hidden" value ="">				<!-- form �̸� -->
	<input name="type" type="hidden" value ="">			           	<!-- ��ü���Կ��� (Y:����, N:������)-->

--%>
<%
	SS_L_NWSPITEM_CLSFDataSet ds = (SS_L_NWSPITEM_CLSFDataSet)request.getAttribute("ds");
	String form_name = Util.checkString(request.getParameter("form_name"));		//form �̸�
	String type = Util.checkString(request.getParameter("type"));				//��ü���Կ��� (Y:����, N:������)
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initTemp = rxw.add(root, "initTemp", "");
	       
	rxw.makeDataToList(ds, "curcommlist", "itemnm", "itemcd", "��ü", "", initTemp, "itemCombo");
	rxw.flush(out);
%>