<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : sl_reader_1380_s.jsp
* ���       : ������������(���˹������˾�-����ȸ)
* �ۼ�����   : 2004-06-03
* �ۼ���     : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-07
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	// request
	String rdr_no = Util.checkString(request.getParameter("rdr_no"));
	String payno = Util.checkString(request.getParameter("payno"));

    // getting dataset
    SL_S_BNS_ITEMPAYDataSet ds = (SL_S_BNS_ITEMPAYDataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	int detailDataEx = rxw.add(resTemp, "detailDataEx", "");
	rxw.add(detailDataEx, "accflag", "U");
	rxw.add(detailDataEx, "rdr_no", rdr_no);
	rxw.add(detailDataEx, "payno", payno);
	rxw.add(detailDataEx, "bonm", Util.getSessionParameterValue(request, "bonm", true));
	
	rxw.flush(out);
%>
