<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_4650_l.jsp
* ��� : Ȯ���� ��ȸ
* �ۼ����� : 2016-02-18
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ : 
* �������� :
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_EXTN_4650_LDataSet ds = (SS_SLS_EXTN_4650_LDataSet)request.getAttribute("ds");
   
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");

    // ��ȸ ���.
  	//rxw.makeDataToBulk(ds, "curmodlist", resTemp, "listGrid");
    
    //record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
    rxw.makeHugeStart(resTemp, "listGrid", ds.curextnlist.size());

	for(int i=0; i < ds.curextnlist.size() ; i++)
	{
		SS_SLS_EXTN_4650_LCUREXTNLISTRecord rec = (SS_SLS_EXTN_4650_LCUREXTNLISTRecord)ds.curextnlist.get(i);
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("check");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rec);
		}

		rxw.add_ColVal("");
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.add(resTemp, "qty_100y", Util.comma(ds.getQty_100y())); // ��������
    rxw.add(resTemp, "qty_100n", Util.comma(ds.getQty_100n())); // �Ѻμ�
    rxw.add(resTemp, "qty_00", Util.comma(ds.getQty_00())); // �ѰǼ�
    rxw.add(resTemp, "totqty", Util.comma(ds.getTotqty())); // �ѰǼ�
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>


