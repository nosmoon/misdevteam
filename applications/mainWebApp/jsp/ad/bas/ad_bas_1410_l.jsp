<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.bas.rec.*
	,	chosun.ciis.ad.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ad_bas_1410_l.jsp
* ��� : 
* �ۼ����� : 2009-03-05
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	AD_BAS_1410_LDataSet ds = (AD_BAS_1410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");
	int record =  0;
	int j = 0;
	int k = 0;
	int seq = 1;
	String mchrg_old = "";
	String mchrg_new = "";
	String hndl_clsf_old = "";
	String space = " ";
	
	try {
	
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_1410_LCURLISTRecord rec = (AD_BAS_1410_LCURLISTRecord)ds.curlist.get(i);
			mchrg_new = rec.mchrg_pers;
			//���� ����� ���

			if(mchrg_new.equals(mchrg_old) || mchrg_old.equals("")){//�� ó���� ����� ���� �� 
				//if(j%4 == 0){
				if(mchrg_old.equals("")){//��ó�� ���
					record 		= rx.add(gridData, "record", "");
					rx.add(record, "mchrg_pers", rec.mchrg_pers);
					mchrg_old 	= rec.mchrg_pers;
					hndl_clsf_old = rec.hndl_clsf;
					rx.add(record, "seq", seq);
					rx.add(record, "mchrg_nm", rec.mchrg_nm);
					if(!"".equals(rec.chrg_area)){//����� ������� ǥ��  
						rx.add(record, "chrg_area", rec.chrg_area);	
					}else{
						rx.add(record, "chrg_area", space);
					} 
				}
				if(j<4){//�ŷ�ó����  �ι�° ĭ���� 4��° ĭ����(�� ù �ٿ����� ù��° ĭ������ ���) 
					if(hndl_clsf_old.equals(rec.hndl_clsf)){//���ó�� ������
						rx.add(record, "dlco_no" + j, rec.dlco_no);
						rx.add(record, "dlco_nm" + j, rec.dlco_nm+"("+rec.dlco_no+")");						
						//rx.add(record, "dlco_nm" + j, rec.dlco_nm+"("+rec.mchrg_nm+")-"+j);
//						hndl_clsf_old = rec.hndl_clsf;
					}else{
						for(k=j;k<4;k++){//���ó�� �ٸ��� ����ó��  	
							rx.add(record, "dlco_no" + k, " ");
							rx.add(record, "dlco_nm" + k, " ");	
							j++;
						}
					}					
				}
				if(j>3){//�ŷ�ó����  �� �ٲ�� ù��° ĭ���� ��� 
					j=0;//l=0;
					//����/����ڿ� �ŷ�ó�� ���߱� ���ؼ� 
					record 		= rx.add(gridData, "record", "");
					rx.add(record, "mchrg_pers", rec.mchrg_pers);
					mchrg_old 	= rec.mchrg_pers;
	///				hndl_clsf_old = rec.hndl_clsf;
					rx.add(record, "seq", seq);
					rx.add(record, "mchrg_nm", rec.mchrg_nm);
					if(!"".equals(rec.chrg_area)){//����� ������� ǥ��  
						rx.add(record, "chrg_area", rec.chrg_area);	
					}else{
						rx.add(record, "chrg_area", space);
					} 	
					//				
					rx.add(record, "dlco_no" + j, rec.dlco_no);
					rx.add(record, "dlco_nm" + j, rec.dlco_nm+"("+rec.dlco_no+")");
					//rx.add(record, "dlco_nm" + j, rec.dlco_nm+"("+rec.mchrg_nm+")+"+j);
		
				}
				hndl_clsf_old = rec.hndl_clsf;
			    j++;			 		
			}//if
			//�ٸ� ����� ��� 
			if(!mchrg_new.equals(mchrg_old)){
			
			   	for(k=j;k<4;k++){//��������� �ٸ� ��� ���� ���� ���� ó�� 	
					rx.add(record, "dlco_no" + k, " ");
					rx.add(record, "dlco_nm" + k, " ");	
				}	
				record = rx.add(gridData, "record", "");
				rx.add(record, "mchrg_pers", rec.mchrg_pers);
				mchrg_old = rec.mchrg_pers;
				seq = seq + 1;
				rx.add(record, "seq", seq);
				rx.add(record, "mchrg_nm", rec.mchrg_nm);
				if(!rec.chrg_area.equals("") ){//����� ������� ǥ��  
					rx.add(record, "chrg_area", rec.chrg_area);	
				}else{
					rx.add(record, "chrg_area", space); 
				} 
				j=0;
				if(j<4){//����� �ٸ� �� ù�� ù��° ĭ���� ��� 
					rx.add(record, "dlco_no" + j, rec.dlco_no);
					rx.add(record, "dlco_nm" + j, rec.dlco_nm+"("+rec.dlco_no+")");
					//rx.add(record, "dlco_nm" + j, rec.dlco_nm+"("+rec.mchrg_nm+")$$"+j);
					j++;
				}				
				hndl_clsf_old = rec.hndl_clsf;
			}

			
		}//for

	rx.add(resData, "cnt_advt", ds.cnt_advt);
	rx.add(resData, "cnt_agn", ds.cnt_agn);
			
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
