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
* ���ϸ� : SE_TRG_1025_l.jsp
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
	SE_TRG_1025_LDataSet ds = (SE_TRG_1025_LDataSet)request.getAttribute("ds");

	try {
	
		StringBuffer title 		= new StringBuffer("����^��Ʈ��^������^�����^����ڸ�^");
		StringBuffer size 		= new StringBuffer();
		title.append(ds.title+"|");
		int r_num 				= Integer.parseInt(ds.colcnt);	//�ǸŸ����� ����	
		int len 				= 5 + r_num*12;                 	//ĸ�� �迭 ����
		
		title.append("����^��Ʈ��^������^�����^����ڸ�");
		String sTmpTitle = "";
		for(int i=0; i<r_num; i++){
			sTmpTitle = sTmpTitle + "^1��^2��^3��^4��^5��^6��^7��^8��^9��^10��^11��^12��";
		}
		title.append(sTmpTitle);
		
		RwText rt = new RwText(); 					//RwText ��ü ����
  		rt.setBuffering(true); 				 						//���۸� ��� ���� -> T�κ�
  		rt.setRowCnt(ds.curlist.size());							//�� ���� ����
	  	rt.setColCnt(len); 											//�� ���� ����(�߿�) �������� �Է� ���� Ʋ���� �׸��� ���� �ȵ�.
		rt.setCaption(title.toString());                            //ĸ���� �Է� 
		String titleVal = "";
	
		for ( int i = 0 ; i < len ; i++ ){
			
			if(i==0){			//����
				rt.addColumn("output", "");
				size.append("130, ");
			}else if(i==1){		//��Ʈ��
				rt.addColumn("output", "");
				size.append("140, ");
			}else if(i==2){		//������
				rt.addColumn("output", "");
				size.append("140, ");
			}else if(i==3){		//�����
				rt.addColumn("output", "");
				size.append("90, ");
			}else if(i==4){		//����ڸ�
				rt.addColumn("output", "");
				size.append("100, ");
			}else{
				rt.addColumn("output", "format:#,###;text-align:right;");
				size.append("115");
			
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
			SE_TRG_1025_LCURLISTRecord rec = (SE_TRG_1025_LCURLISTRecord)ds.curlist.get(i);
			//���� �÷� ���� add�ϴ� �÷� ���� ���ƾ��Ѵ�. ������ �÷��� �ݵ�� addRowValue�� �Է��ؾ��Ѵ�.

			trgt_ar = rec.trgt.split("\\^");
			trgt_len = trgt_ar.length;
			
			rt.addColValue(rec.dept_nm, "");			//����
			rt.addColValue(rec.part_nm, "");			//��Ʈ��
			rt.addColValue(rec.area_nm, "");			//������
			rt.addColValue(rec.chrg_pers, "");			//�����
			rt.addColValue(rec.chrg_flnm, "");			//����ڸ�
			
			for (int j=0;j<trgt_len;j++){
		
				if ( j < trgt_len - 1){
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
