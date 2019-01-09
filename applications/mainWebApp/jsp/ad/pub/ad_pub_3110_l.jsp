<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	java.lang.*	
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_PUB_3110_LDataSet ds = (AD_PUB_3110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	try {
		int gridData 	= rx.add(root, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_3110_LCURLISTRecord rec = (AD_PUB_3110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "chcode", rec.chcode);
			rx.add(record, "cuscode", rec.cuscode);
			rx.add(record, "cuscodenm", rec.cuscodenm);
			rx.add(record, "cuscodeern", rec.cuscodeern);
			rx.add(record, "blndcode", rec.blndcode);
			rx.add(record, "orgcode", rec.orgcode);
			rx.add(record, "frdate", rec.frdate);
			rx.add(record, "todate", rec.todate);
			rx.add(record, "rcvgrp", rec.rcvgrp);
			rx.add(record, "chgcode", rec.chgcode);
			rx.add(record, "stdmonth", rec.stdmonth);
			rx.add(record, "rcvamt", rec.rcvamt);
			rx.add(record, "vatcode", rec.vatcode);
			rx.add(record, "agentcode", rec.agentcode);
			rx.add(record, "agentcodenm", rec.agentcodenm);
			rx.add(record, "agentcodeern", rec.agentcodeern);
			rx.add(record, "agentfee", rec.agentfee);
			rx.add(record, "agentcode2", rec.agentcode2);
			rx.add(record, "agentcodenm2", rec.agentcodenm2);
			rx.add(record, "agentcodeern2", rec.agentcodeern2);
			rx.add(record, "agentfee2", rec.agentfee2);				
			rx.add(record, "salecode", rec.salecode);
			rx.add(record, "saleemp", rec.saleemp);
			rx.add(record, "deptcode", rec.deptcode);
			rx.add(record, "deptname", rec.deptname);
			rx.add(record, "acct_trn_cnfm", rec.acct_trn_cnfm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "pubc_occr_dt", rec.pubc_occr_dt);
			rx.add(record, "pubc_occr_seq", rec.pubc_occr_seq);
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "pubc_slip_no", rec.pubc_slip_no);
			rx.add(record, "acct_yn_1", rec.acct_yn_1);
			rx.add(record, "agent_branch_yn", rec.agent_branch_yn);	
			//������� ���
			int agn_rate = 0;
			if("0".equals(rec.agentfee) || "".equals(rec.agentfee)){
				rx.add(record, "agentrate", "0");						
			}else{
				agn_rate = (int)Math.round((Double.parseDouble(rec.agentfee) / Double.parseDouble(rec.rcvamt)) * 100);
				rx.add(record, "agentrate", Integer.toString(agn_rate));			
			}
			//�������2 ���
			int agn_rate2 = 0;
			if("0".equals(rec.agentfee2) || "".equals(rec.agentfee2)){
				rx.add(record, "agentrate2", "0");						
			}else{
				agn_rate2 = (int)Math.round((Double.parseDouble(rec.agentfee2) / Double.parseDouble(rec.rcvamt)) * 100);
				rx.add(record, "agentrate2", Integer.toString(agn_rate2));			
			}	
			if("Y".equals(rec.acct_trn_cnfm)){//���ŵ� �����϶�
				rx.add(record, "medialeb_yn", rec.medialeb_yn);
				if(!"".equals(rec.xchngadvt_yn)){
					rx.add(record, "xchngadvt_yn", rec.xchngadvt_yn);				
				}else{
					rx.add(record, "xchngadvt_yn", "N");				
				}
				rx.add(record, "event_cd", rec.event_cd);
				rx.add(record, "rslt_dept", rec.rslt_dept);				
				rx.add(record, "trst_rate", rec.trst_rate);
				rx.add(record, "trst_fee", rec.trst_fee);
				//�ӽ���
				//��Ź������ΰ��� ���
				long trst_vat = 0;
				if("0".equals(rec.trst_rate)){
					trst_vat = 0;
				}else{
					trst_vat = (long)Math.round(Long.parseLong(rec.trst_fee) * 0.1);				
				}
				rx.add(record, "trst_vat", Long.toString(trst_vat));
				//�ӽ� ==> ���� bis �����ͺ��̽��� �÷� �߰���				
			}else{//���ŵ������� �����϶�		
				//�̵� ��ǥ���࿩�� �⺻��=Y
				//�� ä�� CH_B�� �⺻�� = N
				//��ȭ����� �̵� ��ǥ���࿩�� �⺻��=N
				if("CH_B".equals(rec.chcode)){
					rx.add(record, "medialeb_yn", "N");	
				}else{	
					//if("34".equals(rec.salecode) || "35".equals(rec.salecode) || "36".equals(rec.salecode) || "42".equals(rec.salecode)){//���
					if("34".equals(rec.salecode) || "35".equals(rec.salecode) || "55".equals(rec.salecode) ){//���				
						rx.add(record, "medialeb_yn", "N");	
					}else{
						rx.add(record, "medialeb_yn", "Y");	
					}
				}
				rx.add(record, "xchngadvt_yn", "N");
				rx.add(record, "event_cd", "");
				rx.add(record, "rslt_dept", "");					
				//��Ź�������� ���			
				int trst_rate = 0;
				if("CH_B".equals(rec.chcode)){
					rx.add(record, "trst_rate", "0");
					trst_rate = 0;
				}else{
					//'37,48,49,50,51'
					if("52".equals(rec.salecode) || "53".equals(rec.salecode) || "37".equals(rec.salecode) || "48".equals(rec.salecode) || "49".equals(rec.salecode) || "50".equals(rec.salecode) || "51".equals(rec.salecode) || "56".equals(rec.salecode)){//����
					    if("0".equals(Integer.toString(agn_rate)) && !"0".equals(Integer.toString(agn_rate2))){
					    	trst_rate = agn_rate2 + 2;
					    }else if(!"0".equals(Integer.toString(agn_rate)) && !"0".equals(Integer.toString(agn_rate2))){
					    	trst_rate = agn_rate + agn_rate2 + 2;
					    }else{
					    	trst_rate = agn_rate + 2;
					    }
					    rx.add(record, "trst_rate", Integer.toString(trst_rate));	
					}else{//������
						if("15".equals(Integer.toString(agn_rate)) || "15".equals(Integer.toString(agn_rate2))){
							trst_rate = 18;
							rx.add(record, "trst_rate", "18");	
						}else{			
							trst_rate = 15;				
							rx.add(record, "trst_rate", "15");	
						}
					}
				}
				//��Ź������ ���
				long trst_fee = 0;
				if("0".equals(Integer.toString(trst_rate))){
					trst_fee = 0;
				}else{
					trst_fee = (long)Math.round((Long.parseLong(rec.rcvamt) * trst_rate)/100);
				}
				rx.add(record, "trst_fee", Long.toString(trst_fee));
				//��Ź������ΰ��� ���
				long trst_vat = 0;
				//long rcvamt_vat = (long)Math.round(Long.parseLong(rec.rcvamt) * 0.1);
				if("0".equals(Integer.toString(trst_rate))){
					trst_vat = 0;
				}else{
					trst_vat = (long)Math.round(trst_fee * 0.1);
					//trst_vat = (long)Math.round((rcvamt_vat * trst_rate)/100);					
				}
				rx.add(record, "trst_vat", Long.toString(trst_vat));				
			}						
			//System.out.println("trst_vat::::::::::::::::>>"+Long.toString(trst_vat));
			
		}

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>