<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_common_1505_l.jsp
* ��� 		 : ���˹��˻� �˾� (���˹��� �Է� ���� �˻�)
* �ۼ����� 	 : 2003-12-09
* �ۼ���     : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-31
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	SL_L_BNSITEMDataSet ds = (SL_L_BNSITEMDataSet)request.getAttribute("ds");
    SL_L_BNSITEMCURRecord rec = null;

  	//sizeó���� ȭ������. ��ü ������ ������.
	/*if(ds.bnsitemcur.size() == 1){
  		rec = (SL_L_BNSITEMCURRecord)ds.bnsitemcur.get(0);*/
  		
  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeDataToBulk(ds, "bnsitemcur", root, "bnsitemData");
		
	rxw.flush(out);
%>
