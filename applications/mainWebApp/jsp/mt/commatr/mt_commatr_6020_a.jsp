<%@ page import="com.oreilly.servlet.multipart.*
			     ,java.util.Hashtable
			     ,java.util.ArrayList
			     ,somo.framework.util.Util
			     ,java.io.ByteArrayOutputStream
			     ,chosun.ciis.co.base.util.StringUtil
                 ,chosun.ciis.ad.common.wb.*" %>
<%	
	Hashtable ht = new Hashtable();
	ArrayList attachFiles = new ArrayList();
	int upfilesize = 10 * 1024 * 1024;

	MultipartParser multi = new MultipartParser(request, upfilesize, true, true,"EUC-KR");

	com.oreilly.servlet.multipart.Part	part		= null;
	byte[]  add_file  	= null;
	String  attcFilNm   = ""; 

	for (int i = 0; (part = multi.readNextPart()) != null; i++) {
		if(part instanceof FilePart){
			if(((FilePart) part).getFileName() != null) {
				ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
				((FilePart)part).writeTo(byteArrayOutputStream);
				add_file = byteArrayOutputStream.toByteArray();
				attcFilNm      = ((FilePart)part).getFileName();
				AttachFileVO vo  = new AttachFileVO();
				vo.setAttcFilNm(attcFilNm);
				vo.setAttcFilCont(add_file);		
				attachFiles.add(vo);
			}
		}else if(part instanceof ParamPart){
			ht.put(part.getName(), ((ParamPart)part).getStringValue());
		}
	}	  

	String cmpy_cd			= Util.getSessionParameterValue(request,"cmpycd",true);
	String occr_dt			= Util.checkString((String)ht.get("occr_dt"));
	String seq				= Util.checkString((String)ht.get("seq"));
	String dept_cd  		= Util.checkString((String)ht.get("dept_cd"));
	String dlco_clsf		= Util.checkString((String)ht.get("dlco_clsf"));
	String dlco_no			= Util.checkString((String)ht.get("dlco_no"));
	String chrg_pers		= Util.getSessionParameterValue(request,"emp_no",true);
//	String patr_chrg_pers  	= Util.checkString((String)ht.get("patr_chrg_pers"));
//	String titl				= Util.checkString((String)ht.get("titl"));
//	String cont				= Util.checkString((String)ht.get("cont"));
//	String tag				= Util.checkString((String)ht.get("tag"));
	String patr_chrg_pers  	= (String)ht.get("patr_chrg_pers");
	String titl				= (String)ht.get("titl");
	String cont				= (String)ht.get("cont");
	String tag				= (String)ht.get("tag");
	titl = new String(titl.getBytes("euc-kr"),"ISO-8859-1");
    cont = new String(cont.getBytes("euc-kr"),"ISO-8859-1");
    tag = new String(tag.getBytes("euc-kr"),"ISO-8859-1");
    patr_chrg_pers = new String(patr_chrg_pers.getBytes("euc-kr"),"ISO-8859-1");
	
    String team_chf_yn		= Util.checkString((String)ht.get("team_chf_yn"));
	String incmg_pers		= Util.getSessionParameterValue(request,"emp_no",true);
	String incmg_pers_ip	= request.getRemoteAddr();
	String flag       	 	= Util.checkString((String)ht.get("flag"));
	String add_file_no1  	= Util.checkString((String)ht.get("add_file_no1"));
	String add_file_no2  	= Util.checkString((String)ht.get("add_file_no2"));
	String add_file_no3  	= Util.checkString((String)ht.get("add_file_no3"));
	String add_file_no4  	= Util.checkString((String)ht.get("add_file_no4"));
	String add_file_no5  	= Util.checkString((String)ht.get("add_file_no5"));
	String add_file_no6  	= Util.checkString((String)ht.get("add_file_no6"));
	String add_file_no7  	= Util.checkString((String)ht.get("add_file_no7"));
	String add_file_no8  	= Util.checkString((String)ht.get("add_file_no8"));
	String add_file_no9  	= Util.checkString((String)ht.get("add_file_no9"));
	String add_file_no10  	= Util.checkString((String)ht.get("add_file_no10"));
	String file_delyn1    	= Util.checkString((String)ht.get("file_delyn1"));
	String file_delyn2    	= Util.checkString((String)ht.get("file_delyn2"));
	String file_delyn3    	= Util.checkString((String)ht.get("file_delyn3"));
	String file_delyn4    	= Util.checkString((String)ht.get("file_delyn4"));
	String file_delyn5    	= Util.checkString((String)ht.get("file_delyn5"));
	String file_delyn6    	= Util.checkString((String)ht.get("file_delyn6"));
	String file_delyn7    	= Util.checkString((String)ht.get("file_delyn7"));
	String file_delyn8    	= Util.checkString((String)ht.get("file_delyn8"));
	String file_delyn9    	= Util.checkString((String)ht.get("file_delyn9"));
	String file_delyn10    	= Util.checkString((String)ht.get("file_delyn10"));
	
	if(attachFiles.size() > 0){
		request.setAttribute("ATTACH_FILES", attachFiles);
	}


	cont = StringUtil.replaceString(cont,"&nbsp;",""); 
	cont = StringUtil.replaceString(cont,"&#38;#38;","&");
	cont = StringUtil.replaceString(cont,"&amp;","");
	
	cont = StringUtil.replaceString(cont,"&gt;",">");
	cont = StringUtil.replaceString(cont,"&lt;","< ");
	cont = StringUtil.replaceString(cont,"&quot;","\"");
	
	//cont = StringUtil.replaceString(cont,"&#37;"," ");


  
	//cont = StringUtil.replaceString(cont,"&quot;","&apos;");
	//cont = StringUtil.replaceString(cont,"&apos;","?");
	//  cont = StringUtil.replaceString(cont,"&quot;","\"");
	 // cont = StringUtil.replaceString(cont,"''","'");

	//cont = StringUtil.replaceString(cont,"&nbsp;","");	
	//cont = StringUtil.replaceString(cont,"&gt;",">");
	//cont = StringUtil.replaceString(cont,"&lt;","<");		
	
%>
<jsp:forward page="/mt/commatr/6020">
	<jsp:param name="cmpy_cd" 			value="<%= cmpy_cd %>" />
	<jsp:param name="occr_dt" 			value="<%= occr_dt %>" />
	<jsp:param name="seq" 				value="<%= seq %>" />
	<jsp:param name="dept_cd" 			value="<%= dept_cd %>" />
	<jsp:param name="dlco_clsf" 		value="<%= dlco_clsf %>" />
	<jsp:param name="dlco_no" 			value="<%= dlco_no %>" />
	<jsp:param name="chrg_pers" 		value="<%= chrg_pers %>" />
	<jsp:param name="patr_chrg_pers" 	value="<%= patr_chrg_pers %>" />
	<jsp:param name="titl" 				value="<%= titl %>" />
	<jsp:param name="cont" 				value="<%= cont %>" />
	<jsp:param name="tag" 				value="<%= tag %>" />
	<jsp:param name="team_chf_yn" 		value="<%= team_chf_yn %>" />
	<jsp:param name="add_file_no1" 		value="<%= add_file_no1 %>" />
	<jsp:param name="incmg_pers" 		value="<%= incmg_pers %>" />
	<jsp:param name="incmg_pers_ip" 	value="<%= incmg_pers_ip %>" />
	<jsp:param name="flag"  			value="<%= flag %>" />
	<jsp:param name="add_file_no1" 		value="<%= add_file_no1 %>" />
	<jsp:param name="add_file_no2" 		value="<%= add_file_no2 %>" />
	<jsp:param name="add_file_no3" 		value="<%= add_file_no3 %>" />
	<jsp:param name="add_file_no4" 		value="<%= add_file_no4 %>" />
	<jsp:param name="add_file_no5" 		value="<%= add_file_no5 %>" />
	<jsp:param name="add_file_no6" 		value="<%= add_file_no6 %>" />
	<jsp:param name="add_file_no7" 		value="<%= add_file_no7 %>" />
	<jsp:param name="add_file_no8" 		value="<%= add_file_no8 %>" />
	<jsp:param name="add_file_no9" 		value="<%= add_file_no9 %>" />
	<jsp:param name="add_file_no10" 	value="<%= add_file_no10 %>" />
	<jsp:param name="file_delyn1"  		value="<%= file_delyn1 %>" />
	<jsp:param name="file_delyn2"  		value="<%= file_delyn2 %>" />
	<jsp:param name="file_delyn3"  		value="<%= file_delyn3 %>" />
	<jsp:param name="file_delyn4"  		value="<%= file_delyn4 %>" />
	<jsp:param name="file_delyn5"  		value="<%= file_delyn5 %>" />
	<jsp:param name="file_delyn6"  		value="<%= file_delyn6 %>" />
	<jsp:param name="file_delyn7"  		value="<%= file_delyn7 %>" />
	<jsp:param name="file_delyn8"  		value="<%= file_delyn8 %>" />
	<jsp:param name="file_delyn9"  		value="<%= file_delyn9 %>" />
	<jsp:param name="file_delyn10"  	value="<%= file_delyn10 %>" />
</jsp:forward>


