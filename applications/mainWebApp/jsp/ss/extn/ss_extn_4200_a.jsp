<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_3700_a.jsp
* ��� : ������ ������� ��ȸ-�ʱ�ȭ��
* �ۼ����� : 2015-11-10
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_EXTN_4200_ADataSet ds = (SS_SLS_EXTN_4200_ADataSet)request.getAttribute("ds");
    int extnListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;	// ���� ���� ����
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
			
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");

	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");	

	//rxw.makeDataToList(ds, "resitypecdcur", "cicdnm", "cicodeval", "��ü", "", codeData, "resitypelist"); // ���
	
	//rxw.makeDataToList(ds, "clamtmthdcdcur", "cicdnm", "cicodeval", "��ü", "", codeData, "clamtmthdlist"); // ���
	
	rxw.add(codeData, "yymm", Util.addMonth(Util.getDate(),-1).substring(0,6)); // �Ⱓ from 
	
	rxw.add(codeData, "uid", String.valueOf( session.getAttribute("uid")));
	
	rxw.makeHugeStart(codeData, "listGrid_bns", ds.curbnsitem.size());
	
	for(int i=0; i < ds.curbnsitem.size() ; i++)
	{
		SS_SLS_EXTN_4200_ACURBNSITEMRecord curcommlistRec = (SS_SLS_EXTN_4200_ACURBNSITEMRecord)ds.curbnsitem.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			rxw.add_ColVal("check");
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		rxw.add_ColVal("N");
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.makeHugeStart(codeData, "listGrid_svc", ds.cursvcmm.size());
	
	for(int i=0; i < ds.cursvcmm.size() ; i++)
	{
		SS_SLS_EXTN_4200_ACURSVCMMRecord curcommlistRec = (SS_SLS_EXTN_4200_ACURSVCMMRecord)ds.cursvcmm.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			rxw.add_ColVal("check");
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		rxw.add_ColVal("N");
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.makeHugeStart(codeData, "listGrid_extntype", ds.curextntype.size());
	
	for(int i=0; i < ds.curextntype.size() ; i++)
	{
		SS_SLS_EXTN_4200_ACUREXTNTYPERecord curcommlistRec = (SS_SLS_EXTN_4200_ACUREXTNTYPERecord)ds.curextntype.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			rxw.add_ColVal("check");
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		rxw.add_ColVal("N");
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.makeHugeStart(codeData, "listGrid_resitype", ds.resitypecdcur.size());
	
	for(int i=0; i < ds.resitypecdcur.size() ; i++)
	{
		SS_SLS_EXTN_4200_ARESITYPECDCURRecord curcommlistRec = (SS_SLS_EXTN_4200_ARESITYPECDCURRecord)ds.resitypecdcur.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			rxw.add_ColVal("check");
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		rxw.add_ColVal("N");
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.makeHugeStart(codeData, "listGrid_clamtmthd", ds.clamtmthdcdcur.size());
	
	for(int i=0; i < ds.clamtmthdcdcur.size() ; i++)
	{
		SS_SLS_EXTN_4200_ACLAMTMTHDCDCURRecord curcommlistRec = (SS_SLS_EXTN_4200_ACLAMTMTHDCDCURRecord)ds.clamtmthdcdcur.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			rxw.add_ColVal("check");
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		rxw.add_ColVal("N");
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();

	rxw.flush(out);
%>

