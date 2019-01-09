<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.trg.ds.*
	,	chosun.ciis.se.trg.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_trg_1010_l.jsp
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
	SE_TRG_1010_LDataSet ds = (SE_TRG_1010_LDataSet)request.getAttribute("ds");

	try {
	
		StringBuffer title 		= new StringBuffer("�׷�^�����ڵ�^������^�����^����ڸ�^��������^");
		StringBuffer size 		= new StringBuffer();
		title.append(ds.title);
		int r_num 				= Integer.parseInt(ds.colcnt);	//�ǸŸ����� ����	
		int len 				= 6 + r_num;                 	//ĸ�� �迭 ����
		
		RwText rt = new RwText(); 					//RwText ��ü ����
  		rt.setBuffering(true); 				 						//���۸� ��� ���� -> T�κ�
  		rt.setRowCnt(ds.curlist.size());							//�� ���� ����
	  	rt.setColCnt(len); 											//�� ���� ����(�߿�) �������� �Է� ���� Ʋ���� �׸��� ���� �ȵ�.
		rt.setCaption(title.toString());                            //ĸ���� �Է� 
		String titleVal = "";
	
		for ( int i = 0 ; i < len ; i++ ){
			
			if(i==0){			//�׷�
				rt.addColumn("output", "visibility:hidden;");
				size.append("20, ");
			}else if(i==1){		//�����ڵ�
				rt.addColumn("output", "visibility:hidden;");
				size.append("120, ");
			}else if(i==2){		//������
				rt.addColumn("output", "");
				size.append("120, ");
			}else if(i==3){		//�����
				rt.addColumn("output", "visibility:hidden;");
				size.append("90, ");
			}else if(i==4){		//����ڸ�
				rt.addColumn("output", "visibility:hidden;");
				size.append("100, ");
			}else if(i==5){		//��������
				rt.addColumn("output", "");
				size.append("70, ");
			}else{
				rt.addColumn("output", "format:#,###;text-align:right;");
				size.append("100");
			
				if(len-1 > i) size.append(", ");
			}
						
		}

		rt.setColWidth(size.toString()); 							//�� ���̸� �Է��Ѵ�.
		rt.setColumn();
		
		String[] trgt_ar;			
		int trgt_len = 0;	
		
		String send_plac_nm = "";
				
		//�÷��� �Է��� ���� �Է��Ѵ�.
		for ( int i = 0 ; i < ds.curlist.size() ; i++ ){
			SE_TRG_1010_LCURLISTRecord rec = (SE_TRG_1010_LCURLISTRecord)ds.curlist.get(i);
			//���� �÷� ���� add�ϴ� �÷� ���� ���ƾ��Ѵ�. ������ �÷��� �ݵ�� addRowValue�� �Է��ؾ��Ѵ�.

			trgt_ar = rec.trgt.split("\\^");
			trgt_len = trgt_ar.length;
			
			rt.addColValue("1", "");					//�׷�
			rt.addColValue(rec.area_cd, "");			//�����ڵ�
			rt.addColValue(rec.area_nm, "");			//������
			rt.addColValue(rec.chrg_pers, "");			//�����
			rt.addColValue(rec.chrg_flnm, "");			//����ڸ�
			rt.addColValue(rec.clos_yn, "");			//��������
			
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
