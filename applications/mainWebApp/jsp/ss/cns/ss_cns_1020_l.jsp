<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_cns_1020_l.jsp
* ��� : ����-Ȯ��-��ü ��û ���
* �ۼ����� : 2004-07-13
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-03-30
* ������ϸ� : ss_cns_1020_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_EXTNDataSet ds = (SS_L_RDR_EXTNDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

	rxw.add(acctTemp, "pageno", request.getParameter("pageno"));
	rxw.add(acctTemp, "totalCount", String.valueOf(ds.getTotalcnt()));
	rxw.add(acctTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(acctTemp, "pagesize", extnListCount);
    
//	rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "listGrid");
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_RDR_EXTNCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTNCURCOMMLISTRecord)ds.curcommlist.get(i);
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("extnflnm_f");
			rxw.add_ColVal("bo_headcnfmdt_f");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);	
		}

		//������ �߰�.
		rxw.add_ColVal(curcommlistRec.extnflnm);
		//rxw.add_ColVal(Util.Timestamp2Str(curcommlistRec.bo_headcnfmdt));
		if(curcommlistRec.bo_headcnfmdt != null){
			rxw.add_ColVal(curcommlistRec.bo_headcnfmdt.toString().substring(0,10));
		}else{
			rxw.add_ColVal("");
		}
		
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}

	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
    
%>
