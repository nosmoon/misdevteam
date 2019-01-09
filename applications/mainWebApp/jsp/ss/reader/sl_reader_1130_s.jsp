<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : sl_reader_1130_s.jsp
* ���       : ������������(���ڻ󼼺���)
* �ۼ�����   : 2003-11-26
* �ۼ���     : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-19 
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    // DataSet ����
    SL_S_RDR_INFODataSet ds = (SL_S_RDR_INFODataSet)request.getAttribute("ds");

    final int TAB_SIZE = 5; // �� row �� �� ���� ����
    
  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	String basiyymm = request.getParameter("basiyymm");
    basiyymm = (basiyymm == null || basiyymm.length() < 6)? ds.getCurryymm() : basiyymm;
    //basiyymm�� ������ ����.
    rxw.add(resTemp, "basiyymm", basiyymm);
    
	//****** 0. summary (ds ��ü ������)
	rxw.makeDataToBulk(ds, resTemp, "summary");
    
	//****** 1. ���ڻ� ����.
	rxw.makeDataToBulk(ds.readercur.get(0), resTemp, "rdrDetailForm1");
	
	//****** 2. �Ź���������.
	rxw.makeDataToBulk(ds.subscur.get(0), resTemp, "rdrDetailForm2");
	
	//*. ���ڻ� �޺�.
	int detailArea = rxw.add(resTemp, "detailArea", "");
	
	//����. dstccd�ʵ带 label, value�� ��� ���. attribute: cdnm=dstcnm, teamcd=teamcd �� ������ �ִ� ����. �ϴ� xpath�� �����ϴ� ����� ����ϱ� ���� nodeset���� return.
	//rxw.makeDataToBulk(ds, "dstcinfocurRec", detailArea, "dlvdstccdHiddenCombo");
	//readercurRec.dlvdstccd �� ���� default value.
	int dlvdstccdHidden = rxw.add(detailArea, "dlvdstccdHiddenCombo", "");
	int item = rxw.add(dlvdstccdHidden, "item", "");
	rxw.add(item, "label", "");
	rxw.add(item, "value", "");
	rxw.add(item, "cdnm", "");
	SL_S_RDR_INFODSTCINFOCURRecord dstcinfocurRec  = null;
	for(int i=0; i<ds.dstcinfocur.size(); i++){
		dstcinfocurRec = (SL_S_RDR_INFODSTCINFOCURRecord)ds.dstcinfocur.get(i);
		String code = dstcinfocurRec.dstccd;
        String name = dstcinfocurRec.dstccd;
        
        item = rxw.add(dlvdstccdHidden, "item", "");
        rxw.add(item, "label", "<![CDATA[" + name  + "]]>");
    	rxw.add(item, "value", "<![CDATA[" + code  + "]]>");
    	rxw.add(item, "cdnm", "<![CDATA[" + dstcinfocurRec.dstcnm  + "]]>");
    	//rxw.add(item, "teamcd", dstcinfocurRec.teamcd);
    }
	
	//�ּ��ڵ�(������ڵ�). label=addrnm, value=addrcd. attribute: cdnm=addrnm. �����׸� ������ ��ü ����.
	//rxw.makeDataToBulk(ds, "addrcdcur", detailArea, "dlvcdCombo");
	int searchDstc = rxw.add(detailArea, "dlvcdCombo", "");
	item = rxw.add(searchDstc, "item", "");
	rxw.add(item, "label", "");
	rxw.add(item, "value", "");
	rxw.add(item, "cdnm", "");
	SL_S_RDR_INFOADDRCDCURRecord addrcdcurRec = null;
    for(int i=0; i<ds.addrcdcur.size(); i++){
    	addrcdcurRec = (SL_S_RDR_INFOADDRCDCURRecord)ds.addrcdcur.get(i);
        String code = addrcdcurRec.addrcd;
        String name = addrcdcurRec.addrnm;
        
        item = rxw.add(searchDstc, "item", "");
        rxw.add(item, "label", "<![CDATA[" + code+":"+name  + "]]>");
    	rxw.add(item, "value", "<![CDATA[" + code  + "]]>");
    	rxw.add(item, "cdnm", "<![CDATA[" + addrcdcurRec.addrnm  + "]]>");
    }
	
	//��ü���� (radio). 
	rxw.makeDataToBulkList(ds, "paty_clsfcdcur", "cicdnm", "cicodeval", detailArea, "patyClsfcdRadio");
	
	//�ְ�����.
	rxw.makeDataToBulkList(ds, "resitypecdcur", "cicdnm", "cicodeval", "", "", detailArea, "resitypecdCombo");
	
	//�ְű���.
	rxw.makeDataToBulkList(ds, "resiclsfcdcur", "cicdnm", "cicodeval", "", "", detailArea, "resiclsfcdCombo");
	
	//��޹�� (radio).
	rxw.makeDataToBulkList(ds, "dlvmthdcdcur", "cicdnm", "cicodeval", detailArea, "dlvmthdcdRadio");
	
	//�������
	rxw.makeDataToBulkList(ds, "thrwplaccdcur", "cicdnm", "cicodeval", "", "", detailArea, "thrwPlacCombo");
	
	//����������޸�ü 
	int medicd = rxw.add(detailArea, "medicdCombo", "");
	item = rxw.add(medicd, "item", "");
	rxw.add(item, "label", "");
	rxw.add(item, "value", "");
	rxw.add(item, "subsuprc", "");
	SL_S_RDR_INFOBOMEDICDCURRecord bomedicdcurRec = null;
	for(int i=0; i<ds.bomedicdcur.size(); i++){
		bomedicdcurRec = (SL_S_RDR_INFOBOMEDICDCURRecord)ds.bomedicdcur.get(i);
		String code = bomedicdcurRec.medicd;
        String name = bomedicdcurRec.cicdnm;
        int subsuprc = bomedicdcurRec.subsuprc;
        
        item = rxw.add(medicd, "item", "");
        rxw.add(item, "label", "<![CDATA[" + name  + "]]>");
    	rxw.add(item, "value", "<![CDATA[" + code  + "]]>");
    	rxw.add(item, "subsuprc", "<![CDATA[" + subsuprc  + "]]>");
    	//rxw.add(item, "medinm", name);
    }
	
	//����μ�.
	rxw.makeDataToBulkList(ds, "freeclsfcdcur", "cicdnm", "cicodeval", "", "", detailArea, "rptvfreeclsfCombo");
	
	//���ݹ��.
	rxw.makeDataToBulkList(ds, "clamtmthdcdcur", "cicdnm", "cicodeval", detailArea, "clamtmthdcdCombo");
	
	//Ȯ������.
	rxw.makeDataToBulkList(ds, "rdr_extntypecdcur", "cicdnm", "cicodeval", detailArea, "rdrExtntypecdCombo");

	//��������
	rxw.makeDataToBulkList(ds, "suspresncdcur", "cicdnm", "cicodeval", "", "", detailArea, "rptvSuspresncdCombo");
	
	//��ü���ù�ư ó�� ������.
	int mediForm = rxw.add(resTemp, "mediForm", "");
	rxw.add(mediForm, "medicd", Util.checkString(request.getParameter("medicd")));
	rxw.makeDataToBulk(ds, "medicur", mediForm, "medicurData");
	
	//****** 3. �Աݳ�������.
	//�Աݳ��� ����ȸ�� ���� basiyymm ������ ����.
	rxw.add(resTemp, "medicd", ((SL_S_RDR_INFOMEDICURRecord)ds.medicur.get(0)).getMedicd());
	
	//rcpm ���� ������.
	int rcpmData = rxw.add(resTemp, "rcpmData", "");
	
	//���ϸ��� caption
	rxw.makeDataToBulk(ds.milgcur.size()>0 ? ds.milgcur.get(0) : null, rcpmData, "milgcurData");
	
	//�Աݳ���
	int clamtynms = rxw.add(rcpmData, "clamtynms", "");
	rxw.add(clamtynms, "prevclamtynmsTitle", (Integer.parseInt(ds.getCurryymm().substring(0, 4)) - 1));
	rxw.add(clamtynms, "currclamtynmsTitle", (Integer.parseInt(ds.getCurryymm().substring(0, 4))));
	//����
	StringBuffer sb = new StringBuffer();
	SL_S_RDR_INFOBRFCURRecord 	brfcurRec   = null;
    SL_S_RDR_INFOBRFCUR2Record 	brfcur2Rec 	= null;
    String[] prev_clamtynms = new String[12]; 	//���⵵ ���� ���� ���
    String[] curr_clamtynms = new String[12]; 	//�ݳ⵵ ���� ���� ���
    String prev_start_yymm = (Integer.parseInt(ds.getCurryymm().substring(0, 4)) - 1) + "01";
    String curr_start_yymm = (Integer.parseInt(ds.getCurryymm().substring(0, 4))) + "01";
    Hashtable prev_yymms = new Hashtable();  //���⵵ ���ݿ�� Ŀ���� ���� ����
    for(int i=0; i<ds.brfcur.size(); i++){
        brfcurRec 	= (SL_S_RDR_INFOBRFCURRecord)ds.brfcur.get(i);
        prev_yymms.put(brfcurRec.subsmappli, brfcurRec.clamtynm);
    }
    Hashtable curr_yymms = new Hashtable();  //�ݳ⵵ ���ݿ�� Ŀ���� ���� ����
    for(int i=0; i<ds.brfcur2.size(); i++){
        brfcur2Rec 	= (SL_S_RDR_INFOBRFCUR2Record)ds.brfcur2.get(i);
        curr_yymms.put(brfcur2Rec.subsmappli, brfcur2Rec.clamtynm);
    }
    long i_yymm = 0;
    String s_yymm = "";
    for(int i=0; i<12; i++){
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
	
    SL_S_RDR_INFOCLAMTCURRecord clamtcurRec = null;
    Hashtable clamts = new Hashtable(); // �Ա�(����)���� Ŀ���� ���ڵ带 Hashtable�� ��´�.(�Ź��������ݿ� ���ڵ尡 �����ϴ� ������)

    for(int i=0; i<ds.clamtcur.size(); i++){
        clamtcurRec = (SL_S_RDR_INFOCLAMTCURRecord)ds.clamtcur.get(i);
        clamts.put(clamtcurRec.subsmappli, clamtcurRec);
    }

    SimpleDateFormat mm_format = new SimpleDateFormat("MM");   // �� ����(01)
    SimpleDateFormat yymm = new SimpleDateFormat("yyyyMM");	   // ���� ����(200301)
    curr_month.add(Calendar.MONTH, -10); // �Աݳ����� ���� ���� = (�Աݳ��� �� ���� - 10)

    int curryymm_idx = 7; //�Աݳ������̺�(rcpm_his_list_id) ������ ����� row �ε����� ������ ����
    StringBuffer sb_yymm = new StringBuffer(); // "200312" ������ ��
    for(int i=0; i<11; i++){
        sb.delete(0, sb.length()); //�� ��Ʈ�� ���� �ʱ�ȭ
        sb_yymm.delete(0, sb_yymm.length()); //���� ��Ʈ�� ���� �ʱ�ȭ

        sb = mm_format.format(curr_month.getTime(), sb, new FieldPosition(Calendar.YEAR));
        sb_yymm = yymm.format(curr_month.getTime(), sb_yymm, new FieldPosition(Calendar.YEAR));

        ////����� �ε����� ���Ѵ�
        if(ds.curryymm.equals(sb_yymm.toString())) curryymm_idx = i + 1;

        if(clamts.get(sb_yymm.toString()) != null ){
            clamtcurRec = (SL_S_RDR_INFOCLAMTCURRecord)clamts.get(sb_yymm.toString());
            
            rxw.add_ColVal(sb_yymm.toString());
        	rxw.add_ColVal(sb.toString());
        	rxw.add_ColVal(clamtcurRec.recpdt);
        	rxw.add_ColVal(clamtcurRec.clamamt);
        	rxw.add_ColVal(clamtcurRec.clamt);
        	rxw.add_ColVal(clamtcurRec.rcpmclsfnm + (("050".equals(clamtcurRec.rcpmclsfcd))? "S":""));
        	rxw.add_ColVal(clamtcurRec.rcpmclsfcd);
        	rxw.add_RowVal(clamtcurRec.clamtmthdcd);
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
