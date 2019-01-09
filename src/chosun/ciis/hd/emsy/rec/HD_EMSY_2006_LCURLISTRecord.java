

package chosun.ciis.hd.emsy.rec;

import java.sql.*;
import chosun.ciis.hd.emsy.dm.*;
import chosun.ciis.hd.emsy.ds.*;

/**
 * 
 */


public class HD_EMSY_2006_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String recemail;
	public String rec_yn;

	public HD_EMSY_2006_LCURLISTRecord(){}

	public void setRecemail(String recemail){
		this.recemail = recemail;
	}

	public void setRec_yn(String rec_yn){
		this.rec_yn = rec_yn;
	}

	public String getRecemail(){
		return this.recemail;
	}

	public String getRec_yn(){
		return this.rec_yn;
	}
}

/* 작성시간 : Thu Oct 21 16:51:07 KST 2010 */