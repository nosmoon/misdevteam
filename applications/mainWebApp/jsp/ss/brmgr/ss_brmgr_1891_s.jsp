<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_brmgr_1891_s.jsp
* ��� 	 	 : �Ǹű�-����Ʈ���Է�(���Է����)
* �ۼ����� 	 : 2006-03-11
* �ۼ��� 	 : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-14
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	// dataset �ν��Ͻ� ����κ�
    SL_L_COMM_THRW_RATEDataSet ds = (SL_L_COMM_THRW_RATEDataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	int mediThrwRateOutForm = rxw.add(resTemp, "mediThrwRateOutForm", "");
	
	rxw.add(mediThrwRateOutForm, "ccnt", ds.c_cnt);
	rxw.add(mediThrwRateOutForm, "crate", ds.c_rate);
	rxw.add(mediThrwRateOutForm, "jcnt", ds.j_cnt);
	rxw.add(mediThrwRateOutForm, "jrate", ds.j_rate);
	rxw.add(mediThrwRateOutForm, "dcnt", ds.d_cnt);
	rxw.add(mediThrwRateOutForm, "drate", ds.d_rate);
	rxw.add(mediThrwRateOutForm, "ocnt", ds.o_cnt);
	rxw.add(mediThrwRateOutForm, "orate", ds.o_rate);
	
	rxw.flush(out);
%>
