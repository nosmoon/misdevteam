<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.dep.rec.*
	,	chosun.ciis.ad.dep.ds.*;
	"
%>

<%
	//입금현황-입금일보별 
	RwXml rx = new RwXml();
	AD_DEP_2320_LDataSet ds = (AD_DEP_2320_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData2 = rx.add(root, "resData2", "");
	int gridData = rx.add(resData2, "gridData", "");

	try {                                                                                                                               
		                                                                                                                    
		//외근                                                                                                              
		long tot_gjavfee1    = 0;                                                                                           
		long tot_igavfee1    = 0;                                                                                           
		long tot_nu_igavfee1 = 0;                                                                                           
		double tot_avg_amt1  = 0.0d;                                                                                        
		long tot_jan_amt1    = 0;                                                                                           
		long tot_dm_igavfee1 = 0;                                                                                           
		double tot_avg_dm_amt1  = 0.0d;                                                                                        
		                                                                                                                    
		//대힝사                                                                                                            
		long tot_gjavfee2    = 0;                                                                                           
		long tot_igavfee2    = 0;                                                                                           
		long tot_nu_igavfee2 = 0;                                                                                           
		double tot_avg_amt2  = 0.0d;                                                                                        
		long tot_jan_amt2    = 0;                                                                                           
		long tot_dm_igavfee2 = 0;                                                                                           
		double tot_avg_dm_amt2  = 0.0d;                                                                                        
		                                                                                                                    
		//안내직입                                                                                                          
		long tot_gjavfee3    = 0;                                                                                           
		long tot_igavfee3    = 0;                                                                                           
		long tot_nu_igavfee3 = 0;                                                                                           
		double tot_avg_amt3  = 0.0d;                                                                                        
		long tot_jan_amt3    = 0;                                                                                           
		long tot_dm_igavfee3 = 0;                                                                                           
		double tot_avg_dm_amt3  = 0.0d;                                                                                        
				                                                                                                                    
		//광고지사                                                                                                          
		long tot_gjavfee4    = 0;                                                                                           
		long tot_igavfee4    = 0;                                                                                           
		long tot_nu_igavfee4 = 0;                                                                                           
		double tot_avg_amt4  = 0.0d;                                                                                        
		long tot_jan_amt4    = 0;                                                                                           
		long tot_dm_igavfee4 = 0;                                                                                           
		double tot_avg_dm_amt4  = 0.0d;                                                                                        		
		                                                                                                                    
		//지사지국                                                                                                          
		long tot_gjavfee5    = 0;                                                                                           
		long tot_igavfee5    = 0;                                                                                           
		long tot_nu_igavfee5 = 0;                                                                                           
		double tot_avg_amt5  = 0.0d;                                                                                        
		long tot_jan_amt5    = 0;                                                                                           
		long tot_dm_igavfee5 = 0;                                                                                           
		double tot_avg_dm_amt5  = 0.0d;                                                                                        		
		                                                                                                                    
		//해외지사                                                                                                          
		long tot_gjavfee7    = 0;                                                                                           
		long tot_igavfee7    = 0;                                                                                           
		long tot_nu_igavfee7 = 0;                                                                                           
		double tot_avg_amt7  = 0.0d;                                                                                        
		long tot_jan_amt7    = 0;                                                                                           
		long tot_dm_igavfee7 = 0;                                                                                           
		double tot_avg_dm_amt7  = 0.0d;                                                                                        		
		                                                                                                                    
		//합계                                                                                                              
		long tot_gjavfee     = 0;                                                                                           
		long tot_igavfee     = 0;                                                                                           
		long tot_nu_igavfee  = 0;                                                                                           
		double tot_avg_amt   = 0.0d;                                                                                        
		long tot_jan_amt     = 0;                                                                                           
		long tot_dm_igavfee  = 0;                                                                                           
		double tot_avg_dm_amt  = 0.0d;                                                                                        
		                                                                                                                    
		for(int i = 0; i<ds.curlist.size(); i++) {                                                                          
			AD_DEP_2320_LCURLISTRecord rec = (AD_DEP_2320_LCURLISTRecord)ds.curlist.get(i);                             
                                                                                                                                    
			int record = rx.add(gridData, "record", "");                                                                
	   		                                                                                                            
	   		//외근 입금율,잔액계산                                                                                      
	   		double avg_amt1 = 0.0d;	   	
	   		double avg_dm_amt1 = 0.0d;
	   			                                                                    
	   		if(StringUtil.toLong(rec.gjavfee1) != 0){                                                                   
	   		    avg_amt1 = StringUtil.toDouble(rec.nu_igavfee1)/StringUtil.toLong(rec.gjavfee1)*100;        
	   		    avg_dm_amt1 = StringUtil.toDouble(rec.dm_igavfee1)/StringUtil.toLong(rec.gjavfee1)*100;        
	   		}	   		                                                                                    
	   		long jan_amt1 = StringUtil.toLong(rec.gjavfee1)-StringUtil.toLong(rec.nu_igavfee1);                         
	   		                          	   		                                                                                                            
	        rx.add(record, "medi_nm", rec.medi_nm);                                                                             
	        rx.add(record, "gubun", "게   재   액");                                                                            
	        rx.add(record, "fee1", rec.gjavfee1);                                                                               
            rx.add(record, "fee1", rec.igavfee1);                                                                                   
            rx.add(record, "fee1", rec.nu_igavfee1);                                                                                
			rx.add(record, "fee1", avg_amt1 == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(avg_amt1,2));                    
			rx.add(record, "fee1", jan_amt1);                                                                           
			rx.add(record, "fee1", rec.dm_igavfee1);                                                                    
			rx.add(record, "fee1", avg_dm_amt1 == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(avg_dm_amt1,2));                    
//			rx.add(record, "fee1", "0.00%");                                                                            			
	        	                                                                                                            
	   		record = rx.add(gridData, "record", "");                                                                    
	   		                                                                                                            
	   		//대행사 입금율,잔액계산                                                                                    
	   		double avg_amt2 = 0.0d;
	   		double avg_dm_amt2 = 0.0d;
	   			   		                                                                    
	   		if(StringUtil.toLong(rec.gjavfee2) != 0){                                                                   
	   		    avg_amt2 = StringUtil.toDouble(rec.nu_igavfee2)/StringUtil.toLong(rec.gjavfee2)*100;                    
	   		    avg_dm_amt2 = StringUtil.toDouble(rec.dm_igavfee2)/StringUtil.toLong(rec.gjavfee2)*100;                    
	   		}	   		                                                                                    
	   		long jan_amt2 = StringUtil.toLong(rec.gjavfee2)-StringUtil.toLong(rec.nu_igavfee2);                         
	   		                                                                                                            
	   		rx.add(record, "medi_nm", rec.medi_nm);                                                                     
	        rx.add(record, "gubun", "입   금   액");                                                                            
	        rx.add(record, "fee2", rec.gjavfee2);                                                                               
            rx.add(record, "fee2", rec.igavfee2);                                                                                   
            rx.add(record, "fee2", rec.nu_igavfee2);                                                                                
			rx.add(record, "fee2", avg_amt2  == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(avg_amt2,2));                    
			rx.add(record, "fee2", jan_amt2);                                                                           
			rx.add(record, "fee2", rec.dm_igavfee2);                                                                    
			rx.add(record, "fee2", avg_dm_amt2 == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(avg_dm_amt2,2));                    
//			rx.add(record, "fee2", "0.00%");                                                                            
	   		                                                                                                            
	   		record = rx.add(gridData, "record", "");                                                                    
	   		                                                                                                            
	   		//안내지입 입금율,잔액계산                                                                                  
	   		double avg_amt3 = 0.0d;	
	   		double avg_dm_amt3 = 0.0d;
	   		   		                                                                    
	   		if(StringUtil.toLong(rec.gjavfee3) != 0){                                                                   
	   		    avg_amt3 = StringUtil.toDouble(rec.nu_igavfee3)/StringUtil.toLong(rec.gjavfee3)*100;                    
	   		    avg_dm_amt3 = StringUtil.toDouble(rec.dm_igavfee3)/StringUtil.toLong(rec.gjavfee3)*100;                    
	   		}	   		                                                                                    
	   		long jan_amt3 = StringUtil.toLong(rec.gjavfee3)-StringUtil.toLong(rec.nu_igavfee3);                         
	   		                                                                                                            
	   		rx.add(record, "medi_nm", rec.medi_nm);                                                                     
	        rx.add(record, "gubun", "누         계");                                                                           
	        rx.add(record, "fee3", rec.gjavfee3);                                                                               
            rx.add(record, "fee3", rec.igavfee3);                                                                                   
            rx.add(record, "fee3", rec.nu_igavfee3);                                                                                
			rx.add(record, "fee3", avg_amt3 == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(avg_amt3,2));                    
			rx.add(record, "fee3", jan_amt3);                                                                           
			rx.add(record, "fee3", rec.dm_igavfee3);                                                                    
			rx.add(record, "fee3", avg_dm_amt3 == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(avg_dm_amt3,2));                    
//			rx.add(record, "fee3", "0.00%");                                                                            
			                                                                                                            
	   		                                                                                                            
	   		record = rx.add(gridData, "record", "");                                                                    
	   		                                                                                                            
	   		//광고지사 입금율,잔액계산                                                                                  
	   		double avg_amt4 = 0.0d;	   		                                                                    
	   		double avg_dm_amt4 = 0.0d;	   		                                                                    
	   		
	   		if(StringUtil.toLong(rec.gjavfee4) != 0){                                                                   
	   		    avg_amt4 = StringUtil.toDouble(rec.nu_igavfee4)/StringUtil.toLong(rec.gjavfee4)*100;                    
	   		    avg_dm_amt4 = StringUtil.toDouble(rec.dm_igavfee4)/StringUtil.toLong(rec.gjavfee4)*100;                    
	   		}	   		                                                                                    
	   		long jan_amt4 = StringUtil.toLong(rec.gjavfee4)-StringUtil.toLong(rec.nu_igavfee4);                         
	   		                                                                                                            
	   		rx.add(record, "medi_nm", rec.medi_nm);                                                                     
	        rx.add(record, "gubun", "입   금   율");                                                                            
	        rx.add(record, "fee4", rec.gjavfee4);                                                                               
            rx.add(record, "fee4", rec.igavfee4);                                                                                   
            rx.add(record, "fee4", rec.nu_igavfee4);                                                                                
			rx.add(record, "fee4", avg_amt4 == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(avg_amt4,2));                    
			rx.add(record, "fee4", jan_amt4);                                                                           
			rx.add(record, "fee4", rec.dm_igavfee4);                                                                    
			rx.add(record, "fee4", avg_dm_amt4 == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(avg_dm_amt4,2));                    
//			rx.add(record, "fee4", "0.00%");                                                                            
	                                                                                                                            
	        	record = rx.add(gridData, "record", "");                                                                            
	   		                                                                                                            
	   		//지사지국 입금율,잔액계산                                                                                  
	   		double avg_amt5 = 0.0d;
	   		double avg_dm_amt5 = 0.0d;
	   			   		                                                                    
	   		if(StringUtil.toLong(rec.gjavfee5) != 0){                                                                   
	   		    avg_amt5 = StringUtil.toDouble(rec.nu_igavfee5)/StringUtil.toLong(rec.gjavfee5)*100;                    
	   		    avg_dm_amt5 = StringUtil.toDouble(rec.dm_igavfee5)/StringUtil.toLong(rec.gjavfee5)*100;                    
	   		}	   		                                                                                    
	   		long jan_amt5 = StringUtil.toLong(rec.gjavfee5)-StringUtil.toLong(rec.nu_igavfee5);                         
	   	                                                                                                                    
	   		rx.add(record, "medi_nm", rec.medi_nm);                                                                     
		    rx.add(record, "gubun", "잔         액");                                                                           
		    rx.add(record, "fee5", rec.gjavfee5);                                                                               
	        rx.add(record, "fee5", rec.igavfee5);                                                                                   
	        rx.add(record, "fee5", rec.nu_igavfee5);                                                                                
			rx.add(record, "fee5", avg_amt5 == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(avg_amt5,2));                    
			rx.add(record, "fee5", jan_amt5);                                                                           
			rx.add(record, "fee5", rec.dm_igavfee5);                                                                    
			rx.add(record, "fee5", avg_dm_amt5 == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(avg_dm_amt5,2));                    
//			rx.add(record, "fee5", "0.00%");                                                                            
	                                                                                                                            
	        record = rx.add(gridData, "record", "");                                                                            
	   		                                                                                                            
	   		//해외지사 입금율,잔액계산                                                                                  
	   		double avg_amt7 = 0.0d;	 
	   		double avg_dm_amt7 = 0.0d;	 
	   		  		                                                                    
	   		if(StringUtil.toLong(rec.gjavfee7) != 0){                                                                   
	   		    avg_amt7 = StringUtil.toDouble(rec.nu_igavfee7)/StringUtil.toLong(rec.gjavfee7)*100;                    
	   		    avg_dm_amt7 = StringUtil.toDouble(rec.dm_igavfee7)/StringUtil.toLong(rec.gjavfee7)*100;                    
	   		}	   		                                                                                    
	   		long jan_amt7 = StringUtil.toLong(rec.gjavfee7)-StringUtil.toLong(rec.nu_igavfee7);                         
	   		                                                                                                            
	   		rx.add(record, "medi_nm", rec.medi_nm);                                                                     
	        rx.add(record, "gubun", "당월분입금");                                                                              
	        rx.add(record, "fee7", rec.gjavfee7);                                                                               
            rx.add(record, "fee7", rec.igavfee7);                                                                                   
            rx.add(record, "fee7", rec.nu_igavfee7);                                                                                
			rx.add(record, "fee7", avg_amt7 == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(avg_amt7,2));                    
			rx.add(record, "fee7", jan_amt7);                                                                           
			rx.add(record, "fee7", rec.dm_igavfee7);                                                                    
			rx.add(record, "fee7", avg_dm_amt7 == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(avg_dm_amt7,2));                    
//			rx.add(record, "fee7", "0.00%");                                                                            
	                                                                                                                            
	        record = rx.add(gridData, "record", "");                                                                            
	   		                                                                                                            
	   		long tot_gjavfees = 	StringUtil.toLong(rec.gjavfee1)    +  StringUtil.toLong(rec.gjavfee2) +             
    		                    	StringUtil.toLong(rec.gjavfee3)    +  StringUtil.toLong(rec.gjavfee4) +                     
    		                    	StringUtil.toLong(rec.gjavfee5)    +  StringUtil.toLong(rec.gjavfee7);                      
    		long tot_igavfees = 	StringUtil.toLong(rec.igavfee1)    +  StringUtil.toLong(rec.igavfee2) +                     
    		                    	StringUtil.toLong(rec.igavfee3)    +  StringUtil.toLong(rec.igavfee4) +                     
    		                    	StringUtil.toLong(rec.igavfee5)    +  StringUtil.toLong(rec.igavfee7);                      
    		long tot_nu_igavfees =  StringUtil.toLong(rec.nu_igavfee1) +  StringUtil.toLong(rec.nu_igavfee2) +                  
    		                        StringUtil.toLong(rec.nu_igavfee3) +  StringUtil.toLong(rec.nu_igavfee4) +                  
    		                        StringUtil.toLong(rec.nu_igavfee5) +  StringUtil.toLong(rec.nu_igavfee7);                   
	   		double tot_avg_amts  =  ((double)tot_nu_igavfees/(double)tot_gjavfees)*100;	   		            
	   		long tot_jan_amts    =  jan_amt1 +  jan_amt2 + jan_amt3 +  jan_amt4 + jan_amt5 +  jan_amt7;                 
	   		long tot_dm_igavfees =  StringUtil.toLong(rec.dm_igavfee1) +  StringUtil.toLong(rec.dm_igavfee2) +          
    		                        StringUtil.toLong(rec.dm_igavfee3) +  StringUtil.toLong(rec.dm_igavfee4) +                  
    		                        StringUtil.toLong(rec.dm_igavfee5) +  StringUtil.toLong(rec.dm_igavfee7);                   
            double tot_avg_dm_amts  =  ((double)tot_dm_igavfees/(double)tot_gjavfees)*100;	   		            
	   		                                                                                                            
	   		//합계                                                                                                      
	   		rx.add(record, "medi_nm", rec.medi_nm);                                                                     
	        rx.add(record, "gubun", "당월입금율");                                                                              
	        rx.add(record, "tot_fee", tot_gjavfees);                                                                            
            rx.add(record, "tot_fee", tot_igavfees);                                                                                
            rx.add(record, "tot_fee", tot_nu_igavfees);                                                                             
			rx.add(record, "tot_fee", tot_avg_amts == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(tot_avg_amts,2));         
			rx.add(record, "tot_fee", tot_jan_amts);                                                                    
			rx.add(record, "tot_fee", tot_dm_igavfees);                                                                 
			rx.add(record, "tot_fee", tot_avg_dm_amts == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(tot_avg_dm_amts,2));         
//			rx.add(record, "tot_fee", "0.00%");                                                                         
			                                                                                                            
			//외근 합계 계산                                                                                            
			tot_gjavfee1    += StringUtil.toLong(rec.gjavfee1);                                                         
			tot_igavfee1    += StringUtil.toLong(rec.igavfee1);                                                         
			tot_nu_igavfee1 += StringUtil.toLong(rec.nu_igavfee1);                                                      			
			tot_jan_amt1    += jan_amt1;                                                                                
			tot_dm_igavfee1 += StringUtil.toLong(rec.dm_igavfee1);                                                      
			if(tot_gjavfee1 != 0){                                                                                      
				tot_avg_amt1    = ((double)tot_nu_igavfee1/(double)tot_gjavfee1)*100;                               
				tot_avg_dm_amt1    = ((double)tot_dm_igavfee1/(double)tot_gjavfee1)*100;                               
			}                                                                                                           

			                                                                                                            
			//대행사 합계 계산                                                                                          
			tot_gjavfee2    += StringUtil.toLong(rec.gjavfee2);                                                         
			tot_igavfee2    += StringUtil.toLong(rec.igavfee2);                                                         
			tot_nu_igavfee2 += StringUtil.toLong(rec.nu_igavfee2);                                                      			                                                                                                           
			tot_jan_amt2    += jan_amt2;                                                                                
			tot_dm_igavfee2 += StringUtil.toLong(rec.dm_igavfee2);                                                      
			if(tot_gjavfee2 != 0){                                                                                      
				tot_avg_amt2    = ((double)tot_nu_igavfee2/(double)tot_gjavfee2)*100;                               
				tot_avg_dm_amt2    = ((double)tot_dm_igavfee2/(double)tot_gjavfee2)*100;                               
			}
			                                                                                                            
			//안내직입 합계 계산                                                                                        
			tot_gjavfee3    += StringUtil.toLong(rec.gjavfee3);                                                         
			tot_igavfee3    += StringUtil.toLong(rec.igavfee3);                                                         
			tot_nu_igavfee3 += StringUtil.toLong(rec.nu_igavfee3);                                                      
			tot_jan_amt3    += jan_amt3;                                                                                
			tot_dm_igavfee3 += StringUtil.toLong(rec.dm_igavfee3);                                                      
			if(tot_gjavfee3 != 0){                                                                                      
				tot_avg_amt3    = ((double)tot_nu_igavfee3/(double)tot_gjavfee3)*100;                               
				tot_avg_dm_amt3    = ((double)tot_dm_igavfee3/(double)tot_gjavfee3)*100;                               
			}
			                                                                                                            
			//광고지사 합계 계산                                                                                        
			tot_gjavfee4    += StringUtil.toLong(rec.gjavfee4);                                                         
			tot_igavfee4    += StringUtil.toLong(rec.igavfee4);                                                         
			tot_nu_igavfee4 += StringUtil.toLong(rec.nu_igavfee4);                                                      			
			tot_jan_amt4    += jan_amt4;                                                                                
			tot_dm_igavfee4 += StringUtil.toLong(rec.dm_igavfee4);                                                      
			if(tot_gjavfee4 != 0){                                                                                      
				tot_avg_amt4    = ((double)tot_nu_igavfee4/(double)tot_gjavfee4)*100;                               
				tot_avg_dm_amt4    = ((double)tot_dm_igavfee4/(double)tot_gjavfee4)*100;                               
			}                                                                                                           
			                                                                                                            
			//지사지국 합계 계산                                                                                        
			tot_gjavfee5    += StringUtil.toLong(rec.gjavfee5);                                                         
			tot_igavfee5    += StringUtil.toLong(rec.igavfee5);                                                         
			tot_nu_igavfee5 += StringUtil.toLong(rec.nu_igavfee5);                                                      			
			tot_jan_amt5    += jan_amt5;                                                                                
			tot_dm_igavfee5 += StringUtil.toLong(rec.dm_igavfee5);                                                      
			if(tot_gjavfee5 != 0){                                                                                      
				tot_avg_amt5    = ((double)tot_nu_igavfee5/(double)tot_gjavfee5)*100;                               
				tot_avg_dm_amt5    = ((double)tot_dm_igavfee5/(double)tot_gjavfee5)*100;                               
			}		                                                                                            
			                                                                                                            
			//해외지사 합계 계산                                                                                        
			tot_gjavfee7    += StringUtil.toLong(rec.gjavfee7);                                                         
			tot_igavfee7    += StringUtil.toLong(rec.igavfee7);                                                         
			tot_nu_igavfee7 += StringUtil.toLong(rec.nu_igavfee7);                                                      			
			tot_jan_amt7    += jan_amt7;                                                                                
			tot_dm_igavfee7 += StringUtil.toLong(rec.dm_igavfee7);                                                      
			if(tot_gjavfee7 != 0){                                                                                      
				tot_avg_amt7    = ((double)tot_nu_igavfee7/(double)tot_gjavfee7)*100;                               
				tot_avg_dm_amt7    = ((double)tot_dm_igavfee7/(double)tot_gjavfee7)*100;                               
			}                                                                                                           
			                                                                                                            
			//합계 계산                                                                                                 
			tot_gjavfee		+= tot_gjavfees;                                                                    
			tot_igavfee		+= tot_igavfees;                                                                    
			tot_nu_igavfee  += tot_nu_igavfees;                                                                         
			tot_jan_amt     += tot_jan_amts;                                                                            
			tot_dm_igavfee  += tot_dm_igavfees;                                                                         
			if(tot_gjavfee != 0){                                                                                       
				tot_avg_amt    = ((double)tot_nu_igavfee/(double)tot_gjavfee)*100;                                  
				tot_avg_dm_amt = ((double)tot_dm_igavfee/(double)tot_gjavfee)*100;                                  
			}                                                                                                           			
	   }                                                                                                                        
                                                                                                                                    
		int record = rx.add(gridData, "record", "");                                                                        
		                                                                                                                    
		rx.add(record, "medi_nm", "합계");                                                                                  
        rx.add(record, "gubun", "게   재   액");                                                                                    
		rx.add(record, "fee1", tot_gjavfee1);                                                                               
        rx.add(record, "fee1", tot_igavfee1);                                                                                       
        rx.add(record, "fee1", tot_nu_igavfee1);                                                                                    
		rx.add(record, "fee1", tot_avg_amt1 == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(tot_avg_amt1,2));                    
		rx.add(record, "fee1", tot_jan_amt1);                                                                               
		rx.add(record, "fee1", tot_dm_igavfee1);                                                                            
		rx.add(record, "fee1", tot_avg_dm_amt1 == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(tot_avg_dm_amt1,2));                    
//		rx.add(record, "fee1", "0.00%");                                                                                    
			                                                                                                            
		record = rx.add(gridData, "record", "");                                                                            
		                                                                                                                    
		rx.add(record, "medi_nm", "합계");                                                                                  
        rx.add(record, "gubun", "입   금   액");                                                                                    
        rx.add(record, "fee2", tot_gjavfee2);                                                                                       
        rx.add(record, "fee2", tot_igavfee2);                                                                                       
        rx.add(record, "fee2", tot_nu_igavfee2);                                                                                    
		rx.add(record, "fee2", tot_avg_amt2 == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(tot_avg_amt2,2));                    
		rx.add(record, "fee2", tot_jan_amt2);                                                                               
		rx.add(record, "fee2", tot_dm_igavfee2);                                                                            
		rx.add(record, "fee2", tot_avg_dm_amt2 == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(tot_avg_dm_amt2,2));                    
//		rx.add(record, "fee2", "0.00%");                                                                                    
                                                                                                                                    
        record = rx.add(gridData, "record", "");                                                                                    
		                                                                                                                    
		rx.add(record, "medi_nm", "합계");                                                                                  
        rx.add(record, "gubun", "누         계");                                                                                   
        rx.add(record, "fee3", tot_gjavfee3);                                                                                       
        rx.add(record, "fee3", tot_igavfee3);                                                                                       
        rx.add(record, "fee3", tot_nu_igavfee3);                                                                                    
		rx.add(record, "fee3", tot_avg_amt3 == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(tot_avg_amt3,2));                    
		rx.add(record, "fee3", tot_jan_amt3);                                                                               
		rx.add(record, "fee3", tot_dm_igavfee3);                                                                            
		rx.add(record, "fee3", tot_avg_dm_amt3 == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(tot_avg_dm_amt3,2));                    
//		rx.add(record, "fee3", "0.00%");                                                                                    
                                                                                                                                    
        record = rx.add(gridData, "record", "");                                                                                    
		                                                                                                                    
		rx.add(record, "medi_nm", "합계");                                                                                  
        rx.add(record, "gubun", "입   금   율");                                                                                    
        rx.add(record, "fee4", tot_gjavfee4);                                                                                       
        rx.add(record, "fee4", tot_igavfee4);                                                                                       
        rx.add(record, "fee4", tot_nu_igavfee4);                                                                                    
		rx.add(record, "fee4", tot_avg_amt4 == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(tot_avg_amt4,2));                    
		rx.add(record, "fee4", tot_jan_amt4);                                                                               
		rx.add(record, "fee4", tot_dm_igavfee4);                                                                            
		rx.add(record, "fee4", tot_avg_dm_amt4 == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(tot_avg_dm_amt4,2));                    
//		rx.add(record, "fee4", "0.00%");                                                                                    
                                                                                                                                    
        record = rx.add(gridData, "record", "");                                                                                    
		                                                                                                                    
		rx.add(record, "medi_nm", "합계");                                                                                  
        rx.add(record, "gubun", "잔         액");                                                                                   
        rx.add(record, "fee5", tot_gjavfee5);                                                                                       
        rx.add(record, "fee5", tot_igavfee5);                                                                                       
        rx.add(record, "fee5", tot_nu_igavfee5);                                                                                    
		rx.add(record, "fee5", tot_avg_amt5 == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(tot_avg_amt5,2));                    
		rx.add(record, "fee5", tot_jan_amt5);                                                                               
		rx.add(record, "fee5", tot_dm_igavfee5);                                                                            
		rx.add(record, "fee5", tot_avg_dm_amt5 == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(tot_avg_dm_amt5,2));                    
//		rx.add(record, "fee5", "0.00%");                                                                                    
                                                                                                                                    
        record = rx.add(gridData, "record", "");                                                                                    
		                                                                                                                    
		rx.add(record, "medi_nm", "합계");                                                                                  
        rx.add(record, "gubun", "당월분입금");                                                                                      
        rx.add(record, "fee7", tot_gjavfee7);                                                                                       
        rx.add(record, "fee7", tot_igavfee7);                                                                                       
        rx.add(record, "fee7", tot_nu_igavfee7);                                                                                    
		rx.add(record, "fee7", tot_avg_amt7 == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(tot_avg_amt7,2));                    
		rx.add(record, "fee7", tot_jan_amt7);                                                                               
		rx.add(record, "fee7", tot_dm_igavfee7);                                                                            
		rx.add(record, "fee7", tot_avg_dm_amt7 == 0.0 ? "0.00%" : DigitUtil.cutUnderPoint(tot_avg_dm_amt7,2));                    
//		rx.add(record, "fee7", "0.00%");                                                                                    
                                                                                                                                    
        record = rx.add(gridData, "record", "");                                                                                    
		                                                                                                                    
		rx.add(record, "medi_nm", "합계");                                                                                  
        rx.add(record, "gubun", "당월입금율");                                                                                      
        rx.add(record, "tot_fee", tot_gjavfee);                                                                                     
        rx.add(record, "tot_fee", tot_igavfee);                                                                                     
        rx.add(record, "tot_fee", tot_nu_igavfee);                                                                                  
        rx.add(record, "tot_fee", tot_avg_amt);                                                                                     
        rx.add(record, "tot_fee", tot_jan_amt);                                                                                     
        rx.add(record, "tot_fee", tot_dm_igavfee);                                                                                  
        rx.add(record, "tot_fee", tot_avg_dm_amt);                                                                                 	
//		rx.add(record, "tot_fee", "0.00%");                                                                                 	
		
		
		int resForm = rx.add(resData2, "resForm", "");
		
		rx.add(resForm, "start_dt", ds.start_dt);   //금월시작일자 
		rx.add(resForm, "pubc_dt",  ds.pubc_dt);    //게재년월
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
