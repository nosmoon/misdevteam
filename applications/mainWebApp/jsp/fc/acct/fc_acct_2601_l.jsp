<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2601_LDataSet ds = (FC_ACCT_2601_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = 0;
	int recordSet = 0;
	double tmp_per = 0;
	long amt_inc = 0;
	
	long valid_src_amt1 = 0;
	long valid_src_amt2 = 0;
	long valid_amt1 = 0;	//���
	long valid_amt2 = 0;	//����
	
	//double amt_per = 0;
	String amt_per = "0";
	String valid_result1 = "";	//�����
	String valid_result2 = "";	//������
	String valid_logic  = "";
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	tempData = rx.add(root, "tempData", "");
	
	String acct_type_cd = request.getParameter("acct_type_cd");

	recordSet = rx.add(tempData, "curList", "");

	for(int i = 0; i < ds.curlist.size(); i++) {
		FC_ACCT_2601_LCURLISTRecord rec = (FC_ACCT_2601_LCURLISTRecord)ds.curlist.get(i);
		
		if( rec.acct_subj_nm.equals("�ڻ�") || rec.acct_subj_nm.equals("��ä") || rec.acct_subj_nm.equals("�ں�") ) {
			int record = rx.add(recordSet, "record", "");
			
			//blank
			rx.add(record, "acct_levl", rec.acct_levl);
			rx.add(record, "acct_cd", rec.acct_cd);
			rx.addCData(record, "acct_subj_nm", rec.acct_subj_nm.replace("*", " "));
			rx.add(record, "acct_amt1", "");
			rx.add(record, "acct_amt2", "");
			rx.add(record, "acct_amt_inc", "");
			rx.add(record, "acct_amt_per", "");
							
		} else {
			if( acct_type_cd.equals("001") && rec.acct_cd.equals("010000000") ) {
				//���Ͱ�꼭 �������
				valid_amt1 = valid_amt1 + rec.acct_amt1;	//���(��������)
				valid_amt2 = valid_amt2 + rec.acct_amt2;	//����(��������)
				
			} else if( acct_type_cd.equals("002") && rec.acct_cd.equals("001009000") ) {
				//�繫����ǥ �������(�ڻ��Ѱ�)
				valid_src_amt1 = valid_src_amt1 + rec.acct_amt1;	//���(�ڻ��Ѱ�)
				valid_src_amt2 = valid_src_amt2 + rec.acct_amt2;	//����(�ڻ��Ѱ�)
				
			} else if( !rec.cmpy_cd.equals("326") && acct_type_cd.equals("002") && (rec.acct_cd.equals("002003000") || rec.acct_cd.equals("003005000")) ) {
				//�繫����ǥ �������(��ä�Ѱ�,�ں��Ѱ�)
				valid_amt1 = valid_amt1 + rec.acct_amt1;	//���(��ä�Ѱ�,�ں��Ѱ�)
				valid_amt2 = valid_amt2 + rec.acct_amt2;	//����(��ä�Ѱ�,�ں��Ѱ�)
				
			} else if( rec.cmpy_cd.equals("326") && acct_type_cd.equals("002") && (rec.acct_cd.equals("002003000") || rec.acct_cd.equals("003006000")) ) {
				//�繫����ǥ �������(��ä�Ѱ�,�ں��Ѱ�)
				valid_amt1 = valid_amt1 + rec.acct_amt1;	//���(��ä�Ѱ�,�ں��Ѱ�)
				valid_amt2 = valid_amt2 + rec.acct_amt2;	//����(��ä�Ѱ�,�ں��Ѱ�)
				
			} else if( acct_type_cd.equals("003") && rec.acct_cd.equals("006000000") ) {
				//������������ �������
				valid_amt1 = valid_amt1 + rec.acct_amt1;	//���(�����ǰ��������)
				valid_amt2 = valid_amt2 + rec.acct_amt2;	//����(�����ǰ��������)
			}
			
			if( !rec.acct_cd.equals("999999999") ) {
			
				if( rec.cmpy_cd.equals("100") && rec.acct_amt1 == 0 && rec.acct_amt2 == 0 ) {
					//���ܻ���: ���Ͱ�꼭(������ǰ����,�⸻��ǰ����)
					//         ������������(�������ǰ����, �⸻���ǰ����)
					if( (acct_type_cd.equals("001") && (rec.acct_cd.equals("002001001") || rec.acct_cd.equals("002001003")) ) ||
					    (acct_type_cd.equals("003") && (rec.acct_cd.equals("004001000") || rec.acct_cd.equals("005001000")) )
					  ) 
					{
						int record = rx.add(recordSet, "record", "");
						
						rx.add(record, "acct_levl", rec.acct_levl);
						rx.add(record, "acct_cd", rec.acct_cd);
						rx.addCData(record, "acct_subj_nm", rec.acct_subj_nm.replace("*", " "));
						rx.add(record, "acct_amt1", rec.acct_amt1+"");
						rx.add(record, "acct_amt2", rec.acct_amt2+"");
						rx.add(record, "acct_amt_inc", "0");
						rx.add(record, "acct_amt_per", "-");
					}
	
				} else {
					int record = rx.add(recordSet, "record", "");
					
					if(acct_type_cd.equals("004") || acct_type_cd.equals("005") || acct_type_cd.equals("006")) {
						amt_inc = 0;
					} else {
						amt_inc = (rec.acct_amt1-rec.acct_amt2);
					}

					if(rec.acct_amt2 == 0) {
						if(amt_inc == 0) {
							amt_per = "0";
						} else {
							amt_per = (amt_inc > 0) ? "100" : "-100";
						}
					} else {
						//tmp_per = (int)(((double)amt_inc / (double)Math.abs(rec.acct_amt2))*100);
						tmp_per = (Math.round((((double)amt_inc / (double)Math.abs(rec.acct_amt2))*100)*Math.pow(10,1))/Math.pow(10,1));
						amt_per = ((tmp_per==0) ? "-" : tmp_per+"%");
						//System.out.println("======> " + (((double)amt_inc / (double)Math.abs(rec.acct_amt2))*100));
						//System.out.println("======> " + Math.round((((double)amt_inc / (double)Math.abs(rec.acct_amt2))*100)*Math.pow(10,1))/Math.pow(10,1));
					}

					//System.out.println("======> " + acct_type_cd);
					//rx.add(record, "cmpy_cd", rec.cmpy_cd);
					rx.add(record, "acct_levl", rec.acct_levl);
					rx.add(record, "acct_cd", rec.acct_cd);
					rx.addCData(record, "acct_subj_nm", rec.acct_subj_nm.replace("*", " "));
					rx.add(record, "acct_amt1", rec.acct_amt1+"");
					rx.add(record, "acct_amt2", rec.acct_amt2+"");
					rx.add(record, "acct_amt_inc", amt_inc+"");
					rx.add(record, "acct_amt_per", amt_per);
				}
			} else {
				//�繫����ǥ�� �ƴ� ��� ��.
				if( !acct_type_cd.equals("002") ) {
					valid_src_amt1 = rec.acct_amt1;
					valid_src_amt2 = rec.acct_amt2;
				}
			}
			
		}
	}


	if(acct_type_cd.equals("001")) {
		//���Ͱ�꼭
		valid_logic = "�� ��-[ �� �� �� �� ] = �� �� �� �� ��";
	} else if(acct_type_cd.equals("002")) {
		//�繫����ǥ
		valid_logic = "�� �� �� ��  = (�� ä �� �� + �� �� �� ��)";
	} else if(acct_type_cd.equals("003")) {
		//������������
		valid_logic = "�� ��-�� �� �� ǰ  �� �� �� �� = �� �� �� ǰ  �� �� �� ��";
	}
	
	//System.out.println("���: " + valid_src_amt1 + " : " + valid_amt1);
	//System.out.println("����: " + valid_src_amt2 + " : " + valid_amt2);
	
	if(acct_type_cd.equals("004") || acct_type_cd.equals("005") || acct_type_cd.equals("006")) {
		rx.add(tempData, "valid_result1", "-");
		rx.add(tempData, "valid_result2", "-");
		rx.add(tempData, "valid_logic",   "-");
	} else {
		rx.add(tempData, "valid_result1", (valid_src_amt1 == valid_amt1) ? "OK" : "Error");
		rx.add(tempData, "valid_result2", (valid_src_amt2 == valid_amt2) ? "OK" : "Error");
		rx.add(tempData, "valid_logic", valid_logic);
	}
	
	rx.add(tempData, "errcode", errcode);
	rx.add(tempData, "errmsg", errmsg);
	
	out.println(rx.xmlFlush());
	out.println(rx.xmlEndFlush());
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<fc_acct_2601_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<acct_levl/>
				<acct_cd/>
				<acct_subj_nm/>
				<acct_amt1/>
				<acct_amt2/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2601_l>
*/
%>

<% /* �ۼ��ð� : Fri Jul 04 11:43:37 KST 2014 */ %>
