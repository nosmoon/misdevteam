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


package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import java.io.*;

import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;
import chosun.ciis.co.base.util.*;

/**
 * 
 */


public class HD_INFO_2401_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public byte[] byteImage = null;
	String encodeimage = "";
	public String errcode;
	public String errmsg;
	//Blob phot = null;

	public HD_INFO_2401_LDataSet(){}
	public HD_INFO_2401_LDataSet(String errcode, String errmsg){
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

	/*
	public void setPhot(Blob bPhot) {
		this.phot = bPhot;
	}
	*/
	
	public void setEncodeimage(String aImage){
		this.encodeimage = aImage;
	}
	
	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}
	
	/*
	public Blob getPhot(){
		return this.phot;
	}
	*/
	
	public byte[] getImage(){
		return this.byteImage;
	}

	public String getEncodeimage(){
		return this.encodeimage;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		
		//byte[] arrayByte = new byte[1024];
		//InputStream image =new ByteArrayInputStream(arrayByte);
		InputStream image = null;
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		
		
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		
		
		while(rset0.next()){
			
			HD_INFO_2401_LCURLIST1Record rec = new HD_INFO_2401_LCURLIST1Record();

			image = rset0.getBinaryStream("phot");
			//image = rset0.getBlob("phot").getBinaryStream();
			
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			
			System.out.println("##image : " + image);
			System.out.println("##rec.emp_no : " + rec.emp_no);
			encodeimage = Base64Util.base64Encode(StreamUtil.readFromStream(image));
			
			//rec.bPhot = rset0.getBlob("phot");

			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_INFO_2401_LDataSet ds = (HD_INFO_2401_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_INFO_2401_LCURLIST1Record curlist1Rec = (HD_INFO_2401_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.phot%>
<%= curlist1Rec.emp_no%>
<%= curlist1Rec.dept_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jun 05 10:17:55 KST 2009 */