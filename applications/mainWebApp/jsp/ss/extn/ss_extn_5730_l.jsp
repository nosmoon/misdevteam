<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_5730_l.jsp
* ��� : ���ⱸ����-������ ��� ��ȸ
* �ۼ����� : 2018-01-10
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ : 
* �������� :
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_EXTN_5730_LDataSet ds = (SS_SLS_EXTN_5730_LDataSet)request.getAttribute("ds");
   
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");

    // ��ȸ ���.
  	rxw.makeDataToBulk(ds, "curcommlist", resTemp, "listGrid");
   
	rxw.add(resTemp, "qty_100y", Util.comma(ds.getQty_100y())); // ��������
    rxw.add(resTemp, "qty_100n", Util.comma(ds.getQty_100n())); // �Ѻμ�
    rxw.add(resTemp, "qty_00", Util.comma(ds.getQty_00())); // �ѰǼ�
    rxw.add(resTemp, "totqty", Util.comma(ds.getTotqty())); // �ѰǼ�
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>


