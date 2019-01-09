

package chosun.ciis.hd.tmpl.rec;

import java.sql.*;
import chosun.ciis.hd.tmpl.dm.*;
import chosun.ciis.hd.tmpl.ds.*;

/**
 * 
 */


public class HD_TMPL_1001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String real_template_name;
	public byte[] template_file;

	public HD_TMPL_1001_LCURLISTRecord(){}

	public void setReal_template_name(String real_template_name){
		this.real_template_name = real_template_name;
	}

	public void setTemplate_file(byte[] template_file){
		this.template_file = template_file;
	}

	public String getReal_template_name(){
		return this.real_template_name;
	}

	public byte[] getTemplate_file(){
		return this.template_file;
	}
}

/* 작성시간 : Mon Aug 16 10:47:48 KST 2010 */