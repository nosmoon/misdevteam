<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_2620_s.jsp
* ��� : ��������-����_�ڵ���ü-��ü��û���� ����ȸ 
* �ۼ����� : 2009-05-20
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	:
* ������	: 
* ��������	: 
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_SHFTAPLCDataSet ds = (SS_S_SHFTAPLCDataSet)request.getAttribute("ds");

	String jobcd = request.getParameter("jobcd");
	
  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");

	//rxw.makeDataToBulk(ds, resTemp, "detailGrid");
	rxw.makeHugeStart(resTemp, "detailGrid", ds.shftaplcdetail.size());
	for(int i=0; i<ds.shftaplcdetail.size(); i++){
		SS_S_SHFTAPLCSHFTAPLCDETAILRecord shftaplcdetailRec = (SS_S_SHFTAPLCSHFTAPLCDETAILRecord)ds.shftaplcdetail.get(i);
		//title �߰�.
		
		if(i == 0)
		{
			rxw.add_ColVal("shftaplcclsf_f");
			rxw.makeRecordToBulkTitle(shftaplcdetailRec);
		}
		if("10".equals(shftaplcdetailRec.shftaplcclsf)){
			rxw.add_ColVal("����");
		}else if("20".equals(shftaplcdetailRec.shftaplcclsf)){
			rxw.add_ColVal("�۽�");
		}
	
		rxw.makeRecordToBulk(shftaplcdetailRec, false);
	}

	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
