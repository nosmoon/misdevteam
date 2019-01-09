<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.qty.rec.*
	,	chosun.ciis.se.qty.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_qty_1010_l.jsp
* ��� : �ϰ�ǥ�̿�ó��-�ϰ�ǥ���� ���� ��ȸ
* �ۼ����� : 2009-02-16
* �ۼ��� : ��â��
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SE_QTY_1010_LDataSet ds = (SE_QTY_1010_LDataSet)request.getAttribute("ds");

	try {
		//����Ʈ �׸���� �����ϰ��� �ϴ� �׸����� ���°� ����Ʈ���� ������ ���ƾ� �Ѵ�. 
		//�׸��� �������� �����ϴ� �׸��带 �����ϴ� ����. ����Ʈ �׸��� �ϳ��� �ϳ��� jsp�� �ʿ��ϴ�.
		//RwXml�� ���� ����Ʈ�ϰ� �Ǹ� ���� ������ ��ȸ ����� �ȵȴ�.
		StringBuffer title 		= new StringBuffer("���^��ü^ȸ��^�̿�����^�߼۱�������^��������^");
		StringBuffer size 		= new StringBuffer();
		title.append(ds.title+"|");
		int r_num 				= Integer.parseInt(ds.rownum);	//�ǸŸ����� ����	
		int len 				= 6 + r_num*3;                 	//ĸ�� �迭 ����

		String[] qty_sell_net_clsf_ar;	
		qty_sell_net_clsf_ar = ds.qty_sell_net_clsf.split("\\^");		//�����ڵ�
		
		title.append("���^��ü^ȸ��^�̿�����^�߼۱�������^��������");
		String title_tmp = "";
		for ( int i = 0 ; i < r_num ; i++ ){
			title_tmp = "^"+qty_sell_net_clsf_ar[i]+"^�������^������";
			title.append(title_tmp);
		}
		
		RwText rt = new RwText(); 					//RwText ��ü ����
  		rt.setBuffering(true); 				 						//���۸� ��� ���� -> T�κ�
  		rt.setRowCnt(ds.curlist.size());											//�� ���� ����
	  	rt.setColCnt(len); 											//�� ���� ����(�߿�) �������� �Է� ���� Ʋ���� �׸��� ���� �ȵ�.
		rt.setCaption(title.toString());                            //ĸ���� �Է� 
		String titleVal = "";

		//����Ʈ �׸����� �� �÷��� ���¿� �÷��� ���̸� �Է��Ѵ�.
		String comma = "";
		for ( int i = 0 ; i < len ; i++ ){
			
			if(i==0){			//���
				rt.addColumn("input", "format:yyyy-mm;");
				size.append("85, ");
			}else if(i==1){		//��ü
				rt.addColumn("combo", "");
				size.append("100, ");
			}else if(i==2){		//ȸ��
				rt.addColumn("input", "format:9;");
				size.append("50, ");
			}else if(i==3){		//�̿�����
				rt.addColumn("inputdate", "format:yyyy-mm-dd;");
				size.append("90, ");
			}else if(i==4){		//�߼۱�������
				rt.addColumn("inputdate", "format:yyyy-mm-dd;");
				size.append("90, ");
			}else if(i==5){		//��������
				rt.addColumn("checkbox", "checkvalue:Y,N;");
				size.append("60, ");
			}else{
				
				if(i%3==0){			//�����ڵ�
					rt.addColumn("output", "visibility:hidden;");
					size.append("60");
				}else if(i%3==1){	//�������
					rt.addColumn("combo", "itemset.nodeset:/root/initData/comboSet/valaplybasiclsf/item;itemset.label.ref:label; itemset.value.ref:value; text-align:left;");
					size.append("90");
				}else if(i%3==2){	//������
					rt.addColumn("input", "format:(-)#,##0.##;");
					size.append("60");
				}
				
				if(len-1 > i) size.append(", ");
			}
						
		}

		rt.setColWidth(size.toString()); 							//�� ���̸� �Է��Ѵ�.
		rt.setColumn();
		String[] val_aply_basi_clsf_ar;	
		String[] val_rate_ar;		
		String val = "";
		int val_aply_basi_clsf_len = 0;
		int val_rate_len = 0;
		
		System.out.println("================="+ds.curlist.size());		
		//�÷��� �Է��� ���� �Է��Ѵ�.
		
		for ( int i = 0 ; i < ds.curlist.size() ; i++ ){
			SE_QTY_1010_LCURLISTRecord rec = (SE_QTY_1010_LCURLISTRecord)ds.curlist.get(i);
			//���� �÷� ���� add�ϴ� �÷� ���� ���ƾ��Ѵ�. ������ �÷��� �ݵ�� addRowValue�� �Է��ؾ��Ѵ�.

			val_aply_basi_clsf_ar = rec.val_aply_basi_clsf.split("\\^");	//�������
			val_aply_basi_clsf_len = val_aply_basi_clsf_ar.length;
			val_rate_ar = rec.val_rate.split("\\^");		//������
			val_rate_len = val_rate_ar.length;
			
			rt.addColValue(rec.yymm, "");				//���
			rt.addColValue(rec.medi_cd, "");			//��ü
			rt.addColValue(rec.tms, "");				//ȸ��
			rt.addColValue(rec.cyov_dt, "");			//�̿�����
			rt.addColValue(rec.send_basi_dt, "");		//�߼۱�������
			rt.addColValue(rec.val_meda_yn, "");		//��������
			
			for (int j=0;j<r_num;j++){
		
				rt.addColValue(qty_sell_net_clsf_ar[j], "");		//�����ڵ�
				
				if(val_aply_basi_clsf_len > j) rt.addColValue(val_aply_basi_clsf_ar[j], "");		//�������
				else rt.addColValue("", "");
									
				if ( j < r_num - 1){
					//�÷��� �������� �ƴҶ� �÷� �Է��÷�
					if(val_rate_len  > j) rt.addColValue(val_rate_ar[j], "");
					else rt.addColValue("", "");		
				} else {
					//�÷��� �������϶��� �ݵ�� addRowValue�� �Է�
					if(val_rate_len  > j) rt.addRowValue(val_rate_ar[j], "");
					else rt.addRowValue("", "");
								
				}
			
			}
				
		}
		

		out.println(rt.textFlush()); //���� ���	
	}
	catch (Exception e) {
	}

%>

<% /* �ۼ��ð� : Tue Jan 20 15:56:25 KST 2009 */ %>