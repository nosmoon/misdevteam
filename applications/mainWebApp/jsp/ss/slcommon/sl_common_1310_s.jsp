<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : sl_common_1300_s.jsp
* ��� : ���� - ����ȸ�� ���� ��ȸ
* �ۼ����� : 2006-08-18
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-24
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%-- dataset �ν��Ͻ� ����κ�--%>
<%
	CO_S_RDR_SERVICEDataSet ds = (CO_S_RDR_SERVICEDataSet)request.getAttribute("ds");

	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	int rdrService = rxw.add(resTemp, "rdrService", "");
	//����÷���ȸ��
	int record = rxw.add(rdrService, "record", "");
	rxw.add(record, "ID", "img_morningplus");
	rxw.add(record, "URL", "/images/mp_new3.gif");
	rxw.add(record, "DESC", "����÷���ȸ��");
	rxw.add(record, "VISIBLE", ds.getMorningplus().equals("0") ? "false" : "true");
	//SKT����ϱ�缭��
	record = rxw.add(rdrService, "record", "");
	rxw.add(record, "ID", "img_sktmobile");
	rxw.add(record, "URL", "/images/skt2.gif");
	rxw.add(record, "DESC", "SKT����ϱ�缭��");
	rxw.add(record, "VISIBLE", ds.getSktsrv().equals("0") ? "false" : "true");
	//IReader����
	record = rxw.add(rdrService, "record", "");
	rxw.add(record, "ID", "img_ireader");
	rxw.add(record, "URL", "/images/ireader.gif");
	rxw.add(record, "DESC", "IReader����");
	rxw.add(record, "VISIBLE", ds.getResv1().equals("0") ? "false" : "true");
	
	rxw.flush(out);
%>

