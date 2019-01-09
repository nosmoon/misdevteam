<%@ page import="com.oreilly.servlet.multipart.*
			     ,java.util.Hashtable
			     ,java.util.ArrayList
			     ,java.lang.*
			     ,somo.framework.util.Util
			     ,java.io.ByteArrayOutputStream
			     ,chosun.ciis.co.base.util.StringUtil
                 ,chosun.ciis.ad.common.wb.*" %>
<%	
	Hashtable ht = new Hashtable();
	ArrayList attachFiles = new ArrayList();
	int upfilesize = 10 * 1024 * 1024;

	MultipartParser multi = new MultipartParser(request, upfilesize, true, true,"EUC-KR");

	Part	part		= null;
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

	String rept_clsf		= Util.checkString((String)ht.get("rept_clsf"));
	String make_dt			= Util.checkString((String)ht.get("make_dt"));
	String rept_no			= Util.checkString((String)ht.get("rept_no"));
	String advcs_clsf  		= Util.checkString((String)ht.get("advcs_clsf"));
	String medi_clsf		= Util.checkString((String)ht.get("medi_clsf"));
	String data_clsf		= Util.checkString((String)ht.get("data_clsf"));
	String chrg_pers		= Util.checkString((String)ht.get("chrg_pers"));
	String dlco_no			= Util.checkString((String)ht.get("dlco_no"));
	String patr_chrg_pers  	= Util.checkString((String)ht.get("patr_chrg_pers"));
	String titl				= Util.checkString((String)ht.get("titl"));
	String cont				= Util.checkString((String)ht.get("cont"));
	String add_file_no1  	= Util.checkString((String)ht.get("add_file_no1"));
	String add_file_no2  	= Util.checkString((String)ht.get("add_file_no2"));
	String add_file_no3  	= Util.checkString((String)ht.get("add_file_no3"));
	String add_file_no4  	= Util.checkString((String)ht.get("add_file_no4"));
	String add_file_no5  	= Util.checkString((String)ht.get("add_file_no5"));
	String file_delyn1    	= Util.checkString((String)ht.get("file_delyn1"));
	String file_delyn2    	= Util.checkString((String)ht.get("file_delyn2"));
	String file_delyn3    	= Util.checkString((String)ht.get("file_delyn3"));
	String file_delyn4    	= Util.checkString((String)ht.get("file_delyn4"));
	String file_delyn5    	= Util.checkString((String)ht.get("file_delyn5"));
	String incmg_pers_ip	= request.getRemoteAddr();
	String flag       	 	= Util.checkString((String)ht.get("flag"));
	
	if(attachFiles.size() > 0){
		request.setAttribute("ATTACH_FILES", attachFiles);
	}
	//System.out.println("jsp-cont:1:"+cont);
	cont = StringUtil.replaceString(cont,"&nbsp;","");
	//System.out.println("jsp-cont:2:"+cont);	
%>
<jsp:forward page="/ad/bas/1550">
	<jsp:param name="rept_clsf" 		value="<%= rept_clsf %>" />
	<jsp:param name="make_dt" 			value="<%= make_dt %>" />
	<jsp:param name="rept_no" 			value="<%= rept_no %>" />
	<jsp:param name="advcs_clsf" 		value="<%= advcs_clsf %>" />
	<jsp:param name="medi_clsf" 		value="<%= medi_clsf %>" />
	<jsp:param name="data_clsf" 		value="<%= data_clsf %>" />
	<jsp:param name="chrg_pers" 		value="<%= chrg_pers %>" />
	<jsp:param name="dlco_no" 			value="<%= dlco_no %>" />
	<jsp:param name="patr_chrg_pers" 	value="<%= patr_chrg_pers %>" />
	<jsp:param name="titl" 				value="<%= titl %>" />
	<jsp:param name="cont" 				value="<%= cont %>" />
	<jsp:param name="add_file_no1" 		value="<%= add_file_no1 %>" />
	<jsp:param name="add_file_no2" 		value="<%= add_file_no2 %>" />
	<jsp:param name="add_file_no3" 		value="<%= add_file_no3 %>" />
	<jsp:param name="add_file_no4" 		value="<%= add_file_no4 %>" />
	<jsp:param name="add_file_no5" 		value="<%= add_file_no5 %>" />
	<jsp:param name="file_delyn1"  		value="<%= file_delyn1 %>" />
	<jsp:param name="file_delyn2"  		value="<%= file_delyn2 %>" />
	<jsp:param name="file_delyn3"  		value="<%= file_delyn3 %>" />
	<jsp:param name="file_delyn4"  		value="<%= file_delyn4 %>" />
	<jsp:param name="file_delyn5"  		value="<%= file_delyn5 %>" />
	<jsp:param name="incmg_pers_ip" 	value="<%= incmg_pers_ip %>" />
	<jsp:param name="flag"  			value="<%= flag %>" />
</jsp:forward>


