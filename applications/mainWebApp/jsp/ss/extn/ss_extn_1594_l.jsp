<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1594_l.jsp
* ��� : Ȯ����Ȳ-Ȯ��뿪���-���곻��-�� ���
* �ۼ����� : 2003-12-24
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-03-09
* ������ϸ� : ss_extn_1594_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_EXTN_SERVCOSTDDataSet ds = (SS_L_RDR_EXTN_SERVCOSTDDataSet)request.getAttribute("ds");

RwXmlWrapper rxw = new RwXmlWrapper();

int root = RwXmlWrapper.rootNodeID;
int acctTemp = rxw.makeParentNode(root, "dataTemp");

// ��ȸ ���.
//rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));

	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
rxw.makeHugeStart(acctTemp, "detailGrid", ds.curcommlist.size());

for(int i=0; i < ds.curcommlist.size() ; i++)
{
	SS_L_RDR_EXTN_SERVCOSTDCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_SERVCOSTDCURCOMMLISTRecord)ds.curcommlist.get(i);
	
	//title �߰�.
	if(i == 0)
	{
		//������ �ʵ�� �ڵ� ����.
		rxw.makeRecordToBulkTitle(curcommlistRec);
	}

	//������ �߰�.

	//������ �ʵ� �ڵ�����.
	rxw.makeRecordToBulk(curcommlistRec, false);
}

rxw.makeHugeEnd();

rxw.flush(out);

// data�� ���� ��� ó��. �߰� �ʿ�.
    
// page ó��. �߰� �ʿ�.
%>

