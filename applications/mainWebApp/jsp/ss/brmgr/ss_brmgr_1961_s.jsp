<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pb_rdr_1861_s.jsp
* ��� : ���� �� ��������
* �ۼ����� : 2007-03-29
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-04-09
* ������ϸ� : ss_brmgr_1961_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    String cmpycd      = Util.getSessionParameterValue(request, "cmpycd", true);          //���������ڵ�

    // dataset �ν��Ͻ� ����κ�
    SS_S_BO_READERINFODataSet ds = (SS_S_BO_READERINFODataSet)request.getAttribute("ds");         //request dataset
    
 	// ���������� dataset
    SS_S_BO_READERINFOREADINFOCURRecord rec = null;
    boolean  rdrChk = false;            //������ ����Ÿ ����üũ
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(resTemp, "detailGrid", ds.readinfocur.size());
	
	//if (ds.readinfocur.size() > 0) {
	for(int i=0; i < ds.readinfocur.size() ; i++) {
        rec = (SS_S_BO_READERINFOREADINFOCURRecord)ds.readinfocur.get(i);
       
      	//title �߰�.
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

