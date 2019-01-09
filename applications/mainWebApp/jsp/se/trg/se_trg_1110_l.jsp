<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.trg.ds.*
	,	chosun.ciis.se.trg.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_trg_1110_l.jsp
* ��� : ��������ǥ��� - ������ ����
* �ۼ����� : 2009-03-20
* �ۼ��� : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	SE_TRG_1110_LDataSet ds = (SE_TRG_1110_LDataSet)request.getAttribute("ds");

	try {
	
		StringBuffer title 		= new StringBuffer("�����ڵ�^������^�����ڵ�^���͸�^��������^�߼ۺμ�");
		StringBuffer size 		= new StringBuffer();
		int r_num 				= Integer.parseInt(ds.colcnt);	//�ǸŸ����� ����	
		int len 				= 6 + r_num*2;                 	//ĸ�� �迭 ����
		
		for(int j=0; j<r_num; j++){
			title.append("^���⵵");		
		}
		for(int j=0; j<r_num; j++){
			title.append("^��ǥ�հ�");		
		}
		title.append("|");
		title.append("�����ڵ�^������^�����ڵ�^���͸�^��������^�߼ۺμ�^");
		title.append(ds.title+"^");
		title.append(ds.title);
		
		RwText rt = new RwText(); 					//RwText ��ü ����
  		rt.setBuffering(true); 				 						//���۸� ��� ���� -> T�κ�
  		rt.setRowCnt(ds.curlist.size());							//�� ���� ����
	  	rt.setColCnt(len); 											//�� ���� ����(�߿�) �������� �Է� ���� Ʋ���� �׸��� ���� �ȵ�.
		rt.setCaption(title.toString());                            //ĸ���� �Է� 
		String titleVal = "";
	
		for ( int i = 0 ; i < len ; i++ ){
			
			if(i==0){			//�����ڵ�
				rt.addColumn("output", "visibility:hidden;");
				size.append("70, ");
			}else if(i==1){		//������
				rt.addColumn("output", "");
				size.append("75, ");
			}else if(i==2){		//�����ڵ�
				rt.addColumn("output", "format:99999-999;");
				size.append("80, ");
			}else if(i==3){		//������
				rt.addColumn("output", "");
				size.append("90, ");
			}else if(i==4){		//��������
				rt.addColumn("output", "");
				size.append("60, ");
			}else if(i==5){		//�߼ۺμ�
				rt.addColumn("output", "format:#,###;text-align:right;");
				size.append("80, ");
			}else{
				rt.addColumn("output", "format:#,###;text-align:right;");
				size.append("82");
			
				if(len-1 > i) size.append(", ");
			}
						
		}

		rt.setColWidth(size.toString()); 							//�� ���̸� �Է��Ѵ�.
		rt.setColumn();
		
		String[] trgt_ar;	
		String[] prev_trgt_ar;			
		int trgt_len = 0;			
		int prev_trgt_len = 0;	
		
		String send_plac_nm = "";
				
		//�÷��� �Է��� ���� �Է��Ѵ�.
		for ( int i = 0 ; i < ds.curlist.size() ; i++ ){
			SE_TRG_1110_LCURLISTRecord rec = (SE_TRG_1110_LCURLISTRecord)ds.curlist.get(i);
			//���� �÷� ���� add�ϴ� �÷� ���� ���ƾ��Ѵ�. ������ �÷��� �ݵ�� addRowValue�� �Է��ؾ��Ѵ�.

			trgt_ar = rec.trgt.split("\\^");
			trgt_len = trgt_ar.length;
			prev_trgt_ar = rec.prev_trgt.split("\\^");
			prev_trgt_len = prev_trgt_ar.length;
			
			rt.addColValue(rec.area_cd, "");			//�����ڵ�
			rt.addColValue(rec.area_nm, "");			//������
			rt.addColValue(rec.bo_cd+rec.bo_seq, "");	//�����ڵ�
			rt.addColValue(rec.bo_nm, "");				//������
			rt.addColValue(rec.clos_yn, "");			//��������
			rt.addColValue(rec.thmmsendqty, "");		//�߼ۺμ�
			
			for (int j=0;j<r_num;j++){
		
					rt.addColValue(prev_trgt_ar[j], "");		//��ǥ
			}
			for (int j=0;j<r_num;j++){
		
				if ( j < r_num - 1){
					//�÷��� �������� �ƴҶ� �÷� �Է��÷�
					rt.addColValue(trgt_ar[j], "");		//��ǥ
				} else {
					//�÷��� �������϶��� �ݵ�� addRowValue�� �Է�
					rt.addRowValue(trgt_ar[j], "");		//��ǥ
				}
			}
		}

		out.println(rt.textFlush()); //���� ���	
	}
	catch (Exception e) {
	}

%>
