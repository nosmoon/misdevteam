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
* ���ϸ� : se_snd_1410_l.jsp
* ��� : �Ǹ� - �߼۰��� - �뼱���μ����� - �뼱���μ� ��ȸ
* �ۼ����� : 2009.01.30
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SE_SND_1410_LDataSet ds = (SE_SND_1410_LDataSet)request.getAttribute("ds");
	String errcode = "";
	String errmsg = "";

	errcode = ds.errcode;
	errmsg = ds.errmsg;

	try {
		//����Ʈ �׸���� �����ϰ��� �ϴ� �׸����� ���°� ����Ʈ���� ������ ���ƾ� �Ѵ�. 
		//�׸��� �������� �����ϴ� �׸��带 �����ϴ� ����. ����Ʈ �׸��� �ϳ��� �ϳ��� jsp�� �ʿ��ϴ�.
		//RwXml�� ���� ����Ʈ�ϰ� �Ǹ� ���� ������ ��ȸ ����� �ȵȴ�.
		StringBuffer title 		= new StringBuffer("�뼱�ڵ�^�뼱��^");
		StringBuffer size 		= new StringBuffer();
		title.append(ds.title);
		String[] titleArr 		= title.toString().split("\\^");   //ĸ�� �迭
		int len 				= titleArr.length;                 //ĸ�� �迭 ����
		
		RwText rt 				= new RwText(); 					//RwText ��ü ����
  		rt.setBuffering(true); 				 						//���۸� ��� ���� -> T�κ�
  		rt.setRowCnt(-1);											//�� ���� ����
	  	rt.setColCnt(len); 											//�� ���� ����(�߿�) �������� �Է� ���� Ʋ���� �׸��� ���� �ȵ�.
		rt.setCaption(title.toString());                            //ĸ���� �Է� 
		String titleVal			 = "";
		
		//����Ʈ �׸����� �� �÷��� ���¿� �÷��� ���̸� �Է��Ѵ�.
		String comma = "";
		for ( int i = 0 ; i < len ; i++ ){
			titleVal = titleArr[i];
			if (   "�뼱�ڵ�".equals(titleVal) ) {
				rt.addColumn("output", "ta:center;");
			} else if ( "�뼱��".equals(titleVal) ){
				rt.addColumn("output", "ta:left;");
			} else {
				rt.addColumn("output", "format:#,###;ta:right;");
			}
			
			if ( len - 1 > i ) {
				comma = ", ";
			} else {
				comma = "";
			}
			size.append("100" + comma);
		}
		rt.setColWidth(size.toString()); 							//�� ���̸� �Է��Ѵ�.
		rt.setColumn();
		String[] qtyArr;		
		String val 				= "";
		
		//�÷��� �Է��� ���� �Է��Ѵ�.
		for ( int i = 0 ; i < ds.curlist.size() ; i++ ){
			SE_SND_1410_LCURLISTRecord rec = (SE_SND_1410_LCURLISTRecord)ds.curlist.get(i);
			//���� �÷� ���� add�ϴ� �÷� ���� ���ƾ��Ѵ�. ������ �÷��� �ݵ�� addRowValue�� �Է��ؾ��Ѵ�.

			qtyArr = rec.qty.split("\\^");
			for ( int j = 0 ; j < len ; j++ ){
				if ( j == 0 ) {
					val = rec.route_cd;							//�����ڵ�Ű
				} else if ( j == 1 ){
					val = rec.route_nm;								//�߼�ó����Ű
				} else {
					if ( j - 2 < qtyArr.length ){
						val = qtyArr[j - 2];							//�̿��� ���� �ʵ� ��
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
				//System.out.println("�ڵ�="+rec.route_cd+" ��="+rec.route_nm);
		}
		out.println(rt.textFlush()); //���� ���	
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}

%>

<% /* �ۼ��ð� : Tue Jan 20 15:56:25 KST 2009 */ %>