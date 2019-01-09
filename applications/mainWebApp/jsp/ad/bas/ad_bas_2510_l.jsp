<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.bas.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_BAS_2510_LDataSet ds = (AD_BAS_2510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int resData = rx.add(root, "resData", "");   
	int gridData = rx.add(resData, "gridData", "");
	
	try {
		
		//�Է³⵵�� �����ǥ
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_2510_LCURLISTRecord rec = (AD_BAS_2510_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			int cnt1        = StringUtil.toNumber(rec.cnt1);      //������  
			double trgtamt1 = StringUtil.toDouble(rec.trgtamt1);  //��ǥ��  
			double avg1     = 0.00d;
			if(cnt1 != 0 ){
				avg1    = trgtamt1 / cnt1;				      //����հ��� ��ǥ�� = ��ǥ�� / ������ 
			}
			
			rx.add(record, "cnt", rec.cnt1);         						 //�Է³⵵�� ������ 
			rx.add(record, "trgtamt", rec.trgtamt1); 						 //�Է³⵵�� ��ǥ�� 
			rx.add(record, "trgtavg", DigitUtil.cutUnderPoint(avg1,0));    	 //�Է³⵵�� ����վ�  
		}
		
		//�Է³⵵�� ���⵵ �����ǥ
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_2510_LCURLISTRecord rec = (AD_BAS_2510_LCURLISTRecord)ds.curlist.get(i);
			int record2 = rx.add(gridData, "record2", "");
			
			int cnt2        = StringUtil.toNumber(rec.cnt2); 		//������ 
			double pubcamt2 = StringUtil.toDouble(rec.pubcamt2);    //����� 
			double avg2     = 0.00d;
			if(cnt2 != 0){
				avg2	= pubcamt2 / cnt2;                    //����հ����  =  ����� / ������
			}	
			
			rx.add(record2, "cnt", rec.cnt2);          							  //�Է³⵵�� ���⵵ ������ 
			rx.add(record2, "pubcamt", rec.pubcamt2);  							  //�Է³⵵�� ���⵵ ��ǥ�� 
			rx.add(record2, "pubcavg", DigitUtil.cutUnderPoint(avg2,0));          //�Է³⵵�� ���⵵ ����վ� 		
		}
		
		
		//��⵵  �ְ��������  
		int gridData2 = rx.add(resData, "gridData2", "");
		
		int	pubc_cnt  = 0;	//�ְ������ϼ�
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_BAS_2510_LCURLIST2Record rec = (AD_BAS_2510_LCURLIST2Record)ds.curlist2.get(i);
			if(!"0".equals(rec.amt)){
				pubc_cnt++;
			}
		}
		
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_BAS_2510_LCURLIST2Record rec = (AD_BAS_2510_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(gridData2, "record", "");
			
			rx.add(record, "dd", Integer.parseInt(rec.pubc_dt.substring(0,2))+"."+Integer.parseInt(rec.pubc_dt.substring(2,4))+".");	//�������� 
			rx.add(record, "yoil1", rec.yoil);  			//���� 
			rx.add(record, "pubc_side1", rec.pubc_side);	//�� 
			rx.add(record, "dn1", StringUtil.toDouble(rec.dn));	//�ܼ� 
			rx.add(record, "amt1", rec.amt);				//����� 
		}

		double 	tot_dn1      	= 0;    //�ܳ� �ܼ� 
		long 	tot_amt1       	= 0;    //�ܳ� ����� 
		long 	tot_pubc_side1 	= 0; 	//�ܳ� ��� 
		double 	avg_dn1      	= 0;    //�ܳ� �ܼ� ��� 
		long 	avg_amt1       	= 0;    //�ܳ� ����� ��� 
		long 	avg_pubc_side1 	= 0;    //�ܳ� ��� ��� 
		
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_BAS_2510_LCURLIST2Record rec = (AD_BAS_2510_LCURLIST2Record)ds.curlist2.get(i);
			
			tot_dn1        += StringUtil.toDouble(rec.dn);
			tot_amt1       += StringUtil.toLong(rec.amt);
			tot_pubc_side1 += StringUtil.toLong(rec.pubc_side);
		}
		
		avg_dn1		= 	tot_dn1/ pubc_cnt;  
   	    avg_amt1 	= 	tot_amt1/ pubc_cnt; 
		
		if(tot_pubc_side1 != 0){
			avg_pubc_side1 = tot_amt1 / tot_pubc_side1;
		}
		
		int record11 = rx.add(gridData2, "record", "");
		rx.add(record11, "dd", "��");
		rx.add(record11, "yoil1", "");  
		rx.add(record11, "dn1", tot_dn1);
		rx.add(record11, "amt1", tot_amt1);
		
		int record12 = rx.add(gridData2, "record", "");
		rx.add(record12, "dd", "�����");
		rx.add(record12, "yoil1", "");  
		rx.add(record12, "dn1", avg_dn1);
		rx.add(record12, "amt1", avg_amt1);
		
		int record13 = rx.add(gridData2, "record", "");
		rx.add(record13, "dd", "��� �����");
		rx.add(record13, "yoil1", "");  
		rx.add(record13, "dn1", "");
		rx.add(record13, "amt1", avg_pubc_side1);

		int	pubc_cnt2  = 0;	//�ְ������ϼ�
		for(int i = 0; i < ds.curlist22.size(); i++) {
			AD_BAS_2510_LCURLIST22Record rec = (AD_BAS_2510_LCURLIST22Record)ds.curlist22.get(i);
			if(!"0".equals(rec.amt)){
				pubc_cnt2++;
			}
		}
		//���⵵ �ְ�������� 
		for(int i = 0; i < ds.curlist22.size(); i++) {
			AD_BAS_2510_LCURLIST22Record rec = (AD_BAS_2510_LCURLIST22Record)ds.curlist22.get(i);
			int record2 = rx.add(gridData2, "record2", "");
			
			rx.add(record2, "dd", Integer.parseInt(rec.pubc_dt.substring(0,2))+"."+Integer.parseInt(rec.pubc_dt.substring(2,4))+".");	//�������� 
			rx.add(record2, "yoil2", rec.yoil);				//���� 
			rx.add(record2, "pubc_side2", rec.pubc_side);	//�� 
			rx.add(record2, "dn2", StringUtil.toDouble(rec.dn));	//�ܼ�
			rx.add(record2, "amt2", rec.amt);				//����� 
		}
		
		double 	tot_dn2 		= 0;	//���� �ܼ� 
		long 	tot_amt2 		= 0;    //���� ����� 
		long 	tot_pubc_side2 	= 0; 	//���� ��� 
		double 	avg_dn2 		= 0;    //���� �ܼ� ��� 
		long 	avg_amt2 		= 0;	//���� ����� ���
		long 	avg_pubc_side2 	= 0;    //���� ����� ���  
		
		for(int i = 0; i < ds.curlist22.size(); i++) {
			AD_BAS_2510_LCURLIST22Record rec = (AD_BAS_2510_LCURLIST22Record)ds.curlist22.get(i);
			
			tot_dn2 		+= StringUtil.toDouble(rec.dn);
			tot_amt2 		+= StringUtil.toLong(rec.amt);
			tot_pubc_side2 	+= StringUtil.toLong(rec.pubc_side); 
		}
		
		avg_dn2   = tot_dn2 / pubc_cnt2;
		avg_amt2  = tot_amt2 / pubc_cnt2;
		
		if(tot_pubc_side2 != 0){
		    avg_pubc_side2 = tot_amt2 / tot_pubc_side2;
	    }

		int record21 = rx.add(gridData2, "record2", "");
		rx.add(record21, "dd", "��");
		rx.add(record21, "yoil2", "");
		rx.add(record21, "dn2", tot_dn2);
		rx.add(record21, "amt2", tot_amt2);
		
		int record22 = rx.add(gridData2, "record2", "");
		rx.add(record22, "dd", "�����");
		rx.add(record22, "yoil2", "");
		rx.add(record22, "dn2", avg_dn2);
		rx.add(record22, "amt2", DigitUtil.cutUnderPoint(avg_amt2,1));
		
		int record23 = rx.add(gridData2, "record2", "");
		rx.add(record23, "dd", "��� �����");
		rx.add(record23, "yoil2", "");
		rx.add(record23, "dn2", "");
		rx.add(record23, "amt2", avg_pubc_side2);		
		
		double inc_dn   = 0.00d;
		long inc_amt    = 0;
		double inc_amt2 = 0.00d;
		double inc_avg  = 0.00d;
		
		inc_dn   = tot_dn1  - tot_dn2;
		inc_amt  = tot_amt1 - tot_amt2;
		inc_amt2 = tot_amt1 - tot_amt2;
		
		if(tot_amt2 != 0){
			inc_avg  = (inc_amt2 / tot_amt2) * 100;
		}
		
		int record3 = rx.add(gridData2, "record3", "");
		rx.add(record3, "inc_dn", inc_dn);
		rx.add(record3, "inc_amt", inc_amt);
		rx.add(record3, "inc_avg", DigitUtil.cutUnderPoint(inc_avg,1));
		
	
		//(����)/�Ⱓ ����� �м� 
		int gridData3 = rx.add(resData, "gridData3", "");
		
		for(int i = 0; i < ds.curlist3.size(); i++) {
			AD_BAS_2510_LCURLIST3Record rec = (AD_BAS_2510_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(gridData3, "record", "");
			
			rx.add(record, "gubn", "����");       	    	//����
			rx.add(record, "medi_nm", rec.medi_nm);   		//��ü�� 
			rx.add(record, "cnt", rec.cnt1);   		  		//�ϼ�
			rx.add(record, "pubcamt1", rec.pubcamt1);   	//������� 
			rx.add(record, "pubcamt2", rec.pubcamt2);   	//�������� 
			rx.add(record, "incamt", rec.incamt);   		//������
			rx.add(record, "incavg", StringUtil.toDouble(rec.incavg));   		//����
			rx.add(record, "trgtamt", rec.trgtamt);   		//��ǥ��
			rx.add(record, "shortamt", rec.shortamt);   	//��������
			rx.add(record, "shortavg", StringUtil.toDouble(rec.shortavg));   	//���� 
		}
		
		//����/(�Ⱓ) ����� �м�
		for(int i = 0; i < ds.curlist4.size(); i++) {
			AD_BAS_2510_LCURLIST4Record rec = (AD_BAS_2510_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(gridData3, "record", "");
			
			rx.add(record, "gubn", "�Ⱓ");       	    	//�Ⱓ 
			rx.add(record, "medi_nm", rec.medi_nm);   		//��ü�� 
			rx.add(record, "cnt", rec.cnt1);   		  		//�ϼ�
			rx.add(record, "pubcamt1", rec.pubcamt1);   	//������� 
			rx.add(record, "pubcamt2", rec.pubcamt2);   	//�������� 
			rx.add(record, "incamt", rec.incamt);   		//������
			rx.add(record, "incavg", StringUtil.toDouble(rec.incavg));   		//����
			rx.add(record, "trgtamt", rec.trgtamt);   		//��ǥ��
			rx.add(record, "shortamt", rec.shortamt);   	//��������
			rx.add(record, "shortavg", StringUtil.toDouble(rec.shortavg));   	//���� 
		}
		
		
		long tot_pubcamt = 0;
		double pubcamt     = 0;
		double temp        = 0;
		
		for(int i = 0; i < ds.curlist4.size(); i++) {
			AD_BAS_2510_LCURLIST4Record rec = (AD_BAS_2510_LCURLIST4Record)ds.curlist4.get(i);
			
			tot_pubcamt += StringUtil.toLong(rec.pubcamt1);		//����/(����) ����� �м� �� 
			
			temp = StringUtil.toLong(rec.pubcamt1);
		}
		
		pubcamt = tot_pubcamt - temp;
		//�������紩����Ȳ 
		int gridData4 = rx.add(resData, "gridData4", "");
		
		for(int i = 0; i < ds.curlist5.size(); i++) {
			AD_BAS_2510_LCURLIST5Record rec = (AD_BAS_2510_LCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(gridData4, "record", "");
			
			rx.add(record, "pubc_dt", rec.pubc_dt+"��"); 	//���� 
			rx.add(record, "pubc_cnt", rec.pubc_cnt);		//�����ϼ� 
			rx.add(record, "issu_side", rec.issu_side);		//������ 
			rx.add(record, "addn", rec.addn);			    //����ܼ� 
			rx.add(record, "side_avg", tot_pubcamt / StringUtil.toLong(rec.issu_side));		//������ 
			rx.add(record, "dn_avg", tot_pubcamt / StringUtil.toDouble(rec.addn));			//�ܴ���� 
			rx.add(record, "cm_amt", (pubcamt/StringUtil.toDouble(rec.addn)) / 37 );			//cm �� �ܰ� 
			
		}
		
		int resForm = rx.add(resData, "resForm", "");
		
		rx.add(resForm, "yyyymm", ds.yyyymm);
		rx.add(resForm, "yyyymm2", ds.yyyymm2);
		
		
	}
	catch (Exception e) {
		System.out.println(e.getMessage());			
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
