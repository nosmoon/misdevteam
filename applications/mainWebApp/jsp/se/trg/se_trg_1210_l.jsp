<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.trg.rec.*
	,	chosun.ciis.se.trg.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_trg_1210_l.jsp
* ��� : ��ǥ�����ȸ-���� ����
* �ۼ����� : 2009-04-02
* �ۼ��� : ��â��
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SE_TRG_1210_LDataSet ds = (SE_TRG_1210_LDataSet)request.getAttribute("ds");

	try {
		//����Ʈ �׸���� �����ϰ��� �ϴ� �׸����� ���°� ����Ʈ���� ������ ���ƾ� �Ѵ�. 
		//�׸��� �������� �����ϴ� �׸��带 �����ϴ� ����.  ����Ʈ �׸��� �ϳ��� �ϳ��� jsp�� �ʿ��ϴ�.
		//RwXml�� ���� ����Ʈ�ϰ� �Ǹ� ���� ������ ��ȸ ����� �ȵȴ�.
		StringBuffer title 		= new StringBuffer("�ڵ�^����^�ڵ�^��Ʈ��^�ڵ�^������^");
		StringBuffer size 		= new StringBuffer();
		title.append(ds.title+"|");
		int r_num 				= Integer.parseInt(ds.colcnt);	//��ǥ���� ����	
		int len 				= 6 + r_num*2;                 	//ĸ�� �迭 ����
		
		title.append("�ڵ�^����^�ڵ�^��Ʈ��^�ڵ�^������");
		String title_tmp = "";
		for ( int i = 0 ; i < r_num ; i++ ){
			title.append("^��ǥ^����");
		}
		
//System.out.println("title.toString()>>>>>>>>>"+title.toString());
		
		RwText rt = new RwText(); 									//RwText ��ü ����
  		rt.setBuffering(true); 				 						//���۸� ��� ���� -> T�κ�
  		rt.setRowCnt(ds.curlist.size());							//�� ���� ����
	  	rt.setColCnt(len); 											//�� ���� ����(�߿�) �������� �Է� ���� Ʋ���� �׸��� ���� �ȵ�.
		rt.setCaption(title.toString());                            //ĸ���� �Է� 
		String titleVal = "";
	
		//����Ʈ �׸����� �� �÷��� ���¿� �÷��� ���̸� �Է��Ѵ�.
		String comma = "";
		String sEditable = "";
		String sDisable = "";
		String sReg_yn = "";
		int medi_col = 0;
		for ( int i = 0 ; i < len ; i++ ){
			
			if(i==0){			//�ڵ�
				rt.addColumn("output", "visibility:hidden;");
				size.append("90, ");
			}else if(i==1){		//����
				rt.addColumn("output", "");
				size.append("100, ");
			}else if(i==2){		//�ڵ�
				rt.addColumn("output", "visibility:hidden;");
				size.append("90, ");
			}else if(i==3){		//��Ʈ��
				rt.addColumn("output", "");
				size.append("80, ");
			}else if(i==4){		//�ڵ�
				rt.addColumn("output", "visibility:hidden;");
				size.append("90, ");
			}else if(i==5){		//������
				rt.addColumn("output", "");
				size.append("80, ");
			}else if(i==6 || i==7){		//������
				rt.addColumn("output", "format:#,###;text-align:right;");
				size.append("85, ");
			}else if(i==8 || i==9){		//�ǵ��ڼ�
				rt.addColumn("output", "format:#,###;text-align:right;");
				size.append("85, ");
			}else{
				rt.addColumn("output", "format:#,###;text-align:right;");
				size.append("60");
			
				if(len-1 > i) size.append(", ");
			} 
						
		}

		rt.setColWidth(size.toString()); 							//�� ���̸� �Է��Ѵ�.
		rt.setColumn();
		
		String[] trgt_ar;	
		String[] rslt_ar;		
		int trgt_len = 0;	
		int rslt_len = 0;
				
		//�÷��� �Է��� ���� �Է��Ѵ�.
		for ( int i = 0 ; i < ds.curlist.size() ; i++ ){
			SE_TRG_1210_LCURLISTRecord rec = (SE_TRG_1210_LCURLISTRecord)ds.curlist.get(i);
			//���� �÷� ���� add�ϴ� �÷� ���� ���ƾ��Ѵ�. ������ �÷��� �ݵ�� addRowValue�� �Է��ؾ��Ѵ�.

			trgt_ar = rec.trgt.split("\\^");
			rslt_ar = rec.rslt.split("\\^");	
			trgt_len = trgt_ar.length;
			rslt_len = rslt_ar.length;
			
			rt.addColValue(rec.dept_cd, "");			//�ڵ�
			rt.addColValue(rec.dept_nm, "");			//����
			rt.addColValue(rec.part_cd, "");			//�ڵ�
			rt.addColValue(rec.part_nm, "");			//����
			rt.addColValue(rec.area_cd, "");			//�ڵ�
			rt.addColValue(rec.area_nm, "");			//����
						
			for (int j=0;j<r_num;j++){
		
				rt.addColValue(trgt_ar[j], "");		//��ǥ
									
				if ( j < r_num - 1){
					//�÷��� �������� �ƴҶ� �÷� �Է��÷�
					rt.addColValue(rslt_ar[j], "");		//����
				} else {
					//�÷��� �������϶��� �ݵ�� addRowValue�� �Է�
					rt.addRowValue(rslt_ar[j], "");		//����
								
				}
			
			}
				
		}

		out.println(rt.textFlush()); //���� ���	
	}
	catch (Exception e) {
	}

%>
