/***************************************************************************************************
* 파일명 : SE_BOI_1092_SDataSet.java
* 기능 : 판매시스템
* 작성일자 : 2017-04-27
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


public class SE_BOI_1092_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList photlist = new ArrayList();
	public byte[] byteImage = null;
	String encodeimage = "";
	public String errcode;
	public String errmsg;

	public SE_BOI_1092_SDataSet(){}
	public SE_BOI_1092_SDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setImage(byte[] aImage){
		this.byteImage = aImage;
	}

	public void setEncodeimage(String aImage){
		this.encodeimage = aImage;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
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
		InputStream image = null;
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			SE_BOI_1092_SPHOTLISTRecord rec = new SE_BOI_1092_SPHOTLISTRecord();

			image = rset0.getBinaryStream("bo_head_phot");
//			rec.bo_head_phot = Util.checkString(rset0.getString("bo_head_phot"));
//			this.photlist.add(rec);
			if(image != null){
				encodeimage = SE_BOI_1092_SDataSet.base64Encode(SE_BOI_1092_SDataSet.readFromStream(image));
			}

		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BOI_1092_SDataSet ds = (SE_BOI_1092_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.photlist.size(); i++){
		SE_BOI_1092_SPHOTLISTRecord photlistRec = (SE_BOI_1092_SPHOTLISTRecord)ds.photlist.get(i);%>
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

<%= photlistRec.bo_head_phot%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 27 18:04:53 KST 2017 */