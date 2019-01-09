<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pu_send_2106_l.jsp
* ��� : ���ʽ��� �ݼ۳��� ��ȸ
* �ۼ����� : 2003-12-08
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-02-18
* ������ϸ� : ps_send_2106_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    String records_per_page = request.getParameter("records_per_page");
    // dataset �ν��Ͻ� ����κ�
    PS_L_SEND_RETNDataSet ds = (PS_L_SEND_RETNDataSet)request.getAttribute("ds");
    // �������� ȭ���� ������ Row��
    int records_non_page = Integer.parseInt(records_per_page) - ds.retnptcrcur.size();
    
	RwXmlWrapper rxw = new RwXmlWrapper();
	
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "infoGrid");
	
	for(int i=0; i < ds.retnptcrcur.size() ; i++)
	{
		PS_L_SEND_RETNRETNPTCRCURRecord retnptcrcurRec = (PS_L_SEND_RETNRETNPTCRCURRecord)ds.retnptcrcur.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("check");
			rxw.add_ColVal("rdrno_detail");
			rxw.add_ColVal("boprocynDesc");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(retnptcrcurRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal("N");
		rxw.add_ColVal(new StringBuffer().append(retnptcrcurRec.rdr_no).append("-").append(retnptcrcurRec.medicd).append("-").append(retnptcrcurRec.termsubsno));
		rxw.add_ColVal(retnptcrcurRec.boprocyn.equals("Y")? "�ϰ�" : "�̰�");
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(retnptcrcurRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);

%>
