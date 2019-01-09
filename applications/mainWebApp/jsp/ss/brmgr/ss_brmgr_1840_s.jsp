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
    SL_S_COMM_APT_STRUCTDataSet ds = (SL_S_COMM_APT_STRUCTDataSet)request.getAttribute("ds");  // request dataset

	int col = Integer.parseInt(ds.getFlorcnt());
	int row = Integer.parseInt(ds.getFlor_houscnt());
	int li_col = row;
	int li_widthVaule = (li_col*35)+35; // (�÷��ټ�*�÷�������)+���� ��Ÿ���� ��������

	//�ǹ����� ������ ���� ����ִ� ȣ���� �����´�
	String KubunVaue = "";
	for(int kk=0 ; kk < ds.apttypecur.size() ; kk++) {
		SL_S_COMM_APT_STRUCTAPTTYPECURRecord rec = (SL_S_COMM_APT_STRUCTAPTTYPECURRecord)ds.apttypecur.get(kk);
		KubunVaue = KubunVaue+"*"+rec.getTotalrowcol();
	}
	
	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//form ����
	int housThrwForm = rxw.add(resTemp, "housThrwForm", "");
	rxw.add(housThrwForm, "bocd", request.getParameter("bocd"));
	
	int thrwHeadForm = rxw.add(resTemp, "thrwHeadForm", "");
	rxw.add(thrwHeadForm, "pyong", ds.getPyong());		//����
	rxw.add(thrwHeadForm, "hoscnt", ds.getHoscnt());	//�����
	rxw.add(thrwHeadForm, "mvindt", ds.getMvindt());	//��������
	/*StringBuffer sb = new StringBuffer("");				//��������
	String mvindt = ds.getMvindt();
	if(mvindt!=null && !mvindt.equals(""))
		//sb.append(mvindt.substring(0,4)).append("/").append(mvindt.substring(4,6)).append("/").append(mvindt.substring(6));
	rxw.add(thrwHeadForm, "mvindt", sb);*/
	
	//grid ����
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
	
	rxw.flush(out);
%>
