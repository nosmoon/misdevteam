/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.co.decid.ds;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.base.util.Base64Util;
import chosun.ciis.co.base.util.StreamUtil;
import chosun.ciis.co.decid.dm.*;
import chosun.ciis.co.decid.rec.*;

/**
 * 
 */


public class CO_DECID_2001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_DECID_2001_LDataSet(){}
	public CO_DECID_2001_LDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		InputStream dFile = null;
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			CO_DECID_2001_LCURLISTRecord rec = new CO_DECID_2001_LCURLISTRecord();
			dFile		= rset0.getBinaryStream("add_file");

	        int lBufferSize = 1024;
	        byte[] lByteBuffer = new byte[lBufferSize];

	        int lBytesRead = 0;
	        int lTotbytesRead = 0;
	        int lCount = 0;

	        ByteArrayOutputStream lByteArrayOutputStream = new ByteArrayOutputStream(lBufferSize * 2);

	        try {
	            while ((lBytesRead = dFile.read(lByteBuffer)) != -1) {
	                lTotbytesRead += lBytesRead;
	                lCount++;

	                lByteArrayOutputStream.write(lByteBuffer, 0, lBytesRead);
	            }
	        } catch (Throwable e) {
	            e.printStackTrace(System.out);
	        }

	        byte[] lDataBytes = lByteArrayOutputStream.toByteArray();
			rec.add_file = lDataBytes;
			
			rec.add_file_size = Util.checkString(rset0.getString("add_file_size"));
			rec.add_file_nm = Util.checkString(rset0.getString("add_file_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_DECID_2001_LDataSet ds = (CO_DECID_2001_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		CO_DECID_2001_LCURLISTRecord curlistRec = (CO_DECID_2001_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.add_file%>
<%= curlistRec.add_file_size%>
<%= curlistRec.add_file_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 17 13:34:41 KST 2009 */