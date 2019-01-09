<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : ss_brmgr_1885_p.jpg
* ��� 	 	 : �Ǹű�-�����濵-����������-����Ʈ������Ȳ-���������系�� �󼼺��� �˾�
* �ۼ����� 	 : 2006-01.26
* �ۼ��� 	 : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-02-23
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	// dataset �ν��Ͻ� ����κ�
    SL_S_COMM_APT_THRWDataSet ds = (SL_S_COMM_APT_THRWDataSet)request.getAttribute("ds");  // request dataset

	String acc_flg = request.getParameter("accflag");
	String hmflag = request.getParameter("hmflag");
    String mvindt = ds.getMvindt();
    String qsearch_code = request.getParameter("bocd") + "-" + request.getParameter("addrcd") + "-" + Util.Uni2Ksc(Util.Uni2Ksc(request.getParameter("dongno")));

	int col = Integer.parseInt(ds.getFlorcnt());
	int row = Integer.parseInt(ds.getFlor_houscnt());
	int li_col = row;
	int li_widthVaule = (li_col*35)+35; // (�÷��ټ�*�÷�������)+���� ��Ÿ���� ��������

	//�ǹ����� ������ ���� ����ִ� ȣ���� �����´�
	String KubunVaue = "";
	for(int kk=0 ; kk < ds.apttypecur.size() ; kk++) {
		SL_S_COMM_APT_THRWAPTTYPECURRecord rec = (SL_S_COMM_APT_THRWAPTTYPECURRecord)ds.apttypecur.get(kk);
		KubunVaue = KubunVaue+"*"+rec.getTotalrowcol();
	}

    //�������� ����
    if( !mvindt.equals("") ) {
      mvindt = mvindt.substring(0,4) + "/" + mvindt.substring(4,6) + "/" + mvindt.substring(6);
    } else {
      mvindt = "";
    }
    
    //TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//master data.
	rxw.makeDataToBulk(ds, resTemp, "master");
	
	//��ϱ����޺�.
	rxw.makeDataToList(ds, "regtypecur1", "cicdnm", "cicodeval", "����", "", resTemp, "regtype1Combo");
	rxw.makeDataToList(ds, "regtypecur2", "cicdnm", "cicodeval", "����", "", resTemp, "regtype2Combo");
	
	//���Ը�ü�� ��Ȳ.
	rxw.makeHugeStart(resTemp, "statGrid", ds.medicur.size());
	for(int i=0; i < ds.medicur.size(); i++)
	{
		SL_S_COMM_APT_THRWMEDICURRecord rsltcurRec = (SL_S_COMM_APT_THRWMEDICURRecord)ds.medicur.get(i);
        
		//title �߰�.
		if(i == 0)
		{ 
			rxw.add_ColVal("dlvstatcd_t");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rsltcurRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal((rsltcurRec.medicd).equals("110") || (rsltcurRec.medicd).equals("506") || (rsltcurRec.medicd).equals("504") ? rsltcurRec.dlvstatcd : "");
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rsltcurRec, false);
	}
	rxw.makeHugeEnd();
	//���Ը�ü�� ��Ȳ-��޻����޺�
	rxw.makeDataToList(ds, "dlvstatcur", "cicdnm", "cicodeval", "����", "", resTemp, "dlvstatcdCombo");
	
	//ȣ�� ���Ը�ü ��Ȳ
	//������ó��.
	Hashtable ht = new Hashtable();
	for(int i=0; i<ds.houscur.size(); i++)
	{
    	SL_S_COMM_APT_THRWHOUSCURRecord rsltcurRec = (SL_S_COMM_APT_THRWHOUSCURRecord)ds.houscur.get(i);
    	
    	String val = (String)ht.get(rsltcurRec.flor+rsltcurRec.hous);
    	if(val == null || val.equals(""))
    		val = rsltcurRec.medicdnm;
    	else
    		val += "," + rsltcurRec.medicdnm;
    	
    	ht.put(rsltcurRec.flor+rsltcurRec.hous, val);
	}
	//ȣ�� ���翩�θ� attribute�� �����ϱ� ���� xml���·� �����Ѵ�.
	/*rxw.makeHugeStart(resTemp, "listGrid");
	for(int i=0; i<=row; i++)
	{
		if(i==0)
			rxw.add_ColVal("��");
		else if(i==row)
			rxw.add_RowVal(i+"ȣ");
		else
			rxw.add_ColVal(i+"ȣ");
	}*/
	int listGrid = rxw.add(resTemp, "listGrid", "");
	for(int i=1; i<=col; i++)
	{
		int record = rxw.add(listGrid, "record", "");
		for(int j=0; j<=row; j++)
		{
			if(j==0)
				rxw.add(record, "flore", (col-i+1) + "��");
			else
			{
				DecimalFormat dFormat = new DecimalFormat("0000");
				String ii = dFormat.format(col-i+1);
				String jj = dFormat.format(j);
				String hh = ii+","+jj;
				int checkInt = KubunVaue.lastIndexOf(hh);
				String val = (String)ht.get(Util.lpad(col-i+1)+Util.lpad(j));
				
				rxw.add(record, "h_" + Util.lpad(j), val==null? "" : val, "exist=" + (checkInt>0 ? "\"false\"" : "\"true\""));
			}
		}
	}
	//System.out.println(rxw.getXml());
	rxw.flush(out);

%>

