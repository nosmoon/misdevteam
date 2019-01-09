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
* ���ϸ� : se_qty_3020_l.jsp
* ��� :   �μ����� - �߼ۺμ� - ���Ϲ߼ۺμ� ������ȸ
* �ۼ����� : 2009.03.09
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SE_QTY_3020_LDataSet ds = (SE_QTY_3020_LDataSet)request.getAttribute("ds");
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
		String[] titleArr 		= titleAr[1].split("\\^");   		//ĸ�� �迭
		
		int len 				= titleArr.length;                 	//ĸ�� �迭 ����
		
		RwText rt 				= new RwText(); 					//RwText ��ü ����
  		rt.setBuffering(true); 				 						//���۸� ��� ���� -> T�κ�
  		rt.setRowCnt(ds.curlist.size());							//�� ���� ����
	  	rt.setColCnt(len); 											//�� ���� ����(�߿�) �������� �Է� ���� Ʋ���� �׸��� ���� �ȵ�.
		rt.setCaption(title.toString());                            //ĸ���� �Է� 
		String titleVal			 = "";
		String colSize				 = "";
		//����Ʈ �׸����� �� �÷��� ���¿� �÷��� ���̸� �Է��Ѵ�.
		String comma = "";
		for ( int i = 0 ; i < len ; i++ ){
			titleVal = titleArr[i];
			
			if ("��".equals(titleVal) ){
				rt.addColumn("output", "ta:left;");
				colSize = "100";
			} else if ( "��Ʈ".equals(titleVal) ){
				rt.addColumn("output", "ta:left;");
				colSize = "100";
			} else if ( "����".equals(titleVal) ){
				rt.addColumn("output", "ta:left;");
				colSize = "90";
			} else if ( "������".equals(titleVal) ){
				rt.addColumn("output", "ta:left;");
				colSize = "100";
			} else {
				rt.addColumn("output", "ta:right;format:(-)#,###;");
				colSize = "80";
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
			SE_QTY_3020_LCURLISTRecord rec = (SE_QTY_3020_LCURLISTRecord)ds.curlist.get(i);
			//���� �÷� ���� add�ϴ� �÷� ���� ���ƾ��Ѵ�. ������ �÷��� �ݵ�� addRowValue�� �Է��ؾ��Ѵ�.
			
			qtyArr = rec.qty.split("\\^");
			for ( int j = 0 ; j < len ; j++ ){
				//���� split�� ���� �ִ� �������� �迭�� �����Ѵ�. 4^5^6^^^^^�� ��� �迭 3���� ������. 
				//�׷��� �������� �ΰ��� ������ ������ �߻���.
				if ( j == 0 ) {
					val = rec.dept_nm;
				} else if ( j == 1 ){
					val = rec.part_nm;
				} else if ( j == 2 ){
					val = rec.area_nm;
				} else if ( j == 3 ){
					val = rec.bo_nm;
				} else {
					if ( j < qtyArr.length + 4){
						val = qtyArr[j - 4];									//�̿��� ���� �ʵ� ��
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