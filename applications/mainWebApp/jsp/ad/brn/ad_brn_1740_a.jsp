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

	String job_clsf	  	= Util.checkString((String)ht.get("job_clsf"));
	String cntc_seq	  	= Util.checkString((String)ht.get("cntc_seq"));
	String answer_seq	= Util.checkString((String)ht.get("answer_seq"));
	String answer_cont  = Util.checkString((String)ht.get("answer_cont"));
	String add_file_nm 	= Util.checkString((String)ht.get("add_file_nm"));
	String file_delyn   = Util.checkString((String)ht.get("file_delyn"));
	String flag       	= Util.checkString((String)ht.get("flag"));

	if(!"".equals(add_file_nm)) request.setAttribute("add_file", add_file);
	
%>

<jsp:forward page="/ad/brn/1740">
	<jsp:param name="job_clsf" 		value="<%= job_clsf %>" />
	<jsp:param name="cntc_seq" 		value="<%= cntc_seq %>" />
	<jsp:param name="answer_seq" 	value="<%= answer_seq %>" />
	<jsp:param name="answer_cont" 	value="<%= answer_cont %>" />
	<jsp:param name="add_file_nm"  	value="<%= add_file_nm %>" />
	<jsp:param name="file_delyn"  	value="<%= file_delyn %>" />
	<jsp:param name="flag"  		value="<%= flag %>" />
</jsp:forward>
