<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1025_a.jsp
* ��� : ��������-�Ź�������ǰ-�԰�-�ʱ�ȭ��
* �ۼ����� : 2004-01-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: ������
* ��������	: 2009-03-25
* ������ϸ�: ss_brsup_1025_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%--
1. �˻� ȭ��� �� ȭ�鿡 ��ǰ����, ��ǰ�ڵ尡 ���ÿ� �����ǰ� ������ ��ü, ���� �� ȭ�鿡 ���� ���� �ٸ��� ó���Ǿ�� �Ѵ�.
2. �˻�, �� ȭ�鿡 �ʱⰪ�� ������ ó���ϱ� ���� default_search_form, default_detail_form�� ������.
3. ��ȭ�鿡���� ��ǰ�ڵ尡 �����Ǿ�� �ϰ�, ��Ͻÿ��� �ʱ⿡ ��ǰ�ڵ尡 �������� �����Ƿ� ȭ�鿡�� �󼼸� ������ �� �ؽ�Ʈ�� �����ش�.
4. ���,����,������ ������ form�� �̿��Ѵ�.(access_form)
5. ����,�����ô� access_form�� key(�԰��ȣ,�԰�����,��ǰ�ڵ�) �׸��� access_form���� ���� Ȯ���Ѵ�.
--%>
<%
	SS_L_NWSPITEM_CDLSTDataSet ds = (SS_L_NWSPITEM_CDLSTDataSet)request.getAttribute("ds");
    int nwspitemewhListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initTemp", "");
	
	rxw.add(initData, "defaultDate", Util.getDate()); // ���ó�¥
	
	rxw.makeDataToList(ds, "curitemclsfcd", "cicdnm", "cicodeval", "��ü", "", initData, "itemGubunCombo"); // ��ǰ����
	rxw.makeDataToList(ds, "curcostclsfcd", "cicdnm", "cicodeval", "��ü", "", initData, "costCombo"); // ���û��
	rxw.makeDataToList(ds, "cursendclsfcd", "cicdnm", "cicodeval", "��ü", "", initData, "sendCombo"); // �߼�
		
	rxw.flush(out);	
%>

