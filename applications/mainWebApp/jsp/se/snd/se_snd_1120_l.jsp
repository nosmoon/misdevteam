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
* ���ϸ� : se_snd_1120_l.jsp
* ��� : �Ǹ� - �߼۰��� - �뼱��� - �߼۳뼱 ���� ��ȸ
* �ۼ����� : 2009.02.03
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SE_SND_1120_LDataSet ds = (SE_SND_1120_LDataSet)request.getAttribute("ds");
	String errcode = "";
	String errmsg = "";

	errcode = ds.errcode;
	errmsg = ds.errmsg;

	try {
		//����Ʈ �׸���� �����ϰ��� �ϴ� �׸����� ���°� ����Ʈ���� ������ ���ƾ� �Ѵ�. 
		//�׸��� �������� �����ϴ� �׸��带 �����ϴ� ����. ����Ʈ �׸��� �ϳ��� �ϳ��� jsp�� �ʿ��ϴ�.
		//RwXml�� ���� ����Ʈ�ϰ� �Ǹ� ���� ������ ��ȸ ����� �ȵȴ�.
		StringBuffer title 		= new StringBuffer("�߼�ó^����^�߼ۼ���^Ź�ۼ���^��������^�����ڵ�^�߼�ó����^�����ڵ�^�뼱����^�뼱�ڵ�^");
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
			if ( len - 1 > i ) {
				comma = ", ";
			} else {
				comma = "";
			}			
			if ( "�߼�ó".equals(titleVal) ){
				rt.addColumn("inputbutton", "ta:left;");
				size.append("80" + comma);
			} else if ( "�߼ۼ���" .equals(titleVal) || "Ź�ۼ���".equals(titleVal) ) {
				rt.addColumn("input", "format:#,###;ta:right;");			
				size.append("40" + comma);
			} else if ( "��������".equals(titleVal)) {
				rt.addColumn("checkbox", "checkvalue:1,2");
				size.append("40" + comma);
			} else if (   "�����ڵ�".equals(titleVal) 
			           || "�߼�ó����".equals(titleVal) 
			           || "�뼱����".equals(titleVal)
			           || "�뼱�ڵ�".equals(titleVal)
			           || "�����ڵ�".equals(titleVal) ){
				rt.addColumn("output", "visibility:hidden;");
				size.append("40" + comma);
			} else if ( "����".equals(titleVal) ){
				rt.addColumn("output", "format:#,###;ta:left;");
				size.append("80" + comma);
			} else {
				rt.addColumn("output", "format:#,###;ta:right;");
				//size.append((titleVal.length()*15)+"" + comma);
				size.append("50" + comma);
				
				//if(titleVal.length()>=3)
				
			}
			
			
			
		}
		rt.setColWidth(size.toString()); 							//�� ���̸� �Է��Ѵ�.
		rt.setColumn();
		String[] qtyArr;		
		String val 				= "";
		
		
		//�÷��� �Է��� ���� �Է��Ѵ�.
		for ( int i = 0 ; i < ds.sendlist.size() ; i++ ){
			SE_SND_1120_LSENDLISTRecord rec = (SE_SND_1120_LSENDLISTRecord)ds.sendlist.get(i);
			//���� �÷� ���� add�ϴ� �÷� ���� ���ƾ��Ѵ�. ������ �÷��� �ݵ�� addRowValue�� �Է��ؾ��Ѵ�.

			qtyArr = rec.qty.split("\\^");
			for ( int j = 0 ; j < len ; j++ ){
				if ( j == 0 ){
					val = rec.send_plac_nm;							//�߼�ó
				} else if ( j == 1 ){
					val = rec.area_nm;								//������
				} else if ( j == 2 ){
					val = rec.send_rank;							//�߼ۼ���
				} else if ( j == 3 ){
					val = rec.cnsg_seqo;							//Ź�ۼ���
				} else if ( j == 4 ){
					val = rec.send_mthd;							//��������
				} else if ( j == 5 ) {
					val = rec.bo_cd;								//�����ڵ�
				} else if ( j == 6 ){
					val = rec.send_plac_seq;						//�߼�ó����
				} else if ( j == 7 ){
					val = rec.area_cd;								//�����ڵ�
				} else if ( j == 8 ){
					val = rec.route_clsf;							//�뼱����
				} else if ( j == 9 ){
					val = rec.route_cd;								//�뼱�ڵ�
				} else {
					if ( j - 10 < qtyArr.length ){
						val = qtyArr[j - 10];						//�̿��� ���� �ʵ� ��
					} else {
						val = "";
					}
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

<% /* �ۼ��ð� : Tue Jan 20 15:56:25 KST 2009 */ %>