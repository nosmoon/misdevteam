<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.snd.rec.*
	,	chosun.ciis.se.snd.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_snd_2620_l.jsp
* ��� :  �Ǹ�-�߼۰���-���۴ܰ���ȸ
* �ۼ����� : 2009-02-24
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	SE_SND_2620_LDataSet ds = (SE_SND_2620_LDataSet)request.getAttribute("ds");
	String errcode 	= ""		;
	String errmsg 	= ""		;

	errcode 		= ds.errcode;
	errmsg 			= ds.errmsg	;

	try {
		//����Ʈ �׸���� �����ϰ��� �ϴ� �׸����� ���°� ����Ʈ���� ������ ���ƾ� �Ѵ�. 
		//�׸��� �������� �����ϴ� �׸��带 �����ϴ� ����. ����Ʈ �׸��� �ϳ��� �ϳ��� jsp�� �ʿ��ϴ�.
		//RwXml�� ���� ����Ʈ�ϰ� �Ǹ� ���� ������ ��ȸ ����� �ȵȴ�.
		StringBuffer title 		= new StringBuffer();
		StringBuffer size 		= new StringBuffer();
		title.append(ds.title);
		
		String[] titleArr 		= title.toString().split("\\^");   //ĸ�� �迭
		int len 				= titleArr.length;                 //ĸ�� �迭 ����
		
		RwText rt 				= new RwText(); 					//RwText ��ü ����
  		rt.setBuffering(true); 				 						//���۸� ��� ���� -> T�κ�
  		rt.setRowCnt(-1);											//�� ���� ����
	  	rt.setColCnt(len); 											//�� ���� ����(�߿�) �������� �Է� ���� Ʋ���� �׸��� ���� �ȵ�.
		rt.setCaption(title.toString());                            //ĸ���� �Է� 
		rt.setAttribute("autoresize=true");
		String titleVal			= "";

		//����Ʈ �׸����� �� �÷��� ���¿� �÷��� ���̸� �Է��Ѵ�.
		String comma 	= ""	;
		String sizeSt 	= ""	;
		for ( int i = 0 ; i < len ; i++ ){
			titleVal = titleArr[i];
			
			if ( "�ش�����".equals(titleVal) ){
				rt.addColumn("output", "ta:left;");
				sizeSt	= "265";
			} else if ( 	"�з�".equals(titleVal) 
						||  "�ܰ��뼱��".equals(titleVal) ){
				rt.addColumn("output", "ta:left;");
				sizeSt	= "100";
			} else if ( 	"����(��)".equals(titleVal) 
						||  "�Ÿ�(km)".equals(titleVal) 
						|| "���ϼ��۷�".equals(titleVal) ){
				rt.addColumn("output", "ta:right;format:#,###;");
				sizeSt	= "80";
			} else if (		"�뼱����".equals(titleVal) 
						||  "�μ�ó".equals(titleVal) 
						||  "��������".equals(titleVal) 
						||  "�ڵ�".equals(titleVal) ){
				rt.addColumn("output", "ta:center;");
				sizeSt	= String.valueOf( titleVal.length() * 25);
			} else {
				rt.addColumn("output", "ta:right;format:#,###;");
				sizeSt	= String.valueOf( (titleVal.length() * 10) + 20);
			} 
			
			if ( len - 1 > i ) {
				comma = ", ";
			} else {
				comma = "";
			}
			size.append(sizeSt + comma);
		}
		rt.setColWidth(size.toString()); 							//�� ���̸� �Է��Ѵ�.
		rt.setColumn();
		String[] qtyArr;		
		String val 				= "";
		
		//�÷��� �Է��� ���� �Է��Ѵ�.
		for ( int i = 0 ; i < ds.curlist.size() ; i++ ){
			SE_SND_2620_LCURLISTRecord rec = (SE_SND_2620_LCURLISTRecord)ds.curlist.get(i);
			//���� �÷� ���� add�ϴ� �÷� ���� ���ƾ��Ѵ�. ������ �÷��� �ݵ�� addRowValue�� �Է��ؾ��Ѵ�.

			qtyArr = rec.qty.split("\\^");
			for ( int j = 0 ; j < len ; j++ ){
				if ( j == 0 ){
					val = rec.tran_uprc_clas_nm	;					//�з�
				} else if ( j == 1 ){
					val = rec.route_clsf_nm		;					//�뼱����
				} else if ( j == 2 ){
					val = rec.tran_uprc_cd		;					//�ܰ��뼱�ڵ�
				} else if ( j == 3 ){
					val = rec.tran_uprc_route_nm;					//�ܰ��뼱��
				} else if ( j == 4 ){
					val = rec.prt_plac_nm		;					//�μ�ó
				} else if ( j == 5 ){
					val = rec.load_wgt			;					//���� �߷�
				} else if ( j == 6 ){			
					val = rec.route_lgth		;					//�뼱�Ÿ�
				} else if ( j > 6 && j <  (6 + qtyArr.length + 1) ){
					if ( j - 7 < qtyArr.length ){
						val = qtyArr[j - 7];						//�̿��� ���� �ʵ� ��
					} else {
						val = "";
					}
				} else if ( j == (6 + qtyArr.length + 1) ){
					val = rec.send_plac_nm		;					//�ش�����
				} else if ( j == (6 + qtyArr.length + 2) ){
					val = rec.tran_cost			;					//���ۺ�
				} else if ( j == (6 + qtyArr.length + 3) ){
					val = rec.aply_dt			;					//��������
				}
				
				
				if ( j < len - 1){
					rt.addColValue(val, ""); 						//�÷��� �������� �ƴҶ� �÷� �Է��÷�
				} else {
					rt.addRowValue(val, "");						//�÷��� �������϶��� �ݵ�� addRowValue�� �Է�
				}
			}
				
		}
		out.println(rt.textFlush()); //���� ���	
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
%>

<% /* �ۼ��ð� : Tue Feb 10 14:57:13 KST 2009 */ %>