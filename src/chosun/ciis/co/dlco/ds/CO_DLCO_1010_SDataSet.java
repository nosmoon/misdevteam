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


package chosun.ciis.co.dlco.ds;

import java.sql.*;
import java.util.*;
import java.io.*;

import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.dlco.dm.*;
import chosun.ciis.co.dlco.rec.*;
import chosun.ciis.co.base.util.*;
import chosun.ciis.co.dlco.ds.CO_DLCO_1010_SDataSet;
/**
 * 
 */


public class CO_DLCO_1010_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public byte[] byteImage_seal = null;
	String encodeimage_seal = "";
	public byte[] byteImage_ern = null;
	String encodeimage_ern = "";
	public byte[] byteImage_acct_aplc_frm = null;
	String encodeimage_acct_aplc_frm = "";
	public byte[] byteImage_psbk_copy = null;
	String encodeimage_psbk_copy = "";
	public byte[] byteImage_use_seal = null;
	String encodeimage_use_seal = "";
	public String errcode;
	public String errmsg;

	public CO_DLCO_1010_SDataSet(){}
	public CO_DLCO_1010_SDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setImage_seal(byte[] aImage){
		this.byteImage_seal = aImage;
	}

	public void setEncodeimage_seal(String aImage){
		this.encodeimage_seal = aImage;
	}

	public void setImage_ern(byte[] aImage){
		this.byteImage_ern = aImage;
	}

	public void setEncodeimage_ern(String aImage){
		this.encodeimage_ern = aImage;
	}

	public void setImage_acct_aplc_frm(byte[] aImage){
		this.byteImage_acct_aplc_frm = aImage;
	}

	public void setEncodeimage_acct_aplc_frm(String aImage){
		this.encodeimage_acct_aplc_frm = aImage;
	}
	
	public void setImage_psbk_copy(byte[] aImage){
		this.byteImage_psbk_copy = aImage;
	}

	public void setEncodeimage_psbk_copy(String aImage){
		this.encodeimage_psbk_copy = aImage;
	}
	
	public void setImage_use_seal(byte[] aImage){
		this.byteImage_use_seal = aImage;
	}

	public void setEncodeimage_use_seal(String aImage){
		this.encodeimage_use_seal = aImage;
	}
	
	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public byte[] getImage_seal(){
		return this.byteImage_seal;
	}
	
	public String getEncodeimage_seal(){
		return this.encodeimage_seal;
	}

	public byte[] getImage_ern(){
		return this.byteImage_ern;
	}
	
	public String getEncodeimage_ern(){
		return this.encodeimage_ern;
	}
	
	public byte[] getImage_acct_aplc_frm(){
		return this.byteImage_acct_aplc_frm;
	}
	
	public String getEncodeimage_acct_aplc_frm(){
		return this.encodeimage_acct_aplc_frm;
	}
	
	public byte[] getImage_psbk_copy(){
		return this.byteImage_psbk_copy;
	}
	
	public String getEncodeimage_psbk_copy(){
		return this.encodeimage_psbk_copy;
	}
	
	public byte[] getImage_use_seal(){
		return this.byteImage_use_seal;
	}
	
	public String getEncodeimage_use_seal(){
		return this.encodeimage_use_seal;
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
	
	private static byte[] mBase64EncMap, mBase64DecMap; 

	/** 
	 * Class initializer. Initializes the Base64 alphabet (specified in RFC-2045). 
	 */ 
	static { 
		byte[] base64Map = { 
				(byte)'A', (byte)'B', (byte)'C', (byte)'D', (byte)'E', (byte)'F', 
	            (byte)'G', (byte)'H', (byte)'I', (byte)'J', (byte)'K', (byte)'L', 
	            (byte)'M', (byte)'N', (byte)'O', (byte)'P', (byte)'Q', (byte)'R', 
	            (byte)'S', (byte)'T', (byte)'U', (byte)'V', (byte)'W', (byte)'X', 
	            (byte)'Y', (byte)'Z', 
	            (byte)'a', (byte)'b', (byte)'c', (byte)'d', (byte)'e', (byte)'f', 
	            (byte)'g', (byte)'h', (byte)'i', (byte)'j', (byte)'k', (byte)'l', 
	            (byte)'m', (byte)'n', (byte)'o', (byte)'p', (byte)'q', (byte)'r', 
	            (byte)'s', (byte)'t', (byte)'u', (byte)'v', (byte)'w', (byte)'x', 
	            (byte)'y', (byte)'z', 
	            (byte)'0', (byte)'1', (byte)'2', (byte)'3', (byte)'4', (byte)'5', 
	            (byte)'6', (byte)'7', (byte)'8', (byte)'9', (byte)'+', (byte)'/' }; 
		mBase64EncMap = base64Map; 
		mBase64DecMap = new byte[128]; 
		for (int i=0; i<mBase64EncMap.length; i++) 
			mBase64DecMap[mBase64EncMap[i]] = (byte) i; 
	} 

	/** 
	 * Encodes the given byte[] using the Base64-encoding, 
	 * as specified in RFC-2045 (Section 6.8). 
	 * 
	 * @param aData the data to be encoded 
	 * @return the Base64-encoded <var>aData</var> 
	 * @exception IllegalArgumentException if NULL or empty array is passed 
	 */ 
	public static String base64Encode(byte[] aData) { 
		//if ((aData == null) || (aData.length == 0))
			//return
			//throw new IllegalArgumentException("Can not encode NULL or empty byte array."); 

		byte encodedBuf[] = new byte[((aData.length+2)/3)*4]; 

		// 3-byte to 4-byte conversion 
		int srcIndex, destIndex; 
		for (srcIndex=0, destIndex=0; srcIndex < aData.length-2; srcIndex += 3) { 
			encodedBuf[destIndex++] = mBase64EncMap[(aData[srcIndex] >>> 2) & 077]; 
			encodedBuf[destIndex++] = mBase64EncMap[(aData[srcIndex+1] >>> 4) & 017 | 
			                                        (aData[srcIndex] << 4) & 077]; 
			encodedBuf[destIndex++] = mBase64EncMap[(aData[srcIndex+2] >>> 6) & 003 | 
			                                        (aData[srcIndex+1] << 2) & 077]; 
			encodedBuf[destIndex++] = mBase64EncMap[aData[srcIndex+2] & 077]; 
		} 

		// Convert the last 1 or 2 bytes 
		if (srcIndex < aData.length) { 
			encodedBuf[destIndex++] = mBase64EncMap[(aData[srcIndex] >>> 2) & 077]; 
			if (srcIndex < aData.length-1) { 
				encodedBuf[destIndex++] = mBase64EncMap[(aData[srcIndex+1] >>> 4) & 017 | 
				                                        (aData[srcIndex] << 4) & 077]; 
				encodedBuf[destIndex++] = mBase64EncMap[(aData[srcIndex+1] << 2) & 077]; 
			} 
			else { 
				encodedBuf[destIndex++] = mBase64EncMap[(aData[srcIndex] << 4) & 077]; 
			} 
		} 

		// Add padding to the end of encoded data 
		while (destIndex < encodedBuf.length) { 
			encodedBuf[destIndex] = (byte) '='; 
			destIndex++; 
		} 

		String result = new String(encodedBuf); 
		return result; 
	} 


	/** 
	 * Decodes the given Base64-encoded data, 
	 * as specified in RFC-2045 (Section 6.8). 
	 * 
	 * @param aData the Base64-encoded aData. 
	 * @return the decoded <var>aData</var>. 
	 * @exception IllegalArgumentException if NULL or empty data is passed 
	 */ 
	public static byte[] base64Decode(String aData) { 
		if ((aData == null) || (aData.length() == 0)) 
			throw new IllegalArgumentException("Can not decode NULL or empty string."); 

		byte[] data = aData.getBytes(); 

		// Skip padding from the end of encoded data 
		int tail = data.length; 
		while (data[tail-1] == '=') 
			tail--; 

		byte decodedBuf[] = new byte[tail - data.length/4]; 

		// ASCII-printable to 0-63 conversion 
		for (int i = 0; i < data.length; i++) 
			data[i] = mBase64DecMap[data[i]]; 

		// 4-byte to 3-byte conversion 
		int srcIndex, destIndex; 
		for (srcIndex = 0, destIndex=0; destIndex < decodedBuf.length-2; 
		srcIndex += 4, destIndex += 3) { 
			decodedBuf[destIndex] = (byte) ( ((data[srcIndex] << 2) & 255) | 
					((data[srcIndex+1] >>> 4) & 003) ); 
			decodedBuf[destIndex+1] = (byte) ( ((data[srcIndex+1] << 4) & 255) | 
					((data[srcIndex+2] >>> 2) & 017) ); 
			decodedBuf[destIndex+2] = (byte) ( ((data[srcIndex+2] << 6) & 255) | 
					(data[srcIndex+3] & 077) ); 
		} 

		// Handle last 1 or 2 bytes 
		if (destIndex < decodedBuf.length) 
			decodedBuf[destIndex] = (byte) ( ((data[srcIndex] << 2) & 255) | 
					((data[srcIndex+1] >>> 4) & 003) ); 
		if (++destIndex < decodedBuf.length) 
			decodedBuf[destIndex] = (byte) ( ((data[srcIndex+1] << 4) & 255) | 
					((data[srcIndex+2] >>> 2) & 017) ); 

		return decodedBuf; 
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		InputStream image_seal = null;
		InputStream image_ern = null;
		InputStream image_acct_aplc_frm = null;
		InputStream image_psbk_copy = null;
		InputStream image_use_seal = null;
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		if(rset0.next()){
			CO_DLCO_1010_SCURLISTRecord rec = new CO_DLCO_1010_SCURLISTRecord();
			image_seal = rset0.getBinaryStream("seal_phot");
			image_ern = rset0.getBinaryStream("ern_phot");
			image_acct_aplc_frm = rset0.getBinaryStream("acct_aplc_frm");
			image_psbk_copy = rset0.getBinaryStream("psbk_copy");
			image_use_seal = rset0.getBinaryStream("use_seal");
			if(image_seal != null){
				encodeimage_seal = CO_DLCO_1010_SDataSet.base64Encode(CO_DLCO_1010_SDataSet.readFromStream(image_seal));	
			}
			if(image_ern != null){
				encodeimage_ern = CO_DLCO_1010_SDataSet.base64Encode(CO_DLCO_1010_SDataSet.readFromStream(image_ern));				
			}
			if(image_acct_aplc_frm != null){
				encodeimage_acct_aplc_frm = CO_DLCO_1010_SDataSet.base64Encode(CO_DLCO_1010_SDataSet.readFromStream(image_acct_aplc_frm));				
			}
			if(image_psbk_copy != null){
				encodeimage_psbk_copy = CO_DLCO_1010_SDataSet.base64Encode(CO_DLCO_1010_SDataSet.readFromStream(image_psbk_copy));				
			}
			if(image_use_seal != null){
				encodeimage_use_seal = CO_DLCO_1010_SDataSet.base64Encode(CO_DLCO_1010_SDataSet.readFromStream(image_use_seal));				
			}
			
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_DLCO_1010_SDataSet ds = (CO_DLCO_1010_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		CO_DLCO_1010_SCURLISTRecord curlistRec = (CO_DLCO_1010_SCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.seal_phot%>
<%= curlistRec.ern_phot%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 23 14:51:40 KST 2013 */