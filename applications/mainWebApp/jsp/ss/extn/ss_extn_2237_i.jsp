<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2236_i.jsp
* ��� : Ȯ����Ȳ-���˸�������/����IS�����ݿ����� ��ȸ
* �ۼ����� : 2012-01-16
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>
<%

   SL_A_EXTNCLOS_CLOSINFODataSet ds = (SL_A_EXTNCLOS_CLOSINFODataSet)request.getAttribute("ds");

   RwXmlWrapper rxw = new RwXmlWrapper();
   int root = RwXmlWrapper.rootNodeID;
   //int resData = rxw.add(root, "resData", "");
   //int resForm = rxw.add(resData, "resForm", "");
   //int resForm = rxw.add(root, "resForm", "");
   
   int res_extn_close_info = rxw.add(root, "res_extn_close_info", "");

   rxw.add(res_extn_close_info, "closyn", ds.getClosyn() );
   rxw.add(res_extn_close_info, "issupyn", ds.getIssupyn() );

   rxw.flush(out);

   /*
   	System.out.println("===========here===========");
   	
	RwXml rx = new RwXml();
	SL_A_EXTNCLOS_CLOSINFODataSet ds = (SL_A_EXTNCLOS_CLOSINFODataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");
	int resform = rx.add(resData, "resform", "");
	int res_extn_close_info = rx.add(resform, "res_extn_close_info", "");
	
	rx.add(res_extn_close_info, "closyn", "Y");
	rx.add(res_extn_close_info, "issupyn", "Y");

        out.println(rx.xmlFlush());			        //������� �ۼ��� xml ���(���� �±�)
   	out.println(rx.xmlEndFlush());
   	
   	System.out.println("===========finish===========");
   */
%>