<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.co.cocd.rec.*
	,	chosun.ciis.co.cocd.ds.*
	,	chosun.ciis.co.lib.xi.RwXmlWrapper;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : co_cocd_2000_m.jsp
* ��� : �ſ����ȣ ����ȭ��
* �ۼ����� : 2012-01-00
* �ۼ��� : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	CO_COCD_2030_SDataSet ds = (CO_COCD_2030_SDataSet)request.getAttribute("ds");  // request dataset

    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeHugeStart(root, "newgridZip", ds.curcommlist.size());
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		CO_COCD_2030_SCURCOMMLISTRecord rec = (CO_COCD_2030_SCURCOMMLISTRecord)ds.curcommlist.get(i);
		
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
		StringBuffer sb = new StringBuffer(rec.juso);
		if(rec.zip != null & !"".equals(rec.zip) & rec.zip.length() >= 6){
        	zip1 = rec.zip.substring(0, 3);
        	zip2 = rec.zip.substring(3, 6);
        }
		if(rec.zip != null & !"".equals(rec.zip) & rec.zip.length() == 5){
        	zip1 = rec.zip;
        }        
		//*if(!"".equals(rec.bgnn)){
        //	sb.append(" "+rec.bgnn);
       //}
        //if(!"".equals(rec.endn)){
        //	sb.append("~"+rec.endn);
        //}
		rxw.add_ColVal(zip1);
		rxw.add_ColVal(zip2);
		rxw.add_ColVal(sb);
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rec, false);
	}
	rxw.makeHugeEnd();

	rxw.flush(out);
%>
