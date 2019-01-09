

package chosun.ciis.hd.tmpl.ds;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.tmpl.dm.*;
import chosun.ciis.hd.tmpl.rec.*;

/**
 * 
 */


public class HD_TMPL_1001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public byte[] template_file = null;
	public String errcode;
	public String errmsg;

	public HD_TMPL_1001_LDataSet(){}
	public HD_TMPL_1001_LDataSet(String errcode, String errmsg){
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

	public static byte[] readFromStream(InputStream pInputStream) {
        if (pInputStream == null) {
            return null;
        }

        int lBufferSize = 1024;
        byte[] lByteBuffer = new byte[lBufferSize];

        int lBytesRead = 0;
        int lTotbytesRead = 0;
        int lCount = 0;

        ByteArrayOutputStream lByteArrayOutputStream = new ByteArrayOutputStream(lBufferSize * 2);

        try {
            while ((lBytesRead = pInputStream.read(lByteBuffer)) != -1) {
                lTotbytesRead += lBytesRead;
                lCount++;

                lByteArrayOutputStream.write(lByteBuffer, 0, lBytesRead);
            }
        } catch (Throwable e) {
            e.printStackTrace(System.out);
        }

        byte[] lDataBytes = lByteArrayOutputStream.toByteArray();

        return lDataBytes;
    }
	

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}
		InputStream in = null;
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_TMPL_1001_LCURLISTRecord rec = new HD_TMPL_1001_LCURLISTRecord();
			
			in = rset0.getBinaryStream("template_file");
			rec.template_file = readFromStream(in);
			
			rec.real_template_name = Util.checkString(rset0.getString("real_template_name"));
			//rec.template_file = Util.checkString(rset0.getString("template_file"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_TMPL_1001_LDataSet ds = (HD_TMPL_1001_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_TMPL_1001_LCURLISTRecord curlistRec = (HD_TMPL_1001_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.real_template_name%>
<%= curlistRec.template_file%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Aug 16 10:47:49 KST 2010 */