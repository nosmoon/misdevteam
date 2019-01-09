<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_reader_1220_l.jsp
* ��� 		 : ������������(�Աݳ������)
* �ۼ����� 	 : 2003-12-22
* �ۼ��� 	 : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-27
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    // getting dataset
    SL_L_RDRCLAMTHSTYDataSet ds = (SL_L_RDRCLAMTHSTYDataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");

	String rdr_no = request.getParameter("rdr_no");
    String medicd = request.getParameter("medicd");
    String basiyymm  = request.getParameter("basiyymm");
    basiyymm = (basiyymm == null || basiyymm.length() < 6)? ds.getCurryymm() : basiyymm;
    //request data. �Աݳ��� ��˻��� ����.
    rxw.add(resTemp, "basiyymm", basiyymm);
    rxw.add(resTemp, "medicd", medicd);
    
    //ds ��ü ������. �Աݳ��� ��˻��� ����.
    rxw.makeDataToBulk(ds, resTemp, "summary");
    
	int rcpmData = rxw.add(resTemp, "rcpmData", "");
	
	//�Աݳ���
	int clamtynms = rxw.add(rcpmData, "clamtynms", "");
	rxw.add(clamtynms, "prevclamtynmsTitle", (Integer.parseInt(ds.getCurryymm().substring(0, 4)) - 1));
	rxw.add(clamtynms, "currclamtynmsTitle", (Integer.parseInt(ds.getCurryymm().substring(0, 4))));
	//����
	StringBuffer sb = new StringBuffer();
	SL_L_RDRCLAMTHSTYBRFCURRecord 	brfcurRec   = null;
    SL_L_RDRCLAMTHSTYBRFCUR2Record 	brfcur2Rec 	= null;

    String[] prev_clamtynms = new String[12]; 	//���⵵ ���� ���� ���
    String[] curr_clamtynms = new String[12]; 	//�ݳ⵵ ���� ���� ���
    String prev_start_yymm = (Integer.parseInt(ds.getCurryymm().substring(0, 4)) - 1) + "01";
    String curr_start_yymm = (Integer.parseInt(ds.getCurryymm().substring(0, 4))) + "01";

    Hashtable prev_yymms = new Hashtable();  	//���⵵ ���ݿ�� Ŀ���� ���� ����
    for(int i=0; i<ds.brfcur.size(); i++){
        brfcurRec 	= (SL_L_RDRCLAMTHSTYBRFCURRecord)ds.brfcur.get(i);
        prev_yymms.put(brfcurRec.subsmappli, brfcurRec.clamtynm);
    }
    Hashtable curr_yymms = new Hashtable();  	//�ݳ⵵ ���ݿ�� Ŀ���� ���� ����
    for(int i=0; i<ds.brfcur2.size(); i++){
        brfcur2Rec 	= (SL_L_RDRCLAMTHSTYBRFCUR2Record)ds.brfcur2.get(i);
        curr_yymms.put(brfcur2Rec.subsmappli, brfcur2Rec.clamtynm);
    }
    long i_yymm = 0;
    String s_yymm = "";
  	for(int i=0; i<12; i++){ // 12���� ������ ���鼭 �ش� ���п� ���� ���ݹ��(����)�� ����
        i_yymm = Integer.parseInt(prev_start_yymm) + i;
    	if(prev_yymms.get(i_yymm  + "") == null){
        	prev_clamtynms[i] = "-";
        }else{
            prev_clamtynms[i] = (String)prev_yymms.get(i_yymm + "");
        }
    }
  	for(int i=0; i<12; i++){
		i_yymm = Integer.parseInt(curr_start_yymm) + i;
    	if(curr_yymms.get(i_yymm  + "") == null){
        	curr_clamtynms[i] = "-";
        }else{
            curr_clamtynms[i] = (String)curr_yymms.get(i_yymm + "");
        }
  	}
  	sb.delete(0, sb.length());
    for(int i=0; i<12; i++){
    	sb.append(prev_clamtynms[i]);
    }
    rxw.add(clamtynms, "prevclamtynms", sb.toString());
    //���
    sb.delete(0, sb.length());
    for(int i=0; i<12; i++){
    	sb.append(curr_clamtynms[i]);
    }
    rxw.add(clamtynms, "currclamtynms", sb.toString());
    //�̼�.
    rxw.add(rcpmData, "rcpmunrecp", ds.getUn_clamt_mm() + "/" + ds.getUn_clamt());
    
    //�Աݳ������
    // �Աݳ��� [yyyy,MM,dd]~[yyyy,MM,dd] ���ϱ�
    int year = Integer.parseInt(basiyymm.substring(0,4));
    int month = Integer.parseInt(basiyymm.substring(4,6))-1;
    Calendar curr_month = new GregorianCalendar(year,month,1); //���
    SimpleDateFormat yyyymm_format = new SimpleDateFormat("yyyy/MM"); // ��� ����
    sb.delete(0, sb.length()); // initializing StringBuffer
    curr_month.add(Calendar.MONTH, -7); // �Աݳ����� ���� ���� = (��� - 7)
    sb = yyyymm_format.format(curr_month.getTime(), sb, new FieldPosition(Calendar.YEAR));
    sb.append("~");
    curr_month.add(Calendar.MONTH, 10);  // �Աݳ����� �� ���� = (���ۿ� + 10)
    sb = yyyymm_format.format(curr_month.getTime(), sb, new FieldPosition(Calendar.YEAR));
    rxw.add(rcpmData, "rcpmyymm", sb.toString());
    
    //�Աݸ��
    rxw.makeHugeStart(resTemp, "rcpmListGrid");
    rxw.add_ColVal("key");
	rxw.add_ColVal("subsmappli");
	rxw.add_ColVal("procdt");
	rxw.add_ColVal("clamamt");
	rxw.add_ColVal("clamt");
	rxw.add_ColVal("rcpmclsfnm");
	rxw.add_ColVal("rcpmclsfcd");
	rxw.add_RowVal("clamtmthdcd");
	
	SL_L_RDRCLAMTHSTYRSLTCURRecord rsltcurRec = null;
    Hashtable clamts = new Hashtable(); // �Ա�(����)���� Ŀ���� ���ڵ带 Hashtable�� ��´�.

    for(int i=0; i<ds.rsltcur.size(); i++){
        rsltcurRec = (SL_L_RDRCLAMTHSTYRSLTCURRecord)ds.rsltcur.get(i);
        clamts.put(rsltcurRec.subsmappli, rsltcurRec);
    }

    SimpleDateFormat mm_format = new SimpleDateFormat("MM");   // �� ����(01)
    SimpleDateFormat yymm = new SimpleDateFormat("yyyyMM");	   // ���� ����(200301)
    curr_month.add(Calendar.MONTH, -10); // �Աݳ����� ���� ���� = (�Աݳ��� �� ���� - 10)

	int curryymm_idx = 0; //�Աݳ������̺�(rcpm_his_list_id) ������ ����� row �ε����� ������ ����
    StringBuffer sb_yymm = new StringBuffer(); // "200312" ������ ��
    for(int i=0; i<11; i++){
        sb.delete(0, sb.length()); //�� ��Ʈ�� ���� �ʱ�ȭ
        sb_yymm.delete(0, sb_yymm.length()); //���� ��Ʈ�� ���� �ʱ�ȭ

        sb = mm_format.format(curr_month.getTime(), sb, new FieldPosition(Calendar.YEAR));
        sb_yymm = yymm.format(curr_month.getTime(), sb_yymm, new FieldPosition(Calendar.YEAR));

        ////����� �ε����� ���Ѵ�
        if(ds.curryymm.equals(sb_yymm.toString())) curryymm_idx = i + 1;

        if(clamts.get(sb_yymm.toString()) != null ){
            rsltcurRec = (SL_L_RDRCLAMTHSTYRSLTCURRecord)clamts.get(sb_yymm.toString());
            
            rxw.add_ColVal(sb_yymm.toString());
        	rxw.add_ColVal(sb.toString());
        	rxw.add_ColVal(rsltcurRec.recpdt);
        	rxw.add_ColVal(rsltcurRec.clamamt);
        	rxw.add_ColVal(rsltcurRec.clamt);
        	rxw.add_ColVal(rsltcurRec.rcpmclsfnm + (("050".equals(rsltcurRec.rcpmclsfcd))? "S":""));
        	rxw.add_ColVal(rsltcurRec.rcpmclsfcd);
        	rxw.add_RowVal(rsltcurRec.clamtmthdcd);
        }
        else
        {
        	rxw.add_ColVal(sb_yymm.toString());
        	rxw.add_ColVal(sb.toString());
        	rxw.add_ColVal("");
        	rxw.add_ColVal("");
        	rxw.add_ColVal("");
        	rxw.add_ColVal("");
        	rxw.add_ColVal("");
        	rxw.add_RowVal("");
        }
        curr_month.add(Calendar.MONTH, 1); //��Ͽ� ���� ������ ���а��� 1���� ����
    }
    
    rxw.makeHugeEnd();
    
	//System.out.println(rxw.getXml());
	rxw.flush(out);
	
%>
