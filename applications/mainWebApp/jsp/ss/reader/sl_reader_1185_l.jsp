<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : sl_reader_1185_l.jsp
* ���       : ������������(�����������ȸ)
* �ۼ�����   : 2003-12-12
* �ۼ���     : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-07
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    // getting dataset
    SL_L_NWSPSUBSCNTRDataSet ds = (SL_L_NWSPSUBSCNTRDataSet)request.getAttribute("ds");  // request dataset

    final int TAB_SIZE = 5; // �� row �� �� ���� ����
    
  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "rdr_no", Util.checkString(request.getParameter("rdr_no")));
	rxw.add(resTemp, "medicd", Util.checkString(request.getParameter("medicd")));
	rxw.add(resTemp, "flag", Util.checkString(request.getParameter("flag")));
	
	//��ü�� ��ư
	rxw.makeDataToBulk(ds, "medicur", resTemp, "medicurData");
	
	//������� ����Ʈ
	rxw.makeHugeStart(resTemp, "listGrid", ds.nwspsubscntrcur.size());
	SL_L_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord nwspsubscntrcurRec = null;
	for(int i=0; i<ds.nwspsubscntrcur.size(); i++)
	{
		nwspsubscntrcurRec = (SL_L_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord)ds.nwspsubscntrcur.get(i);
        
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("key");
			rxw.add_ColVal("freeyn_f");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(nwspsubscntrcurRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal("" + nwspsubscntrcurRec.cntrno + nwspsubscntrcurRec.mangno);
		rxw.add_ColVal("Y".equals(nwspsubscntrcurRec.freeyn)? "����" : "����");
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(nwspsubscntrcurRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
