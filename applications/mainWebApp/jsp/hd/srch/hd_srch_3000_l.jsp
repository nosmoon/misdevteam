<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.srch.rec.*
	,	chosun.ciis.hd.srch.ds.*;
	"
%>

<%
	HD_SRCH_3000_LDataSet ds = (HD_SRCH_3000_LDataSet)request.getAttribute("ds");
	String errcode = "";
	String errmsg = "";

	errcode = ds.errcode;
	errmsg = ds.errmsg;

	try {
		//����Ʈ �׸���� �����ϰ��� �ϴ� �׸����� ���°� ����Ʈ���� ������ ���ƾ� �Ѵ�. 
		//�׸��� �������� �����ϴ� �׸��带 �����ϴ� ����. ����Ʈ �׸��� �ϳ��� �ϳ��� jsp�� �ʿ��ϴ�.
		//RwXml�� ���� ����Ʈ�ϰ� �Ǹ� ���� ������ ��ȸ ����� �ȵȴ�.
		StringBuffer title 		= new StringBuffer("����^");
		StringBuffer size 		= new StringBuffer();
		title.append(ds.title);
		String[] titleArr 		= title.toString().split("\\^");   //ĸ�� �迭
		int len 				= titleArr.length;                 //ĸ�� �迭 ����
		
		RwText rt 				= new RwText(); 					//RwText ��ü ����
  		rt.setBuffering(true); 				 						//���۸� ��� ���� -> T�κ�
  		rt.setRowCnt(ds.sendlist.size());											//�� ���� ����
	  	rt.setColCnt(len); 											//�� ���� ����(�߿�) �������� �Է� ���� Ʋ���� �׸��� ���� �ȵ�.
		rt.setCaption(title.toString());                            //ĸ���� �Է� 
		String titleVal			 = "";
		
		//����Ʈ �׸����� �� �÷��� ���¿� �÷��� ���̸� �Է��Ѵ�.
		String comma = "";
		for ( int i = 0 ; i < len ; i++ ){
			titleVal = titleArr[i];
			if ( "����".equals(titleVal) ){
				rt.addColumn("output", "ta:center;");
//			} else if ( "�����ϼ�" .equals(titleVal) ) {
//				rt.addColumn("output", "format:#,###;ta:center;");
			} else {
				rt.addColumn("output", "ta:center;");
			}
			if ( len - 1 > i ) {
				comma = ", ";
			} else {
				comma = "";
			}
			if ( "����".equals(titleVal) ){
				size.append("55" + comma);
	//		} else if ( "�����ϼ�" .equals(titleVal) ) {
	//			size.append("75" + comma);
			} else {
				if(titleVal.length() <=4){
					size.append("130" + comma);
				}else{
					size.append("130" + comma);
				}
			}
			//size.append("75" + comma);
		}
		rt.setColWidth(size.toString()); 							//�� ���̸� �Է��Ѵ�.
		rt.setColumn();
		String[] amtArr;		
		String val 				= "";
		
		//�÷��� �Է��� ���� �Է��Ѵ�.
		for ( int i = 0 ; i < ds.sendlist.size() ; i++ ){
			HD_SRCH_3000_LSENDLISTRecord rec = (HD_SRCH_3000_LSENDLISTRecord)ds.sendlist.get(i);
			//���� �÷� ���� add�ϴ� �÷� ���� ���ƾ��Ѵ�. ������ �÷��� �ݵ�� addRowValue�� �Է��ؾ��Ѵ�.
		
			amtArr = rec.emp.split("\\^") ;
			System.out.println("  len :" +len );
			for ( int j = 0 ; j < len ; j++ ){
				System.out.println("  j :" + j );
				if ( j == 0 ){
					val = rec.aprv_in_cmpy ;						    	//��ü
					System.out.println(" val : " + val );
//				} else if ( j == 1 ){
//					val = rec.bhilsu;								//�����ϼ�
				} else {
					if ( j-1  < amtArr.length ){
						val = amtArr[j-1];						//�̿��� ���� �ʵ� ��
					} else {
						val = "";
					}
				}
				if ( j < len -1 ){
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

<% /* �ۼ��ð� : Tue Jan 20 15:56:25 KST 2009 */ %>

<% /* �ۼ��ð� : Fri Feb 21 18:53:11 KST 2014 */ %>