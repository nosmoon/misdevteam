<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_2610_l.jsp
* ��� : ��������-����_�ڵ���ü-��ü��û����-�����ȸ
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
		
	SS_L_SHFTAPLCDataSet ds = (SS_L_SHFTAPLCDataSet)request.getAttribute("ds");

	String jobcd = request.getParameter("jobcd");
	
  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");

	rxw.makeHugeStart(resTemp, "listGrid", ds.shftaplclist.size());
	for(int i=0; i<ds.shftaplclist.size(); i++){
		SS_L_SHFTAPLCSHFTAPLCLISTRecord shftaplclistRec = (SS_L_SHFTAPLCSHFTAPLCLISTRecord)ds.shftaplclist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("aplcclsf_f");
			rxw.makeRecordToBulkTitle(shftaplclistRec);
		}
		if("10".equals(shftaplclistRec.aplcclsf)){
			rxw.add_ColVal("����");
		}else if("20".equals(shftaplclistRec.aplcclsf)){
			rxw.add_ColVal("�۽�");
		}
		
		rxw.makeRecordToBulk(shftaplclistRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
