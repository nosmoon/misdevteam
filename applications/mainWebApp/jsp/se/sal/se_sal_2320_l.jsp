<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.sal.rec.*
	,	chosun.ciis.se.sal.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_sal_2320_l.jsp
* ��� :  �Ǹ� - ������� - ������� - �������ڷ���ȸ
* �ۼ����� : 2009-04-07
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	SE_SAL_2320_LDataSet ds = (SE_SAL_2320_LDataSet)request.getAttribute("ds");
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
			
			if ( i == 0 || i == 1 ){
				rt.addColumn("output", "ta:left;");			
				colSize = "70";
			} else if ( i == 11 ){
			 	rt.addColumn("output", "format:(-)#,###;ta:right;");			
				colSize = "90";
			} else {
				rt.addColumn("output", "format:(-)#,###;ta:right;");			
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
			SE_SAL_2320_LCURLISTRecord rec = (SE_SAL_2320_LCURLISTRecord)ds.curlist.get(i);
			//���� �÷� ���� add�ϴ� �÷� ���� ���ƾ��Ѵ�. ������ �÷��� �ݵ�� addRowValue�� �Է��ؾ��Ѵ�.

			qtyArr = rec.sub_amt.split("\\^");
			for ( int j = 0 ; j < len ; j++ ){
				//���� split�� ���� �ִ� �������� �迭�� �����Ѵ�. 4^5^6^^^^^�� ��� �迭 3���� ������. 
				//�׷��� �������� �ΰ��� ������ ������ �߻���.
				if ( j == 0 ) {
					val = rec.bo_nm;								//������
				} else if ( j == 1 ){
					val = rec.bo_head_nm;							//�������
				} else if ( j == 2 ){
					val = rec.net_sale_amt;							//��������
				} else if ( j == 3 ){
					val = rec.app_gurt;								//�߰�������
				} else if ( j == 4 ){
					val = rec.net_sale_amt_610;						//����������
				} else if ( j == 5 ){
					val = rec.smt_amt1;								//���� �Ұ�
				} else if ( j == 6 ){
					val = rec.compen_divn_amt;						//��꼭
				} else if ( j == 7 ){
					val = rec.tax_compen_divn_amt;					//���ݰ�꼭
				} else if ( j == 8 ){
					val = rec.vat_compen_divn_amt;					//�ΰ���
				} else if ( j == 9 ){
					val = rec.smt_amt2;								//���˹� �Ұ�
				} else if ( j == 10 ){
					val	= rec.pdlv_altn_amt;						//��۴�ü�ݾ�
				} else if ( j == 11 ){
					val	= rec.smt;									//�հ�
				} else {
					if ( j - 12 < qtyArr.length ){
						val = qtyArr[j - 12];						//�̿��� ���� �ʵ� ��
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

<% /* �ۼ��ð� : Tue Apr 07 17:53:34 KST 2009 */ %>