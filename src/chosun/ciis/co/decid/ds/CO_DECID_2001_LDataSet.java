/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
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
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	CO_DECID_2001_LDataSet ds = (CO_DECID_2001_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		CO_DECID_2001_LCURLISTRecord curlistRec = (CO_DECID_2001_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.add_file%>
<%= curlistRec.add_file_size%>
<%= curlistRec.add_file_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 17 13:34:41 KST 2009 */