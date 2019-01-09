
 
<%@ page import="com.oreilly.servlet.multipart.*
			     ,java.util.Hashtable
			     ,java.util.ArrayList
			     ,somo.framework.util.Util
			     ,java.io.ByteArrayOutputStream
                 ,chosun.ciis.ad.common.wb.*" %> 
 
          
<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="etiming.astdts.apl3161.TSSPdfTSTValidator"%>
<%@ page import="etiming.astdts.apl3161.CertVerifyConst" %>

<%@ page import="java.util.*" %>

<%@ page import="PDFExport.ezPDFExportFile"%>


<%@ page import="javax.xml.parsers.DocumentBuilder" %>
<%@ page import="javax.xml.parsers.DocumentBuilderFactory" %>
<%@ page import="org.xml.sax.InputSource" %>
<%@ page import="org.w3c.dom.Document" %>
<%@ page import="org.w3c.dom.Node" %>
<%@ page import="org.w3c.dom.NodeList" %>
<%@ page import="org.w3c.dom.Element" %> 

<%	
	System.out.println("되라");
	
	Hashtable ht = new Hashtable();
	ArrayList attachFiles = new ArrayList();
	int upfilesize = 10 * 1024 * 1024;


	MultipartParser multi = new MultipartParser(request, upfilesize, true, true,"EUC-KR");
	String strXml = "";
	Part	part		= null;
	byte[]  add_file  	= null;
	String  attcFilNm   = ""; 
	String p_pwd = "";  
 	String flag       	 	= "";
 	String emp_no       	 	= "";
	int result = 0;
	String kk = "";
	String head = "";
	String xml = "";
	
	for (int i = 0; (part = multi.readNextPart()) != null; i++) {
		if(part instanceof FilePart){
			if(((FilePart) part).getFileName() != null) {
				ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
				((FilePart)part).writeTo(byteArrayOutputStream);
				add_file = byteArrayOutputStream.toByteArray();
  
			//	TSSPdfTSTValidator.init( "/appstore/webserver/resin/cacerts", CertVerifyConst.NONE, null ); // 46번 서버용 
			//	TSSPdfTSTValidator.init( "/was/csi/cacerts", CertVerifyConst.NONE, null );  // 81번 서버용 
				TSSPdfTSTValidator.init( "/webstore/pub/ciis/webapps/cacerts", CertVerifyConst.NONE, null );
				// "/cacerts"는 API와 함께 배포되는 서버인증서(RoodCA.cer,CA13100001.cer)가 저장된 위치로 각 시스템에 맞게 수정 가능
				 p_pwd        	 	= Util.checkString((String)ht.get("pwd"));
				result = TSSPdfTSTValidator.validatorByte(add_file,p_pwd,p_pwd);
				
				if( result == 0 ){
					ezPDFExportFile pdf = new ezPDFExportFile();

				// 데이터 추출
					byte[] buf	= pdf.NTS_GetFileBufEx(add_file, p_pwd, "XML", false );
					int v_ret	= pdf.NTS_GetLastError();
					
	                if ( v_ret == 1 ) {
	   					 strXml = new String( buf, "UTF-8" );
						// 정상적으로 추출된 데이터 활용하는 로직 구현 부분
						//out.print(strXml);   // 예제에서는 화면에 출력
					}
					flag       	 	= Util.checkString((String)ht.get("flag"));
					emp_no        	= Util.checkString((String)ht.get("emp_no"));
				attcFilNm      = ((FilePart)part).getFileName();
				AttachFileVO vo  = new AttachFileVO();
				vo.setAttcFilNm(attcFilNm);
				vo.setAttcFilCont(add_file);		
				attachFiles.add(vo);
				}
				else 
				{
					emp_no        	= Util.checkString((String)ht.get("emp_no"));
					flag = Integer.toString(result);
				}
			}
		}else if(part instanceof ParamPart){
			ht.put(part.getName(), ((ParamPart)part).getStringValue());
		}
	}	
	String adjm_rvrs_yy = "2012";
	String xml2 = "";
	String sNodeName = "";
	int kkkkk= 0;
	if( result == 0 ){
	//String add_file_no1  	= Util.checkString((String)ht.get("add_file_no1"));
	
	String doc_type = "";
	String seq = "";
	String att_year = "";
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	DocumentBuilder db = factory.newDocumentBuilder();
	Document doc = db.parse(new InputSource(new java.io.StringReader(strXml)));

		
	NodeList docList = doc.getElementsByTagName("doc");
	
	ArrayList list= new ArrayList();
	
	for(int i = 0 ; i < docList.getLength(); i ++)
	{
		Node docNode = docList.item(i);
		if(docNode.getNodeType() == Node.ELEMENT_NODE)
		{
			Element docElement = (Element) docNode;
			
			NodeList typeNode = docElement.getElementsByTagName("doc_type");
			if(typeNode.item(0).getNodeType() ==Node.ELEMENT_NODE)
			{
				Element tElement = (Element) typeNode.item(0);
				doc_type = tElement.getFirstChild().getNodeValue(); 
			}
			
			NodeList seqNode = docElement.getElementsByTagName("seq");
			if(seqNode.item(0).getNodeType() ==Node.ELEMENT_NODE)
			{
				Element sElement = (Element) seqNode.item(0);
				seq = sElement.getFirstChild().getNodeValue(); 
			}
			NodeList yearNode = docElement.getElementsByTagName("att_year");
			if(yearNode.item(0).getNodeType() ==Node.ELEMENT_NODE)
			{
				Element yElement = (Element) yearNode.item(0);
				att_year = yElement.getFirstChild().getNodeValue(); 
			}
			head = doc_type +"#"+ seq +"#"+ att_year +"#";	
		}
	}
	
	
//	m#rownum#cancle_yn#drvr_nm#cmpy_mang_nm#car_no#rid_pers#rid_pers_cnt#dest#start_dt#start_tm#ariv_dt#ariv_tm#rid_deptcd_nm#driv_purp_nm#req_stat_nm#tel_no#incmg_pers#incmg_dt_tm#chg_pers#chg_dt_tm#req_occr_dt#req_seq#occr_dt#seq#rid_deptcd#driv_purp#req_stat#car_modl#drvr_yn#cmpy_cd|
//  u#13#Y#김일성#취재3호#서울4라21111#3#3#3#20121009#1800#20121009#2000#기술기획팀#행사#배정#010-1260-5082#이기웅#2012-10-09 10:05:50.0###20121009#003#20121009#003#700800#3#02#토스카#Y#500
// |u#14#Y#바나나#취재3호#서울4라21111#4#4#4#20121009#2000#20121009#2300#기술기획팀#업무#배정#010-2103-5120#이기웅#2012-10-09 10:42:48.0###20121009#004#20121009#004#700800#2#02#토스카#Y#500|
	
	
	
	
	NodeList nodeList = doc.getElementsByTagName("form");
	
	for(int index = 0 ; index < nodeList.getLength(); index ++)
	{
		String form_cd = "";
		String man = "";
		String resid = "";
		String name = "";
		String dat_cd = "";
		String busnid = "";
		String trade_nm = "";
		String acc_no = "";
		String edu_tp = "";
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
		Node node = nodeList.item(index);
	
		if(node.getNodeType() == Node.ELEMENT_NODE)
		{
			Element element = (Element) node;
			
			
			form_cd = element.getAttribute("form_cd")+"#";
			
			
			NodeList manNode = element.getElementsByTagName("man");
			
			for(int iIndex = 0; iIndex < manNode.getLength(); iIndex++)
			{
				if(manNode.item(iIndex).getNodeType() ==Node.ELEMENT_NODE)
				{
					Element nameElement = (Element) manNode.item(iIndex);
					resid = nameElement.getAttribute("resid"); 
					name = nameElement.getAttribute("name");
					man = resid+"#"+name+"#";
					
					NodeList dataNode = nameElement.getElementsByTagName("data");
					
					for(int dIndex = 0; dIndex < dataNode.getLength(); dIndex++)
					{
						
						if(dataNode.item(dIndex).getNodeType() ==Node.ELEMENT_NODE)
						{

							Element dataElement = (Element) dataNode.item(dIndex);
							dat_cd = dataElement.getAttribute("dat_cd"); 
							busnid = dataElement.getAttribute("busnid");
							trade_nm = dataElement.getAttribute("trade_nm");
							acc_no = dataElement.getAttribute("acc_no");
							edu_tp = dataElement.getAttribute("edu_tp");
							use_place_cd = dataElement.getAttribute("use_place_cd");
							donation_cd = dataElement.getAttribute("donation_cd");
							data = head + form_cd + man + dat_cd+"#"+busnid+"#"+trade_nm+"#"+acc_no+"#"+use_place_cd+"#"+donation_cd+"#";
							
						}
						Node dNode = dataNode.item(dIndex);
						if(dNode.getNodeType() == Node.ELEMENT_NODE)
						{
							Element dElement = (Element) dNode;
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
							NodeList regNode = dElement.getElementsByTagName("reg_dt");
							if(regNode.getLength() != 0)
							{
								reg_dt = regNode.item(0).getFirstChild().getNodeValue(); 
							}
							NodeList payNode = dElement.getElementsByTagName("pay_method");
							if(payNode.getLength() != 0)
							{
								pay_method = payNode.item(0).getFirstChild().getNodeValue(); 
							}
							NodeList insu1residNode = dElement.getElementsByTagName("insu1_resid");
							if(insu1residNode.getLength() != 0)
							{
								insu1_resid = insu1residNode.item(0).getFirstChild().getNodeValue(); 
							}
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
							
							
							NodeList amtNode = dElement.getElementsByTagName("amt");
							/*if(amtNode.getLength() != 0)
							{
								amt = amtNode.item(0).getFirstChild().getNodeValue(); 	
							}*/
							if(amtNode.getLength() != 0){
							for(int amtIndex = 0; amtIndex < amtNode.getLength(); amtIndex++)
							{
							
								amt = amtNode.item(amtIndex).getFirstChild().getNodeValue(); 
								
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
									
									
									//mm = amtElement.getAttribute("mm"); 
									//dd = amtElement.getAttribute("dd"); 
									//fix_cd = amtElement.getAttribute("fix_cd");
   								    //date = amtElement.getAttribute("date");
									//annual = amtElement.getAttribute("annual");
								}
								data_node = course_cd+"#"+subject_nm+"#"+start_dt+"#"+end_dt+"#"+com_cd+"#"+pension_cd+"#"+goods_nm+"#"+lend_dt+"#"+ lend_kd +"#"+house_take_dt+"#"+mort_setup_dt+"#"+repay_years+"#"+lend_goods_nm+"#"+debt+"#"+fixed_rate_debt+"#"+not_defer_debt+"#"+this_year_rede_amt+"#"+saving_gubn+"#"+reg_dt+"#"+pay_method+"#"+insu1_resid+"#"+insu1_nm+"#"+insu2_resid_1+"#"+insu2_nm_1+"#"+insu2_resid_2+"#"+insu2_nm_2+"#"+insu2_resid_3+"#"+insu2_nm_3+"#"+amt+"#"+sum+"#"+mm+"#"+dd+"#"+fix_cd+"#"+date+"#"+annual+"#"+sum_y1+"#"+sum_y2+"#"+sum_y3+"#"+ddct;
								//if(doc_type == "A"){
								//	xml = xml + "|"  + data + data_node;
								//}
								//else{
									xml = data + data_node + "|" + xml;
								//}
								

							}
							}
							else
							{
							data_node = course_cd+"#"+subject_nm+"#"+start_dt+"#"+end_dt+"#"+com_cd+"#"+pension_cd+"#"+goods_nm+"#"+lend_dt+"#"+ lend_kd +"#"+house_take_dt+"#"+mort_setup_dt+"#"+repay_years+"#"+lend_goods_nm+"#"+debt+"#"+fixed_rate_debt+"#"+not_defer_debt+"#"+this_year_rede_amt+"#"+saving_gubn+"#"+reg_dt+"#"+pay_method+"#"+insu1_resid+"#"+insu1_nm+"#"+insu2_resid_1+"#"+insu2_nm_1+"#"+insu2_resid_2+"#"+insu2_nm_2+"#"+insu2_resid_3+"#"+insu2_nm_3+"#"+amt+"#"+sum+"#"+mm+"#"+dd+"#"+fix_cd+"#"+date+"#"+annual+"#"+sum_y1+"#"+sum_y2+"#"+sum_y3+"#"+ddct;
					
								xml = xml + "|"  + data + data_node;
							}
							
								
						}
			
						
					}
				}
			}

		}
		
				
	}

	
	}
	//emp_no = "it0020";
	if(attachFiles.size() > 0){
		request.setAttribute("ATTACH_FILES", attachFiles);
	}
		
		
%>
<jsp:forward page="/hd/yadjm/127001">
	<jsp:param name="adjm_rvrs_yy" 		value="<%= adjm_rvrs_yy %>" />
	<jsp:param name="emp_no" 		value="<%= emp_no %>" />
	<jsp:param name="xml"  			value="<%= xml %>" />
	<jsp:param name="flag"  			value="<%=flag %>" /> 
</jsp:forward>