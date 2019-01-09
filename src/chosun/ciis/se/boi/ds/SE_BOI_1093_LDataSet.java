/***************************************************************************************************
* 파일명 : SE_BOI_1093_LDataSet.java
* 기능 : 센터정보관리-센터대표정보-센터대표사진 다운로드 하기위한 조회
* 작성일자 : 2017-05-16
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.se.boi.ds;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 *
 */


public class SE_BOI_1093_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList photlist = new ArrayList();
	public byte[] byteImage = null;
	public String errcode;
	public String errmsg;
	public InputStream in_phot;
	String encodeimage = "";
	public Blob blob;

	public SE_BOI_1093_LDataSet(){}
	public SE_BOI_1093_LDataSet(String errcode, String errmsg){
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


	public String getEncodeimage(){
		return this.encodeimage;
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
			SE_BOI_1093_LPHOTLISTRecord rec = new SE_BOI_1093_LPHOTLISTRecord();

			in = rset0.getBinaryStream("bohead_phot");

			byteImage = SE_BOI_1093_LDataSet.readFromStream(in);

			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.filenm = Util.checkString(rset0.getString("filenm"));
			rec.bo_prn = Util.checkString(rset0.getString("bo_prn"));
			//rec.bohead_phot = Util.checkString(rset0.getString("bohead_phot"));
			this.photlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BOI_1093_LDataSet ds = (SE_BOI_1093_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.photlist.size(); i++){
		SE_BOI_1093_LPHOTLISTRecord photlistRec = (SE_BOI_1093_LPHOTLISTRecord)ds.photlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPhotlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= photlistRec.bo_cd%>
<%= photlistRec.filenm%>
<%= photlistRec.bo_prn%>
<%= photlistRec.bohead_phot%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 16 09:40:05 KST 2017 */