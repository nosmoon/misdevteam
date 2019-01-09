package chosun.ciis.sp.sup.ds;

import java.io.*;
import java.sql.*;
import java.util.*;

import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.base.util.Base64Util;
import chosun.ciis.co.base.util.StreamUtil;
import chosun.ciis.sp.sup.rec.SP_SUP_1701_LCURLIST1Record;
import chosun.ciis.sp.sup.dm.*;
import chosun.ciis.sp.sup.rec.*;

/**
 * 
 */


public class SP_SUP_1701_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public byte[] byteImage = null;
	String encodeimage = "";
	public String errcode;
	public String errmsg;
	//Blob phot = null;

	public SP_SUP_1701_LDataSet(){}
	public SP_SUP_1701_LDataSet(String errcode, String errmsg){
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
		
		System.out.println("#########################" );
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		
		
		while(rset0.next()){
			
			SP_SUP_1701_LCURLIST1Record rec = new SP_SUP_1701_LCURLIST1Record();

			image = rset0.getBinaryStream("img");
			//image = rset0.getBlob("phot").getBinaryStream();
			
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_abrv_nm = Util.checkString(rset0.getString("dlco_abrv_nm"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			
			
			System.out.println("##image : " + image);
			System.out.println("##rec.dlco_no : " + rec.dlco_no);
			System.out.println("##rec.dlco_abrv_nm : " + rec.dlco_abrv_nm);
			System.out.println("##rec.ern : " + rec.ern);
			encodeimage = Base64Util.base64Encode(StreamUtil.readFromStream(image));
			
			//rec.bPhot = rset0.getBlob("phot");

			this.curlist1.add(rec);
		}
	}
}