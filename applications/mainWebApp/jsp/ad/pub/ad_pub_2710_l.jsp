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

<%!
	String[] days = new String[]{"", "��", "ȭ", "��", "��", "��", "��", "��"};
	
	String getDay(int i){
		return days[i];
	}
%>
<%
	RwXml rx = new RwXml();
	AD_PUB_2710_LDataSet ds = (AD_PUB_2710_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		
		Hashtable hash = new Hashtable();
		
		for(int i=0 ;i<ds.curlist.size(); i++){
			AD_PUB_2710_LCURLISTRecord rec = (AD_PUB_2710_LCURLISTRecord)ds.curlist.get(i);
			hash.put(rec.yoil, rec);	
		}
		
		for(int i=0 ;i<ds.curlist2.size(); i++){
			AD_PUB_2710_LCURLIST2Record bef_rec = (AD_PUB_2710_LCURLIST2Record)ds.curlist2.get(i);
			hash.put("BEF_"+bef_rec.yoil, bef_rec);	
		}
		
		long tot_cgjavfee = 0;
		long tot_bgjavfee = 0;
		long tot_gjavfee  = 0;
		long tot_pubc_cnt = 0;
		double avg_gjavgfee = 0.00d;
		long tot_cplane = 0;
		long tot_bplane = 0;
		long tot_plane  = 0;
		double avg_now_cplane_avg = 0.00d;
		double avg_now_bplane_avg = 0.00d;
		double avg_now_plane_avg  = 0.00d;
		
		
		long tot_cgjavfee2 = 0;
		long tot_bgjavfee2 = 0;
		long tot_gjavfee2  = 0;
		long tot_cplane2   = 0;
		long tot_bplane2   = 0;
		long tot_plane2    = 0;
		double avg_prv_cplane_avg = 0.00d;
		double avg_prv_bplane_avg = 0.00d;
		double avg_prv_plane_avg  = 0.00d;
		
		for(int i = 1; i <= 7; i++) {
		
			int record = rx.add(gridData, "record", "");
			String day = getDay(i);
			AD_PUB_2710_LCURLISTRecord rec = (AD_PUB_2710_LCURLISTRecord)hash.get(day);
			if(rec != null){
				rx.add(record, "yoil", rec.yoil);			//���� 
				rx.add(record, "cgjavfee", rec.cgjavfee);   //�÷��� ����� 
				rx.add(record, "bgjavfee", rec.bgjavfee);   //���� ����� 
				rx.add(record, "gjavfee", rec.gjavfee);     //����� �� 
				rx.add(record, "pubc_cnt", rec.pubc_cnt);	//�����ϼ� 
				
				if((StringUtil.toDouble(rec.gjavfee) == 0 || StringUtil.toDouble(rec.pubc_cnt) == 0)){
					rx.add(record, "gjavgfee", 0);    		//����հ���� = ����� / �����ϼ� 
				}else{
					rx.add(record, "gjavgfee", Math.round((StringUtil.toDouble(rec.gjavfee) / StringUtil.toDouble(rec.pubc_cnt))));    		//����հ���� = ����� / �����ϼ� 
				}
				
				rx.add(record, "cplane", rec.cplane);       //�÷������� 
				rx.add(record, "bplane", rec.bplane);       //��������  
				rx.add(record, "plane", rec.plane);         //������ �� 
				
				if((StringUtil.toDouble(rec.cgjavfee) == 0 || StringUtil.toDouble(rec.cplane) == 0)){
					rx.add(record, "now_cplane_avg", 0); 	//��������� �÷� = �÷��� ����� / Ŀ�������� 
				}else{
					rx.add(record, "now_cplane_avg", Math.round((StringUtil.toDouble(rec.cgjavfee) / StringUtil.toDouble(rec.cplane)))); 	//��������� �÷� = �÷��� ����� / Ŀ�������� 
				}
				
				if((StringUtil.toDouble(rec.bgjavfee) == 0 || StringUtil.toDouble(rec.bplane) == 0)){
					rx.add(record, "now_bplane_avg",0);
				}else{
					rx.add(record, "now_bplane_avg", Math.round((StringUtil.toDouble(rec.bgjavfee) / StringUtil.toDouble(rec.bplane)))); 	//��������� ��� = ���� ����� / ��������  
				}
				
				if((StringUtil.toDouble(rec.gjavfee) == 0 || StringUtil.toDouble(rec.plane) == 0)){
					rx.add(record, "now_plane_avg", 0); 		//��������� �� = ����� �� / ������ �� 
				}else{
					rx.add(record, "now_plane_avg", Math.round((StringUtil.toDouble(rec.gjavfee) / StringUtil.toDouble(rec.plane)))); 		//��������� �� = ����� �� / ������ �� 
				}
					
				tot_cgjavfee       += StringUtil.toLong(rec.cgjavfee);
				tot_bgjavfee       += StringUtil.toLong(rec.bgjavfee);
				tot_gjavfee        += StringUtil.toLong(rec.gjavfee);
				tot_pubc_cnt       += StringUtil.toLong(rec.pubc_cnt);	
				avg_gjavgfee       =  Math.round((double)tot_gjavfee / (double)tot_pubc_cnt);
				tot_cplane         += StringUtil.toLong(rec.cplane);
				tot_bplane   	   += StringUtil.toLong(rec.bplane);
				tot_plane    	   += StringUtil.toLong(rec.plane);
				avg_now_cplane_avg =  Math.round((double)tot_cgjavfee / (double)tot_cplane);
				avg_now_bplane_avg =  Math.round((double)tot_bgjavfee / (double)tot_bplane);
				avg_now_plane_avg  =  Math.round((double)tot_gjavfee  / (double)tot_plane);
								
			}else{
				rx.add(record, "yoil", day);	  		//���� 
				rx.add(record, "cgjavfee", "");  		//�÷��� ����� 
				rx.add(record, "bgjavfee", "");   		//���� ����� 
				rx.add(record, "gjavfee", "");    		//����� �� 
				rx.add(record, "pubc_cnt", "");	 		//�����ϼ� 
				rx.add(record, "gjavgfee", "");			//����հ���� 
				rx.add(record, "cplane", "");       	//�÷������� 
				rx.add(record, "bplane", "");       	//��������  
				rx.add(record, "plane", "");        	//������ �� 
				rx.add(record, "now_cplane_avg", ""); 	//��������� �÷� = �÷��� ����� / Ŀ�������� 
				rx.add(record, "now_bplane_avg", ""); 	//��������� ��� = ���� ����� / ��������  
				rx.add(record, "now_plane_avg", ""); 	//��������� �� = ����� �� / ������ �� 
			}
			
			//���� 
			AD_PUB_2710_LCURLIST2Record bef_rec = (AD_PUB_2710_LCURLIST2Record)hash.get("BEF_"+day);
			if(bef_rec != null){
			    
			    if((StringUtil.toDouble(bef_rec.cgjavfee) == 0 || StringUtil.toDouble(bef_rec.cplane) == 0)){
			    	rx.add(record, "prv_cplane_avg", 0); 	//���������� �÷� 
			    }else{
			    	rx.add(record, "prv_cplane_avg", Math.round((StringUtil.toDouble(bef_rec.cgjavfee) / StringUtil.toDouble(bef_rec.cplane)))); 	//���������� �÷� 
			    }
			    
			    if((StringUtil.toDouble(bef_rec.bgjavfee) == 0 || StringUtil.toDouble(bef_rec.bplane) == 0)){
			    	rx.add(record, "prv_bplane_avg",0);
			    }else{
				    rx.add(record, "prv_bplane_avg", Math.round((StringUtil.toDouble(bef_rec.bgjavfee) / StringUtil.toDouble(bef_rec.bplane)))); 	//���������� ��� 
			    }
			   
			    if((StringUtil.toDouble(bef_rec.gjavfee) == 0 || StringUtil.toDouble(bef_rec.plane) == 0)){
			   		rx.add(record, "prv_plane_avg", 0); 		//���������� ��
			    }else{
			   		rx.add(record, "prv_plane_avg", Math.round((StringUtil.toDouble(bef_rec.gjavfee) / StringUtil.toDouble(bef_rec.plane)))); 		//���������� ��
			    }
			    
			    rx.add(record, "remk",""); 				    //��� 	
			    
			   	tot_cgjavfee2 += StringUtil.toLong(bef_rec.cgjavfee);
				tot_cplane2   += StringUtil.toLong(bef_rec.cplane);
				tot_bgjavfee2 += StringUtil.toLong(bef_rec.bgjavfee);
				tot_bplane2   += StringUtil.toLong(bef_rec.bplane);
				tot_gjavfee2  += StringUtil.toLong(bef_rec.gjavfee);
				tot_plane2    += StringUtil.toLong(bef_rec.plane);
				
				avg_prv_cplane_avg = Math.round((double)tot_cgjavfee2 / (double)tot_cplane2);
				avg_prv_bplane_avg = Math.round((double)tot_bgjavfee2 / (double)tot_bplane2);
				avg_prv_plane_avg  = Math.round((double)tot_gjavfee2  / (double)tot_plane2);
			    			
			}else{
			    rx.add(record, "prv_cplane_avg", ""); 		//���������� �÷� 
			    rx.add(record, "prv_bplane_avg", ""); 		//���������� ��� 
			    rx.add(record, "prv_plane_avg", ""); 		//���������� ��
			    rx.add(record, "remk", ""); 				//��� 				
			}
		}
		
		int record = rx.add(gridData, "record", "");
		
		rx.add(record, "yoil", 			 "�հ�");
		rx.add(record, "cgjavfee", 	     tot_cgjavfee);  	//�÷��� ����� 
		rx.add(record, "bgjavfee", 		 tot_bgjavfee);   	//���� ����� 
		rx.add(record, "gjavfee",  		 tot_gjavfee);    	//����� �� 
		rx.add(record, "pubc_cnt", 		 tot_pubc_cnt);	 	//�����ϼ� 
		rx.add(record, "gjavgfee", 		 DigitUtil.cutUnderPoint(avg_gjavgfee,0));		//����հ���� 
		rx.add(record, "cplane",   		 tot_cplane);       //�÷������� 
		rx.add(record, "bplane",   		 tot_bplane);       //��������  
		rx.add(record, "plane",    		 tot_plane);        //������ �� 
		rx.add(record, "now_cplane_avg", DigitUtil.cutUnderPoint(avg_now_cplane_avg,0)); 	//��������� �÷� = �÷��� ����� / Ŀ�������� 
		rx.add(record, "now_bplane_avg", DigitUtil.cutUnderPoint(avg_now_bplane_avg,0));    //��������� ��� = ���� ����� / ��������  
		rx.add(record, "now_plane_avg",  DigitUtil.cutUnderPoint(avg_now_plane_avg,0)); 	//��������� �� = ����� �� / ������ �� 
		rx.add(record, "prv_cplane_avg", DigitUtil.cutUnderPoint(avg_prv_cplane_avg,0));    //���������� �÷� 
	    rx.add(record, "prv_bplane_avg", DigitUtil.cutUnderPoint(avg_prv_bplane_avg,0));    //���������� ��� 
	    rx.add(record, "prv_plane_avg",  DigitUtil.cutUnderPoint(avg_prv_plane_avg,0)); 	//���������� ��
	    rx.add(record, "remk", 			 ""); 			//��� 			
		
		
		int resForm = rx.add(resData, "resForm", "");
	    
	    rx.add(resForm, "pubc_cnt", ds.pubc_cnt);   					    //�����ϼ� 
	    rx.add(resForm, "plane", 	DigitUtil.nf_format(ds.plane));			//������ 
	    
	}
	catch (Exception e) {
	   
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
