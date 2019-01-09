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
				System.out.println("8####"+attcFilNm+","+add_file);
				AttachFileVO vo  = new AttachFileVO();
				vo.setAttcFilNm(attcFilNm);
				vo.setAttcFilCont(add_file);
				attachFiles.add(vo);
			}
		}else if(part instanceof ParamPart){
			ht.put(part.getName(), ((ParamPart)part).getStringValue());
		}
	}	  

    	String dept_idx         = Util.checkString((String) ht.get("dept_idx"));
    	String excl_type        = Util.checkString((String) ht.get("excl_type"));
    	String title            = Util.checkString((String) ht.get("title"));
    	String flag             = Util.checkString((String) ht.get("flag"));
    	String excl_pmnt_idx    = Util.checkString((String) ht.get("excl_pmnt_idx"));
        String add_file_nm 	    = Util.checkString((String) ht.get("add_file_nm"));
        String add_file_size 	= Util.checkString((String) ht.get("add_file_size"));
        String multiUpdateData2	= Util.checkString((String) ht.get("multiUpdateData2"));

	if(attachFiles.size() > 0){
		request.setAttribute("ATTACH_FILES", attachFiles);
	}
%> 
<jsp:forward page="/tn/lnk/1153">
	<jsp:param name="dept_idx"              value="<%= dept_idx %>" />
	<jsp:param name="excl_type"             value="<%= excl_type %>" />
	<jsp:param name="title"                 value="<%= title %>" />
	<jsp:param name="flag"                  value="<%= flag %>" />
	<jsp:param name="excl_pmnt_idx"         value="<%= excl_pmnt_idx %>" />
	<jsp:param name="add_file_nm"           value="<%= add_file_nm %>" />
	<jsp:param name="add_file_size"         value="<%= add_file_size %>" />
	<jsp:param name="multiUpdateData2"       value="<%= multiUpdateData2 %>" />
</jsp:forward>


