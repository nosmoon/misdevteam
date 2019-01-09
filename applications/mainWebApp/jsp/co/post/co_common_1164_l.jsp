<%@ page contentType="text/xml;charset=euc-kr"%>
<%@ page import="somo.framework.expt.*, 
				 chosun.ciis.co.post.ds.*,
				 chosun.ciis.co.post.rec.*,
				 java.util.*,
				 chosun.ciis.co.lib.xi.RwXmlWrapper" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : ss_common_1154_l.jsp
* ��� 		 : ���� �����ȣ �˻��� ���� ��ȸ�� ���
* �ۼ����� 	 : 2004-03-05
* �ۼ��� 	 : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� 	 : TrustForm ����
* ������ 	 : Ȳ����
* �������� 	 : 2009-02-10
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    // getting dataset
    CO_L_ZIP_ALLDataSet ds = (CO_L_ZIP_ALLDataSet)request.getAttribute("ds");

    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeHugeStart(root, "gridZip", ds.curcommlist.size());
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		CO_L_ZIP_ALLCURCOMMLISTRecord rec = (CO_L_ZIP_ALLCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("zip1");
			rxw.add_ColVal("zip2");
			rxw.add_ColVal("addrFull");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rec);
		}
		
		//������ �߰�.
		String zip1 = "";
		String zip2 = "";
		StringBuffer sb = new StringBuffer(rec.addr);
		if(rec.zip != null & !"".equals(rec.zip) & rec.zip.length() >= 6){
        	zip1 = rec.zip.substring(0, 3);
        	zip2 = rec.zip.substring(3, 6);
        }
		if(!"".equals(rec.bgnn)){
        	sb.append(" "+rec.bgnn);
        }
        if(!"".equals(rec.endn)){
        	sb.append("~"+rec.endn);
        }
		rxw.add_ColVal(zip1);
		rxw.add_ColVal(zip2);
		rxw.add_ColVal(sb);
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rec, false);
	}
	rxw.makeHugeEnd();

	rxw.flush(out);

%>

