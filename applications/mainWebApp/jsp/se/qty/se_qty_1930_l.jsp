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
* ���ϸ� : se_qty_1930_l.jsp
* ��� : �߼ۺμ�����-�������� ����Ʈ
* �ۼ����� : 2009-02-26
* �ۼ��� : ��â��
---------------------------------------------------------------------------------------------------%>
 
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SE_QTY_1930_LDataSet ds = (SE_QTY_1930_LDataSet)request.getAttribute("ds");

	try {
		//����Ʈ �׸���� �����ϰ��� �ϴ� �׸����� ���°� ����Ʈ���� ������ ���ƾ� �Ѵ�. 
		//�׸��� �������� �����ϴ� �׸��带 �����ϴ� ����. ����Ʈ �׸��� �ϳ��� �ϳ��� jsp�� �ʿ��ϴ�.
		//RwXml�� ���� ����Ʈ�ϰ� �Ǹ� ���� ������ ��ȸ ����� �ȵȴ�.
		StringBuffer title 		= new StringBuffer("����^��Ʈ��^������^�߼�ó��^�����ڵ�^�߼�ó����^");
		StringBuffer size 		= new StringBuffer();
		title.append(ds.title+"|");
		int r_num 				= Integer.parseInt(ds.colcnt);	//�ǸŸ����� ����	
		int len 				= 6 + r_num*5;                 	//ĸ�� �迭 ����
		
		title.append("����^��Ʈ��^������^�߼�ó��^�����ڵ�^�߼�ó����");
		String title_tmp = "";
		for ( int i = 0 ; i < r_num ; i++ ){
			title.append("^��ü�ڵ�^���^����^���^�߼ۺμ�");
		}
		
		RwText rt = new RwText(); 					//RwText ��ü ����
  		rt.setBuffering(true); 				 						//���۸� ��� ���� -> T�κ�
  		rt.setRowCnt(ds.curlist.size());							//�� ���� ����
	  	rt.setColCnt(len); 											//�� ���� ����(�߿�) �������� �Է� ���� Ʋ���� �׸��� ���� �ȵ�.
		rt.setCaption(title.toString());                            //ĸ���� �Է� 
		String titleVal = "";
	
		String[] editable_yn_ar = ds.editable_yn.split("\\^");	
		String[] regchk_yn_ar = ds.regchk_yn.split("\\^");	
		
		//����Ʈ �׸����� �� �÷��� ���¿� �÷��� ���̸� �Է��Ѵ�.
		String comma = "";
		String sEditable = "";
		String sReg_yn = "";
		int medi_col = 0;
		for ( int i = 0 ; i < len ; i++ ){
			
			if(i==0){			//����
				rt.addColumn("output", "");
				size.append("80, ");
			}else if(i==1){		//��Ʈ��
				rt.addColumn("output", "");
				size.append("80, ");
			}else if(i==2){		//������
				rt.addColumn("output", "");//"visibility:hidden;");
				size.append("80, ");
			}else if(i==3){		//�߼�ó��
				rt.addColumn("output","");//("inputdate", "visibility:hidden;");
				size.append("170, ");
			}else if(i==4){		//�����ڵ�
				rt.addColumn("output",""); //"visibility:hidden;");
				size.append("50, ");
			}else if(i==5){		//�߼�ó����
				rt.addColumn("output",""); // "visibility:hidden;");
				size.append("30, ");
			}else{
				
				medi_col = (int)(i-1)/5;
				if("Y".equals(editable_yn_ar[medi_col-1])) sEditable = "editable:true;";
				else sEditable = "editable:false;";
				
				if("Y".equals(regchk_yn_ar[medi_col-1])) sReg_yn = "";
				else sReg_yn = "visibility:hidden;";

							
				if(i%5==1){			//��ü�ڵ�
					rt.addColumn("output","visibility:hidden;");
					size.append("100");
				}else if(i%5==2){	//���
					rt.addColumn("checkbox", "checkvalue:Y,N;"+sReg_yn);
					size.append("100");
				}else if(i%5==3){	//����
					rt.addColumn("input","format:(-)#,###;text-align:right;"+sEditable);
					size.append("100");  //140
				}else if(i%5==4){	//���
					rt.addColumn("output", "visibility:hidden;");
					
					size.append("100");
				}else if(i%5==0){	//�߼ۺμ�
					rt.addColumn("output", "format:#,###;text-align:right;");
					size.append("100");//150
				}
				
				if(len-1 > i) size.append(", ");
			}
						
		}

		rt.setColWidth(size.toString()); 							//�� ���̸� �Է��Ѵ�.
		rt.setColumn();
		
		String[] medi_cd_ar = ds.medi_cd.split("\\^");		
		String[] same_yn_ar;	
		String[] icdc_qty_ar;	
		String[] calc_qty_ar;	
		String[] issu_qty_ar;		
		int medi_cd_len = 0;	
		int same_yn_len = 0;
		int icdc_qty_len = 0;
		int calc_qty_len = 0;
		int issu_qty_len = 0;
		
		String send_plac_nm = "";
				
		//�÷��� �Է��� ���� �Է��Ѵ�.
		for ( int i = 0 ; i < ds.curlist.size() ; i++ ){
			SE_QTY_1930_LCURLISTRecord rec = (SE_QTY_1930_LCURLISTRecord)ds.curlist.get(i);
			//���� �÷� ���� add�ϴ� �÷� ���� ���ƾ��Ѵ�. ������ �÷��� �ݵ�� addRowValue�� �Է��ؾ��Ѵ�.

			same_yn_ar = rec.same_yn.split("\\^");
			icdc_qty_ar = rec.icdc_qty.split("\\^");		
			calc_qty_ar = rec.calc_qty.split("\\^");
			issu_qty_ar = rec.issu_qty.split("\\^");	
			same_yn_len = same_yn_ar.length;
			icdc_qty_len = icdc_qty_ar.length;
			calc_qty_len = calc_qty_ar.length;
			issu_qty_len = issu_qty_ar.length;
			
			rt.addColValue(rec.dept_nm, "");		//����
			rt.addColValue(rec.part_nm, "");		//��Ʈ��			
			rt.addColValue(rec.area_nm, "");			//������
			send_plac_nm = rec.send_plac_nm;
			if(!"000".equals(rec.send_plac_seq)) send_plac_nm = send_plac_nm + " ��";
			rt.addColValue(send_plac_nm, "");			//�߼�óe��
			rt.addColValue(rec.bo_cd, "");				//�����ڵ�
			rt.addColValue(rec.send_plac_seq, "");		//�߼�ó����

			for (int j=0;j<r_num;j++){
		
				rt.addColValue(medi_cd_ar[j], "");	//��ü�ڵ�
				rt.addColValue(same_yn_ar[j], "");	//�������Ͽ���	
				rt.addColValue(icdc_qty_ar[j], "");	//����	
				rt.addColValue(calc_qty_ar[j], "");	//���	
									
				if ( j < r_num - 1){
					//�÷��� �������� �ƴҶ� �÷� �Է��÷�
					rt.addColValue(issu_qty_ar[j], "");		//�߼ۺμ�
				} else {
					//�÷��� �������϶��� �ݵ�� addRowValue�� �Է�
					rt.addRowValue(issu_qty_ar[j], "");		//�߼ۺμ�
								
				}
			
			}
				
		}
		
		out.println(rt.textFlush()); //���� ���	
		
	}
	catch (Exception e) {
	}

%>
