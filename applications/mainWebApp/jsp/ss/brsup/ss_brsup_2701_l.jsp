<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2701_l.jsp
* ��� : ������� ��ȸ
* �ۼ����� : 2016-07-26
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_BRSUP_2701_LDataSet ds = (SS_SLS_BRSUP_2701_LDataSet)request.getAttribute("ds");
        
    RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");
    
    rxw.makeDataToBulk(ds, "curcommlist", resTemp, "listGrid");
    
    rxw.add(resTemp,"rdr_no",ds.getRdr_no());
    rxw.add(resTemp,"rdrnm",ds.getRdrnm());
    rxw.add(resTemp,"medinm",ds.getMedinm());
    rxw.add(resTemp,"bonm",ds.getBonm());
    
	rxw.flush(out);
%>