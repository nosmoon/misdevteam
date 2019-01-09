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
* ���ϸ� : se_snd_1500_m.jsp
* ��� : �Ǹ� - �߼۰��� - ���庰�μ� - ���庰 �μ� ��ȸ
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
	SE_SND_1510_LDataSet ds = (SE_SND_1510_LDataSet)request.getAttribute("ds");
	String errcode = "";
	String errmsg = "";

	errcode = ds.errcode;
	errmsg = ds.errmsg;

	try {
		//����Ʈ �׸���� �����ϰ��� �ϴ� �׸����� ���°� ����Ʈ���� ������ ���ƾ� �Ѵ�. 
		//�׸��� �������� �����ϴ� �׸��带 �����ϴ� ����. ����Ʈ �׸��� �ϳ��� �ϳ��� jsp�� �ʿ��ϴ�.
		//RwXml�� ���� ����Ʈ�ϰ� �Ǹ� ���� ������ ��ȸ ����� �ȵȴ�.
		StringBuffer title 		= new StringBuffer();
		StringBuffer size 		= new StringBuffer();
		title.append(ds.title);
		
		String[] titleAr		= title.toString().split("\\|");
		String[] titleArr 		= titleAr[1].split("\\^");   //ĸ�� �迭
		
		int len 				= titleArr.length;                 //ĸ�� �迭 ����
		
		RwText rt 				= new RwText(); 					//RwText ��ü ����
  		rt.setBuffering(true); 				 						//���۸� ��� ���� -> T�κ�
  		rt.setRowCnt(-1);											//�� ���� ����
	  	rt.setColCnt(len); 											//�� ���� ����(�߿�) �������� �Է� ���� Ʋ���� �׸��� ���� �ȵ�.
		rt.setCaption(title.toString());                            //ĸ���� �Է� 
		String titleVal			 = "";
		String colSize				 = "";
		//����Ʈ �׸����� �� �÷��� ���¿� �÷��� ���̸� �Է��Ѵ�.
		String comma = "";
		for ( int i = 0 ; i < len ; i++ ){
			titleVal = titleArr[i];
			colSize = "70";
			if ( ( i + 1 ) % 3 == 1 ){
				rt.addColumn("output", "ta:center;");
			} else if ( ( i + 1 ) % 3 == 2 ) {
				rt.addColumn("output", "ta:center;");			
				colSize = "60";
			} else {
				rt.addColumn("output", "format:#,###;ta:right;");
			}
			
			if ( len - 1 > i ) {
				comma = ", ";
			} else {
				comma = "";
			}
			size.append(colSize + comma);
		}
		rt.setColWidth(size.toString()); 							//�� ���̸� �Է��Ѵ�.
		rt.setColumn();
		String[] qtyArr;		
		String val 				= "";
		//�÷��� �Է��� ���� �Է��Ѵ�.
		for ( int i = 0 ; i < ds.curlist.size() ; i++ ){
			SE_SND_1510_LCURLISTRecord rec = (SE_SND_1510_LCURLISTRecord)ds.curlist.get(i);
			//���� �÷� ���� add�ϴ� �÷� ���� ���ƾ��Ѵ�. ������ �÷��� �ݵ�� addRowValue�� �Է��ؾ��Ѵ�.

			qtyArr = rec.grid.split("\\^");
			for ( int j = 0 ; j < len ; j++ ){
				//���� split�� ���� �ִ� �������� �迭�� �����Ѵ�. 4^5^6^^^^^�� ��� �迭 3���� ������. 
				//�׷��� �������� �ΰ��� ������ ������ �߻���.
				if ( j < qtyArr.length ){
					val = qtyArr[j];									//�̿��� ���� �ʵ� ��
				} else {
					val = "";
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