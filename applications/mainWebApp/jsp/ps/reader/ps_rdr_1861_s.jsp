<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pb_rdr_1861_s.jsp
* ��� : ���� �� ��������
* �ۼ����� : 2007-03-29
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-03-04
* ������ϸ� : ps_rdr_1861_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    String cmpycd      = Util.getSessionParameterValue(request, "cmpycd", true);          //���������ڵ�

    // dataset �ν��Ͻ� ����κ�
    PS_S_BO_READERINFODataSet ds = (PS_S_BO_READERINFODataSet)request.getAttribute("ds");         //request dataset

    // ���������� dataset
    PS_S_BO_READERINFOREADINFOCURRecord rec = null;
    boolean  rdrChk = false;            //������ ����Ÿ ����üũ

    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "dataTemp", "");
	
	rxw.makeHugeStart(resTemp, "detailGrid");
	
	for(int i=0; i < ds.readinfocur.size() ; i++)
	{
		rec = (PS_S_BO_READERINFOREADINFOCURRecord)ds.readinfocur.get(0);
		
		if(i == 0)
		{
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rec);
		}
		
		//������ �߰�.
		
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rec, false);
							   
	}
    rxw.makeHugeEnd();
    
	//rxw.makeDataToBulk(ds, resTemp, "detailGrid");
	
	rxw.flush(out);
%>

