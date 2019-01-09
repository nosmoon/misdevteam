<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_PUB_2220_LDataSet ds = (AD_PUB_2220_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_2220_LCURLISTRecord rec = (AD_PUB_2220_LCURLISTRecord)ds.curlist.get(i);
			
			//��ü�ڵ�(����, �ҳ�)
			//if("110".equals(rec.medi_cd) || "130".equals(rec.medi_cd)) {
				int record = rx.add(gridData, "record", "");
		
				rx.add(record, "gubn", "���");	//���� 
				rx.add(record, "medi_nm", rec.medi_nm); //��ü
				rx.add(record, "cnt", rec.cnt);	        //�ϼ�
				rx.add(record, "damt", rec.damt);		//������� 	
				rx.add(record, "jamt", rec.jamt);		//�������� 
				rx.add(record, "jgamt", rec.jgamt);		//����������				
				
				long  jgamt   = StringUtil.toLong(rec.jgamt);
				long  jamt    = StringUtil.toLong(rec.jamt);
				double jgavg   = 0.0d;
				
				//������������ 
				if(jgamt == 0 || jamt ==0){
					jgavg = 0;
				}else{
					jgavg = ((double)jgamt / jamt) * 100;
				}
				rx.add(record, "jgavg", jgavg);			//������������ 
				
				rx.add(record, "mamt", rec.mamt);	    //��ǥ��
				rx.add(record, "gbamt", rec.gbamt);		//�������� 
				
				long  damt	 = StringUtil.toLong(rec.damt);
				long  mamt   = StringUtil.toLong(rec.mamt);
				double mavg   = 0.0d;
				
				//��ǥ�����
				if(damt == 0 || mamt == 0){
					mavg = 0;
				}else{
					mavg = ((double)damt / mamt) * 100;
				}
				rx.add(record, "mavg", mavg);			//��ǥ�����
			//}	
		}
				
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_PUB_2220_LCURLIST2Record rec = (AD_PUB_2220_LCURLIST2Record)ds.curlist2.get(i);
			
			//��ü�ڵ�(����, �ҳ�)
			//if("110".equals(rec.medi_cd) || "130".equals(rec.medi_cd)) {
				int record = rx.add(gridData, "record", "");
				
				rx.add(record, "gubn", "����");	//���� 
				rx.add(record, "medi_nm", rec.medi_nm); //��ü
				rx.add(record, "cnt", rec.cnt);	        //�ϼ�
				rx.add(record, "damt", rec.damt);		//������� 	
				rx.add(record, "jamt", rec.jamt);		//�������� 
				rx.add(record, "jgamt", rec.jgamt);		//����������

				long  jgamt   = StringUtil.toLong(rec.jgamt);
				long  jamt    = StringUtil.toLong(rec.jamt);
				double jgavg   = 0.0d;
				
				//������������ 
				if(jgamt == 0 || jamt ==0){
					jgavg = 0;
				}else{
					jgavg = ((double)jgamt / jamt) * 100;
				}
				rx.add(record, "jgavg", jgavg);			//������������ 
				
				rx.add(record, "mamt", rec.mamt);	    //��ǥ��
				rx.add(record, "gbamt", rec.gbamt);		//�������� 
				
				long  damt	 = StringUtil.toLong(rec.damt);
				long  mamt   = StringUtil.toLong(rec.mamt);
				double mavg   = 0.0d;
				
				//��ǥ�����
				if(damt == 0 || mamt == 0){
					mavg = 0;
				}else{
					mavg = ((double)damt / mamt) * 100;
				}
				rx.add(record, "mavg", mavg);			//��ǥ�����
			//}
		}
		
		//�������������Ȳ
		for(int i = 0; i < ds.curlist3.size(); i++) {
			AD_PUB_2220_LCURLIST3Record rec = (AD_PUB_2220_LCURLIST3Record)ds.curlist3.get(i);
			
			//��ü�ڵ�(����, �ҳ�)
			//if("110".equals(rec.medi_cd) || "130".equals(rec.medi_cd)) {
				int record = rx.add(gridData, "record2", "");				
				
				rx.add(record, "proc_dt", rec.proc_dt);				//����⵵ 
				rx.add(record, "medi_nm", rec.medi_nm);             //��ü
				rx.add(record, "cnt", rec.cnt);		             	//�����ϼ� 
				rx.add(record, "pubc_side", rec.pubc_side);     	//������ 
				rx.add(record, "dn", rec.dn);						//����ܼ� 
				
				long pubc_side = StringUtil.toLong(rec.pubc_side);
				long pubc_tot_amt = StringUtil.toLong(rec.pubc_tot_amt);
				double avg = 0.0d;
				
				//������ 
				if(pubc_side == 0 || pubc_tot_amt == 0){
					avg = 0;
				}else{
					avg = (double)pubc_tot_amt / pubc_side;
				}
				
				long dn = StringUtil.toLong(rec.dn);
				double avg2 = 0.0d;
				
				//�ܴ���� 
				if(dn == 0 || pubc_side == 0){
					avg2 = 0;
				}else{
					avg2 = (double)pubc_tot_amt / dn;
				}
				
				long cm =  StringUtil.toLong(rec.cm);
				long uprc = StringUtil.toLong(rec.uprc);
				double avg3 = 0.0d;
				
				//��Ƽ��簡 
				if(cm == 0 || uprc == 0){
					avg3 = 0;
				}else{
					avg3 = (double)uprc / cm;
				}
				rx.add(record, "avg", avg);			//������  
				rx.add(record, "avg2", avg2);		//�ܴ���� 
				rx.add(record, "avg3", avg3);		//��Ƽ��ܰ� 
		     //}   
		}	
			
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
