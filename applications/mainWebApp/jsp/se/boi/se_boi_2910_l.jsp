<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.boi.ds.*
	,	chosun.ciis.se.boi.rec.*
	,	chosun.ciis.co.lib.xi.RwXmlWrapper;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_4620_l.jsp
* ��� : ������� ��ȸ
* �ۼ����� : 2016-02-17
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ : 
* �������� :
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>
<%
	SE_BOI_2910_LDataSet ds = (SE_BOI_2910_LDataSet)request.getAttribute("ds");
   
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");

    // ��ȸ ���.
  	//rxw.makeDataToBulk(ds, "curmodlist", resTemp, "listGrid");
    
    //record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
    rxw.makeHugeStart(resTemp, "gridData", ds.curlist.size());

	for(int i=0; i < ds.curlist.size() ; i++)
	{
		SE_BOI_2910_LCURLISTRecord rec = (SE_BOI_2910_LCURLISTRecord)ds.curlist.get(i);
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("check");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rec);
		}

		rxw.add_ColVal("");
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>


