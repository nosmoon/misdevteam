<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : sl_reader_1465_l.jsp
* ���       : ������������(�������ڸ���˾�-�����ȸ)
              (��ȭ��ȣ, �޴�����ȣ, �����ȣ+���ּ�+��+ȣ+����, �ֹε�Ϲ�ȣ, �̸���)
* �ۼ�����   : 2004-04-06
* �ۼ���     : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-31
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	//request
    long curr_page_no = ((String)request.getParameter("pageno") == null)? 1 : Long.parseLong(request.getParameter("pageno"));
	long records_per_page = ((String)request.getParameter("pagesize") == null)? 10 : Long.parseLong(request.getParameter("pagesize"));

	long start_no = ((curr_page_no - 1) * records_per_page)  + 1;

    //getting dataset
	SL_L_RDR_DUP_CHKDataSet ds = (SL_L_RDR_DUP_CHKDataSet)request.getAttribute("ds");
    
	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeDataToBulk(ds, "rdrchkcur", root, "listGrid");
	
	rxw.flush(out);
%>
