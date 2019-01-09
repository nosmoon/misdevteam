

package chosun.ciis.hd.emsy.rec;

import java.sql.*;
import chosun.ciis.hd.emsy.dm.*;
import chosun.ciis.hd.emsy.ds.*;

/**
 * 
 */


public class HD_EMSY_2007_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String saly_yy;
	public String saly_no;
	public String emp_no;
	public String nm_korn;
	public String stoemail;
	public String senddate;

	public HD_EMSY_2007_LCURLISTRecord(){}

	public void setSaly_yy(String saly_yy){
		this.saly_yy = saly_yy;
	}

	public void setSaly_no(String saly_no){
		this.saly_no = saly_no;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setStoemail(String stoemail){
		this.stoemail = stoemail;
	}

	public void setSenddate(String senddate){
		this.senddate = senddate;
	}

	public String getSaly_yy(){
		return this.saly_yy;
	}

	public String getSaly_no(){
		return this.saly_no;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getStoemail(){
		return this.stoemail;
	}

	public String getSenddate(){
		return this.senddate;
	}
}

/* 작성시간 : Wed Oct 13 16:12:03 KST 2010 */