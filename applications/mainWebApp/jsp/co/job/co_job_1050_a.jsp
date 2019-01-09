<%@ page import="com.oreilly.servlet.multipart.*
                ,java.util.Hashtable
                ,somo.framework.util.Util
                ,java.io.ByteArrayOutputStream" %>

<%	
	Hashtable ht = new Hashtable();

	int upfilesize = 5 * 1024 * 1024;

	MultipartParser multi = new MultipartParser(request, upfilesize, true, true, "EUC-KR");

	Part            part  = null;
	byte[]      add_file  = null;
	for (int i = 0; (part = multi.readNextPart()) != null; i++) {
		if(part instanceof FilePart){
			if(((FilePart) part).getFileName() != null) {
				ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
				((FilePart)part).writeTo(byteArrayOutputStream);
				add_file = byteArrayOutputStream.toByteArray();
				ht.put(part.getName(), add_file);
				ht.put("add_file_nm", ( (FilePart) part).getFileName());
				ht.put("add_file_size", String.valueOf(add_file.length));
			}
		}else if(part instanceof ParamPart){
			ht.put(part.getName(), ((ParamPart)part).getStringValue());
		}
	}	

	String flag       		= Util.checkString((String)ht.get("flag"));
	String job_clsf    		= Util.checkString((String)ht.get("job_clsf"));
	String cntc_seq	  		= Util.checkString((String)ht.get("cntc_seq"));
	String make_dt     		= Util.checkString((String)ht.get("make_dt"));
	String answer_yn   		= Util.checkString((String)ht.get("answer_yn"));
	String sms_yn   		= Util.checkString((String)ht.get("sms_yn"));
	String titl      		= Util.checkString((String)ht.get("titl"));
	String cont       		= Util.checkString((String)ht.get("cont"));
	String add_file_nm 		= Util.checkString((String)ht.get("add_file_nm"));
	String add_file_size	= Util.checkString((String)ht.get("add_file_size"));
	String file_delyn   	= Util.checkString((String)ht.get("file_delyn"));
	String multiUpdateData	= Util.checkString((String)ht.get("multiUpdateData"));
	String frdt				= Util.checkString((String)ht.get("frdt"));
	String todt				= Util.checkString((String)ht.get("todt"));
	
	if(!"".equals(add_file_nm)) request.setAttribute("add_file", add_file);

%>

<jsp:forward page="/co/job/1050">
	<jsp:param name="flag"  			value="<%= flag %>" />
	<jsp:param name="job_clsf" 			value="<%= job_clsf %>" />
	<jsp:param name="cntc_seq" 			value="<%= cntc_seq %>" />
	<jsp:param name="make_dt"   		value="<%= make_dt %>" />
	<jsp:param name="answer_yn" 		value="<%= answer_yn %>" />
	<jsp:param name="sms_yn" 			value="<%= sms_yn %>" />
	<jsp:param name="titl"  			value="<%= titl %>" />
	<jsp:param name="cont"  			value="<%= cont %>" />
	<jsp:param name="add_file_nm"  		value="<%= add_file_nm %>" />	
	<jsp:param name="add_file_size"		value="<%= add_file_size %>" />
	<jsp:param name="file_delyn"  		value="<%= file_delyn %>" />
	<jsp:param name="multiUpdateData"  	value="<%= multiUpdateData %>" />
	<jsp:param name="frdt"  			value="<%= frdt %>" />
	<jsp:param name="todt"  			value="<%= todt %>" />
</jsp:forward>

