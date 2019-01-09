<%@page import="java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	somo.framework.util.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.lnk.rec.*
	,	chosun.ciis.tn.lnk.ds.*
	,   java.util.Arrays.*
	,   java.net.URLEncoder;
	"
%>
<%
	TN_LNK_2033_ADataSet ds = (TN_LNK_2033_ADataSet)request.getAttribute("ds");
 
	String errcode = ds.errcode;
	String errmsg = ds.errmsg; 
	
	byte[] bytearray = null;
	int	   totalblock = 0;
	String filenm = "";
	String filepath = "";
	String data = "";
	String tail = "";
	String tmpFile = "";

	try {
		filenm   = ds.getFilenm();
		if( ds.filepath.charAt(ds.filepath.length()-1) == '\\' ) {
			filepath = ds.filepath;
		} else {
			filepath = ds.filepath.concat("\\");
		}

		
		tmpFile = filepath+filenm;
		tmpFile.replace("\\","\\\\");
		File file = new File(tmpFile);		
		//File file = new File(filepath+filenm);		

		boolean fileExists = file.exists();
		System.out.println("tmpFile: " + tmpFile);
		System.out.println("fileExists: " + fileExists);
		if(fileExists) {
			file.delete();
			System.out.println("delete file");
		}

   
		response.reset();
		//response.setContentType("application/x-msdownload; charset=EUC-KR");
		response.setContentType("application/octet-stream; charset=EUC-KR");
		response.setHeader("Content-Disposition", "attachment; filename=" + filepath+filenm + ";");
		//response.setHeader("Content-Transfer-Encoding", "binary;");
		//response.setHeader("Pragma", "no-cache;");
		//response.setHeader("Expires", "-1;");

		ServletOutputStream   sout = response.getOutputStream(); 
		ByteArrayOutputStream bas  = new ByteArrayOutputStream();

		for(int i = 0; i < ds.curlist.size(); i++) {

			TN_LNK_2033_ACURLISTRecord rec = (TN_LNK_2033_ACURLISTRecord)ds.curlist.get(i);

			if( rec.file_data.substring( 6, 8 ).equals("33") ) {
				//tail record
				totalblock = totalblock / 1024;
				tail = rec.file_data.substring( 0, 42 ) + String.format("%010d", totalblock ) + rec.file_data.substring( 52, 1024 );
				bas.write( tail.getBytes() );

				byte[] bytes = bas.toByteArray();
				response.setContentLength(bytes.length);
				sout.write(bytes);
				sout.flush();
				sout.close();
			} else {
				//header, data record
				bas.write(rec.file_data.getBytes(), 0, (rec.file_data.getBytes().length)-1);
			}

			if( rec.getProofdata() != null ) {

				//증빙자료 bytes
				bas.write(rec.proofdata, 0, rec.proofdata.length);
				
				//1024bytes 나머지 bytes
				bytearray = new byte[ ( 1024 - ((((rec.file_data.substring(0, rec.file_data.length() - 1)).getBytes().length) + rec.proofdata.length ) % 1024)) ];
				Arrays.fill( bytearray, (byte)0x20 );
				bas.write(bytearray, 0, bytearray.length);

				//write 전체 bytes계산
				totalblock += (((rec.file_data.getBytes().length)-1) + (rec.proofdata.length + bytearray.length));			
			}
		}

	}catch (Exception e) {
		System.out.println("error: " + e.toString() );
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
	}
%>