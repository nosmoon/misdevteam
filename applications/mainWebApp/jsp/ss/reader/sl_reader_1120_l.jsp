<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : sl_reader_1120_l.jsp
* ���       : ������������(���ڸ�ϰ˻�)
* �ۼ�����   : 2003-12-16
* �ۼ���     : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-18
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%--DataSet �� Request�� ó�� �Ѵ�. --%>
<%
    //request
    long curr_page_no = ((String)request.getParameter("pageno") == null)? 1 : Long.parseLong(request.getParameter("pageno"));
    long records_per_page = ((String)request.getParameter("pagesize") == null)? 4 : Long.parseLong(request.getParameter("pagesize"));

    long start_no = ((curr_page_no - 1) * records_per_page)  + 1;

    //getting dataset
    SL_L_READERDataSet ds = (SL_L_READERDataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "curr_page_no", curr_page_no);
	rxw.add(resTemp, "total_records", ds.totalcnt);
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "records_per_page", records_per_page);
	
	rxw.makeHugeStart(resTemp, "readerListGrid", ds.readercur.size());
	String[] tempAddr = new String[5];
    SL_L_READERREADERCURRecord rec = null;
    for(int i=0, j=0; i<ds.readercur.size(); i++){
        rec = (SL_L_READERREADERCURRecord)ds.readercur.get(i);
        tempAddr[0] = rec.addrnm.trim();
        tempAddr[1] = rec.dlvdtlsaddr.trim();
        tempAddr[2] = rec.dlvdong.trim();
        tempAddr[3] = rec.dlvser_no.trim();
        tempAddr[4] = rec.dlvbnji.trim();
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("rdr_no");
			rxw.add_ColVal("dlv");
			rxw.add_ColVal("rdrnm");
			rxw.add_ColVal("rdrptph_no");
			rxw.add_ColVal("rdrtel_no");
			rxw.add_ColVal("mil");
			rxw.add_ColVal("addr");
			rxw.add_ColVal("realsubsamt");
			rxw.add_RowVal("dlvqty");
			//������ trustform datagrid �⺻ ��� ���.
			//������ �ʵ�� �ڵ� ����.
			//rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal(rec.rdr_no);
		rxw.add_ColVal(Util.getChainStr(rec.dlvdstccd, rec.dlvno, rec.dlvintvno, "-"));
		rxw.add_ColVal(rec.rdrnm);
		rxw.add_ColVal(rec.rdrptph_no1 +"-" +rec.rdrptph_no2 +"-" + rec.rdrptph_no3);
		rxw.add_ColVal(Util.getChainStr(rec.rdrtel_no2 ,rec.rdrtel_no3,"","-"));
		rxw.add_ColVal(rec.mil);
		rxw.add_ColVal(Util.getConcatString(tempAddr, " "));
		rxw.add_ColVal(rec.realsubsamt);
		rxw.add_RowVal(rec.dlvqty);
		//������ �ʵ� �ڵ�����.
		//rxw.makeRecordToBulk(curcommlistRec, false);
	}
	rxw.makeHugeEnd();
	//System.out.println(rxw.getXml());
	rxw.flush(out);
%>

