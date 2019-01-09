<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_commun_2630_s.jsp
* ��� 	 	 : �Ǹ�����-��Ž� ����Ʈ���� ��Ȳ���� �� ��� ����Ʈ��������
* �ۼ����� 	 : 2004-03-02
* �ۼ��� 	 : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-14
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%

    // dataset �ν��Ͻ� ����κ�
    SL_S_COMM_APT_QSEARCHDataSet ds = (SL_S_COMM_APT_QSEARCHDataSet)request.getAttribute("ds");  // request dataset

	int col = Integer.parseInt(ds.getFlorcnt());
	int row = Integer.parseInt(ds.getFlor_houscnt());
	int li_col = row;
	int li_widthVaule = (li_col*35)+35; // (�÷��ټ�*�÷�������)+���� ��Ÿ���� ��������
    int nSessionCheck = 0;
    int page_rec = 5;
    String strQsearch = request.getParameter("qsearch");
    String strReadonly = "";

    if( strQsearch.length() <= 5 ) {
      strQsearch = strQsearch + "000000";
    }

    if( col == 0 && row == 0 ) {
      col = 5;
      row = 5;
      strReadonly = "readonly";
    } else {
      strReadonly = "";
    }

    String applySessionStr = (String)request.getParameter("applySession"); // session ���뿩��

    String addrcd = strQsearch.substring(5,8);
    String dongno = strQsearch.substring(8);

//    String addrcd = request.getParameter("qsearch").substring(5,8);
//    String dongno = request.getParameter("qsearch").substring(8);


	//�ǹ����� ������ ���� ����ִ� ȣ���� �����´�
	String KubunVaue = "";
	for(int kk=0 ; kk < ds.apttypecur.size() ; kk++) {
		SL_S_COMM_APT_QSEARCHAPTTYPECURRecord rec = (SL_S_COMM_APT_QSEARCHAPTTYPECURRecord)ds.apttypecur.get(kk);
		KubunVaue = KubunVaue+"*"+rec.getTotalrowcol();
	}
	
	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//ȣ�� ���Ը�ü ��Ȳ form ����
	int housThrwForm = rxw.add(resTemp, "housThrwForm", "");
	rxw.add(housThrwForm, "bocd", request.getParameter("bocd"));
	rxw.add(housThrwForm, "gridReadOnly", strReadonly);
	
	//ȣ�� ���Ը�ü ��Ȳ grid ����
	int housThrwGrid = rxw.add(resTemp, "housThrwGrid", "");
	for(int i=1; i<=col; i++)
	{
		int record = rxw.add(housThrwGrid, "record", "", "floor=\""+(col-i+1)+"\"");
		for(int j=0; j<=row; j++)
		{
			if(j==0)
				rxw.add(record, "floor", (col-i+1) + "��");
			else
			{
				DecimalFormat dFormat = new DecimalFormat("0000");
				String ii = dFormat.format(col-i+1);
				String jj = dFormat.format(j);
				String hh = ii+","+jj;
				int checkInt = KubunVaue.lastIndexOf(hh);
				//String val = (String)ht.get(Util.lpad(col-i+1)+Util.lpad(j));	//���������� �������� �ʴ´�.
				
				rxw.add(record, "h_" + Util.lpad(j), "", new StringBuffer().append("hid=\"h_").append(Util.lpad(col-i+1)).append(Util.lpad(j)).append("\" exist=").append(checkInt>0 ? "\"false\"" : "\"true\"").toString());
			}
		}
	}
	
	//����Ʈ���� �κ�.
	int thrwHeadForm = rxw.add(resTemp, "thrwHeadForm", "");
	rxw.add(thrwHeadForm, "bocd", ds.getBocd());
	rxw.add(thrwHeadForm, "pyong", ds.getPyong());		//����
	rxw.add(thrwHeadForm, "hoscnt", ds.getHoscnt());	//�����
	rxw.add(thrwHeadForm, "mvindt", ds.getMvindt());	//��������
	int thrwHeadFormEx = rxw.add(resTemp, "thrwHeadFormEx", "");	//session�� ���� �����Ǵ� ���̹Ƿ� ����.
	rxw.add(thrwHeadFormEx, "addrcd", addrcd);
	rxw.add(thrwHeadFormEx, "dongno", dongno);
	rxw.makeDataToBulkList(ds, "addrcdcur", "addrnm", "addrcd", "����", "", resTemp, "addrcdCombo");
	rxw.makeDataToBulkList(ds, "dongcur", "dongno", "dongno", "����", "", resTemp, "dongnoCombo");
	
	//��-���� �κ�.
	int boSearchForm = rxw.add(resTemp, "boSearchForm", "");
	rxw.add(boSearchForm, "common_deptcd", ds.getDeptcd());
	rxw.add(boSearchForm, "common_areacd", ds.getAreacd());
	rxw.add(boSearchForm, "deptcd", ds.getDeptcd());
	rxw.add(boSearchForm, "areacd", ds.getAreacd());
	rxw.add(boSearchForm, "bolist", ds.getBocd());
	rxw.add(boSearchForm, "qsearch", ds.getBocd() + addrcd + dongno);
	//����. arealist_temp �� �ƴ� arealist�� �ٷ� ����.
	if("true".equals(applySessionStr)){

		// session�� �����ڵ�, ������ ������� <option>�� �����Ѵ�.
		int comboArea  = rxw.add(resTemp, "arealist" , "");
    
		String areanm = (String)session.getAttribute("areanm");
		ArrayList areanmList = getTokens(areanm, "^");		// ������ "^"

		if(areanmList.size() == 0){	// �����ڵ�,������ ������ ����.
			// �����ڵ�,�������� �������� ����. ����ó��
		}else if(areanmList.size() == 1){	// �����ڵ�,������ ������ �ϳ�.
	
			String areacdnm = (String)areanmList.get(0);
			ArrayList areacdnmList = getTokens(areacdnm, "|");	// ������ "|"
			if(areacdnmList.size() == 2){
				nSessionCheck = 1;
				//rxw.addSelectItem(comboArea, (String)areacdnmList.get(1), (String)areacdnmList.get(0));
				rxw.addSelectItem(comboArea, "record", "area_nm", "area_cd", (String)areacdnmList.get(1), (String)areacdnmList.get(0));
			}else{
				// �����ڵ�, ������ ���� ���� ����. ����ó��.
			}
		}else{	// �����ڵ�,������ ������ ������.
	
			//rxw.addSelectItem(comboArea, "��ü", "");
			rxw.addSelectItem(comboArea, "record", "area_nm", "area_cd", "��ü", "");
			for(int i=0; i<areanmList.size(); i++){
				String areacdnm = (String)areanmList.get(i);
				ArrayList areacdnmList = getTokens(areacdnm, "|");	// ������ "|"
	
				if(areacdnmList.size() == 2){
	
					// SS_L_JIYEOGCDDataSet ��ü�� curcommlist�� ���Ե� SS_L_JIYEOGCDCURCOMMLISTRecord ��ü�� areacd�� ���Ͽ� ������ �����ڵ� ��Ͽ� �����ϴ� �׸� ����Ѵ�.
					for(int j=0; j<ds.arealist.size(); j++){
						SL_S_COMM_APT_QSEARCHAREALISTRecord record = (SL_S_COMM_APT_QSEARCHAREALISTRecord)ds.arealist.get(j);
	
						if(areacdnmList.get(0).equals(record.areacd)){
							nSessionCheck = 1;
							//rxw.addSelectItem(comboArea, (String)areacdnmList.get(1), (String)areacdnmList.get(0));
							rxw.addSelectItem(comboArea, "record", "area_nm", "area_cd", (String)areacdnmList.get(1), (String)areacdnmList.get(0));
						}
					}
	
				}else{
					// �����ڵ�, ������ ���� ���� ����. ����ó��
				}
			}
		}

	}
    else
    {
    	rxw.makeDataToList(ds, "arealist", "areanm", "areacd", "��ü", "", resTemp, "arealist", "record", "area_nm", "area_cd");
    }
	
	//����.
	rxw.makeDataToBulkList(ds, "bolist", "bonm", "bocd", "��ü", "", resTemp, "codelist", "record", "cdnm", "cd", false);
	
	//��ȸ form.
	int rdrsrchListForm = rxw.add(resTemp, "rdrsrchListForm", "");
	rxw.add(rdrsrchListForm, "bocd", ds.getBocd());
	
	//���縮��Ʈ.
	rxw.makeDataToBulkList(ds, "addrcdcur", "addrnm", "addrcd", "��ü", "", resTemp, "thrwAddrcdCombo");
	
	//ȭ�� ���� �ɼ�.
	rxw.add(resTemp, "nSessionCheck", nSessionCheck);
	
	rxw.flush(out);
%>
