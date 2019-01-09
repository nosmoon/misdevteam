<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.agr.rec.*
	,	chosun.ciis.is.agr.ds.*;
	"
%>

<%
	IS_AGR_1820_LDataSet ds = (IS_AGR_1820_LDataSet)request.getAttribute("ds");
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
  		rt.setRowCnt(ds.curlist.size());							//�� ���� ����
	  	rt.setColCnt(len); 											//�� ���� ����(�߿�) �������� �Է� ���� Ʋ���� �׸��� ���� �ȵ�.
		rt.setCaption(title.toString());                            //ĸ���� �Է� 
		String titleVal			 = "";
		
		//����Ʈ �׸����� �� �÷��� ���¿� �÷��� ���̸� �Է��Ѵ�.
		String comma 	= ""	;
		String sizeSt 	= ""	;
		for ( int i = 0 ; i < len ; i++ ){
			titleVal = titleArr[i];
			if ( 	"����".equals(titleVal) ){
				rt.addColumn("output", "ta:center;visibility:hidden;");
				sizeSt	= "70";
			} else if ( "���ڵ�".equals(titleVal) ){
				rt.addColumn("output", "ta:right;visibility:hidden;");
				sizeSt	= "70";
			} else if ( "��Ʈ�ڵ�".equals(titleVal) ){
				rt.addColumn("output", "ta:right;visibility:hidden;");
				sizeSt	= "70";
			} else if ( "������ڵ�".equals(titleVal) ){
				rt.addColumn("output", "ta:right;visibility:hidden;");
				sizeSt	= "70";
			} else if ( "��".equals(titleVal) ){
				rt.addColumn("output", "ta:left;");
				sizeSt	= "70";
			} else if ( "��Ʈ".equals(titleVal) ){
				rt.addColumn("output", "ta:left;");
				sizeSt	= "70";
			} else if ( "�����".equals(titleVal) ){
				rt.addColumn("output", "ta:center;");
				sizeSt	= "70";
			} else if ( "�Ұ�".equals(titleVal) ){
				rt.addColumn("output", "ta:right;format:#,###;");
				sizeSt	= "70";			
			} else {
				rt.addColumn("output", "ta:right;format:#,###;");
				//sizeSt	= String.valueOf( (titleVal.length() <=2 ? titleVal.length() * 20 + 20 : titleVal.length() * 20));
				sizeSt	= "90";
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
			IS_AGR_1820_LCURLISTRecord rec = (IS_AGR_1820_LCURLISTRecord)ds.curlist.get(i);
			//���� �÷� ���� add�ϴ� �÷� ���� ���ƾ��Ѵ�. ������ �÷��� �ݵ�� addRowValue�� �Է��ؾ��Ѵ�.

			qtyArr = rec.amt.split("\\^");
			for ( int j = 0 ; j < len ; j++ ){
				if ( j == 0 ){
					val = rec.t_no			;					//����
				
				} else if ( j == 1 ){
					val = rec.dept_cd		;					//���ڵ�
				} else if ( j == 2 ){
					val = rec.sub_dept_cd	;					//��Ʈ�ڵ�
				} else if ( j == 3 ){
					val = rec.chrg_pers		;					//������ڵ�
				} else if ( j == 4 ){
					val = rec.dept_cd_nm	;					//��
				} else if ( j == 5 ){
					val = rec.sub_dept_cd_nm;					//��Ʈ
				} else if ( j == 6 ){
					val = rec.chrg_pers_nm	;					//�����
				} else if ( j == 7 ){
					val = rec.suply_amt		;					//�Ұ�			
				} else {
					val = qtyArr[j - 8];							//�̿��� ���� �ʵ� ��
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