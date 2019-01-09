<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_commun_2640_s.jsp
* ��� 	 	 : �Ǹ�����-��Ž� ����Ʈ���� ��Ȳ���� �� ��� ��Ȳ�󼼺���
* �ۼ����� 	 : 2004-03-04
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
    SL_S_COMM_APT_THRWDataSet ds = (SL_S_COMM_APT_THRWDataSet)request.getAttribute("ds");  // request dataset

	String acc_flg = request.getParameter("accflag");
	String hmflag = request.getParameter("hmflag");


	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//1. ȣ�� ���� ��Ȳ �κ�.
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
	
	//ȣ�� ���Ը�ü ��Ȳ form ����
	int housThrwForm = rxw.add(resTemp, "housThrwForm", "");
	rxw.add(housThrwForm, "bocd", request.getParameter("bocd"));
	
	//ȣ�� ���Ը�ü ��Ȳ
	//������ó�� -> �Ʒ� grid ������ ���.
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
				String val = (String)ht.get(Util.lpad(col-i+1)+Util.lpad(j));
				
				rxw.add(record, "h_" + Util.lpad(j), val==null? "" : val, new StringBuffer().append("hid=\"h_").append(Util.lpad(col-i+1)).append(Util.lpad(j)).append("\" exist=").append(checkInt>0 ? "\"false\"" : "\"true\"").toString());
			}
		}
	}
	
	//2. ���Ը�ü�� ��Ȳ �κ�.
	String dlvstatcd1 = "";
    String dlvstatcd2 = "";
    String dlvstatcd3 = "";

    for(int i=0; i<ds.medicur.size(); i++){
      SL_S_COMM_APT_THRWMEDICURRecord rsltcurRec = (SL_S_COMM_APT_THRWMEDICURRecord)ds.medicur.get(i);

      if( rsltcurRec.getMedicd().equals("110") ) {
        //�����Ϻ�
        dlvstatcd1 = rsltcurRec.getDlvstatcd();
      } else if( rsltcurRec.getMedicd().equals("506") ) {
        //�߾��Ϻ�
        dlvstatcd2 = rsltcurRec.getDlvstatcd();
      } else if( rsltcurRec.getMedicd().equals("504") ) {
        //�����Ϻ�
        dlvstatcd3 = rsltcurRec.getDlvstatcd();
      }
    }
	
	int mediThrwRateForm = rxw.add(resTemp, "mediThrwRateForm", "");
	rxw.add(mediThrwRateForm, "sel_dlvstatcd1", dlvstatcd1);
	rxw.add(mediThrwRateForm, "sel_dlvstatcd2", dlvstatcd2);
	rxw.add(mediThrwRateForm, "sel_dlvstatcd3", dlvstatcd3);
	rxw.add(mediThrwRateForm, "act_remk", ds.getRemk());
	
	int mediThrwRateOutForm = rxw.add(resTemp, "mediThrwRateOutForm", "");
	rxw.add(mediThrwRateOutForm, "ccnt", ds.cho_cnt);
	rxw.add(mediThrwRateOutForm, "crate", ds.cho_rate);
	rxw.add(mediThrwRateOutForm, "jcnt", ds.jung_cnt);
	rxw.add(mediThrwRateOutForm, "jrate", ds.jung_rate);
	rxw.add(mediThrwRateOutForm, "dcnt", ds.dong_cnt);
	rxw.add(mediThrwRateOutForm, "drate", ds.dong_rate);
	rxw.add(mediThrwRateOutForm, "ocnt", ds.other_cnt);
	rxw.add(mediThrwRateOutForm, "orate", ds.other_rate);
	
	//��޻���.
	rxw.makeDataToBulkList(ds, "dlvstatcur", "cicdnm", "cicodeval", "����", "", resTemp, "selDlvstatcd1Combo");
	rxw.makeDataToBulkList(ds, "dlvstatcur", "cicdnm", "cicodeval", "����", "", resTemp, "selDlvstatcd2Combo");
	rxw.makeDataToBulkList(ds, "dlvstatcur", "cicdnm", "cicodeval", "����", "", resTemp, "selDlvstatcd3Combo");
	
	//3. ����Ʈ���� �κ�.
	int thrwHeadForm = rxw.add(resTemp, "thrwHeadForm", "");
	rxw.add(thrwHeadForm, "addrcd", request.getParameter("addrcd"));
	rxw.add(thrwHeadForm, "dongno", request.getParameter("dongno"));
	rxw.add(thrwHeadForm, "sel_regtype1", ds.regtype1);
	rxw.add(thrwHeadForm, "sel_regtype2", ds.regtype2);
	rxw.add(thrwHeadForm, "pyong", ds.getPyong1());		//����
	rxw.add(thrwHeadForm, "hoscnt", ds.getHoscnt1());	//�����
	rxw.add(thrwHeadForm, "mvindt", ds.getMvindt());	//��������
	rxw.add(thrwHeadForm, "zip", ds.getZip());
	rxw.add(thrwHeadForm, "addr", ds.getAddr());
	rxw.add(thrwHeadForm, "invsgpers", ds.getInvsgpers());
	rxw.add(thrwHeadForm, "year", ds.getInvsghhmm().substring(0,4));
	rxw.add(thrwHeadForm, "month", ds.getInvsghhmm().substring(4,6));
	rxw.add(thrwHeadForm, "day", ds.getInvsghhmm().substring(6,8));
	rxw.add(thrwHeadForm, "hour", ds.getInvsghhmm().substring(8,10));
	rxw.add(thrwHeadForm, "minute", ds.getInvsghhmm().substring(10,12));
	
	rxw.makeDataToBulkList(ds, "addrcdcur", "addrnm", "addrcd", "����", "", resTemp, "addrcdCombo");
	rxw.makeDataToBulkList(ds, "dongcur", "dongno", "dongno", "����", "", resTemp, "dongnoCombo");
	rxw.makeDataToBulkList(ds, "regtypecur1", "cicdnm", "cicodeval", "����", "", resTemp, "selRegtype1Combo");
	rxw.makeDataToBulkList(ds, "regtypecur2", "cicdnm", "cicodeval", "����", "", resTemp, "selRegtype2Combo");
	
	int aptThrwTempForm = rxw.add(resTemp, "aptThrwTempForm", "");
	rxw.add(aptThrwTempForm, "accflag", "U");
	
	rxw.flush(out);
%>

