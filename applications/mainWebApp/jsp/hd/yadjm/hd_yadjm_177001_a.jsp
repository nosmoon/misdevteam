<%@ page import="com.oreilly.servlet.multipart.*
			     ,java.util.Hashtable
			     ,java.util.ArrayList
			     ,somo.framework.util.Util
			     ,java.lang.*
			     ,java.io.ByteArrayOutputStream
			     ,chosun.ciis.ad.common.wb.*
			     ,javax.xml.parsers.*
			     ,org.xml.sax.InputSource
			     ,org.w3c.dom.* 
			     ,com.epapyrus.api.ExportCustomFile
			     ,com.dreamsecurity.verify.DSTSPDFSig
			     ,com.dreamsecurity.jcaos.util.encoders.Base64
			     ,com.dreamsecurity.exception.DVException;" %> 
 
          
<%@ page contentType="text/html; charset=euc-kr"%>

<%
	/*
		�����̸� : hd_yadjm_177001_a.jsp 
		�ۼ����� : 2017�� 12�� 27�� �����ۼ�
		�ۼ��� : ������ 
		���� : �������갣��ȭ Ȩ�������� Ȩ�ý��� ���յʿ� ���� ���ڹ��� API �� �ű� ������Ʈ�Ǿ� �ý��ۿ� ������.
	*/
	
	System.out.println("##### 17�� �������� ���Ͼ��ε� 177001_a.jsp ��������Ѵ� #####");
	System.out.println("##### ������ ���� �� ������ ���� ����!! #####");
	
	Hashtable ht = new Hashtable();
	ArrayList attachFiles = new ArrayList();
	int upfilesize = 20 * 1024 * 1024; //ȭ�鿡���� 10M , ���������� 20M ���ε� ���ϻ���� �ٸ�. �������.

	MultipartParser multi = new MultipartParser(request, upfilesize, true, true,"EUC-KR");
	String strXml = "";
	//Part	part		= null;
	com.oreilly.servlet.multipart.Part	part		= null;
	byte[]  add_file  	= null;
	String  attcFilNm   = ""; 
	String p_pwd = "";  
 	String flag       	 	= "";
 	String emp_no       	 	= "";
	int result = 0;
	String head = "";
	String xml = "";
	boolean isSuccess = false; //�ű��߰�
	String nts_msg = ""; //�ű��߰�l
	
	for (int i = 0; (part = multi.readNextPart()) != null; i++) {
		if(part instanceof FilePart){
			if(((FilePart) part).getFileName() != null) {
				ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
				((FilePart)part).writeTo(byteArrayOutputStream);
				add_file = byteArrayOutputStream.toByteArray();
				System.out.println("##### 17�� �������� ���Ͼ��ε� add_file ===>"+add_file);
			
			
				//1.���ڹ��� ������ ������ ���� �������� �ҷ��´�.
				DSTSPDFSig dstsPdfsig = new DSTSPDFSig(); //dstsPdfsig.init ������ ���� ��ü����
				dstsPdfsig.init(add_file); //pdf ���Ϸκ��� ������ �����Ѵ�. �Ķ���ͷ� �迭�� �����Ѵ�
			
				p_pwd        	 	= Util.checkString((String)ht.get("pwd")); //ȭ�鿡�� �޾ƿ� ��й�ȣ
				System.out.println("##### 17�� �������� ���Ͼ��ε� p_pwd ===>"+p_pwd);
			    

				//2.�Էµ� PDF ������ ���ؼ� ������ ���θ� üũ�Ͽ� ������� �����Ѵ�.
			  	dstsPdfsig.tokenParse();  //pdf ���� ��ū�Ľ�annual
		  		isSuccess = dstsPdfsig.tokenVerify(); //��ū ������ �������� ������ true, ���н� false ����
				System.out.println("##### 17�� �������� ���Ͼ��ε� isSuccess ===>"+isSuccess);
		  		
				isSuccess = true; //Ȩ�ý� PDF �������� ���������� ó������ �ʾ� ������ ������������ �����Ų��.
				
				//3.������ ���� �����̸� XML ����, �����ϸ� �����޽����ڵ带 �����´�.
				if( isSuccess ){ //����
					System.out.println("##### ������ ����!! #####");
					//3-1)��ü����
					com.epapyrus.api.ExportCustomFile pdf = new ExportCustomFile();		
					System.out.println("##### ������ ����!ss #####");			

					//3-2)XML ������ ����
					byte[] buf = pdf.NTS_GetFileBufEx(add_file, p_pwd, "XML", false ); //���۷� ÷�ε� �����͸� �����Ͽ� ���۷� ���
					int v_ret	 = pdf.NTS_GetLastError(); //������ ���� �����ڵ� ���� (1:���� , 0:÷�ε����� ����, -1:�߸��� �н�����, -2:PDF������ �ƴϰų� �ջ�� ����)
					System.out.println("##### v_ret===>v_ret #####"+v_ret);
					System.out.println("##### buf �� ��!===>"+buf);
	                if ( v_ret == 1 ) {
	                	System.out.println("##### ������ ���� ������!! #####");
	   					strXml = new String( buf, "UTF-8" ); //UTF-8 , EUC-KR	   		   			
	   				 	
	   					flag       	 	= Util.checkString((String)ht.get("flag")); //ȭ�鿡�� �޾ƿ� ��(CUD �÷��� : I �� �Ѿ��. PDF ���⿡���ÿ� �����ڵ尡 ���)
						System.out.println("##### 17�� �������� ���Ͼ��ε� flag ===>"+flag);
	   					
						emp_no        	= Util.checkString((String)ht.get("emp_no")); //ȭ�鿡�� �޾ƿ� ���
						System.out.println("##### 17�� �������� ���Ͼ��ε� emp_no ===>"+emp_no);
						
					}else{
						System.out.println("##### XML �����Ͱ� ���� �������. �����ڵ� ������ : "+v_ret);
						emp_no        	= Util.checkString((String)ht.get("emp_no"));						
						//flag = Integer.toString(v_ret);
						if(v_ret == 0){
							flag ="F102";   //ǥ�ع��� ��������
						}else if(v_ret == -1){
							flag ="F103";   //��й�ȣ����
						}else if(v_ret == -2){
							flag ="F104";   //PDF ��������
						}else{
							flag ="F105";   //��Ÿ����
						}
						
						isSuccess = false;						
					}
					attcFilNm      = ((FilePart)part).getFileName();
					System.out.println("##### 17�� �������� ���Ͼ��ε� attcFilNm ===>"+attcFilNm);
					
					AttachFileVO vo  = new AttachFileVO();
					vo.setAttcFilNm(attcFilNm);
					vo.setAttcFilCont(add_file);		
					attachFiles.add(vo);	
					
				} else{ //����
					System.out.println("##### ������ ���� ������ : "+isSuccess);
					emp_no = Util.checkString((String)ht.get("emp_no"));
					flag = "F101"; //������ ���� ���� �� flag �� �����Ͽ� �޽��� ó���Ѵ�.
					nts_msg = dstsPdfsig.getTstVerifyFailInfo();
					System.out.println("##### ������ ���� ���� �޽������� : "+nts_msg);
				}
			}
		}else if(part instanceof ParamPart){
			ht.put(part.getName(), ((ParamPart)part).getStringValue());
		}
	}	
	
	System.out.println("##### ������ ���� �� ������ ���� �Ϸ�!! #####");
	System.out.println("##### XML ���� ����!! #####");
	System.out.println("##### strXml �������� : "+strXml);
	
	String adjm_rvrs_yy = "2017";  //����⵵ �ϵ��ڵ��κ�. �ų� �ٲ����(�߿�)
	String xml2 = "";
	String sNodeName = "";

	if( isSuccess ){ //������ ������ ��쿡�� �¿��
		System.out.println("##### �����0 #####");
	
		String doc_type = "";
		String seq = "";
		String att_year = "";
		String att_frmmm = ""; //2015�� �߰�
		String att_tomm = "";  //2015�� �߰�
		String att_inqrmm = ""; //2015�� �߰�
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		System.out.println("##### �����0-1 #####");
		DocumentBuilder db = factory.newDocumentBuilder();
		System.out.println("##### �����0-2 #####");
		Document doc = db.parse(new InputSource(new java.io.StringReader(strXml)));
		System.out.println("##### �����0-3 #####");
		NodeList docList = doc.getElementsByTagName("doc");
		System.out.println("##### 17�� �������� ���Ͼ��ε� docList ===>"+docList);
		
		ArrayList list= new ArrayList();
		
		for(int i = 0 ; i < docList.getLength(); i ++)
		{
			Node docNode = docList.item(i);
			if(docNode.getNodeType() == Node.ELEMENT_NODE)
			{
				
				Element docElement = (Element) docNode;
				
				NodeList typeNode = docElement.getElementsByTagName("doc_type"); //��������
				if(typeNode.item(0).getNodeType() ==Node.ELEMENT_NODE)
				{
					Element tElement = (Element) typeNode.item(0);
					doc_type = tElement.getFirstChild().getNodeValue(); 
				}
				
				NodeList seqNode = docElement.getElementsByTagName("seq"); //�Ϸù�ȣ
				if(seqNode.item(0).getNodeType() ==Node.ELEMENT_NODE)
				{
					Element sElement = (Element) seqNode.item(0);
					seq = sElement.getFirstChild().getNodeValue(); 
				}
				NodeList yearNode = docElement.getElementsByTagName("att_year"); //�ͼӳ⵵
				if(yearNode.item(0).getNodeType() ==Node.ELEMENT_NODE)
				{
					Element yElement = (Element) yearNode.item(0);
					att_year = yElement.getFirstChild().getNodeValue(); 
				}
				NodeList frmMmNode = docElement.getElementsByTagName("att_FrmMm"); //��ȸ�Ⱓ���ۿ�_2015�� �߰�
				if(frmMmNode.item(0).getNodeType() ==Node.ELEMENT_NODE)
				{
					Element frmMmElement = (Element) frmMmNode.item(0);
					att_frmmm = frmMmElement.getFirstChild().getNodeValue(); 
				}
				NodeList toMmNode = docElement.getElementsByTagName("att_ToMm"); //��ȸ�Ⱓ�����_2015�� �߰�
				if(toMmNode.item(0).getNodeType() ==Node.ELEMENT_NODE)
				{
					Element  toMmElement = (Element) toMmNode.item(0);
					att_tomm = toMmElement.getFirstChild().getNodeValue(); 
				}
				NodeList inqrMmNode = docElement.getElementsByTagName("att_inqrMm"); //��ȸ��_2015�� �߰�
				if(inqrMmNode.item(0).getNodeType() ==Node.ELEMENT_NODE)
				{
					Element inqrMmElement = (Element) inqrMmNode.item(0);
					att_inqrmm = inqrMmElement.getFirstChild().getNodeValue(); 
				}
				head = doc_type+"#"+seq+"#"+att_year+"#"+att_frmmm+"#"+att_tomm+"#"+att_inqrmm+"#";	
			}
		}
		
	//	m#rownum#cancle_yn#drvr_nm#cmpy_mang_nm#car_no#rid_pers#rid_pers_cnt#dest#start_dt#start_tm#ariv_dt#ariv_tm#rid_deptcd_nm#driv_purp_nm#req_stat_nm#tel_no#incmg_pers#incmg_dt_tm#chg_pers#chg_dt_tm#req_occr_dt#req_seq#occr_dt#seq#rid_deptcd#driv_purp#req_stat#car_modl#drvr_yn#cmpy_cd|
	//  u#13#Y#���ϼ�#����3ȣ#����4��21111#3#3#3#20121009#1800#20121009#2000#�����ȹ��#���#����#010-1260-5082#�̱��#2012-10-09 10:05:50.0###20121009#003#20121009#003#700800#3#02#�佺ī#Y#500
	// |u#14#Y#�ٳ���#����3ȣ#����4��21111#4#4#4#20121009#2000#20121009#2300#�����ȹ��#����#����#010-2103-5120#�̱��#2012-10-09 10:42:48.0###20121009#004#20121009#004#700800#2#02#�佺ī#Y#500|
	
		System.out.println("##### �����2 #####");
	
		NodeList nodeList = doc.getElementsByTagName("form");
		
		for(int index = 0 ; index < nodeList.getLength(); index ++)
		{
			System.out.println("INDEX1: " + index);
			String form_cd = "";
			String man = "";
			String resid = "";
			String name = "";
			String dat_cd = "";
			String busnid = "";
			String trade_nm = "";
			String acc_no = "";
			String edu_tp = "";
			String edu_cl = "";	 	//2017�� �����񱸺� �߰�
			String subject_nm = "";
			String course_cd = "";
			String start_dt = "";
			String end_dt = "";
			String com_cd = "";
			String pension_cd = "";
			String use_place_cd = "";
			String goods_nm = "";
			String lend_dt = "";
			String lend_kd = "";
			String house_take_dt = "";
			String mort_setup_dt = "";
			String repay_years = "";
			String lend_goods_nm = "";
			String debt = "";
			String fixed_rate_debt = "";
			String not_defer_debt = "";
			String this_year_rede_amt = "";
			String saving_gubn = "";
	   		String reg_dt = "";
			String donation_cd = "";
			String pay_method = "";
			String insu1_resid = "";    
	  		String insu1_nm = "";       
	  		String insu2_resid_1 = ""; 
	  		String insu2_nm_1 = "";     
	  		String insu2_resid_2 = "";  
	  		String insu2_nm_2 = "";     
	  		String insu2_resid_3 = "";  
	  		String insu2_nm_3 = "";     
			String amt = "";
			String mm = "";
			String dd = "";
			String fix_cd = "";
			String date = "";
			String annual = "0";
			
			String sum = "";
			String sum_y1 = "";
			String sum_y2 = "";
			String sum_y3 = "";
			String ddct = "";
			String data = "";
			String data_node = "";
			String ann_tot_amt = "";
			String tax_year_amt = "";
			String ddct_bs_ass_amt = "";
			String pre_tot_amt = ""; //2014�� �������� �߰�
			String pre_market_tot_amt = ""; //2014�� �������� �߰�
			String pre_tmoney_tot_amt = ""; //2014�� �������� �߰�
			String first_tot_amt = ""; //2014�� �������� �߰�
			String second_tot_amt = ""; //2014�� �������� �߰�
			String secu_no = ""; //2014�� �������� �߰�
			String fund_nm = ""; //2014�� �������� �߰�			
			String ftyr_tot_amt = ""; 			//2015�� �������� �߰�
			String ftyr_market_tot_amt = ""; //2015�� �������� �߰�
			String ftyr_tmoney_tot_amt = ""; //2015�� �������� �߰�			
			String first_year_tot_amt = ""; 					//2015�� �������� �߰�
			String second_year_tot_amt = ""; 					//2015�� �������� �߰�
			String inqr_strt_mm = ""; 					//2015�� �������� �߰�
			String inqr_end_mm = ""; 					//2015�� �������� �߰�
			String lend_loan_amt = ""; 					//2015�� �������� �߰�
			//String hi_yrs = ""; //2016�� �������� �߰�
			//String ltrm_yrs = "";  //2016�� �������� �߰�
			//String hi_ntf = ""; //2016�� �������� �߰�
			//String ltrm_ntf = ""; // 2016�� �������� �߰�
			//String hi_pmt = ""; // 2016�� �������� �߰�
			//String ltrm_pmt = ""; // 2016�� �������� �߰�
			//String spym = ""; // 2016�� �������� �߰�
			//String jlc = ""; // 2016�� �������� �߰�
			//String ntf = ""; // 2016�� �������� �߰�
			//String pmt = ""; // 2016�� �������� �߰�
			//String wrkp_ntf = ""; // 2016�� �������� �߰�
			//String rgn_pmt = ""; // 2016�� �������� �߰�
			//String apln = ""; // 2016�� �������� �߰�
			String sbdy_apln_sum = ""; // 2016�� �������� �߰�
			String conb_sum = ""; // 2016�� �������� �߰�
			 
			Node node = nodeList.item(index);
			if(node.getNodeType() == Node.ELEMENT_NODE)
			{
				Element element = (Element) node;
				
				form_cd = element.getAttribute("form_cd")+"#";
				
				System.out.println("form_cd: " + form_cd);
				NodeList manNode = element.getElementsByTagName("man");
				
				for(int iIndex = 0; iIndex < manNode.getLength(); iIndex++)
				{
					if(manNode.item(iIndex).getNodeType() ==Node.ELEMENT_NODE)
					{
						Element nameElement = (Element) manNode.item(iIndex);
						//resid = "8604051685918";
						//name = "������";  
						resid = nameElement.getAttribute("resid"); 
						name = nameElement.getAttribute("name");					
						pre_tot_amt = nameElement.getAttribute("pre_tot_amt"); //2014�� �������� �߰�
						pre_market_tot_amt = nameElement.getAttribute("pre_market_tot_amt"); //2014�� �������� �߰�
						pre_tmoney_tot_amt = nameElement.getAttribute("pre_tmoney_tot_amt"); //2014�� �������� �߰�
						ftyr_tot_amt = nameElement.getAttribute("ftyr_tot_amt"); 						//2015�� �������� �߰�
						ftyr_market_tot_amt = nameElement.getAttribute("ftyr_market_tot_amt"); //2015�� �������� �߰�
						ftyr_tmoney_tot_amt = nameElement.getAttribute("ftyr_tmoney_tot_amt"); //2015�� �������� �߰�
						man = resid+"#"+name+"#"+pre_tot_amt+"#"+pre_market_tot_amt+"#"+pre_tmoney_tot_amt+"#"+ftyr_tot_amt+"#"+ftyr_market_tot_amt+"#"+ftyr_tmoney_tot_amt+"#";
						
						NodeList dataNode = nameElement.getElementsByTagName("data");
						
						for(int dIndex = 0; dIndex < dataNode.getLength(); dIndex++)
						{
							
							if(dataNode.item(dIndex).getNodeType() ==Node.ELEMENT_NODE )
							{
	
								Element dataElement = (Element) dataNode.item(dIndex);
								dat_cd = dataElement.getAttribute("dat_cd"); 
								busnid = dataElement.getAttribute("busnid");
								trade_nm = dataElement.getAttribute("trade_nm");
								acc_no = dataElement.getAttribute("acc_no");
								edu_tp = dataElement.getAttribute("edu_tp"); //2014�� �������� �߰�(���� ������ �±�)
								edu_cl = dataElement.getAttribute("edu_cl"); //2017�� �����񱸺� �߰�
								use_place_cd = dataElement.getAttribute("use_place_cd");
								donation_cd = dataElement.getAttribute("donation_cd");
								first_tot_amt = dataElement.getAttribute("first_tot_amt"); //2014�� �������� �߰�
								second_tot_amt = dataElement.getAttribute("second_tot_amt"); //2014�� �������� �߰�
								secu_no = dataElement.getAttribute("secu_no"); //2014�� �������� �߰�(2013�� ������ �±� �߰�)																
								first_year_tot_amt = dataElement.getAttribute("first_year_tot_amt"); 	//2015�� �߰�
								second_year_tot_amt = dataElement.getAttribute("second_year_tot_amt"); 	//2015�� �߰�
								inqr_strt_mm = dataElement.getAttribute("inqr_strt_mm"); 	//2015�� �߰�
								inqr_end_mm = dataElement.getAttribute("inqr_end_mm"); 	//2015�� �߰�															
								
								data = head + form_cd + man + dat_cd+"#"+busnid+"#"+trade_nm+"#"+acc_no+"#"+edu_tp+"#"+edu_cl+"#"+use_place_cd+"#"+donation_cd+"#"+first_tot_amt+"#"+second_tot_amt+"#"+secu_no+"#"+first_year_tot_amt+"#"+second_year_tot_amt+"#"+inqr_strt_mm+"#"+inqr_end_mm+"#";
								System.out.println("##### �����3 #####");
								
								//System.out.println("form "+ form_cd +"man : " +man);
								
							}
							Node dNode = dataNode.item(dIndex);
							//System.out.println("form "+ form_cd.indexOf("J203Y")); 
							if(dNode.getNodeType() == Node.ELEMENT_NODE && form_cd.indexOf("J203Y") < 0) // ��������������Ա� ���ڻ�ȯ���� �������� 2017.1.17 ������
							{
								Element dElement = (Element) dNode;	
								NodeList sbdyNode = dElement.getElementsByTagName("sbdy_apln_sum");
								if(sbdyNode.getLength() != 0)
								{
									sbdy_apln_sum = sbdyNode.item(0).getFirstChild().getNodeValue();
								}
								NodeList conbNode = dElement.getElementsByTagName("conb_sum");
								if(conbNode.getLength() != 0)
								{
									conb_sum = conbNode.item(0).getFirstChild().getNodeValue();
								}
								NodeList courseNode = dElement.getElementsByTagName("course_cd");
								if(courseNode.getLength() != 0)
								{
									course_cd = courseNode.item(0).getFirstChild().getNodeValue();
								}
								NodeList subjectNode = dElement.getElementsByTagName("subject_nm");
								if(subjectNode.getLength() != 0)
								{
									subject_nm = subjectNode.item(0).getFirstChild().getNodeValue(); 
								}	
								NodeList startNode = dElement.getElementsByTagName("start_dt");
								if(startNode.getLength() != 0)
								{
									start_dt = startNode.item(0).getFirstChild().getNodeValue(); 
								}
								NodeList endNode = dElement.getElementsByTagName("end_dt");
								if(endNode.getLength() != 0)
								{
									end_dt = endNode.item(0).getFirstChild().getNodeValue(); 
								}	
								
								NodeList ataNode = dElement.getElementsByTagName("ann_tot_amt");  // 2013�⵵ �߰� 
								if(ataNode.getLength() != 0)
								{
									ann_tot_amt = ataNode.item(0).getFirstChild().getNodeValue(); 
								}
								
								NodeList tyaNode = dElement.getElementsByTagName("tax_year_amt");  // 2013�⵵ �߰� 
								if(tyaNode.getLength() != 0)
								{
									tax_year_amt = tyaNode.item(0).getFirstChild().getNodeValue(); 
								}
								
								NodeList dbaaNode = dElement.getElementsByTagName("ddct_bs_ass_amt");  // 2013�⵵ �߰� 
						    	if(dbaaNode.getLength() != 0)
								{
									ddct_bs_ass_amt = dbaaNode.item(0).getFirstChild().getNodeValue(); 
								}						    	
								
						    	NodeList fnNode = dElement.getElementsByTagName("fund_nm");  //2014�� �������� �߰�
								if(fnNode.getLength() != 0)
								{
									fund_nm = fnNode.item(0).getFirstChild().getNodeValue(); 								
									System.out.println("#####JSP ����  fund_nm ��  ===>"+fund_nm);
								}
						    	
								NodeList llaNode = dElement.getElementsByTagName("lend_loan_amt");  //2015�� �������� �߰�
								if(llaNode.getLength() != 0)
								{
									lend_loan_amt = llaNode.item(0).getFirstChild().getNodeValue(); 								
									System.out.println("#####JSP ����  lend_loan_amt ��  ===>"+lend_loan_amt);
								}
								
								NodeList sumNode = dElement.getElementsByTagName("sum");
								if(sumNode.getLength() != 0)
								{
									sum = sumNode.item(0).getFirstChild().getNodeValue();
									Element sumElement = (Element) sumNode.item(0);
									//sum_y1 = sumElement.getAttribute("sum_y1"); 
									//sum_y2 = sumElement.getAttribute("sum_y2");
									//sum_y3 = sumElement.getAttribute("sum_y3");
									//ddct = sumElement.getAttribute("ddct");
									if(sumElement.getAttribute("sum_y1").length() != 0 )
									{
										sum_y1 = sumElement.getAttribute("sum_y1"); 
									}else{
										sum_y1 = "0";
									}
									if(sumElement.getAttribute("sum_y2").length() != 0 )
									{
										sum_y2 = sumElement.getAttribute("sum_y2"); 
									}else{
										sum_y2 = "0";
									}
									if(sumElement.getAttribute("sum_y3").length() != 0 )
									{
										sum_y3 = sumElement.getAttribute("sum_y3"); 
									}else{
										sum_y3 = "0";
									}
									if(sumElement.getAttribute("ddct").length() != 0 )
									{
										ddct = sumElement.getAttribute("ddct"); 
									}else{
										ddct = "0";
									}
									//if(sumElement.getAttribute("spym").length() != 0 )
									//{
									//	spym = sumElement.getAttribute("spym"); 
									//}else{
									//	spym = "0";
									//}
									//if(sumElement.getAttribute("jlc").length() != 0 )
									//{
									//	jlc = sumElement.getAttribute("jlc"); 
									//}else{
									//	jlc = "0";
									//}
									//if(sumElement.getAttribute("ntf").length() != 0 )
									//{
									//	ntf = sumElement.getAttribute("ntf"); 
									//}else{
									//	ntf = "0";
									//}
									//if(sumElement.getAttribute("pmt").length() != 0 )
									//{
									//	pmt = sumElement.getAttribute("pmt"); 
									//}else{
									//	pmt = "0";
									//}
									//if(sumElement.getAttribute("hi_yrs").length() != 0 )
									//{
									//	hi_yrs = sumElement.getAttribute("hi_yrs"); 
									//}else{
									//	hi_yrs = "0";
									//}
									//if(sumElement.getAttribute("ltrm_yrs").length() != 0 )
									//{
									//	ltrm_yrs = sumElement.getAttribute("ltrm_yrs"); 
									//}else{
									//	ltrm_yrs = "0";
									//}
									//if(sumElement.getAttribute("hi_ntf").length() != 0 )
									//{
									//	hi_ntf = sumElement.getAttribute("hi_ntf"); 
									//}else{
									//	hi_ntf = "0";
									//}
									//if(sumElement.getAttribute("ltrm_ntf").length() != 0 )
									//{
									//	ltrm_ntf = sumElement.getAttribute("ltrm_ntf"); 
									//}else{
									//	ltrm_ntf = "0";
									//}
									//if(sumElement.getAttribute("hi_pmt").length() != 0 )
									//{
									//	hi_pmt = sumElement.getAttribute("hi_pmt"); 
									//}else{
									//	hi_pmt = "0";
									//}
									//if(sumElement.getAttribute("ltrm_pmt").length() != 0 )
									//{
									//	ltrm_pmt = sumElement.getAttribute("ltrm_pmt"); 
									//}else{
									//	ltrm_pmt = "0";
									//}
									 
								}	
								
								NodeList comNode = dElement.getElementsByTagName("com_cd");
								if(comNode.getLength() != 0) 
								{
									com_cd = comNode.item(0).getFirstChild().getNodeValue(); 
								}
								NodeList pensionNode = dElement.getElementsByTagName("pension_cd");
								if(pensionNode.getLength() != 0)
								{
									pension_cd = pensionNode.item(0).getFirstChild().getNodeValue(); 
								}
								NodeList goodsNode = dElement.getElementsByTagName("goods_nm");
								if(goodsNode.getLength() != 0)
								{
									goods_nm = goodsNode.item(0).getFirstChild().getNodeValue(); 
								}
								NodeList lendNode = dElement.getElementsByTagName("lend_dt");
								if(lendNode.getLength() != 0)
								{
									lend_dt = lendNode.item(0).getFirstChild().getNodeValue(); 
								}
								NodeList lendKdNode = dElement.getElementsByTagName("lend_kd");
								if(lendKdNode.getLength() != 0)
								{
									lend_kd = lendKdNode.item(0).getFirstChild().getNodeValue(); 
								}
								NodeList houseNode = dElement.getElementsByTagName("house_take_dt");
								if(houseNode.getLength() != 0)
								{
									house_take_dt = houseNode.item(0).getFirstChild().getNodeValue(); 
								}
								NodeList mortNode = dElement.getElementsByTagName("mort_setup_dt");
								if(mortNode.getLength() != 0)
								{
									mort_setup_dt = mortNode.item(0).getFirstChild().getNodeValue(); 
								}	
								NodeList repayNode = dElement.getElementsByTagName("repay_years");
								if(repayNode.getLength() != 0)
								{
									repay_years = repayNode.item(0).getFirstChild().getNodeValue(); 
								}	
								NodeList lendGoodsNode = dElement.getElementsByTagName("lend_goods_nm");
								if(lendGoodsNode.getLength() != 0)
								{
									lend_goods_nm = lendGoodsNode.item(0).getFirstChild().getNodeValue(); 
								}	
								NodeList debtNode = dElement.getElementsByTagName("debt");
								if(debtNode.getLength() != 0)
								{
									debt = debtNode.item(0).getFirstChild().getNodeValue(); 
								}	
								NodeList fdebtNode = dElement.getElementsByTagName("fixed_rate_debt");
								if(fdebtNode.getLength() != 0)
								{
									fixed_rate_debt = fdebtNode.item(0).getFirstChild().getNodeValue(); 
								}	
								NodeList ndebtNode = dElement.getElementsByTagName("not_defer_debt");
								if(ndebtNode.getLength() != 0)
								{
									not_defer_debt = ndebtNode.item(0).getFirstChild().getNodeValue(); 
								}	
								NodeList redeNode = dElement.getElementsByTagName("this_year_rede_amt");
								if(redeNode.getLength() != 0)
								{
									this_year_rede_amt = redeNode.item(0).getFirstChild().getNodeValue(); 
								}
								
								NodeList savingNode = dElement.getElementsByTagName("saving_gubn");
								if(savingNode.getLength() != 0)
								{
									saving_gubn = savingNode.item(0).getFirstChild().getNodeValue(); 
								}
								System.out.println("##### �����4 #####");
								
								NodeList regNode = dElement.getElementsByTagName("reg_dt");
								if(regNode.getLength() != 0)
								{
									reg_dt = regNode.item(0).getFirstChild().getNodeValue(); 
								}
								System.out.println("##### �����4 #11111");
								NodeList payNode = dElement.getElementsByTagName("pay_method");
								
								if(payNode.getLength() != 0)
								{					
										pay_method = payNode.item(0).getFirstChild().getNodeValue();
								}
								System.out.println("##### �����4 #22222");
								NodeList insu1residNode = dElement.getElementsByTagName("insu1_resid");								
								if(insu1residNode.getLength() != 0)
								{
									
									System.out.println("##### �����5 #####" + insu1residNode.getLength());
									System.out.println("##### �����5 #####" + insu1residNode.item(0));
									System.out.println("##### �����5 #####" + insu1residNode.item(0).getFirstChild());
									System.out.println("##### �����5 #####" + insu1residNode.item(0).getFirstChild().getNodeValue());
									insu1_resid = insu1residNode.item(0).getFirstChild().getNodeValue(); 
								}
								System.out.println("##### �����4 #333333");
								NodeList insu1nmNode = dElement.getElementsByTagName("insu1_nm");
								if(insu1nmNode.getLength() != 0)
								{
									insu1_nm = insu1nmNode.item(0).getFirstChild().getNodeValue();
								
								}
								NodeList insu2resid1Node = dElement.getElementsByTagName("insu2_resid_1");
								int insu2resid1Size = insu2resid1Node.getLength(); 
								for (int insu2resid1Index = 0; insu2resid1Index < insu2resid1Size; insu2resid1Index++) { 
									NodeList insu2resid1Child = insu2resid1Node.item(insu2resid1Index).getChildNodes(); 
									Node insu2resid1Column = insu2resid1Child.item(0);
									if  (insu2resid1Column != null)
									{
										insu2_resid_1 = insu2resid1Column.getNodeValue(); 
									}							
								}
								NodeList insu2nm1Node = dElement.getElementsByTagName("insu2_nm_1");
								int insu2nm1Size = insu2nm1Node.getLength(); 
								for (int insu2nm1Index = 0; insu2nm1Index < insu2nm1Size; insu2nm1Index++) { 
									NodeList insu2nm1Child = insu2nm1Node.item(insu2nm1Index).getChildNodes(); 
									Node insu2nm1Column = insu2nm1Child.item(0);
									if  (insu2nm1Column != null)
									{
										insu2_nm_1 = insu2nm1Column.getNodeValue(); 
									}							
								}
								NodeList insu2resid2Node = dElement.getElementsByTagName("insu2_resid_2");
								int insu2resid2Size = insu2resid2Node.getLength(); 
								for (int insu2resid2Index = 0; insu2resid2Index < insu2resid2Size; insu2resid2Index++) { 
									NodeList insu2resid2Child = insu2resid2Node.item(insu2resid2Index).getChildNodes(); 
									Node insu2resid2Column = insu2resid2Child.item(0);
									if  (insu2resid2Column != null)
									{
										insu2_resid_2 = insu2resid2Column.getNodeValue(); 
									}							
								}
								System.out.println("##### �����4 #44444444444");
								NodeList insu2nm2Node = dElement.getElementsByTagName("insu2_nm_2");
								int insu2nm2Size = insu2nm2Node.getLength(); 
								for (int insu2nm2Index = 0; insu2nm2Index < insu2nm2Size; insu2nm2Index++) { 
									NodeList insu2nm2Child = insu2nm2Node.item(insu2nm2Index).getChildNodes(); 
									Node insu2nm2Column = insu2nm2Child.item(0);
									if  (insu2nm2Column != null)
									{
										insu2_nm_2 = insu2nm2Column.getNodeValue(); 
									}							
								}

								NodeList insu2resid3Node = dElement.getElementsByTagName("insu2_resid_3");
								int insu2resid3Size = insu2resid3Node.getLength(); 
								for (int insu2resid3Index = 0; insu2resid3Index < insu2resid3Size; insu2resid3Index++) { 
									NodeList insu2resid3Child = insu2resid3Node.item(insu2resid3Index).getChildNodes(); 
									Node insu2resid3Column = insu2resid3Child.item(0);
									if  (insu2resid3Column != null)
									{
										insu2_resid_3 = insu2resid3Column.getNodeValue(); 
									}							
								}
								NodeList insu2nm3Node = dElement.getElementsByTagName("insu2_nm_3");
								int insu2nm3Size = insu2nm3Node.getLength(); 
								for (int insu2nm3Index = 0; insu2nm3Index < insu2nm3Size; insu2nm3Index++) { 
									NodeList insu2nm3Child = insu2nm3Node.item(insu2nm3Index).getChildNodes(); 
									Node insu2nm3Column = insu2nm3Child.item(0);
									if  (insu2nm3Column != null)
									{
										insu2_nm_3 = insu2nm3Column.getNodeValue(); 
									}							
								}
								System.out.println("##### �����4 #555555555555");
								
								NodeList amtNode = dElement.getElementsByTagName("amt");
								System.out.println(dElement.getElementsByTagName("amt"));
								//���ο���, �ǰ������� �ȹ޴´� 2016�� �߰�
								if((amtNode.getLength() != 0 && form_cd.indexOf("O101M") < 0) && (amtNode.getLength() != 0 && form_cd.indexOf("P102M") < 0))
								{	
									System.out.println("##### �����4 #6666666");
									System.out.println(amtNode.item(1));
									System.out.println(amtNode.item(2).getFirstChild());
									//System.out.println("3���� amt :"+amtNode.item(2).getFirstChild().getNodeValue());
									amt = amtNode.item(0).getFirstChild().getNodeValue(); 

								}

								//���ο���, �ǰ������� �ȹ޴´� 2016�� �߰�
								if((amtNode.getLength() != 0 && form_cd.indexOf("O101M") < 0) && (amtNode.getLength() != 0 && form_cd.indexOf("P102M") < 0)){
									System.out.println("##### �����4 #666666666666666");
									for(int amtIndex = 0; amtIndex < amtNode.getLength(); amtIndex++)
									{
										System.out.println("##### �����4 #8888888");
										amt = amtNode.item(amtIndex).getFirstChild().getNodeValue(); 
										System.out.println("##### �����4 #9999999");
										if(amtNode.item(amtIndex).getNodeType() ==Node.ELEMENT_NODE)
										{
				
											Element amtElement = (Element) amtNode.item(amtIndex);
											
											if(amtElement.getAttribute("mm").length() != 0 )
											{
												mm = amtElement.getAttribute("mm"); 
											}else{
												mm = "";
											}
											if(amtElement.getAttribute("dd").length() != 0 )
											{
												dd = amtElement.getAttribute("dd"); 
											}else{
												dd = "";
											}
											if(amtElement.getAttribute("fix_cd").length() != 0 )
											{
												fix_cd = amtElement.getAttribute("fix_cd"); 
											}else{
												fix_cd = "";
											}
											if(amtElement.getAttribute("date").length() != 0 )
											{
												date = amtElement.getAttribute("date"); 
											}else{
												date = "";
											}
											if(amtElement.getAttribute("annual").length() != 0 )
											{
												annual = amtElement.getAttribute("annual"); 
											}else{
												annual = "0";
											}
											if(amtElement.getAttribute("sum").length() != 0 )
											{
												sum = amtElement.getAttribute("sum"); 
											}else{
												sum = "";
											}
											//if(amtElement.getAttribute("apln").length() != 0 )
											//{
											//	apln = amtElement.getAttribute("apln"); 
											//}else{
											//	apln = "";
											//}
											//if(amtElement.getAttribute("wrkp_ntf").length() != 0 )
											//{
											//	wrkp_ntf = amtElement.getAttribute("wrkp_ntf"); 
											//}else{
											//	wrkp_ntf = "";
											//}
											//if(amtElement.getAttribute("rgn_pmt").length() != 0 )
											//{
											//	rgn_pmt = amtElement.getAttribute("rgn_pmt"); 
											//}else{
											//	rgn_pmt = "";
											//}
											//if(amtElement.getAttribute("hi_ntf").length() != 0 )
											//{
											//	hi_ntf = amtElement.getAttribute("hi_ntf"); 
											//}else{
											//	hi_ntf = "";
											//}
											//if(amtElement.getAttribute("ltrm_ntf").length() != 0 )
											//{
											//	ltrm_ntf = amtElement.getAttribute("ltrm_ntf"); 
											//}else{
											//	ltrm_ntf = "";
											//}
											//if(amtElement.getAttribute("hi_pmt").length() != 0 )
											//{
											//	hi_pmt = amtElement.getAttribute("hi_pmt"); 
											//}else{
											//	hi_pmt = "";
											//}
											//if(amtElement.getAttribute("ltrm_pmt").length() != 0 )
											//{
											//	ltrm_pmt = amtElement.getAttribute("ltrm_pmt"); 
											//}else{
											//	ltrm_pmt = "";
											//}
											
											//mm = amtElement.getAttribute("mm"); 
											//dd = amtElement.getAttribute("dd"); 
											//fix_cd = amtElement.getAttribute("fix_cd");
		   								    //date = amtElement.getAttribute("date");
											//annual = amtElement.getAttribute("annual");
										}
										System.out.println("##### �����4 #777777777777");
										data_node = course_cd+"#"+subject_nm+"#"+start_dt+"#"+end_dt+"#"+com_cd+"#"+pension_cd+"#"+goods_nm+"#"+lend_dt+"#"+ lend_kd +"#"+house_take_dt+"#"+mort_setup_dt+"#"+repay_years+"#"+lend_goods_nm+"#"+debt+"#"+fixed_rate_debt+"#"+not_defer_debt+"#"+this_year_rede_amt+"#"+saving_gubn+"#"+reg_dt+"#"+pay_method+"#"+insu1_resid+"#"+insu1_nm+"#"+insu2_resid_1+"#"+insu2_nm_1+"#"+insu2_resid_2+"#"+insu2_nm_2+"#"+insu2_resid_3+"#"+insu2_nm_3+"#"+amt+"#"+sum+"#"+mm+"#"+dd+"#"+fix_cd+"#"+date+"#"+annual+"#"+sum_y1+"#"+sum_y2+"#"+sum_y3+"#"+ann_tot_amt+"#"+tax_year_amt+"#"+ddct_bs_ass_amt+"#"+fund_nm+"#"+lend_loan_amt+"#"+sbdy_apln_sum+"#"+conb_sum+"#"+ddct;

										//if(doc_type == "A"){
										//	xml = xml + "|"  + data + data_node;
										//}
										//else{
											xml = data + data_node + "|" + xml;
											
											//System.out.println("##### amtNode 0 �� �ƴҶ�  xml �� ===>"+xml);
										//}
										
		
									}
									
								}
								else
								{
									System.out.println("##### �����4 #8888888888888");
								data_node = course_cd+"#"+subject_nm+"#"+start_dt+"#"+end_dt+"#"+com_cd+"#"+pension_cd+"#"+goods_nm+"#"+lend_dt+"#"+ lend_kd +"#"+house_take_dt+"#"+mort_setup_dt+"#"+repay_years+"#"+lend_goods_nm+"#"+debt+"#"+fixed_rate_debt+"#"+not_defer_debt+"#"+this_year_rede_amt+"#"+saving_gubn+"#"+reg_dt+"#"+pay_method+"#"+insu1_resid+"#"+insu1_nm+"#"+insu2_resid_1+"#"+insu2_nm_1+"#"+insu2_resid_2+"#"+insu2_nm_2+"#"+insu2_resid_3+"#"+insu2_nm_3+"#"+amt+"#"+sum+"#"+mm+"#"+dd+"#"+fix_cd+"#"+date+"#"+annual+"#"+sum_y1+"#"+sum_y2+"#"+sum_y3+"#"+ann_tot_amt+"#"+tax_year_amt+"#"+ddct_bs_ass_amt+"#"+fund_nm+"#"+lend_loan_amt+"#"+sbdy_apln_sum+"#"+conb_sum+"#"+ddct;
									
									xml = xml + "|"  + data + data_node;
									//System.out.println("##### amtNode 0 �϶�  xml ��  ===>"+xml);
									
									//	if(form_cd == "F102Y")
									//	{
															 //   }
									//System.out.println(com_cd +" com_cd "+ pension_cd + " _" + ann_tot_amt+"#"+tax_year_amt+"#"+ddct_bs_ass_amt + " sum : "+sum );					 
								}
							
								//System.out.println("xml:"+xml);
									
							}									
						}
					}	
				}
			}
		//	System.out.println("INDEX: " + index);	
		}
		//System.out.println("66666666666666");	
		xml            = new String(xml.getBytes("euc-kr"),"ISO-8859-1");
	}
	
	if(attachFiles.size() > 0){
		request.setAttribute("ATTACH_FILES", attachFiles);
	}
		
		
%>  
<jsp:forward page="/hd/yadjm/177001">
	<jsp:param name="adjm_rvrs_yy" 		value="<%= adjm_rvrs_yy %>" />
	<jsp:param name="emp_no" 		value="<%= emp_no %>" />
	<jsp:param name="xml"  			value="<%= xml %>" />
	<jsp:param name="flag"  			value="<%=flag %>" /> 
</jsp:forward>