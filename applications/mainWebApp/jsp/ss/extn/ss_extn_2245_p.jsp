<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%

    applySession = true;	// ���� ���� ����

	int jobcd = 0;
	String title;
	String filename;
	String 	yymm = request.getParameter("closmm");
	StringBuffer sb = new StringBuffer("");
	
	SL_L_CLOS_REPORTDataSet ds = (SL_L_CLOS_REPORTDataSet)request.getAttribute("ds");
	
	if( ds.curextncloslist.size() > 0 ) {
		jobcd	 = 0;
		title	 = "Ȯ���������";
		filename = "EXTNCLOS_";
	} else if( ds.cursuspcloslist.size() > 0 ) {
		jobcd    = 1;
		title    = "�������ڸ��";
		filename = "BOSUSPCLOS_";
	} else if( ds.curbocloscloslist.size() > 0 ) {
		jobcd    = 2;
		title    = "��������������";
		filename = "DSTCBOCLOS_";
	} else {
		jobcd    = -1;
		title    = "�ڷᰡ �������� �ʽ��ϴ�.";
		filename = "";
	}


    	/*
	System.out.println( "result.........1");
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int tempData = rxw.add(root, "tempData", "");
	int result = rxw.add(tempData, "jobrslt", jobcd);
	int resultmsg = rxw.add(tempData, "jobmsg", title);
	rxw.flush(out);	



	response.reset();
	response.setHeader("Content-Type", "text/xml; charset=KSC5601");
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resData = rxw.add(root, "resData", "");
	int result = rxw.add(resData, "jobrslt", jobcd);
	int resultmsg = rxw.add(resData, "jobmsg", title);
	rxw.flush(out);	
	
	System.out.println( "result.........2");
	*/

	out.clearBuffer();	
	
	if(jobcd == 0) {
		//---------------------
		//Ȯ����������
		//---------------------

		//���̺��� ��� ����
		sb.append("\"�μ��ڵ�\",\"�μ���\",\"��Ʈ�ڵ�\",\"��Ʈ��\",\"�����ڵ�\",\"������\",\"�����ڵ�\",\"������\",\"���࿩��\",\"���ڸ�\",\"���ڹ�ȣ\",\"�μ�\",\"�ܰ�\",\"�ּ��ڵ��\",\"�ּ�\",\"������ȭ1\",\"������ȭ2\",\"������ȭ3\",\"�����ڵ���1\",\"�����ڵ���2\",\"�����ڵ���3\",\"Ȯ������\",\"�Է�����\",\"������\",\"��۷�\",\"���αݾ�\",\"���ݹ��\",\"Ȯ������1\",\"Ȯ������2\",\"ķ��������\",\"Ȯ���ڸ�\",\"Ȯ�����ڵ�\",\"��û���\",\"�ְ�����\",\"��������\",\"������������\",\"��Ȯ����\",\"����ȸ��ID\",\"Ȯ����������������\",\"���\",\"��������\",\"��������\",\"���˹�����\",\"���˹���\",\"���񽺰���\",\"�������μ�\",\"�������ܰ�\",\"�Ѱ�μ�\",\"�Ѱ�ܰ�\",\"�ҳ�μ�\",\"�ҳ�ܰ�\",\"���Ѻμ�\",\"���Ѵܰ�\",\"�ΰ���\",\"�ΰ輾���ڵ�\",\"�ΰ輾�͸�\",\"��޹��\",\"�ڵ���ü��û\",\"���Ȯ�忩��\",\"Ÿ��Ȯ�忩��_�߾�\",\"���Է����翩��_�߾�\"\r\n");
		
		if(ds != null){ 
			for(int i=0; i<ds.curextncloslist.size(); i++){
				SL_L_CLOS_REPORTCUREXTNCLOSLISTRecord rec = (SL_L_CLOS_REPORTCUREXTNCLOSLISTRecord)ds.curextncloslist.get(i);
	
				//���̺��� ����Ÿ ����
				sb.append("\"");
				sb.append(rec.deptcd).append("\",\"");
				sb.append(rec.deptnm).append("\",\"");
				sb.append(rec.partcd).append("\",\"");
				sb.append(rec.partnm).append("\",\"");
				sb.append(rec.areacd).append("\",\"");
				sb.append(rec.areanm).append("\",\"");
				sb.append(rec.bocd).append("\",\"");
				sb.append(rec.bonm).append("\",\"");
				sb.append(rec.oprenvclsf).append("\",\"");
				sb.append(rec.rdrnm).append("\",\"");
				sb.append(rec.rdr_no).append("\",\"");
				sb.append(rec.qty+"").append("\",\"");
				sb.append(rec.subsuprc).append("\",\"");
				sb.append(rec.addrcdnm).append("\",\"");
				sb.append(rec.addrs).append("\",\"");
				sb.append(rec.rdrtel_no1).append("\",\"");
				sb.append(rec.rdrtel_no2).append("\",\"");
				sb.append(rec.rdrtel_no3).append("\",\"");
				sb.append(rec.rdrptph_no1).append("\",\"");
				sb.append(rec.rdrptph_no2).append("\",\"");
				sb.append(rec.rdrptph_no3).append("\",\"");
				sb.append(rec.rdr_extndt ).append("\",\"");
				sb.append(rec.incmgdt).append("\",\"");
				sb.append(rec.valmm).append("\",\"");
				sb.append(rec.post_dlvfee+"").append("\",\"");
				sb.append(rec.dscnamt+"").append("\",\"");
				sb.append(rec.clamtmthd).append("\",\"");
				sb.append(rec.rdr_extntype1).append("\",\"");
				sb.append(rec.rdr_extntype2).append("\",\"");
				sb.append(rec.camptype).append("\",\"");
				sb.append(rec.extnnm).append("\",\"");
				sb.append(rec.stafno).append("\",\"");
				sb.append(rec.aplcpath).append("\",\"");
				sb.append(rec.resitype).append("\",\"");
				sb.append(rec.mvindt).append("\",\"");
				sb.append(rec.mvintodt).append("\",\"");
				sb.append(rec.reconfyn).append("\",\"");
				sb.append(rec.mormembid).append("\",\"");
				sb.append(rec.rdr_extnprvlastsuspdt).append("\",\"");
				sb.append(rec.remk).append("\",\"");
				sb.append(rec.suspdt).append("\",\"");
				sb.append(rec.suspresn).append("\",\"");
				sb.append(rec.bns_itemclsf).append("\",\"");
				sb.append(rec.bns_itemnm).append("\",\"");
				sb.append(rec.svcmm+"").append("\",\"");
				sb.append(rec.scqty+"").append("\",\"");
				sb.append(rec.scsubsuprc+"").append("\",\"");
				sb.append(rec.hkqty+"").append("\",\"");
				sb.append(rec.hksubsuprc).append("\",\"");
				sb.append(rec.boyqty+"").append("\",\"");
				sb.append(rec.boysubsuprc).append("\",\"");
				sb.append(rec.hanqty+"").append("\",\"");
				sb.append(rec.hansubsuprc).append("\",\"");
				sb.append(rec.trsfdeptnm).append("\",\"");
				sb.append(rec.trsfbocd).append("\",\"");
				sb.append(rec.trsfbonm).append("\",\"");
				sb.append(rec.dlvmthd).append("\",\"");
				sb.append(rec.shftyn).append("\",\"");
				sb.append(rec.ccempyn).append("\",\"");
				sb.append(rec.trgtyn_j).append("\",\"");
				sb.append(rec.thrwyn_j).append("\"\r\n");
			}
		}
	}
	else if(jobcd == 1) {
		//---------------------
		//�������ڸ��
		//---------------------

		//���̺��� ��� ����
		sb.append("\"�μ��ڵ�\",\"�μ�\",\"��Ʈ�ڵ�\",\"��Ʈ��\",\"�����ڵ�\",\"������\",\"�����ڵ�\",\"������\",\"���ڹ�ȣ\",\"�ּ�\",\"���ڸ�\",\"����\",\"��ü\",\"����������\",\"������\",\"���ᱸ��\",\"�ְ�����\",\"������ȭ1\",\"������ȭ2\",\"������ȭ3\",\"�����ڵ���1\",\"�����ڵ���2\",\"�����ڵ���3\",\"Ȯ������\",\"Ȯ������1\",\"Ȯ������2\",\"ķ����Ȯ���\",\"��û���\",\"ķ��������\",\"Ȯ���ڸ�\",\"�ܰ�\",\"�μ�\",\"���ݻ���\",\"���ݰ���\",\"�ֱ�6��������Ƚ��\",\"�ѱ�������\",\"��������200407����\",\"���ݹ��\",\"���������ڵ�\",\"��������\",\"������������\",\"�Է�����\",\"���Ȯ�忩��\",\"Ÿ��Ȯ�忩��_�߾�\",\"���Է����翩��_�߾�\"\r\n");

		if(ds != null){ 
			for(int i=0; i<ds.cursuspcloslist.size(); i++){
				SL_L_CLOS_REPORTCURSUSPCLOSLISTRecord rec = (SL_L_CLOS_REPORTCURSUSPCLOSLISTRecord)ds.cursuspcloslist.get(i);
				
				//���̺��� ����Ÿ ����
				sb.append("\"");
				sb.append(rec.deptcd).append("\",\"");
				sb.append(rec.deptnm).append("\",\"");
				sb.append(rec.partcd).append("\",\"");
				sb.append(rec.partnm).append("\",\"");
				sb.append(rec.areacd).append("\",\"");
				sb.append(rec.areanm).append("\",\"");
				sb.append(rec.bocd).append("\",\"");
				sb.append(rec.bonm).append("\",\"");
				sb.append(rec.rdr_no).append("\",\"");
				sb.append(rec.addr).append("\",\"");
				sb.append(rec.rdrnm).append("\",\"");
				sb.append(rec.dstc).append("\",\"");
				sb.append(rec.medi).append("\",\"");
				sb.append(rec.subsbgndd).append("\",\"");
				sb.append(rec.valmm).append("\",\"");
				sb.append(rec.freeclsf).append("\",\"");
				sb.append(rec.resitype).append("\",\"");
				sb.append(rec.rdrtel_no1).append("\",\"");
				sb.append(rec.rdrtel_no2).append("\",\"");
				sb.append(rec.rdrtel_no3).append("\",\"");
				sb.append(rec.rdrptph_no1).append("\",\"");
				sb.append(rec.rdrptph_no2).append("\",\"");
				sb.append(rec.rdrptph_no3).append("\",\"");
				sb.append(rec.rdr_extndt).append("\",\"");
				sb.append(rec.rdr_extntype1).append("\",\"");
				sb.append(rec.rdr_extntype2).append("\",\"");
				sb.append(rec.camprdr_extnnm).append("\",\"");
				sb.append(rec.aplcpath).append("\",\"");
				sb.append(rec.camptype).append("\",\"");
				sb.append(rec.extnnm).append("\",\"");
				sb.append(rec.uprc+"").append("\",\"");
				sb.append(rec.qty+"").append("\",\"");
				sb.append(" "+rec.clamtmatt).append("\",\"");
				sb.append(rec.clamtmonth).append("\",\"");
				sb.append(rec.rcntclamt+"").append("\",\"");
				sb.append(rec.totsubsmonth).append("\",\"");
				sb.append(rec.subsmonth200407aft).append("\",\"");
				sb.append(rec.clamtmthd).append("\",\"");
				sb.append(rec.suspresncd).append("\",\"");
				sb.append(rec.suspdt).append("\",\"");
				sb.append(rec.vexcboyn).append("\",\"");
				sb.append(rec.incmgtm).append("\",\"");
				sb.append(rec.ccempyn).append("\",\"");
				sb.append(rec.trgtyn_j).append("\",\"");
				sb.append(rec.thrwyn_j).append("\"\r\n");				
			}
		}
	}
	else if(jobcd == 2) {
		//---------------------
		//�����������������
		//---------------------

		//���̺��� ��� ����
		sb.append("\"�μ��ڵ�\",\"�μ�\",\"��Ʈ�ڵ�\",\"��Ʈ\",\"�����ڵ�\",\"����\",\"���������ڵ�\",\"����\",\"���࿩��\",\"�ǸŸ�����\",\"�����ڵ�\",\"Ȯ���û\",\"Ȯ������\",\"Ȯ����\",\"Ȯ������\",\"Ȯ�庻��\",\"Ȯ��ǰ����\",\"Ȯ�����\",\"Ȯ���Ÿ\",\"Ȯ����\",\"�����̻�\",\"��������\",\"����Ÿ��\",\"������Ÿ\",\"������Ÿ1\",\"������Ÿ2\",\"������Ÿ3\",\"������Ÿ4\",\"������\",\"������û\",\"��������\",\"�������\",\"��������\",\"��������\",\"����ǰ����\",\"��������Ȯ��\",\"������ŸȮ��\",\"����߼ۺμ�\",\"��������μ�\",\"�ļ�1\",\"�ļ�2\",\"�ļ�3\",\"�ļ�4\",\"�ļ�5\",\"�ļ�6\",\"�ʰ��ļ�6\",\"����Ʈ�μ�\",\"�����μ�\",\"���úμ�\",\"�繫�Ǻμ�\",\"�󰡺μ�\",\"��Ÿ�μ�\",\"ȫ����\",\"���������\",\"����������\",\"������\",\"��Ÿ������\",\"������\",\"����\",\"��������μ�\",\"����μ�\",\"���̼��μ�\",\"�����μ�\",\"�繫�μ�\",\"��պμ�\",\"���Һμ�\",\"�޵��μ�\",\"���̼���\",\"����ݾ�\",\"������αݾ�\",\"�����۷�\",\"������\",\"�繫�ݾ�\",\"��ձݾ�\",\"���ұݾ�\",\"�޵��ݾ�\",\"���μ��ݾ�\",\"�湮���ݾ�\",\"�����ڵ���ü���ݾ�\",\"����ī����ü���ݾ�\",\"�Ϲ�ī����ü���ݾ�\",\"�¶��ΰ������ݾ�\",\"��Ÿ���ݾ�\",\"�̼��Ա�\",\"�ż��Ա�\",\"���Ա�\",\"�������ܼ��ݾ�\",\"����IS���ܼ��ݾ�\",\"����ڵ���ü���κμ�\",\"����Ϲ����κμ�\",\"����̼��Ǽ�\",\"������\"\r\n");

		if(ds != null){ 
			for(int i=0; i<ds.curbocloscloslist.size(); i++){
				SL_L_CLOS_REPORTCURBOCLOSCLOSLISTRecord rec = (SL_L_CLOS_REPORTCURBOCLOSCLOSLISTRecord)ds.curbocloscloslist.get(i);

				//���̺��� ����Ÿ ����
				sb.append("\"");
				sb.append(rec.deptcd+"").append("\",\"");
				sb.append(rec.deptnm).append("\",\"");
				sb.append(rec.partcd+"").append("\",\"");
				sb.append(rec.partnm).append("\",\"");
				sb.append(rec.areacd+"").append("\",\"");
				sb.append(rec.areanm).append("\",\"");
				sb.append(rec.bocd+"").append("\",\"");
				sb.append(rec.bonm).append("\",\"");
				sb.append(rec.oprenvclsfcd+"").append("\",\"");
				sb.append(rec.sellnetclsf+"").append("\",\"");
				sb.append(rec.dstccd+"").append("\",\"");
				sb.append(rec.rdr_extnaplc+"").append("\",\"");
				sb.append(rec.rdr_extnemp+"").append("\",\"");
				sb.append(rec.rdr_extnstaf+"").append("\",\"");
				sb.append(rec.rdr_extnrdr_movm+"").append("\",\"");
				sb.append(rec.rdr_extnhdqt+"").append("\",\"");
				sb.append(rec.rdr_extnexg+"").append("\",\"");
				sb.append(rec.rdr_extncnvs+"").append("\",\"");
				sb.append(rec.rdr_extnetc+"").append("\",\"");
				sb.append(rec.rdr_extnrate+"").append("\",\"");
				sb.append(rec.suspmovm+"").append("\",\"");
				sb.append(rec.susprefu+"").append("\",\"");
				sb.append(rec.suspothnwsp+"").append("\",\"");
				sb.append(rec.suspetc+"").append("\",\"");
				sb.append(rec.suspetc1+"").append("\",\"");
				sb.append(rec.suspetc2+"").append("\",\"");
				sb.append(rec.suspetc3+"").append("\",\"");
				sb.append(rec.suspetc4+"").append("\",\"");
				sb.append(rec.susprate+"").append("\",\"");
				sb.append(rec.suspaplc+"").append("\",\"");
				sb.append(rec.suspemp+"").append("\",\"");
				sb.append(rec.suspstaf+"").append("\",\"");
				sb.append(rec.susprdr_movm+"").append("\",\"");
				sb.append(rec.susphdqt+"").append("\",\"");
				sb.append(rec.suspexg+"").append("\",\"");
				sb.append(rec.suspcnvsrdr_extn+"").append("\",\"");
				sb.append(rec.suspetcrdr_extn+"").append("\",\"");
				sb.append(rec.thmmsendqty+"").append("\",\"");
				sb.append(rec.thmmvalqty+"").append("\",\"");
				sb.append(rec.aftcnt1+"").append("\",\"");
				sb.append(rec.aftcnt2+"").append("\",\"");
				sb.append(rec.aftcnt3+"").append("\",\"");
				sb.append(rec.aftcnt4+"").append("\",\"");
				sb.append(rec.aftcnt5+"").append("\",\"");
				sb.append(rec.aftcnt6+"").append("\",\"");
				sb.append(rec.excsaftcnt6+"").append("\",\"");
				sb.append(rec.aptqty+"").append("\",\"");
				sb.append(rec.villaqty+"").append("\",\"");
				sb.append(rec.housqty+"").append("\",\"");
				sb.append(rec.offi_roomqty+"").append("\",\"");
				sb.append(rec.shopqty+"").append("\",\"");
				sb.append(rec.etcqty+"").append("\",\"");
				sb.append(rec.pub_infonwsp+"").append("\",\"");
				sb.append(rec.hdqt_dntnwsp+"").append("\",\"");
				sb.append(rec.bodntnwsp+"").append("\",\"");
				sb.append(rec.frc_thrwnwsp+"").append("\",\"");
				sb.append(rec.etcfreenwsp+"").append("\",\"");
				sb.append(rec.resvnwsp+"").append("\",\"");
				sb.append(rec.cupn+"").append("\",\"");
				sb.append(rec.thmmno_valqty+"").append("\",\"");
				sb.append(rec.thmmqty+"").append("\",\"");
				sb.append(rec.nowun_recpqty+"").append("\",\"");
				sb.append(rec.medaqty+"").append("\",\"");
				sb.append(rec.re_freeqty+"").append("\",\"");
				sb.append(rec.lossqty+"").append("\",\"");
				sb.append(rec.ppymqty+"").append("\",\"");
				sb.append(rec.temp_stopqty+"").append("\",\"");
				sb.append(rec.now_un_recp_amt+"").append("\",\"");
				sb.append(rec.thmm_amt+"").append("\",\"");
				sb.append(rec.thmmdscnamt+"").append("\",\"");
				sb.append(rec.thmmpost_dlvfee+"").append("\",\"");
				sb.append(rec.meda_amt+"").append("\",\"");
				sb.append(rec.re_freeamt+"").append("\",\"");
				sb.append(rec.lossamt+"").append("\",\"");
				sb.append(rec.ppymamt+"").append("\",\"");
				sb.append(rec.temp_stopamt+"").append("\",\"");
				sb.append(rec.giroclamt+"").append("\",\"");
				sb.append(rec.vistclamt+"").append("\",\"");
				sb.append(rec.giroauto_shiftclamt+"").append("\",\"");
				sb.append(rec.docard_shiftclamt+"").append("\",\"");
				sb.append(rec.gnrcard_shiftclamt+"").append("\",\"");
				sb.append(rec.onlsetlclamt+"").append("\",\"");
				sb.append(rec.etcclamt+"").append("\",\"");
				sb.append(rec.un_recp_repm+"").append("\",\"");
				sb.append(rec.new_repm+"").append("\",\"");
				sb.append(rec.pre_repm+"").append("\",\"");
				sb.append(rec.arealeafclamt+"").append("\",\"");
				sb.append(rec.teampreisleafclamt+"").append("\",\"");
				sb.append(rec.thmmval_adsc_qty+"").append("\",\"");
				sb.append(rec.thmmval_ndsc_qty+"").append("\",\"");
				sb.append(rec.unclamtcnt+"").append("\",\"");
				sb.append(rec.closmm+"").append("\"\r\n");
			}
		}
	}
	
	
	if(jobcd>=0) {
		byte[] bytestream = sb.toString().getBytes();
	
		response.reset();
		response.setHeader("Content-Type", "application/vnd.ms-excel;charset=KSC5601");
		response.setHeader("Content-Disposition", "attachment; filename="+filename+yymm+".csv");
		response.setHeader("Content-Description", "JSP Generated Data");
		response.setHeader("Content-Transfer-Encoding", "binary;");
		response.setHeader("Pragma", "no-cache;");
		response.setHeader("Expires", "-1;");
	
		OutputStream outStream = response.getOutputStream();
		outStream.write(bytestream);
		outStream.close();
		
	} else {
		RwXmlWrapper rxw = new RwXmlWrapper();
		int root = RwXmlWrapper.rootNodeID;
		int codeData = rxw.add(root, "codeData", "");
		int result = rxw.add(codeData, "jobrslt", jobcd);
		int resultmsg = rxw.add(codeData, "jobmsg", title);
		rxw.flush(out);
	}

%>
