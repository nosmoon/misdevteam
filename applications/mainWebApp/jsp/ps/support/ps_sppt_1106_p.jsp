<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_sppt_1106_p.jsp
* ��� : ������ ���ڰ˻� �˾�
* �ۼ����� : 2003-12-08
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-02-25
* ������ϸ� : ps_sspt_1106_p.jsp_org
---------------------------------------------------------------------------------------------------%>

<%
    String rdrnm =  Util.Uni2Ksc(Util.checkString(request.getParameter("rdrnm")));
    String rdrtel_no1 =  ""; // Util.checkString(request.getParameter("rdrtel_no1"));
    String rdrtel_no2 =  ""; // Util.checkString(request.getParameter("rdrtel_no2"));
    String rdrtel_no3 =  ""; //  Util.checkString(request.getParameter("rdrtel_no3"));
    String rdrptph_no1 = ""; //  Util.checkString(request.getParameter("rdrptph_no1"));
    String rdrptph_no2 = ""; //  Util.checkString(request.getParameter("rdrptph_no2"));
    String rdrptph_no3 = ""; //  Util.checkString(request.getParameter("rdrptph_no3"));

    // dataset �ν��Ͻ� ����κ�
    PS_L_DSCTINFODataSet ds = (PS_L_DSCTINFODataSet)request.getAttribute("ds");  // request dataset
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // ��ȸ ���.
    //rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
    
  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "userGrid");
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		PS_L_DSCTINFOCURCOMMLISTRecord curcommlistRec = (PS_L_DSCTINFOCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("rdrno_detail");
			rxw.add_ColVal("subsfrser_detail");
			rxw.add_ColVal("addr_datail");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//������ �߰�.
		rxw.add_ColVal(curcommlistRec.rdr_no + "-" + curcommlistRec.medicd + "-" + curcommlistRec.termsubsno);
		rxw.add_ColVal(curcommlistRec.subsfrser_no + "-" + curcommlistRec.substoser_no);
		rxw.add_ColVal(curcommlistRec.dlvaddr + curcommlistRec.dlvdtlsaddr);
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>