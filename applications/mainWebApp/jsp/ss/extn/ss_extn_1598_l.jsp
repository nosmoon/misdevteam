<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1598_l.jsp
* ��� : Ȯ����Ȳ-����Ȯ���̻����-���
* �ۼ����� : 2003-12-26
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : ���̹�������, ķ����Ȯ�� �߰�
* ������   : ��뼷 
* �������� : 2005-12-26
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-03-17
* ������ϸ� : ss_extn_1598_l.jsp.bak
---------------------------------------------------------------------------------------------------%>

<%
    SS_L_EXTN_MOVMDataSet ds = (SS_L_EXTN_MOVMDataSet)request.getAttribute("ds");
	int extnmovmListCount = 10;

	// ��ȸ���ǿ� ����, �μ��� ������,������ ����� �����Ѵ�.
	String viewflag = request.getParameter("viewflag");
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

 	// ��ȸ ���.
    //rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
           
  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "infoGrid", ds.curcommlist.size());
	
	if("1".equals(viewflag)) {
		
		for(int i=0; i < ds.curcommlist.size() ; i++)
		{
			SS_L_EXTN_MOVMCURCOMMLISTRecord curcommlistRec = (SS_L_EXTN_MOVMCURCOMMLISTRecord)ds.curcommlist.get(i);
			
			//title �߰�.
			if(i == 0)
			{
				
				//������ �ʵ�� �ڵ� ����.
				rxw.makeRecordToBulkTitle(curcommlistRec);
			}
		
			//������ �ʵ� �ڵ�����.
			rxw.makeRecordToBulk(curcommlistRec, false);
		}
		
	} else if("2".equals(viewflag)) {
		
		for(int i=0; i < ds.curcommlist.size() ; i++)
		{
			SS_L_EXTN_MOVMCURCOMMLISTRecord curcommlistRec = (SS_L_EXTN_MOVMCURCOMMLISTRecord)ds.curcommlist.get(i);
			
			//title �߰�.
			if(i == 0)
			{
				
				//������ �ʵ�� �ڵ� ����.
				rxw.makeRecordToBulkTitle(curcommlistRec);
			}
		
			//������ �ʵ� �ڵ�����.
			rxw.makeRecordToBulk(curcommlistRec, false);
		}
		
	} else {
		
		for(int i=0; i < ds.curcommlist.size() ; i++)
		{
			SS_L_EXTN_MOVMCURCOMMLISTRecord curcommlistRec = (SS_L_EXTN_MOVMCURCOMMLISTRecord)ds.curcommlist.get(i);
			
			//title �߰�.
			if(i == 0)
			{
				
				//������ �ʵ�� �ڵ� ����.
				rxw.makeRecordToBulkTitle(curcommlistRec);
			}
		
			//������ �ʵ� �ڵ�����.
			rxw.makeRecordToBulk(curcommlistRec, false);
		}
		
	}
	
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>
