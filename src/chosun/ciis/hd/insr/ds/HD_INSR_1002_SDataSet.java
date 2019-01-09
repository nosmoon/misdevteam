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


package chosun.ciis.hd.insr.ds;

import java.sql.*;
import java.util.*;
import java.io.*;
import somo.framework.util.*;
import chosun.ciis.hd.insr.rec.HD_INSR_1002_SCURLISTRecord;
import chosun.ciis.co.base.util.*;

/**
 * 
 */


public class HD_INSR_1002_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public byte[] byteImage = null;
	String encodeimage = "";
	public String errcode;
	public String errmsg;

	public HD_INSR_1002_SDataSet(){}
	public HD_INSR_1002_SDataSet(String errcode, String errmsg){
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

	public void getValues(CallableStatement cstmt) throws SQLException{
		InputStream image = null;
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		if(rset0.next()){
			HD_INSR_1002_SCURLISTRecord rec = new HD_INSR_1002_SCURLISTRecord();
			image = rset0.getBinaryStream("phot");
			encodeimage = Base64Util.base64Encode(StreamUtil.readFromStream(image));
		}
	}
}
