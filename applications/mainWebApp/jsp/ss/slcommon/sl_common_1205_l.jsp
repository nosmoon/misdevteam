<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_common_1205_l.jsp
* ��� 		 : Ȯ���ڰ˻�(Ȯ���ڸ� �Է¿� ���� �˻�-����Ű)
* �ۼ����� 	 : 2003-12-09
* �ۼ��� 	 : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-31
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	SL_L_EXTNPERSDataSet ds = (SL_L_EXTNPERSDataSet)request.getAttribute("ds");
    SL_L_EXTNPERSCURCOMMLISTRecord rec = null;

   	//sizeó���� ȭ������. ��ü ������ ������.
	/*if(ds.curcommlist.size() == 1)
		rec = (SL_L_EXTNPERSCURCOMMLISTRecord)ds.curcommlist.get(0);*/
	
	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeDataToBulk(ds, "curcommlist", root, "extnData");
	
	rxw.flush(out);
%>
