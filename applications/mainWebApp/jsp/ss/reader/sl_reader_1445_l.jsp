<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : sl_reader_1445_l.jsp
* ���       : ������������(���������˾�)(�����ȸ)-����ó���� ������� �����ȸ
* �ۼ�����   : 2004-04-03
* �ۼ���     : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-01
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    // getting dataset
    SL_L_SUBS_CNTR_STOP_HISTDataSet ds = (SL_L_SUBS_CNTR_STOP_HISTDataSet)request.getAttribute("ds");  // request dataset

    final int TAB_SIZE = 5; // �� row �� �� ���� ����
    
  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.makeDataToBulk(ds, "medicur", resTemp, "medicurData");
	
	rxw.makeHugeStart(resTemp, "listGrid", ds.stopcntrcur.size());
	SL_L_SUBS_CNTR_STOP_HISTSTOPCNTRCURRecord stopcntrcurRec = null;
	for(int i=0; i<ds.stopcntrcur.size(); i++){
		stopcntrcurRec = (SL_L_SUBS_CNTR_STOP_HISTSTOPCNTRCURRecord)ds.stopcntrcur.get(i);
        
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("idx");
			rxw.add_ColVal("freeyn_s");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(stopcntrcurRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal("");
		rxw.add_ColVal("Y".equals(stopcntrcurRec.freeyn)? "����" : "����");
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(stopcntrcurRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
