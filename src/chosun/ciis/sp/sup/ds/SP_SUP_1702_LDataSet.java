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


package chosun.ciis.sp.sup.ds;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.*;

import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.base.util.Base64Util;
import chosun.ciis.co.base.util.StreamUtil;
import chosun.ciis.hd.info.ds.HD_INFO_2402_LDataSet;
import chosun.ciis.sp.sup.dm.*;
import chosun.ciis.sp.sup.rec.*;

/**
 * 
 */


public class SP_SUP_1702_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public byte[] byteImage = null;
	public String errcode;
	public String errmsg;
	public InputStream in_phot;
	String encodeimage = "";
	public Blob blob;

	public SP_SUP_1702_LDataSet(){}
	public SP_SUP_1702_LDataSet(String errcode, String errmsg){
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

	public InputStream getIn_phot(){
		return this.in_phot;
	}
	public void setIn_phot(InputStream in_phot){
		this.in_phot = in_phot;
	}
	
	public Blob getBlob(){
		return this.blob;
	}
	public void setIn_phot(Blob blob){
		this.blob = blob;
	}
	
	public void setImage(byte[] aImage){
		this.byteImage = aImage;
	}
	
	public byte[] getImage(){
		return this.byteImage;
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
			SP_SUP_1702_LCURLISTRecord rec = new SP_SUP_1702_LCURLISTRecord();
			
			in = rset0.getBinaryStream("img");
			byteImage = HD_INFO_2402_LDataSet.readFromStream(in);
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			//rec.img = Util.checkString(rset0.getString("img"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SUP_1702_LDataSet ds = (SP_SUP_1702_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SP_SUP_1702_LCURLISTRecord curlistRec = (SP_SUP_1702_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dlco_no%>
<%= curlistRec.img%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 22 11:43:15 KST 2012 */