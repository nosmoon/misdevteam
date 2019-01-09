<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_1400_a.jsp
* ��� : �������� �Խ��� �Ǹű� �ʱ�ȭ��
* �ۼ����� : 2003-12-03
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-03-19
* ������ϸ� : ss_share_1400_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%-- dataset �ν��Ͻ� ����κ�--%>
<%
    SS_L_INFOEXG_INITDataSet ds = (SS_L_INFOEXG_INITDataSet)request.getAttribute("ds");    // request dataset

    String js_fn_nm = request.getParameter("js_fn_nm");
    if(js_fn_nm == null) {js_fn_nm = "page_move";}
    String pageno = request.getParameter("pageno");
    if(pageno == null) {pageno = "1";}
    String pagesize = (String)request.getAttribute("pagesize");
    if(pagesize == null) {pagesize = "5000";} //{pagesize = "10";}

    applySession = true;	// ���� ���� ����
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int codeData = rxw.add(root, "codeData", "");
    
    rxw.add(codeData, "applySession", String.valueOf(applySession));
    rxw.add(codeData, "pageno", pageno);
    rxw.add(codeData, "page_move", js_fn_nm);    
    rxw.add(codeData, "pagesize", pagesize);
    
	//�μ�(��)��� ǥ��.
	int comboTeam = rxw.add(codeData, "teamlist" , "");
	writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");

	rxw.makeHugeStart(codeData, "listGrid", ds.infoexglist.size());
	for(int i=0 ; i< ds.infoexglist.size(); i++) {
        SS_L_INFOEXG_INITINFOEXGLISTRecord rec = (SS_L_INFOEXG_INITINFOEXGLISTRecord)ds.infoexglist.get(i);
        
        if(i == 0){
        	rxw.add_ColVal("titl_f");
			rxw.add_ColVal("regdt_f");
			rxw.makeRecordToBulkTitle(rec);
		}
        
        if(rec.answerseq == 0){
        	rxw.add_ColVal(Util.checkString(rec.titl));
        	rxw.add_ColVal(Util.Timestamp2Str(rec.regdt));
		}else if(rec.answerlevl == 1){
			rxw.add_ColVal(Util.checkString(rec.titl));
			rxw.add_ColVal(Util.Timestamp2Str(rec.regdt));
		}else{
			int imgsize = 8 * rec.answerlevl;
			rxw.add_ColVal(Util.checkString(rec.titl));
			rxw.add_ColVal(Util.Timestamp2Str(rec.regdt));
		}
        //rxw.add_ColVal(Util.Timestamp2Str(rec.regdt));
        rxw.makeRecordToBulk(rec, false);
	}
	rxw.makeHugeEnd(); 
	
	rxw.flush(out);

%>